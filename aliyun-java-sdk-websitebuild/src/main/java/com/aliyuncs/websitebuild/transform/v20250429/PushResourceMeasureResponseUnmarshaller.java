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

import com.aliyuncs.websitebuild.model.v20250429.PushResourceMeasureResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushResourceMeasureResponseUnmarshaller {

	public static PushResourceMeasureResponse unmarshall(PushResourceMeasureResponse pushResourceMeasureResponse, UnmarshallerContext _ctx) {
		
		pushResourceMeasureResponse.setRequestId(_ctx.stringValue("PushResourceMeasureResponse.RequestId"));
		pushResourceMeasureResponse.setDynamicCode(_ctx.stringValue("PushResourceMeasureResponse.DynamicCode"));
		pushResourceMeasureResponse.setDynamicMessage(_ctx.stringValue("PushResourceMeasureResponse.DynamicMessage"));
		pushResourceMeasureResponse.setSynchro(_ctx.booleanValue("PushResourceMeasureResponse.Synchro"));
		pushResourceMeasureResponse.setAccessDeniedDetail(_ctx.stringValue("PushResourceMeasureResponse.AccessDeniedDetail"));
		pushResourceMeasureResponse.setRootErrorMsg(_ctx.stringValue("PushResourceMeasureResponse.RootErrorMsg"));
		pushResourceMeasureResponse.setRootErrorCode(_ctx.stringValue("PushResourceMeasureResponse.RootErrorCode"));
		pushResourceMeasureResponse.setModule(_ctx.booleanValue("PushResourceMeasureResponse.Module"));
		pushResourceMeasureResponse.setAllowRetry(_ctx.booleanValue("PushResourceMeasureResponse.AllowRetry"));
		pushResourceMeasureResponse.setAppName(_ctx.stringValue("PushResourceMeasureResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PushResourceMeasureResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("PushResourceMeasureResponse.ErrorArgs["+ i +"]"));
		}
		pushResourceMeasureResponse.setErrorArgs(errorArgs);
	 
	 	return pushResourceMeasureResponse;
	}
}