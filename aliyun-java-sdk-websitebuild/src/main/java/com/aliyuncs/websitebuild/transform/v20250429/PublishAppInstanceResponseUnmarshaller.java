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

import com.aliyuncs.websitebuild.model.v20250429.PublishAppInstanceResponse;
import com.aliyuncs.websitebuild.model.v20250429.PublishAppInstanceResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class PublishAppInstanceResponseUnmarshaller {

	public static PublishAppInstanceResponse unmarshall(PublishAppInstanceResponse publishAppInstanceResponse, UnmarshallerContext _ctx) {
		
		publishAppInstanceResponse.setRequestId(_ctx.stringValue("PublishAppInstanceResponse.RequestId"));
		publishAppInstanceResponse.setDynamicCode(_ctx.stringValue("PublishAppInstanceResponse.DynamicCode"));
		publishAppInstanceResponse.setDynamicMessage(_ctx.stringValue("PublishAppInstanceResponse.DynamicMessage"));
		publishAppInstanceResponse.setSynchro(_ctx.booleanValue("PublishAppInstanceResponse.Synchro"));
		publishAppInstanceResponse.setAccessDeniedDetail(_ctx.stringValue("PublishAppInstanceResponse.AccessDeniedDetail"));
		publishAppInstanceResponse.setRootErrorMsg(_ctx.stringValue("PublishAppInstanceResponse.RootErrorMsg"));
		publishAppInstanceResponse.setRootErrorCode(_ctx.stringValue("PublishAppInstanceResponse.RootErrorCode"));
		publishAppInstanceResponse.setAllowRetry(_ctx.booleanValue("PublishAppInstanceResponse.AllowRetry"));
		publishAppInstanceResponse.setAppName(_ctx.stringValue("PublishAppInstanceResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PublishAppInstanceResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("PublishAppInstanceResponse.ErrorArgs["+ i +"]"));
		}
		publishAppInstanceResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setPublishOrderId(_ctx.longValue("PublishAppInstanceResponse.Module.PublishOrderId"));
		publishAppInstanceResponse.setModule(module);
	 
	 	return publishAppInstanceResponse;
	}
}