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
package com.aliyuncs.cr.model.v20160607;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteRepoAuthorizationRequest extends RoaAcsRequest<DeleteRepoAuthorizationResponse> {
	
	public DeleteRepoAuthorizationRequest() {
		super("cr", "2016-06-07", "DeleteRepoAuthorization");
		setUriPattern("/repos/[RepoNamespace]/[RepoName]/authorizations/[AuthorizeId]");
		setMethod(MethodType.DELETE);
	}

	private String repoNamespace;

	private String repoName;

	private Long authorizeId;

	public String getRepoNamespace() {
		return this.repoNamespace;
	}

	public void setRepoNamespace(String repoNamespace) {
		this.repoNamespace = repoNamespace;
		putPathParameter("RepoNamespace", repoNamespace);
	}

	public String getRepoName() {
		return this.repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
		putPathParameter("RepoName", repoName);
	}

	public Long getAuthorizeId() {
		return this.authorizeId;
	}

	public void setAuthorizeId(Long authorizeId) {
		this.authorizeId = authorizeId;
		putPathParameter("AuthorizeId", authorizeId);
	}

	@Override
	public Class<DeleteRepoAuthorizationResponse> getResponseClass() {
		return DeleteRepoAuthorizationResponse.class;
	}

}
