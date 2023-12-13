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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.ListAllProdsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAllProdsResponse extends AcsResponse {

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

		private Integer totalCount;

		private Integer pageSize;

		private Integer currentPage;

		private List<ProdListItem> prodList;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public List<ProdListItem> getProdList() {
			return this.prodList;
		}

		public void setProdList(List<ProdListItem> prodList) {
			this.prodList = prodList;
		}

		public static class ProdListItem {

			private String prodCode;

			private Integer totalLogCount;

			private Integer importedLogCount;

			private String modifyTime;

			private String cloudCode;

			public String getProdCode() {
				return this.prodCode;
			}

			public void setProdCode(String prodCode) {
				this.prodCode = prodCode;
			}

			public Integer getTotalLogCount() {
				return this.totalLogCount;
			}

			public void setTotalLogCount(Integer totalLogCount) {
				this.totalLogCount = totalLogCount;
			}

			public Integer getImportedLogCount() {
				return this.importedLogCount;
			}

			public void setImportedLogCount(Integer importedLogCount) {
				this.importedLogCount = importedLogCount;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public String getCloudCode() {
				return this.cloudCode;
			}

			public void setCloudCode(String cloudCode) {
				this.cloudCode = cloudCode;
			}
		}
	}

	@Override
	public ListAllProdsResponse getInstance(UnmarshallerContext context) {
		return	ListAllProdsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
