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

package com.aliyuncs.cloudwifi_pop.model.v20191118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class EffectApgroupConfigRequest extends RpcAcsRequest<EffectApgroupConfigResponse> {
	   

	private String appName;

	private String appCode;

	private String apGroupUUId;
	public EffectApgroupConfigRequest() {
		super("cloudwifi-pop", "2019-11-18", "EffectApgroupConfig", "cloudap");
		setMethod(MethodType.POST);
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

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putQueryParameter("AppCode", appCode);
		}
	}

	public String getApGroupUUId() {
		return this.apGroupUUId;
	}

	public void setApGroupUUId(String apGroupUUId) {
		this.apGroupUUId = apGroupUUId;
		if(apGroupUUId != null){
			putQueryParameter("ApGroupUUId", apGroupUUId);
		}
	}

	@Override
	public Class<EffectApgroupConfigResponse> getResponseClass() {
		return EffectApgroupConfigResponse.class;
	}

}
