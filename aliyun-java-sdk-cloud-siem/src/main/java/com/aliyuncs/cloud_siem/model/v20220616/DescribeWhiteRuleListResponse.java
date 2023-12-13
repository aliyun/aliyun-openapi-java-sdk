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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.DescribeWhiteRuleListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWhiteRuleListResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

		private List<ResponseDataItem> responseData;

		private PageInfo pageInfo;

		public List<ResponseDataItem> getResponseData() {
			return this.responseData;
		}

		public void setResponseData(List<ResponseDataItem> responseData) {
			this.responseData = responseData;
		}

		public PageInfo getPageInfo() {
			return this.pageInfo;
		}

		public void setPageInfo(PageInfo pageInfo) {
			this.pageInfo = pageInfo;
		}

		public static class ResponseDataItem {

			private Long id;

			private String gmtCreate;

			private String gmtModified;

			private Long aliuid;

			private Long subAliuid;

			private String alertType;

			private String alertTypeId;

			private String alertName;

			private String alertNameId;

			private Integer status;

			private String incidentUuid;

			private String alertUuid;

			private Expression expression;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getAliuid() {
				return this.aliuid;
			}

			public void setAliuid(Long aliuid) {
				this.aliuid = aliuid;
			}

			public Long getSubAliuid() {
				return this.subAliuid;
			}

			public void setSubAliuid(Long subAliuid) {
				this.subAliuid = subAliuid;
			}

			public String getAlertType() {
				return this.alertType;
			}

			public void setAlertType(String alertType) {
				this.alertType = alertType;
			}

			public String getAlertTypeId() {
				return this.alertTypeId;
			}

			public void setAlertTypeId(String alertTypeId) {
				this.alertTypeId = alertTypeId;
			}

			public String getAlertName() {
				return this.alertName;
			}

			public void setAlertName(String alertName) {
				this.alertName = alertName;
			}

			public String getAlertNameId() {
				return this.alertNameId;
			}

			public void setAlertNameId(String alertNameId) {
				this.alertNameId = alertNameId;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getIncidentUuid() {
				return this.incidentUuid;
			}

			public void setIncidentUuid(String incidentUuid) {
				this.incidentUuid = incidentUuid;
			}

			public String getAlertUuid() {
				return this.alertUuid;
			}

			public void setAlertUuid(String alertUuid) {
				this.alertUuid = alertUuid;
			}

			public Expression getExpression() {
				return this.expression;
			}

			public void setExpression(Expression expression) {
				this.expression = expression;
			}

			public static class Expression {

				private String logic;

				private List<Condition> conditions;

				public String getLogic() {
					return this.logic;
				}

				public void setLogic(String logic) {
					this.logic = logic;
				}

				public List<Condition> getConditions() {
					return this.conditions;
				}

				public void setConditions(List<Condition> conditions) {
					this.conditions = conditions;
				}

				public static class Condition {

					private Integer itemId;

					private String operator;

					private Boolean isNot;

					private Left left;

					private Right right;

					public Integer getItemId() {
						return this.itemId;
					}

					public void setItemId(Integer itemId) {
						this.itemId = itemId;
					}

					public String getOperator() {
						return this.operator;
					}

					public void setOperator(String operator) {
						this.operator = operator;
					}

					public Boolean getIsNot() {
						return this.isNot;
					}

					public void setIsNot(Boolean isNot) {
						this.isNot = isNot;
					}

					public Left getLeft() {
						return this.left;
					}

					public void setLeft(Left left) {
						this.left = left;
					}

					public Right getRight() {
						return this.right;
					}

					public void setRight(Right right) {
						this.right = right;
					}

					public static class Left {

						private String value;

						private Boolean isVar;

						private String type;

						private String modifier;

						private Map<Object,Object> modifierParam;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public Boolean getIsVar() {
							return this.isVar;
						}

						public void setIsVar(Boolean isVar) {
							this.isVar = isVar;
						}

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public String getModifier() {
							return this.modifier;
						}

						public void setModifier(String modifier) {
							this.modifier = modifier;
						}

						public Map<Object,Object> getModifierParam() {
							return this.modifierParam;
						}

						public void setModifierParam(Map<Object,Object> modifierParam) {
							this.modifierParam = modifierParam;
						}
					}

					public static class Right {

						private String value;

						private Boolean isVar;

						private String type;

						private String modifier;

						private Map<Object,Object> modifierParam;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public Boolean getIsVar() {
							return this.isVar;
						}

						public void setIsVar(Boolean isVar) {
							this.isVar = isVar;
						}

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public String getModifier() {
							return this.modifier;
						}

						public void setModifier(String modifier) {
							this.modifier = modifier;
						}

						public Map<Object,Object> getModifierParam() {
							return this.modifierParam;
						}

						public void setModifierParam(Map<Object,Object> modifierParam) {
							this.modifierParam = modifierParam;
						}
					}
				}
			}
		}

		public static class PageInfo {

			private Integer currentPage;

			private Integer pageSize;

			private Long totalCount;

			public Integer getCurrentPage() {
				return this.currentPage;
			}

			public void setCurrentPage(Integer currentPage) {
				this.currentPage = currentPage;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}
		}
	}

	@Override
	public DescribeWhiteRuleListResponse getInstance(UnmarshallerContext context) {
		return	DescribeWhiteRuleListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
