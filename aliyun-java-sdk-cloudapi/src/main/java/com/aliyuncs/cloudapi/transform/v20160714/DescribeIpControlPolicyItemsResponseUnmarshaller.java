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

import com.aliyuncs.cloudapi.model.v20160714.DescribeIpControlPolicyItemsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeIpControlPolicyItemsResponse.IpControlPolicyItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpControlPolicyItemsResponseUnmarshaller {

	public static DescribeIpControlPolicyItemsResponse unmarshall(DescribeIpControlPolicyItemsResponse describeIpControlPolicyItemsResponse, UnmarshallerContext _ctx) {
		
		describeIpControlPolicyItemsResponse.setRequestId(_ctx.stringValue("DescribeIpControlPolicyItemsResponse.RequestId"));
		describeIpControlPolicyItemsResponse.setTotalCount(_ctx.integerValue("DescribeIpControlPolicyItemsResponse.TotalCount"));
		describeIpControlPolicyItemsResponse.setPageSize(_ctx.integerValue("DescribeIpControlPolicyItemsResponse.PageSize"));
		describeIpControlPolicyItemsResponse.setPageNumber(_ctx.integerValue("DescribeIpControlPolicyItemsResponse.PageNumber"));

		List<IpControlPolicyItem> ipControlPolicyItems = new ArrayList<IpControlPolicyItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIpControlPolicyItemsResponse.IpControlPolicyItems.Length"); i++) {
			IpControlPolicyItem ipControlPolicyItem = new IpControlPolicyItem();
			ipControlPolicyItem.setAppId(_ctx.stringValue("DescribeIpControlPolicyItemsResponse.IpControlPolicyItems["+ i +"].AppId"));
			ipControlPolicyItem.setCidrIp(_ctx.stringValue("DescribeIpControlPolicyItemsResponse.IpControlPolicyItems["+ i +"].CidrIp"));
			ipControlPolicyItem.setPolicyItemId(_ctx.stringValue("DescribeIpControlPolicyItemsResponse.IpControlPolicyItems["+ i +"].PolicyItemId"));
			ipControlPolicyItem.setCreateTime(_ctx.stringValue("DescribeIpControlPolicyItemsResponse.IpControlPolicyItems["+ i +"].CreateTime"));
			ipControlPolicyItem.setModifiedTime(_ctx.stringValue("DescribeIpControlPolicyItemsResponse.IpControlPolicyItems["+ i +"].ModifiedTime"));

			ipControlPolicyItems.add(ipControlPolicyItem);
		}
		describeIpControlPolicyItemsResponse.setIpControlPolicyItems(ipControlPolicyItems);
	 
	 	return describeIpControlPolicyItemsResponse;
	}
}