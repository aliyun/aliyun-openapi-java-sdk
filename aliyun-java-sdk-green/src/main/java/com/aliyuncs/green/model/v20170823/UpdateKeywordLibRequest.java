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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateKeywordLibRequest extends RpcAcsRequest<UpdateKeywordLibResponse> {
	
	public UpdateKeywordLibRequest() {
		super("Green", "2017-08-23", "UpdateKeywordLib", "green");
	}

	private String sourceIp;

	private Boolean enable;

	private String name;

	private String bizTypes;

	private Integer id;

	private String lang;

	private String matchMode;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
		if(enable != null){
			putQueryParameter("Enable", enable.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getBizTypes() {
		return this.bizTypes;
	}

	public void setBizTypes(String bizTypes) {
		this.bizTypes = bizTypes;
		if(bizTypes != null){
			putQueryParameter("BizTypes", bizTypes);
		}
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
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

	public String getMatchMode() {
		return this.matchMode;
	}

	public void setMatchMode(String matchMode) {
		this.matchMode = matchMode;
		if(matchMode != null){
			putQueryParameter("MatchMode", matchMode);
		}
	}

	@Override
	public Class<UpdateKeywordLibResponse> getResponseClass() {
		return UpdateKeywordLibResponse.class;
	}

}
