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

import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data.AppExtraInfosItem;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data.AppLevel;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data.AppOwner;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitectsItem;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwnersItem;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data.AppOwner.BackupOpsesItem;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitectsItem;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwnersItem;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data.AppOwner.DevOwner;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data.AppOwner.Ops;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data.AppOwner.TestOwner;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data.Archetype;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data.CodeRepository;
import com.aliyuncs.sofa.model.v20190815.GetCASApplicationDetailResponse.Data.LifeCycle;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCASApplicationDetailResponseUnmarshaller {

	public static GetCASApplicationDetailResponse unmarshall(GetCASApplicationDetailResponse getCASApplicationDetailResponse, UnmarshallerContext _ctx) {
		
		getCASApplicationDetailResponse.setRequestId(_ctx.stringValue("GetCASApplicationDetailResponse.RequestId"));
		getCASApplicationDetailResponse.setResultCode(_ctx.stringValue("GetCASApplicationDetailResponse.ResultCode"));
		getCASApplicationDetailResponse.setResultMessage(_ctx.stringValue("GetCASApplicationDetailResponse.ResultMessage"));

		Data data = new Data();
		data.setAppDomainId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppDomainId"));
		data.setAppDomainName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppDomainName"));
		data.setAppLevelName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppLevelName"));
		data.setBuildpackVersion(_ctx.stringValue("GetCASApplicationDetailResponse.Data.BuildpackVersion"));
		data.setChineseName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.ChineseName"));
		data.setContainerCount(_ctx.longValue("GetCASApplicationDetailResponse.Data.ContainerCount"));
		data.setDatabaseCount(_ctx.longValue("GetCASApplicationDetailResponse.Data.DatabaseCount"));
		data.setDescription(_ctx.stringValue("GetCASApplicationDetailResponse.Data.Description"));
		data.setExtraParams(_ctx.stringValue("GetCASApplicationDetailResponse.Data.ExtraParams"));
		data.setId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.Id"));
		data.setIsService(_ctx.booleanValue("GetCASApplicationDetailResponse.Data.IsService"));
		data.setName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.Name"));
		data.setOcsCount(_ctx.longValue("GetCASApplicationDetailResponse.Data.OcsCount"));
		data.setOwnerId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.OwnerId"));
		data.setOwnerName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.OwnerName"));
		data.setPackageCount(_ctx.longValue("GetCASApplicationDetailResponse.Data.PackageCount"));
		data.setRealOwnerName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.RealOwnerName"));
		data.setSlbCount(_ctx.longValue("GetCASApplicationDetailResponse.Data.SlbCount"));
		data.setStackId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.StackId"));
		data.setStackName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.StackName"));
		data.setStackVersion(_ctx.stringValue("GetCASApplicationDetailResponse.Data.StackVersion"));
		data.setStatus(_ctx.stringValue("GetCASApplicationDetailResponse.Data.Status"));
		data.setTags(_ctx.stringValue("GetCASApplicationDetailResponse.Data.Tags"));
		data.setTenantId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.TenantId"));
		data.setUtcCreate(_ctx.stringValue("GetCASApplicationDetailResponse.Data.UtcCreate"));
		data.setUtcModified(_ctx.stringValue("GetCASApplicationDetailResponse.Data.UtcModified"));
		data.setWorkspaceId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.WorkspaceId"));

		List<String> domainNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCASApplicationDetailResponse.Data.DomainNames.Length"); i++) {
			domainNames.add(_ctx.stringValue("GetCASApplicationDetailResponse.Data.DomainNames["+ i +"]"));
		}
		data.setDomainNames(domainNames);

		AppLevel appLevel = new AppLevel();
		appLevel.setCreatorId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppLevel.CreatorId"));
		appLevel.setId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppLevel.Id"));
		appLevel.setName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppLevel.Name"));
		appLevel.setTenantId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppLevel.TenantId"));
		appLevel.setUtcCreate(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppLevel.UtcCreate"));
		appLevel.setUtcModified(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppLevel.UtcModified"));
		data.setAppLevel(appLevel);

		AppOwner appOwner = new AppOwner();

		DevArchitect devArchitect = new DevArchitect();
		devArchitect.setCustomerId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.CustomerId"));
		devArchitect.setEmail(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.Email"));
		devArchitect.setEnName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.EnName"));
		devArchitect.setGmtCreate(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.GmtCreate"));
		devArchitect.setGmtModified(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.GmtModified"));
		devArchitect.setId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.Id"));
		devArchitect.setImAccount(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.ImAccount"));
		devArchitect.setLastLogonTime(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.LastLogonTime"));
		devArchitect.setLoginName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.LoginName"));
		devArchitect.setMobile(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.Mobile"));
		devArchitect.setNation(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.Nation"));
		devArchitect.setNationCountry(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.NationCountry"));
		devArchitect.setNickName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.NickName"));
		devArchitect.setPersonalPhoto(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.PersonalPhoto"));
		devArchitect.setPhone(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.Phone"));
		devArchitect.setRealName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.RealName"));
		devArchitect.setSex(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.Sex"));
		devArchitect.setSourceSystem(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.SourceSystem"));
		devArchitect.setSourceUserId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.SourceUserId"));
		devArchitect.setStatus(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.Status"));
		devArchitect.setType(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.Type"));
		devArchitect.setWorkNo(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevArchitect.WorkNo"));
		appOwner.setDevArchitect(devArchitect);

		DevOwner devOwner = new DevOwner();
		devOwner.setCustomerId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.CustomerId"));
		devOwner.setEmail(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.Email"));
		devOwner.setEnName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.EnName"));
		devOwner.setGmtCreate(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.GmtCreate"));
		devOwner.setGmtModified(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.GmtModified"));
		devOwner.setId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.Id"));
		devOwner.setImAccount(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.ImAccount"));
		devOwner.setLastLogonTime(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.LastLogonTime"));
		devOwner.setLoginName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.LoginName"));
		devOwner.setMobile(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.Mobile"));
		devOwner.setNation(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.Nation"));
		devOwner.setNationCountry(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.NationCountry"));
		devOwner.setNickName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.NickName"));
		devOwner.setPersonalPhoto(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.PersonalPhoto"));
		devOwner.setPhone(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.Phone"));
		devOwner.setRealName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.RealName"));
		devOwner.setSex(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.Sex"));
		devOwner.setSourceSystem(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.SourceSystem"));
		devOwner.setSourceUserId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.SourceUserId"));
		devOwner.setStatus(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.Status"));
		devOwner.setType(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.Type"));
		devOwner.setWorkNo(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.DevOwner.WorkNo"));
		appOwner.setDevOwner(devOwner);

		Ops ops = new Ops();
		ops.setCustomerId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.CustomerId"));
		ops.setEmail(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.Email"));
		ops.setEnName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.EnName"));
		ops.setGmtCreate(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.GmtCreate"));
		ops.setGmtModified(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.GmtModified"));
		ops.setId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.Id"));
		ops.setImAccount(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.ImAccount"));
		ops.setLastLogonTime(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.LastLogonTime"));
		ops.setLoginName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.LoginName"));
		ops.setMobile(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.Mobile"));
		ops.setNation(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.Nation"));
		ops.setNationCountry(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.NationCountry"));
		ops.setNickName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.NickName"));
		ops.setPersonalPhoto(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.PersonalPhoto"));
		ops.setPhone(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.Phone"));
		ops.setRealName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.RealName"));
		ops.setSex(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.Sex"));
		ops.setSourceSystem(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.SourceSystem"));
		ops.setSourceUserId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.SourceUserId"));
		ops.setStatus(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.Status"));
		ops.setType(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.Type"));
		ops.setWorkNo(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.Ops.WorkNo"));
		appOwner.setOps(ops);

		TestArchitect testArchitect = new TestArchitect();
		testArchitect.setCustomerId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.CustomerId"));
		testArchitect.setEmail(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.Email"));
		testArchitect.setEnName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.EnName"));
		testArchitect.setGmtCreate(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.GmtCreate"));
		testArchitect.setGmtModified(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.GmtModified"));
		testArchitect.setId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.Id"));
		testArchitect.setImAccount(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.ImAccount"));
		testArchitect.setLastLogonTime(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.LastLogonTime"));
		testArchitect.setLoginName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.LoginName"));
		testArchitect.setMobile(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.Mobile"));
		testArchitect.setNation(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.Nation"));
		testArchitect.setNationCountry(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.NationCountry"));
		testArchitect.setNickName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.NickName"));
		testArchitect.setPersonalPhoto(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.PersonalPhoto"));
		testArchitect.setPhone(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.Phone"));
		testArchitect.setRealName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.RealName"));
		testArchitect.setSex(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.Sex"));
		testArchitect.setSourceSystem(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.SourceSystem"));
		testArchitect.setSourceUserId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.SourceUserId"));
		testArchitect.setStatus(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.Status"));
		testArchitect.setType(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.Type"));
		testArchitect.setWorkNo(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestArchitect.WorkNo"));
		appOwner.setTestArchitect(testArchitect);

		TestOwner testOwner = new TestOwner();
		testOwner.setCustomerId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.CustomerId"));
		testOwner.setEmail(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.Email"));
		testOwner.setEnName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.EnName"));
		testOwner.setGmtCreate(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.GmtCreate"));
		testOwner.setGmtModified(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.GmtModified"));
		testOwner.setId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.Id"));
		testOwner.setImAccount(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.ImAccount"));
		testOwner.setLastLogonTime(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.LastLogonTime"));
		testOwner.setLoginName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.LoginName"));
		testOwner.setMobile(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.Mobile"));
		testOwner.setNation(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.Nation"));
		testOwner.setNationCountry(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.NationCountry"));
		testOwner.setNickName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.NickName"));
		testOwner.setPersonalPhoto(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.PersonalPhoto"));
		testOwner.setPhone(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.Phone"));
		testOwner.setRealName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.RealName"));
		testOwner.setSex(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.Sex"));
		testOwner.setSourceSystem(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.SourceSystem"));
		testOwner.setSourceUserId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.SourceUserId"));
		testOwner.setStatus(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.Status"));
		testOwner.setType(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.Type"));
		testOwner.setWorkNo(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.TestOwner.WorkNo"));
		appOwner.setTestOwner(testOwner);

		List<BackupDevArchitectsItem> backupDevArchitects = new ArrayList<BackupDevArchitectsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects.Length"); i++) {
			BackupDevArchitectsItem backupDevArchitectsItem = new BackupDevArchitectsItem();
			backupDevArchitectsItem.setCustomerId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].CustomerId"));
			backupDevArchitectsItem.setEmail(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].Email"));
			backupDevArchitectsItem.setEnName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].EnName"));
			backupDevArchitectsItem.setGmtCreate(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].GmtCreate"));
			backupDevArchitectsItem.setGmtModified(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].GmtModified"));
			backupDevArchitectsItem.setId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].Id"));
			backupDevArchitectsItem.setImAccount(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].ImAccount"));
			backupDevArchitectsItem.setLastLogonTime(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].LastLogonTime"));
			backupDevArchitectsItem.setLoginName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].LoginName"));
			backupDevArchitectsItem.setMobile(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].Mobile"));
			backupDevArchitectsItem.setNation(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].Nation"));
			backupDevArchitectsItem.setNationCountry(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].NationCountry"));
			backupDevArchitectsItem.setNickName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].NickName"));
			backupDevArchitectsItem.setPersonalPhoto(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].PersonalPhoto"));
			backupDevArchitectsItem.setPhone(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].Phone"));
			backupDevArchitectsItem.setRealName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].RealName"));
			backupDevArchitectsItem.setSex(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].Sex"));
			backupDevArchitectsItem.setSourceSystem(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].SourceSystem"));
			backupDevArchitectsItem.setSourceUserId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].SourceUserId"));
			backupDevArchitectsItem.setStatus(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].Status"));
			backupDevArchitectsItem.setType(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].Type"));
			backupDevArchitectsItem.setWorkNo(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevArchitects["+ i +"].WorkNo"));

			backupDevArchitects.add(backupDevArchitectsItem);
		}
		appOwner.setBackupDevArchitects(backupDevArchitects);

		List<BackupDevOwnersItem> backupDevOwners = new ArrayList<BackupDevOwnersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners.Length"); i++) {
			BackupDevOwnersItem backupDevOwnersItem = new BackupDevOwnersItem();
			backupDevOwnersItem.setCustomerId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].CustomerId"));
			backupDevOwnersItem.setEmail(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].Email"));
			backupDevOwnersItem.setEnName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].EnName"));
			backupDevOwnersItem.setGmtCreate(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].GmtCreate"));
			backupDevOwnersItem.setGmtModified(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].GmtModified"));
			backupDevOwnersItem.setId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].Id"));
			backupDevOwnersItem.setImAccount(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].ImAccount"));
			backupDevOwnersItem.setLastLogonTime(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].LastLogonTime"));
			backupDevOwnersItem.setLoginName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].LoginName"));
			backupDevOwnersItem.setMobile(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].Mobile"));
			backupDevOwnersItem.setNation(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].Nation"));
			backupDevOwnersItem.setNationCountry(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].NationCountry"));
			backupDevOwnersItem.setNickName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].NickName"));
			backupDevOwnersItem.setPersonalPhoto(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].PersonalPhoto"));
			backupDevOwnersItem.setPhone(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].Phone"));
			backupDevOwnersItem.setRealName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].RealName"));
			backupDevOwnersItem.setSex(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].Sex"));
			backupDevOwnersItem.setSourceSystem(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].SourceSystem"));
			backupDevOwnersItem.setSourceUserId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].SourceUserId"));
			backupDevOwnersItem.setStatus(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].Status"));
			backupDevOwnersItem.setType(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].Type"));
			backupDevOwnersItem.setWorkNo(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupDevOwners["+ i +"].WorkNo"));

			backupDevOwners.add(backupDevOwnersItem);
		}
		appOwner.setBackupDevOwners(backupDevOwners);

		List<BackupOpsesItem> backupOpses = new ArrayList<BackupOpsesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses.Length"); i++) {
			BackupOpsesItem backupOpsesItem = new BackupOpsesItem();
			backupOpsesItem.setCustomerId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].CustomerId"));
			backupOpsesItem.setEmail(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].Email"));
			backupOpsesItem.setEnName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].EnName"));
			backupOpsesItem.setGmtCreate(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].GmtCreate"));
			backupOpsesItem.setGmtModified(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].GmtModified"));
			backupOpsesItem.setId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].Id"));
			backupOpsesItem.setImAccount(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].ImAccount"));
			backupOpsesItem.setLastLogonTime(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].LastLogonTime"));
			backupOpsesItem.setLoginName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].LoginName"));
			backupOpsesItem.setMobile(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].Mobile"));
			backupOpsesItem.setNation(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].Nation"));
			backupOpsesItem.setNationCountry(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].NationCountry"));
			backupOpsesItem.setNickName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].NickName"));
			backupOpsesItem.setPersonalPhoto(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].PersonalPhoto"));
			backupOpsesItem.setPhone(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].Phone"));
			backupOpsesItem.setRealName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].RealName"));
			backupOpsesItem.setSex(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].Sex"));
			backupOpsesItem.setSourceSystem(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].SourceSystem"));
			backupOpsesItem.setSourceUserId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].SourceUserId"));
			backupOpsesItem.setStatus(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].Status"));
			backupOpsesItem.setType(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].Type"));
			backupOpsesItem.setWorkNo(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupOpses["+ i +"].WorkNo"));

			backupOpses.add(backupOpsesItem);
		}
		appOwner.setBackupOpses(backupOpses);

		List<BackupTestArchitectsItem> backupTestArchitects = new ArrayList<BackupTestArchitectsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects.Length"); i++) {
			BackupTestArchitectsItem backupTestArchitectsItem = new BackupTestArchitectsItem();
			backupTestArchitectsItem.setCustomerId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].CustomerId"));
			backupTestArchitectsItem.setEmail(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].Email"));
			backupTestArchitectsItem.setEnName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].EnName"));
			backupTestArchitectsItem.setGmtCreate(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].GmtCreate"));
			backupTestArchitectsItem.setGmtModified(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].GmtModified"));
			backupTestArchitectsItem.setId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].Id"));
			backupTestArchitectsItem.setImAccount(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].ImAccount"));
			backupTestArchitectsItem.setLastLogonTime(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].LastLogonTime"));
			backupTestArchitectsItem.setLoginName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].LoginName"));
			backupTestArchitectsItem.setMobile(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].Mobile"));
			backupTestArchitectsItem.setNation(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].Nation"));
			backupTestArchitectsItem.setNationCountry(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].NationCountry"));
			backupTestArchitectsItem.setNickName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].NickName"));
			backupTestArchitectsItem.setPersonalPhoto(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].PersonalPhoto"));
			backupTestArchitectsItem.setPhone(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].Phone"));
			backupTestArchitectsItem.setRealName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].RealName"));
			backupTestArchitectsItem.setSex(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].Sex"));
			backupTestArchitectsItem.setSourceSystem(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].SourceSystem"));
			backupTestArchitectsItem.setSourceUserId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].SourceUserId"));
			backupTestArchitectsItem.setStatus(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].Status"));
			backupTestArchitectsItem.setType(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].Type"));
			backupTestArchitectsItem.setWorkNo(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestArchitects["+ i +"].WorkNo"));

			backupTestArchitects.add(backupTestArchitectsItem);
		}
		appOwner.setBackupTestArchitects(backupTestArchitects);

		List<BackupTestOwnersItem> backupTestOwners = new ArrayList<BackupTestOwnersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners.Length"); i++) {
			BackupTestOwnersItem backupTestOwnersItem = new BackupTestOwnersItem();
			backupTestOwnersItem.setCustomerId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].CustomerId"));
			backupTestOwnersItem.setEmail(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].Email"));
			backupTestOwnersItem.setEnName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].EnName"));
			backupTestOwnersItem.setGmtCreate(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].GmtCreate"));
			backupTestOwnersItem.setGmtModified(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].GmtModified"));
			backupTestOwnersItem.setId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].Id"));
			backupTestOwnersItem.setImAccount(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].ImAccount"));
			backupTestOwnersItem.setLastLogonTime(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].LastLogonTime"));
			backupTestOwnersItem.setLoginName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].LoginName"));
			backupTestOwnersItem.setMobile(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].Mobile"));
			backupTestOwnersItem.setNation(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].Nation"));
			backupTestOwnersItem.setNationCountry(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].NationCountry"));
			backupTestOwnersItem.setNickName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].NickName"));
			backupTestOwnersItem.setPersonalPhoto(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].PersonalPhoto"));
			backupTestOwnersItem.setPhone(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].Phone"));
			backupTestOwnersItem.setRealName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].RealName"));
			backupTestOwnersItem.setSex(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].Sex"));
			backupTestOwnersItem.setSourceSystem(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].SourceSystem"));
			backupTestOwnersItem.setSourceUserId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].SourceUserId"));
			backupTestOwnersItem.setStatus(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].Status"));
			backupTestOwnersItem.setType(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].Type"));
			backupTestOwnersItem.setWorkNo(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppOwner.BackupTestOwners["+ i +"].WorkNo"));

			backupTestOwners.add(backupTestOwnersItem);
		}
		appOwner.setBackupTestOwners(backupTestOwners);
		data.setAppOwner(appOwner);

		Archetype archetype = new Archetype();
		archetype.setArtifactId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.Archetype.ArtifactId"));
		archetype.setCodePackage(_ctx.stringValue("GetCASApplicationDetailResponse.Data.Archetype.CodePackage"));
		archetype.setEncoding(_ctx.stringValue("GetCASApplicationDetailResponse.Data.Archetype.Encoding"));
		archetype.setGenerateCode(_ctx.booleanValue("GetCASApplicationDetailResponse.Data.Archetype.GenerateCode"));
		archetype.setGroupId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.Archetype.GroupId"));
		archetype.setMetaData(_ctx.stringValue("GetCASApplicationDetailResponse.Data.Archetype.MetaData"));
		archetype.setProjectType(_ctx.stringValue("GetCASApplicationDetailResponse.Data.Archetype.ProjectType"));
		archetype.setUsePrivateRepo(_ctx.booleanValue("GetCASApplicationDetailResponse.Data.Archetype.UsePrivateRepo"));
		archetype.setVersion(_ctx.stringValue("GetCASApplicationDetailResponse.Data.Archetype.Version"));
		data.setArchetype(archetype);

		CodeRepository codeRepository = new CodeRepository();
		codeRepository.setExtraParams(_ctx.stringValue("GetCASApplicationDetailResponse.Data.CodeRepository.ExtraParams"));
		codeRepository.setGroupName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.CodeRepository.GroupName"));
		codeRepository.setId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.CodeRepository.Id"));
		codeRepository.setInstanceId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.CodeRepository.InstanceId"));
		codeRepository.setIsInitStandardPath(_ctx.booleanValue("GetCASApplicationDetailResponse.Data.CodeRepository.IsInitStandardPath"));
		codeRepository.setName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.CodeRepository.Name"));
		codeRepository.setOwner(_ctx.stringValue("GetCASApplicationDetailResponse.Data.CodeRepository.Owner"));
		codeRepository.setParentReposName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.CodeRepository.ParentReposName"));
		codeRepository.setRemoteRepoId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.CodeRepository.RemoteRepoId"));
		codeRepository.setRepoReuse(_ctx.stringValue("GetCASApplicationDetailResponse.Data.CodeRepository.RepoReuse"));
		codeRepository.setSourceLocation(_ctx.stringValue("GetCASApplicationDetailResponse.Data.CodeRepository.SourceLocation"));
		codeRepository.setStatus(_ctx.stringValue("GetCASApplicationDetailResponse.Data.CodeRepository.Status"));
		codeRepository.setType(_ctx.stringValue("GetCASApplicationDetailResponse.Data.CodeRepository.Type"));
		codeRepository.setUseExist(_ctx.booleanValue("GetCASApplicationDetailResponse.Data.CodeRepository.UseExist"));
		data.setCodeRepository(codeRepository);

		LifeCycle lifeCycle = new LifeCycle();
		lifeCycle.setAppId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.LifeCycle.AppId"));
		lifeCycle.setGmtCreate(_ctx.stringValue("GetCASApplicationDetailResponse.Data.LifeCycle.GmtCreate"));
		lifeCycle.setGmtModified(_ctx.stringValue("GetCASApplicationDetailResponse.Data.LifeCycle.GmtModified"));
		lifeCycle.setId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.LifeCycle.Id"));
		lifeCycle.setLastDeployTime(_ctx.stringValue("GetCASApplicationDetailResponse.Data.LifeCycle.LastDeployTime"));
		lifeCycle.setLastDeployVersion(_ctx.stringValue("GetCASApplicationDetailResponse.Data.LifeCycle.LastDeployVersion"));
		lifeCycle.setLastOpsorderId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.LifeCycle.LastOpsorderId"));
		lifeCycle.setOnlineTime(_ctx.stringValue("GetCASApplicationDetailResponse.Data.LifeCycle.OnlineTime"));
		lifeCycle.setState(_ctx.stringValue("GetCASApplicationDetailResponse.Data.LifeCycle.State"));
		lifeCycle.setWorkspaceId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.LifeCycle.WorkspaceId"));
		data.setLifeCycle(lifeCycle);

		List<AppExtraInfosItem> appExtraInfos = new ArrayList<AppExtraInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCASApplicationDetailResponse.Data.AppExtraInfos.Length"); i++) {
			AppExtraInfosItem appExtraInfosItem = new AppExtraInfosItem();
			appExtraInfosItem.setAppExtrainfoId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppExtraInfos["+ i +"].AppExtrainfoId"));
			appExtraInfosItem.setAppId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppExtraInfos["+ i +"].AppId"));
			appExtraInfosItem.setDescription(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppExtraInfos["+ i +"].Description"));
			appExtraInfosItem.setId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppExtraInfos["+ i +"].Id"));
			appExtraInfosItem.setName(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppExtraInfos["+ i +"].Name"));
			appExtraInfosItem.setTemplateDataId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppExtraInfos["+ i +"].TemplateDataId"));
			appExtraInfosItem.setTemplateId(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppExtraInfos["+ i +"].TemplateId"));
			appExtraInfosItem.setType(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppExtraInfos["+ i +"].Type"));
			appExtraInfosItem.setUtcCreate(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppExtraInfos["+ i +"].UtcCreate"));
			appExtraInfosItem.setUtcModified(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppExtraInfos["+ i +"].UtcModified"));
			appExtraInfosItem.setValue(_ctx.stringValue("GetCASApplicationDetailResponse.Data.AppExtraInfos["+ i +"].Value"));

			appExtraInfos.add(appExtraInfosItem);
		}
		data.setAppExtraInfos(appExtraInfos);
		getCASApplicationDetailResponse.setData(data);
	 
	 	return getCASApplicationDetailResponse;
	}
}