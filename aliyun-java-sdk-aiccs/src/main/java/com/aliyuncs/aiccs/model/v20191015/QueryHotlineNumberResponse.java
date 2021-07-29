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
import com.aliyuncs.aiccs.transform.v20191015.QueryHotlineNumberResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryHotlineNumberResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private Long currentPage;

		private Long pageSize;

		private List<HotlineNumberList> hotlineNumList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Long currentPage) {
			this.currentPage = currentPage;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public List<HotlineNumberList> getHotlineNumList() {
			return this.hotlineNumList;
		}

		public void setHotlineNumList(List<HotlineNumberList> hotlineNumList) {
			this.hotlineNumList = hotlineNumList;
		}

		public static class HotlineNumberList {

			private String hotlineNumber;

			private String description;

			private String location;

			private String sp;

			private Boolean inBoundEnabled;

			private Long flowId;

			private String flowName;

			private Boolean outboundEnabled;

			private Boolean calloutAllDepartment;

			private Integer evaluationStatus;

			private List<CalloutRangeListItem> calloutRangeList;

			public String getHotlineNumber() {
				return this.hotlineNumber;
			}

			public void setHotlineNumber(String hotlineNumber) {
				this.hotlineNumber = hotlineNumber;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getSp() {
				return this.sp;
			}

			public void setSp(String sp) {
				this.sp = sp;
			}

			public Boolean getInBoundEnabled() {
				return this.inBoundEnabled;
			}

			public void setInBoundEnabled(Boolean inBoundEnabled) {
				this.inBoundEnabled = inBoundEnabled;
			}

			public Long getFlowId() {
				return this.flowId;
			}

			public void setFlowId(Long flowId) {
				this.flowId = flowId;
			}

			public String getFlowName() {
				return this.flowName;
			}

			public void setFlowName(String flowName) {
				this.flowName = flowName;
			}

			public Boolean getOutboundEnabled() {
				return this.outboundEnabled;
			}

			public void setOutboundEnabled(Boolean outboundEnabled) {
				this.outboundEnabled = outboundEnabled;
			}

			public Boolean getCalloutAllDepartment() {
				return this.calloutAllDepartment;
			}

			public void setCalloutAllDepartment(Boolean calloutAllDepartment) {
				this.calloutAllDepartment = calloutAllDepartment;
			}

			public Integer getEvaluationStatus() {
				return this.evaluationStatus;
			}

			public void setEvaluationStatus(Integer evaluationStatus) {
				this.evaluationStatus = evaluationStatus;
			}

			public List<CalloutRangeListItem> getCalloutRangeList() {
				return this.calloutRangeList;
			}

			public void setCalloutRangeList(List<CalloutRangeListItem> calloutRangeList) {
				this.calloutRangeList = calloutRangeList;
			}

			public static class CalloutRangeListItem {

				private Long departmentId;

				private String departmentName;

				private List<GroupDOListItem> groupDOList;

				public Long getDepartmentId() {
					return this.departmentId;
				}

				public void setDepartmentId(Long departmentId) {
					this.departmentId = departmentId;
				}

				public String getDepartmentName() {
					return this.departmentName;
				}

				public void setDepartmentName(String departmentName) {
					this.departmentName = departmentName;
				}

				public List<GroupDOListItem> getGroupDOList() {
					return this.groupDOList;
				}

				public void setGroupDOList(List<GroupDOListItem> groupDOList) {
					this.groupDOList = groupDOList;
				}

				public static class GroupDOListItem {

					private Long groupId;

					private String groupName;

					public Long getGroupId() {
						return this.groupId;
					}

					public void setGroupId(Long groupId) {
						this.groupId = groupId;
					}

					public String getGroupName() {
						return this.groupName;
					}

					public void setGroupName(String groupName) {
						this.groupName = groupName;
					}
				}
			}
		}
	}

	@Override
	public QueryHotlineNumberResponse getInstance(UnmarshallerContext context) {
		return	QueryHotlineNumberResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
