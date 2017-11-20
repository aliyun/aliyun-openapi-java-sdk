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
package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteAccessRuleRequest extends RpcAcsRequest<DeleteAccessRuleResponse> {
	
	public DeleteAccessRuleRequest() {
		super("NAS", "2017-06-26", "DeleteAccessRule", "nas");
	}

	private String accessGroupName;

	private String accessRuleId;

	public String getAccessGroupName() {
		return this.accessGroupName;
	}

	public void setAccessGroupName(String accessGroupName) {
		this.accessGroupName = accessGroupName;
		if(accessGroupName != null){
			putQueryParameter("AccessGroupName", accessGroupName);
		}
	}

	public String getAccessRuleId() {
		return this.accessRuleId;
	}

	public void setAccessRuleId(String accessRuleId) {
		this.accessRuleId = accessRuleId;
		if(accessRuleId != null){
			putQueryParameter("AccessRuleId", accessRuleId);
		}
	}

	@Override
	public Class<DeleteAccessRuleResponse> getResponseClass() {
		return DeleteAccessRuleResponse.class;
	}

}
