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
package com.aliyuncs.push.model.v20160801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyAppExtensionsRequest extends RpcAcsRequest<ModifyAppExtensionsResponse> {
	
	public ModifyAppExtensionsRequest() {
		super("Push", "2016-08-01", "ModifyAppExtensions");
	}

	private Long appKey;

	private String xmAppSecretKey;

	private String hwAppKey;

	private String hwAppSecretKey;

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		putQueryParameter("AppKey", appKey);
	}

	public String getXmAppSecretKey() {
		return this.xmAppSecretKey;
	}

	public void setXmAppSecretKey(String xmAppSecretKey) {
		this.xmAppSecretKey = xmAppSecretKey;
		putQueryParameter("XmAppSecretKey", xmAppSecretKey);
	}

	public String getHwAppKey() {
		return this.hwAppKey;
	}

	public void setHwAppKey(String hwAppKey) {
		this.hwAppKey = hwAppKey;
		putQueryParameter("HwAppKey", hwAppKey);
	}

	public String getHwAppSecretKey() {
		return this.hwAppSecretKey;
	}

	public void setHwAppSecretKey(String hwAppSecretKey) {
		this.hwAppSecretKey = hwAppSecretKey;
		putQueryParameter("HwAppSecretKey", hwAppSecretKey);
	}

	@Override
	public Class<ModifyAppExtensionsResponse> getResponseClass() {
		return ModifyAppExtensionsResponse.class;
	}

}
