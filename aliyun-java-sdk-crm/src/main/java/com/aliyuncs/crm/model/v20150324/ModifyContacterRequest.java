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
package com.aliyuncs.crm.model.v20150324;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyContacterRequest extends RpcAcsRequest<ModifyContacterResponse> {
	
	public ModifyContacterRequest() {
		super("Crm", "2015-03-24", "ModifyContacter");
	}

	private Long contacterId;

	private String contacterName;

	private String contacterEmail;

	private String contacterMobile;

	private String contacterPosition;

	public Long getContacterId() {
		return this.contacterId;
	}

	public void setContacterId(Long contacterId) {
		this.contacterId = contacterId;
		putQueryParameter("ContacterId", String.valueOf(contacterId));
	}

	public String getContacterName() {
		return this.contacterName;
	}

	public void setContacterName(String contacterName) {
		this.contacterName = contacterName;
		putQueryParameter("ContacterName", contacterName);
	}

	public String getContacterEmail() {
		return this.contacterEmail;
	}

	public void setContacterEmail(String contacterEmail) {
		this.contacterEmail = contacterEmail;
		putQueryParameter("ContacterEmail", contacterEmail);
	}

	public String getContacterMobile() {
		return this.contacterMobile;
	}

	public void setContacterMobile(String contacterMobile) {
		this.contacterMobile = contacterMobile;
		putQueryParameter("ContacterMobile", contacterMobile);
	}

	public String getContacterPosition() {
		return this.contacterPosition;
	}

	public void setContacterPosition(String contacterPosition) {
		this.contacterPosition = contacterPosition;
		putQueryParameter("ContacterPosition", contacterPosition);
	}

	@Override
	public Class<ModifyContacterResponse> getResponseClass() {
		return ModifyContacterResponse.class;
	}

}
