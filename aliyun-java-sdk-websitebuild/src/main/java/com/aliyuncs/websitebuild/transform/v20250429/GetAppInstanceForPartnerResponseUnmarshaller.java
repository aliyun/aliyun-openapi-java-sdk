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

package com.aliyuncs.websitebuild.transform.v20250429;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.AiStaffListItem;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.AppDesignSpec;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.AppOperationAddress;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.AppOperationAddress.Action5;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.AppOperationAddress.DashboardAction6;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.AppServiceListItem;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.AppServiceListItem.Group;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.AppServiceListItem.NodeListItem;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.AppServiceListItem.OperationAddress;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.AppServiceListItem.OperationAddress.Action;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.AppServiceListItem.OperationAddress.DashboardAction;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.AppServiceListItem.Profile1;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.PartnerDetail;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.PartnerDetail.BindData;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.Profile;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.RelatedInstanceListItem;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceForPartnerResponse.Module.RelatedInstanceListItem.Profile2;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppInstanceForPartnerResponseUnmarshaller {

	public static GetAppInstanceForPartnerResponse unmarshall(GetAppInstanceForPartnerResponse getAppInstanceForPartnerResponse, UnmarshallerContext _ctx) {
		
		getAppInstanceForPartnerResponse.setRequestId(_ctx.stringValue("GetAppInstanceForPartnerResponse.RequestId"));
		getAppInstanceForPartnerResponse.setDynamicCode(_ctx.stringValue("GetAppInstanceForPartnerResponse.DynamicCode"));
		getAppInstanceForPartnerResponse.setDynamicMessage(_ctx.stringValue("GetAppInstanceForPartnerResponse.DynamicMessage"));
		getAppInstanceForPartnerResponse.setSynchro(_ctx.booleanValue("GetAppInstanceForPartnerResponse.Synchro"));
		getAppInstanceForPartnerResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppInstanceForPartnerResponse.AccessDeniedDetail"));
		getAppInstanceForPartnerResponse.setRootErrorMsg(_ctx.stringValue("GetAppInstanceForPartnerResponse.RootErrorMsg"));
		getAppInstanceForPartnerResponse.setRootErrorCode(_ctx.stringValue("GetAppInstanceForPartnerResponse.RootErrorCode"));
		getAppInstanceForPartnerResponse.setAllowRetry(_ctx.booleanValue("GetAppInstanceForPartnerResponse.AllowRetry"));
		getAppInstanceForPartnerResponse.setAppName(_ctx.stringValue("GetAppInstanceForPartnerResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceForPartnerResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppInstanceForPartnerResponse.ErrorArgs["+ i +"]"));
		}
		getAppInstanceForPartnerResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setGmtCreate(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.GmtCreate"));
		module.setGmtModified(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.GmtModified"));
		module.setBizId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.BizId"));
		module.setName(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Name"));
		module.setUserId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.UserId"));
		module.setAppType(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppType"));
		module.setAppSubType(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppSubType"));
		module.setBuildType(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.BuildType"));
		module.setDescription(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Description"));
		module.setIconUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.IconUrl"));
		module.setThumbnailUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.ThumbnailUrl"));
		module.setSlug(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Slug"));
		module.setStatus(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Status"));
		module.setStatusText(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.StatusText"));
		module.setDesignSpecId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.DesignSpecId"));
		module.setGmtPublish(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.GmtPublish"));
		module.setGmtDelete(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.GmtDelete"));
		module.setStartTime(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.StartTime"));
		module.setEndTime(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.EndTime"));
		module.setDomain(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Domain"));
		module.setOrderId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.OrderId"));
		module.setSiteHost(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.SiteHost"));
		module.setEspBizId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.EspBizId"));
		module.setDeleted(_ctx.integerValue("GetAppInstanceForPartnerResponse.Module.Deleted"));
		module.setEnv(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Env"));
		module.setDesignSpecBizId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.DesignSpecBizId"));
		module.setSourceType(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.SourceType"));
		module.setVersion(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Version"));

		PartnerDetail partnerDetail = new PartnerDetail();
		partnerDetail.setStatus(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.PartnerDetail.Status"));
		partnerDetail.setPartnerId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.PartnerDetail.PartnerId"));

		BindData bindData = new BindData();
		bindData.setGmtCreate(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.PartnerDetail.BindData.GmtCreate"));
		bindData.setGmtModified(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.PartnerDetail.BindData.GmtModified"));
		bindData.setPartnerId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.PartnerDetail.BindData.PartnerId"));
		bindData.setAliyunPk(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.PartnerDetail.BindData.AliyunPk"));
		bindData.setParentPk(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.PartnerDetail.BindData.ParentPk"));
		bindData.setMobile(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.PartnerDetail.BindData.Mobile"));
		bindData.setBizId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.PartnerDetail.BindData.BizId"));
		bindData.setUserDisplayName(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.PartnerDetail.BindData.UserDisplayName"));
		bindData.setGrantAliyunPk(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.PartnerDetail.BindData.GrantAliyunPk"));
		partnerDetail.setBindData(bindData);
		module.setPartnerDetail(partnerDetail);

		AppDesignSpec appDesignSpec = new AppDesignSpec();
		appDesignSpec.setBizId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.BizId"));
		appDesignSpec.setUserId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.UserId"));
		appDesignSpec.setCompanyName(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.CompanyName"));
		appDesignSpec.setSiteTitle(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.SiteTitle"));
		appDesignSpec.setBusinessScope(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.BusinessScope"));
		appDesignSpec.setSiteLogo(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.SiteLogo"));
		appDesignSpec.setSiteGoals(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.SiteGoals"));
		appDesignSpec.setSiteStyle(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.SiteStyle"));
		appDesignSpec.setColorStyle(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.ColorStyle"));
		appDesignSpec.setSiteSlogan(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.SiteSlogan"));
		appDesignSpec.setBilingual(_ctx.booleanValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.Bilingual"));
		appDesignSpec.setDeployArea(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.DeployArea"));
		appDesignSpec.setReferenceWebsite(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.ReferenceWebsite"));
		appDesignSpec.setSiteType(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.SiteType"));
		appDesignSpec.setMainBusiness(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.MainBusiness"));
		appDesignSpec.setSiteLanguage(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.SiteLanguage"));
		appDesignSpec.setId(_ctx.longValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.Id"));
		appDesignSpec.setGmtCreate(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.GmtCreate"));
		appDesignSpec.setGmtModified(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppDesignSpec.GmtModified"));
		module.setAppDesignSpec(appDesignSpec);

		AppOperationAddress appOperationAddress = new AppOperationAddress();
		appOperationAddress.setRenewBuyUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.RenewBuyUrl"));
		appOperationAddress.setUpgradeBuyUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.UpgradeBuyUrl"));
		appOperationAddress.setServerDeliveryUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.ServerDeliveryUrl"));
		appOperationAddress.setInstanceLoginUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.InstanceLoginUrl"));
		appOperationAddress.setDesignUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.DesignUrl"));
		appOperationAddress.setAiDesignUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.AiDesignUrl"));
		appOperationAddress.setAiCustomerConfigUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.AiCustomerConfigUrl"));
		appOperationAddress.setAppPublishUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.AppPublishUrl"));

		List<Action5> actions3 = new ArrayList<Action5>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.Actions.Length"); i++) {
			Action5 action5 = new Action5();
			action5.setActionKey(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.Actions["+ i +"].ActionKey"));
			action5.setActionText(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.Actions["+ i +"].ActionText"));
			action5.setHref(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.Actions["+ i +"].Href"));
			action5.setEnable(_ctx.booleanValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.Actions["+ i +"].Enable"));

			actions3.add(action5);
		}
		appOperationAddress.setActions3(actions3);

		List<DashboardAction6> dashboardActions4 = new ArrayList<DashboardAction6>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.DashboardActions.Length"); i++) {
			DashboardAction6 dashboardAction6 = new DashboardAction6();
			dashboardAction6.setActionKey(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.DashboardActions["+ i +"].ActionKey"));
			dashboardAction6.setActionText(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.DashboardActions["+ i +"].ActionText"));
			dashboardAction6.setHref(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.DashboardActions["+ i +"].Href"));
			dashboardAction6.setEnable(_ctx.booleanValue("GetAppInstanceForPartnerResponse.Module.AppOperationAddress.DashboardActions["+ i +"].Enable"));

			dashboardActions4.add(dashboardAction6);
		}
		appOperationAddress.setDashboardActions4(dashboardActions4);
		module.setAppOperationAddress(appOperationAddress);

		Profile profile = new Profile();
		profile.setCommodityCode(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.CommodityCode"));
		profile.setGmtCreate(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.GmtCreate"));
		profile.setGmtModified(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.GmtModified"));
		profile.setPayTime(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.PayTime"));
		profile.setBizId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.BizId"));
		profile.setTemplateId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.TemplateId"));
		profile.setTemplateEtag(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.TemplateEtag"));
		profile.setBindCname(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.BindCname"));
		profile.setDomainList(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.DomainList"));
		profile.setSiteLogo(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.SiteLogo"));
		profile.setPreviewUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.PreviewUrl"));
		profile.setEditorUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.EditorUrl"));
		profile.setAdminUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.AdminUrl"));
		profile.setIcpbaNo(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.IcpbaNo"));
		profile.setImageList(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.ImageList"));
		profile.setTextList(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.TextList"));
		profile.setOrderId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.OrderId"));
		profile.setSeoSite(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.SeoSite"));
		profile.setCustomerService(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.CustomerService"));
		profile.setApplicationType(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.ApplicationType"));
		profile.setApplicationTypeText(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.ApplicationTypeText"));
		profile.setDeployArea(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.DeployArea"));
		profile.setSiteVersion(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.SiteVersion"));
		profile.setSiteVersionText(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.SiteVersionText"));
		profile.setOrderNum(_ctx.integerValue("GetAppInstanceForPartnerResponse.Module.Profile.OrderNum"));
		profile.setOrdTime(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.OrdTime"));
		profile.setSource(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.Source"));
		profile.setLxInstanceId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.LxInstanceId"));
		profile.setPartnerId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.PartnerId"));
		profile.setThumbnail(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.Thumbnail"));
		profile.setUpgradeStatus(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.Profile.UpgradeStatus"));
		module.setProfile(profile);

		List<AppServiceListItem> appServiceList = new ArrayList<AppServiceListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceForPartnerResponse.Module.AppServiceList.Length"); i++) {
			AppServiceListItem appServiceListItem = new AppServiceListItem();
			appServiceListItem.setName(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Name"));
			appServiceListItem.setGmtCreate(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].GmtCreate"));
			appServiceListItem.setGmtModified(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].GmtModified"));
			appServiceListItem.setBizId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].BizId"));
			appServiceListItem.setServiceType(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].ServiceType"));
			appServiceListItem.setServiceTypeText(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].ServiceTypeText"));
			appServiceListItem.setUserId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].UserId"));
			appServiceListItem.setStatus(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Status"));
			appServiceListItem.setDeleted(_ctx.integerValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Deleted"));
			appServiceListItem.setStartTime(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].StartTime"));
			appServiceListItem.setEndTime(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].EndTime"));
			appServiceListItem.setOrderId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OrderId"));
			appServiceListItem.setSlug(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Slug"));
			appServiceListItem.setInstanceBizId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].InstanceBizId"));
			appServiceListItem.setEspBizId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].EspBizId"));

			Group group = new Group();
			group.setId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Group.Id"));
			group.setName(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Group.Name"));
			group.setUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Group.Url"));
			group.setQrCode(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Group.QrCode"));
			group.setType(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Group.Type"));
			appServiceListItem.setGroup(group);

			OperationAddress operationAddress = new OperationAddress();
			operationAddress.setRenewBuyUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.RenewBuyUrl"));
			operationAddress.setUpgradeBuyUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.UpgradeBuyUrl"));
			operationAddress.setServerDeliveryUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.ServerDeliveryUrl"));
			operationAddress.setInstanceLoginUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.InstanceLoginUrl"));
			operationAddress.setDesignUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.DesignUrl"));
			operationAddress.setAiDesignUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.AiDesignUrl"));
			operationAddress.setAiCustomerConfigUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.AiCustomerConfigUrl"));
			operationAddress.setAppPublishUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.AppPublishUrl"));

			List<Action> actions = new ArrayList<Action>();
			for (int j = 0; j < _ctx.lengthValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.Actions.Length"); j++) {
				Action action = new Action();
				action.setActionKey(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.Actions["+ j +"].ActionKey"));
				action.setActionText(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.Actions["+ j +"].ActionText"));
				action.setHref(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.Actions["+ j +"].Href"));
				action.setEnable(_ctx.booleanValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.Actions["+ j +"].Enable"));

				actions.add(action);
			}
			operationAddress.setActions(actions);

			List<DashboardAction> dashboardActions = new ArrayList<DashboardAction>();
			for (int j = 0; j < _ctx.lengthValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.DashboardActions.Length"); j++) {
				DashboardAction dashboardAction = new DashboardAction();
				dashboardAction.setActionKey(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.DashboardActions["+ j +"].ActionKey"));
				dashboardAction.setActionText(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.DashboardActions["+ j +"].ActionText"));
				dashboardAction.setHref(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.DashboardActions["+ j +"].Href"));
				dashboardAction.setEnable(_ctx.booleanValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].OperationAddress.DashboardActions["+ j +"].Enable"));

				dashboardActions.add(dashboardAction);
			}
			operationAddress.setDashboardActions(dashboardActions);
			appServiceListItem.setOperationAddress(operationAddress);

			Profile1 profile1 = new Profile1();
			profile1.setId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Profile.Id"));
			profile1.setGmtCreate(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Profile.GmtCreate"));
			profile1.setGmtModified(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Profile.GmtModified"));
			profile1.setBizId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Profile.BizId"));
			profile1.setDesignType(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Profile.DesignType"));
			profile1.setDesignTypeText(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Profile.DesignTypeText"));
			profile1.setServiceSpec(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Profile.ServiceSpec"));
			profile1.setServiceSpecText(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Profile.ServiceSpecText"));
			profile1.setOrderId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Profile.OrderId"));
			profile1.setLxInstanceId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Profile.LxInstanceId"));
			profile1.setUpgradeStatus(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].Profile.UpgradeStatus"));
			appServiceListItem.setProfile1(profile1);

			List<NodeListItem> nodeList = new ArrayList<NodeListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].NodeList.Length"); j++) {
				NodeListItem nodeListItem = new NodeListItem();
				nodeListItem.setFinalStepNo(_ctx.integerValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].NodeList["+ j +"].FinalStepNo"));
				nodeListItem.setFinishTime(_ctx.longValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].NodeList["+ j +"].FinishTime"));
				nodeListItem.setIsContainerNode(_ctx.booleanValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].NodeList["+ j +"].IsContainerNode"));
				nodeListItem.setNodeId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].NodeList["+ j +"].NodeId"));
				nodeListItem.setNodeName(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].NodeList["+ j +"].NodeName"));
				nodeListItem.setNodeStatus(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].NodeList["+ j +"].NodeStatus"));
				nodeListItem.setOperatorRole(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].NodeList["+ j +"].OperatorRole"));
				nodeListItem.setStepNo(_ctx.integerValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].NodeList["+ j +"].StepNo"));
				nodeListItem.setParentNodeId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].NodeList["+ j +"].ParentNodeId"));

				List<String> children = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].NodeList["+ j +"].Children.Length"); k++) {
					children.add(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AppServiceList["+ i +"].NodeList["+ j +"].Children["+ k +"]"));
				}
				nodeListItem.setChildren(children);

				nodeList.add(nodeListItem);
			}
			appServiceListItem.setNodeList(nodeList);

			appServiceList.add(appServiceListItem);
		}
		module.setAppServiceList(appServiceList);

		List<AiStaffListItem> aiStaffList = new ArrayList<AiStaffListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceForPartnerResponse.Module.AiStaffList.Length"); i++) {
			AiStaffListItem aiStaffListItem = new AiStaffListItem();
			aiStaffListItem.setStaffId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AiStaffList["+ i +"].StaffId"));
			aiStaffListItem.setStaffName(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AiStaffList["+ i +"].StaffName"));
			aiStaffListItem.setStaffType(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AiStaffList["+ i +"].StaffType"));
			aiStaffListItem.setStatus(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.AiStaffList["+ i +"].Status"));

			aiStaffList.add(aiStaffListItem);
		}
		module.setAiStaffList(aiStaffList);

		List<RelatedInstanceListItem> relatedInstanceList = new ArrayList<RelatedInstanceListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList.Length"); i++) {
			RelatedInstanceListItem relatedInstanceListItem = new RelatedInstanceListItem();
			relatedInstanceListItem.setGmtCreate(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].GmtCreate"));
			relatedInstanceListItem.setGmtModified(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].GmtModified"));
			relatedInstanceListItem.setBizId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].BizId"));
			relatedInstanceListItem.setName(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Name"));
			relatedInstanceListItem.setUserId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].UserId"));
			relatedInstanceListItem.setAppType(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].AppType"));
			relatedInstanceListItem.setAppSubType(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].AppSubType"));
			relatedInstanceListItem.setBuildType(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].BuildType"));
			relatedInstanceListItem.setDescription(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Description"));
			relatedInstanceListItem.setIconUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].IconUrl"));
			relatedInstanceListItem.setThumbnailUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].ThumbnailUrl"));
			relatedInstanceListItem.setSlug(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Slug"));
			relatedInstanceListItem.setStatus(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Status"));
			relatedInstanceListItem.setStatusText(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].StatusText"));
			relatedInstanceListItem.setDesignSpecId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].DesignSpecId"));
			relatedInstanceListItem.setGmtPublish(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].GmtPublish"));
			relatedInstanceListItem.setGmtDelete(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].GmtDelete"));
			relatedInstanceListItem.setStartTime(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].StartTime"));
			relatedInstanceListItem.setEndTime(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].EndTime"));
			relatedInstanceListItem.setDomain(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Domain"));
			relatedInstanceListItem.setOrderId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].OrderId"));
			relatedInstanceListItem.setSiteHost(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].SiteHost"));
			relatedInstanceListItem.setEspBizId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].EspBizId"));
			relatedInstanceListItem.setDeleted(_ctx.integerValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Deleted"));
			relatedInstanceListItem.setEnv(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Env"));
			relatedInstanceListItem.setDesignSpecBizId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].DesignSpecBizId"));
			relatedInstanceListItem.setSourceType(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].SourceType"));
			relatedInstanceListItem.setVersion(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Version"));

			Profile2 profile2 = new Profile2();
			profile2.setCommodityCode(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.CommodityCode"));
			profile2.setGmtCreate(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.GmtCreate"));
			profile2.setGmtModified(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.GmtModified"));
			profile2.setPayTime(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.PayTime"));
			profile2.setBizId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.BizId"));
			profile2.setTemplateId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.TemplateId"));
			profile2.setTemplateEtag(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.TemplateEtag"));
			profile2.setBindCname(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.BindCname"));
			profile2.setDomainList(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.DomainList"));
			profile2.setSiteLogo(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.SiteLogo"));
			profile2.setPreviewUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.PreviewUrl"));
			profile2.setEditorUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.EditorUrl"));
			profile2.setAdminUrl(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.AdminUrl"));
			profile2.setIcpbaNo(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.IcpbaNo"));
			profile2.setImageList(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.ImageList"));
			profile2.setTextList(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.TextList"));
			profile2.setOrderId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.OrderId"));
			profile2.setSeoSite(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.SeoSite"));
			profile2.setCustomerService(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.CustomerService"));
			profile2.setApplicationType(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.ApplicationType"));
			profile2.setApplicationTypeText(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.ApplicationTypeText"));
			profile2.setDeployArea(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.DeployArea"));
			profile2.setSiteVersion(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.SiteVersion"));
			profile2.setSiteVersionText(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.SiteVersionText"));
			profile2.setOrderNum(_ctx.integerValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.OrderNum"));
			profile2.setOrdTime(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.OrdTime"));
			profile2.setSource(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.Source"));
			profile2.setLxInstanceId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.LxInstanceId"));
			profile2.setPartnerId(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.PartnerId"));
			profile2.setThumbnail(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.Thumbnail"));
			profile2.setUpgradeStatus(_ctx.stringValue("GetAppInstanceForPartnerResponse.Module.RelatedInstanceList["+ i +"].Profile.UpgradeStatus"));
			relatedInstanceListItem.setProfile2(profile2);

			relatedInstanceList.add(relatedInstanceListItem);
		}
		module.setRelatedInstanceList(relatedInstanceList);
		getAppInstanceForPartnerResponse.setModule(module);
	 
	 	return getAppInstanceForPartnerResponse;
	}
}