package com.yupi.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yupi.project.model.vo.UserInterfaceInfoAnalysisVo;
import com.yupi.yuapicommon.entity.UserInterfaceInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Entity com.yupi.springbootinit.model.entity.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {


    List<UserInterfaceInfoAnalysisVo> listTopInterfaceInfo(@Param("size") int size);

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




