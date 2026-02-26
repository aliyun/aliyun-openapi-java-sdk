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

import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeExpressConnectRouterInterRegionTransitModeResponse;
import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeExpressConnectRouterInterRegionTransitModeResponse.InterRegionTransitModeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExpressConnectRouterInterRegionTransitModeResponseUnmarshaller {

	public static DescribeExpressConnectRouterInterRegionTransitModeResponse unmarshall(DescribeExpressConnectRouterInterRegionTransitModeResponse describeExpressConnectRouterInterRegionTransitModeResponse, UnmarshallerContext _ctx) {
		
		describeExpressConnectRouterInterRegionTransitModeResponse.setRequestId(_ctx.stringValue("DescribeExpressConnectRouterInterRegionTransitModeResponse.RequestId"));
		describeExpressConnectRouterInterRegionTransitModeResponse.setSuccess(_ctx.booleanValue("DescribeExpressConnectRouterInterRegionTransitModeResponse.Success"));
		describeExpressConnectRouterInterRegionTransitModeResponse.setCode(_ctx.stringValue("DescribeExpressConnectRouterInterRegionTransitModeResponse.Code"));
		describeExpressConnectRouterInterRegionTransitModeResponse.setMessage(_ctx.stringValue("DescribeExpressConnectRouterInterRegionTransitModeResponse.Message"));
		describeExpressConnectRouterInterRegionTransitModeResponse.setHttpStatusCode(_ctx.integerValue("DescribeExpressConnectRouterInterRegionTransitModeResponse.HttpStatusCode"));
		describeExpressConnectRouterInterRegionTransitModeResponse.setDynamicCode(_ctx.stringValue("DescribeExpressConnectRouterInterRegionTransitModeResponse.DynamicCode"));
		describeExpressConnectRouterInterRegionTransitModeResponse.setDynamicMessage(_ctx.stringValue("DescribeExpressConnectRouterInterRegionTransitModeResponse.DynamicMessage"));
		describeExpressConnectRouterInterRegionTransitModeResponse.setAccessDeniedDetail(_ctx.stringValue("DescribeExpressConnectRouterInterRegionTransitModeResponse.AccessDeniedDetail"));

		List<InterRegionTransitModeListItem> interRegionTransitModeList = new ArrayList<InterRegionTransitModeListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExpressConnectRouterInterRegionTransitModeResponse.InterRegionTransitModeList.Length"); i++) {
			InterRegionTransitModeListItem interRegionTransitModeListItem = new InterRegionTransitModeListItem();
			interRegionTransitModeListItem.setRegionId(_ctx.stringValue("DescribeExpressConnectRouterInterRegionTransitModeResponse.InterRegionTransitModeList["+ i +"].RegionId"));
			interRegionTransitModeListItem.setMode(_ctx.stringValue("DescribeExpressConnectRouterInterRegionTransitModeResponse.InterRegionTransitModeList["+ i +"].Mode"));

			interRegionTransitModeList.add(interRegionTransitModeListItem);
		}
		describeExpressConnectRouterInterRegionTransitModeResponse.setInterRegionTransitModeList(interRegionTransitModeList);
	 
	 	return describeExpressConnectRouterInterRegionTransitModeResponse;
	}
}