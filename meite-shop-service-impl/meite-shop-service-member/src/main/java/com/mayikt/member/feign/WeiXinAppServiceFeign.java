package com.mayikt.member.feign;

import com.mayikt.weixin.entity.AppEntity;
import org.springframework.cloud.openfeign.FeignClient;

import com.mayikt.weixin.service.WeiXinAppService;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-mayikt-weixin")
public interface WeiXinAppServiceFeign extends WeiXinAppService {

	// /**
	// * 功能说明： 应用服务接口
	// */
	// @GetMapping("/getApp")
	// public AppEntity getApp();
}



//@FeignClient(name = "app-mayikt-weixin")
//public interface WeiXinAppServiceFeign{
//
//    // /**
//    // * 功能说明： 应用服务接口
//    // */
//     @GetMapping("/getApp")
//     public AppEntity getApp();
//}