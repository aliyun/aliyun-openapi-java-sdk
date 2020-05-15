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

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutWorkspacesResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutWorkspacesResponse.ResultItem;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutWorkspacesResponse.ResultItem.CloudTenant;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutWorkspacesResponse.ResultItem.ExtraInfo;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutWorkspacesResponse.ResultItem.Modifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutWorkspacesResponseUnmarshaller {

	public static ListLinkeBahamutWorkspacesResponse unmarshall(ListLinkeBahamutWorkspacesResponse listLinkeBahamutWorkspacesResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutWorkspacesResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.RequestId"));
		listLinkeBahamutWorkspacesResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.ResultCode"));
		listLinkeBahamutWorkspacesResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.ResultMessage"));
		listLinkeBahamutWorkspacesResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.ErrorMessage"));
		listLinkeBahamutWorkspacesResponse.setMessage(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Message"));
		listLinkeBahamutWorkspacesResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutWorkspacesResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutWorkspacesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccessKey(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].AccessKey"));
			resultItem.setAccessSecret(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].AccessSecret"));
			resultItem.setClusterId(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ClusterId"));
			resultItem.setCreated(_ctx.longValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Created"));
			resultItem.setCrossCloud(_ctx.booleanValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].CrossCloud"));
			resultItem.setCustomerId(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].CustomerId"));
			resultItem.setDefaultUse(_ctx.booleanValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].DefaultUse"));
			resultItem.setDeleted(_ctx.booleanValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Deleted"));
			resultItem.setEnvId(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].EnvId"));
			resultItem.setId(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].LastModified"));
			resultItem.setLinkETenant(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].LinkETenant"));
			resultItem.setNamespace(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Namespace"));
			resultItem.setType(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Type"));
			resultItem.setUse(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Use"));
			resultItem.setWorkspaceGroupId(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].WorkspaceGroupId"));
			resultItem.setWorkspaceId(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].WorkspaceId"));
			resultItem.setWorkspaceName(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].WorkspaceName"));

			CloudTenant cloudTenant = new CloudTenant();
			cloudTenant.setAccessKey(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].CloudTenant.AccessKey"));
			cloudTenant.setAccessSecret(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].CloudTenant.AccessSecret"));
			cloudTenant.setCreated(_ctx.longValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].CloudTenant.Created"));
			cloudTenant.setCustomerId(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].CloudTenant.CustomerId"));
			cloudTenant.setDeleted(_ctx.booleanValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].CloudTenant.Deleted"));
			cloudTenant.setEndPoint(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].CloudTenant.EndPoint"));
			cloudTenant.setId(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].CloudTenant.Id"));
			cloudTenant.setLastModified(_ctx.longValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].CloudTenant.LastModified"));
			cloudTenant.setLinkETenant(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].CloudTenant.LinkETenant"));
			cloudTenant.setStationName(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].CloudTenant.StationName"));
			cloudTenant.setTenantId(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].CloudTenant.TenantId"));
			cloudTenant.setTenantName(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].CloudTenant.TenantName"));
			cloudTenant.setToken(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].CloudTenant.Token"));
			resultItem.setCloudTenant(cloudTenant);

			ExtraInfo extraInfo = new ExtraInfo();
			extraInfo.setAntXUrl(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ExtraInfo.AntXUrl"));
			extraInfo.setAuthTokenType(_ctx.booleanValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ExtraInfo.AuthTokenType"));
			extraInfo.setEnvTypeEnum(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ExtraInfo.EnvTypeEnum"));
			extraInfo.setGroupStrategy(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ExtraInfo.GroupStrategy"));
			extraInfo.setInstanceId(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ExtraInfo.InstanceId"));
			extraInfo.setLdcConsoleUrl(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ExtraInfo.LdcConsoleUrl"));
			extraInfo.setMachImport(_ctx.booleanValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ExtraInfo.MachImport"));
			extraInfo.setMachIter(_ctx.booleanValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ExtraInfo.MachIter"));
			extraInfo.setMavenModeEnum(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ExtraInfo.MavenModeEnum"));
			extraInfo.setRegionName(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ExtraInfo.RegionName"));
			extraInfo.setRegistryHost(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ExtraInfo.RegistryHost"));
			extraInfo.setReleaseTypeEnum(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ExtraInfo.ReleaseTypeEnum"));
			extraInfo.setShareOpenAPI(_ctx.booleanValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ExtraInfo.ShareOpenAPI"));
			extraInfo.setSofarouterEnabled(_ctx.booleanValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ExtraInfo.SofarouterEnabled"));

			List<String> buildWorkspaceList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ExtraInfo.BuildWorkspaceList.Length"); j++) {
				buildWorkspaceList.add(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].ExtraInfo.BuildWorkspaceList["+ j +"]"));
			}
			extraInfo.setBuildWorkspaceList(buildWorkspaceList);
			resultItem.setExtraInfo(extraInfo);

			Modifier modifier = new Modifier();
			modifier.setAccount(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.Account"));
			modifier.setCreated(_ctx.longValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.Created"));
			modifier.setCustomer(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.Customer"));
			modifier.setDeleted(_ctx.booleanValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.Deleted"));
			modifier.setDepartment(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.Department"));
			modifier.setEmail(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.Email"));
			modifier.setEmpId(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.EmpId"));
			modifier.setId(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.Id"));
			modifier.setLastLogin(_ctx.longValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.LastLogin"));
			modifier.setLastModified(_ctx.longValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.LastModified"));
			modifier.setName(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.Name"));
			modifier.setNick(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.Nick"));
			modifier.setUid(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.Uid"));
			modifier.setUniqueId(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.UniqueId"));
			modifier.setWw(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.Ww"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("ListLinkeBahamutWorkspacesResponse.Result["+ i +"].Modifier.Tenants["+ j +"]"));
			}
			modifier.setTenants(tenants);
			resultItem.setModifier(modifier);

			result.add(resultItem);
		}
		listLinkeBahamutWorkspacesResponse.setResult(result);
	 
	 	return listLinkeBahamutWorkspacesResponse;
	}
}