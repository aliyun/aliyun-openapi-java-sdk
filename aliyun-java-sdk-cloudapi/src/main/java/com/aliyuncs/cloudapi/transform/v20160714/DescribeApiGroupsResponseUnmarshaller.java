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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiGroupsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiGroupsResponse.ApiGroupAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiGroupsResponseUnmarshaller {

	public static DescribeApiGroupsResponse unmarshall(DescribeApiGroupsResponse describeApiGroupsResponse, UnmarshallerContext _ctx) {
		
		describeApiGroupsResponse.setRequestId(_ctx.stringValue("DescribeApiGroupsResponse.RequestId"));
		describeApiGroupsResponse.setTotalCount(_ctx.integerValue("DescribeApiGroupsResponse.TotalCount"));
		describeApiGroupsResponse.setPageSize(_ctx.integerValue("DescribeApiGroupsResponse.PageSize"));
		describeApiGroupsResponse.setPageNumber(_ctx.integerValue("DescribeApiGroupsResponse.PageNumber"));

		List<ApiGroupAttribute> apiGroupAttributes = new ArrayList<ApiGroupAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiGroupsResponse.ApiGroupAttributes.Length"); i++) {
			ApiGroupAttribute apiGroupAttribute = new ApiGroupAttribute();
			apiGroupAttribute.setGroupId(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].GroupId"));
			apiGroupAttribute.setGroupName(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].GroupName"));
			apiGroupAttribute.setSubDomain(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].SubDomain"));
			apiGroupAttribute.setDescription(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].Description"));
			apiGroupAttribute.setCreatedTime(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].CreatedTime"));
			apiGroupAttribute.setModifiedTime(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].ModifiedTime"));
			apiGroupAttribute.setRegionId(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].RegionId"));
			apiGroupAttribute.setTrafficLimit(_ctx.integerValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].TrafficLimit"));
			apiGroupAttribute.setBillingStatus(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].BillingStatus"));
			apiGroupAttribute.setIllegalStatus(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].IllegalStatus"));
			apiGroupAttribute.setInstanceId(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].InstanceId"));
			apiGroupAttribute.setInstanceType(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].InstanceType"));
			apiGroupAttribute.setHttpsPolicy(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].HttpsPolicy"));

			apiGroupAttributes.add(apiGroupAttribute);
		}
		describeApiGroupsResponse.setApiGroupAttributes(apiGroupAttributes);
	 
	 	return describeApiGroupsResponse;
	}
}