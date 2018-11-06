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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateRuleRequest extends RpcAcsRequest<CreateOrUpdateRuleResponse> {
	
	public CreateOrUpdateRuleRequest() {
		super("aegis", "2016-11-11", "CreateOrUpdateRule", "vipaegis");
	}

	private String warnLevel;

	private String sourceIp;

	private Long dataSourceId;

	private String description;

	private String ruleName;

	private Long id;

	private String lang;

	private String expressions;

	private String ruleGroupIds;

	public String getWarnLevel() {
		return this.warnLevel;
	}

	public void setWarnLevel(String warnLevel) {
		this.warnLevel = warnLevel;
		if(warnLevel != null){
			putQueryParameter("WarnLevel", warnLevel);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Long getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(Long dataSourceId) {
		this.dataSourceId = dataSourceId;
		if(dataSourceId != null){
			putQueryParameter("DataSourceId", dataSourceId.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
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

	public String getExpressions() {
		return this.expressions;
	}

	public void setExpressions(String expressions) {
		this.expressions = expressions;
		if(expressions != null){
			putQueryParameter("Expressions", expressions);
		}
	}

	public String getRuleGroupIds() {
		return this.ruleGroupIds;
	}

	public void setRuleGroupIds(String ruleGroupIds) {
		this.ruleGroupIds = ruleGroupIds;
		if(ruleGroupIds != null){
			putQueryParameter("RuleGroupIds", ruleGroupIds);
		}
	}

	@Override
	public Class<CreateOrUpdateRuleResponse> getResponseClass() {
		return CreateOrUpdateRuleResponse.class;
	}

}
