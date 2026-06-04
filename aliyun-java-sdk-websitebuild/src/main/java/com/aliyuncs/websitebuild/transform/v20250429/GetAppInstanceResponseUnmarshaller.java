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

import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceResponse.Module.AiStaffListItem;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceResponse.Module.AppOperationAddress;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceResponse.Module.AppOperationAddress.ActionsItem4;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceResponse.Module.AppOperationAddress.DashboardActionsItem5;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceResponse.Module.AppServiceListItem;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceResponse.Module.AppServiceListItem.OperationAddress;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceResponse.Module.AppServiceListItem.OperationAddress.ActionsItem;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceResponse.Module.AppServiceListItem.OperationAddress.DashboardActionsItem;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceResponse.Module.AppServiceListItem.Profile1;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceResponse.Module.PartnerDetail;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceResponse.Module.PartnerDetail.BindData;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceResponse.Module.Profile;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceResponse.Module.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppInstanceResponseUnmarshaller {

	public static GetAppInstanceResponse unmarshall(GetAppInstanceResponse getAppInstanceResponse, UnmarshallerContext _ctx) {
		
		getAppInstanceResponse.setRequestId(_ctx.stringValue("GetAppInstanceResponse.RequestId"));
		getAppInstanceResponse.setDynamicCode(_ctx.stringValue("GetAppInstanceResponse.DynamicCode"));
		getAppInstanceResponse.setDynamicMessage(_ctx.stringValue("GetAppInstanceResponse.DynamicMessage"));
		getAppInstanceResponse.setSynchro(_ctx.booleanValue("GetAppInstanceResponse.Synchro"));
		getAppInstanceResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppInstanceResponse.AccessDeniedDetail"));
		getAppInstanceResponse.setRootErrorMsg(_ctx.stringValue("GetAppInstanceResponse.RootErrorMsg"));
		getAppInstanceResponse.setRootErrorCode(_ctx.stringValue("GetAppInstanceResponse.RootErrorCode"));
		getAppInstanceResponse.setAllowRetry(_ctx.booleanValue("GetAppInstanceResponse.AllowRetry"));
		getAppInstanceResponse.setAppName(_ctx.stringValue("GetAppInstanceResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppInstanceResponse.ErrorArgs["+ i +"]"));
		}
		getAppInstanceResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setCreateTime(_ctx.stringValue("GetAppInstanceResponse.Module.CreateTime"));
		module.setGmtModified(_ctx.stringValue("GetAppInstanceResponse.Module.GmtModified"));
		module.setBizId(_ctx.stringValue("GetAppInstanceResponse.Module.BizId"));
		module.setName(_ctx.stringValue("GetAppInstanceResponse.Module.Name"));
		module.setUserId(_ctx.stringValue("GetAppInstanceResponse.Module.UserId"));
		module.setAppType(_ctx.stringValue("GetAppInstanceResponse.Module.AppType"));
		module.setAppSubType(_ctx.stringValue("GetAppInstanceResponse.Module.AppSubType"));
		module.setBuildType(_ctx.stringValue("GetAppInstanceResponse.Module.BuildType"));
		module.setDescription(_ctx.stringValue("GetAppInstanceResponse.Module.Description"));
		module.setIconUrl(_ctx.stringValue("GetAppInstanceResponse.Module.IconUrl"));
		module.setThumbnailUrl(_ctx.stringValue("GetAppInstanceResponse.Module.ThumbnailUrl"));
		module.setSlug(_ctx.stringValue("GetAppInstanceResponse.Module.Slug"));
		module.setStatus(_ctx.stringValue("GetAppInstanceResponse.Module.Status"));
		module.setStatusText(_ctx.stringValue("GetAppInstanceResponse.Module.StatusText"));
		module.setDesignSpecId(_ctx.stringValue("GetAppInstanceResponse.Module.DesignSpecId"));
		module.setGmtPublish(_ctx.stringValue("GetAppInstanceResponse.Module.GmtPublish"));
		module.setGmtDelete(_ctx.stringValue("GetAppInstanceResponse.Module.GmtDelete"));
		module.setStartTime(_ctx.stringValue("GetAppInstanceResponse.Module.StartTime"));
		module.setEndTime(_ctx.stringValue("GetAppInstanceResponse.Module.EndTime"));
		module.setDomain(_ctx.stringValue("GetAppInstanceResponse.Module.Domain"));
		module.setSiteHost(_ctx.stringValue("GetAppInstanceResponse.Module.SiteHost"));
		module.setEspBizId(_ctx.stringValue("GetAppInstanceResponse.Module.EspBizId"));
		module.setDeleted(_ctx.integerValue("GetAppInstanceResponse.Module.Deleted"));
		module.setDesignSpecBizId(_ctx.stringValue("GetAppInstanceResponse.Module.DesignSpecBizId"));
		module.setSourceType(_ctx.stringValue("GetAppInstanceResponse.Module.SourceType"));
		module.setResourceGroupId(_ctx.stringValue("GetAppInstanceResponse.Module.ResourceGroupId"));

		Profile profile = new Profile();
		profile.setCommodityCode(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.CommodityCode"));
		profile.setPayTime(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.PayTime"));
		profile.setBizId(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.BizId"));
		profile.setTemplateId(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.TemplateId"));
		profile.setTemplateEtag(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.TemplateEtag"));
		profile.setOrderId(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.OrderId"));
		profile.setSeoSite(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.SeoSite"));
		profile.setCustomerService(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.CustomerService"));
		profile.setApplicationType(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.ApplicationType"));
		profile.setApplicationTypeText(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.ApplicationTypeText"));
		profile.setDeployArea(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.DeployArea"));
		profile.setSiteVersion(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.SiteVersion"));
		profile.setSiteVersionText(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.SiteVersionText"));
		profile.setOrdTime(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.OrdTime"));
		profile.setSource(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.Source"));
		profile.setInstanceId(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.InstanceId"));
		profile.setPreviewUrl(_ctx.stringValue("GetAppInstanceResponse.Module.Profile.PreviewUrl"));
		module.setProfile(profile);

		AppOperationAddress appOperationAddress = new AppOperationAddress();
		appOperationAddress.setAppPublishUrl(_ctx.stringValue("GetAppInstanceResponse.Module.AppOperationAddress.AppPublishUrl"));
		appOperationAddress.setRenewBuyUrl(_ctx.stringValue("GetAppInstanceResponse.Module.AppOperationAddress.RenewBuyUrl"));
		appOperationAddress.setUpgradeBuyUrl(_ctx.stringValue("GetAppInstanceResponse.Module.AppOperationAddress.UpgradeBuyUrl"));
		appOperationAddress.setServerDeliveryUrl(_ctx.stringValue("GetAppInstanceResponse.Module.AppOperationAddress.ServerDeliveryUrl"));
		appOperationAddress.setInstanceLoginUrl(_ctx.stringValue("GetAppInstanceResponse.Module.AppOperationAddress.InstanceLoginUrl"));
		appOperationAddress.setDesignUrl(_ctx.stringValue("GetAppInstanceResponse.Module.AppOperationAddress.DesignUrl"));
		appOperationAddress.setAiDesignUrl(_ctx.stringValue("GetAppInstanceResponse.Module.AppOperationAddress.AiDesignUrl"));
		appOperationAddress.setAiCustomerConfigUrl(_ctx.stringValue("GetAppInstanceResponse.Module.AppOperationAddress.AiCustomerConfigUrl"));

		List<ActionsItem4> actions2 = new ArrayList<ActionsItem4>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceResponse.Module.AppOperationAddress.Actions.Length"); i++) {
			ActionsItem4 actionsItem4 = new ActionsItem4();
			actionsItem4.setActionKey(_ctx.stringValue("GetAppInstanceResponse.Module.AppOperationAddress.Actions["+ i +"].ActionKey"));
			actionsItem4.setActionText(_ctx.stringValue("GetAppInstanceResponse.Module.AppOperationAddress.Actions["+ i +"].ActionText"));
			actionsItem4.setHref(_ctx.stringValue("GetAppInstanceResponse.Module.AppOperationAddress.Actions["+ i +"].Href"));
			actionsItem4.setEnable(_ctx.booleanValue("GetAppInstanceResponse.Module.AppOperationAddress.Actions["+ i +"].Enable"));

			actions2.add(actionsItem4);
		}
		appOperationAddress.setActions2(actions2);

		List<DashboardActionsItem5> dashboardActions3 = new ArrayList<DashboardActionsItem5>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceResponse.Module.AppOperationAddress.DashboardActions.Length"); i++) {
			DashboardActionsItem5 dashboardActionsItem5 = new DashboardActionsItem5();
			dashboardActionsItem5.setActionKey(_ctx.stringValue("GetAppInstanceResponse.Module.AppOperationAddress.DashboardActions["+ i +"].ActionKey"));
			dashboardActionsItem5.setActionText(_ctx.stringValue("GetAppInstanceResponse.Module.AppOperationAddress.DashboardActions["+ i +"].ActionText"));
			dashboardActionsItem5.setHref(_ctx.stringValue("GetAppInstanceResponse.Module.AppOperationAddress.DashboardActions["+ i +"].Href"));
			dashboardActionsItem5.setEnable(_ctx.booleanValue("GetAppInstanceResponse.Module.AppOperationAddress.DashboardActions["+ i +"].Enable"));

			dashboardActions3.add(dashboardActionsItem5);
		}
		appOperationAddress.setDashboardActions3(dashboardActions3);
		module.setAppOperationAddress(appOperationAddress);

		PartnerDetail partnerDetail = new PartnerDetail();
		partnerDetail.setStatus(_ctx.stringValue("GetAppInstanceResponse.Module.PartnerDetail.Status"));
		partnerDetail.setPartnerId(_ctx.stringValue("GetAppInstanceResponse.Module.PartnerDetail.PartnerId"));

		BindData bindData = new BindData();
		bindData.setId(_ctx.stringValue("GetAppInstanceResponse.Module.PartnerDetail.BindData.Id"));
		bindData.setGmtCreate(_ctx.stringValue("GetAppInstanceResponse.Module.PartnerDetail.BindData.GmtCreate"));
		bindData.setGmtModified(_ctx.stringValue("GetAppInstanceResponse.Module.PartnerDetail.BindData.GmtModified"));
		bindData.setPartnerId(_ctx.stringValue("GetAppInstanceResponse.Module.PartnerDetail.BindData.PartnerId"));
		bindData.setUserId(_ctx.stringValue("GetAppInstanceResponse.Module.PartnerDetail.BindData.UserId"));
		bindData.setParentPk(_ctx.stringValue("GetAppInstanceResponse.Module.PartnerDetail.BindData.ParentPk"));
		bindData.setMobile(_ctx.stringValue("GetAppInstanceResponse.Module.PartnerDetail.BindData.Mobile"));
		bindData.setBizId(_ctx.stringValue("GetAppInstanceResponse.Module.PartnerDetail.BindData.BizId"));
		partnerDetail.setBindData(bindData);
		module.setPartnerDetail(partnerDetail);

		List<AiStaffListItem> aiStaffList = new ArrayList<AiStaffListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceResponse.Module.AiStaffList.Length"); i++) {
			AiStaffListItem aiStaffListItem = new AiStaffListItem();
			aiStaffListItem.setStaffId(_ctx.stringValue("GetAppInstanceResponse.Module.AiStaffList["+ i +"].StaffId"));
			aiStaffListItem.setStaffName(_ctx.stringValue("GetAppInstanceResponse.Module.AiStaffList["+ i +"].StaffName"));
			aiStaffListItem.setStaffType(_ctx.stringValue("GetAppInstanceResponse.Module.AiStaffList["+ i +"].StaffType"));
			aiStaffListItem.setStatus(_ctx.stringValue("GetAppInstanceResponse.Module.AiStaffList["+ i +"].Status"));

			aiStaffList.add(aiStaffListItem);
		}
		module.setAiStaffList(aiStaffList);

		List<AppServiceListItem> appServiceList = new ArrayList<AppServiceListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceResponse.Module.AppServiceList.Length"); i++) {
			AppServiceListItem appServiceListItem = new AppServiceListItem();
			appServiceListItem.setName(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].Name"));
			appServiceListItem.setGmtCreate(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].GmtCreate"));
			appServiceListItem.setGmtModified(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].GmtModified"));
			appServiceListItem.setBizId(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].BizId"));
			appServiceListItem.setServiceType(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].ServiceType"));
			appServiceListItem.setServiceTypeText(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].ServiceTypeText"));
			appServiceListItem.setUserId(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].UserId"));
			appServiceListItem.setStatus(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].Status"));
			appServiceListItem.setDeleted(_ctx.integerValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].Deleted"));
			appServiceListItem.setStartTime(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].StartTime"));
			appServiceListItem.setEndTime(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].EndTime"));
			appServiceListItem.setSlug(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].Slug"));
			appServiceListItem.setInstanceBizId(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].InstanceBizId"));
			appServiceListItem.setEspBizId(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].EspBizId"));

			Profile1 profile1 = new Profile1();
			profile1.setBizId(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].Profile.BizId"));
			profile1.setDesignType(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].Profile.DesignType"));
			profile1.setDesignTypeText(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].Profile.DesignTypeText"));
			profile1.setServiceSpec(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].Profile.ServiceSpec"));
			profile1.setServiceSpecText(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].Profile.ServiceSpecText"));
			profile1.setOrderId(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].Profile.OrderId"));
			profile1.setInstanceId(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].Profile.InstanceId"));
			appServiceListItem.setProfile1(profile1);

			OperationAddress operationAddress = new OperationAddress();
			operationAddress.setAppPublishUrl(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.AppPublishUrl"));
			operationAddress.setRenewBuyUrl(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.RenewBuyUrl"));
			operationAddress.setUpgradeBuyUrl(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.UpgradeBuyUrl"));
			operationAddress.setServerDeliveryUrl(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.ServerDeliveryUrl"));
			operationAddress.setInstanceLoginUrl(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.InstanceLoginUrl"));
			operationAddress.setDesignUrl(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.DesignUrl"));
			operationAddress.setAiDesignUrl(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.AiDesignUrl"));
			operationAddress.setAiCustomerConfigUrl(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.AiCustomerConfigUrl"));

			List<ActionsItem> actions = new ArrayList<ActionsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.Actions.Length"); j++) {
				ActionsItem actionsItem = new ActionsItem();
				actionsItem.setActionKey(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.Actions["+ j +"].ActionKey"));
				actionsItem.setActionText(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.Actions["+ j +"].ActionText"));
				actionsItem.setHref(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.Actions["+ j +"].Href"));
				actionsItem.setEnable(_ctx.booleanValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.Actions["+ j +"].Enable"));

				actions.add(actionsItem);
			}
			operationAddress.setActions(actions);

			List<DashboardActionsItem> dashboardActions = new ArrayList<DashboardActionsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.DashboardActions.Length"); j++) {
				DashboardActionsItem dashboardActionsItem = new DashboardActionsItem();
				dashboardActionsItem.setActionKey(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.DashboardActions["+ j +"].ActionKey"));
				dashboardActionsItem.setActionText(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.DashboardActions["+ j +"].ActionText"));
				dashboardActionsItem.setHref(_ctx.stringValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.DashboardActions["+ j +"].Href"));
				dashboardActionsItem.setEnable(_ctx.booleanValue("GetAppInstanceResponse.Module.AppServiceList["+ i +"].OperationAddress.DashboardActions["+ j +"].Enable"));

				dashboardActions.add(dashboardActionsItem);
			}
			operationAddress.setDashboardActions(dashboardActions);
			appServiceListItem.setOperationAddress(operationAddress);

			appServiceList.add(appServiceListItem);
		}
		module.setAppServiceList(appServiceList);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceResponse.Module.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagKey(_ctx.stringValue("GetAppInstanceResponse.Module.Tags["+ i +"].TagKey"));
			tagsItem.setTagValue(_ctx.stringValue("GetAppInstanceResponse.Module.Tags["+ i +"].TagValue"));

			tags.add(tagsItem);
		}
		module.setTags(tags);
		getAppInstanceResponse.setModule(module);
	 
	 	return getAppInstanceResponse;
	}
}