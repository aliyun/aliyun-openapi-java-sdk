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
public class CreateOrUpdateJoinRuleRequest extends RpcAcsRequest<CreateOrUpdateJoinRuleResponse> {
	
	public CreateOrUpdateJoinRuleRequest() {
		super("aegis", "2016-11-11", "CreateOrUpdateJoinRule", "vipaegis");
	}

	private String warnLevel;

	private Long dataSourceId2;

	private Long dataSourceId1;

	private Long timeWindow;

	private String description;

	private String ruleName;

	private String expression2;

	private String expression1;

	private String statisticsRules;

	private String joinRelation;

	private Long ruleId;

	private String actions;

	public String getWarnLevel() {
		return this.warnLevel;
	}

	public void setWarnLevel(String warnLevel) {
		this.warnLevel = warnLevel;
		if(warnLevel != null){
			putQueryParameter("WarnLevel", warnLevel);
		}
	}

	public Long getDataSourceId2() {
		return this.dataSourceId2;
	}

	public void setDataSourceId2(Long dataSourceId2) {
		this.dataSourceId2 = dataSourceId2;
		if(dataSourceId2 != null){
			putQueryParameter("DataSourceId2", dataSourceId2.toString());
		}
	}

	public Long getDataSourceId1() {
		return this.dataSourceId1;
	}

	public void setDataSourceId1(Long dataSourceId1) {
		this.dataSourceId1 = dataSourceId1;
		if(dataSourceId1 != null){
			putQueryParameter("DataSourceId1", dataSourceId1.toString());
		}
	}

	public Long getTimeWindow() {
		return this.timeWindow;
	}

	public void setTimeWindow(Long timeWindow) {
		this.timeWindow = timeWindow;
		if(timeWindow != null){
			putQueryParameter("TimeWindow", timeWindow.toString());
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

	public String getExpression2() {
		return this.expression2;
	}

	public void setExpression2(String expression2) {
		this.expression2 = expression2;
		if(expression2 != null){
			putQueryParameter("Expression2", expression2);
		}
	}

	public String getExpression1() {
		return this.expression1;
	}

	public void setExpression1(String expression1) {
		this.expression1 = expression1;
		if(expression1 != null){
			putQueryParameter("Expression1", expression1);
		}
	}

	public String getStatisticsRules() {
		return this.statisticsRules;
	}

	public void setStatisticsRules(String statisticsRules) {
		this.statisticsRules = statisticsRules;
		if(statisticsRules != null){
			putQueryParameter("StatisticsRules", statisticsRules);
		}
	}

	public String getJoinRelation() {
		return this.joinRelation;
	}

	public void setJoinRelation(String joinRelation) {
		this.joinRelation = joinRelation;
		if(joinRelation != null){
			putQueryParameter("JoinRelation", joinRelation);
		}
	}

	public Long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId.toString());
		}
	}

	public String getActions() {
		return this.actions;
	}

	public void setActions(String actions) {
		this.actions = actions;
		if(actions != null){
			putQueryParameter("Actions", actions);
		}
	}

	@Override
	public Class<CreateOrUpdateJoinRuleResponse> getResponseClass() {
		return CreateOrUpdateJoinRuleResponse.class;
	}

}
