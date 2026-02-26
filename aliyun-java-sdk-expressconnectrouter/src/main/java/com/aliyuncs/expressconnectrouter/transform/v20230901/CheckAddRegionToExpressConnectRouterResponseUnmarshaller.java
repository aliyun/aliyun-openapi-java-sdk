/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.expressconnectrouter.transform.v20230901;

import com.aliyuncs.expressconnectrouter.model.v20230901.CheckAddRegionToExpressConnectRouterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckAddRegionToExpressConnectRouterResponseUnmarshaller {

	public static CheckAddRegionToExpressConnectRouterResponse unmarshall(CheckAddRegionToExpressConnectRouterResponse checkAddRegionToExpressConnectRouterResponse, UnmarshallerContext _ctx) {
		
		checkAddRegionToExpressConnectRouterResponse.setRequestId(_ctx.stringValue("CheckAddRegionToExpressConnectRouterResponse.RequestId"));
		checkAddRegionToExpressConnectRouterResponse.setSuccess(_ctx.booleanValue("CheckAddRegionToExpressConnectRouterResponse.Success"));
		checkAddRegionToExpressConnectRouterResponse.setCode(_ctx.stringValue("CheckAddRegionToExpressConnectRouterResponse.Code"));
		checkAddRegionToExpressConnectRouterResponse.setMessage(_ctx.stringValue("CheckAddRegionToExpressConnectRouterResponse.Message"));
		checkAddRegionToExpressConnectRouterResponse.setHttpStatusCode(_ctx.integerValue("CheckAddRegionToExpressConnectRouterResponse.HttpStatusCode"));
		checkAddRegionToExpressConnectRouterResponse.setDynamicCode(_ctx.stringValue("CheckAddRegionToExpressConnectRouterResponse.DynamicCode"));
		checkAddRegionToExpressConnectRouterResponse.setDynamicMessage(_ctx.stringValue("CheckAddRegionToExpressConnectRouterResponse.DynamicMessage"));
		checkAddRegionToExpressConnectRouterResponse.setAccessDeniedDetail(_ctx.stringValue("CheckAddRegionToExpressConnectRouterResponse.AccessDeniedDetail"));
		checkAddRegionToExpressConnectRouterResponse.setAnyInterRegionLink(_ctx.booleanValue("CheckAddRegionToExpressConnectRouterResponse.AnyInterRegionLink"));
		checkAddRegionToExpressConnectRouterResponse.setAnyCrossBorderLink(_ctx.booleanValue("CheckAddRegionToExpressConnectRouterResponse.AnyCrossBorderLink"));
		checkAddRegionToExpressConnectRouterResponse.setIsCdtInterRegionEnabled(_ctx.booleanValue("CheckAddRegionToExpressConnectRouterResponse.IsCdtInterRegionEnabled"));
		checkAddRegionToExpressConnectRouterResponse.setIsCdtCrossBorderEnabled(_ctx.booleanValue("CheckAddRegionToExpressConnectRouterResponse.IsCdtCrossBorderEnabled"));
		checkAddRegionToExpressConnectRouterResponse.setIsUserAllowedToCreateCrossBorderLink(_ctx.booleanValue("CheckAddRegionToExpressConnectRouterResponse.IsUserAllowedToCreateCrossBorderLink"));
	 
	 	return checkAddRegionToExpressConnectRouterResponse;
	}
}