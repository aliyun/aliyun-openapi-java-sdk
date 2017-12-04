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
package com.aliyuncs.cms.model.v20170301;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ProfileSetRequest extends RpcAcsRequest<ProfileSetResponse> {
	
	public ProfileSetRequest() {
		super("Cms", "2017-03-01", "ProfileSet", "cms");
	}

	private Boolean autoInstall;

	private Long userId;

	public Boolean getAutoInstall() {
		return this.autoInstall;
	}

	public void setAutoInstall(Boolean autoInstall) {
		this.autoInstall = autoInstall;
		if(autoInstall != null){
			putQueryParameter("AutoInstall", autoInstall.toString());
		}
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId.toString());
		}
	}

	@Override
	public Class<ProfileSetResponse> getResponseClass() {
		return ProfileSetResponse.class;
	}

}
