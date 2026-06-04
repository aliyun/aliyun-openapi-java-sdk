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

import com.aliyuncs.websitebuild.model.v20250429.SubmitMaterialTaskResponse;
import com.aliyuncs.websitebuild.model.v20250429.SubmitMaterialTaskResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitMaterialTaskResponseUnmarshaller {

	public static SubmitMaterialTaskResponse unmarshall(SubmitMaterialTaskResponse submitMaterialTaskResponse, UnmarshallerContext _ctx) {
		
		submitMaterialTaskResponse.setRequestId(_ctx.stringValue("SubmitMaterialTaskResponse.RequestId"));
		submitMaterialTaskResponse.setErrorMsg(_ctx.stringValue("SubmitMaterialTaskResponse.ErrorMsg"));
		submitMaterialTaskResponse.setSuccess(_ctx.booleanValue("SubmitMaterialTaskResponse.Success"));
		submitMaterialTaskResponse.setErrorCode(_ctx.stringValue("SubmitMaterialTaskResponse.ErrorCode"));
		submitMaterialTaskResponse.setDynamicCode(_ctx.stringValue("SubmitMaterialTaskResponse.DynamicCode"));
		submitMaterialTaskResponse.setDynamicMessage(_ctx.stringValue("SubmitMaterialTaskResponse.DynamicMessage"));
		submitMaterialTaskResponse.setSynchro(_ctx.booleanValue("SubmitMaterialTaskResponse.Synchro"));
		submitMaterialTaskResponse.setAccessDeniedDetail(_ctx.stringValue("SubmitMaterialTaskResponse.AccessDeniedDetail"));
		submitMaterialTaskResponse.setRootErrorMsg(_ctx.stringValue("SubmitMaterialTaskResponse.RootErrorMsg"));
		submitMaterialTaskResponse.setRootErrorCode(_ctx.stringValue("SubmitMaterialTaskResponse.RootErrorCode"));
		submitMaterialTaskResponse.setAllowRetry(_ctx.booleanValue("SubmitMaterialTaskResponse.AllowRetry"));
		submitMaterialTaskResponse.setAppName(_ctx.stringValue("SubmitMaterialTaskResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SubmitMaterialTaskResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("SubmitMaterialTaskResponse.ErrorArgs["+ i +"]"));
		}
		submitMaterialTaskResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setTaskId(_ctx.stringValue("SubmitMaterialTaskResponse.Module.TaskId"));
		submitMaterialTaskResponse.setModule(module);
	 
	 	return submitMaterialTaskResponse;
	}
}