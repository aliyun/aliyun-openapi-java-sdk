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

import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeExpressConnectRouterRouteEntriesResponse;
import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeExpressConnectRouterRouteEntriesResponse.RouteEntriesListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExpressConnectRouterRouteEntriesResponseUnmarshaller {

	public static DescribeExpressConnectRouterRouteEntriesResponse unmarshall(DescribeExpressConnectRouterRouteEntriesResponse describeExpressConnectRouterRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		describeExpressConnectRouterRouteEntriesResponse.setRequestId(_ctx.stringValue("DescribeExpressConnectRouterRouteEntriesResponse.RequestId"));
		describeExpressConnectRouterRouteEntriesResponse.setSuccess(_ctx.booleanValue("DescribeExpressConnectRouterRouteEntriesResponse.Success"));
		describeExpressConnectRouterRouteEntriesResponse.setCode(_ctx.stringValue("DescribeExpressConnectRouterRouteEntriesResponse.Code"));
		describeExpressConnectRouterRouteEntriesResponse.setMessage(_ctx.stringValue("DescribeExpressConnectRouterRouteEntriesResponse.Message"));
		describeExpressConnectRouterRouteEntriesResponse.setHttpStatusCode(_ctx.integerValue("DescribeExpressConnectRouterRouteEntriesResponse.HttpStatusCode"));
		describeExpressConnectRouterRouteEntriesResponse.setDynamicCode(_ctx.stringValue("DescribeExpressConnectRouterRouteEntriesResponse.DynamicCode"));
		describeExpressConnectRouterRouteEntriesResponse.setDynamicMessage(_ctx.stringValue("DescribeExpressConnectRouterRouteEntriesResponse.DynamicMessage"));
		describeExpressConnectRouterRouteEntriesResponse.setAccessDeniedDetail(_ctx.stringValue("DescribeExpressConnectRouterRouteEntriesResponse.AccessDeniedDetail"));
		describeExpressConnectRouterRouteEntriesResponse.setTotalCount(_ctx.integerValue("DescribeExpressConnectRouterRouteEntriesResponse.TotalCount"));
		describeExpressConnectRouterRouteEntriesResponse.setMaxResults(_ctx.integerValue("DescribeExpressConnectRouterRouteEntriesResponse.MaxResults"));
		describeExpressConnectRouterRouteEntriesResponse.setNextToken(_ctx.stringValue("DescribeExpressConnectRouterRouteEntriesResponse.NextToken"));

		List<RouteEntriesListItem> routeEntriesList = new ArrayList<RouteEntriesListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExpressConnectRouterRouteEntriesResponse.RouteEntriesList.Length"); i++) {
			RouteEntriesListItem routeEntriesListItem = new RouteEntriesListItem();
			routeEntriesListItem.setDestinationCidrBlock(_ctx.stringValue("DescribeExpressConnectRouterRouteEntriesResponse.RouteEntriesList["+ i +"].DestinationCidrBlock"));
			routeEntriesListItem.setStatus(_ctx.stringValue("DescribeExpressConnectRouterRouteEntriesResponse.RouteEntriesList["+ i +"].Status"));
			routeEntriesListItem.setNexthopInstanceId(_ctx.stringValue("DescribeExpressConnectRouterRouteEntriesResponse.RouteEntriesList["+ i +"].NexthopInstanceId"));
			routeEntriesListItem.setNexthopInstanceRegionId(_ctx.stringValue("DescribeExpressConnectRouterRouteEntriesResponse.RouteEntriesList["+ i +"].NexthopInstanceRegionId"));
			routeEntriesListItem.setAsPath(_ctx.stringValue("DescribeExpressConnectRouterRouteEntriesResponse.RouteEntriesList["+ i +"].AsPath"));
			routeEntriesListItem.setCommunity(_ctx.stringValue("DescribeExpressConnectRouterRouteEntriesResponse.RouteEntriesList["+ i +"].Community"));

			routeEntriesList.add(routeEntriesListItem);
		}
		describeExpressConnectRouterRouteEntriesResponse.setRouteEntriesList(routeEntriesList);
	 
	 	return describeExpressConnectRouterRouteEntriesResponse;
	}
}