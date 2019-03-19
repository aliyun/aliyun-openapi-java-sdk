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

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer pageSize;

	private Integer dataSize;

	private Integer totalCount;

	private Integer reviewStatus;

	private Integer totalSubTaskCount;

	private Integer compSubTaskCount;

	private Integer currentPage;

	private List<RuleCountInfo> data;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getDataSize() {
		return this.dataSize;
	}

	public void setDataSize(Integer dataSize) {
		this.dataSize = dataSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getReviewStatus() {
		return this.reviewStatus;
	}

	public void setReviewStatus(Integer reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	public Integer getTotalSubTaskCount() {
		return this.totalSubTaskCount;
	}

	public void setTotalSubTaskCount(Integer totalSubTaskCount) {
		this.totalSubTaskCount = totalSubTaskCount;
	}

	public Integer getCompSubTaskCount() {
		return this.compSubTaskCount;
	}

	public void setCompSubTaskCount(Integer compSubTaskCount) {
		this.compSubTaskCount = compSubTaskCount;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public List<RuleCountInfo> getData() {
		return this.data;
	}

	public void setData(List<RuleCountInfo> data) {
		this.data = data;
	}

	public static class RuleCountInfo {

		private Integer checkNumber;

		private String createEmpid;

		private Long createTime;

		private Integer hitNumber;

		private Float hitRate;

		private Float hitRealViolationRate;

		private Integer isDelete;

		private String lastUpdateEmpid;

		private Long lastUpdateTime;

		private String name;

		private Integer preReviewNumber;

		private Integer realViolationNumber;

		private Integer reviewNumber;

		private String rid;

		private Boolean select;

		private Integer status;

		private Integer type;

		private String typeName;

		public Integer getCheckNumber() {
			return this.checkNumber;
		}

		public void setCheckNumber(Integer checkNumber) {
			this.checkNumber = checkNumber;
		}

		public String getCreateEmpid() {
			return this.createEmpid;
		}

		public void setCreateEmpid(String createEmpid) {
			this.createEmpid = createEmpid;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Integer getHitNumber() {
			return this.hitNumber;
		}

		public void setHitNumber(Integer hitNumber) {
			this.hitNumber = hitNumber;
		}

		public Float getHitRate() {
			return this.hitRate;
		}

		public void setHitRate(Float hitRate) {
			this.hitRate = hitRate;
		}

		public Float getHitRealViolationRate() {
			return this.hitRealViolationRate;
		}

		public void setHitRealViolationRate(Float hitRealViolationRate) {
			this.hitRealViolationRate = hitRealViolationRate;
		}

		public Integer getIsDelete() {
			return this.isDelete;
		}

		public void setIsDelete(Integer isDelete) {
			this.isDelete = isDelete;
		}

		public String getLastUpdateEmpid() {
			return this.lastUpdateEmpid;
		}

		public void setLastUpdateEmpid(String lastUpdateEmpid) {
			this.lastUpdateEmpid = lastUpdateEmpid;
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

		public Integer getPreReviewNumber() {
			return this.preReviewNumber;
		}

		public void setPreReviewNumber(Integer preReviewNumber) {
			this.preReviewNumber = preReviewNumber;
		}

		public Integer getRealViolationNumber() {
			return this.realViolationNumber;
		}

		public void setRealViolationNumber(Integer realViolationNumber) {
			this.realViolationNumber = realViolationNumber;
		}

		public Integer getReviewNumber() {
			return this.reviewNumber;
		}

		public void setReviewNumber(Integer reviewNumber) {
			this.reviewNumber = reviewNumber;
		}

		public String getRid() {
			return this.rid;
		}

		public void setRid(String rid) {
			this.rid = rid;
		}

		public Boolean getSelect() {
			return this.select;
		}

		public void setSelect(Boolean select) {
			this.select = select;
		}

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

		public String getTypeName() {
			return this.typeName;
		}

		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}
	}

	@Override
	public GetTaskRuleListResponse getInstance(UnmarshallerContext context) {
		return	GetTaskRuleListResponseUnmarshaller.unmarshall(this, context);
	}
}
