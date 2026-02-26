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
import com.aliyuncs.websitebuild.transform.v20250429.ListAppInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppInstancesResponse extends AcsResponse {

	private String requestId;

	private String dynamicCode;

	private String dynamicMessage;

	private Boolean synchro;

	private String accessDeniedDetail;

	private String rootErrorMsg;

	private String rootErrorCode;

	private Integer currentPageNum;

	private Integer pageSize;

	private Integer totalPageNum;

	private Boolean prePage;

	private Boolean nextPage;

	private Boolean resultLimit;

	private Boolean allowRetry;

	private String appName;

	private String nextToken;

	private Integer maxResults;

	private List<DataItem> data;

	private List<String> errorArgs;

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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public List<String> getErrorArgs() {
		return this.errorArgs;
	}

	public void setErrorArgs(List<String> errorArgs) {
		this.errorArgs = errorArgs;
	}

	public static class DataItem {

		private String createTime;

		private String gmtModified;

		private String bizId;

		private String name;

		private String userId;

		private String appType;

		private String appSubType;

		private String buildType;

		private String description;

		private String iconUrl;

		private String thumbnailUrl;

		private String slug;

		private String status;

		private String statusText;

		private String designSpecId;

		private String gmtPublish;

		private String gmtDelete;

		private String startTime;

		private String endTime;

		private String domain;

		private String siteHost;

		private String espBizId;

		private Integer deleted;

		private String designSpecBizId;

		private String sourceType;

		private String resourceGroupId;

		private List<AiStaffListItem> aiStaffList;

		private List<AppServiceListItem> appServiceList;

		private List<TagsItem> tags;

		private Profile profile;

		private AppOperationAddress appOperationAddress;

		private PartnerDetail partnerDetail;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getAppType() {
			return this.appType;
		}

		public void setAppType(String appType) {
			this.appType = appType;
		}

		public String getAppSubType() {
			return this.appSubType;
		}

		public void setAppSubType(String appSubType) {
			this.appSubType = appSubType;
		}

		public String getBuildType() {
			return this.buildType;
		}

		public void setBuildType(String buildType) {
			this.buildType = buildType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIconUrl() {
			return this.iconUrl;
		}

		public void setIconUrl(String iconUrl) {
			this.iconUrl = iconUrl;
		}

		public String getThumbnailUrl() {
			return this.thumbnailUrl;
		}

		public void setThumbnailUrl(String thumbnailUrl) {
			this.thumbnailUrl = thumbnailUrl;
		}

		public String getSlug() {
			return this.slug;
		}

		public void setSlug(String slug) {
			this.slug = slug;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusText() {
			return this.statusText;
		}

		public void setStatusText(String statusText) {
			this.statusText = statusText;
		}

		public String getDesignSpecId() {
			return this.designSpecId;
		}

		public void setDesignSpecId(String designSpecId) {
			this.designSpecId = designSpecId;
		}

		public String getGmtPublish() {
			return this.gmtPublish;
		}

		public void setGmtPublish(String gmtPublish) {
			this.gmtPublish = gmtPublish;
		}

		public String getGmtDelete() {
			return this.gmtDelete;
		}

		public void setGmtDelete(String gmtDelete) {
			this.gmtDelete = gmtDelete;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getSiteHost() {
			return this.siteHost;
		}

		public void setSiteHost(String siteHost) {
			this.siteHost = siteHost;
		}

		public String getEspBizId() {
			return this.espBizId;
		}

		public void setEspBizId(String espBizId) {
			this.espBizId = espBizId;
		}

		public Integer getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Integer deleted) {
			this.deleted = deleted;
		}

		public String getDesignSpecBizId() {
			return this.designSpecBizId;
		}

		public void setDesignSpecBizId(String designSpecBizId) {
			this.designSpecBizId = designSpecBizId;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<AiStaffListItem> getAiStaffList() {
			return this.aiStaffList;
		}

		public void setAiStaffList(List<AiStaffListItem> aiStaffList) {
			this.aiStaffList = aiStaffList;
		}

		public List<AppServiceListItem> getAppServiceList() {
			return this.appServiceList;
		}

		public void setAppServiceList(List<AppServiceListItem> appServiceList) {
			this.appServiceList = appServiceList;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public Profile getProfile() {
			return this.profile;
		}

		public void setProfile(Profile profile) {
			this.profile = profile;
		}

		public AppOperationAddress getAppOperationAddress() {
			return this.appOperationAddress;
		}

		public void setAppOperationAddress(AppOperationAddress appOperationAddress) {
			this.appOperationAddress = appOperationAddress;
		}

		public PartnerDetail getPartnerDetail() {
			return this.partnerDetail;
		}

		public void setPartnerDetail(PartnerDetail partnerDetail) {
			this.partnerDetail = partnerDetail;
		}

		public static class AiStaffListItem {

			private String staffId;

			private String staffName;

			private String staffType;

			private String status;

			public String getStaffId() {
				return this.staffId;
			}

			public void setStaffId(String staffId) {
				this.staffId = staffId;
			}

			public String getStaffName() {
				return this.staffName;
			}

			public void setStaffName(String staffName) {
				this.staffName = staffName;
			}

			public String getStaffType() {
				return this.staffType;
			}

			public void setStaffType(String staffType) {
				this.staffType = staffType;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class AppServiceListItem {

			private String name;

			private String gmtCreate;

			private String gmtModified;

			private String bizId;

			private String serviceType;

			private String serviceTypeText;

			private String userId;

			private String status;

			private Integer deleted;

			private String startTime;

			private String endTime;

			private String slug;

			private String instanceBizId;

			private String espBizId;

			private Profile1 profile1;

			private OperationAddress operationAddress;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
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

			public String getBizId() {
				return this.bizId;
			}

			public void setBizId(String bizId) {
				this.bizId = bizId;
			}

			public String getServiceType() {
				return this.serviceType;
			}

			public void setServiceType(String serviceType) {
				this.serviceType = serviceType;
			}

			public String getServiceTypeText() {
				return this.serviceTypeText;
			}

			public void setServiceTypeText(String serviceTypeText) {
				this.serviceTypeText = serviceTypeText;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getDeleted() {
				return this.deleted;
			}

			public void setDeleted(Integer deleted) {
				this.deleted = deleted;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getSlug() {
				return this.slug;
			}

			public void setSlug(String slug) {
				this.slug = slug;
			}

			public String getInstanceBizId() {
				return this.instanceBizId;
			}

			public void setInstanceBizId(String instanceBizId) {
				this.instanceBizId = instanceBizId;
			}

			public String getEspBizId() {
				return this.espBizId;
			}

			public void setEspBizId(String espBizId) {
				this.espBizId = espBizId;
			}

			public Profile1 getProfile1() {
				return this.profile1;
			}

			public void setProfile1(Profile1 profile1) {
				this.profile1 = profile1;
			}

			public OperationAddress getOperationAddress() {
				return this.operationAddress;
			}

			public void setOperationAddress(OperationAddress operationAddress) {
				this.operationAddress = operationAddress;
			}

			public static class Profile1 {

				private String bizId;

				private String designType;

				private String designTypeText;

				private String serviceSpec;

				private String serviceSpecText;

				private String orderId;

				private String instanceId;

				public String getBizId() {
					return this.bizId;
				}

				public void setBizId(String bizId) {
					this.bizId = bizId;
				}

				public String getDesignType() {
					return this.designType;
				}

				public void setDesignType(String designType) {
					this.designType = designType;
				}

				public String getDesignTypeText() {
					return this.designTypeText;
				}

				public void setDesignTypeText(String designTypeText) {
					this.designTypeText = designTypeText;
				}

				public String getServiceSpec() {
					return this.serviceSpec;
				}

				public void setServiceSpec(String serviceSpec) {
					this.serviceSpec = serviceSpec;
				}

				public String getServiceSpecText() {
					return this.serviceSpecText;
				}

				public void setServiceSpecText(String serviceSpecText) {
					this.serviceSpecText = serviceSpecText;
				}

				public String getOrderId() {
					return this.orderId;
				}

				public void setOrderId(String orderId) {
					this.orderId = orderId;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}
			}

			public static class OperationAddress {

				private List<ActionsItem> actions;

				public List<ActionsItem> getActions() {
					return this.actions;
				}

				public void setActions(List<ActionsItem> actions) {
					this.actions = actions;
				}

				public static class ActionsItem {

					private String actionKey;

					private String actionText;

					private String href;

					private Boolean enable;

					public String getActionKey() {
						return this.actionKey;
					}

					public void setActionKey(String actionKey) {
						this.actionKey = actionKey;
					}

					public String getActionText() {
						return this.actionText;
					}

					public void setActionText(String actionText) {
						this.actionText = actionText;
					}

					public String getHref() {
						return this.href;
					}

					public void setHref(String href) {
						this.href = href;
					}

					public Boolean getEnable() {
						return this.enable;
					}

					public void setEnable(Boolean enable) {
						this.enable = enable;
					}
				}
			}
		}

		public static class TagsItem {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}

		public static class Profile {

			private String commodityCode;

			private String payTime;

			private String bizId;

			private String templateId;

			private String templateEtag;

			private String orderId;

			private String seoSite;

			private String customerService;

			private String applicationType;

			private String applicationTypeText;

			private String deployArea;

			private String siteVersion;

			private String siteVersionText;

			private String ordTime;

			private String source;

			private String instanceId;

			public String getCommodityCode() {
				return this.commodityCode;
			}

			public void setCommodityCode(String commodityCode) {
				this.commodityCode = commodityCode;
			}

			public String getPayTime() {
				return this.payTime;
			}

			public void setPayTime(String payTime) {
				this.payTime = payTime;
			}

			public String getBizId() {
				return this.bizId;
			}

			public void setBizId(String bizId) {
				this.bizId = bizId;
			}

			public String getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(String templateId) {
				this.templateId = templateId;
			}

			public String getTemplateEtag() {
				return this.templateEtag;
			}

			public void setTemplateEtag(String templateEtag) {
				this.templateEtag = templateEtag;
			}

			public String getOrderId() {
				return this.orderId;
			}

			public void setOrderId(String orderId) {
				this.orderId = orderId;
			}

			public String getSeoSite() {
				return this.seoSite;
			}

			public void setSeoSite(String seoSite) {
				this.seoSite = seoSite;
			}

			public String getCustomerService() {
				return this.customerService;
			}

			public void setCustomerService(String customerService) {
				this.customerService = customerService;
			}

			public String getApplicationType() {
				return this.applicationType;
			}

			public void setApplicationType(String applicationType) {
				this.applicationType = applicationType;
			}

			public String getApplicationTypeText() {
				return this.applicationTypeText;
			}

			public void setApplicationTypeText(String applicationTypeText) {
				this.applicationTypeText = applicationTypeText;
			}

			public String getDeployArea() {
				return this.deployArea;
			}

			public void setDeployArea(String deployArea) {
				this.deployArea = deployArea;
			}

			public String getSiteVersion() {
				return this.siteVersion;
			}

			public void setSiteVersion(String siteVersion) {
				this.siteVersion = siteVersion;
			}

			public String getSiteVersionText() {
				return this.siteVersionText;
			}

			public void setSiteVersionText(String siteVersionText) {
				this.siteVersionText = siteVersionText;
			}

			public String getOrdTime() {
				return this.ordTime;
			}

			public void setOrdTime(String ordTime) {
				this.ordTime = ordTime;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}
		}

		public static class AppOperationAddress {

			private List<ActionsItem3> actions2;

			public List<ActionsItem3> getActions2() {
				return this.actions2;
			}

			public void setActions2(List<ActionsItem3> actions2) {
				this.actions2 = actions2;
			}

			public static class ActionsItem3 {

				private String actionKey;

				private String actionText;

				private String href;

				private Boolean enable;

				public String getActionKey() {
					return this.actionKey;
				}

				public void setActionKey(String actionKey) {
					this.actionKey = actionKey;
				}

				public String getActionText() {
					return this.actionText;
				}

				public void setActionText(String actionText) {
					this.actionText = actionText;
				}

				public String getHref() {
					return this.href;
				}

				public void setHref(String href) {
					this.href = href;
				}

				public Boolean getEnable() {
					return this.enable;
				}

				public void setEnable(Boolean enable) {
					this.enable = enable;
				}
			}
		}

		public static class PartnerDetail {

			private String status;

			private String partnerId;

			private BindData bindData;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getPartnerId() {
				return this.partnerId;
			}

			public void setPartnerId(String partnerId) {
				this.partnerId = partnerId;
			}

			public BindData getBindData() {
				return this.bindData;
			}

			public void setBindData(BindData bindData) {
				this.bindData = bindData;
			}

			public static class BindData {

				private String id;

				private String gmtCreate;

				private String gmtModified;

				private String partnerId;

				private String userId;

				private String parentPk;

				private String mobile;

				private String bizId;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
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

				public String getPartnerId() {
					return this.partnerId;
				}

				public void setPartnerId(String partnerId) {
					this.partnerId = partnerId;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getParentPk() {
					return this.parentPk;
				}

				public void setParentPk(String parentPk) {
					this.parentPk = parentPk;
				}

				public String getMobile() {
					return this.mobile;
				}

				public void setMobile(String mobile) {
					this.mobile = mobile;
				}

				public String getBizId() {
					return this.bizId;
				}

				public void setBizId(String bizId) {
					this.bizId = bizId;
				}
			}
		}
	}

	@Override
	public ListAppInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListAppInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
