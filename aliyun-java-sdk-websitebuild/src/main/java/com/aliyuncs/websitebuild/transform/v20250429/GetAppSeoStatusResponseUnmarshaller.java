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

import com.aliyuncs.websitebuild.model.v20250429.GetAppSeoStatusResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppSeoStatusResponse.ModuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppSeoStatusResponseUnmarshaller {

	public static GetAppSeoStatusResponse unmarshall(GetAppSeoStatusResponse getAppSeoStatusResponse, UnmarshallerContext _ctx) {
		
		getAppSeoStatusResponse.setRequestId(_ctx.stringValue("GetAppSeoStatusResponse.RequestId"));
		getAppSeoStatusResponse.setDynamicCode(_ctx.stringValue("GetAppSeoStatusResponse.DynamicCode"));
		getAppSeoStatusResponse.setDynamicMessage(_ctx.stringValue("GetAppSeoStatusResponse.DynamicMessage"));
		getAppSeoStatusResponse.setSynchro(_ctx.booleanValue("GetAppSeoStatusResponse.Synchro"));
		getAppSeoStatusResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppSeoStatusResponse.AccessDeniedDetail"));
		getAppSeoStatusResponse.setRootErrorMsg(_ctx.stringValue("GetAppSeoStatusResponse.RootErrorMsg"));
		getAppSeoStatusResponse.setRootErrorCode(_ctx.stringValue("GetAppSeoStatusResponse.RootErrorCode"));
		getAppSeoStatusResponse.setAllowRetry(_ctx.booleanValue("GetAppSeoStatusResponse.AllowRetry"));
		getAppSeoStatusResponse.setAppName(_ctx.stringValue("GetAppSeoStatusResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppSeoStatusResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppSeoStatusResponse.ErrorArgs["+ i +"]"));
		}
		getAppSeoStatusResponse.setErrorArgs(errorArgs);

		List<ModuleItem> module = new ArrayList<ModuleItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppSeoStatusResponse.Module.Length"); i++) {
			ModuleItem moduleItem = new ModuleItem();
			moduleItem.setBizId(_ctx.stringValue("GetAppSeoStatusResponse.Module["+ i +"].BizId"));
			moduleItem.setDomain(_ctx.stringValue("GetAppSeoStatusResponse.Module["+ i +"].Domain"));
			moduleItem.setSeType(_ctx.stringValue("GetAppSeoStatusResponse.Module["+ i +"].SeType"));
			moduleItem.setSeIndexStatus(_ctx.integerValue("GetAppSeoStatusResponse.Module["+ i +"].SeIndexStatus"));
			moduleItem.setSeAuthInfo(_ctx.stringValue("GetAppSeoStatusResponse.Module["+ i +"].SeAuthInfo"));
			moduleItem.setGmtCreateTime(_ctx.stringValue("GetAppSeoStatusResponse.Module["+ i +"].GmtCreateTime"));
			moduleItem.setGmtModifiedTime(_ctx.stringValue("GetAppSeoStatusResponse.Module["+ i +"].GmtModifiedTime"));

			module.add(moduleItem);
		}
		getAppSeoStatusResponse.setModule(module);
	 
	 	return getAppSeoStatusResponse;
	}
}