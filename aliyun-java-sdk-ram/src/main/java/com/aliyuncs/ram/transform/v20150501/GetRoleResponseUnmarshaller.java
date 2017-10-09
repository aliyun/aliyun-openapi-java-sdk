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
package com.aliyuncs.ram.transform.v20150501;

import com.aliyuncs.ram.model.v20150501.GetRoleResponse;
import com.aliyuncs.ram.model.v20150501.GetRoleResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRoleResponseUnmarshaller {

	public static GetRoleResponse unmarshall(GetRoleResponse getRoleResponse, UnmarshallerContext context) {
		
		getRoleResponse.setRequestId(context.stringValue("GetRoleResponse.RequestId"));

		Role role = new Role();
		role.setRoleId(context.stringValue("GetRoleResponse.Role.RoleId"));
		role.setRoleName(context.stringValue("GetRoleResponse.Role.RoleName"));
		role.setArn(context.stringValue("GetRoleResponse.Role.Arn"));
		role.setDescription(context.stringValue("GetRoleResponse.Role.Description"));
		role.setAssumeRolePolicyDocument(context.stringValue("GetRoleResponse.Role.AssumeRolePolicyDocument"));
		role.setCreateDate(context.stringValue("GetRoleResponse.Role.CreateDate"));
		role.setUpdateDate(context.stringValue("GetRoleResponse.Role.UpdateDate"));
		getRoleResponse.setRole(role);
	 
	 	return getRoleResponse;
	}
}