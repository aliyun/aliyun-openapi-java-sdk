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

package com.aliyuncs.sddp.model.v20190103;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sddp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDefaultLevelRequest extends RpcAcsRequest<ModifyDefaultLevelResponse> {
	   

	private Long defaultId;

	private String lang;

	private String sensitiveIds;
	public ModifyDefaultLevelRequest() {
		super("Sddp", "2019-01-03", "ModifyDefaultLevel", "sddp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getDefaultId() {
		return this.defaultId;
	}

	public void setDefaultId(Long defaultId) {
		this.defaultId = defaultId;
		if(defaultId != null){
			putQueryParameter("DefaultId", defaultId.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getSensitiveIds() {
		return this.sensitiveIds;
	}

	public void setSensitiveIds(String sensitiveIds) {
		this.sensitiveIds = sensitiveIds;
		if(sensitiveIds != null){
			putQueryParameter("SensitiveIds", sensitiveIds);
		}
	}

	@Override
	public Class<ModifyDefaultLevelResponse> getResponseClass() {
		return ModifyDefaultLevelResponse.class;
	}

}
