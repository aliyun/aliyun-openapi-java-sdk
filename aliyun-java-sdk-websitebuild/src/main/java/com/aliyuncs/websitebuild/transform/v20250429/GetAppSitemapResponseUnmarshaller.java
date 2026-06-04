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

import com.aliyuncs.websitebuild.model.v20250429.GetAppSitemapResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppSitemapResponseUnmarshaller {

	public static GetAppSitemapResponse unmarshall(GetAppSitemapResponse getAppSitemapResponse, UnmarshallerContext _ctx) {
		
		getAppSitemapResponse.setRequestId(_ctx.stringValue("GetAppSitemapResponse.RequestId"));
		getAppSitemapResponse.setDynamicCode(_ctx.stringValue("GetAppSitemapResponse.DynamicCode"));
		getAppSitemapResponse.setDynamicMessage(_ctx.stringValue("GetAppSitemapResponse.DynamicMessage"));
		getAppSitemapResponse.setSynchro(_ctx.booleanValue("GetAppSitemapResponse.Synchro"));
		getAppSitemapResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppSitemapResponse.AccessDeniedDetail"));
		getAppSitemapResponse.setRootErrorMsg(_ctx.stringValue("GetAppSitemapResponse.RootErrorMsg"));
		getAppSitemapResponse.setRootErrorCode(_ctx.stringValue("GetAppSitemapResponse.RootErrorCode"));
		getAppSitemapResponse.setModule(_ctx.stringValue("GetAppSitemapResponse.Module"));
		getAppSitemapResponse.setAllowRetry(_ctx.booleanValue("GetAppSitemapResponse.AllowRetry"));
		getAppSitemapResponse.setAppName(_ctx.stringValue("GetAppSitemapResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppSitemapResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppSitemapResponse.ErrorArgs["+ i +"]"));
		}
		getAppSitemapResponse.setErrorArgs(errorArgs);
	 
	 	return getAppSitemapResponse;
	}
}