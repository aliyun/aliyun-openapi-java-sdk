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

import com.aliyuncs.websitebuild.model.v20250429.DeleteMaterialDirectoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMaterialDirectoryResponseUnmarshaller {

	public static DeleteMaterialDirectoryResponse unmarshall(DeleteMaterialDirectoryResponse deleteMaterialDirectoryResponse, UnmarshallerContext _ctx) {
		
		deleteMaterialDirectoryResponse.setRequestId(_ctx.stringValue("DeleteMaterialDirectoryResponse.RequestId"));
		deleteMaterialDirectoryResponse.setErrorMsg(_ctx.stringValue("DeleteMaterialDirectoryResponse.ErrorMsg"));
		deleteMaterialDirectoryResponse.setSuccess(_ctx.booleanValue("DeleteMaterialDirectoryResponse.Success"));
		deleteMaterialDirectoryResponse.setErrorCode(_ctx.stringValue("DeleteMaterialDirectoryResponse.ErrorCode"));
		deleteMaterialDirectoryResponse.setDynamicCode(_ctx.stringValue("DeleteMaterialDirectoryResponse.DynamicCode"));
		deleteMaterialDirectoryResponse.setDynamicMessage(_ctx.stringValue("DeleteMaterialDirectoryResponse.DynamicMessage"));
		deleteMaterialDirectoryResponse.setSynchro(_ctx.booleanValue("DeleteMaterialDirectoryResponse.Synchro"));
		deleteMaterialDirectoryResponse.setAccessDeniedDetail(_ctx.stringValue("DeleteMaterialDirectoryResponse.AccessDeniedDetail"));
		deleteMaterialDirectoryResponse.setRootErrorMsg(_ctx.stringValue("DeleteMaterialDirectoryResponse.RootErrorMsg"));
		deleteMaterialDirectoryResponse.setRootErrorCode(_ctx.stringValue("DeleteMaterialDirectoryResponse.RootErrorCode"));
		deleteMaterialDirectoryResponse.setModule(_ctx.booleanValue("DeleteMaterialDirectoryResponse.Module"));
		deleteMaterialDirectoryResponse.setAllowRetry(_ctx.booleanValue("DeleteMaterialDirectoryResponse.AllowRetry"));
		deleteMaterialDirectoryResponse.setAppName(_ctx.stringValue("DeleteMaterialDirectoryResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteMaterialDirectoryResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("DeleteMaterialDirectoryResponse.ErrorArgs["+ i +"]"));
		}
		deleteMaterialDirectoryResponse.setErrorArgs(errorArgs);
	 
	 	return deleteMaterialDirectoryResponse;
	}
}