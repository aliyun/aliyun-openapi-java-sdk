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

package com.aliyuncs.mpaas.model.v20201028;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20201028.ListMdsCubeTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMdsCubeTemplatesResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private ResultContent resultContent;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResultContent getResultContent() {
		return this.resultContent;
	}

	public void setResultContent(ResultContent resultContent) {
		this.resultContent = resultContent;
	}

	public static class ResultContent {

		private String requestId;

		private Data data;

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

			private String requestId;

			private String errorCode;

			private Boolean success;

			private String resultMsg;

			private Content content;

			public String getRequestId() {
				return this.requestId;
			}

			public void setRequestId(String requestId) {
				this.requestId = requestId;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public Boolean getSuccess() {
				return this.success;
			}

			public void setSuccess(Boolean success) {
				this.success = success;
			}

			public String getResultMsg() {
				return this.resultMsg;
			}

			public void setResultMsg(String resultMsg) {
				this.resultMsg = resultMsg;
			}

			public Content getContent() {
				return this.content;
			}

			public void setContent(Content content) {
				this.content = content;
			}

			public static class Content {

				private Integer pageNo;

				private Integer pageSize;

				private Integer totalCount;

				private Long firstResult;

				private Boolean firstPage;

				private Boolean lastPage;

				private Long prePage;

				private Long nextPage;

				private Long totalPage;

				private List<ListItem> list;

				public Integer getPageNo() {
					return this.pageNo;
				}

				public void setPageNo(Integer pageNo) {
					this.pageNo = pageNo;
				}

				public Integer getPageSize() {
					return this.pageSize;
				}

				public void setPageSize(Integer pageSize) {
					this.pageSize = pageSize;
				}

				public Integer getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Integer totalCount) {
					this.totalCount = totalCount;
				}

				public Long getFirstResult() {
					return this.firstResult;
				}

				public void setFirstResult(Long firstResult) {
					this.firstResult = firstResult;
				}

				public Boolean getFirstPage() {
					return this.firstPage;
				}

				public void setFirstPage(Boolean firstPage) {
					this.firstPage = firstPage;
				}

				public Boolean getLastPage() {
					return this.lastPage;
				}

				public void setLastPage(Boolean lastPage) {
					this.lastPage = lastPage;
				}

				public Long getPrePage() {
					return this.prePage;
				}

				public void setPrePage(Long prePage) {
					this.prePage = prePage;
				}

				public Long getNextPage() {
					return this.nextPage;
				}

				public void setNextPage(Long nextPage) {
					this.nextPage = nextPage;
				}

				public Long getTotalPage() {
					return this.totalPage;
				}

				public void setTotalPage(Long totalPage) {
					this.totalPage = totalPage;
				}

				public List<ListItem> getList() {
					return this.list;
				}

				public void setList(List<ListItem> list) {
					this.list = list;
				}

				public static class ListItem {

					private Integer status;

					private String templateDesc;

					private String appCode;

					private String gmtCreate;

					private String templateName;

					private String gmtModified;

					private String templateId;

					private Long id;

					public Integer getStatus() {
						return this.status;
					}

					public void setStatus(Integer status) {
						this.status = status;
					}

					public String getTemplateDesc() {
						return this.templateDesc;
					}

					public void setTemplateDesc(String templateDesc) {
						this.templateDesc = templateDesc;
					}

					public String getAppCode() {
						return this.appCode;
					}

					public void setAppCode(String appCode) {
						this.appCode = appCode;
					}

					public String getGmtCreate() {
						return this.gmtCreate;
					}

					public void setGmtCreate(String gmtCreate) {
						this.gmtCreate = gmtCreate;
					}

					public String getTemplateName() {
						return this.templateName;
					}

					public void setTemplateName(String templateName) {
						this.templateName = templateName;
					}

					public String getGmtModified() {
						return this.gmtModified;
					}

					public void setGmtModified(String gmtModified) {
						this.gmtModified = gmtModified;
					}

					public String getTemplateId() {
						return this.templateId;
					}

					public void setTemplateId(String templateId) {
						this.templateId = templateId;
					}

					public Long getId() {
						return this.id;
					}

					public void setId(Long id) {
						this.id = id;
					}
				}
			}
		}
	}

	@Override
	public ListMdsCubeTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListMdsCubeTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
