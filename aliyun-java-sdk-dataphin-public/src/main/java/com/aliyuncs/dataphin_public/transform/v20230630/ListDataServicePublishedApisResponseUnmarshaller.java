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

import com.aliyuncs.dataphin_public.model.v20230630.ListDataServicePublishedApisResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServicePublishedApisResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServicePublishedApisResponse.PageResult.Api;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServicePublishedApisResponse.PageResult.Api.AppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataServicePublishedApisResponseUnmarshaller {

	public static ListDataServicePublishedApisResponse unmarshall(ListDataServicePublishedApisResponse listDataServicePublishedApisResponse, UnmarshallerContext _ctx) {
		
		listDataServicePublishedApisResponse.setRequestId(_ctx.stringValue("ListDataServicePublishedApisResponse.RequestId"));
		listDataServicePublishedApisResponse.setSuccess(_ctx.booleanValue("ListDataServicePublishedApisResponse.Success"));
		listDataServicePublishedApisResponse.setHttpStatusCode(_ctx.integerValue("ListDataServicePublishedApisResponse.HttpStatusCode"));
		listDataServicePublishedApisResponse.setCode(_ctx.stringValue("ListDataServicePublishedApisResponse.Code"));
		listDataServicePublishedApisResponse.setMessage(_ctx.stringValue("ListDataServicePublishedApisResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListDataServicePublishedApisResponse.PageResult.TotalCount"));

		List<Api> apiList = new ArrayList<Api>();
		for (int i = 0; i < _ctx.lengthValue("ListDataServicePublishedApisResponse.PageResult.ApiList.Length"); i++) {
			Api api = new Api();
			api.setGroupName(_ctx.stringValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].GroupName"));
			api.setOwner(_ctx.stringValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].Owner"));
			api.setDescription(_ctx.stringValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].Description"));
			api.setUpdateRate(_ctx.integerValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].UpdateRate"));
			api.setApiName(_ctx.stringValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].ApiName"));
			api.setProjectName(_ctx.stringValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].ProjectName"));
			api.setAppCount(_ctx.integerValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].AppCount"));
			api.setMode(_ctx.integerValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].Mode"));
			api.setApplyStatus(_ctx.integerValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].ApplyStatus"));
			api.setProjectId(_ctx.integerValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].ProjectId"));
			api.setGroupId(_ctx.integerValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].GroupId"));
			api.setCustomUpdateRate(_ctx.stringValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].CustomUpdateRate"));
			api.setDeployTime(_ctx.stringValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].DeployTime"));
			api.setVersion(_ctx.stringValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].Version"));
			api.setLogicUnitNo(_ctx.longValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].LogicUnitNo"));
			api.setUpdateTime(_ctx.stringValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].UpdateTime"));
			api.setCreateType(_ctx.integerValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].CreateType"));
			api.setOwnerUserName(_ctx.stringValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].OwnerUserName"));
			api.setCallCount(_ctx.integerValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].CallCount"));
			api.setExecuteMode(_ctx.integerValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].ExecuteMode"));
			api.setApiId(_ctx.longValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].ApiId"));

			List<AppInfo> appInfoList = new ArrayList<AppInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].AppInfoList.Length"); j++) {
				AppInfo appInfo = new AppInfo();
				appInfo.setAppId(_ctx.integerValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].AppInfoList["+ j +"].AppId"));
				appInfo.setAppKey(_ctx.longValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].AppInfoList["+ j +"].AppKey"));
				appInfo.setAppName(_ctx.stringValue("ListDataServicePublishedApisResponse.PageResult.ApiList["+ i +"].AppInfoList["+ j +"].AppName"));

				appInfoList.add(appInfo);
			}
			api.setAppInfoList(appInfoList);

			apiList.add(api);
		}
		pageResult.setApiList(apiList);
		listDataServicePublishedApisResponse.setPageResult(pageResult);
	 
	 	return listDataServicePublishedApisResponse;
	}
}