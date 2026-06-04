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

import com.aliyuncs.websitebuild.model.v20250429.MoveMaterialFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MoveMaterialFileResponseUnmarshaller {

	public static MoveMaterialFileResponse unmarshall(MoveMaterialFileResponse moveMaterialFileResponse, UnmarshallerContext _ctx) {
		
		moveMaterialFileResponse.setRequestId(_ctx.stringValue("MoveMaterialFileResponse.RequestId"));
		moveMaterialFileResponse.setErrorMsg(_ctx.stringValue("MoveMaterialFileResponse.ErrorMsg"));
		moveMaterialFileResponse.setSuccess(_ctx.booleanValue("MoveMaterialFileResponse.Success"));
		moveMaterialFileResponse.setErrorCode(_ctx.stringValue("MoveMaterialFileResponse.ErrorCode"));
		moveMaterialFileResponse.setDynamicCode(_ctx.stringValue("MoveMaterialFileResponse.DynamicCode"));
		moveMaterialFileResponse.setDynamicMessage(_ctx.stringValue("MoveMaterialFileResponse.DynamicMessage"));
		moveMaterialFileResponse.setSynchro(_ctx.booleanValue("MoveMaterialFileResponse.Synchro"));
		moveMaterialFileResponse.setAccessDeniedDetail(_ctx.stringValue("MoveMaterialFileResponse.AccessDeniedDetail"));
		moveMaterialFileResponse.setRootErrorMsg(_ctx.stringValue("MoveMaterialFileResponse.RootErrorMsg"));
		moveMaterialFileResponse.setRootErrorCode(_ctx.stringValue("MoveMaterialFileResponse.RootErrorCode"));
		moveMaterialFileResponse.setModule(_ctx.booleanValue("MoveMaterialFileResponse.Module"));
		moveMaterialFileResponse.setAllowRetry(_ctx.booleanValue("MoveMaterialFileResponse.AllowRetry"));
		moveMaterialFileResponse.setAppName(_ctx.stringValue("MoveMaterialFileResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("MoveMaterialFileResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("MoveMaterialFileResponse.ErrorArgs["+ i +"]"));
		}
		moveMaterialFileResponse.setErrorArgs(errorArgs);
	 
	 	return moveMaterialFileResponse;
	}
}