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

/**
 * @author auto create
 * @version 
 */
public class CreateRuleRequest extends RpcAcsRequest<CreateRuleResponse> {
	
	public CreateRuleRequest() {
		super("Sddp", "2019-01-03", "CreateRule", "sddp");
	}

	private Integer featureType;

	private String name;

	private Long riskLevelId;

	private String lang;

	private Long customType;

	private Integer category;

	private String content;

	public Integer getFeatureType() {
		return this.featureType;
	}

	public void setFeatureType(Integer featureType) {
		this.featureType = featureType;
		if(featureType != null){
			putQueryParameter("FeatureType", featureType.toString());
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

	public Long getRiskLevelId() {
		return this.riskLevelId;
	}

	public void setRiskLevelId(Long riskLevelId) {
		this.riskLevelId = riskLevelId;
		if(riskLevelId != null){
			putQueryParameter("RiskLevelId", riskLevelId.toString());
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

	public Long getCustomType() {
		return this.customType;
	}

	public void setCustomType(Long customType) {
		this.customType = customType;
		if(customType != null){
			putQueryParameter("CustomType", customType.toString());
		}
	}

	public Integer getCategory() {
		return this.category;
	}

	public void setCategory(Integer category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category.toString());
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	@Override
	public Class<CreateRuleResponse> getResponseClass() {
		return CreateRuleResponse.class;
	}

}
