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

package com.aliyuncs.websitebuild.model.v20250429;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.websitebuild.transform.v20250429.ListAppTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppTemplatesResponse extends AcsResponse {

	private String requestId;

	private String dynamicCode;

	private String dynamicMessage;

	private Boolean synchro;

	private String accessDeniedDetail;

	private String rootErrorMsg;

	private String rootErrorCode;

	private Boolean allowRetry;

	private String appName;

	private Integer maxResults;

	private String nextToken;

	private List<String> errorArgs;

	private Module module;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Boolean getSynchro() {
		return this.synchro;
	}

	public void setSynchro(Boolean synchro) {
		this.synchro = synchro;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getRootErrorMsg() {
		return this.rootErrorMsg;
	}

	public void setRootErrorMsg(String rootErrorMsg) {
		this.rootErrorMsg = rootErrorMsg;
	}

	public String getRootErrorCode() {
		return this.rootErrorCode;
	}

	public void setRootErrorCode(String rootErrorCode) {
		this.rootErrorCode = rootErrorCode;
	}

	public Boolean getAllowRetry() {
		return this.allowRetry;
	}

	public void setAllowRetry(Boolean allowRetry) {
		this.allowRetry = allowRetry;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<String> getErrorArgs() {
		return this.errorArgs;
	}

	public void setErrorArgs(List<String> errorArgs) {
		this.errorArgs = errorArgs;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public static class Module {

		private Integer totalItemNum;

		private Integer currentPageNum;

		private Integer pageSize;

		private Integer totalPageNum;

		private Boolean prePage;

		private Boolean nextPage;

		private Boolean resultLimit;

		private List<DataItem> data;

		private Next next;

		public Integer getTotalItemNum() {
			return this.totalItemNum;
		}

		public void setTotalItemNum(Integer totalItemNum) {
			this.totalItemNum = totalItemNum;
		}

		public Integer getCurrentPageNum() {
			return this.currentPageNum;
		}

		public void setCurrentPageNum(Integer currentPageNum) {
			this.currentPageNum = currentPageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalPageNum() {
			return this.totalPageNum;
		}

		public void setTotalPageNum(Integer totalPageNum) {
			this.totalPageNum = totalPageNum;
		}

		public Boolean getPrePage() {
			return this.prePage;
		}

		public void setPrePage(Boolean prePage) {
			this.prePage = prePage;
		}

		public Boolean getNextPage() {
			return this.nextPage;
		}

		public void setNextPage(Boolean nextPage) {
			this.nextPage = nextPage;
		}

		public Boolean getResultLimit() {
			return this.resultLimit;
		}

		public void setResultLimit(Boolean resultLimit) {
			this.resultLimit = resultLimit;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public Next getNext() {
			return this.next;
		}

		public void setNext(Next next) {
			this.next = next;
		}

		public static class DataItem {

			private Long id;

			private String templateId;

			private String templateName;

			private String bizId;

			private String thumbnailUrl;

			private String previewUrl;

			private String productVersion;

			private String industry;

			private String colorScheme;

			private String productVersionName;

			private String industryName;

			private String colorSchemeName;

			private String status;

			private Integer viewCount;

			private Integer likeCount;

			private Integer shareCount;

			private Integer copyCount;

			private String metadata;

			private String creator;

			private String lastModifier;

			private String appType;

			private Integer weight;

			private String gmtCreateTime;

			private String gmtModifiedTime;

			private Boolean liked;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(String templateId) {
				this.templateId = templateId;
			}

			public String getTemplateName() {
				return this.templateName;
			}

			public void setTemplateName(String templateName) {
				this.templateName = templateName;
			}

			public String getBizId() {
				return this.bizId;
			}

			public void setBizId(String bizId) {
				this.bizId = bizId;
			}

			public String getThumbnailUrl() {
				return this.thumbnailUrl;
			}

			public void setThumbnailUrl(String thumbnailUrl) {
				this.thumbnailUrl = thumbnailUrl;
			}

			public String getPreviewUrl() {
				return this.previewUrl;
			}

			public void setPreviewUrl(String previewUrl) {
				this.previewUrl = previewUrl;
			}

			public String getProductVersion() {
				return this.productVersion;
			}

			public void setProductVersion(String productVersion) {
				this.productVersion = productVersion;
			}

			public String getIndustry() {
				return this.industry;
			}

			public void setIndustry(String industry) {
				this.industry = industry;
			}

			public String getColorScheme() {
				return this.colorScheme;
			}

			public void setColorScheme(String colorScheme) {
				this.colorScheme = colorScheme;
			}

			public String getProductVersionName() {
				return this.productVersionName;
			}

			public void setProductVersionName(String productVersionName) {
				this.productVersionName = productVersionName;
			}

			public String getIndustryName() {
				return this.industryName;
			}

			public void setIndustryName(String industryName) {
				this.industryName = industryName;
			}

			public String getColorSchemeName() {
				return this.colorSchemeName;
			}

			public void setColorSchemeName(String colorSchemeName) {
				this.colorSchemeName = colorSchemeName;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getViewCount() {
				return this.viewCount;
			}

			public void setViewCount(Integer viewCount) {
				this.viewCount = viewCount;
			}

			public Integer getLikeCount() {
				return this.likeCount;
			}

			public void setLikeCount(Integer likeCount) {
				this.likeCount = likeCount;
			}

			public Integer getShareCount() {
				return this.shareCount;
			}

			public void setShareCount(Integer shareCount) {
				this.shareCount = shareCount;
			}

			public Integer getCopyCount() {
				return this.copyCount;
			}

			public void setCopyCount(Integer copyCount) {
				this.copyCount = copyCount;
			}

			public String getMetadata() {
				return this.metadata;
			}

			public void setMetadata(String metadata) {
				this.metadata = metadata;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getLastModifier() {
				return this.lastModifier;
			}

			public void setLastModifier(String lastModifier) {
				this.lastModifier = lastModifier;
			}

			public String getAppType() {
				return this.appType;
			}

			public void setAppType(String appType) {
				this.appType = appType;
			}

			public Integer getWeight() {
				return this.weight;
			}

			public void setWeight(Integer weight) {
				this.weight = weight;
			}

			public String getGmtCreateTime() {
				return this.gmtCreateTime;
			}

			public void setGmtCreateTime(String gmtCreateTime) {
				this.gmtCreateTime = gmtCreateTime;
			}

			public String getGmtModifiedTime() {
				return this.gmtModifiedTime;
			}

			public void setGmtModifiedTime(String gmtModifiedTime) {
				this.gmtModifiedTime = gmtModifiedTime;
			}

			public Boolean getLiked() {
				return this.liked;
			}

			public void setLiked(Boolean liked) {
				this.liked = liked;
			}
		}

		public static class Next {

			private Long id;

			private String templateId;

			private String templateName;

			private String bizId;

			private String thumbnailUrl;

			private String previewUrl;

			private String productVersion;

			private String industry;

			private String colorScheme;

			private String productVersionName;

			private String industryName;

			private String colorSchemeName;

			private String status;

			private Integer viewCount;

			private Integer likeCount;

			private Integer shareCount;

			private Integer copyCount;

			private String metadata;

			private String creator;

			private String lastModifier;

			private String appType;

			private Integer weight;

			private String gmtCreate;

			private String gmtModified;

			private Boolean liked;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(String templateId) {
				this.templateId = templateId;
			}

			public String getTemplateName() {
				return this.templateName;
			}

			public void setTemplateName(String templateName) {
				this.templateName = templateName;
			}

			public String getBizId() {
				return this.bizId;
			}

			public void setBizId(String bizId) {
				this.bizId = bizId;
			}

			public String getThumbnailUrl() {
				return this.thumbnailUrl;
			}

			public void setThumbnailUrl(String thumbnailUrl) {
				this.thumbnailUrl = thumbnailUrl;
			}

			public String getPreviewUrl() {
				return this.previewUrl;
			}

			public void setPreviewUrl(String previewUrl) {
				this.previewUrl = previewUrl;
			}

			public String getProductVersion() {
				return this.productVersion;
			}

			public void setProductVersion(String productVersion) {
				this.productVersion = productVersion;
			}

			public String getIndustry() {
				return this.industry;
			}

			public void setIndustry(String industry) {
				this.industry = industry;
			}

			public String getColorScheme() {
				return this.colorScheme;
			}

			public void setColorScheme(String colorScheme) {
				this.colorScheme = colorScheme;
			}

			public String getProductVersionName() {
				return this.productVersionName;
			}

			public void setProductVersionName(String productVersionName) {
				this.productVersionName = productVersionName;
			}

			public String getIndustryName() {
				return this.industryName;
			}

			public void setIndustryName(String industryName) {
				this.industryName = industryName;
			}

			public String getColorSchemeName() {
				return this.colorSchemeName;
			}

			public void setColorSchemeName(String colorSchemeName) {
				this.colorSchemeName = colorSchemeName;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getViewCount() {
				return this.viewCount;
			}

			public void setViewCount(Integer viewCount) {
				this.viewCount = viewCount;
			}

			public Integer getLikeCount() {
				return this.likeCount;
			}

			public void setLikeCount(Integer likeCount) {
				this.likeCount = likeCount;
			}

			public Integer getShareCount() {
				return this.shareCount;
			}

			public void setShareCount(Integer shareCount) {
				this.shareCount = shareCount;
			}

			public Integer getCopyCount() {
				return this.copyCount;
			}

			public void setCopyCount(Integer copyCount) {
				this.copyCount = copyCount;
			}

			public String getMetadata() {
				return this.metadata;
			}

			public void setMetadata(String metadata) {
				this.metadata = metadata;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getLastModifier() {
				return this.lastModifier;
			}

			public void setLastModifier(String lastModifier) {
				this.lastModifier = lastModifier;
			}

			public String getAppType() {
				return this.appType;
			}

			public void setAppType(String appType) {
				this.appType = appType;
			}

			public Integer getWeight() {
				return this.weight;
			}

			public void setWeight(Integer weight) {
				this.weight = weight;
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

			public Boolean getLiked() {
				return this.liked;
			}

			public void setLiked(Boolean liked) {
				this.liked = liked;
			}
		}
	}

	@Override
	public ListAppTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListAppTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
