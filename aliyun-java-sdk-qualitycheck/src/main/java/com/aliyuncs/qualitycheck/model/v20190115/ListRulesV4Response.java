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
import com.aliyuncs.qualitycheck.transform.v20190115.ListRulesV4ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRulesV4Response extends AcsResponse {

	private Integer totalCount;

	private Integer businessType;

	private Integer count;

	private Integer currentPage;

	private Integer pageSize;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<DataItem> data;

	private List<String> messages;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public List<String> getMessages() {
		return this.messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public static class DataItem {

		private Long rid;

		private String name;

		private Integer type;

		private Integer status;

		private Long checkNumber;

		private Long hitNumber;

		private Float hitRate;

		private Float reviewAccuracyRate;

		private Float reviewRate;

		private Long preReviewNumber;

		private Long reviewNumber;

		private Long unReviewNumber;

		private Long problemNumber;

		private String startTime;

		private String endTime;

		private String createTime;

		private String createEmpid;

		private String createEmpName;

		private String lastUpdateEmpid;

		private String lastUpdateEmpName;

		private String lastUpdateTime;

		private Integer isDelete;

		private String typeName;

		private String jobName;

		private String comments;

		private Integer realViolationNumber;

		private Float hitRealViolationRate;

		private String reviewStatusName;

		private Integer deny;

		private Long scoreSubId;

		private Integer autoReview;

		private Integer ruleScoreType;

		private String userGroup;

		private Integer operationMode;

		private Boolean isSelect;

		private Integer ruleType;

		private Integer effective;

		private Integer fullCycle;

		private String effectiveStartTime;

		private String effectiveEndTime;

		private Integer qualityCheckType;

		private Object graphFlow;

		private Integer ruleScoreSingleType;

		private Integer targetType;

		private List<BusinessCategoryBasicInfoListItem> businessCategoryBasicInfoList;

		private List<Integer> businessRange;

		private List<String> businessCategoryNameList;

		public Long getRid() {
			return this.rid;
		}

		public void setRid(Long rid) {
			this.rid = rid;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getCheckNumber() {
			return this.checkNumber;
		}

		public void setCheckNumber(Long checkNumber) {
			this.checkNumber = checkNumber;
		}

		public Long getHitNumber() {
			return this.hitNumber;
		}

		public void setHitNumber(Long hitNumber) {
			this.hitNumber = hitNumber;
		}

		public Float getHitRate() {
			return this.hitRate;
		}

		public void setHitRate(Float hitRate) {
			this.hitRate = hitRate;
		}

		public Float getReviewAccuracyRate() {
			return this.reviewAccuracyRate;
		}

		public void setReviewAccuracyRate(Float reviewAccuracyRate) {
			this.reviewAccuracyRate = reviewAccuracyRate;
		}

		public Float getReviewRate() {
			return this.reviewRate;
		}

		public void setReviewRate(Float reviewRate) {
			this.reviewRate = reviewRate;
		}

		public Long getPreReviewNumber() {
			return this.preReviewNumber;
		}

		public void setPreReviewNumber(Long preReviewNumber) {
			this.preReviewNumber = preReviewNumber;
		}

		public Long getReviewNumber() {
			return this.reviewNumber;
		}

		public void setReviewNumber(Long reviewNumber) {
			this.reviewNumber = reviewNumber;
		}

		public Long getUnReviewNumber() {
			return this.unReviewNumber;
		}

		public void setUnReviewNumber(Long unReviewNumber) {
			this.unReviewNumber = unReviewNumber;
		}

		public Long getProblemNumber() {
			return this.problemNumber;
		}

		public void setProblemNumber(Long problemNumber) {
			this.problemNumber = problemNumber;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
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

		public String getCreateEmpName() {
			return this.createEmpName;
		}

		public void setCreateEmpName(String createEmpName) {
			this.createEmpName = createEmpName;
		}

		public String getLastUpdateEmpid() {
			return this.lastUpdateEmpid;
		}

		public void setLastUpdateEmpid(String lastUpdateEmpid) {
			this.lastUpdateEmpid = lastUpdateEmpid;
		}

		public String getLastUpdateEmpName() {
			return this.lastUpdateEmpName;
		}

		public void setLastUpdateEmpName(String lastUpdateEmpName) {
			this.lastUpdateEmpName = lastUpdateEmpName;
		}

		public String getLastUpdateTime() {
			return this.lastUpdateTime;
		}

		public void setLastUpdateTime(String lastUpdateTime) {
			this.lastUpdateTime = lastUpdateTime;
		}

		public Integer getIsDelete() {
			return this.isDelete;
		}

		public void setIsDelete(Integer isDelete) {
			this.isDelete = isDelete;
		}

		public String getTypeName() {
			return this.typeName;
		}

		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getComments() {
			return this.comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		public Integer getRealViolationNumber() {
			return this.realViolationNumber;
		}

		public void setRealViolationNumber(Integer realViolationNumber) {
			this.realViolationNumber = realViolationNumber;
		}

		public Float getHitRealViolationRate() {
			return this.hitRealViolationRate;
		}

		public void setHitRealViolationRate(Float hitRealViolationRate) {
			this.hitRealViolationRate = hitRealViolationRate;
		}

		public String getReviewStatusName() {
			return this.reviewStatusName;
		}

		public void setReviewStatusName(String reviewStatusName) {
			this.reviewStatusName = reviewStatusName;
		}

		public Integer getDeny() {
			return this.deny;
		}

		public void setDeny(Integer deny) {
			this.deny = deny;
		}

		public Long getScoreSubId() {
			return this.scoreSubId;
		}

		public void setScoreSubId(Long scoreSubId) {
			this.scoreSubId = scoreSubId;
		}

		public Integer getAutoReview() {
			return this.autoReview;
		}

		public void setAutoReview(Integer autoReview) {
			this.autoReview = autoReview;
		}

		public Integer getRuleScoreType() {
			return this.ruleScoreType;
		}

		public void setRuleScoreType(Integer ruleScoreType) {
			this.ruleScoreType = ruleScoreType;
		}

		public String getUserGroup() {
			return this.userGroup;
		}

		public void setUserGroup(String userGroup) {
			this.userGroup = userGroup;
		}

		public Integer getOperationMode() {
			return this.operationMode;
		}

		public void setOperationMode(Integer operationMode) {
			this.operationMode = operationMode;
		}

		public Boolean getIsSelect() {
			return this.isSelect;
		}

		public void setIsSelect(Boolean isSelect) {
			this.isSelect = isSelect;
		}

		public Integer getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(Integer ruleType) {
			this.ruleType = ruleType;
		}

		public Integer getEffective() {
			return this.effective;
		}

		public void setEffective(Integer effective) {
			this.effective = effective;
		}

		public Integer getFullCycle() {
			return this.fullCycle;
		}

		public void setFullCycle(Integer fullCycle) {
			this.fullCycle = fullCycle;
		}

		public String getEffectiveStartTime() {
			return this.effectiveStartTime;
		}

		public void setEffectiveStartTime(String effectiveStartTime) {
			this.effectiveStartTime = effectiveStartTime;
		}

		public String getEffectiveEndTime() {
			return this.effectiveEndTime;
		}

		public void setEffectiveEndTime(String effectiveEndTime) {
			this.effectiveEndTime = effectiveEndTime;
		}

		public Integer getQualityCheckType() {
			return this.qualityCheckType;
		}

		public void setQualityCheckType(Integer qualityCheckType) {
			this.qualityCheckType = qualityCheckType;
		}

		public Object getGraphFlow() {
			return this.graphFlow;
		}

		public void setGraphFlow(Object graphFlow) {
			this.graphFlow = graphFlow;
		}

		public Integer getRuleScoreSingleType() {
			return this.ruleScoreSingleType;
		}

		public void setRuleScoreSingleType(Integer ruleScoreSingleType) {
			this.ruleScoreSingleType = ruleScoreSingleType;
		}

		public Integer getTargetType() {
			return this.targetType;
		}

		public void setTargetType(Integer targetType) {
			this.targetType = targetType;
		}

		public List<BusinessCategoryBasicInfoListItem> getBusinessCategoryBasicInfoList() {
			return this.businessCategoryBasicInfoList;
		}

		public void setBusinessCategoryBasicInfoList(List<BusinessCategoryBasicInfoListItem> businessCategoryBasicInfoList) {
			this.businessCategoryBasicInfoList = businessCategoryBasicInfoList;
		}

		public List<Integer> getBusinessRange() {
			return this.businessRange;
		}

		public void setBusinessRange(List<Integer> businessRange) {
			this.businessRange = businessRange;
		}

		public List<String> getBusinessCategoryNameList() {
			return this.businessCategoryNameList;
		}

		public void setBusinessCategoryNameList(List<String> businessCategoryNameList) {
			this.businessCategoryNameList = businessCategoryNameList;
		}

		public static class BusinessCategoryBasicInfoListItem {

			private Integer bid;

			private Integer serviceType;

			private String name;

			private Long originalId;

			public Integer getBid() {
				return this.bid;
			}

			public void setBid(Integer bid) {
				this.bid = bid;
			}

			public Integer getServiceType() {
				return this.serviceType;
			}

			public void setServiceType(Integer serviceType) {
				this.serviceType = serviceType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getOriginalId() {
				return this.originalId;
			}

			public void setOriginalId(Long originalId) {
				this.originalId = originalId;
			}
		}
	}

	@Override
	public ListRulesV4Response getInstance(UnmarshallerContext context) {
		return	ListRulesV4ResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
