/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupAttributeResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupAttributeResponse.Permission;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityGroupAttributeResponseUnmarshaller {

	public static DescribeSecurityGroupAttributeResponse unmarshall(DescribeSecurityGroupAttributeResponse describeSecurityGroupAttributeResponse, UnmarshallerContext context) {
		
		describeSecurityGroupAttributeResponse.setRequestId(context.stringValue("DescribeSecurityGroupAttributeResponse.RequestId"));
		describeSecurityGroupAttributeResponse.setRegionId(context.stringValue("DescribeSecurityGroupAttributeResponse.RegionId"));
		describeSecurityGroupAttributeResponse.setSecurityGroupId(context.stringValue("DescribeSecurityGroupAttributeResponse.SecurityGroupId"));
		describeSecurityGroupAttributeResponse.setDescription(context.stringValue("DescribeSecurityGroupAttributeResponse.Description"));
		describeSecurityGroupAttributeResponse.setSecurityGroupName(context.stringValue("DescribeSecurityGroupAttributeResponse.SecurityGroupName"));
		describeSecurityGroupAttributeResponse.setVpcId(context.stringValue("DescribeSecurityGroupAttributeResponse.VpcId"));

		List<Permission> permissions = new ArrayList<Permission>();
		for (int i = 0; i < context.lengthValue("DescribeSecurityGroupAttributeResponse.Permissions.Length"); i++) {
			Permission permission = new Permission();
			permission.setIpProtocol(context.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].IpProtocol"));
			permission.setPortRange(context.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].PortRange"));
			permission.setSourceGroupId(context.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourceGroupId"));
			permission.setSourceGroupName(context.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourceGroupName"));
			permission.setSourceCidrIp(context.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourceCidrIp"));
			permission.setPolicy(context.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Policy"));
			permission.setNicType(context.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].NicType"));
			permission.setSourceGroupOwnerAccount(context.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].SourceGroupOwnerAccount"));
			permission.setDestGroupId(context.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].DestGroupId"));
			permission.setDestGroupName(context.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].DestGroupName"));
			permission.setDestCidrIp(context.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].DestCidrIp"));
			permission.setDestGroupOwnerAccount(context.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].DestGroupOwnerAccount"));
			permission.setPriority(context.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Priority"));
			permission.setDirection(context.stringValue("DescribeSecurityGroupAttributeResponse.Permissions["+ i +"].Direction"));

			permissions.add(permission);
		}
		describeSecurityGroupAttributeResponse.setPermissions(permissions);
	 
	 	return describeSecurityGroupAttributeResponse;
	}
}