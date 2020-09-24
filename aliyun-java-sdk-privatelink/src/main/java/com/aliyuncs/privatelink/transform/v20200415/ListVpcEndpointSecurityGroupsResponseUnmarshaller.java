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

package com.aliyuncs.privatelink.transform.v20200415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointSecurityGroupsResponse;
import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointSecurityGroupsResponse.SecurityGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcEndpointSecurityGroupsResponseUnmarshaller {

	public static ListVpcEndpointSecurityGroupsResponse unmarshall(ListVpcEndpointSecurityGroupsResponse listVpcEndpointSecurityGroupsResponse, UnmarshallerContext _ctx) {
		
		listVpcEndpointSecurityGroupsResponse.setRequestId(_ctx.stringValue("ListVpcEndpointSecurityGroupsResponse.RequestId"));
		listVpcEndpointSecurityGroupsResponse.setMaxResults(_ctx.stringValue("ListVpcEndpointSecurityGroupsResponse.MaxResults"));
		listVpcEndpointSecurityGroupsResponse.setNextToken(_ctx.stringValue("ListVpcEndpointSecurityGroupsResponse.NextToken"));

		List<SecurityGroup> securityGroups = new ArrayList<SecurityGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcEndpointSecurityGroupsResponse.SecurityGroups.Length"); i++) {
			SecurityGroup securityGroup = new SecurityGroup();
			securityGroup.setSecurityGroupId(_ctx.stringValue("ListVpcEndpointSecurityGroupsResponse.SecurityGroups["+ i +"].SecurityGroupId"));

			securityGroups.add(securityGroup);
		}
		listVpcEndpointSecurityGroupsResponse.setSecurityGroups(securityGroups);
	 
	 	return listVpcEndpointSecurityGroupsResponse;
	}
}