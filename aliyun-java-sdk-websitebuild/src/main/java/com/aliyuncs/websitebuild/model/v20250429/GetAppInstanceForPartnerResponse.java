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
import com.aliyuncs.websitebuild.transform.v20250429.GetAppInstanceForPartnerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAppInstanceForPartnerResponse extends AcsResponse {

	private String requestId;

	private String dynamicCode;

	private String dynamicMessage;

	private Boolean synchro;

	private String accessDeniedDetail;

	private String rootErrorMsg;

	private String rootErrorCode;

	private Boolean allowRetry;

	private String appName;

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

		private String gmtCreate;

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

		private String orderId;

		private String siteHost;

		private String espBizId;

		private Integer deleted;

		private String env;

		private String designSpecBizId;

		private String sourceType;

		private String version;

		private List<AppServiceListItem> appServiceList;

		private List<AiStaffListItem> aiStaffList;

		private List<RelatedInstanceListItem> relatedInstanceList;

		private PartnerDetail partnerDetail;

		private AppDesignSpec appDesignSpec;

		private AppOperationAddress appOperationAddress;

		private Profile profile;

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

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
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

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
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

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public List<AppServiceListItem> getAppServiceList() {
			return this.appServiceList;
		}

		public void setAppServiceList(List<AppServiceListItem> appServiceList) {
			this.appServiceList = appServiceList;
		}

		public List<AiStaffListItem> getAiStaffList() {
			return this.aiStaffList;
		}

		public void setAiStaffList(List<AiStaffListItem> aiStaffList) {
			this.aiStaffList = aiStaffList;
		}

		public List<RelatedInstanceListItem> getRelatedInstanceList() {
			return this.relatedInstanceList;
		}

		public void setRelatedInstanceList(List<RelatedInstanceListItem> relatedInstanceList) {
			this.relatedInstanceList = relatedInstanceList;
		}

		public PartnerDetail getPartnerDetail() {
			return this.partnerDetail;
		}

		public void setPartnerDetail(PartnerDetail partnerDetail) {
			this.partnerDetail = partnerDetail;
		}

		public AppDesignSpec getAppDesignSpec() {
			return this.appDesignSpec;
		}

		public void setAppDesignSpec(AppDesignSpec appDesignSpec) {
			this.appDesignSpec = appDesignSpec;
		}

		public AppOperationAddress getAppOperationAddress() {
			return this.appOperationAddress;
		}

		public void setAppOperationAddress(AppOperationAddress appOperationAddress) {
			this.appOperationAddress = appOperationAddress;
		}

		public Profile getProfile() {
			return this.profile;
		}

		public void setProfile(Profile profile) {
			this.profile = profile;
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

			private String orderId;

			private String slug;

			private String instanceBizId;

			private String espBizId;

			private List<NodeListItem> nodeList;

			private Group group;

			private OperationAddress operationAddress;

			private Profile1 profile1;

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

			public String getOrderId() {
				return this.orderId;
			}

			public void setOrderId(String orderId) {
				this.orderId = orderId;
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

			public List<NodeListItem> getNodeList() {
				return this.nodeList;
			}

			public void setNodeList(List<NodeListItem> nodeList) {
				this.nodeList = nodeList;
			}

			public Group getGroup() {
				return this.group;
			}

			public void setGroup(Group group) {
				this.group = group;
			}

			public OperationAddress getOperationAddress() {
				return this.operationAddress;
			}

			public void setOperationAddress(OperationAddress operationAddress) {
				this.operationAddress = operationAddress;
			}

			public Profile1 getProfile1() {
				return this.profile1;
			}

			public void setProfile1(Profile1 profile1) {
				this.profile1 = profile1;
			}

			public static class NodeListItem {

				private Integer finalStepNo;

				private Long finishTime;

				private Boolean isContainerNode;

				private String nodeId;

				private String nodeName;

				private String nodeStatus;

				private String operatorRole;

				private Integer stepNo;

				private String parentNodeId;

				private List<String> children;

				public Integer getFinalStepNo() {
					return this.finalStepNo;
				}

				public void setFinalStepNo(Integer finalStepNo) {
					this.finalStepNo = finalStepNo;
				}

				public Long getFinishTime() {
					return this.finishTime;
				}

				public void setFinishTime(Long finishTime) {
					this.finishTime = finishTime;
				}

				public Boolean getIsContainerNode() {
					return this.isContainerNode;
				}

				public void setIsContainerNode(Boolean isContainerNode) {
					this.isContainerNode = isContainerNode;
				}

				public String getNodeId() {
					return this.nodeId;
				}

				public void setNodeId(String nodeId) {
					this.nodeId = nodeId;
				}

				public String getNodeName() {
					return this.nodeName;
				}

				public void setNodeName(String nodeName) {
					this.nodeName = nodeName;
				}

				public String getNodeStatus() {
					return this.nodeStatus;
				}

				public void setNodeStatus(String nodeStatus) {
					this.nodeStatus = nodeStatus;
				}

				public String getOperatorRole() {
					return this.operatorRole;
				}

				public void setOperatorRole(String operatorRole) {
					this.operatorRole = operatorRole;
				}

				public Integer getStepNo() {
					return this.stepNo;
				}

				public void setStepNo(Integer stepNo) {
					this.stepNo = stepNo;
				}

				public String getParentNodeId() {
					return this.parentNodeId;
				}

				public void setParentNodeId(String parentNodeId) {
					this.parentNodeId = parentNodeId;
				}

				public List<String> getChildren() {
					return this.children;
				}

				public void setChildren(List<String> children) {
					this.children = children;
				}
			}

			public static class Group {

				private String id;

				private String name;

				private String url;

				private String qrCode;

				private String type;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getUrl() {
					return this.url;
				}

				public void setUrl(String url) {
					this.url = url;
				}

				public String getQrCode() {
					return this.qrCode;
				}

				public void setQrCode(String qrCode) {
					this.qrCode = qrCode;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}

			public static class OperationAddress {

				private String renewBuyUrl;

				private String upgradeBuyUrl;

				private String serverDeliveryUrl;

				private String instanceLoginUrl;

				private String designUrl;

				private String aiDesignUrl;

				private String aiCustomerConfigUrl;

				private String appPublishUrl;

				private List<Action> actions;

				private List<DashboardAction> dashboardActions;

				public String getRenewBuyUrl() {
					return this.renewBuyUrl;
				}

				public void setRenewBuyUrl(String renewBuyUrl) {
					this.renewBuyUrl = renewBuyUrl;
				}

				public String getUpgradeBuyUrl() {
					return this.upgradeBuyUrl;
				}

				public void setUpgradeBuyUrl(String upgradeBuyUrl) {
					this.upgradeBuyUrl = upgradeBuyUrl;
				}

				public String getServerDeliveryUrl() {
					return this.serverDeliveryUrl;
				}

				public void setServerDeliveryUrl(String serverDeliveryUrl) {
					this.serverDeliveryUrl = serverDeliveryUrl;
				}

				public String getInstanceLoginUrl() {
					return this.instanceLoginUrl;
				}

				public void setInstanceLoginUrl(String instanceLoginUrl) {
					this.instanceLoginUrl = instanceLoginUrl;
				}

				public String getDesignUrl() {
					return this.designUrl;
				}

				public void setDesignUrl(String designUrl) {
					this.designUrl = designUrl;
				}

				public String getAiDesignUrl() {
					return this.aiDesignUrl;
				}

				public void setAiDesignUrl(String aiDesignUrl) {
					this.aiDesignUrl = aiDesignUrl;
				}

				public String getAiCustomerConfigUrl() {
					return this.aiCustomerConfigUrl;
				}

				public void setAiCustomerConfigUrl(String aiCustomerConfigUrl) {
					this.aiCustomerConfigUrl = aiCustomerConfigUrl;
				}

				public String getAppPublishUrl() {
					return this.appPublishUrl;
				}

				public void setAppPublishUrl(String appPublishUrl) {
					this.appPublishUrl = appPublishUrl;
				}

				public List<Action> getActions() {
					return this.actions;
				}

				public void setActions(List<Action> actions) {
					this.actions = actions;
				}

				public List<DashboardAction> getDashboardActions() {
					return this.dashboardActions;
				}

				public void setDashboardActions(List<DashboardAction> dashboardActions) {
					this.dashboardActions = dashboardActions;
				}

				public static class Action {

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

				public static class DashboardAction {

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

			public static class Profile1 {

				private String id;

				private String gmtCreate;

				private String gmtModified;

				private String bizId;

				private String designType;

				private String designTypeText;

				private String serviceSpec;

				private String serviceSpecText;

				private String orderId;

				private String lxInstanceId;

				private String upgradeStatus;

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

				public String getLxInstanceId() {
					return this.lxInstanceId;
				}

				public void setLxInstanceId(String lxInstanceId) {
					this.lxInstanceId = lxInstanceId;
				}

				public String getUpgradeStatus() {
					return this.upgradeStatus;
				}

				public void setUpgradeStatus(String upgradeStatus) {
					this.upgradeStatus = upgradeStatus;
				}
			}
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

		public static class RelatedInstanceListItem {

			private String gmtCreate;

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

			private String orderId;

			private String siteHost;

			private String espBizId;

			private Integer deleted;

			private String env;

			private String designSpecBizId;

			private String sourceType;

			private String version;

			private Profile2 profile2;

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

			public String getOrderId() {
				return this.orderId;
			}

			public void setOrderId(String orderId) {
				this.orderId = orderId;
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

			public String getEnv() {
				return this.env;
			}

			public void setEnv(String env) {
				this.env = env;
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

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public Profile2 getProfile2() {
				return this.profile2;
			}

			public void setProfile2(Profile2 profile2) {
				this.profile2 = profile2;
			}

			public static class Profile2 {

				private String commodityCode;

				private String gmtCreate;

				private String gmtModified;

				private String payTime;

				private String bizId;

				private String templateId;

				private String templateEtag;

				private String bindCname;

				private String domainList;

				private String siteLogo;

				private String previewUrl;

				private String editorUrl;

				private String adminUrl;

				private String icpbaNo;

				private String imageList;

				private String textList;

				private String orderId;

				private String seoSite;

				private String customerService;

				private String applicationType;

				private String applicationTypeText;

				private String deployArea;

				private String siteVersion;

				private String siteVersionText;

				private Integer orderNum;

				private String ordTime;

				private String source;

				private String lxInstanceId;

				private String partnerId;

				private String thumbnail;

				private String upgradeStatus;

				public String getCommodityCode() {
					return this.commodityCode;
				}

				public void setCommodityCode(String commodityCode) {
					this.commodityCode = commodityCode;
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

				public String getBindCname() {
					return this.bindCname;
				}

				public void setBindCname(String bindCname) {
					this.bindCname = bindCname;
				}

				public String getDomainList() {
					return this.domainList;
				}

				public void setDomainList(String domainList) {
					this.domainList = domainList;
				}

				public String getSiteLogo() {
					return this.siteLogo;
				}

				public void setSiteLogo(String siteLogo) {
					this.siteLogo = siteLogo;
				}

				public String getPreviewUrl() {
					return this.previewUrl;
				}

				public void setPreviewUrl(String previewUrl) {
					this.previewUrl = previewUrl;
				}

				public String getEditorUrl() {
					return this.editorUrl;
				}

				public void setEditorUrl(String editorUrl) {
					this.editorUrl = editorUrl;
				}

				public String getAdminUrl() {
					return this.adminUrl;
				}

				public void setAdminUrl(String adminUrl) {
					this.adminUrl = adminUrl;
				}

				public String getIcpbaNo() {
					return this.icpbaNo;
				}

				public void setIcpbaNo(String icpbaNo) {
					this.icpbaNo = icpbaNo;
				}

				public String getImageList() {
					return this.imageList;
				}

				public void setImageList(String imageList) {
					this.imageList = imageList;
				}

				public String getTextList() {
					return this.textList;
				}

				public void setTextList(String textList) {
					this.textList = textList;
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

				public Integer getOrderNum() {
					return this.orderNum;
				}

				public void setOrderNum(Integer orderNum) {
					this.orderNum = orderNum;
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

				public String getLxInstanceId() {
					return this.lxInstanceId;
				}

				public void setLxInstanceId(String lxInstanceId) {
					this.lxInstanceId = lxInstanceId;
				}

				public String getPartnerId() {
					return this.partnerId;
				}

				public void setPartnerId(String partnerId) {
					this.partnerId = partnerId;
				}

				public String getThumbnail() {
					return this.thumbnail;
				}

				public void setThumbnail(String thumbnail) {
					this.thumbnail = thumbnail;
				}

				public String getUpgradeStatus() {
					return this.upgradeStatus;
				}

				public void setUpgradeStatus(String upgradeStatus) {
					this.upgradeStatus = upgradeStatus;
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

				private String gmtCreate;

				private String gmtModified;

				private String partnerId;

				private String aliyunPk;

				private String parentPk;

				private String mobile;

				private String bizId;

				private String userDisplayName;

				private String grantAliyunPk;

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

				public String getAliyunPk() {
					return this.aliyunPk;
				}

				public void setAliyunPk(String aliyunPk) {
					this.aliyunPk = aliyunPk;
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

				public String getUserDisplayName() {
					return this.userDisplayName;
				}

				public void setUserDisplayName(String userDisplayName) {
					this.userDisplayName = userDisplayName;
				}

				public String getGrantAliyunPk() {
					return this.grantAliyunPk;
				}

				public void setGrantAliyunPk(String grantAliyunPk) {
					this.grantAliyunPk = grantAliyunPk;
				}
			}
		}

		public static class AppDesignSpec {

			private String bizId;

			private String userId;

			private String companyName;

			private String siteTitle;

			private String businessScope;

			private String siteLogo;

			private String siteGoals;

			private String siteStyle;

			private String colorStyle;

			private String siteSlogan;

			private Boolean bilingual;

			private String deployArea;

			private String referenceWebsite;

			private String siteType;

			private String mainBusiness;

			private String siteLanguage;

			private Long id;

			private String gmtCreate;

			private String gmtModified;

			public String getBizId() {
				return this.bizId;
			}

			public void setBizId(String bizId) {
				this.bizId = bizId;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getCompanyName() {
				return this.companyName;
			}

			public void setCompanyName(String companyName) {
				this.companyName = companyName;
			}

			public String getSiteTitle() {
				return this.siteTitle;
			}

			public void setSiteTitle(String siteTitle) {
				this.siteTitle = siteTitle;
			}

			public String getBusinessScope() {
				return this.businessScope;
			}

			public void setBusinessScope(String businessScope) {
				this.businessScope = businessScope;
			}

			public String getSiteLogo() {
				return this.siteLogo;
			}

			public void setSiteLogo(String siteLogo) {
				this.siteLogo = siteLogo;
			}

			public String getSiteGoals() {
				return this.siteGoals;
			}

			public void setSiteGoals(String siteGoals) {
				this.siteGoals = siteGoals;
			}

			public String getSiteStyle() {
				return this.siteStyle;
			}

			public void setSiteStyle(String siteStyle) {
				this.siteStyle = siteStyle;
			}

			public String getColorStyle() {
				return this.colorStyle;
			}

			public void setColorStyle(String colorStyle) {
				this.colorStyle = colorStyle;
			}

			public String getSiteSlogan() {
				return this.siteSlogan;
			}

			public void setSiteSlogan(String siteSlogan) {
				this.siteSlogan = siteSlogan;
			}

			public Boolean getBilingual() {
				return this.bilingual;
			}

			public void setBilingual(Boolean bilingual) {
				this.bilingual = bilingual;
			}

			public String getDeployArea() {
				return this.deployArea;
			}

			public void setDeployArea(String deployArea) {
				this.deployArea = deployArea;
			}

			public String getReferenceWebsite() {
				return this.referenceWebsite;
			}

			public void setReferenceWebsite(String referenceWebsite) {
				this.referenceWebsite = referenceWebsite;
			}

			public String getSiteType() {
				return this.siteType;
			}

			public void setSiteType(String siteType) {
				this.siteType = siteType;
			}

			public String getMainBusiness() {
				return this.mainBusiness;
			}

			public void setMainBusiness(String mainBusiness) {
				this.mainBusiness = mainBusiness;
			}

			public String getSiteLanguage() {
				return this.siteLanguage;
			}

			public void setSiteLanguage(String siteLanguage) {
				this.siteLanguage = siteLanguage;
			}

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
		}

		public static class AppOperationAddress {

			private String renewBuyUrl;

			private String upgradeBuyUrl;

			private String serverDeliveryUrl;

			private String instanceLoginUrl;

			private String designUrl;

			private String aiDesignUrl;

			private String aiCustomerConfigUrl;

			private String appPublishUrl;

			private List<Action5> actions3;

			private List<DashboardAction6> dashboardActions4;

			public String getRenewBuyUrl() {
				return this.renewBuyUrl;
			}

			public void setRenewBuyUrl(String renewBuyUrl) {
				this.renewBuyUrl = renewBuyUrl;
			}

			public String getUpgradeBuyUrl() {
				return this.upgradeBuyUrl;
			}

			public void setUpgradeBuyUrl(String upgradeBuyUrl) {
				this.upgradeBuyUrl = upgradeBuyUrl;
			}

			public String getServerDeliveryUrl() {
				return this.serverDeliveryUrl;
			}

			public void setServerDeliveryUrl(String serverDeliveryUrl) {
				this.serverDeliveryUrl = serverDeliveryUrl;
			}

			public String getInstanceLoginUrl() {
				return this.instanceLoginUrl;
			}

			public void setInstanceLoginUrl(String instanceLoginUrl) {
				this.instanceLoginUrl = instanceLoginUrl;
			}

			public String getDesignUrl() {
				return this.designUrl;
			}

			public void setDesignUrl(String designUrl) {
				this.designUrl = designUrl;
			}

			public String getAiDesignUrl() {
				return this.aiDesignUrl;
			}

			public void setAiDesignUrl(String aiDesignUrl) {
				this.aiDesignUrl = aiDesignUrl;
			}

			public String getAiCustomerConfigUrl() {
				return this.aiCustomerConfigUrl;
			}

			public void setAiCustomerConfigUrl(String aiCustomerConfigUrl) {
				this.aiCustomerConfigUrl = aiCustomerConfigUrl;
			}

			public String getAppPublishUrl() {
				return this.appPublishUrl;
			}

			public void setAppPublishUrl(String appPublishUrl) {
				this.appPublishUrl = appPublishUrl;
			}

			public List<Action5> getActions3() {
				return this.actions3;
			}

			public void setActions3(List<Action5> actions3) {
				this.actions3 = actions3;
			}

			public List<DashboardAction6> getDashboardActions4() {
				return this.dashboardActions4;
			}

			public void setDashboardActions4(List<DashboardAction6> dashboardActions4) {
				this.dashboardActions4 = dashboardActions4;
			}

			public static class Action5 {

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

			public static class DashboardAction6 {

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

		public static class Profile {

			private String commodityCode;

			private String gmtCreate;

			private String gmtModified;

			private String payTime;

			private String bizId;

			private String templateId;

			private String templateEtag;

			private String bindCname;

			private String domainList;

			private String siteLogo;

			private String previewUrl;

			private String editorUrl;

			private String adminUrl;

			private String icpbaNo;

			private String imageList;

			private String textList;

			private String orderId;

			private String seoSite;

			private String customerService;

			private String applicationType;

			private String applicationTypeText;

			private String deployArea;

			private String siteVersion;

			private String siteVersionText;

			private Integer orderNum;

			private String ordTime;

			private String source;

			private String lxInstanceId;

			private String partnerId;

			private String thumbnail;

			private String upgradeStatus;

			public String getCommodityCode() {
				return this.commodityCode;
			}

			public void setCommodityCode(String commodityCode) {
				this.commodityCode = commodityCode;
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

			public String getBindCname() {
				return this.bindCname;
			}

			public void setBindCname(String bindCname) {
				this.bindCname = bindCname;
			}

			public String getDomainList() {
				return this.domainList;
			}

			public void setDomainList(String domainList) {
				this.domainList = domainList;
			}

			public String getSiteLogo() {
				return this.siteLogo;
			}

			public void setSiteLogo(String siteLogo) {
				this.siteLogo = siteLogo;
			}

			public String getPreviewUrl() {
				return this.previewUrl;
			}

			public void setPreviewUrl(String previewUrl) {
				this.previewUrl = previewUrl;
			}

			public String getEditorUrl() {
				return this.editorUrl;
			}

			public void setEditorUrl(String editorUrl) {
				this.editorUrl = editorUrl;
			}

			public String getAdminUrl() {
				return this.adminUrl;
			}

			public void setAdminUrl(String adminUrl) {
				this.adminUrl = adminUrl;
			}

			public String getIcpbaNo() {
				return this.icpbaNo;
			}

			public void setIcpbaNo(String icpbaNo) {
				this.icpbaNo = icpbaNo;
			}

			public String getImageList() {
				return this.imageList;
			}

			public void setImageList(String imageList) {
				this.imageList = imageList;
			}

			public String getTextList() {
				return this.textList;
			}

			public void setTextList(String textList) {
				this.textList = textList;
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

			public Integer getOrderNum() {
				return this.orderNum;
			}

			public void setOrderNum(Integer orderNum) {
				this.orderNum = orderNum;
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

			public String getLxInstanceId() {
				return this.lxInstanceId;
			}

			public void setLxInstanceId(String lxInstanceId) {
				this.lxInstanceId = lxInstanceId;
			}

			public String getPartnerId() {
				return this.partnerId;
			}

			public void setPartnerId(String partnerId) {
				this.partnerId = partnerId;
			}

			public String getThumbnail() {
				return this.thumbnail;
			}

			public void setThumbnail(String thumbnail) {
				this.thumbnail = thumbnail;
			}

			public String getUpgradeStatus() {
				return this.upgradeStatus;
			}

			public void setUpgradeStatus(String upgradeStatus) {
				this.upgradeStatus = upgradeStatus;
			}
		}
	}

	@Override
	public GetAppInstanceForPartnerResponse getInstance(UnmarshallerContext context) {
		return	GetAppInstanceForPartnerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
