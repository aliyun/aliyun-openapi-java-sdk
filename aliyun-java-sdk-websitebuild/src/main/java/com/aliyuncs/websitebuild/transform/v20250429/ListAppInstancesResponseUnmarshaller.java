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

import com.aliyuncs.websitebuild.model.v20250429.ListAppInstancesResponse;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstancesResponse.DataItem;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstancesResponse.DataItem.AiStaffListItem;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstancesResponse.DataItem.AppOperationAddress;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstancesResponse.DataItem.AppOperationAddress.ActionsItem3;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstancesResponse.DataItem.AppServiceListItem;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstancesResponse.DataItem.AppServiceListItem.OperationAddress;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstancesResponse.DataItem.AppServiceListItem.OperationAddress.ActionsItem;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstancesResponse.DataItem.AppServiceListItem.Profile1;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstancesResponse.DataItem.Profile;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppInstancesResponseUnmarshaller {

	public static ListAppInstancesResponse unmarshall(ListAppInstancesResponse listAppInstancesResponse, UnmarshallerContext _ctx) {
		
		listAppInstancesResponse.setRequestId(_ctx.stringValue("ListAppInstancesResponse.RequestId"));
		listAppInstancesResponse.setDynamicCode(_ctx.stringValue("ListAppInstancesResponse.DynamicCode"));
		listAppInstancesResponse.setDynamicMessage(_ctx.stringValue("ListAppInstancesResponse.DynamicMessage"));
		listAppInstancesResponse.setSynchro(_ctx.booleanValue("ListAppInstancesResponse.Synchro"));
		listAppInstancesResponse.setAccessDeniedDetail(_ctx.stringValue("ListAppInstancesResponse.AccessDeniedDetail"));
		listAppInstancesResponse.setRootErrorMsg(_ctx.stringValue("ListAppInstancesResponse.RootErrorMsg"));
		listAppInstancesResponse.setRootErrorCode(_ctx.stringValue("ListAppInstancesResponse.RootErrorCode"));
		listAppInstancesResponse.setCurrentPageNum(_ctx.integerValue("ListAppInstancesResponse.CurrentPageNum"));
		listAppInstancesResponse.setPageSize(_ctx.integerValue("ListAppInstancesResponse.PageSize"));
		listAppInstancesResponse.setTotalPageNum(_ctx.integerValue("ListAppInstancesResponse.TotalPageNum"));
		listAppInstancesResponse.setPrePage(_ctx.booleanValue("ListAppInstancesResponse.PrePage"));
		listAppInstancesResponse.setNextPage(_ctx.booleanValue("ListAppInstancesResponse.NextPage"));
		listAppInstancesResponse.setResultLimit(_ctx.booleanValue("ListAppInstancesResponse.ResultLimit"));
		listAppInstancesResponse.setAllowRetry(_ctx.booleanValue("ListAppInstancesResponse.AllowRetry"));
		listAppInstancesResponse.setAppName(_ctx.stringValue("ListAppInstancesResponse.AppName"));
		listAppInstancesResponse.setNextToken(_ctx.stringValue("ListAppInstancesResponse.NextToken"));
		listAppInstancesResponse.setMaxResults(_ctx.integerValue("ListAppInstancesResponse.MaxResults"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAppInstancesResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ListAppInstancesResponse.ErrorArgs["+ i +"]"));
		}
		listAppInstancesResponse.setErrorArgs(errorArgs);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppInstancesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreateTime(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].CreateTime"));
			dataItem.setGmtModified(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].GmtModified"));
			dataItem.setBizId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].BizId"));
			dataItem.setName(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Name"));
			dataItem.setUserId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].UserId"));
			dataItem.setAppType(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppType"));
			dataItem.setAppSubType(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppSubType"));
			dataItem.setBuildType(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].BuildType"));
			dataItem.setDescription(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Description"));
			dataItem.setIconUrl(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].IconUrl"));
			dataItem.setThumbnailUrl(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].ThumbnailUrl"));
			dataItem.setSlug(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Slug"));
			dataItem.setStatus(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Status"));
			dataItem.setStatusText(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].StatusText"));
			dataItem.setDesignSpecId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].DesignSpecId"));
			dataItem.setGmtPublish(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].GmtPublish"));
			dataItem.setGmtDelete(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].GmtDelete"));
			dataItem.setStartTime(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].StartTime"));
			dataItem.setEndTime(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].EndTime"));
			dataItem.setDomain(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Domain"));
			dataItem.setSiteHost(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].SiteHost"));
			dataItem.setEspBizId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].EspBizId"));
			dataItem.setDeleted(_ctx.integerValue("ListAppInstancesResponse.Data["+ i +"].Deleted"));
			dataItem.setDesignSpecBizId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].DesignSpecBizId"));
			dataItem.setSourceType(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].SourceType"));

			Profile profile = new Profile();
			profile.setCommodityCode(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Profile.CommodityCode"));
			profile.setPayTime(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Profile.PayTime"));
			profile.setBizId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Profile.BizId"));
			profile.setTemplateId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Profile.TemplateId"));
			profile.setTemplateEtag(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Profile.TemplateEtag"));
			profile.setOrderId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Profile.OrderId"));
			profile.setSeoSite(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Profile.SeoSite"));
			profile.setCustomerService(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Profile.CustomerService"));
			profile.setApplicationType(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Profile.ApplicationType"));
			profile.setApplicationTypeText(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Profile.ApplicationTypeText"));
			profile.setDeployArea(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Profile.DeployArea"));
			profile.setSiteVersion(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Profile.SiteVersion"));
			profile.setSiteVersionText(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Profile.SiteVersionText"));
			profile.setOrdTime(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Profile.OrdTime"));
			profile.setSource(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Profile.Source"));
			profile.setInstanceId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].Profile.InstanceId"));
			dataItem.setProfile(profile);

			AppOperationAddress appOperationAddress = new AppOperationAddress();

			List<ActionsItem3> actions2 = new ArrayList<ActionsItem3>();
			for (int j = 0; j < _ctx.lengthValue("ListAppInstancesResponse.Data["+ i +"].AppOperationAddress.Actions.Length"); j++) {
				ActionsItem3 actionsItem3 = new ActionsItem3();
				actionsItem3.setActionKey(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppOperationAddress.Actions["+ j +"].ActionKey"));
				actionsItem3.setActionText(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppOperationAddress.Actions["+ j +"].ActionText"));
				actionsItem3.setHref(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppOperationAddress.Actions["+ j +"].Href"));
				actionsItem3.setEnable(_ctx.booleanValue("ListAppInstancesResponse.Data["+ i +"].AppOperationAddress.Actions["+ j +"].Enable"));

				actions2.add(actionsItem3);
			}
			appOperationAddress.setActions2(actions2);
			dataItem.setAppOperationAddress(appOperationAddress);

			List<AiStaffListItem> aiStaffList = new ArrayList<AiStaffListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAppInstancesResponse.Data["+ i +"].AiStaffList.Length"); j++) {
				AiStaffListItem aiStaffListItem = new AiStaffListItem();
				aiStaffListItem.setStaffId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AiStaffList["+ j +"].StaffId"));
				aiStaffListItem.setStaffName(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AiStaffList["+ j +"].StaffName"));
				aiStaffListItem.setStaffType(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AiStaffList["+ j +"].StaffType"));
				aiStaffListItem.setStatus(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AiStaffList["+ j +"].Status"));

				aiStaffList.add(aiStaffListItem);
			}
			dataItem.setAiStaffList(aiStaffList);

			List<AppServiceListItem> appServiceList = new ArrayList<AppServiceListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList.Length"); j++) {
				AppServiceListItem appServiceListItem = new AppServiceListItem();
				appServiceListItem.setName(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].Name"));
				appServiceListItem.setGmtCreate(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].GmtCreate"));
				appServiceListItem.setGmtModified(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].GmtModified"));
				appServiceListItem.setBizId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].BizId"));
				appServiceListItem.setServiceType(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].ServiceType"));
				appServiceListItem.setServiceTypeText(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].ServiceTypeText"));
				appServiceListItem.setUserId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].UserId"));
				appServiceListItem.setStatus(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].Status"));
				appServiceListItem.setDeleted(_ctx.integerValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].Deleted"));
				appServiceListItem.setStartTime(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].StartTime"));
				appServiceListItem.setEndTime(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].EndTime"));
				appServiceListItem.setSlug(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].Slug"));
				appServiceListItem.setInstanceBizId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].InstanceBizId"));
				appServiceListItem.setEspBizId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].EspBizId"));

				Profile1 profile1 = new Profile1();
				profile1.setBizId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].Profile.BizId"));
				profile1.setDesignType(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].Profile.DesignType"));
				profile1.setDesignTypeText(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].Profile.DesignTypeText"));
				profile1.setServiceSpec(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].Profile.ServiceSpec"));
				profile1.setServiceSpecText(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].Profile.ServiceSpecText"));
				profile1.setOrderId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].Profile.OrderId"));
				profile1.setInstanceId(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].Profile.InstanceId"));
				appServiceListItem.setProfile1(profile1);

				OperationAddress operationAddress = new OperationAddress();

				List<ActionsItem> actions = new ArrayList<ActionsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].OperationAddress.Actions.Length"); k++) {
					ActionsItem actionsItem = new ActionsItem();
					actionsItem.setActionKey(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].OperationAddress.Actions["+ k +"].ActionKey"));
					actionsItem.setActionText(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].OperationAddress.Actions["+ k +"].ActionText"));
					actionsItem.setHref(_ctx.stringValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].OperationAddress.Actions["+ k +"].Href"));
					actionsItem.setEnable(_ctx.booleanValue("ListAppInstancesResponse.Data["+ i +"].AppServiceList["+ j +"].OperationAddress.Actions["+ k +"].Enable"));

					actions.add(actionsItem);
				}
				operationAddress.setActions(actions);
				appServiceListItem.setOperationAddress(operationAddress);

				appServiceList.add(appServiceListItem);
			}
			dataItem.setAppServiceList(appServiceList);

			data.add(dataItem);
		}
		listAppInstancesResponse.setData(data);
	 
	 	return listAppInstancesResponse;
	}
}