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

package com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PubUpdateDQCRuleRequest extends RpcAcsRequest<PubUpdateDQCRuleResponse> {
	
	public PubUpdateDQCRuleRequest() {
		super("dataworks-enterprise-ultimate", "2019-04-24", "PubUpdateDQCRule");
		setMethod(MethodType.POST);
	}

	private String projectName;

	private String trend;

	private Integer ruleType;

	private Integer blockType;

	private String propertyType;

	private Long entityId;

	private Integer checker;

	private Integer templateId;

	private String expectValue;

	private String operator;

	private String whereCondition;

	private String criticalThreshold;

	private String property;

	private String comment;

	private Long id;

	private String warningThreshold;

	private String methodName;

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putBodyParameter("ProjectName", projectName);
		}
	}

	public String getTrend() {
		return this.trend;
	}

	public void setTrend(String trend) {
		this.trend = trend;
		if(trend != null){
			putBodyParameter("Trend", trend);
		}
	}

	public Integer getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(Integer ruleType) {
		this.ruleType = ruleType;
		if(ruleType != null){
			putBodyParameter("RuleType", ruleType.toString());
		}
	}

	public Integer getBlockType() {
		return this.blockType;
	}

	public void setBlockType(Integer blockType) {
		this.blockType = blockType;
		if(blockType != null){
			putBodyParameter("BlockType", blockType.toString());
		}
	}

	public String getPropertyType() {
		return this.propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
		if(propertyType != null){
			putBodyParameter("PropertyType", propertyType);
		}
	}

	public Long getEntityId() {
		return this.entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
		if(entityId != null){
			putBodyParameter("EntityId", entityId.toString());
		}
	}

	public Integer getChecker() {
		return this.checker;
	}

	public void setChecker(Integer checker) {
		this.checker = checker;
		if(checker != null){
			putBodyParameter("Checker", checker.toString());
		}
	}

	public Integer getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId.toString());
		}
	}

	public String getExpectValue() {
		return this.expectValue;
	}

	public void setExpectValue(String expectValue) {
		this.expectValue = expectValue;
		if(expectValue != null){
			putBodyParameter("ExpectValue", expectValue);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putBodyParameter("Operator", operator);
		}
	}

	public String getWhereCondition() {
		return this.whereCondition;
	}

	public void setWhereCondition(String whereCondition) {
		this.whereCondition = whereCondition;
		if(whereCondition != null){
			putBodyParameter("WhereCondition", whereCondition);
		}
	}

	public String getCriticalThreshold() {
		return this.criticalThreshold;
	}

	public void setCriticalThreshold(String criticalThreshold) {
		this.criticalThreshold = criticalThreshold;
		if(criticalThreshold != null){
			putBodyParameter("CriticalThreshold", criticalThreshold);
		}
	}

	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
		if(property != null){
			putBodyParameter("Property", property);
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putBodyParameter("Comment", comment);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getWarningThreshold() {
		return this.warningThreshold;
	}

	public void setWarningThreshold(String warningThreshold) {
		this.warningThreshold = warningThreshold;
		if(warningThreshold != null){
			putBodyParameter("WarningThreshold", warningThreshold);
		}
	}

	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
		if(methodName != null){
			putBodyParameter("MethodName", methodName);
		}
	}

	@Override
	public Class<PubUpdateDQCRuleResponse> getResponseClass() {
		return PubUpdateDQCRuleResponse.class;
	}

}
