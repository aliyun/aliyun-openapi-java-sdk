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

import com.aliyuncs.websitebuild.model.v20250429.QuerySupabaseInstanceInfoForAdminResponse;
import com.aliyuncs.websitebuild.model.v20250429.QuerySupabaseInstanceInfoForAdminResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySupabaseInstanceInfoForAdminResponseUnmarshaller {

	public static QuerySupabaseInstanceInfoForAdminResponse unmarshall(QuerySupabaseInstanceInfoForAdminResponse querySupabaseInstanceInfoForAdminResponse, UnmarshallerContext _ctx) {
		
		querySupabaseInstanceInfoForAdminResponse.setRequestId(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.RequestId"));
		querySupabaseInstanceInfoForAdminResponse.setDynamicCode(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.DynamicCode"));
		querySupabaseInstanceInfoForAdminResponse.setDynamicMessage(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.DynamicMessage"));
		querySupabaseInstanceInfoForAdminResponse.setSynchro(_ctx.booleanValue("QuerySupabaseInstanceInfoForAdminResponse.Synchro"));
		querySupabaseInstanceInfoForAdminResponse.setAccessDeniedDetail(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.AccessDeniedDetail"));
		querySupabaseInstanceInfoForAdminResponse.setRootErrorMsg(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.RootErrorMsg"));
		querySupabaseInstanceInfoForAdminResponse.setRootErrorCode(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.RootErrorCode"));
		querySupabaseInstanceInfoForAdminResponse.setAllowRetry(_ctx.booleanValue("QuerySupabaseInstanceInfoForAdminResponse.AllowRetry"));
		querySupabaseInstanceInfoForAdminResponse.setAppName(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QuerySupabaseInstanceInfoForAdminResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.ErrorArgs["+ i +"]"));
		}
		querySupabaseInstanceInfoForAdminResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setDbInstanceId(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.DbInstanceId"));
		module.setSupabaseInstanceId(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.SupabaseInstanceId"));
		module.setUserId(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.UserId"));
		module.setDbType(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.DbType"));
		module.setBizId(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.BizId"));
		module.setStatus(_ctx.integerValue("QuerySupabaseInstanceInfoForAdminResponse.Module.Status"));
		module.setExtra(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.Extra"));
		module.setDbPublicUrl(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.DbPublicUrl"));
		module.setSupabasePublicUrl(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.SupabasePublicUrl"));
		module.setSupabaseKongUrl(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.SupabaseKongUrl"));
		module.setRdsDatabasePassword(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.RdsDatabasePassword"));
		module.setSupabaseDashboardUserName(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.SupabaseDashboardUserName"));
		module.setSupabaseDashboardPassword(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.SupabaseDashboardPassword"));
		module.setSupabasePublicIp(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.SupabasePublicIp"));
		module.setSupabasePrivateIp(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.SupabasePrivateIp"));
		module.setServiceKey(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.ServiceKey"));
		module.setAnonKey(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.AnonKey"));
		module.setIsDeleted(_ctx.integerValue("QuerySupabaseInstanceInfoForAdminResponse.Module.IsDeleted"));
		module.setDbInstanceCreateTime(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.DbInstanceCreateTime"));
		module.setSupabaseInstanceCreateTime(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.SupabaseInstanceCreateTime"));
		module.setInstanceCreateStatus(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.InstanceCreateStatus"));
		module.setInstanceCreateFinishedTime(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.InstanceCreateFinishedTime"));
		module.setTenantId(_ctx.stringValue("QuerySupabaseInstanceInfoForAdminResponse.Module.TenantId"));
		querySupabaseInstanceInfoForAdminResponse.setModule(module);
	 
	 	return querySupabaseInstanceInfoForAdminResponse;
	}
}