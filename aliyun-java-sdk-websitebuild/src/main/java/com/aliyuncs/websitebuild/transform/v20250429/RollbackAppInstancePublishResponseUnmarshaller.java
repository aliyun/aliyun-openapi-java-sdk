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

import com.aliyuncs.websitebuild.model.v20250429.RollbackAppInstancePublishResponse;
import com.aliyuncs.websitebuild.model.v20250429.RollbackAppInstancePublishResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class RollbackAppInstancePublishResponseUnmarshaller {

	public static RollbackAppInstancePublishResponse unmarshall(RollbackAppInstancePublishResponse rollbackAppInstancePublishResponse, UnmarshallerContext _ctx) {
		
		rollbackAppInstancePublishResponse.setRequestId(_ctx.stringValue("RollbackAppInstancePublishResponse.RequestId"));
		rollbackAppInstancePublishResponse.setDynamicCode(_ctx.stringValue("RollbackAppInstancePublishResponse.DynamicCode"));
		rollbackAppInstancePublishResponse.setDynamicMessage(_ctx.stringValue("RollbackAppInstancePublishResponse.DynamicMessage"));
		rollbackAppInstancePublishResponse.setSynchro(_ctx.booleanValue("RollbackAppInstancePublishResponse.Synchro"));
		rollbackAppInstancePublishResponse.setAccessDeniedDetail(_ctx.stringValue("RollbackAppInstancePublishResponse.AccessDeniedDetail"));
		rollbackAppInstancePublishResponse.setRootErrorMsg(_ctx.stringValue("RollbackAppInstancePublishResponse.RootErrorMsg"));
		rollbackAppInstancePublishResponse.setRootErrorCode(_ctx.stringValue("RollbackAppInstancePublishResponse.RootErrorCode"));
		rollbackAppInstancePublishResponse.setAllowRetry(_ctx.booleanValue("RollbackAppInstancePublishResponse.AllowRetry"));
		rollbackAppInstancePublishResponse.setAppName(_ctx.stringValue("RollbackAppInstancePublishResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RollbackAppInstancePublishResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("RollbackAppInstancePublishResponse.ErrorArgs["+ i +"]"));
		}
		rollbackAppInstancePublishResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setPublishOrderId(_ctx.longValue("RollbackAppInstancePublishResponse.Module.PublishOrderId"));
		rollbackAppInstancePublishResponse.setModule(module);
	 
	 	return rollbackAppInstancePublishResponse;
	}
}