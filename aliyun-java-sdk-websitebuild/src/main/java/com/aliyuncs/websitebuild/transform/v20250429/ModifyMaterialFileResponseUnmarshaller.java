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

import com.aliyuncs.websitebuild.model.v20250429.ModifyMaterialFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyMaterialFileResponseUnmarshaller {

	public static ModifyMaterialFileResponse unmarshall(ModifyMaterialFileResponse modifyMaterialFileResponse, UnmarshallerContext _ctx) {
		
		modifyMaterialFileResponse.setRequestId(_ctx.stringValue("ModifyMaterialFileResponse.RequestId"));
		modifyMaterialFileResponse.setErrorMsg(_ctx.stringValue("ModifyMaterialFileResponse.ErrorMsg"));
		modifyMaterialFileResponse.setSuccess(_ctx.booleanValue("ModifyMaterialFileResponse.Success"));
		modifyMaterialFileResponse.setErrorCode(_ctx.stringValue("ModifyMaterialFileResponse.ErrorCode"));
		modifyMaterialFileResponse.setDynamicCode(_ctx.stringValue("ModifyMaterialFileResponse.DynamicCode"));
		modifyMaterialFileResponse.setDynamicMessage(_ctx.stringValue("ModifyMaterialFileResponse.DynamicMessage"));
		modifyMaterialFileResponse.setSynchro(_ctx.booleanValue("ModifyMaterialFileResponse.Synchro"));
		modifyMaterialFileResponse.setAccessDeniedDetail(_ctx.stringValue("ModifyMaterialFileResponse.AccessDeniedDetail"));
		modifyMaterialFileResponse.setRootErrorMsg(_ctx.stringValue("ModifyMaterialFileResponse.RootErrorMsg"));
		modifyMaterialFileResponse.setRootErrorCode(_ctx.stringValue("ModifyMaterialFileResponse.RootErrorCode"));
		modifyMaterialFileResponse.setModule(_ctx.booleanValue("ModifyMaterialFileResponse.Module"));
		modifyMaterialFileResponse.setAllowRetry(_ctx.booleanValue("ModifyMaterialFileResponse.AllowRetry"));
		modifyMaterialFileResponse.setAppName(_ctx.stringValue("ModifyMaterialFileResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyMaterialFileResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ModifyMaterialFileResponse.ErrorArgs["+ i +"]"));
		}
		modifyMaterialFileResponse.setErrorArgs(errorArgs);
	 
	 	return modifyMaterialFileResponse;
	}
}