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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.DescribeGreyTagRouteResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGreyTagRouteResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String traceId;

	private String errorCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

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

		private Long greyTagRouteId;

		private String name;

		private String description;

		private Long createTime;

		private Long updateTime;

		private String appId;

		private List<ScRule> scRules;

		private List<DubboRule> dubboRules;

		public Long getGreyTagRouteId() {
			return this.greyTagRouteId;
		}

		public void setGreyTagRouteId(Long greyTagRouteId) {
			this.greyTagRouteId = greyTagRouteId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public List<ScRule> getScRules() {
			return this.scRules;
		}

		public void setScRules(List<ScRule> scRules) {
			this.scRules = scRules;
		}

		public List<DubboRule> getDubboRules() {
			return this.dubboRules;
		}

		public void setDubboRules(List<DubboRule> dubboRules) {
			this.dubboRules = dubboRules;
		}

		public static class ScRule {

			private String path;

			private String condition;

			private List<Scrulesitem> items;

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getCondition() {
				return this.condition;
			}

			public void setCondition(String condition) {
				this.condition = condition;
			}

			public List<Scrulesitem> getItems() {
				return this.items;
			}

			public void setItems(List<Scrulesitem> items) {
				this.items = items;
			}

			public static class Scrulesitem {

				private String type;

				private String name;

				private String operator;

				private String value;

				private String cond;

				private Integer index;

				private String expr;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getCond() {
					return this.cond;
				}

				public void setCond(String cond) {
					this.cond = cond;
				}

				public Integer getIndex() {
					return this.index;
				}

				public void setIndex(Integer index) {
					this.index = index;
				}

				public String getExpr() {
					return this.expr;
				}

				public void setExpr(String expr) {
					this.expr = expr;
				}
			}
		}

		public static class DubboRule {

			private String serviceName;

			private String group;

			private String version;

			private String methodName;

			private String condition;

			private List<Item> items1;

			public String getServiceName() {
				return this.serviceName;
			}

			public void setServiceName(String serviceName) {
				this.serviceName = serviceName;
			}

			public String getGroup() {
				return this.group;
			}

			public void setGroup(String group) {
				this.group = group;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getMethodName() {
				return this.methodName;
			}

			public void setMethodName(String methodName) {
				this.methodName = methodName;
			}

			public String getCondition() {
				return this.condition;
			}

			public void setCondition(String condition) {
				this.condition = condition;
			}

			public List<Item> getItems1() {
				return this.items1;
			}

			public void setItems1(List<Item> items1) {
				this.items1 = items1;
			}

			public static class Item {

				private Integer index;

				private String expr;

				private String operator;

				private String value;

				private String cond;

				private String type;

				private String name;

				public Integer getIndex() {
					return this.index;
				}

				public void setIndex(Integer index) {
					this.index = index;
				}

				public String getExpr() {
					return this.expr;
				}

				public void setExpr(String expr) {
					this.expr = expr;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getCond() {
					return this.cond;
				}

				public void setCond(String cond) {
					this.cond = cond;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public DescribeGreyTagRouteResponse getInstance(UnmarshallerContext context) {
		return	DescribeGreyTagRouteResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
