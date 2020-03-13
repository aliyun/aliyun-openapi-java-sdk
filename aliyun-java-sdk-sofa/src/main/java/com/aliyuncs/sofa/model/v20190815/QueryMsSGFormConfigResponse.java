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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryMsSGFormConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMsSGFormConfigResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private AuthRuleConfig authRuleConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public AuthRuleConfig getAuthRuleConfig() {
		return this.authRuleConfig;
	}

	public void setAuthRuleConfig(AuthRuleConfig authRuleConfig) {
		this.authRuleConfig = authRuleConfig;
	}

	public static class AuthRuleConfig {

		private List<FieldsItem> fields;

		private List<OperationsItem> operations;

		private List<TypesItem> types;

		public List<FieldsItem> getFields() {
			return this.fields;
		}

		public void setFields(List<FieldsItem> fields) {
			this.fields = fields;
		}

		public List<OperationsItem> getOperations() {
			return this.operations;
		}

		public void setOperations(List<OperationsItem> operations) {
			this.operations = operations;
		}

		public List<TypesItem> getTypes() {
			return this.types;
		}

		public void setTypes(List<TypesItem> types) {
			this.types = types;
		}

		public static class FieldsItem {

			private String descCn;

			private String descEn;

			private String value;

			public String getDescCn() {
				return this.descCn;
			}

			public void setDescCn(String descCn) {
				this.descCn = descCn;
			}

			public String getDescEn() {
				return this.descEn;
			}

			public void setDescEn(String descEn) {
				this.descEn = descEn;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class OperationsItem {

			private String descCn;

			private String descEn;

			private String value;

			public String getDescCn() {
				return this.descCn;
			}

			public void setDescCn(String descCn) {
				this.descCn = descCn;
			}

			public String getDescEn() {
				return this.descEn;
			}

			public void setDescEn(String descEn) {
				this.descEn = descEn;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class TypesItem {

			private String descCn;

			private String descEn;

			private String value;

			public String getDescCn() {
				return this.descCn;
			}

			public void setDescCn(String descCn) {
				this.descCn = descCn;
			}

			public String getDescEn() {
				return this.descEn;
			}

			public void setDescEn(String descEn) {
				this.descEn = descEn;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public QueryMsSGFormConfigResponse getInstance(UnmarshallerContext context) {
		return	QueryMsSGFormConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
