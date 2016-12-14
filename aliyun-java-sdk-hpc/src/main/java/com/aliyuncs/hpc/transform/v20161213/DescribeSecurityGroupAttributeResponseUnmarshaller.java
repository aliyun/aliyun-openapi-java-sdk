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
package com.aliyuncs.hpc.transform.v20161213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hpc.model.v20161213.DescribeSecurityGroupAttributeResponse;
import com.aliyuncs.hpc.model.v20161213.DescribeSecurityGroupAttributeResponse.Records;
import com.aliyuncs.hpc.model.v20161213.DescribeSecurityGroupAttributeResponse.Records.Permission;
import com.aliyuncs.hpc.model.v20161213.DescribeSecurityGroupAttributeResponse.Records.Permission.NicType;
import com.aliyuncs.hpc.model.v20161213.DescribeSecurityGroupAttributeResponse.Records.Permission.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityGroupAttributeResponseUnmarshaller {

	public static DescribeSecurityGroupAttributeResponse unmarshall(DescribeSecurityGroupAttributeResponse describeSecurityGroupAttributeResponse, UnmarshallerContext context) {
		

		Records records = new Records();
		records.setRegionId(context.stringValue("DescribeSecurityGroupAttributeResponse.Records.RegionId"));

		List<Permission> permissions = new ArrayList<Permission>();
		for (int i = 0; i < context.lengthValue("DescribeSecurityGroupAttributeResponse.Records.Permissions.Length"); i++) {
			Permission permission = new Permission();
			permission.setSourceIp(context.stringValue("DescribeSecurityGroupAttributeResponse.Records.Permissions["+ i +"].SourceIp"));
			permission.setPolicy(Policy.getEnum(context.stringValue("DescribeSecurityGroupAttributeResponse.Records.Permissions["+ i +"].Policy")));
			permission.setNicType(NicType.getEnum(context.stringValue("DescribeSecurityGroupAttributeResponse.Records.Permissions["+ i +"].NicType")));
			permission.setPriority(context.stringValue("DescribeSecurityGroupAttributeResponse.Records.Permissions["+ i +"].Priority"));
			permission.setTime(context.stringValue("DescribeSecurityGroupAttributeResponse.Records.Permissions["+ i +"].Time"));

			permissions.add(permission);
		}
		records.setPermissions(permissions);
		describeSecurityGroupAttributeResponse.setRecords(records);
	 
	 	return describeSecurityGroupAttributeResponse;
	}
}