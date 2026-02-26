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

package com.aliyuncs.csas.model.v20230120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.ListClientUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClientUsersResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private Long totalNum;

		private List<DataListItem> dataList;

		public Long getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Long totalNum) {
			this.totalNum = totalNum;
		}

		public List<DataListItem> getDataList() {
			return this.dataList;
		}

		public void setDataList(List<DataListItem> dataList) {
			this.dataList = dataList;
		}

		public static class DataListItem {

			private String id;

			private String idpConfigId;

			private String username;

			private String userId;

			private String description;

			private String email;

			private String mobileNumber;

			private String departmentId;

			private String status;

			private Department department;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getIdpConfigId() {
				return this.idpConfigId;
			}

			public void setIdpConfigId(String idpConfigId) {
				this.idpConfigId = idpConfigId;
			}

			public String getUsername() {
				return this.username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getMobileNumber() {
				return this.mobileNumber;
			}

			public void setMobileNumber(String mobileNumber) {
				this.mobileNumber = mobileNumber;
			}

			public String getDepartmentId() {
				return this.departmentId;
			}

			public void setDepartmentId(String departmentId) {
				this.departmentId = departmentId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Department getDepartment() {
				return this.department;
			}

			public void setDepartment(Department department) {
				this.department = department;
			}

			public static class Department {

				private String id;

				private String name;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public ListClientUsersResponse getInstance(UnmarshallerContext context) {
		return	ListClientUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
