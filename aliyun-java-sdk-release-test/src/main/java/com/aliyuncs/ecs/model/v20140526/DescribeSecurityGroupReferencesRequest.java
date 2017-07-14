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
package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityGroupReferencesRequest extends RpcAcsRequest<DescribeSecurityGroupReferencesResponse> {
	
	public DescribeSecurityGroupReferencesRequest() {
		super("Ecs", "2014-05-26", "DescribeSecurityGroupReferences", "ecs");
	}

	private List<String> securityGroupIds;

	public List<String> getSecurityGroupIds() {
		return this.securityGroupIds;
	}

	public void setSecurityGroupIds(List<String> securityGroupId) {
		this.securityGroupIds = securityGroupId;	
		for (int i = 0; i < securityGroupId.size(); i++) {
			putQueryParameter("SecurityGroupId." + (i + 1) , securityGroupId.get(i));
		}	
	}

	@Override
	public Class<DescribeSecurityGroupReferencesResponse> getResponseClass() {
		return DescribeSecurityGroupReferencesResponse.class;
	}

}
