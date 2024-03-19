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

import com.aliyuncs.expressconnectrouter.model.v20230901.SynchronizeExpressConnectRouterInterRegionBandwidthResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SynchronizeExpressConnectRouterInterRegionBandwidthResponseUnmarshaller {

	public static SynchronizeExpressConnectRouterInterRegionBandwidthResponse unmarshall(SynchronizeExpressConnectRouterInterRegionBandwidthResponse synchronizeExpressConnectRouterInterRegionBandwidthResponse, UnmarshallerContext _ctx) {
		
		synchronizeExpressConnectRouterInterRegionBandwidthResponse.setRequestId(_ctx.stringValue("SynchronizeExpressConnectRouterInterRegionBandwidthResponse.RequestId"));
		synchronizeExpressConnectRouterInterRegionBandwidthResponse.setSuccess(_ctx.booleanValue("SynchronizeExpressConnectRouterInterRegionBandwidthResponse.Success"));
		synchronizeExpressConnectRouterInterRegionBandwidthResponse.setCode(_ctx.stringValue("SynchronizeExpressConnectRouterInterRegionBandwidthResponse.Code"));
		synchronizeExpressConnectRouterInterRegionBandwidthResponse.setMessage(_ctx.stringValue("SynchronizeExpressConnectRouterInterRegionBandwidthResponse.Message"));
		synchronizeExpressConnectRouterInterRegionBandwidthResponse.setHttpStatusCode(_ctx.integerValue("SynchronizeExpressConnectRouterInterRegionBandwidthResponse.HttpStatusCode"));
		synchronizeExpressConnectRouterInterRegionBandwidthResponse.setDynamicCode(_ctx.stringValue("SynchronizeExpressConnectRouterInterRegionBandwidthResponse.DynamicCode"));
		synchronizeExpressConnectRouterInterRegionBandwidthResponse.setDynamicMessage(_ctx.stringValue("SynchronizeExpressConnectRouterInterRegionBandwidthResponse.DynamicMessage"));
		synchronizeExpressConnectRouterInterRegionBandwidthResponse.setAccessDeniedDetail(_ctx.stringValue("SynchronizeExpressConnectRouterInterRegionBandwidthResponse.AccessDeniedDetail"));
	 
	 	return synchronizeExpressConnectRouterInterRegionBandwidthResponse;
	}
}