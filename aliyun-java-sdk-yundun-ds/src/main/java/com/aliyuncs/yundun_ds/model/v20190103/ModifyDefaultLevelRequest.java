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

package com.aliyuncs.yundun_ds.model.v20190103;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyDefaultLevelRequest extends RpcAcsRequest<ModifyDefaultLevelResponse> {
	
	public ModifyDefaultLevelRequest() {
		super("Yundun-ds", "2019-01-03", "ModifyDefaultLevel", "sddp");
	}

	private Integer featureType;

	private Long defaultId;

	private String lang;

	private String sensitiveIds;

	public Integer getFeatureType() {
		return this.featureType;
	}

	public void setFeatureType(Integer featureType) {
		this.featureType = featureType;
		if(featureType != null){
			putQueryParameter("FeatureType", featureType.toString());
		}
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
