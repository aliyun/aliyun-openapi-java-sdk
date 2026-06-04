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

import com.aliyuncs.websitebuild.model.v20250429.AllocateSupabaseForAdminResponse;
import com.aliyuncs.websitebuild.model.v20250429.AllocateSupabaseForAdminResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class AllocateSupabaseForAdminResponseUnmarshaller {

	public static AllocateSupabaseForAdminResponse unmarshall(AllocateSupabaseForAdminResponse allocateSupabaseForAdminResponse, UnmarshallerContext _ctx) {
		
		allocateSupabaseForAdminResponse.setRequestId(_ctx.stringValue("AllocateSupabaseForAdminResponse.RequestId"));
		allocateSupabaseForAdminResponse.setDynamicCode(_ctx.stringValue("AllocateSupabaseForAdminResponse.DynamicCode"));
		allocateSupabaseForAdminResponse.setDynamicMessage(_ctx.stringValue("AllocateSupabaseForAdminResponse.DynamicMessage"));
		allocateSupabaseForAdminResponse.setSynchro(_ctx.booleanValue("AllocateSupabaseForAdminResponse.Synchro"));
		allocateSupabaseForAdminResponse.setAccessDeniedDetail(_ctx.stringValue("AllocateSupabaseForAdminResponse.AccessDeniedDetail"));
		allocateSupabaseForAdminResponse.setRootErrorMsg(_ctx.stringValue("AllocateSupabaseForAdminResponse.RootErrorMsg"));
		allocateSupabaseForAdminResponse.setRootErrorCode(_ctx.stringValue("AllocateSupabaseForAdminResponse.RootErrorCode"));
		allocateSupabaseForAdminResponse.setAllowRetry(_ctx.booleanValue("AllocateSupabaseForAdminResponse.AllowRetry"));
		allocateSupabaseForAdminResponse.setAppName(_ctx.stringValue("AllocateSupabaseForAdminResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AllocateSupabaseForAdminResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("AllocateSupabaseForAdminResponse.ErrorArgs["+ i +"]"));
		}
		allocateSupabaseForAdminResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setDbInstanceId(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.DbInstanceId"));
		module.setSupabaseInstanceId(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.SupabaseInstanceId"));
		module.setUserId(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.UserId"));
		module.setDbType(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.DbType"));
		module.setBizId(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.BizId"));
		module.setStatus(_ctx.integerValue("AllocateSupabaseForAdminResponse.Module.Status"));
		module.setExtra(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.Extra"));
		module.setDbPublicUrl(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.DbPublicUrl"));
		module.setSupabasePublicUrl(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.SupabasePublicUrl"));
		module.setSupabaseKongUrl(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.SupabaseKongUrl"));
		module.setRdsDatabasePassword(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.RdsDatabasePassword"));
		module.setSupabaseDashboardUserName(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.SupabaseDashboardUserName"));
		module.setSupabaseDashboardPassword(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.SupabaseDashboardPassword"));
		module.setSupabasePublicIp(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.SupabasePublicIp"));
		module.setSupabasePrivateIp(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.SupabasePrivateIp"));
		module.setServiceKey(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.ServiceKey"));
		module.setAnonKey(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.AnonKey"));
		module.setIsDeleted(_ctx.integerValue("AllocateSupabaseForAdminResponse.Module.IsDeleted"));
		module.setDbInstanceCreateTime(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.DbInstanceCreateTime"));
		module.setSupabaseInstanceCreateTime(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.SupabaseInstanceCreateTime"));
		module.setInstanceCreateStatus(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.InstanceCreateStatus"));
		module.setInstanceCreateFinishedTime(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.InstanceCreateFinishedTime"));
		module.setTenantId(_ctx.stringValue("AllocateSupabaseForAdminResponse.Module.TenantId"));
		allocateSupabaseForAdminResponse.setModule(module);
	 
	 	return allocateSupabaseForAdminResponse;
	}
}