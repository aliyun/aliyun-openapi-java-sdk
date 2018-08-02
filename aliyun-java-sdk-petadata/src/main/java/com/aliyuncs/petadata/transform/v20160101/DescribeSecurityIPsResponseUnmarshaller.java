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

package com.aliyuncs.petadata.transform.v20160101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.petadata.model.v20160101.DescribeSecurityIPsResponse;
import com.aliyuncs.petadata.model.v20160101.DescribeSecurityIPsResponse.SecurityIpGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityIPsResponseUnmarshaller {

	public static DescribeSecurityIPsResponse unmarshall(DescribeSecurityIPsResponse describeSecurityIPsResponse, UnmarshallerContext context) {
		
		describeSecurityIPsResponse.setRequestId(context.stringValue("DescribeSecurityIPsResponse.RequestId"));
		describeSecurityIPsResponse.setInstanceId(context.stringValue("DescribeSecurityIPsResponse.InstanceId"));
		describeSecurityIPsResponse.setSecurityIPList(context.stringValue("DescribeSecurityIPsResponse.SecurityIPList"));

		List<SecurityIpGroup> securityIPs = new ArrayList<SecurityIpGroup>();
		for (int i = 0; i < context.lengthValue("DescribeSecurityIPsResponse.SecurityIPs.Length"); i++) {
			SecurityIpGroup securityIpGroup = new SecurityIpGroup();
			securityIpGroup.setSecurityIPListName(context.stringValue("DescribeSecurityIPsResponse.SecurityIPs["+ i +"].SecurityIPListName"));
			securityIpGroup.setSecurityIPListAttribute(context.stringValue("DescribeSecurityIPsResponse.SecurityIPs["+ i +"].SecurityIPListAttribute"));
			securityIpGroup.setSecurityIPList(context.stringValue("DescribeSecurityIPsResponse.SecurityIPs["+ i +"].SecurityIPList"));

			securityIPs.add(securityIpGroup);
		}
		describeSecurityIPsResponse.setSecurityIPs(securityIPs);
	 
	 	return describeSecurityIPsResponse;
	}
}