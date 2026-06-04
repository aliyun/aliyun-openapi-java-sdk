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

import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceTempShortUrlResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceTempShortUrlResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppInstanceTempShortUrlResponseUnmarshaller {

	public static GetAppInstanceTempShortUrlResponse unmarshall(GetAppInstanceTempShortUrlResponse getAppInstanceTempShortUrlResponse, UnmarshallerContext _ctx) {
		
		getAppInstanceTempShortUrlResponse.setRequestId(_ctx.stringValue("GetAppInstanceTempShortUrlResponse.RequestId"));
		getAppInstanceTempShortUrlResponse.setDynamicCode(_ctx.stringValue("GetAppInstanceTempShortUrlResponse.DynamicCode"));
		getAppInstanceTempShortUrlResponse.setDynamicMessage(_ctx.stringValue("GetAppInstanceTempShortUrlResponse.DynamicMessage"));
		getAppInstanceTempShortUrlResponse.setSynchro(_ctx.booleanValue("GetAppInstanceTempShortUrlResponse.Synchro"));
		getAppInstanceTempShortUrlResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppInstanceTempShortUrlResponse.AccessDeniedDetail"));
		getAppInstanceTempShortUrlResponse.setRootErrorMsg(_ctx.stringValue("GetAppInstanceTempShortUrlResponse.RootErrorMsg"));
		getAppInstanceTempShortUrlResponse.setRootErrorCode(_ctx.stringValue("GetAppInstanceTempShortUrlResponse.RootErrorCode"));
		getAppInstanceTempShortUrlResponse.setAllowRetry(_ctx.booleanValue("GetAppInstanceTempShortUrlResponse.AllowRetry"));
		getAppInstanceTempShortUrlResponse.setAppName(_ctx.stringValue("GetAppInstanceTempShortUrlResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceTempShortUrlResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppInstanceTempShortUrlResponse.ErrorArgs["+ i +"]"));
		}
		getAppInstanceTempShortUrlResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setUrl(_ctx.stringValue("GetAppInstanceTempShortUrlResponse.Module.Url"));
		module.setTempShortUrl(_ctx.stringValue("GetAppInstanceTempShortUrlResponse.Module.TempShortUrl"));
		module.setExpireAtTime(_ctx.stringValue("GetAppInstanceTempShortUrlResponse.Module.ExpireAtTime"));
		getAppInstanceTempShortUrlResponse.setModule(module);
	 
	 	return getAppInstanceTempShortUrlResponse;
	}
}