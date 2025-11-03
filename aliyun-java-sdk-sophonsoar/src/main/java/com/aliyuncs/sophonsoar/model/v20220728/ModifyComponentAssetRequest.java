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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyComponentAssetRequest extends RpcAcsRequest<ModifyComponentAssetResponse> {
	   

	private String lang;

	private String assetConfig;
	public ModifyComponentAssetRequest() {
		super("sophonsoar", "2022-07-28", "ModifyComponentAsset");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public String getAssetConfig() {
		return this.assetConfig;
	}

	public void setAssetConfig(String assetConfig) {
		this.assetConfig = assetConfig;
		if(assetConfig != null){
			putQueryParameter("AssetConfig", assetConfig);
		}
	}

	@Override
	public Class<ModifyComponentAssetResponse> getResponseClass() {
		return ModifyComponentAssetResponse.class;
	}

}
