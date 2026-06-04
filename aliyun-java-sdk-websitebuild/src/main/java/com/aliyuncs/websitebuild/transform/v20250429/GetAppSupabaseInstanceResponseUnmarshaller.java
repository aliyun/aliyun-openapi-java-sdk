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

import com.aliyuncs.websitebuild.model.v20250429.GetAppSupabaseInstanceResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppSupabaseInstanceResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppSupabaseInstanceResponseUnmarshaller {

	public static GetAppSupabaseInstanceResponse unmarshall(GetAppSupabaseInstanceResponse getAppSupabaseInstanceResponse, UnmarshallerContext _ctx) {
		
		getAppSupabaseInstanceResponse.setRequestId(_ctx.stringValue("GetAppSupabaseInstanceResponse.RequestId"));
		getAppSupabaseInstanceResponse.setDynamicCode(_ctx.stringValue("GetAppSupabaseInstanceResponse.DynamicCode"));
		getAppSupabaseInstanceResponse.setDynamicMessage(_ctx.stringValue("GetAppSupabaseInstanceResponse.DynamicMessage"));
		getAppSupabaseInstanceResponse.setSynchro(_ctx.booleanValue("GetAppSupabaseInstanceResponse.Synchro"));
		getAppSupabaseInstanceResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppSupabaseInstanceResponse.AccessDeniedDetail"));
		getAppSupabaseInstanceResponse.setRootErrorMsg(_ctx.stringValue("GetAppSupabaseInstanceResponse.RootErrorMsg"));
		getAppSupabaseInstanceResponse.setRootErrorCode(_ctx.stringValue("GetAppSupabaseInstanceResponse.RootErrorCode"));
		getAppSupabaseInstanceResponse.setAllowRetry(_ctx.booleanValue("GetAppSupabaseInstanceResponse.AllowRetry"));
		getAppSupabaseInstanceResponse.setAppName(_ctx.stringValue("GetAppSupabaseInstanceResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppSupabaseInstanceResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppSupabaseInstanceResponse.ErrorArgs["+ i +"]"));
		}
		getAppSupabaseInstanceResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setDbInstanceId(_ctx.stringValue("GetAppSupabaseInstanceResponse.Module.DbInstanceId"));
		module.setSupabaseInstanceId(_ctx.stringValue("GetAppSupabaseInstanceResponse.Module.SupabaseInstanceId"));
		module.setBizId(_ctx.stringValue("GetAppSupabaseInstanceResponse.Module.BizId"));
		module.setStatus(_ctx.integerValue("GetAppSupabaseInstanceResponse.Module.Status"));
		module.setDbPublicUrl(_ctx.stringValue("GetAppSupabaseInstanceResponse.Module.DbPublicUrl"));
		module.setSupabasePublicUrl(_ctx.stringValue("GetAppSupabaseInstanceResponse.Module.SupabasePublicUrl"));
		module.setAnonKey(_ctx.stringValue("GetAppSupabaseInstanceResponse.Module.AnonKey"));
		module.setServiceKey(_ctx.stringValue("GetAppSupabaseInstanceResponse.Module.ServiceKey"));
		module.setInstanceCreateStatus(_ctx.stringValue("GetAppSupabaseInstanceResponse.Module.InstanceCreateStatus"));
		getAppSupabaseInstanceResponse.setModule(module);
	 
	 	return getAppSupabaseInstanceResponse;
	}
}