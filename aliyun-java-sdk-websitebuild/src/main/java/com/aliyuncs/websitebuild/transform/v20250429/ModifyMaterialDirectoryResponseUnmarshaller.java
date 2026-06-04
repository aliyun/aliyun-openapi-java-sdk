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

import com.aliyuncs.websitebuild.model.v20250429.ModifyMaterialDirectoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyMaterialDirectoryResponseUnmarshaller {

	public static ModifyMaterialDirectoryResponse unmarshall(ModifyMaterialDirectoryResponse modifyMaterialDirectoryResponse, UnmarshallerContext _ctx) {
		
		modifyMaterialDirectoryResponse.setRequestId(_ctx.stringValue("ModifyMaterialDirectoryResponse.RequestId"));
		modifyMaterialDirectoryResponse.setErrorMsg(_ctx.stringValue("ModifyMaterialDirectoryResponse.ErrorMsg"));
		modifyMaterialDirectoryResponse.setSuccess(_ctx.booleanValue("ModifyMaterialDirectoryResponse.Success"));
		modifyMaterialDirectoryResponse.setErrorCode(_ctx.stringValue("ModifyMaterialDirectoryResponse.ErrorCode"));
		modifyMaterialDirectoryResponse.setDynamicCode(_ctx.stringValue("ModifyMaterialDirectoryResponse.DynamicCode"));
		modifyMaterialDirectoryResponse.setDynamicMessage(_ctx.stringValue("ModifyMaterialDirectoryResponse.DynamicMessage"));
		modifyMaterialDirectoryResponse.setSynchro(_ctx.booleanValue("ModifyMaterialDirectoryResponse.Synchro"));
		modifyMaterialDirectoryResponse.setAccessDeniedDetail(_ctx.stringValue("ModifyMaterialDirectoryResponse.AccessDeniedDetail"));
		modifyMaterialDirectoryResponse.setRootErrorMsg(_ctx.stringValue("ModifyMaterialDirectoryResponse.RootErrorMsg"));
		modifyMaterialDirectoryResponse.setRootErrorCode(_ctx.stringValue("ModifyMaterialDirectoryResponse.RootErrorCode"));
		modifyMaterialDirectoryResponse.setModule(_ctx.booleanValue("ModifyMaterialDirectoryResponse.Module"));
		modifyMaterialDirectoryResponse.setAllowRetry(_ctx.booleanValue("ModifyMaterialDirectoryResponse.AllowRetry"));
		modifyMaterialDirectoryResponse.setAppName(_ctx.stringValue("ModifyMaterialDirectoryResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyMaterialDirectoryResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ModifyMaterialDirectoryResponse.ErrorArgs["+ i +"]"));
		}
		modifyMaterialDirectoryResponse.setErrorArgs(errorArgs);
	 
	 	return modifyMaterialDirectoryResponse;
	}
}