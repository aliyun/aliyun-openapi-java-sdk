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

import com.aliyuncs.websitebuild.model.v20250429.DeleteAppInstanceFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAppInstanceFileResponseUnmarshaller {

	public static DeleteAppInstanceFileResponse unmarshall(DeleteAppInstanceFileResponse deleteAppInstanceFileResponse, UnmarshallerContext _ctx) {
		
		deleteAppInstanceFileResponse.setRequestId(_ctx.stringValue("DeleteAppInstanceFileResponse.RequestId"));
		deleteAppInstanceFileResponse.setDynamicCode(_ctx.stringValue("DeleteAppInstanceFileResponse.DynamicCode"));
		deleteAppInstanceFileResponse.setDynamicMessage(_ctx.stringValue("DeleteAppInstanceFileResponse.DynamicMessage"));
		deleteAppInstanceFileResponse.setSynchro(_ctx.booleanValue("DeleteAppInstanceFileResponse.Synchro"));
		deleteAppInstanceFileResponse.setAccessDeniedDetail(_ctx.stringValue("DeleteAppInstanceFileResponse.AccessDeniedDetail"));
		deleteAppInstanceFileResponse.setRootErrorMsg(_ctx.stringValue("DeleteAppInstanceFileResponse.RootErrorMsg"));
		deleteAppInstanceFileResponse.setRootErrorCode(_ctx.stringValue("DeleteAppInstanceFileResponse.RootErrorCode"));
		deleteAppInstanceFileResponse.setModule(_ctx.booleanValue("DeleteAppInstanceFileResponse.Module"));
		deleteAppInstanceFileResponse.setAllowRetry(_ctx.booleanValue("DeleteAppInstanceFileResponse.AllowRetry"));
		deleteAppInstanceFileResponse.setAppName(_ctx.stringValue("DeleteAppInstanceFileResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteAppInstanceFileResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("DeleteAppInstanceFileResponse.ErrorArgs["+ i +"]"));
		}
		deleteAppInstanceFileResponse.setErrorArgs(errorArgs);
	 
	 	return deleteAppInstanceFileResponse;
	}
}