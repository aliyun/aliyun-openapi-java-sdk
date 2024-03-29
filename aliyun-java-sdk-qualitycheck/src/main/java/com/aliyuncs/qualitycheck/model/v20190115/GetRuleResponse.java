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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.GetRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRuleResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<RuleInfo> rules;

		public List<RuleInfo> getRules() {
			return this.rules;
		}

		public void setRules(List<RuleInfo> rules) {
			this.rules = rules;
		}

		public static class RuleInfo {

			private Integer status;

			private Integer type;

			private Integer scoreSubId;

			private Integer isOnline;

			private String createTime;

			private String createEmpid;

			private String lastUpdateEmpid;

			private Integer isDelete;

			private String rid;

			private Integer ruleScoreType;

			private String endTime;

			private String weight;

			private String startTime;

			private String ruleLambda;

			private String scoreSubName;

			private Integer autoReview;

			private String comments;

			private String lastUpdateTime;

			private String scoreName;

			private String name;

			private Integer scoreId;

			private List<String> businessCategoryNameList;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
			}

			public Integer getScoreSubId() {
				return this.scoreSubId;
			}

			public void setScoreSubId(Integer scoreSubId) {
				this.scoreSubId = scoreSubId;
			}

			public Integer getIsOnline() {
				return this.isOnline;
			}

			public void setIsOnline(Integer isOnline) {
				this.isOnline = isOnline;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getCreateEmpid() {
				return this.createEmpid;
			}

			public void setCreateEmpid(String createEmpid) {
				this.createEmpid = createEmpid;
			}

			public String getLastUpdateEmpid() {
				return this.lastUpdateEmpid;
			}

			public void setLastUpdateEmpid(String lastUpdateEmpid) {
				this.lastUpdateEmpid = lastUpdateEmpid;
			}

			public Integer getIsDelete() {
				return this.isDelete;
			}

			public void setIsDelete(Integer isDelete) {
				this.isDelete = isDelete;
			}

			public String getRid() {
				return this.rid;
			}

			public void setRid(String rid) {
				this.rid = rid;
			}

			public Integer getRuleScoreType() {
				return this.ruleScoreType;
			}

			public void setRuleScoreType(Integer ruleScoreType) {
				this.ruleScoreType = ruleScoreType;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getWeight() {
				return this.weight;
			}

			public void setWeight(String weight) {
				this.weight = weight;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getRuleLambda() {
				return this.ruleLambda;
			}

			public void setRuleLambda(String ruleLambda) {
				this.ruleLambda = ruleLambda;
			}

			public String getScoreSubName() {
				return this.scoreSubName;
			}

			public void setScoreSubName(String scoreSubName) {
				this.scoreSubName = scoreSubName;
			}

			public Integer getAutoReview() {
				return this.autoReview;
			}

			public void setAutoReview(Integer autoReview) {
				this.autoReview = autoReview;
			}

			public String getComments() {
				return this.comments;
			}

			public void setComments(String comments) {
				this.comments = comments;
			}

			public String getLastUpdateTime() {
				return this.lastUpdateTime;
			}

			public void setLastUpdateTime(String lastUpdateTime) {
				this.lastUpdateTime = lastUpdateTime;
			}

			public String getScoreName() {
				return this.scoreName;
			}

			public void setScoreName(String scoreName) {
				this.scoreName = scoreName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getScoreId() {
				return this.scoreId;
			}

			public void setScoreId(Integer scoreId) {
				this.scoreId = scoreId;
			}

			public List<String> getBusinessCategoryNameList() {
				return this.businessCategoryNameList;
			}

			public void setBusinessCategoryNameList(List<String> businessCategoryNameList) {
				this.businessCategoryNameList = businessCategoryNameList;
			}
		}
	}

	@Override
	public GetRuleResponse getInstance(UnmarshallerContext context) {
		return	GetRuleResponseUnmarshaller.unmarshall(this, context);
	}
}
