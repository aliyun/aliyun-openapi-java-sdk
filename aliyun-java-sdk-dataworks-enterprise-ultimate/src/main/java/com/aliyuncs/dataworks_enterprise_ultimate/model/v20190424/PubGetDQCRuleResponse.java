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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424.PubGetDQCRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PubGetDQCRuleResponse extends AcsResponse {

	private String returnCode;

	private ReturnValue returnValue;

	public String getReturnCode() {
		return this.returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public ReturnValue getReturnValue() {
		return this.returnValue;
	}

	public void setReturnValue(ReturnValue returnValue) {
		this.returnValue = returnValue;
	}

	public static class ReturnValue {

		private List<TemplateRule> templateRules;

		private List<SelfserviceRule> selfserviceRules;

		public List<TemplateRule> getTemplateRules() {
			return this.templateRules;
		}

		public void setTemplateRules(List<TemplateRule> templateRules) {
			this.templateRules = templateRules;
		}

		public List<SelfserviceRule> getSelfserviceRules() {
			return this.selfserviceRules;
		}

		public void setSelfserviceRules(List<SelfserviceRule> selfserviceRules) {
			this.selfserviceRules = selfserviceRules;
		}

		public static class TemplateRule {

			private String projectName;

			private String tableName;

			private Integer id;

			private Integer entityId;

			private String property;

			private Integer methodId;

			private String methodName;

			private String onDuty;

			private Integer ruleType;

			private Integer blockType;

			private Integer templateId;

			private String templateName;

			private Integer ruleCheckerRelationId;

			private Integer checkerId;

			private Boolean fixCheck;

			private String trend;

			private String warningThreshold;

			private String criticalThreshold;

			private String historyWarningThreshold;

			private String historyCriticalThreshold;

			private String propertyKey;

			private String matchExpression;

			private String comment;

			private String expectValue;

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public Integer getEntityId() {
				return this.entityId;
			}

			public void setEntityId(Integer entityId) {
				this.entityId = entityId;
			}

			public String getProperty() {
				return this.property;
			}

			public void setProperty(String property) {
				this.property = property;
			}

			public Integer getMethodId() {
				return this.methodId;
			}

			public void setMethodId(Integer methodId) {
				this.methodId = methodId;
			}

			public String getMethodName() {
				return this.methodName;
			}

			public void setMethodName(String methodName) {
				this.methodName = methodName;
			}

			public String getOnDuty() {
				return this.onDuty;
			}

			public void setOnDuty(String onDuty) {
				this.onDuty = onDuty;
			}

			public Integer getRuleType() {
				return this.ruleType;
			}

			public void setRuleType(Integer ruleType) {
				this.ruleType = ruleType;
			}

			public Integer getBlockType() {
				return this.blockType;
			}

			public void setBlockType(Integer blockType) {
				this.blockType = blockType;
			}

			public Integer getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(Integer templateId) {
				this.templateId = templateId;
			}

			public String getTemplateName() {
				return this.templateName;
			}

			public void setTemplateName(String templateName) {
				this.templateName = templateName;
			}

			public Integer getRuleCheckerRelationId() {
				return this.ruleCheckerRelationId;
			}

			public void setRuleCheckerRelationId(Integer ruleCheckerRelationId) {
				this.ruleCheckerRelationId = ruleCheckerRelationId;
			}

			public Integer getCheckerId() {
				return this.checkerId;
			}

			public void setCheckerId(Integer checkerId) {
				this.checkerId = checkerId;
			}

			public Boolean getFixCheck() {
				return this.fixCheck;
			}

			public void setFixCheck(Boolean fixCheck) {
				this.fixCheck = fixCheck;
			}

			public String getTrend() {
				return this.trend;
			}

			public void setTrend(String trend) {
				this.trend = trend;
			}

			public String getWarningThreshold() {
				return this.warningThreshold;
			}

			public void setWarningThreshold(String warningThreshold) {
				this.warningThreshold = warningThreshold;
			}

			public String getCriticalThreshold() {
				return this.criticalThreshold;
			}

			public void setCriticalThreshold(String criticalThreshold) {
				this.criticalThreshold = criticalThreshold;
			}

			public String getHistoryWarningThreshold() {
				return this.historyWarningThreshold;
			}

			public void setHistoryWarningThreshold(String historyWarningThreshold) {
				this.historyWarningThreshold = historyWarningThreshold;
			}

			public String getHistoryCriticalThreshold() {
				return this.historyCriticalThreshold;
			}

			public void setHistoryCriticalThreshold(String historyCriticalThreshold) {
				this.historyCriticalThreshold = historyCriticalThreshold;
			}

			public String getPropertyKey() {
				return this.propertyKey;
			}

			public void setPropertyKey(String propertyKey) {
				this.propertyKey = propertyKey;
			}

			public String getMatchExpression() {
				return this.matchExpression;
			}

			public void setMatchExpression(String matchExpression) {
				this.matchExpression = matchExpression;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getExpectValue() {
				return this.expectValue;
			}

			public void setExpectValue(String expectValue) {
				this.expectValue = expectValue;
			}
		}

		public static class SelfserviceRule {

			private String projectName;

			private String tableName;

			private Integer id;

			private Integer entityId;

			private String property;

			private Integer methodId;

			private String methodName;

			private String whereCondition;

			private String onDuty;

			private Integer ruleType;

			private Integer blockType;

			private Integer ruleCheckerRelationId;

			private Integer checkerId;

			private Integer checker;

			private String checkerName;

			private Boolean fixCheck;

			private String trend;

			private Integer checkResult;

			private String warningThreshold;

			private String criticalThreshold;

			private String historyWarningThreshold;

			private String historyCriticalThreshold;

			private String historyActualThreshold;

			private String propertyKey;

			private String matchExpression;

			private String comment;

			private String expectValue;

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public Integer getEntityId() {
				return this.entityId;
			}

			public void setEntityId(Integer entityId) {
				this.entityId = entityId;
			}

			public String getProperty() {
				return this.property;
			}

			public void setProperty(String property) {
				this.property = property;
			}

			public Integer getMethodId() {
				return this.methodId;
			}

			public void setMethodId(Integer methodId) {
				this.methodId = methodId;
			}

			public String getMethodName() {
				return this.methodName;
			}

			public void setMethodName(String methodName) {
				this.methodName = methodName;
			}

			public String getWhereCondition() {
				return this.whereCondition;
			}

			public void setWhereCondition(String whereCondition) {
				this.whereCondition = whereCondition;
			}

			public String getOnDuty() {
				return this.onDuty;
			}

			public void setOnDuty(String onDuty) {
				this.onDuty = onDuty;
			}

			public Integer getRuleType() {
				return this.ruleType;
			}

			public void setRuleType(Integer ruleType) {
				this.ruleType = ruleType;
			}

			public Integer getBlockType() {
				return this.blockType;
			}

			public void setBlockType(Integer blockType) {
				this.blockType = blockType;
			}

			public Integer getRuleCheckerRelationId() {
				return this.ruleCheckerRelationId;
			}

			public void setRuleCheckerRelationId(Integer ruleCheckerRelationId) {
				this.ruleCheckerRelationId = ruleCheckerRelationId;
			}

			public Integer getCheckerId() {
				return this.checkerId;
			}

			public void setCheckerId(Integer checkerId) {
				this.checkerId = checkerId;
			}

			public Integer getChecker() {
				return this.checker;
			}

			public void setChecker(Integer checker) {
				this.checker = checker;
			}

			public String getCheckerName() {
				return this.checkerName;
			}

			public void setCheckerName(String checkerName) {
				this.checkerName = checkerName;
			}

			public Boolean getFixCheck() {
				return this.fixCheck;
			}

			public void setFixCheck(Boolean fixCheck) {
				this.fixCheck = fixCheck;
			}

			public String getTrend() {
				return this.trend;
			}

			public void setTrend(String trend) {
				this.trend = trend;
			}

			public Integer getCheckResult() {
				return this.checkResult;
			}

			public void setCheckResult(Integer checkResult) {
				this.checkResult = checkResult;
			}

			public String getWarningThreshold() {
				return this.warningThreshold;
			}

			public void setWarningThreshold(String warningThreshold) {
				this.warningThreshold = warningThreshold;
			}

			public String getCriticalThreshold() {
				return this.criticalThreshold;
			}

			public void setCriticalThreshold(String criticalThreshold) {
				this.criticalThreshold = criticalThreshold;
			}

			public String getHistoryWarningThreshold() {
				return this.historyWarningThreshold;
			}

			public void setHistoryWarningThreshold(String historyWarningThreshold) {
				this.historyWarningThreshold = historyWarningThreshold;
			}

			public String getHistoryCriticalThreshold() {
				return this.historyCriticalThreshold;
			}

			public void setHistoryCriticalThreshold(String historyCriticalThreshold) {
				this.historyCriticalThreshold = historyCriticalThreshold;
			}

			public String getHistoryActualThreshold() {
				return this.historyActualThreshold;
			}

			public void setHistoryActualThreshold(String historyActualThreshold) {
				this.historyActualThreshold = historyActualThreshold;
			}

			public String getPropertyKey() {
				return this.propertyKey;
			}

			public void setPropertyKey(String propertyKey) {
				this.propertyKey = propertyKey;
			}

			public String getMatchExpression() {
				return this.matchExpression;
			}

			public void setMatchExpression(String matchExpression) {
				this.matchExpression = matchExpression;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getExpectValue() {
				return this.expectValue;
			}

			public void setExpectValue(String expectValue) {
				this.expectValue = expectValue;
			}
		}
	}

	@Override
	public PubGetDQCRuleResponse getInstance(UnmarshallerContext context) {
		return	PubGetDQCRuleResponseUnmarshaller.unmarshall(this, context);
	}
}
