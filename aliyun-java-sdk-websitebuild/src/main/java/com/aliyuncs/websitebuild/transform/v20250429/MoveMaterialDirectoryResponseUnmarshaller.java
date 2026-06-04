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

import com.aliyuncs.websitebuild.model.v20250429.MoveMaterialDirectoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MoveMaterialDirectoryResponseUnmarshaller {

	public static MoveMaterialDirectoryResponse unmarshall(MoveMaterialDirectoryResponse moveMaterialDirectoryResponse, UnmarshallerContext _ctx) {
		
		moveMaterialDirectoryResponse.setRequestId(_ctx.stringValue("MoveMaterialDirectoryResponse.RequestId"));
		moveMaterialDirectoryResponse.setErrorMsg(_ctx.stringValue("MoveMaterialDirectoryResponse.ErrorMsg"));
		moveMaterialDirectoryResponse.setSuccess(_ctx.booleanValue("MoveMaterialDirectoryResponse.Success"));
		moveMaterialDirectoryResponse.setErrorCode(_ctx.stringValue("MoveMaterialDirectoryResponse.ErrorCode"));
		moveMaterialDirectoryResponse.setDynamicCode(_ctx.stringValue("MoveMaterialDirectoryResponse.DynamicCode"));
		moveMaterialDirectoryResponse.setDynamicMessage(_ctx.stringValue("MoveMaterialDirectoryResponse.DynamicMessage"));
		moveMaterialDirectoryResponse.setSynchro(_ctx.booleanValue("MoveMaterialDirectoryResponse.Synchro"));
		moveMaterialDirectoryResponse.setAccessDeniedDetail(_ctx.stringValue("MoveMaterialDirectoryResponse.AccessDeniedDetail"));
		moveMaterialDirectoryResponse.setRootErrorMsg(_ctx.stringValue("MoveMaterialDirectoryResponse.RootErrorMsg"));
		moveMaterialDirectoryResponse.setRootErrorCode(_ctx.stringValue("MoveMaterialDirectoryResponse.RootErrorCode"));
		moveMaterialDirectoryResponse.setModule(_ctx.booleanValue("MoveMaterialDirectoryResponse.Module"));
		moveMaterialDirectoryResponse.setAllowRetry(_ctx.booleanValue("MoveMaterialDirectoryResponse.AllowRetry"));
		moveMaterialDirectoryResponse.setAppName(_ctx.stringValue("MoveMaterialDirectoryResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("MoveMaterialDirectoryResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("MoveMaterialDirectoryResponse.ErrorArgs["+ i +"]"));
		}
		moveMaterialDirectoryResponse.setErrorArgs(errorArgs);
	 
	 	return moveMaterialDirectoryResponse;
	}
}