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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantSecurityIpGroupsResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantSecurityIpGroupsResponse.SecurityIpGroupsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTenantSecurityIpGroupsResponseUnmarshaller {

	public static DescribeTenantSecurityIpGroupsResponse unmarshall(DescribeTenantSecurityIpGroupsResponse describeTenantSecurityIpGroupsResponse, UnmarshallerContext _ctx) {
		
		describeTenantSecurityIpGroupsResponse.setRequestId(_ctx.stringValue("DescribeTenantSecurityIpGroupsResponse.RequestId"));
		describeTenantSecurityIpGroupsResponse.setTotalCount(_ctx.integerValue("DescribeTenantSecurityIpGroupsResponse.TotalCount"));

		List<SecurityIpGroupsItem> securityIpGroups = new ArrayList<SecurityIpGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTenantSecurityIpGroupsResponse.SecurityIpGroups.Length"); i++) {
			SecurityIpGroupsItem securityIpGroupsItem = new SecurityIpGroupsItem();
			securityIpGroupsItem.setSecurityIpGroupName(_ctx.stringValue("DescribeTenantSecurityIpGroupsResponse.SecurityIpGroups["+ i +"].SecurityIpGroupName"));
			securityIpGroupsItem.setSecurityIps(_ctx.stringValue("DescribeTenantSecurityIpGroupsResponse.SecurityIpGroups["+ i +"].SecurityIps"));
			securityIpGroupsItem.setSecurityIpGroupType(_ctx.stringValue("DescribeTenantSecurityIpGroupsResponse.SecurityIpGroups["+ i +"].SecurityIpGroupType"));
			securityIpGroupsItem.setTenantId(_ctx.stringValue("DescribeTenantSecurityIpGroupsResponse.SecurityIpGroups["+ i +"].TenantId"));

			securityIpGroups.add(securityIpGroupsItem);
		}
		describeTenantSecurityIpGroupsResponse.setSecurityIpGroups(securityIpGroups);
	 
	 	return describeTenantSecurityIpGroupsResponse;
	}
}