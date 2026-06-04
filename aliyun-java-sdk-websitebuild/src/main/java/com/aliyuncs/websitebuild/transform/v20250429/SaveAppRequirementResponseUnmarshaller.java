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

import com.aliyuncs.websitebuild.model.v20250429.SaveAppRequirementResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveAppRequirementResponseUnmarshaller {

	public static SaveAppRequirementResponse unmarshall(SaveAppRequirementResponse saveAppRequirementResponse, UnmarshallerContext _ctx) {
		
		saveAppRequirementResponse.setRequestId(_ctx.stringValue("SaveAppRequirementResponse.RequestId"));
		saveAppRequirementResponse.setDynamicCode(_ctx.stringValue("SaveAppRequirementResponse.DynamicCode"));
		saveAppRequirementResponse.setDynamicMessage(_ctx.stringValue("SaveAppRequirementResponse.DynamicMessage"));
		saveAppRequirementResponse.setSynchro(_ctx.booleanValue("SaveAppRequirementResponse.Synchro"));
		saveAppRequirementResponse.setAccessDeniedDetail(_ctx.stringValue("SaveAppRequirementResponse.AccessDeniedDetail"));
		saveAppRequirementResponse.setRootErrorMsg(_ctx.stringValue("SaveAppRequirementResponse.RootErrorMsg"));
		saveAppRequirementResponse.setRootErrorCode(_ctx.stringValue("SaveAppRequirementResponse.RootErrorCode"));
		saveAppRequirementResponse.setModule(_ctx.booleanValue("SaveAppRequirementResponse.Module"));
		saveAppRequirementResponse.setAllowRetry(_ctx.booleanValue("SaveAppRequirementResponse.AllowRetry"));
		saveAppRequirementResponse.setAppName(_ctx.stringValue("SaveAppRequirementResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SaveAppRequirementResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("SaveAppRequirementResponse.ErrorArgs["+ i +"]"));
		}
		saveAppRequirementResponse.setErrorArgs(errorArgs);
	 
	 	return saveAppRequirementResponse;
	}
}