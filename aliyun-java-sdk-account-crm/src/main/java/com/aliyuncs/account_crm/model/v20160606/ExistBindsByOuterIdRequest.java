/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ExistBindsByOuterIdRequest extends RpcAcsRequest<ExistBindsByOuterIdResponse> {
	   

	private String appName;

	private String tenantId;

	private String outerId;

	private String minorOuterId;
	public ExistBindsByOuterIdRequest() {
		super("account-crm", "2016-06-06", "ExistBindsByOuterId");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
		}
	}

	public String getOuterId() {
		return this.outerId;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
		if(outerId != null){
			putQueryParameter("OuterId", outerId);
		}
	}

	public String getMinorOuterId() {
		return this.minorOuterId;
	}

	public void setMinorOuterId(String minorOuterId) {
		this.minorOuterId = minorOuterId;
		if(minorOuterId != null){
			putQueryParameter("MinorOuterId", minorOuterId);
		}
	}

	@Override
	public Class<ExistBindsByOuterIdResponse> getResponseClass() {
		return ExistBindsByOuterIdResponse.class;
	}

}
