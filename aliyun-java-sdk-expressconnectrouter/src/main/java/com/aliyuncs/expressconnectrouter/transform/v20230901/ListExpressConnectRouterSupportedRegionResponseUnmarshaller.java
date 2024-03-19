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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.expressconnectrouter.model.v20230901.ListExpressConnectRouterSupportedRegionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExpressConnectRouterSupportedRegionResponseUnmarshaller {

	public static ListExpressConnectRouterSupportedRegionResponse unmarshall(ListExpressConnectRouterSupportedRegionResponse listExpressConnectRouterSupportedRegionResponse, UnmarshallerContext _ctx) {
		
		listExpressConnectRouterSupportedRegionResponse.setRequestId(_ctx.stringValue("ListExpressConnectRouterSupportedRegionResponse.RequestId"));
		listExpressConnectRouterSupportedRegionResponse.setSuccess(_ctx.booleanValue("ListExpressConnectRouterSupportedRegionResponse.Success"));
		listExpressConnectRouterSupportedRegionResponse.setCode(_ctx.stringValue("ListExpressConnectRouterSupportedRegionResponse.Code"));
		listExpressConnectRouterSupportedRegionResponse.setMessage(_ctx.stringValue("ListExpressConnectRouterSupportedRegionResponse.Message"));
		listExpressConnectRouterSupportedRegionResponse.setHttpStatusCode(_ctx.integerValue("ListExpressConnectRouterSupportedRegionResponse.HttpStatusCode"));
		listExpressConnectRouterSupportedRegionResponse.setDynamicCode(_ctx.stringValue("ListExpressConnectRouterSupportedRegionResponse.DynamicCode"));
		listExpressConnectRouterSupportedRegionResponse.setDynamicMessage(_ctx.stringValue("ListExpressConnectRouterSupportedRegionResponse.DynamicMessage"));
		listExpressConnectRouterSupportedRegionResponse.setAccessDeniedDetail(_ctx.stringValue("ListExpressConnectRouterSupportedRegionResponse.AccessDeniedDetail"));

		List<String> supportedRegionIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListExpressConnectRouterSupportedRegionResponse.SupportedRegionIdList.Length"); i++) {
			supportedRegionIdList.add(_ctx.stringValue("ListExpressConnectRouterSupportedRegionResponse.SupportedRegionIdList["+ i +"]"));
		}
		listExpressConnectRouterSupportedRegionResponse.setSupportedRegionIdList(supportedRegionIdList);
	 
	 	return listExpressConnectRouterSupportedRegionResponse;
	}
}