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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.ListPhoneTagsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPhoneTagsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private PhoneNumbers phoneNumbers;

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

	public PhoneNumbers getPhoneNumbers() {
		return this.phoneNumbers;
	}

	public void setPhoneNumbers(PhoneNumbers phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public static class PhoneNumbers {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<PhoneNumber> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
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

		public List<PhoneNumber> getList() {
			return this.list;
		}

		public void setList(List<PhoneNumber> list) {
			this.list = list;
		}

		public static class PhoneNumber {

			private String phoneNumberId;

			private String instanceId;

			private String number;

			private String phoneNumberDescription;

			private String usage;

			private String province;

			private String city;

			private Integer type;

			private Integer concurrency;

			private String serviceTag;

			private String provider;

			private Long createTime;

			private String contactFlowId;

			private List<String> skillGroupIdList;

			public String getPhoneNumberId() {
				return this.phoneNumberId;
			}

			public void setPhoneNumberId(String phoneNumberId) {
				this.phoneNumberId = phoneNumberId;
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

			public String getPhoneNumberDescription() {
				return this.phoneNumberDescription;
			}

			public void setPhoneNumberDescription(String phoneNumberDescription) {
				this.phoneNumberDescription = phoneNumberDescription;
			}

			public String getUsage() {
				return this.usage;
			}

			public void setUsage(String usage) {
				this.usage = usage;
			}

			public String getProvince() {
				return this.province;
			}

			public void setProvince(String province) {
				this.province = province;
			}

			public String getCity() {
				return this.city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
			}

			public Integer getConcurrency() {
				return this.concurrency;
			}

			public void setConcurrency(Integer concurrency) {
				this.concurrency = concurrency;
			}

			public String getServiceTag() {
				return this.serviceTag;
			}

			public void setServiceTag(String serviceTag) {
				this.serviceTag = serviceTag;
			}

			public String getProvider() {
				return this.provider;
			}

			public void setProvider(String provider) {
				this.provider = provider;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public String getContactFlowId() {
				return this.contactFlowId;
			}

			public void setContactFlowId(String contactFlowId) {
				this.contactFlowId = contactFlowId;
			}

			public List<String> getSkillGroupIdList() {
				return this.skillGroupIdList;
			}

			public void setSkillGroupIdList(List<String> skillGroupIdList) {
				this.skillGroupIdList = skillGroupIdList;
			}
		}
	}

	@Override
	public ListPhoneTagsResponse getInstance(UnmarshallerContext context) {
		return	ListPhoneTagsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
