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
public class ModifyCustomerInfoRequest extends RpcAcsRequest<ModifyCustomerInfoResponse> {
	
	public ModifyCustomerInfoRequest() {
		super("Crm", "2015-03-24", "ModifyCustomerInfo");
	}

	private Long kpId;

	private String website;

	private String biz;

	public Long getKpId() {
		return this.kpId;
	}

	public void setKpId(Long kpId) {
		this.kpId = kpId;
		putQueryParameter("KpId", String.valueOf(kpId));
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
		putQueryParameter("Website", website);
	}

	public String getBiz() {
		return this.biz;
	}

	public void setBiz(String biz) {
		this.biz = biz;
		putQueryParameter("Biz", biz);
	}

	@Override
	public Class<ModifyCustomerInfoResponse> getResponseClass() {
		return ModifyCustomerInfoResponse.class;
	}

}
