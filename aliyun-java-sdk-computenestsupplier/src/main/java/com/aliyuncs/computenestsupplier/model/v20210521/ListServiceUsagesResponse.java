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

package com.aliyuncs.computenestsupplier.model.v20210521;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.computenestsupplier.transform.v20210521.ListServiceUsagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServiceUsagesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private Integer totalCount;

	private List<Policy> serviceUsages;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Policy> getServiceUsages() {
		return this.serviceUsages;
	}

	public void setServiceUsages(List<Policy> serviceUsages) {
		this.serviceUsages = serviceUsages;
	}

	public static class Policy {

		private Long userAliUid;

		private String serviceId;

		private String serviceName;

		private String supplierName;

		private String status;

		private String comments;

		private String createTime;

		private String updateTime;

		private UserInformation userInformation;

		public Long getUserAliUid() {
			return this.userAliUid;
		}

		public void setUserAliUid(Long userAliUid) {
			this.userAliUid = userAliUid;
		}

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getSupplierName() {
			return this.supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getComments() {
			return this.comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public UserInformation getUserInformation() {
			return this.userInformation;
		}

		public void setUserInformation(UserInformation userInformation) {
			this.userInformation = userInformation;
		}

		public static class UserInformation {

			private String name;

			private String emailAddress;

			private String company;

			private String country;

			private String telephone;

			private String title;

			private String industry;

			private String source;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getEmailAddress() {
				return this.emailAddress;
			}

			public void setEmailAddress(String emailAddress) {
				this.emailAddress = emailAddress;
			}

			public String getCompany() {
				return this.company;
			}

			public void setCompany(String company) {
				this.company = company;
			}

			public String getCountry() {
				return this.country;
			}

			public void setCountry(String country) {
				this.country = country;
			}

			public String getTelephone() {
				return this.telephone;
			}

			public void setTelephone(String telephone) {
				this.telephone = telephone;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getIndustry() {
				return this.industry;
			}

			public void setIndustry(String industry) {
				this.industry = industry;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}
		}
	}

	@Override
	public ListServiceUsagesResponse getInstance(UnmarshallerContext context) {
		return	ListServiceUsagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
