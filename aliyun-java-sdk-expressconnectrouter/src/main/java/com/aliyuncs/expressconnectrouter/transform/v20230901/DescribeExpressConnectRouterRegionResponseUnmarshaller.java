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

import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeExpressConnectRouterRegionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExpressConnectRouterRegionResponseUnmarshaller {

	public static DescribeExpressConnectRouterRegionResponse unmarshall(DescribeExpressConnectRouterRegionResponse describeExpressConnectRouterRegionResponse, UnmarshallerContext _ctx) {
		
		describeExpressConnectRouterRegionResponse.setRequestId(_ctx.stringValue("DescribeExpressConnectRouterRegionResponse.RequestId"));
		describeExpressConnectRouterRegionResponse.setSuccess(_ctx.booleanValue("DescribeExpressConnectRouterRegionResponse.Success"));
		describeExpressConnectRouterRegionResponse.setCode(_ctx.stringValue("DescribeExpressConnectRouterRegionResponse.Code"));
		describeExpressConnectRouterRegionResponse.setMessage(_ctx.stringValue("DescribeExpressConnectRouterRegionResponse.Message"));
		describeExpressConnectRouterRegionResponse.setHttpStatusCode(_ctx.integerValue("DescribeExpressConnectRouterRegionResponse.HttpStatusCode"));
		describeExpressConnectRouterRegionResponse.setDynamicCode(_ctx.stringValue("DescribeExpressConnectRouterRegionResponse.DynamicCode"));
		describeExpressConnectRouterRegionResponse.setDynamicMessage(_ctx.stringValue("DescribeExpressConnectRouterRegionResponse.DynamicMessage"));
		describeExpressConnectRouterRegionResponse.setAccessDeniedDetail(_ctx.stringValue("DescribeExpressConnectRouterRegionResponse.AccessDeniedDetail"));

		List<String> regionIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExpressConnectRouterRegionResponse.RegionIdList.Length"); i++) {
			regionIdList.add(_ctx.stringValue("DescribeExpressConnectRouterRegionResponse.RegionIdList["+ i +"]"));
		}
		describeExpressConnectRouterRegionResponse.setRegionIdList(regionIdList);
	 
	 	return describeExpressConnectRouterRegionResponse;
	}
}