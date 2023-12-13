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
import com.aliyuncs.cloud_siem.transform.v20220616.ListQuickQueryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQuickQueryResponse extends AcsResponse {

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

		private Integer total;

		private Integer count;

		private List<QuickQueryListItem> quickQueryList;

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

		public List<QuickQueryListItem> getQuickQueryList() {
			return this.quickQueryList;
		}

		public void setQuickQueryList(List<QuickQueryListItem> quickQueryList) {
			this.quickQueryList = quickQueryList;
		}

		public static class QuickQueryListItem {

			private String query;

			private String searchName;

			private String displayName;

			public String getQuery() {
				return this.query;
			}

			public void setQuery(String query) {
				this.query = query;
			}

			public String getSearchName() {
				return this.searchName;
			}

			public void setSearchName(String searchName) {
				this.searchName = searchName;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}
		}
	}

	@Override
	public ListQuickQueryResponse getInstance(UnmarshallerContext context) {
		return	ListQuickQueryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
