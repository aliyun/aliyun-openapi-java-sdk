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
import com.aliyuncs.advisor_share.transform.v20180608.QueryRuleTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRuleTemplateResponse extends AcsResponse {

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

		private Long id;

		private String name;

		private List<ProductListItem> productList;

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

		public List<ProductListItem> getProductList() {
			return this.productList;
		}

		public void setProductList(List<ProductListItem> productList) {
			this.productList = productList;
		}

		public static class ProductListItem {

			private Boolean enabled;

			private Long order;

			private String productCode;

			private String productName;

			private List<ClassListItem> classList;

			public Boolean getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Boolean enabled) {
				this.enabled = enabled;
			}

			public Long getOrder() {
				return this.order;
			}

			public void setOrder(Long order) {
				this.order = order;
			}

			public String getProductCode() {
				return this.productCode;
			}

			public void setProductCode(String productCode) {
				this.productCode = productCode;
			}

			public String getProductName() {
				return this.productName;
			}

			public void setProductName(String productName) {
				this.productName = productName;
			}

			public List<ClassListItem> getClassList() {
				return this.classList;
			}

			public void setClassList(List<ClassListItem> classList) {
				this.classList = classList;
			}

			public static class ClassListItem {

				private Boolean enabled;

				private String ruleCode;

				private String ruleName;

				private List<FieldListItem> fieldList;

				public Boolean getEnabled() {
					return this.enabled;
				}

				public void setEnabled(Boolean enabled) {
					this.enabled = enabled;
				}

				public String getRuleCode() {
					return this.ruleCode;
				}

				public void setRuleCode(String ruleCode) {
					this.ruleCode = ruleCode;
				}

				public String getRuleName() {
					return this.ruleName;
				}

				public void setRuleName(String ruleName) {
					this.ruleName = ruleName;
				}

				public List<FieldListItem> getFieldList() {
					return this.fieldList;
				}

				public void setFieldList(List<FieldListItem> fieldList) {
					this.fieldList = fieldList;
				}

				public static class FieldListItem {

					private String defaultValue;

					private String fieldLabel;

					private String fieldName;

					private Long fieldValue;

					private String operator;

					private String valueUnit;

					public String getDefaultValue() {
						return this.defaultValue;
					}

					public void setDefaultValue(String defaultValue) {
						this.defaultValue = defaultValue;
					}

					public String getFieldLabel() {
						return this.fieldLabel;
					}

					public void setFieldLabel(String fieldLabel) {
						this.fieldLabel = fieldLabel;
					}

					public String getFieldName() {
						return this.fieldName;
					}

					public void setFieldName(String fieldName) {
						this.fieldName = fieldName;
					}

					public Long getFieldValue() {
						return this.fieldValue;
					}

					public void setFieldValue(Long fieldValue) {
						this.fieldValue = fieldValue;
					}

					public String getOperator() {
						return this.operator;
					}

					public void setOperator(String operator) {
						this.operator = operator;
					}

					public String getValueUnit() {
						return this.valueUnit;
					}

					public void setValueUnit(String valueUnit) {
						this.valueUnit = valueUnit;
					}
				}
			}
		}
	}

	@Override
	public QueryRuleTemplateResponse getInstance(UnmarshallerContext context) {
		return	QueryRuleTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
