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

package com.aliyuncs.emas_dmp.model.v20210402;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emas_dmp.transform.v20210402.ListAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppResponse extends AcsResponse {

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

		private Integer pageNum;

		private Integer pageSize;

		private Integer totalPages;

		private Integer totalElements;

		private List<Apps> appList;

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalPages() {
			return this.totalPages;
		}

		public void setTotalPages(Integer totalPages) {
			this.totalPages = totalPages;
		}

		public Integer getTotalElements() {
			return this.totalElements;
		}

		public void setTotalElements(Integer totalElements) {
			this.totalElements = totalElements;
		}

		public List<Apps> getAppList() {
			return this.appList;
		}

		public void setAppList(List<Apps> appList) {
			this.appList = appList;
		}

		public static class Apps {

			private String name;

			private String usageRange;

			private String _package;

			private String parentType;

			private String source;

			private List<String> subType;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getUsageRange() {
				return this.usageRange;
			}

			public void setUsageRange(String usageRange) {
				this.usageRange = usageRange;
			}

			public String get_Package() {
				return this._package;
			}

			public void set_Package(String _package) {
				this._package = _package;
			}

			public String getParentType() {
				return this.parentType;
			}

			public void setParentType(String parentType) {
				this.parentType = parentType;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public List<String> getSubType() {
				return this.subType;
			}

			public void setSubType(List<String> subType) {
				this.subType = subType;
			}
		}
	}

	@Override
	public ListAppResponse getInstance(UnmarshallerContext context) {
		return	ListAppResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
