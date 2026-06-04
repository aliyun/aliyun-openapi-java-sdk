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

import com.aliyuncs.websitebuild.model.v20250429.UpdateAppInstanceResponse;
import com.aliyuncs.websitebuild.model.v20250429.UpdateAppInstanceResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAppInstanceResponseUnmarshaller {

	public static UpdateAppInstanceResponse unmarshall(UpdateAppInstanceResponse updateAppInstanceResponse, UnmarshallerContext _ctx) {
		
		updateAppInstanceResponse.setRequestId(_ctx.stringValue("UpdateAppInstanceResponse.RequestId"));
		updateAppInstanceResponse.setDynamicCode(_ctx.stringValue("UpdateAppInstanceResponse.DynamicCode"));
		updateAppInstanceResponse.setDynamicMessage(_ctx.stringValue("UpdateAppInstanceResponse.DynamicMessage"));
		updateAppInstanceResponse.setSynchro(_ctx.booleanValue("UpdateAppInstanceResponse.Synchro"));
		updateAppInstanceResponse.setAccessDeniedDetail(_ctx.stringValue("UpdateAppInstanceResponse.AccessDeniedDetail"));
		updateAppInstanceResponse.setRootErrorMsg(_ctx.stringValue("UpdateAppInstanceResponse.RootErrorMsg"));
		updateAppInstanceResponse.setRootErrorCode(_ctx.stringValue("UpdateAppInstanceResponse.RootErrorCode"));
		updateAppInstanceResponse.setAllowRetry(_ctx.booleanValue("UpdateAppInstanceResponse.AllowRetry"));
		updateAppInstanceResponse.setAppName(_ctx.stringValue("UpdateAppInstanceResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAppInstanceResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("UpdateAppInstanceResponse.ErrorArgs["+ i +"]"));
		}
		updateAppInstanceResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setOrderId(_ctx.stringValue("UpdateAppInstanceResponse.Module.OrderId"));
		module.setBizId(_ctx.stringValue("UpdateAppInstanceResponse.Module.BizId"));
		module.setIconUrl(_ctx.stringValue("UpdateAppInstanceResponse.Module.IconUrl"));
		module.setThumbnailUrl(_ctx.stringValue("UpdateAppInstanceResponse.Module.ThumbnailUrl"));
		updateAppInstanceResponse.setModule(module);
	 
	 	return updateAppInstanceResponse;
	}
}