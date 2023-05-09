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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.GetDataAPIServiceDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataAPIServiceDetailResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String displayName;

		private Integer status;

		private String apiSrn;

		private String description;

		private Long createTime;

		private Long lastUpdateTime;

		private String requestMethod;

		private String dateFormat;

		private String requestProtocol;

		private String apiPath;

		private SqlTemplateDTO sqlTemplateDTO;

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getApiSrn() {
			return this.apiSrn;
		}

		public void setApiSrn(String apiSrn) {
			this.apiSrn = apiSrn;
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

		public Long getLastUpdateTime() {
			return this.lastUpdateTime;
		}

		public void setLastUpdateTime(Long lastUpdateTime) {
			this.lastUpdateTime = lastUpdateTime;
		}

		public String getRequestMethod() {
			return this.requestMethod;
		}

		public void setRequestMethod(String requestMethod) {
			this.requestMethod = requestMethod;
		}

		public String getDateFormat() {
			return this.dateFormat;
		}

		public void setDateFormat(String dateFormat) {
			this.dateFormat = dateFormat;
		}

		public String getRequestProtocol() {
			return this.requestProtocol;
		}

		public void setRequestProtocol(String requestProtocol) {
			this.requestProtocol = requestProtocol;
		}

		public String getApiPath() {
			return this.apiPath;
		}

		public void setApiPath(String apiPath) {
			this.apiPath = apiPath;
		}

		public SqlTemplateDTO getSqlTemplateDTO() {
			return this.sqlTemplateDTO;
		}

		public void setSqlTemplateDTO(SqlTemplateDTO sqlTemplateDTO) {
			this.sqlTemplateDTO = sqlTemplateDTO;
		}

		public static class SqlTemplateDTO {

			private String originSql;

			private String templateSql;

			private List<RequestParamsItem> requestParams;

			private List<ResponseParamsItem> responseParams;

			public String getOriginSql() {
				return this.originSql;
			}

			public void setOriginSql(String originSql) {
				this.originSql = originSql;
			}

			public String getTemplateSql() {
				return this.templateSql;
			}

			public void setTemplateSql(String templateSql) {
				this.templateSql = templateSql;
			}

			public List<RequestParamsItem> getRequestParams() {
				return this.requestParams;
			}

			public void setRequestParams(List<RequestParamsItem> requestParams) {
				this.requestParams = requestParams;
			}

			public List<ResponseParamsItem> getResponseParams() {
				return this.responseParams;
			}

			public void setResponseParams(List<ResponseParamsItem> responseParams) {
				this.responseParams = responseParams;
			}

			public static class RequestParamsItem {

				private String type;

				private Boolean required;

				private String example;

				private String name;

				private String desc;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Boolean getRequired() {
					return this.required;
				}

				public void setRequired(Boolean required) {
					this.required = required;
				}

				public String getExample() {
					return this.example;
				}

				public void setExample(String example) {
					this.example = example;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getDesc() {
					return this.desc;
				}

				public void setDesc(String desc) {
					this.desc = desc;
				}
			}

			public static class ResponseParamsItem {

				private String type;

				private Boolean required;

				private String example;

				private String name;

				private String desc;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Boolean getRequired() {
					return this.required;
				}

				public void setRequired(Boolean required) {
					this.required = required;
				}

				public String getExample() {
					return this.example;
				}

				public void setExample(String example) {
					this.example = example;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getDesc() {
					return this.desc;
				}

				public void setDesc(String desc) {
					this.desc = desc;
				}
			}
		}
	}

	@Override
	public GetDataAPIServiceDetailResponse getInstance(UnmarshallerContext context) {
		return	GetDataAPIServiceDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
