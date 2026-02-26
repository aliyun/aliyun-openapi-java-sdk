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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeAllWhitelistTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAllWhitelistTemplateResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

		private Integer currPageNumbers;

		private Boolean hasNext;

		private Boolean hasPrev;

		private Integer maxRecordsPerPage;

		private Integer totalPageNumbers;

		private Integer totalRecords;

		private List<Template> templates;

		public Integer getCurrPageNumbers() {
			return this.currPageNumbers;
		}

		public void setCurrPageNumbers(Integer currPageNumbers) {
			this.currPageNumbers = currPageNumbers;
		}

		public Boolean getHasNext() {
			return this.hasNext;
		}

		public void setHasNext(Boolean hasNext) {
			this.hasNext = hasNext;
		}

		public Boolean getHasPrev() {
			return this.hasPrev;
		}

		public void setHasPrev(Boolean hasPrev) {
			this.hasPrev = hasPrev;
		}

		public Integer getMaxRecordsPerPage() {
			return this.maxRecordsPerPage;
		}

		public void setMaxRecordsPerPage(Integer maxRecordsPerPage) {
			this.maxRecordsPerPage = maxRecordsPerPage;
		}

		public Integer getTotalPageNumbers() {
			return this.totalPageNumbers;
		}

		public void setTotalPageNumbers(Integer totalPageNumbers) {
			this.totalPageNumbers = totalPageNumbers;
		}

		public Integer getTotalRecords() {
			return this.totalRecords;
		}

		public void setTotalRecords(Integer totalRecords) {
			this.totalRecords = totalRecords;
		}

		public List<Template> getTemplates() {
			return this.templates;
		}

		public void setTemplates(List<Template> templates) {
			this.templates = templates;
		}

		public static class Template {

			private Integer id;

			private String ips;

			private Integer templateId;

			private String templateName;

			private Integer userId;

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public String getIps() {
				return this.ips;
			}

			public void setIps(String ips) {
				this.ips = ips;
			}

			public Integer getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(Integer templateId) {
				this.templateId = templateId;
			}

			public String getTemplateName() {
				return this.templateName;
			}

			public void setTemplateName(String templateName) {
				this.templateName = templateName;
			}

			public Integer getUserId() {
				return this.userId;
			}

			public void setUserId(Integer userId) {
				this.userId = userId;
			}
		}
	}

	@Override
	public DescribeAllWhitelistTemplateResponse getInstance(UnmarshallerContext context) {
		return	DescribeAllWhitelistTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
