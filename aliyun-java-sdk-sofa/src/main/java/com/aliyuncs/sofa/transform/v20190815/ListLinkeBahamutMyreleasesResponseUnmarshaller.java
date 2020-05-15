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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutMyreleasesResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutMyreleasesResponse.ResultItem;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutMyreleasesResponse.ResultItem.AppGroup;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutMyreleasesResponse.ResultItem.AppGroup.AdminsItem;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutMyreleasesResponse.ResultItem.AppGroup.Creator1;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutMyreleasesResponse.ResultItem.AppGroup.ModifiyUser;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutMyreleasesResponse.ResultItem.AppGroup.Tenant;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutMyreleasesResponse.ResultItem.Creator;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutMyreleasesResponse.ResultItem.ManagersItem;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutMyreleasesResponse.ResultItem.StagesItem;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutMyreleasesResponse.ResultItem.TenantReleaseInfosItem;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutMyreleasesResponse.ResultItem.TenantReleaseInfosItem.PreEnvReleaseInfo;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutMyreleasesResponse.ResultItem.TenantReleaseInfosItem.ProdEnvReleaseInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutMyreleasesResponseUnmarshaller {

	public static ListLinkeBahamutMyreleasesResponse unmarshall(ListLinkeBahamutMyreleasesResponse listLinkeBahamutMyreleasesResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutMyreleasesResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.RequestId"));
		listLinkeBahamutMyreleasesResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.ResultCode"));
		listLinkeBahamutMyreleasesResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.ResultMessage"));
		listLinkeBahamutMyreleasesResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.ErrorMessage"));
		listLinkeBahamutMyreleasesResponse.setMessage(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Message"));
		listLinkeBahamutMyreleasesResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAfterFastDevDate(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AfterFastDevDate"));
			resultItem.setAoneReleaseId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AoneReleaseId"));
			resultItem.setAttachable(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Attachable"));
			resultItem.setBetaRelease(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].BetaRelease"));
			resultItem.setContainPreInMultiEnv(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].ContainPreInMultiEnv"));
			resultItem.setCreated(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Created"));
			resultItem.setDailyRelease(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].DailyRelease"));
			resultItem.setDeadlines(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Deadlines"));
			resultItem.setDeleted(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Deleted"));
			resultItem.setDependencies(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Dependencies"));
			resultItem.setExternalId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].ExternalId"));
			resultItem.setGreenChannelId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].GreenChannelId"));
			resultItem.setGreenChannelName(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].GreenChannelName"));
			resultItem.setGreenChannelPortalUrl(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].GreenChannelPortalUrl"));
			resultItem.setHasCreatedAppReleaseDetail(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].HasCreatedAppReleaseDetail"));
			resultItem.setId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Id"));
			resultItem.setIterationType(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].IterationType"));
			resultItem.setLastModified(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].LastModified"));
			resultItem.setMergeStartTime(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].MergeStartTime"));
			resultItem.setMultiEnvRelease(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].MultiEnvRelease"));
			resultItem.setName(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Name"));
			resultItem.setReleaseDate(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].ReleaseDate"));
			resultItem.setStatus(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Status"));
			resultItem.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TagAndMergeMasterWhenEmergency"));
			resultItem.setTenantId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantId"));
			resultItem.setTicket(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Ticket"));
			resultItem.setType(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Type"));
			resultItem.setWindowRelease(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].WindowRelease"));

			List<String> delAppMetaIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].DelAppMetaIds.Length"); j++) {
				delAppMetaIds.add(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].DelAppMetaIds["+ j +"]"));
			}
			resultItem.setDelAppMetaIds(delAppMetaIds);

			AppGroup appGroup = new AppGroup();
			appGroup.setCreated(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Created"));
			appGroup.setDeleted(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Deleted"));
			appGroup.setId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Id"));
			appGroup.setLastModified(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.LastModified"));
			appGroup.setName(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Name"));
			appGroup.setRemark(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Remark"));
			appGroup.setType(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Type"));

			List<String> appList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.AppList.Length"); j++) {
				appList.add(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.AppList["+ j +"]"));
			}
			appGroup.setAppList(appList);

			Creator1 creator1 = new Creator1();
			creator1.setAccount(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.Account"));
			creator1.setCreated(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.Created"));
			creator1.setCustomer(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.Customer"));
			creator1.setDeleted(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.Deleted"));
			creator1.setDepartment(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.Department"));
			creator1.setEmail(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.Email"));
			creator1.setEmpId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.EmpId"));
			creator1.setId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.Id"));
			creator1.setLastLogin(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.LastLogin"));
			creator1.setLastModified(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.LastModified"));
			creator1.setName(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.Name"));
			creator1.setNick(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.Nick"));
			creator1.setUid(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.Uid"));
			creator1.setUniqueId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.UniqueId"));
			creator1.setWw(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.Ww"));

			List<String> tenants3 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.Tenants.Length"); j++) {
				tenants3.add(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Creator.Tenants["+ j +"]"));
			}
			creator1.setTenants3(tenants3);
			appGroup.setCreator1(creator1);

			ModifiyUser modifiyUser = new ModifiyUser();
			modifiyUser.setAccount(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.Account"));
			modifiyUser.setCreated(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.Created"));
			modifiyUser.setCustomer(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.Customer"));
			modifiyUser.setDeleted(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.Deleted"));
			modifiyUser.setDepartment(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.Department"));
			modifiyUser.setEmail(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.Email"));
			modifiyUser.setEmpId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.EmpId"));
			modifiyUser.setId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.Id"));
			modifiyUser.setLastLogin(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.LastLogin"));
			modifiyUser.setLastModified(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.LastModified"));
			modifiyUser.setName(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.Name"));
			modifiyUser.setNick(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.Nick"));
			modifiyUser.setUid(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.Uid"));
			modifiyUser.setUniqueId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.UniqueId"));
			modifiyUser.setWw(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.Ww"));

			List<String> tenants4 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.Tenants.Length"); j++) {
				tenants4.add(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.ModifiyUser.Tenants["+ j +"]"));
			}
			modifiyUser.setTenants4(tenants4);
			appGroup.setModifiyUser(modifiyUser);

			Tenant tenant = new Tenant();
			tenant.setAccessKey(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.AccessKey"));
			tenant.setAccessSecret(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.AccessSecret"));
			tenant.setAccessToken(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.AccessToken"));
			tenant.setCreated(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.Created"));
			tenant.setCustomer(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.Customer"));
			tenant.setDeleted(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.Deleted"));
			tenant.setDisplayName(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.DisplayName"));
			tenant.setDropQualityApprovslDate(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.DropQualityApprovslDate"));
			tenant.setEndPoint(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.EndPoint"));
			tenant.setExternalId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.ExternalId"));
			tenant.setFromAliyun(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.FromAliyun"));
			tenant.setHaveNotInited(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.HaveNotInited"));
			tenant.setId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.Id"));
			tenant.setInitStep(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.InitStep"));
			tenant.setLastModified(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.LastModified"));
			tenant.setName(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.Name"));
			tenant.setOpenMyBankControl(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.OpenMyBankControl"));
			tenant.setPath(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.Path"));
			tenant.setUseConfigTypes(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.UseConfigTypes"));
			tenant.setYunYou(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.YunYou"));

			List<String> authorizedUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.AuthorizedUsers.Length"); j++) {
				authorizedUsers.add(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.AuthorizedUsers["+ j +"]"));
			}
			tenant.setAuthorizedUsers(authorizedUsers);

			List<String> configTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.ConfigTypes.Length"); j++) {
				configTypes.add(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.ConfigTypes["+ j +"]"));
			}
			tenant.setConfigTypes(configTypes);

			List<String> sitMergeTrialList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.SitMergeTrialList.Length"); j++) {
				sitMergeTrialList.add(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.SitMergeTrialList["+ j +"]"));
			}
			tenant.setSitMergeTrialList(sitMergeTrialList);

			List<String> trialList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.TrialList.Length"); j++) {
				trialList.add(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.TrialList["+ j +"]"));
			}
			tenant.setTrialList(trialList);

			List<String> zoneModeList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.ZoneModeList.Length"); j++) {
				zoneModeList.add(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Tenant.ZoneModeList["+ j +"]"));
			}
			tenant.setZoneModeList(zoneModeList);
			appGroup.setTenant(tenant);

			List<AdminsItem> admins = new ArrayList<AdminsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins.Length"); j++) {
				AdminsItem adminsItem = new AdminsItem();
				adminsItem.setAccount(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].Account"));
				adminsItem.setCreated(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].Created"));
				adminsItem.setCustomer(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].Customer"));
				adminsItem.setDeleted(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].Deleted"));
				adminsItem.setDepartment(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].Department"));
				adminsItem.setEmail(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].Email"));
				adminsItem.setEmpId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].EmpId"));
				adminsItem.setId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].Id"));
				adminsItem.setLastLogin(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].LastLogin"));
				adminsItem.setLastModified(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].LastModified"));
				adminsItem.setName(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].Name"));
				adminsItem.setNick(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].Nick"));
				adminsItem.setUid(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].Uid"));
				adminsItem.setUniqueId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].UniqueId"));
				adminsItem.setWw(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].Ww"));

				List<String> tenants2 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].Tenants.Length"); k++) {
					tenants2.add(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].AppGroup.Admins["+ j +"].Tenants["+ k +"]"));
				}
				adminsItem.setTenants2(tenants2);

				admins.add(adminsItem);
			}
			appGroup.setAdmins(admins);
			resultItem.setAppGroup(appGroup);

			Creator creator = new Creator();
			creator.setAccount(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.Account"));
			creator.setCreated(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.Created"));
			creator.setCustomer(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.Customer"));
			creator.setDeleted(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.Deleted"));
			creator.setDepartment(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.Department"));
			creator.setEmail(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.Email"));
			creator.setEmpId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.EmpId"));
			creator.setId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.Id"));
			creator.setLastLogin(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.LastLogin"));
			creator.setLastModified(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.LastModified"));
			creator.setName(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.Name"));
			creator.setNick(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.Nick"));
			creator.setUid(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.Uid"));
			creator.setUniqueId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.UniqueId"));
			creator.setWw(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.Ww"));

			List<String> tenants5 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.Tenants.Length"); j++) {
				tenants5.add(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Creator.Tenants["+ j +"]"));
			}
			creator.setTenants5(tenants5);
			resultItem.setCreator(creator);

			List<ManagersItem> managers = new ArrayList<ManagersItem>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers.Length"); j++) {
				ManagersItem managersItem = new ManagersItem();
				managersItem.setAccount(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].Account"));
				managersItem.setCreated(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].Created"));
				managersItem.setCustomer(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].Customer"));
				managersItem.setDeleted(_ctx.booleanValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].Deleted"));
				managersItem.setDepartment(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].Department"));
				managersItem.setEmail(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].Email"));
				managersItem.setEmpId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].EmpId"));
				managersItem.setId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].Id"));
				managersItem.setLastLogin(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].LastLogin"));
				managersItem.setLastModified(_ctx.longValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].LastModified"));
				managersItem.setName(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].Name"));
				managersItem.setNick(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].Nick"));
				managersItem.setUid(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].Uid"));
				managersItem.setUniqueId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].UniqueId"));
				managersItem.setWw(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].Ww"));

				List<String> tenants = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].Tenants.Length"); k++) {
					tenants.add(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Managers["+ j +"].Tenants["+ k +"]"));
				}
				managersItem.setTenants(tenants);

				managers.add(managersItem);
			}
			resultItem.setManagers(managers);

			List<StagesItem> stages = new ArrayList<StagesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Stages.Length"); j++) {
				StagesItem stagesItem = new StagesItem();
				stagesItem.setDisplayName(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Stages["+ j +"].DisplayName"));
				stagesItem.setName(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Stages["+ j +"].Name"));
				stagesItem.setReleaseStatus(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Stages["+ j +"].ReleaseStatus"));
				stagesItem.setStatus(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].Stages["+ j +"].Status"));

				stages.add(stagesItem);
			}
			resultItem.setStages(stages);

			List<TenantReleaseInfosItem> tenantReleaseInfos = new ArrayList<TenantReleaseInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos.Length"); j++) {
				TenantReleaseInfosItem tenantReleaseInfosItem = new TenantReleaseInfosItem();
				tenantReleaseInfosItem.setCloudTenantId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos["+ j +"].CloudTenantId"));
				tenantReleaseInfosItem.setCloudTenantName(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos["+ j +"].CloudTenantName"));

				PreEnvReleaseInfo preEnvReleaseInfo = new PreEnvReleaseInfo();
				preEnvReleaseInfo.setEnvId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos["+ j +"].PreEnvReleaseInfo.EnvId"));
				preEnvReleaseInfo.setInfo(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos["+ j +"].PreEnvReleaseInfo.Info"));
				preEnvReleaseInfo.setStatus(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos["+ j +"].PreEnvReleaseInfo.Status"));
				preEnvReleaseInfo.setTicket(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos["+ j +"].PreEnvReleaseInfo.Ticket"));
				preEnvReleaseInfo.setType(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos["+ j +"].PreEnvReleaseInfo.Type"));
				preEnvReleaseInfo.setWorkspaceId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos["+ j +"].PreEnvReleaseInfo.WorkspaceId"));
				preEnvReleaseInfo.setWorkspaceName(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos["+ j +"].PreEnvReleaseInfo.WorkspaceName"));
				tenantReleaseInfosItem.setPreEnvReleaseInfo(preEnvReleaseInfo);

				ProdEnvReleaseInfo prodEnvReleaseInfo = new ProdEnvReleaseInfo();
				prodEnvReleaseInfo.setEnvId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos["+ j +"].ProdEnvReleaseInfo.EnvId"));
				prodEnvReleaseInfo.setInfo(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos["+ j +"].ProdEnvReleaseInfo.Info"));
				prodEnvReleaseInfo.setStatus(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos["+ j +"].ProdEnvReleaseInfo.Status"));
				prodEnvReleaseInfo.setTicket(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos["+ j +"].ProdEnvReleaseInfo.Ticket"));
				prodEnvReleaseInfo.setType(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos["+ j +"].ProdEnvReleaseInfo.Type"));
				prodEnvReleaseInfo.setWorkspaceId(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos["+ j +"].ProdEnvReleaseInfo.WorkspaceId"));
				prodEnvReleaseInfo.setWorkspaceName(_ctx.stringValue("ListLinkeBahamutMyreleasesResponse.Result["+ i +"].TenantReleaseInfos["+ j +"].ProdEnvReleaseInfo.WorkspaceName"));
				tenantReleaseInfosItem.setProdEnvReleaseInfo(prodEnvReleaseInfo);

				tenantReleaseInfos.add(tenantReleaseInfosItem);
			}
			resultItem.setTenantReleaseInfos(tenantReleaseInfos);

			result.add(resultItem);
		}
		listLinkeBahamutMyreleasesResponse.setResult(result);
	 
	 	return listLinkeBahamutMyreleasesResponse;
	}
}