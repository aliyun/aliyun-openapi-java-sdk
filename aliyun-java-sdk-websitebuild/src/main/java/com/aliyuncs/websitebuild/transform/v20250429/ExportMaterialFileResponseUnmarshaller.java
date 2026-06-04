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

import com.aliyuncs.websitebuild.model.v20250429.ExportMaterialFileResponse;
import com.aliyuncs.websitebuild.model.v20250429.ExportMaterialFileResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportMaterialFileResponseUnmarshaller {

	public static ExportMaterialFileResponse unmarshall(ExportMaterialFileResponse exportMaterialFileResponse, UnmarshallerContext _ctx) {
		
		exportMaterialFileResponse.setRequestId(_ctx.stringValue("ExportMaterialFileResponse.RequestId"));
		exportMaterialFileResponse.setErrorMsg(_ctx.stringValue("ExportMaterialFileResponse.ErrorMsg"));
		exportMaterialFileResponse.setSuccess(_ctx.booleanValue("ExportMaterialFileResponse.Success"));
		exportMaterialFileResponse.setErrorCode(_ctx.stringValue("ExportMaterialFileResponse.ErrorCode"));
		exportMaterialFileResponse.setDynamicCode(_ctx.stringValue("ExportMaterialFileResponse.DynamicCode"));
		exportMaterialFileResponse.setDynamicMessage(_ctx.stringValue("ExportMaterialFileResponse.DynamicMessage"));
		exportMaterialFileResponse.setSynchro(_ctx.booleanValue("ExportMaterialFileResponse.Synchro"));
		exportMaterialFileResponse.setAccessDeniedDetail(_ctx.stringValue("ExportMaterialFileResponse.AccessDeniedDetail"));
		exportMaterialFileResponse.setRootErrorMsg(_ctx.stringValue("ExportMaterialFileResponse.RootErrorMsg"));
		exportMaterialFileResponse.setRootErrorCode(_ctx.stringValue("ExportMaterialFileResponse.RootErrorCode"));
		exportMaterialFileResponse.setAllowRetry(_ctx.booleanValue("ExportMaterialFileResponse.AllowRetry"));
		exportMaterialFileResponse.setAppName(_ctx.stringValue("ExportMaterialFileResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExportMaterialFileResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ExportMaterialFileResponse.ErrorArgs["+ i +"]"));
		}
		exportMaterialFileResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setFileUrl(_ctx.stringValue("ExportMaterialFileResponse.Module.FileUrl"));
		exportMaterialFileResponse.setModule(module);
	 
	 	return exportMaterialFileResponse;
	}
}