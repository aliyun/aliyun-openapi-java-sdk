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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeRouteTableListResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeRouteTableListResponse.RouterTableListType;
import com.aliyuncs.vpc.model.v20160428.DescribeRouteTableListResponse.RouterTableListType.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRouteTableListResponseUnmarshaller {

	public static DescribeRouteTableListResponse unmarshall(DescribeRouteTableListResponse describeRouteTableListResponse, UnmarshallerContext context) {
		
		describeRouteTableListResponse.setRequestId(context.stringValue("DescribeRouteTableListResponse.RequestId"));
		describeRouteTableListResponse.setCode(context.stringValue("DescribeRouteTableListResponse.Code"));
		describeRouteTableListResponse.setMessage(context.stringValue("DescribeRouteTableListResponse.Message"));
		describeRouteTableListResponse.setSuccess(context.booleanValue("DescribeRouteTableListResponse.Success"));
		describeRouteTableListResponse.setPageSize(context.integerValue("DescribeRouteTableListResponse.PageSize"));
		describeRouteTableListResponse.setPageNumber(context.integerValue("DescribeRouteTableListResponse.PageNumber"));
		describeRouteTableListResponse.setTotalCount(context.integerValue("DescribeRouteTableListResponse.TotalCount"));

		List<RouterTableListType> routerTableList = new ArrayList<RouterTableListType>();
		for (int i = 0; i < context.lengthValue("DescribeRouteTableListResponse.RouterTableList.Length"); i++) {
			RouterTableListType routerTableListType = new RouterTableListType();
			routerTableListType.setVpcId(context.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].VpcId"));
			routerTableListType.setRouterType(context.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].RouterType"));
			routerTableListType.setRouterId(context.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].RouterId"));
			routerTableListType.setRouteTableId(context.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].RouteTableId"));
			routerTableListType.setRouteTableName(context.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].RouteTableName"));
			routerTableListType.setRouteTableType(context.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].RouteTableType"));
			routerTableListType.setDescription(context.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].Description"));
			routerTableListType.setResourceGroupId(context.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].ResourceGroupId"));
			routerTableListType.setCreationTime(context.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].CreationTime"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(context.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].VSwitchIds["+ j +"]"));
			}
			routerTableListType.setVSwitchIds(vSwitchIds);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(context.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(context.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			routerTableListType.setTags(tags);

			routerTableList.add(routerTableListType);
		}
		describeRouteTableListResponse.setRouterTableList(routerTableList);
	 
	 	return describeRouteTableListResponse;
	}
}