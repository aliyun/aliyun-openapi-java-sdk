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
import com.aliyuncs.iovcc.transform.v20180501.DescribeDeviceValiditySchemaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeviceValiditySchemaResponse extends AcsResponse {

	private String requestId;

	private List<ItemListItem> itemList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ItemListItem> getItemList() {
		return this.itemList;
	}

	public void setItemList(List<ItemListItem> itemList) {
		this.itemList = itemList;
	}

	public static class ItemListItem {

		private String path;

		private String type;

		private String itemType;

		private String description;

		private String required;

		private Float maximum;

		private Float minimum;

		private Boolean exclusiveMaximum;

		private Boolean exclusiveMinimum;

		private String enumListStr;

		private Integer maxLength;

		private Integer minLength;

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getItemType() {
			return this.itemType;
		}

		public void setItemType(String itemType) {
			this.itemType = itemType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getRequired() {
			return this.required;
		}

		public void setRequired(String required) {
			this.required = required;
		}

		public Float getMaximum() {
			return this.maximum;
		}

		public void setMaximum(Float maximum) {
			this.maximum = maximum;
		}

		public Float getMinimum() {
			return this.minimum;
		}

		public void setMinimum(Float minimum) {
			this.minimum = minimum;
		}

		public Boolean getExclusiveMaximum() {
			return this.exclusiveMaximum;
		}

		public void setExclusiveMaximum(Boolean exclusiveMaximum) {
			this.exclusiveMaximum = exclusiveMaximum;
		}

		public Boolean getExclusiveMinimum() {
			return this.exclusiveMinimum;
		}

		public void setExclusiveMinimum(Boolean exclusiveMinimum) {
			this.exclusiveMinimum = exclusiveMinimum;
		}

		public String getEnumListStr() {
			return this.enumListStr;
		}

		public void setEnumListStr(String enumListStr) {
			this.enumListStr = enumListStr;
		}

		public Integer getMaxLength() {
			return this.maxLength;
		}

		public void setMaxLength(Integer maxLength) {
			this.maxLength = maxLength;
		}

		public Integer getMinLength() {
			return this.minLength;
		}

		public void setMinLength(Integer minLength) {
			this.minLength = minLength;
		}
	}

	@Override
	public DescribeDeviceValiditySchemaResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeviceValiditySchemaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
