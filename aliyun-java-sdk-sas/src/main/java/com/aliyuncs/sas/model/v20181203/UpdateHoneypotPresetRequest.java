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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateHoneypotPresetRequest extends RpcAcsRequest<UpdateHoneypotPresetResponse> {
	   

	private String lang;

	private String honeypotPresetId;

	private String presetName;

	private String meta;

	private String honeypotImageName;
	public UpdateHoneypotPresetRequest() {
		super("Sas", "2018-12-03", "UpdateHoneypotPreset", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getHoneypotPresetId() {
		return this.honeypotPresetId;
	}

	public void setHoneypotPresetId(String honeypotPresetId) {
		this.honeypotPresetId = honeypotPresetId;
		if(honeypotPresetId != null){
			putQueryParameter("HoneypotPresetId", honeypotPresetId);
		}
	}

	public String getPresetName() {
		return this.presetName;
	}

	public void setPresetName(String presetName) {
		this.presetName = presetName;
		if(presetName != null){
			putQueryParameter("PresetName", presetName);
		}
	}

	public String getMeta() {
		return this.meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
		if(meta != null){
			putQueryParameter("Meta", meta);
		}
	}

	public String getHoneypotImageName() {
		return this.honeypotImageName;
	}

	public void setHoneypotImageName(String honeypotImageName) {
		this.honeypotImageName = honeypotImageName;
		if(honeypotImageName != null){
			putQueryParameter("HoneypotImageName", honeypotImageName);
		}
	}

	@Override
	public Class<UpdateHoneypotPresetResponse> getResponseClass() {
		return UpdateHoneypotPresetResponse.class;
	}

}
