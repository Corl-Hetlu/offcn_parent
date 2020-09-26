package com.offcn.project.service.impl;

import com.offcn.project.mapper.*;
import com.offcn.project.po.*;
import com.offcn.project.service.ProjectInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectInfoServiceImpl implements ProjectInfoService {
    @Autowired
    private TReturnMapper returnMapper;

    @Autowired
    private TTagMapper tagMapper;

    @Autowired
    private TProjectMapper projectMapper;

    private TProjectImagesMapper projectImagesMapper;

    @Autowired
    private TTypeMapper typeMapper;

    @Override
    public List<TReturn> getProjectReturns(Integer projectId) {
        TReturnExample example=new TReturnExample();
        example.createCriteria().andProjectidEqualTo(projectId);
        List<TReturn> returns = returnMapper.selectByExample(example);
        return returns;
    }

    @Override
    public List<TProject> getAllProjects() {
        return projectMapper.selectByExample(null);
    }

    @Override
    public List<TProjectImages> getProjectImages(Integer id) {
        TProjectImagesExample example=new TProjectImagesExample();
        example.createCriteria().andProjectidEqualTo(id);
        return projectImagesMapper.selectByExample(example);
    }

    @Override
    public TProject getProjectInfo(Integer projectId) {
        TProject project = projectMapper.selectByPrimaryKey(projectId);
        return project;
    }

    @Override
    public List<TTag> getAllProjectTags() {
        return tagMapper.selectByExample(null);
    }

    @Override
    public List<TType> getProjectTypes() {
        return typeMapper.selectByExample(null);
    }

    /**
     * 获取回报信息
     *
     * @param returnId
     * @return
     */
    @Override
    public TReturn getReturnInfo(Integer returnId) {
        return returnMapper.selectByPrimaryKey(returnId);
    }
}
