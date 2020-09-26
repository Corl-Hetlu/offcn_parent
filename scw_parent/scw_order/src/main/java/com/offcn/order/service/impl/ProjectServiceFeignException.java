package com.offcn.order.service.impl;

import com.offcn.dycommon.enums.response.AppResponse;
import com.offcn.order.service.ProjectServiceFeign;
import com.offcn.order.vo.resp.TReturn;

import java.util.List;

public class ProjectServiceFeignException implements ProjectServiceFeign {
    @Override
    public AppResponse<List<TReturn>> detailsReturn(Integer projectId) {
        AppResponse<List<TReturn>> fail=AppResponse.fail(null);
        fail.setMsg("调用远程服务失败");
        return fail;
    }
}
