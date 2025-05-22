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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRCSecurityGroupPermissionResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCSecurityGroupPermissionResponse.SecurityGroupPermissionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCSecurityGroupPermissionResponseUnmarshaller {

	public static DescribeRCSecurityGroupPermissionResponse unmarshall(DescribeRCSecurityGroupPermissionResponse describeRCSecurityGroupPermissionResponse, UnmarshallerContext _ctx) {
		
		describeRCSecurityGroupPermissionResponse.setRequestId(_ctx.stringValue("DescribeRCSecurityGroupPermissionResponse.RequestId"));
		describeRCSecurityGroupPermissionResponse.setSecurityGroupId(_ctx.stringValue("DescribeRCSecurityGroupPermissionResponse.SecurityGroupId"));
		describeRCSecurityGroupPermissionResponse.setRegionId(_ctx.stringValue("DescribeRCSecurityGroupPermissionResponse.RegionId"));
		describeRCSecurityGroupPermissionResponse.setVpcId(_ctx.stringValue("DescribeRCSecurityGroupPermissionResponse.VpcId"));
		describeRCSecurityGroupPermissionResponse.setInnerAccessPolicy(_ctx.stringValue("DescribeRCSecurityGroupPermissionResponse.InnerAccessPolicy"));

		List<SecurityGroupPermissionsItem> securityGroupPermissions = new ArrayList<SecurityGroupPermissionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCSecurityGroupPermissionResponse.SecurityGroupPermissions.Length"); i++) {
			SecurityGroupPermissionsItem securityGroupPermissionsItem = new SecurityGroupPermissionsItem();
			securityGroupPermissionsItem.setSecurityGroupRuleId(_ctx.stringValue("DescribeRCSecurityGroupPermissionResponse.SecurityGroupPermissions["+ i +"].SecurityGroupRuleId"));
			securityGroupPermissionsItem.setDirection(_ctx.stringValue("DescribeRCSecurityGroupPermissionResponse.SecurityGroupPermissions["+ i +"].Direction"));
			securityGroupPermissionsItem.setPolicy(_ctx.stringValue("DescribeRCSecurityGroupPermissionResponse.SecurityGroupPermissions["+ i +"].Policy"));
			securityGroupPermissionsItem.setPriority(_ctx.stringValue("DescribeRCSecurityGroupPermissionResponse.SecurityGroupPermissions["+ i +"].Priority"));
			securityGroupPermissionsItem.setIpProtocol(_ctx.stringValue("DescribeRCSecurityGroupPermissionResponse.SecurityGroupPermissions["+ i +"].IpProtocol"));
			securityGroupPermissionsItem.setSourceCidrIp(_ctx.stringValue("DescribeRCSecurityGroupPermissionResponse.SecurityGroupPermissions["+ i +"].SourceCidrIp"));
			securityGroupPermissionsItem.setPortRange(_ctx.stringValue("DescribeRCSecurityGroupPermissionResponse.SecurityGroupPermissions["+ i +"].PortRange"));
			securityGroupPermissionsItem.setDestCidrIp(_ctx.stringValue("DescribeRCSecurityGroupPermissionResponse.SecurityGroupPermissions["+ i +"].DestCidrIp"));
			securityGroupPermissionsItem.setSourcePortRange(_ctx.stringValue("DescribeRCSecurityGroupPermissionResponse.SecurityGroupPermissions["+ i +"].SourcePortRange"));
			securityGroupPermissionsItem.setCreateTime(_ctx.stringValue("DescribeRCSecurityGroupPermissionResponse.SecurityGroupPermissions["+ i +"].CreateTime"));

			securityGroupPermissions.add(securityGroupPermissionsItem);
		}
		describeRCSecurityGroupPermissionResponse.setSecurityGroupPermissions(securityGroupPermissions);
	 
	 	return describeRCSecurityGroupPermissionResponse;
	}
}