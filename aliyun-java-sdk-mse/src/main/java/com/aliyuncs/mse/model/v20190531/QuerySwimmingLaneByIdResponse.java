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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.QuerySwimmingLaneByIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySwimmingLaneByIdResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer code;

	private String errorCode;

	private Integer httpStatusCode;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String name;

		private Long id;

		private String tag;

		private Integer status;

		private Boolean enable;

		private String regionId;

		private Long groupId;

		private String entryRule;

		private Boolean enableRules;

		private String gmtCreate;

		private String gmtModified;

		private String gatewaySwimmingLaneRouteJson;

		private List<EntryRule> entryRules;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getEntryRule() {
			return this.entryRule;
		}

		public void setEntryRule(String entryRule) {
			this.entryRule = entryRule;
		}

		public Boolean getEnableRules() {
			return this.enableRules;
		}

		public void setEnableRules(Boolean enableRules) {
			this.enableRules = enableRules;
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

		public String getGatewaySwimmingLaneRouteJson() {
			return this.gatewaySwimmingLaneRouteJson;
		}

		public void setGatewaySwimmingLaneRouteJson(String gatewaySwimmingLaneRouteJson) {
			this.gatewaySwimmingLaneRouteJson = gatewaySwimmingLaneRouteJson;
		}

		public List<EntryRule> getEntryRules() {
			return this.entryRules;
		}

		public void setEntryRules(List<EntryRule> entryRules) {
			this.entryRules = entryRules;
		}

		public static class EntryRule {

			private String path;

			private String condition;

			private List<RestItemsItem> restItems;

			private List<String> paths;

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

			public List<RestItemsItem> getRestItems() {
				return this.restItems;
			}

			public void setRestItems(List<RestItemsItem> restItems) {
				this.restItems = restItems;
			}

			public List<String> getPaths() {
				return this.paths;
			}

			public void setPaths(List<String> paths) {
				this.paths = paths;
			}

			public static class RestItemsItem {

				private String type;

				private String name;

				private String operator;

				private String datum;

				private String cond;

				private Integer divisor;

				private Integer remainder;

				private Integer rate;

				private String value;

				private List<String> nameList;

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

				public String getDatum() {
					return this.datum;
				}

				public void setDatum(String datum) {
					this.datum = datum;
				}

				public String getCond() {
					return this.cond;
				}

				public void setCond(String cond) {
					this.cond = cond;
				}

				public Integer getDivisor() {
					return this.divisor;
				}

				public void setDivisor(Integer divisor) {
					this.divisor = divisor;
				}

				public Integer getRemainder() {
					return this.remainder;
				}

				public void setRemainder(Integer remainder) {
					this.remainder = remainder;
				}

				public Integer getRate() {
					return this.rate;
				}

				public void setRate(Integer rate) {
					this.rate = rate;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public List<String> getNameList() {
					return this.nameList;
				}

				public void setNameList(List<String> nameList) {
					this.nameList = nameList;
				}
			}
		}
	}

	@Override
	public QuerySwimmingLaneByIdResponse getInstance(UnmarshallerContext context) {
		return	QuerySwimmingLaneByIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
