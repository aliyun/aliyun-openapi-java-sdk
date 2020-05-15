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

	public static DescribeRouteTableListResponse unmarshall(DescribeRouteTableListResponse describeRouteTableListResponse, UnmarshallerContext _ctx) {
		
		describeRouteTableListResponse.setRequestId(_ctx.stringValue("DescribeRouteTableListResponse.RequestId"));
		describeRouteTableListResponse.setCode(_ctx.stringValue("DescribeRouteTableListResponse.Code"));
		describeRouteTableListResponse.setMessage(_ctx.stringValue("DescribeRouteTableListResponse.Message"));
		describeRouteTableListResponse.setSuccess(_ctx.booleanValue("DescribeRouteTableListResponse.Success"));
		describeRouteTableListResponse.setPageSize(_ctx.integerValue("DescribeRouteTableListResponse.PageSize"));
		describeRouteTableListResponse.setPageNumber(_ctx.integerValue("DescribeRouteTableListResponse.PageNumber"));
		describeRouteTableListResponse.setTotalCount(_ctx.integerValue("DescribeRouteTableListResponse.TotalCount"));

		List<RouterTableListType> routerTableList = new ArrayList<RouterTableListType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRouteTableListResponse.RouterTableList.Length"); i++) {
			RouterTableListType routerTableListType = new RouterTableListType();
			routerTableListType.setVpcId(_ctx.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].VpcId"));
			routerTableListType.setRouterType(_ctx.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].RouterType"));
			routerTableListType.setRouterId(_ctx.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].RouterId"));
			routerTableListType.setRouteTableId(_ctx.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].RouteTableId"));
			routerTableListType.setRouteTableName(_ctx.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].RouteTableName"));
			routerTableListType.setRouteTableType(_ctx.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].RouteTableType"));
			routerTableListType.setDescription(_ctx.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].Description"));
			routerTableListType.setResourceGroupId(_ctx.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].ResourceGroupId"));
			routerTableListType.setCreationTime(_ctx.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].CreationTime"));
			routerTableListType.setStatus(_ctx.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].Status"));
			routerTableListType.setOwnerId(_ctx.longValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].OwnerId"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].VSwitchIds["+ j +"]"));
			}
			routerTableListType.setVSwitchIds(vSwitchIds);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeRouteTableListResponse.RouterTableList["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			routerTableListType.setTags(tags);

			routerTableList.add(routerTableListType);
		}
		describeRouteTableListResponse.setRouterTableList(routerTableList);
	 
	 	return describeRouteTableListResponse;
	}
}