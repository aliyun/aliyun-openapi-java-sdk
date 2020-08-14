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

package com.aliyuncs.idrsservice.model.v20200630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.idrsservice.transform.v20200630.GetStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStatisticsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

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

		private List<ItemsItem> items;

		public List<ItemsItem> getItems() {
			return this.items;
		}

		public void setItems(List<ItemsItem> items) {
			this.items = items;
		}

		public static class ItemsItem {

			private Long clientCount;

			private Long cloudCount;

			private String departmentName;

			private String month;

			private List<DetailItem> detail;

			public Long getClientCount() {
				return this.clientCount;
			}

			public void setClientCount(Long clientCount) {
				this.clientCount = clientCount;
			}

			public Long getCloudCount() {
				return this.cloudCount;
			}

			public void setCloudCount(Long cloudCount) {
				this.cloudCount = cloudCount;
			}

			public String getDepartmentName() {
				return this.departmentName;
			}

			public void setDepartmentName(String departmentName) {
				this.departmentName = departmentName;
			}

			public String getMonth() {
				return this.month;
			}

			public void setMonth(String month) {
				this.month = month;
			}

			public List<DetailItem> getDetail() {
				return this.detail;
			}

			public void setDetail(List<DetailItem> detail) {
				this.detail = detail;
			}

			public static class DetailItem {

				private Long clientCount;

				private Long cloudCount;

				private String departmentId;

				private String departmentName;

				private Integer month;

				public Long getClientCount() {
					return this.clientCount;
				}

				public void setClientCount(Long clientCount) {
					this.clientCount = clientCount;
				}

				public Long getCloudCount() {
					return this.cloudCount;
				}

				public void setCloudCount(Long cloudCount) {
					this.cloudCount = cloudCount;
				}

				public String getDepartmentId() {
					return this.departmentId;
				}

				public void setDepartmentId(String departmentId) {
					this.departmentId = departmentId;
				}

				public String getDepartmentName() {
					return this.departmentName;
				}

				public void setDepartmentName(String departmentName) {
					this.departmentName = departmentName;
				}

				public Integer getMonth() {
					return this.month;
				}

				public void setMonth(Integer month) {
					this.month = month;
				}
			}
		}
	}

	@Override
	public GetStatisticsResponse getInstance(UnmarshallerContext context) {
		return	GetStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
