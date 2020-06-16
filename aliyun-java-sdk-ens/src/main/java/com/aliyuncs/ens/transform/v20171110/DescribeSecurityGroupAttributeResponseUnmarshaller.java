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
		describeSecurityGroupAttributeResponse.setSecurityGroupId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.SecurityGroupId"));

		List<Permission> permissions = new ArrayList<Permission>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityGroupAttributeResponse.Permissions.Length"); i++) {
			Permission permission = new Permission();
			permission.setDestCidrIp(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].DestCidrIp"));
			permission.setSourceCidrIp(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourceCidrIp"));
			permission.setIpProtocol(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].IpProtocol"));
			permission.setPriority(_ctx.integerValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Priority"));
			permission.setPolicy(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Policy"));
			permission.setDirection(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Direction"));
			permission.setCreationTime(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].CreationTime"));
			permission.setCreationTime1(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].CreationTime"));
			permission.setPortRange(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].PortRange"));
			permission.setSourcePortRange(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourcePortRange"));

			permissions.add(permission);
		}
		describeSecurityGroupAttributeResponse.setPermissions(permissions);
	 
	 	return describeSecurityGroupAttributeResponse;
	}
}