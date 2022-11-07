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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSecurityIpGroupsResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSecurityIpGroupsResponse.SecurityIpGroupsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityIpGroupsResponseUnmarshaller {

	public static DescribeSecurityIpGroupsResponse unmarshall(DescribeSecurityIpGroupsResponse describeSecurityIpGroupsResponse, UnmarshallerContext _ctx) {
		
		describeSecurityIpGroupsResponse.setRequestId(_ctx.stringValue("DescribeSecurityIpGroupsResponse.RequestId"));
		describeSecurityIpGroupsResponse.setTotalCount(_ctx.integerValue("DescribeSecurityIpGroupsResponse.TotalCount"));

		List<SecurityIpGroupsItem> securityIpGroups = new ArrayList<SecurityIpGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityIpGroupsResponse.SecurityIpGroups.Length"); i++) {
			SecurityIpGroupsItem securityIpGroupsItem = new SecurityIpGroupsItem();
			securityIpGroupsItem.setSecurityIps(_ctx.stringValue("DescribeSecurityIpGroupsResponse.SecurityIpGroups["+ i +"].SecurityIps"));
			securityIpGroupsItem.setSecurityIpGroupName(_ctx.stringValue("DescribeSecurityIpGroupsResponse.SecurityIpGroups["+ i +"].SecurityIpGroupName"));

			securityIpGroups.add(securityIpGroupsItem);
		}
		describeSecurityIpGroupsResponse.setSecurityIpGroups(securityIpGroups);
	 
	 	return describeSecurityIpGroupsResponse;
	}
}