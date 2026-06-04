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

import com.aliyuncs.websitebuild.model.v20250429.CreateMaterialDirectoryResponse;
import com.aliyuncs.websitebuild.model.v20250429.CreateMaterialDirectoryResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMaterialDirectoryResponseUnmarshaller {

	public static CreateMaterialDirectoryResponse unmarshall(CreateMaterialDirectoryResponse createMaterialDirectoryResponse, UnmarshallerContext _ctx) {
		
		createMaterialDirectoryResponse.setRequestId(_ctx.stringValue("CreateMaterialDirectoryResponse.RequestId"));
		createMaterialDirectoryResponse.setSuccess(_ctx.booleanValue("CreateMaterialDirectoryResponse.Success"));
		createMaterialDirectoryResponse.setErrorCode(_ctx.stringValue("CreateMaterialDirectoryResponse.ErrorCode"));
		createMaterialDirectoryResponse.setDynamicCode(_ctx.stringValue("CreateMaterialDirectoryResponse.DynamicCode"));
		createMaterialDirectoryResponse.setDynamicMessage(_ctx.stringValue("CreateMaterialDirectoryResponse.DynamicMessage"));
		createMaterialDirectoryResponse.setSynchro(_ctx.booleanValue("CreateMaterialDirectoryResponse.Synchro"));
		createMaterialDirectoryResponse.setAccessDeniedDetail(_ctx.stringValue("CreateMaterialDirectoryResponse.AccessDeniedDetail"));
		createMaterialDirectoryResponse.setRootErrorMsg(_ctx.stringValue("CreateMaterialDirectoryResponse.RootErrorMsg"));
		createMaterialDirectoryResponse.setRootErrorCode(_ctx.stringValue("CreateMaterialDirectoryResponse.RootErrorCode"));
		createMaterialDirectoryResponse.setAllowRetry(_ctx.booleanValue("CreateMaterialDirectoryResponse.AllowRetry"));
		createMaterialDirectoryResponse.setAppName(_ctx.stringValue("CreateMaterialDirectoryResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateMaterialDirectoryResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("CreateMaterialDirectoryResponse.ErrorArgs["+ i +"]"));
		}
		createMaterialDirectoryResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setDirectoryId(_ctx.stringValue("CreateMaterialDirectoryResponse.Module.DirectoryId"));
		createMaterialDirectoryResponse.setModule(module);
	 
	 	return createMaterialDirectoryResponse;
	}
}