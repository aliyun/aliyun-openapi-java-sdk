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

package com.aliyuncs.uis.model.v20180821;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.uis.transform.v20180821.DescribeUisesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUisesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Uis> uises;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public List<Uis> getUises() {
		return this.uises;
	}

	public void setUises(List<Uis> uises) {
		this.uises = uises;
	}

	public static class Uis {

		private String uisId;

		private Long createTime;

		private String sslClientCertUrl;

		private String name;

		private String description;

		private String status;

		private List<String> uisNodeIds;

		private UserInfo userInfo;

		public String getUisId() {
			return this.uisId;
		}

		public void setUisId(String uisId) {
			this.uisId = uisId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getSslClientCertUrl() {
			return this.sslClientCertUrl;
		}

		public void setSslClientCertUrl(String sslClientCertUrl) {
			this.sslClientCertUrl = sslClientCertUrl;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<String> getUisNodeIds() {
			return this.uisNodeIds;
		}

		public void setUisNodeIds(List<String> uisNodeIds) {
			this.uisNodeIds = uisNodeIds;
		}

		public UserInfo getUserInfo() {
			return this.userInfo;
		}

		public void setUserInfo(UserInfo userInfo) {
			this.userInfo = userInfo;
		}

		public static class UserInfo {

			private String clientInfoDB;

			private String clientInfoDBAccount;

			private String clientInfoDBPassword;

			public String getClientInfoDB() {
				return this.clientInfoDB;
			}

			public void setClientInfoDB(String clientInfoDB) {
				this.clientInfoDB = clientInfoDB;
			}

			public String getClientInfoDBAccount() {
				return this.clientInfoDBAccount;
			}

			public void setClientInfoDBAccount(String clientInfoDBAccount) {
				this.clientInfoDBAccount = clientInfoDBAccount;
			}

			public String getClientInfoDBPassword() {
				return this.clientInfoDBPassword;
			}

			public void setClientInfoDBPassword(String clientInfoDBPassword) {
				this.clientInfoDBPassword = clientInfoDBPassword;
			}
		}
	}

	@Override
	public DescribeUisesResponse getInstance(UnmarshallerContext context) {
		return	DescribeUisesResponseUnmarshaller.unmarshall(this, context);
	}
}
