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

import com.aliyuncs.websitebuild.model.v20250429.UploadAppSiteValidationFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadAppSiteValidationFileResponseUnmarshaller {

	public static UploadAppSiteValidationFileResponse unmarshall(UploadAppSiteValidationFileResponse uploadAppSiteValidationFileResponse, UnmarshallerContext _ctx) {
		
		uploadAppSiteValidationFileResponse.setRequestId(_ctx.stringValue("UploadAppSiteValidationFileResponse.RequestId"));
		uploadAppSiteValidationFileResponse.setDynamicCode(_ctx.stringValue("UploadAppSiteValidationFileResponse.DynamicCode"));
		uploadAppSiteValidationFileResponse.setDynamicMessage(_ctx.stringValue("UploadAppSiteValidationFileResponse.DynamicMessage"));
		uploadAppSiteValidationFileResponse.setSynchro(_ctx.booleanValue("UploadAppSiteValidationFileResponse.Synchro"));
		uploadAppSiteValidationFileResponse.setAccessDeniedDetail(_ctx.stringValue("UploadAppSiteValidationFileResponse.AccessDeniedDetail"));
		uploadAppSiteValidationFileResponse.setRootErrorMsg(_ctx.stringValue("UploadAppSiteValidationFileResponse.RootErrorMsg"));
		uploadAppSiteValidationFileResponse.setRootErrorCode(_ctx.stringValue("UploadAppSiteValidationFileResponse.RootErrorCode"));
		uploadAppSiteValidationFileResponse.setModule(_ctx.booleanValue("UploadAppSiteValidationFileResponse.Module"));
		uploadAppSiteValidationFileResponse.setAllowRetry(_ctx.booleanValue("UploadAppSiteValidationFileResponse.AllowRetry"));
		uploadAppSiteValidationFileResponse.setAppName(_ctx.stringValue("UploadAppSiteValidationFileResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UploadAppSiteValidationFileResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("UploadAppSiteValidationFileResponse.ErrorArgs["+ i +"]"));
		}
		uploadAppSiteValidationFileResponse.setErrorArgs(errorArgs);
	 
	 	return uploadAppSiteValidationFileResponse;
	}
}