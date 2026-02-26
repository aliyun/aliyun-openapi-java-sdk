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

package com.aliyuncs.opensearch.model.v20171225;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.ListUserAnalyzersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserAnalyzersResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<ResultItem> result;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Integer created;

		private Boolean available;

		private String name;

		private Integer updated;

		private String id;

		private String business;

		private List<DictsItem> dicts;

		public Integer getCreated() {
			return this.created;
		}

		public void setCreated(Integer created) {
			this.created = created;
		}

		public Boolean getAvailable() {
			return this.available;
		}

		public void setAvailable(Boolean available) {
			this.available = available;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getUpdated() {
			return this.updated;
		}

		public void setUpdated(Integer updated) {
			this.updated = updated;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getBusiness() {
			return this.business;
		}

		public void setBusiness(String business) {
			this.business = business;
		}

		public List<DictsItem> getDicts() {
			return this.dicts;
		}

		public void setDicts(List<DictsItem> dicts) {
			this.dicts = dicts;
		}

		public static class DictsItem {

			private Integer created;

			private Integer entriesCount;

			private String type;

			private Integer entriesLimit;

			private Boolean available;

			private Integer updated;

			private String id;

			public Integer getCreated() {
				return this.created;
			}

			public void setCreated(Integer created) {
				this.created = created;
			}

			public Integer getEntriesCount() {
				return this.entriesCount;
			}

			public void setEntriesCount(Integer entriesCount) {
				this.entriesCount = entriesCount;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Integer getEntriesLimit() {
				return this.entriesLimit;
			}

			public void setEntriesLimit(Integer entriesLimit) {
				this.entriesLimit = entriesLimit;
			}

			public Boolean getAvailable() {
				return this.available;
			}

			public void setAvailable(Boolean available) {
				this.available = available;
			}

			public Integer getUpdated() {
				return this.updated;
			}

			public void setUpdated(Integer updated) {
				this.updated = updated;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	@Override
	public ListUserAnalyzersResponse getInstance(UnmarshallerContext context) {
		return	ListUserAnalyzersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
