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
import com.aliyuncs.qualitycheck.transform.v20190115.GetTaskRuleListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskRuleListResponse extends AcsResponse {

	private Integer currentPage;

	private Integer dataSize;

	private String requestId;

	private Boolean success;

	private Integer reviewStatus;

	private Integer compSubTaskCount;

	private String code;

	private Integer totalSubTaskCount;

	private String message;

	private Integer pageSize;

	private Integer totalCount;

	private List<RuleCountInfo> data;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getDataSize() {
		return this.dataSize;
	}

	public void setDataSize(Integer dataSize) {
		this.dataSize = dataSize;
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

	public Integer getReviewStatus() {
		return this.reviewStatus;
	}

	public void setReviewStatus(Integer reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	public Integer getCompSubTaskCount() {
		return this.compSubTaskCount;
	}

	public void setCompSubTaskCount(Integer compSubTaskCount) {
		this.compSubTaskCount = compSubTaskCount;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getTotalSubTaskCount() {
		return this.totalSubTaskCount;
	}

	public void setTotalSubTaskCount(Integer totalSubTaskCount) {
		this.totalSubTaskCount = totalSubTaskCount;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<RuleCountInfo> getData() {
		return this.data;
	}

	public void setData(List<RuleCountInfo> data) {
		this.data = data;
	}

	public static class RuleCountInfo {

		private Integer type;

		private Integer status;

		private Integer preReviewNumber;

		private Integer hitNumber;

		private Boolean select;

		private Long createTime;

		private String createEmpid;

		private Integer realViolationNumber;

		private String lastUpdateEmpid;

		private Integer isDelete;

		private Float hitRate;

		private String rid;

		private Integer checkNumber;

		private String typeName;

		private Long lastUpdateTime;

		private String name;

		private Float hitRealViolationRate;

		private Integer reviewNumber;

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

		public Integer getPreReviewNumber() {
			return this.preReviewNumber;
		}

		public void setPreReviewNumber(Integer preReviewNumber) {
			this.preReviewNumber = preReviewNumber;
		}

		public Integer getHitNumber() {
			return this.hitNumber;
		}

		public void setHitNumber(Integer hitNumber) {
			this.hitNumber = hitNumber;
		}

		public Boolean getSelect() {
			return this.select;
		}

		public void setSelect(Boolean select) {
			this.select = select;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getCreateEmpid() {
			return this.createEmpid;
		}

		public void setCreateEmpid(String createEmpid) {
			this.createEmpid = createEmpid;
		}

		public Integer getRealViolationNumber() {
			return this.realViolationNumber;
		}

		public void setRealViolationNumber(Integer realViolationNumber) {
			this.realViolationNumber = realViolationNumber;
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

		public Float getHitRate() {
			return this.hitRate;
		}

		public void setHitRate(Float hitRate) {
			this.hitRate = hitRate;
		}

		public String getRid() {
			return this.rid;
		}

		public void setRid(String rid) {
			this.rid = rid;
		}

		public Integer getCheckNumber() {
			return this.checkNumber;
		}

		public void setCheckNumber(Integer checkNumber) {
			this.checkNumber = checkNumber;
		}

		public String getTypeName() {
			return this.typeName;
		}

		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}

		public Long getLastUpdateTime() {
			return this.lastUpdateTime;
		}

		public void setLastUpdateTime(Long lastUpdateTime) {
			this.lastUpdateTime = lastUpdateTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Float getHitRealViolationRate() {
			return this.hitRealViolationRate;
		}

		public void setHitRealViolationRate(Float hitRealViolationRate) {
			this.hitRealViolationRate = hitRealViolationRate;
		}

		public Integer getReviewNumber() {
			return this.reviewNumber;
		}

		public void setReviewNumber(Integer reviewNumber) {
			this.reviewNumber = reviewNumber;
		}
	}

	@Override
	public GetTaskRuleListResponse getInstance(UnmarshallerContext context) {
		return	GetTaskRuleListResponseUnmarshaller.unmarshall(this, context);
	}
}
