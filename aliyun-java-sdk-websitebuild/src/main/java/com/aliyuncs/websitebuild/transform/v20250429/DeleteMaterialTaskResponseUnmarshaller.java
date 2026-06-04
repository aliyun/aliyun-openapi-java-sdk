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

import com.aliyuncs.websitebuild.model.v20250429.DeleteMaterialTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMaterialTaskResponseUnmarshaller {

	public static DeleteMaterialTaskResponse unmarshall(DeleteMaterialTaskResponse deleteMaterialTaskResponse, UnmarshallerContext _ctx) {
		
		deleteMaterialTaskResponse.setRequestId(_ctx.stringValue("DeleteMaterialTaskResponse.RequestId"));
		deleteMaterialTaskResponse.setDynamicCode(_ctx.stringValue("DeleteMaterialTaskResponse.DynamicCode"));
		deleteMaterialTaskResponse.setDynamicMessage(_ctx.stringValue("DeleteMaterialTaskResponse.DynamicMessage"));
		deleteMaterialTaskResponse.setSynchro(_ctx.booleanValue("DeleteMaterialTaskResponse.Synchro"));
		deleteMaterialTaskResponse.setAccessDeniedDetail(_ctx.stringValue("DeleteMaterialTaskResponse.AccessDeniedDetail"));
		deleteMaterialTaskResponse.setRootErrorMsg(_ctx.stringValue("DeleteMaterialTaskResponse.RootErrorMsg"));
		deleteMaterialTaskResponse.setRootErrorCode(_ctx.stringValue("DeleteMaterialTaskResponse.RootErrorCode"));
		deleteMaterialTaskResponse.setModule(_ctx.booleanValue("DeleteMaterialTaskResponse.Module"));
		deleteMaterialTaskResponse.setAllowRetry(_ctx.booleanValue("DeleteMaterialTaskResponse.AllowRetry"));
		deleteMaterialTaskResponse.setAppName(_ctx.stringValue("DeleteMaterialTaskResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteMaterialTaskResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("DeleteMaterialTaskResponse.ErrorArgs["+ i +"]"));
		}
		deleteMaterialTaskResponse.setErrorArgs(errorArgs);
	 
	 	return deleteMaterialTaskResponse;
	}
}