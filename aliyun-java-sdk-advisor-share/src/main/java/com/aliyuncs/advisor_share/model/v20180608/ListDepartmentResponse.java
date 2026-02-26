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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.ListDepartmentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDepartmentResponse extends AcsResponse {

	private Boolean success;

	private Data data;

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

		private Long total;

		private Long pageNumber;

		private Long pageSize;

		private List<DataListItem> dataList;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public List<DataListItem> getDataList() {
			return this.dataList;
		}

		public void setDataList(List<DataListItem> dataList) {
			this.dataList = dataList;
		}

		public static class DataListItem {

			private String departmentName;

			private String departmentId;

			public String getDepartmentName() {
				return this.departmentName;
			}

			public void setDepartmentName(String departmentName) {
				this.departmentName = departmentName;
			}

			public String getDepartmentId() {
				return this.departmentId;
			}

			public void setDepartmentId(String departmentId) {
				this.departmentId = departmentId;
			}
		}
	}

	@Override
	public ListDepartmentResponse getInstance(UnmarshallerContext context) {
		return	ListDepartmentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
