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

import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeExpressConnectRouterChildInstanceResponse;
import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeExpressConnectRouterChildInstanceResponse.ChildInstanceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExpressConnectRouterChildInstanceResponseUnmarshaller {

	public static DescribeExpressConnectRouterChildInstanceResponse unmarshall(DescribeExpressConnectRouterChildInstanceResponse describeExpressConnectRouterChildInstanceResponse, UnmarshallerContext _ctx) {
		
		describeExpressConnectRouterChildInstanceResponse.setRequestId(_ctx.stringValue("DescribeExpressConnectRouterChildInstanceResponse.RequestId"));
		describeExpressConnectRouterChildInstanceResponse.setSuccess(_ctx.booleanValue("DescribeExpressConnectRouterChildInstanceResponse.Success"));
		describeExpressConnectRouterChildInstanceResponse.setCode(_ctx.stringValue("DescribeExpressConnectRouterChildInstanceResponse.Code"));
		describeExpressConnectRouterChildInstanceResponse.setMessage(_ctx.stringValue("DescribeExpressConnectRouterChildInstanceResponse.Message"));
		describeExpressConnectRouterChildInstanceResponse.setHttpStatusCode(_ctx.integerValue("DescribeExpressConnectRouterChildInstanceResponse.HttpStatusCode"));
		describeExpressConnectRouterChildInstanceResponse.setDynamicCode(_ctx.stringValue("DescribeExpressConnectRouterChildInstanceResponse.DynamicCode"));
		describeExpressConnectRouterChildInstanceResponse.setDynamicMessage(_ctx.stringValue("DescribeExpressConnectRouterChildInstanceResponse.DynamicMessage"));
		describeExpressConnectRouterChildInstanceResponse.setAccessDeniedDetail(_ctx.stringValue("DescribeExpressConnectRouterChildInstanceResponse.AccessDeniedDetail"));
		describeExpressConnectRouterChildInstanceResponse.setTotalCount(_ctx.integerValue("DescribeExpressConnectRouterChildInstanceResponse.TotalCount"));
		describeExpressConnectRouterChildInstanceResponse.setMaxResults(_ctx.integerValue("DescribeExpressConnectRouterChildInstanceResponse.MaxResults"));
		describeExpressConnectRouterChildInstanceResponse.setNextToken(_ctx.stringValue("DescribeExpressConnectRouterChildInstanceResponse.NextToken"));

		List<ChildInstanceListItem> childInstanceList = new ArrayList<ChildInstanceListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExpressConnectRouterChildInstanceResponse.ChildInstanceList.Length"); i++) {
			ChildInstanceListItem childInstanceListItem = new ChildInstanceListItem();
			childInstanceListItem.setAssociationId(_ctx.stringValue("DescribeExpressConnectRouterChildInstanceResponse.ChildInstanceList["+ i +"].AssociationId"));
			childInstanceListItem.setRegionId(_ctx.stringValue("DescribeExpressConnectRouterChildInstanceResponse.ChildInstanceList["+ i +"].RegionId"));
			childInstanceListItem.setOwnerId(_ctx.longValue("DescribeExpressConnectRouterChildInstanceResponse.ChildInstanceList["+ i +"].OwnerId"));
			childInstanceListItem.setGmtCreate(_ctx.stringValue("DescribeExpressConnectRouterChildInstanceResponse.ChildInstanceList["+ i +"].GmtCreate"));
			childInstanceListItem.setGmtModified(_ctx.stringValue("DescribeExpressConnectRouterChildInstanceResponse.ChildInstanceList["+ i +"].GmtModified"));
			childInstanceListItem.setStatus(_ctx.stringValue("DescribeExpressConnectRouterChildInstanceResponse.ChildInstanceList["+ i +"].Status"));
			childInstanceListItem.setChildInstanceId(_ctx.stringValue("DescribeExpressConnectRouterChildInstanceResponse.ChildInstanceList["+ i +"].ChildInstanceId"));
			childInstanceListItem.setChildInstanceType(_ctx.stringValue("DescribeExpressConnectRouterChildInstanceResponse.ChildInstanceList["+ i +"].ChildInstanceType"));
			childInstanceListItem.setChildInstanceRegionId(_ctx.stringValue("DescribeExpressConnectRouterChildInstanceResponse.ChildInstanceList["+ i +"].ChildInstanceRegionId"));
			childInstanceListItem.setChildInstanceOwnerId(_ctx.longValue("DescribeExpressConnectRouterChildInstanceResponse.ChildInstanceList["+ i +"].ChildInstanceOwnerId"));

			childInstanceList.add(childInstanceListItem);
		}
		describeExpressConnectRouterChildInstanceResponse.setChildInstanceList(childInstanceList);
	 
	 	return describeExpressConnectRouterChildInstanceResponse;
	}
}