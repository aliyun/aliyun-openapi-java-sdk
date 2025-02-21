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

package com.aliyuncs.brain_industrial.model.v20200920;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.brain_industrial.transform.v20200920.ListLicensesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLicensesResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private String message;

	private Integer pageSize;

	private Integer currentPage;

	private String totalPage;

	private String totalPageCount;

	private String code;

	private Boolean success;

	private Integer httpStatusCode;

	private String accessDeniedDetail;

	private List<License> licenseList;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public String getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}

	public String getTotalPageCount() {
		return this.totalPageCount;
	}

	public void setTotalPageCount(String totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public List<License> getLicenseList() {
		return this.licenseList;
	}

	public void setLicenseList(List<License> licenseList) {
		this.licenseList = licenseList;
	}

	public static class License {

		private String id;

		private String licenseSpecName;

		private String licenseSpecType;

		private String licenseSpecCode;

		private String buyTime;

		private String activateTime;

		private String effectTime;

		private String expireTime;

		private String duration;

		private Integer adaptiveMachine;

		private String status;

		private Integer memoryLimit;

		private String instanceId;

		private String description;

		private String allDuration;

		private Integer cpuLimit;

		private String unActivateAllDuration;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getLicenseSpecName() {
			return this.licenseSpecName;
		}

		public void setLicenseSpecName(String licenseSpecName) {
			this.licenseSpecName = licenseSpecName;
		}

		public String getLicenseSpecType() {
			return this.licenseSpecType;
		}

		public void setLicenseSpecType(String licenseSpecType) {
			this.licenseSpecType = licenseSpecType;
		}

		public String getLicenseSpecCode() {
			return this.licenseSpecCode;
		}

		public void setLicenseSpecCode(String licenseSpecCode) {
			this.licenseSpecCode = licenseSpecCode;
		}

		public String getBuyTime() {
			return this.buyTime;
		}

		public void setBuyTime(String buyTime) {
			this.buyTime = buyTime;
		}

		public String getActivateTime() {
			return this.activateTime;
		}

		public void setActivateTime(String activateTime) {
			this.activateTime = activateTime;
		}

		public String getEffectTime() {
			return this.effectTime;
		}

		public void setEffectTime(String effectTime) {
			this.effectTime = effectTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public Integer getAdaptiveMachine() {
			return this.adaptiveMachine;
		}

		public void setAdaptiveMachine(Integer adaptiveMachine) {
			this.adaptiveMachine = adaptiveMachine;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getMemoryLimit() {
			return this.memoryLimit;
		}

		public void setMemoryLimit(Integer memoryLimit) {
			this.memoryLimit = memoryLimit;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAllDuration() {
			return this.allDuration;
		}

		public void setAllDuration(String allDuration) {
			this.allDuration = allDuration;
		}

		public Integer getCpuLimit() {
			return this.cpuLimit;
		}

		public void setCpuLimit(Integer cpuLimit) {
			this.cpuLimit = cpuLimit;
		}

		public String getUnActivateAllDuration() {
			return this.unActivateAllDuration;
		}

		public void setUnActivateAllDuration(String unActivateAllDuration) {
			this.unActivateAllDuration = unActivateAllDuration;
		}
	}

	@Override
	public ListLicensesResponse getInstance(UnmarshallerContext context) {
		return	ListLicensesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
