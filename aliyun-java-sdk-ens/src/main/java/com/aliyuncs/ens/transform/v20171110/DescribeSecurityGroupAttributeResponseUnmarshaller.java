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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeSecurityGroupAttributeResponse;
import com.aliyuncs.ens.model.v20171110.DescribeSecurityGroupAttributeResponse.Permission;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityGroupAttributeResponseUnmarshaller {

	public static DescribeSecurityGroupAttributeResponse unmarshall(DescribeSecurityGroupAttributeResponse describeSecurityGroupAttributeResponse, UnmarshallerContext _ctx) {
		
		describeSecurityGroupAttributeResponse.setRequestId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.RequestId"));
		describeSecurityGroupAttributeResponse.setDescription(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Description"));
		describeSecurityGroupAttributeResponse.setSecurityGroupId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.SecurityGroupId"));
		describeSecurityGroupAttributeResponse.setSecurityGroupName(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.SecurityGroupName"));

		List<Permission> permissions = new ArrayList<Permission>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityGroupAttributeResponse.Permissions.Length"); i++) {
			Permission permission = new Permission();
			permission.setCreationTime(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].CreationTime"));
			permission.setDirection(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Direction"));
			permission.setPolicy(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Policy"));
			permission.setPortRange(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].PortRange"));
			permission.setSourceCidrIp(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourceCidrIp"));
			permission.setIpProtocol(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].IpProtocol"));
			permission.setDestCidrIp(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].DestCidrIp"));
			permission.setPriority(_ctx.integerValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Priority"));
			permission.setSourcePortRange(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourcePortRange"));
			permission.setDescription(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Description"));

			permissions.add(permission);
		}
		describeSecurityGroupAttributeResponse.setPermissions(permissions);
	 
	 	return describeSecurityGroupAttributeResponse;
	}
}