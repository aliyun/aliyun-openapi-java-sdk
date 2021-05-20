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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cccxspaceinner.transform.v20191227.QueryServicerByPageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryServicerByPageResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer total;

		private Integer count;

		private Integer pageNum;

		private Long page;

		private List<ResultsItem> results;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Long getPage() {
			return this.page;
		}

		public void setPage(Long page) {
			this.page = page;
		}

		public List<ResultsItem> getResults() {
			return this.results;
		}

		public void setResults(List<ResultsItem> results) {
			this.results = results;
		}

		public static class ResultsItem {

			private Long servicerId;

			private Integer servicerType;

			private Integer userStatus;

			private Integer userType;

			private Long departmentId;

			private Long buId;

			private String realName;

			private String showName;

			private List<GroupsItem> groups;

			public Long getServicerId() {
				return this.servicerId;
			}

			public void setServicerId(Long servicerId) {
				this.servicerId = servicerId;
			}

			public Integer getServicerType() {
				return this.servicerType;
			}

			public void setServicerType(Integer servicerType) {
				this.servicerType = servicerType;
			}

			public Integer getUserStatus() {
				return this.userStatus;
			}

			public void setUserStatus(Integer userStatus) {
				this.userStatus = userStatus;
			}

			public Integer getUserType() {
				return this.userType;
			}

			public void setUserType(Integer userType) {
				this.userType = userType;
			}

			public Long getDepartmentId() {
				return this.departmentId;
			}

			public void setDepartmentId(Long departmentId) {
				this.departmentId = departmentId;
			}

			public Long getBuId() {
				return this.buId;
			}

			public void setBuId(Long buId) {
				this.buId = buId;
			}

			public String getRealName() {
				return this.realName;
			}

			public void setRealName(String realName) {
				this.realName = realName;
			}

			public String getShowName() {
				return this.showName;
			}

			public void setShowName(String showName) {
				this.showName = showName;
			}

			public List<GroupsItem> getGroups() {
				return this.groups;
			}

			public void setGroups(List<GroupsItem> groups) {
				this.groups = groups;
			}

			public static class GroupsItem {

				private Long groupId;

				private Integer skillType;

				private Long departmentId;

				private String description;

				private String showName;

				private String groupName;

				private Integer status;

				private Boolean supportCase;

				private Boolean supportPhone;

				private Boolean supportIm;

				public Long getGroupId() {
					return this.groupId;
				}

				public void setGroupId(Long groupId) {
					this.groupId = groupId;
				}

				public Integer getSkillType() {
					return this.skillType;
				}

				public void setSkillType(Integer skillType) {
					this.skillType = skillType;
				}

				public Long getDepartmentId() {
					return this.departmentId;
				}

				public void setDepartmentId(Long departmentId) {
					this.departmentId = departmentId;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getShowName() {
					return this.showName;
				}

				public void setShowName(String showName) {
					this.showName = showName;
				}

				public String getGroupName() {
					return this.groupName;
				}

				public void setGroupName(String groupName) {
					this.groupName = groupName;
				}

				public Integer getStatus() {
					return this.status;
				}

				public void setStatus(Integer status) {
					this.status = status;
				}

				public Boolean getSupportCase() {
					return this.supportCase;
				}

				public void setSupportCase(Boolean supportCase) {
					this.supportCase = supportCase;
				}

				public Boolean getSupportPhone() {
					return this.supportPhone;
				}

				public void setSupportPhone(Boolean supportPhone) {
					this.supportPhone = supportPhone;
				}

				public Boolean getSupportIm() {
					return this.supportIm;
				}

				public void setSupportIm(Boolean supportIm) {
					this.supportIm = supportIm;
				}
			}
		}
	}

	@Override
	public QueryServicerByPageResponse getInstance(UnmarshallerContext context) {
		return	QueryServicerByPageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
