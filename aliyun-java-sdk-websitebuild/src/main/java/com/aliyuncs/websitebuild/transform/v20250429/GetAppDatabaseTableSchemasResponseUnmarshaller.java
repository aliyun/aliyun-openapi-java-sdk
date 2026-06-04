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

import com.aliyuncs.websitebuild.model.v20250429.GetAppDatabaseTableSchemasResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppDatabaseTableSchemasResponseUnmarshaller {

	public static GetAppDatabaseTableSchemasResponse unmarshall(GetAppDatabaseTableSchemasResponse getAppDatabaseTableSchemasResponse, UnmarshallerContext _ctx) {
		
		getAppDatabaseTableSchemasResponse.setRequestId(_ctx.stringValue("GetAppDatabaseTableSchemasResponse.RequestId"));
		getAppDatabaseTableSchemasResponse.setDynamicCode(_ctx.stringValue("GetAppDatabaseTableSchemasResponse.DynamicCode"));
		getAppDatabaseTableSchemasResponse.setDynamicMessage(_ctx.stringValue("GetAppDatabaseTableSchemasResponse.DynamicMessage"));
		getAppDatabaseTableSchemasResponse.setSynchro(_ctx.booleanValue("GetAppDatabaseTableSchemasResponse.Synchro"));
		getAppDatabaseTableSchemasResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppDatabaseTableSchemasResponse.AccessDeniedDetail"));
		getAppDatabaseTableSchemasResponse.setRootErrorMsg(_ctx.stringValue("GetAppDatabaseTableSchemasResponse.RootErrorMsg"));
		getAppDatabaseTableSchemasResponse.setRootErrorCode(_ctx.stringValue("GetAppDatabaseTableSchemasResponse.RootErrorCode"));
		getAppDatabaseTableSchemasResponse.setModule(_ctx.stringValue("GetAppDatabaseTableSchemasResponse.Module"));
		getAppDatabaseTableSchemasResponse.setAllowRetry(_ctx.booleanValue("GetAppDatabaseTableSchemasResponse.AllowRetry"));
		getAppDatabaseTableSchemasResponse.setAppName(_ctx.stringValue("GetAppDatabaseTableSchemasResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppDatabaseTableSchemasResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppDatabaseTableSchemasResponse.ErrorArgs["+ i +"]"));
		}
		getAppDatabaseTableSchemasResponse.setErrorArgs(errorArgs);
	 
	 	return getAppDatabaseTableSchemasResponse;
	}
}