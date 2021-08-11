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

package com.aliyuncs.aiccs.model.v20191015;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.QueryOutboundTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOutboundTaskResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String httpStatusCode;

	private String code;

	private String success;

	private Data data;

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

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String totalResults;

		private String currentPage;

		private String pageSize;

		private List<ListItem> list;

		public String getTotalResults() {
			return this.totalResults;
		}

		public void setTotalResults(String totalResults) {
			this.totalResults = totalResults;
		}

		public String getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(String currentPage) {
			this.currentPage = currentPage;
		}

		public String getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(String pageSize) {
			this.pageSize = pageSize;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private Integer status;

			private Integer type;

			private String endDate;

			private Integer retryTime;

			private Integer retryInterval;

			private String startDate;

			private Long gmtModified;

			private String creator;

			private String endTime;

			private String startTime;

			private Integer model;

			private Long buId;

			private String modifier;

			private String groupName;

			private String description;

			private Long departmentId;

			private Long gmtCreate;

			private Long skillGroup;

			private String name;

			private String extAttrs;

			private String callerNum;

			private Long id;

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

			public String getEndDate() {
				return this.endDate;
			}

			public void setEndDate(String endDate) {
				this.endDate = endDate;
			}

			public Integer getRetryTime() {
				return this.retryTime;
			}

			public void setRetryTime(Integer retryTime) {
				this.retryTime = retryTime;
			}

			public Integer getRetryInterval() {
				return this.retryInterval;
			}

			public void setRetryInterval(Integer retryInterval) {
				this.retryInterval = retryInterval;
			}

			public String getStartDate() {
				return this.startDate;
			}

			public void setStartDate(String startDate) {
				this.startDate = startDate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public Integer getModel() {
				return this.model;
			}

			public void setModel(Integer model) {
				this.model = model;
			}

			public Long getBuId() {
				return this.buId;
			}

			public void setBuId(Long buId) {
				this.buId = buId;
			}

			public String getModifier() {
				return this.modifier;
			}

			public void setModifier(String modifier) {
				this.modifier = modifier;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Long getDepartmentId() {
				return this.departmentId;
			}

			public void setDepartmentId(Long departmentId) {
				this.departmentId = departmentId;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getSkillGroup() {
				return this.skillGroup;
			}

			public void setSkillGroup(Long skillGroup) {
				this.skillGroup = skillGroup;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getExtAttrs() {
				return this.extAttrs;
			}

			public void setExtAttrs(String extAttrs) {
				this.extAttrs = extAttrs;
			}

			public String getCallerNum() {
				return this.callerNum;
			}

			public void setCallerNum(String callerNum) {
				this.callerNum = callerNum;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}
	}

	@Override
	public QueryOutboundTaskResponse getInstance(UnmarshallerContext context) {
		return	QueryOutboundTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
