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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListPhoneNumbersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPhoneNumbersResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private List<PhoneNumber> list;

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

		public List<PhoneNumber> getList() {
			return this.list;
		}

		public void setList(List<PhoneNumber> list) {
			this.list = list;
		}

		public static class PhoneNumber {

			private Boolean active;

			private String city;

			private String contactFlowId;

			private String contactFlowName;

			private String instanceId;

			private String number;

			private String province;

			private String usage;

			private String userId;

			private String provider;

			private String tags;

			private String createTime;

			private List<SkillGroup> skillGroups;

			public Boolean getActive() {
				return this.active;
			}

			public void setActive(Boolean active) {
				this.active = active;
			}

			public String getCity() {
				return this.city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getContactFlowId() {
				return this.contactFlowId;
			}

			public void setContactFlowId(String contactFlowId) {
				this.contactFlowId = contactFlowId;
			}

			public String getContactFlowName() {
				return this.contactFlowName;
			}

			public void setContactFlowName(String contactFlowName) {
				this.contactFlowName = contactFlowName;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getNumber() {
				return this.number;
			}

			public void setNumber(String number) {
				this.number = number;
			}

			public String getProvince() {
				return this.province;
			}

			public void setProvince(String province) {
				this.province = province;
			}

			public String getUsage() {
				return this.usage;
			}

			public void setUsage(String usage) {
				this.usage = usage;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getProvider() {
				return this.provider;
			}

			public void setProvider(String provider) {
				this.provider = provider;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public List<SkillGroup> getSkillGroups() {
				return this.skillGroups;
			}

			public void setSkillGroups(List<SkillGroup> skillGroups) {
				this.skillGroups = skillGroups;
			}

			public static class SkillGroup {

				private String displayName;

				private String instanceId;

				private String name;

				private String skillGroupId;

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getSkillGroupId() {
					return this.skillGroupId;
				}

				public void setSkillGroupId(String skillGroupId) {
					this.skillGroupId = skillGroupId;
				}
			}
		}
	}

	@Override
	public ListPhoneNumbersResponse getInstance(UnmarshallerContext context) {
		return	ListPhoneNumbersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
