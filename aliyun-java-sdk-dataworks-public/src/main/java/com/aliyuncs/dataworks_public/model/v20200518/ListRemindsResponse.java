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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListRemindsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRemindsResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private String errorMessage;

	private String errorCode;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<RemindsItem> reminds;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
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

		public List<RemindsItem> getReminds() {
			return this.reminds;
		}

		public void setReminds(List<RemindsItem> reminds) {
			this.reminds = reminds;
		}

		public static class RemindsItem {

			private String founder;

			private Long remindId;

			private String alertUnit;

			private String remindType;

			private String dndEnd;

			private String dndStart;

			private String remindUnit;

			private Boolean useflag;

			private String remindName;

			private List<String> alertTargets;

			private List<Long> nodeIds;

			private List<Long> bizProcessIds;

			private List<Long> projectIds;

			private List<Long> baselineIds;

			private List<String> alertMethods;

			public String getFounder() {
				return this.founder;
			}

			public void setFounder(String founder) {
				this.founder = founder;
			}

			public Long getRemindId() {
				return this.remindId;
			}

			public void setRemindId(Long remindId) {
				this.remindId = remindId;
			}

			public String getAlertUnit() {
				return this.alertUnit;
			}

			public void setAlertUnit(String alertUnit) {
				this.alertUnit = alertUnit;
			}

			public String getRemindType() {
				return this.remindType;
			}

			public void setRemindType(String remindType) {
				this.remindType = remindType;
			}

			public String getDndEnd() {
				return this.dndEnd;
			}

			public void setDndEnd(String dndEnd) {
				this.dndEnd = dndEnd;
			}

			public String getDndStart() {
				return this.dndStart;
			}

			public void setDndStart(String dndStart) {
				this.dndStart = dndStart;
			}

			public String getRemindUnit() {
				return this.remindUnit;
			}

			public void setRemindUnit(String remindUnit) {
				this.remindUnit = remindUnit;
			}

			public Boolean getUseflag() {
				return this.useflag;
			}

			public void setUseflag(Boolean useflag) {
				this.useflag = useflag;
			}

			public String getRemindName() {
				return this.remindName;
			}

			public void setRemindName(String remindName) {
				this.remindName = remindName;
			}

			public List<String> getAlertTargets() {
				return this.alertTargets;
			}

			public void setAlertTargets(List<String> alertTargets) {
				this.alertTargets = alertTargets;
			}

			public List<Long> getNodeIds() {
				return this.nodeIds;
			}

			public void setNodeIds(List<Long> nodeIds) {
				this.nodeIds = nodeIds;
			}

			public List<Long> getBizProcessIds() {
				return this.bizProcessIds;
			}

			public void setBizProcessIds(List<Long> bizProcessIds) {
				this.bizProcessIds = bizProcessIds;
			}

			public List<Long> getProjectIds() {
				return this.projectIds;
			}

			public void setProjectIds(List<Long> projectIds) {
				this.projectIds = projectIds;
			}

			public List<Long> getBaselineIds() {
				return this.baselineIds;
			}

			public void setBaselineIds(List<Long> baselineIds) {
				this.baselineIds = baselineIds;
			}

			public List<String> getAlertMethods() {
				return this.alertMethods;
			}

			public void setAlertMethods(List<String> alertMethods) {
				this.alertMethods = alertMethods;
			}
		}
	}

	@Override
	public ListRemindsResponse getInstance(UnmarshallerContext context) {
		return	ListRemindsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
