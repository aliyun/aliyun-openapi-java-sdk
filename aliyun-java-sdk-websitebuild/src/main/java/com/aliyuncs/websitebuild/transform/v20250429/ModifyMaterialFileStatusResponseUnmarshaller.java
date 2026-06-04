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

import com.aliyuncs.websitebuild.model.v20250429.ModifyMaterialFileStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyMaterialFileStatusResponseUnmarshaller {

	public static ModifyMaterialFileStatusResponse unmarshall(ModifyMaterialFileStatusResponse modifyMaterialFileStatusResponse, UnmarshallerContext _ctx) {
		
		modifyMaterialFileStatusResponse.setRequestId(_ctx.stringValue("ModifyMaterialFileStatusResponse.RequestId"));
		modifyMaterialFileStatusResponse.setDynamicCode(_ctx.stringValue("ModifyMaterialFileStatusResponse.DynamicCode"));
		modifyMaterialFileStatusResponse.setDynamicMessage(_ctx.stringValue("ModifyMaterialFileStatusResponse.DynamicMessage"));
		modifyMaterialFileStatusResponse.setSynchro(_ctx.booleanValue("ModifyMaterialFileStatusResponse.Synchro"));
		modifyMaterialFileStatusResponse.setAccessDeniedDetail(_ctx.stringValue("ModifyMaterialFileStatusResponse.AccessDeniedDetail"));
		modifyMaterialFileStatusResponse.setRootErrorMsg(_ctx.stringValue("ModifyMaterialFileStatusResponse.RootErrorMsg"));
		modifyMaterialFileStatusResponse.setRootErrorCode(_ctx.stringValue("ModifyMaterialFileStatusResponse.RootErrorCode"));
		modifyMaterialFileStatusResponse.setModule(_ctx.booleanValue("ModifyMaterialFileStatusResponse.Module"));
		modifyMaterialFileStatusResponse.setAllowRetry(_ctx.booleanValue("ModifyMaterialFileStatusResponse.AllowRetry"));
		modifyMaterialFileStatusResponse.setAppName(_ctx.stringValue("ModifyMaterialFileStatusResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyMaterialFileStatusResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ModifyMaterialFileStatusResponse.ErrorArgs["+ i +"]"));
		}
		modifyMaterialFileStatusResponse.setErrorArgs(errorArgs);
	 
	 	return modifyMaterialFileStatusResponse;
	}
}