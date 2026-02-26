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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceAuthorizedAppsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceAuthorizedAppsResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedApp;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedApp.RemarkForDebug;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataServiceAuthorizedAppsResponseUnmarshaller {

	public static ListDataServiceAuthorizedAppsResponse unmarshall(ListDataServiceAuthorizedAppsResponse listDataServiceAuthorizedAppsResponse, UnmarshallerContext _ctx) {
		
		listDataServiceAuthorizedAppsResponse.setRequestId(_ctx.stringValue("ListDataServiceAuthorizedAppsResponse.RequestId"));
		listDataServiceAuthorizedAppsResponse.setSuccess(_ctx.booleanValue("ListDataServiceAuthorizedAppsResponse.Success"));
		listDataServiceAuthorizedAppsResponse.setHttpStatusCode(_ctx.integerValue("ListDataServiceAuthorizedAppsResponse.HttpStatusCode"));
		listDataServiceAuthorizedAppsResponse.setCode(_ctx.stringValue("ListDataServiceAuthorizedAppsResponse.Code"));
		listDataServiceAuthorizedAppsResponse.setMessage(_ctx.stringValue("ListDataServiceAuthorizedAppsResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListDataServiceAuthorizedAppsResponse.PageResult.TotalCount"));

		List<AuthorizedApp> authorizedAppList = new ArrayList<AuthorizedApp>();
		for (int i = 0; i < _ctx.lengthValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList.Length"); i++) {
			AuthorizedApp authorizedApp = new AuthorizedApp();
			authorizedApp.setOwner(_ctx.stringValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].Owner"));
			authorizedApp.setRealHasOwnerPrivilege(_ctx.booleanValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].RealHasOwnerPrivilege"));
			authorizedApp.setExpireDate(_ctx.stringValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].ExpireDate"));
			authorizedApp.setProjectName(_ctx.stringValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].ProjectName"));
			authorizedApp.setProjectId(_ctx.integerValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].ProjectId"));
			authorizedApp.setRevocableDetail(_ctx.integerValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].RevocableDetail"));
			authorizedApp.setAppName(_ctx.stringValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].AppName"));
			authorizedApp.setApplyUserId(_ctx.stringValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].ApplyUserId"));
			authorizedApp.setApplyUserName(_ctx.stringValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].ApplyUserName"));
			authorizedApp.setAppId(_ctx.integerValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].AppId"));
			authorizedApp.setRealHasPrivilege(_ctx.booleanValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].RealHasPrivilege"));
			authorizedApp.setPrivilegeAccount(_ctx.integerValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].PrivilegeAccount"));
			authorizedApp.setOwnerUserName(_ctx.stringValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].OwnerUserName"));
			authorizedApp.setIsProjectManager(_ctx.booleanValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].IsProjectManager"));
			authorizedApp.setId(_ctx.integerValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].Id"));
			authorizedApp.setRevocable(_ctx.booleanValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].Revocable"));
			authorizedApp.setPrivilegeType(_ctx.integerValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].PrivilegeType"));

			List<RemarkForDebug> remarkForDebugList = new ArrayList<RemarkForDebug>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].RemarkForDebugList.Length"); j++) {
				RemarkForDebug remarkForDebug = new RemarkForDebug();
				remarkForDebug.setValue(_ctx.stringValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].RemarkForDebugList["+ j +"].Value"));
				remarkForDebug.setKey(_ctx.stringValue("ListDataServiceAuthorizedAppsResponse.PageResult.AuthorizedAppList["+ i +"].RemarkForDebugList["+ j +"].Key"));

				remarkForDebugList.add(remarkForDebug);
			}
			authorizedApp.setRemarkForDebugList(remarkForDebugList);

			authorizedAppList.add(authorizedApp);
		}
		pageResult.setAuthorizedAppList(authorizedAppList);
		listDataServiceAuthorizedAppsResponse.setPageResult(pageResult);
	 
	 	return listDataServiceAuthorizedAppsResponse;
	}
}