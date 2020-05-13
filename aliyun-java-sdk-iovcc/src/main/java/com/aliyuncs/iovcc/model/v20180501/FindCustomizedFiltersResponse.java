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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.FindCustomizedFiltersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindCustomizedFiltersResponse extends AcsResponse {

	private String requestId;

	private CustomizedFilterList customizedFilterList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public CustomizedFilterList getCustomizedFilterList() {
		return this.customizedFilterList;
	}

	public void setCustomizedFilterList(CustomizedFilterList customizedFilterList) {
		this.customizedFilterList = customizedFilterList;
	}

	public static class CustomizedFilterList {

		private Integer totalCount;

		private List<ItemsItem> items;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<ItemsItem> getItems() {
			return this.items;
		}

		public void setItems(List<ItemsItem> items) {
			this.items = items;
		}

		public static class ItemsItem {

			private Long id;

			private String name;

			private String value;

			private String valueCompareType;

			private String blackWhiteType;

			private String gmtCreate;

			private String gmtModify;

			private Long gmtCreateTimestamp;

			private Long gmtModifyTimestamp;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getValueCompareType() {
				return this.valueCompareType;
			}

			public void setValueCompareType(String valueCompareType) {
				this.valueCompareType = valueCompareType;
			}

			public String getBlackWhiteType() {
				return this.blackWhiteType;
			}

			public void setBlackWhiteType(String blackWhiteType) {
				this.blackWhiteType = blackWhiteType;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModify() {
				return this.gmtModify;
			}

			public void setGmtModify(String gmtModify) {
				this.gmtModify = gmtModify;
			}

			public Long getGmtCreateTimestamp() {
				return this.gmtCreateTimestamp;
			}

			public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
				this.gmtCreateTimestamp = gmtCreateTimestamp;
			}

			public Long getGmtModifyTimestamp() {
				return this.gmtModifyTimestamp;
			}

			public void setGmtModifyTimestamp(Long gmtModifyTimestamp) {
				this.gmtModifyTimestamp = gmtModifyTimestamp;
			}
		}
	}

	@Override
	public FindCustomizedFiltersResponse getInstance(UnmarshallerContext context) {
		return	FindCustomizedFiltersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
