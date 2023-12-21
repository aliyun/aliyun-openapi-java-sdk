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

package com.aliyuncs.pairecservice.model.v20221213;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.GetInstanceResourceTableResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceResourceTableResponse extends AcsResponse {

	private String requestId;

	private String tableName;

	private List<FieldsItem> fields;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<FieldsItem> getFields() {
		return this.fields;
	}

	public void setFields(List<FieldsItem> fields) {
		this.fields = fields;
	}

	public static class FieldsItem {

		private String name;

		private String type;

		private String meaning;

		private Boolean isDimensionField;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getMeaning() {
			return this.meaning;
		}

		public void setMeaning(String meaning) {
			this.meaning = meaning;
		}

		public Boolean getIsDimensionField() {
			return this.isDimensionField;
		}

		public void setIsDimensionField(Boolean isDimensionField) {
			this.isDimensionField = isDimensionField;
		}
	}

	@Override
	public GetInstanceResourceTableResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceResourceTableResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
