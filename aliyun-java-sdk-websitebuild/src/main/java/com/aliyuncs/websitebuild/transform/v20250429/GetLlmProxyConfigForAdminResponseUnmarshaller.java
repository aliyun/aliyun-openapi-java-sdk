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

import com.aliyuncs.websitebuild.model.v20250429.GetLlmProxyConfigForAdminResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetLlmProxyConfigForAdminResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLlmProxyConfigForAdminResponseUnmarshaller {

	public static GetLlmProxyConfigForAdminResponse unmarshall(GetLlmProxyConfigForAdminResponse getLlmProxyConfigForAdminResponse, UnmarshallerContext _ctx) {
		
		getLlmProxyConfigForAdminResponse.setRequestId(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.RequestId"));
		getLlmProxyConfigForAdminResponse.setDynamicCode(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.DynamicCode"));
		getLlmProxyConfigForAdminResponse.setDynamicMessage(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.DynamicMessage"));
		getLlmProxyConfigForAdminResponse.setSynchro(_ctx.booleanValue("GetLlmProxyConfigForAdminResponse.Synchro"));
		getLlmProxyConfigForAdminResponse.setAccessDeniedDetail(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.AccessDeniedDetail"));
		getLlmProxyConfigForAdminResponse.setRootErrorMsg(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.RootErrorMsg"));
		getLlmProxyConfigForAdminResponse.setRootErrorCode(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.RootErrorCode"));
		getLlmProxyConfigForAdminResponse.setAllowRetry(_ctx.booleanValue("GetLlmProxyConfigForAdminResponse.AllowRetry"));
		getLlmProxyConfigForAdminResponse.setAppName(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLlmProxyConfigForAdminResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.ErrorArgs["+ i +"]"));
		}
		getLlmProxyConfigForAdminResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setId(_ctx.longValue("GetLlmProxyConfigForAdminResponse.Module.Id"));
		module.setBizId(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.Module.BizId"));
		module.setCapability(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.Module.Capability"));
		module.setEnabled(_ctx.booleanValue("GetLlmProxyConfigForAdminResponse.Module.Enabled"));
		module.setRpmLimit(_ctx.integerValue("GetLlmProxyConfigForAdminResponse.Module.RpmLimit"));
		module.setDailyLimit(_ctx.integerValue("GetLlmProxyConfigForAdminResponse.Module.DailyLimit"));
		module.setDailyTokenLimit(_ctx.longValue("GetLlmProxyConfigForAdminResponse.Module.DailyTokenLimit"));
		module.setIpWhitelist(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.Module.IpWhitelist"));
		module.setIpBlacklist(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.Module.IpBlacklist"));
		module.setAllowedModels(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.Module.AllowedModels"));
		module.setBlockedModels(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.Module.BlockedModels"));
		module.setStatus(_ctx.integerValue("GetLlmProxyConfigForAdminResponse.Module.Status"));
		module.setSuspendReason(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.Module.SuspendReason"));
		module.setExtend(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.Module.Extend"));
		module.setGmtCreate(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.Module.GmtCreate"));
		module.setGmtModified(_ctx.stringValue("GetLlmProxyConfigForAdminResponse.Module.GmtModified"));
		getLlmProxyConfigForAdminResponse.setModule(module);
	 
	 	return getLlmProxyConfigForAdminResponse;
	}
}