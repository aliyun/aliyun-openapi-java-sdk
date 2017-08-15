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
package com.aliyuncs.ons.model.v20160503;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class OnsConsumerAccumulateRequest extends RpcAcsRequest<OnsConsumerAccumulateResponse> {
	
	public OnsConsumerAccumulateRequest() {
		super("Ons", "2016-05-03", "OnsConsumerAccumulate");
	}

	private Long preventCache;

	private String onsRegionId;

	private String onsPlatform;

	private String consumerId;

	private Boolean detail;

	public Long getPreventCache() {
		return this.preventCache;
	}

	public void setPreventCache(Long preventCache) {
		this.preventCache = preventCache;
		if(preventCache != null){
			putQueryParameter("PreventCache", preventCache.toString());
		}
	}

	public String getOnsRegionId() {
		return this.onsRegionId;
	}

	public void setOnsRegionId(String onsRegionId) {
		this.onsRegionId = onsRegionId;
		if(onsRegionId != null){
			putQueryParameter("OnsRegionId", onsRegionId);
		}
	}

	public String getOnsPlatform() {
		return this.onsPlatform;
	}

	public void setOnsPlatform(String onsPlatform) {
		this.onsPlatform = onsPlatform;
		if(onsPlatform != null){
			putQueryParameter("OnsPlatform", onsPlatform);
		}
	}

	public String getConsumerId() {
		return this.consumerId;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
		if(consumerId != null){
			putQueryParameter("ConsumerId", consumerId);
		}
	}

	public Boolean getDetail() {
		return this.detail;
	}

	public void setDetail(Boolean detail) {
		this.detail = detail;
		if(detail != null){
			putQueryParameter("Detail", detail.toString());
		}
	}

	@Override
	public Class<OnsConsumerAccumulateResponse> getResponseClass() {
		return OnsConsumerAccumulateResponse.class;
	}

}
