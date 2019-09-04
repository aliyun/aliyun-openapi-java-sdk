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
import com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424.PubGetDQCQualityByEntityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PubGetDQCQualityByEntityResponse extends AcsResponse {

	private String returnCode;

	private Integer count;

	private List<EntityQuality> returnValue;

	public String getReturnCode() {
		return this.returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<EntityQuality> getReturnValue() {
		return this.returnValue;
	}

	public void setReturnValue(List<EntityQuality> returnValue) {
		this.returnValue = returnValue;
	}

	public static class EntityQuality {

		private Integer id;

		private String taskId;

		private Integer entityId;

		private Integer ruleId;

		private String property;

		private String bizdate;

		private String dateType;

		private String actualExpression;

		private String matchExpression;

		private Integer blockType;

		private Integer checkResult;

		private Integer checkResultStatus;

		private String methodName;

		private String comment;

		private String beginTime;

		private String endTime;

		private String timeConsuming;

		private Boolean discrete;

		private Integer checkerType;

		private String ruleName;

		private Boolean isPrediction;

		private String checkerName;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Integer getEntityId() {
			return this.entityId;
		}

		public void setEntityId(Integer entityId) {
			this.entityId = entityId;
		}

		public Integer getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Integer ruleId) {
			this.ruleId = ruleId;
		}

		public String getProperty() {
			return this.property;
		}

		public void setProperty(String property) {
			this.property = property;
		}

		public String getBizdate() {
			return this.bizdate;
		}

		public void setBizdate(String bizdate) {
			this.bizdate = bizdate;
		}

		public String getDateType() {
			return this.dateType;
		}

		public void setDateType(String dateType) {
			this.dateType = dateType;
		}

		public String getActualExpression() {
			return this.actualExpression;
		}

		public void setActualExpression(String actualExpression) {
			this.actualExpression = actualExpression;
		}

		public String getMatchExpression() {
			return this.matchExpression;
		}

		public void setMatchExpression(String matchExpression) {
			this.matchExpression = matchExpression;
		}

		public Integer getBlockType() {
			return this.blockType;
		}

		public void setBlockType(Integer blockType) {
			this.blockType = blockType;
		}

		public Integer getCheckResult() {
			return this.checkResult;
		}

		public void setCheckResult(Integer checkResult) {
			this.checkResult = checkResult;
		}

		public Integer getCheckResultStatus() {
			return this.checkResultStatus;
		}

		public void setCheckResultStatus(Integer checkResultStatus) {
			this.checkResultStatus = checkResultStatus;
		}

		public String getMethodName() {
			return this.methodName;
		}

		public void setMethodName(String methodName) {
			this.methodName = methodName;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(String beginTime) {
			this.beginTime = beginTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getTimeConsuming() {
			return this.timeConsuming;
		}

		public void setTimeConsuming(String timeConsuming) {
			this.timeConsuming = timeConsuming;
		}

		public Boolean getDiscrete() {
			return this.discrete;
		}

		public void setDiscrete(Boolean discrete) {
			this.discrete = discrete;
		}

		public Integer getCheckerType() {
			return this.checkerType;
		}

		public void setCheckerType(Integer checkerType) {
			this.checkerType = checkerType;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public Boolean getIsPrediction() {
			return this.isPrediction;
		}

		public void setIsPrediction(Boolean isPrediction) {
			this.isPrediction = isPrediction;
		}

		public String getCheckerName() {
			return this.checkerName;
		}

		public void setCheckerName(String checkerName) {
			this.checkerName = checkerName;
		}
	}

	@Override
	public PubGetDQCQualityByEntityResponse getInstance(UnmarshallerContext context) {
		return	PubGetDQCQualityByEntityResponseUnmarshaller.unmarshall(this, context);
	}
}
