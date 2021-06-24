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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSecurityGroupAttributeResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSecurityGroupAttributeResponse.Permission;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeSecurityGroupAttributeResponseUnmarshaller {

	public static OpsDescribeSecurityGroupAttributeResponse unmarshall(OpsDescribeSecurityGroupAttributeResponse opsDescribeSecurityGroupAttributeResponse, UnmarshallerContext _ctx) {
		
		opsDescribeSecurityGroupAttributeResponse.setRequestId(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.RequestId"));
		opsDescribeSecurityGroupAttributeResponse.setDescription(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.Description"));
		opsDescribeSecurityGroupAttributeResponse.setVpcId(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.VpcId"));
		opsDescribeSecurityGroupAttributeResponse.setSecurityGroupName(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.SecurityGroupName"));
		opsDescribeSecurityGroupAttributeResponse.setSecurityGroupId(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.SecurityGroupId"));
		opsDescribeSecurityGroupAttributeResponse.setRegionId(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.RegionId"));

		List<Permission> permissions = new ArrayList<Permission>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeSecurityGroupAttributeResponse.Permissions.Length"); i++) {
			Permission permission = new Permission();
			permission.setDirection(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Direction"));
			permission.setSourceGroupId(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourceGroupId"));
			permission.setDestGroupOwnerAccount(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.Permissions["+ i +"].DestGroupOwnerAccount"));
			permission.setSourceCidrIp(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourceCidrIp"));
			permission.setDestGroupId(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.Permissions["+ i +"].DestGroupId"));
			permission.setDestCidrIp(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.Permissions["+ i +"].DestCidrIp"));
			permission.setIpProtocol(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.Permissions["+ i +"].IpProtocol"));
			permission.setPriority(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Priority"));
			permission.setNicType(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.Permissions["+ i +"].NicType"));
			permission.setPolicy(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Policy"));
			permission.setPortRange(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.Permissions["+ i +"].PortRange"));
			permission.setSourceGroupOwnerAccount(_ctx.stringValue("OpsDescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourceGroupOwnerAccount"));

			permissions.add(permission);
		}
		opsDescribeSecurityGroupAttributeResponse.setPermissions(permissions);
	 
	 	return opsDescribeSecurityGroupAttributeResponse;
	}
}