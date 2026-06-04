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

import com.aliyuncs.websitebuild.model.v20250429.OperateAppTemplateLikeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OperateAppTemplateLikeResponseUnmarshaller {

	public static OperateAppTemplateLikeResponse unmarshall(OperateAppTemplateLikeResponse operateAppTemplateLikeResponse, UnmarshallerContext _ctx) {
		
		operateAppTemplateLikeResponse.setRequestId(_ctx.stringValue("OperateAppTemplateLikeResponse.RequestId"));
		operateAppTemplateLikeResponse.setDynamicCode(_ctx.stringValue("OperateAppTemplateLikeResponse.DynamicCode"));
		operateAppTemplateLikeResponse.setDynamicMessage(_ctx.stringValue("OperateAppTemplateLikeResponse.DynamicMessage"));
		operateAppTemplateLikeResponse.setSynchro(_ctx.booleanValue("OperateAppTemplateLikeResponse.Synchro"));
		operateAppTemplateLikeResponse.setAccessDeniedDetail(_ctx.stringValue("OperateAppTemplateLikeResponse.AccessDeniedDetail"));
		operateAppTemplateLikeResponse.setRootErrorMsg(_ctx.stringValue("OperateAppTemplateLikeResponse.RootErrorMsg"));
		operateAppTemplateLikeResponse.setRootErrorCode(_ctx.stringValue("OperateAppTemplateLikeResponse.RootErrorCode"));
		operateAppTemplateLikeResponse.setModule(_ctx.booleanValue("OperateAppTemplateLikeResponse.Module"));
		operateAppTemplateLikeResponse.setAllowRetry(_ctx.booleanValue("OperateAppTemplateLikeResponse.AllowRetry"));
		operateAppTemplateLikeResponse.setAppName(_ctx.stringValue("OperateAppTemplateLikeResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OperateAppTemplateLikeResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("OperateAppTemplateLikeResponse.ErrorArgs["+ i +"]"));
		}
		operateAppTemplateLikeResponse.setErrorArgs(errorArgs);
	 
	 	return operateAppTemplateLikeResponse;
	}
}