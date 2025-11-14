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
import com.aliyuncs.mpaas.transform.v20201028.ListMdsCubeResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMdsCubeResourcesResponse extends AcsResponse {

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

				private Boolean firstPage;

				private Boolean lastPage;

				private Long prePage;

				private Long nextPage;

				private Long firstResult;

				private String currentMaxIosVersion;

				private String currentMaxAndroidVersion;

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

				public Long getFirstResult() {
					return this.firstResult;
				}

				public void setFirstResult(Long firstResult) {
					this.firstResult = firstResult;
				}

				public String getCurrentMaxIosVersion() {
					return this.currentMaxIosVersion;
				}

				public void setCurrentMaxIosVersion(String currentMaxIosVersion) {
					this.currentMaxIosVersion = currentMaxIosVersion;
				}

				public String getCurrentMaxAndroidVersion() {
					return this.currentMaxAndroidVersion;
				}

				public void setCurrentMaxAndroidVersion(String currentMaxAndroidVersion) {
					this.currentMaxAndroidVersion = currentMaxAndroidVersion;
				}

				public List<ListItem> getList() {
					return this.list;
				}

				public void setList(List<ListItem> list) {
					this.list = list;
				}

				public static class ListItem {

					private Integer status;

					private String appCode;

					private String minCubeSdkVersion;

					private String binPublicFileUrl;

					private String jsonPublicFileUrl;

					private String gmtModified;

					private String extendInfo;

					private String templateResourceVersion;

					private String androidMinVersion;

					private String jsonPrivateFileUrl;

					private String binPrivateFileUrl;

					private String templateResourceDesc;

					private String iosMaxVersion;

					private String iosMinVersion;

					private String platform;

					private String gmtCreate;

					private String operator;

					private String androidMaxVersion;

					private String binFileMd5;

					private String templateId;

					private Long id;

					private Long resourceStatus;

					private String mockDataDownloadUrl;

					private String previewPictureUrl;

					public Integer getStatus() {
						return this.status;
					}

					public void setStatus(Integer status) {
						this.status = status;
					}

					public String getAppCode() {
						return this.appCode;
					}

					public void setAppCode(String appCode) {
						this.appCode = appCode;
					}

					public String getMinCubeSdkVersion() {
						return this.minCubeSdkVersion;
					}

					public void setMinCubeSdkVersion(String minCubeSdkVersion) {
						this.minCubeSdkVersion = minCubeSdkVersion;
					}

					public String getBinPublicFileUrl() {
						return this.binPublicFileUrl;
					}

					public void setBinPublicFileUrl(String binPublicFileUrl) {
						this.binPublicFileUrl = binPublicFileUrl;
					}

					public String getJsonPublicFileUrl() {
						return this.jsonPublicFileUrl;
					}

					public void setJsonPublicFileUrl(String jsonPublicFileUrl) {
						this.jsonPublicFileUrl = jsonPublicFileUrl;
					}

					public String getGmtModified() {
						return this.gmtModified;
					}

					public void setGmtModified(String gmtModified) {
						this.gmtModified = gmtModified;
					}

					public String getExtendInfo() {
						return this.extendInfo;
					}

					public void setExtendInfo(String extendInfo) {
						this.extendInfo = extendInfo;
					}

					public String getTemplateResourceVersion() {
						return this.templateResourceVersion;
					}

					public void setTemplateResourceVersion(String templateResourceVersion) {
						this.templateResourceVersion = templateResourceVersion;
					}

					public String getAndroidMinVersion() {
						return this.androidMinVersion;
					}

					public void setAndroidMinVersion(String androidMinVersion) {
						this.androidMinVersion = androidMinVersion;
					}

					public String getJsonPrivateFileUrl() {
						return this.jsonPrivateFileUrl;
					}

					public void setJsonPrivateFileUrl(String jsonPrivateFileUrl) {
						this.jsonPrivateFileUrl = jsonPrivateFileUrl;
					}

					public String getBinPrivateFileUrl() {
						return this.binPrivateFileUrl;
					}

					public void setBinPrivateFileUrl(String binPrivateFileUrl) {
						this.binPrivateFileUrl = binPrivateFileUrl;
					}

					public String getTemplateResourceDesc() {
						return this.templateResourceDesc;
					}

					public void setTemplateResourceDesc(String templateResourceDesc) {
						this.templateResourceDesc = templateResourceDesc;
					}

					public String getIosMaxVersion() {
						return this.iosMaxVersion;
					}

					public void setIosMaxVersion(String iosMaxVersion) {
						this.iosMaxVersion = iosMaxVersion;
					}

					public String getIosMinVersion() {
						return this.iosMinVersion;
					}

					public void setIosMinVersion(String iosMinVersion) {
						this.iosMinVersion = iosMinVersion;
					}

					public String getPlatform() {
						return this.platform;
					}

					public void setPlatform(String platform) {
						this.platform = platform;
					}

					public String getGmtCreate() {
						return this.gmtCreate;
					}

					public void setGmtCreate(String gmtCreate) {
						this.gmtCreate = gmtCreate;
					}

					public String getOperator() {
						return this.operator;
					}

					public void setOperator(String operator) {
						this.operator = operator;
					}

					public String getAndroidMaxVersion() {
						return this.androidMaxVersion;
					}

					public void setAndroidMaxVersion(String androidMaxVersion) {
						this.androidMaxVersion = androidMaxVersion;
					}

					public String getBinFileMd5() {
						return this.binFileMd5;
					}

					public void setBinFileMd5(String binFileMd5) {
						this.binFileMd5 = binFileMd5;
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

					public Long getResourceStatus() {
						return this.resourceStatus;
					}

					public void setResourceStatus(Long resourceStatus) {
						this.resourceStatus = resourceStatus;
					}

					public String getMockDataDownloadUrl() {
						return this.mockDataDownloadUrl;
					}

					public void setMockDataDownloadUrl(String mockDataDownloadUrl) {
						this.mockDataDownloadUrl = mockDataDownloadUrl;
					}

					public String getPreviewPictureUrl() {
						return this.previewPictureUrl;
					}

					public void setPreviewPictureUrl(String previewPictureUrl) {
						this.previewPictureUrl = previewPictureUrl;
					}
				}
			}
		}
	}

	@Override
	public ListMdsCubeResourcesResponse getInstance(UnmarshallerContext context) {
		return	ListMdsCubeResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
