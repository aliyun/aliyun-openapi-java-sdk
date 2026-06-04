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

import com.aliyuncs.websitebuild.model.v20250429.GetAppPublishStatusResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppPublishStatusResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppPublishStatusResponseUnmarshaller {

	public static GetAppPublishStatusResponse unmarshall(GetAppPublishStatusResponse getAppPublishStatusResponse, UnmarshallerContext _ctx) {
		
		getAppPublishStatusResponse.setRequestId(_ctx.stringValue("GetAppPublishStatusResponse.RequestId"));
		getAppPublishStatusResponse.setDynamicCode(_ctx.stringValue("GetAppPublishStatusResponse.DynamicCode"));
		getAppPublishStatusResponse.setDynamicMessage(_ctx.stringValue("GetAppPublishStatusResponse.DynamicMessage"));
		getAppPublishStatusResponse.setSynchro(_ctx.booleanValue("GetAppPublishStatusResponse.Synchro"));
		getAppPublishStatusResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppPublishStatusResponse.AccessDeniedDetail"));
		getAppPublishStatusResponse.setRootErrorMsg(_ctx.stringValue("GetAppPublishStatusResponse.RootErrorMsg"));
		getAppPublishStatusResponse.setRootErrorCode(_ctx.stringValue("GetAppPublishStatusResponse.RootErrorCode"));
		getAppPublishStatusResponse.setAllowRetry(_ctx.booleanValue("GetAppPublishStatusResponse.AllowRetry"));
		getAppPublishStatusResponse.setAppName(_ctx.stringValue("GetAppPublishStatusResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppPublishStatusResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppPublishStatusResponse.ErrorArgs["+ i +"]"));
		}
		getAppPublishStatusResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setIsFinish(_ctx.booleanValue("GetAppPublishStatusResponse.Module.IsFinish"));
		module.setIsSuccess(_ctx.booleanValue("GetAppPublishStatusResponse.Module.IsSuccess"));
		module.setMsg(_ctx.stringValue("GetAppPublishStatusResponse.Module.Msg"));
		module.setPercent(_ctx.integerValue("GetAppPublishStatusResponse.Module.Percent"));
		module.setPublishOrderId(_ctx.longValue("GetAppPublishStatusResponse.Module.PublishOrderId"));
		module.setCurrentStep(_ctx.stringValue("GetAppPublishStatusResponse.Module.CurrentStep"));
		module.setOrderType(_ctx.stringValue("GetAppPublishStatusResponse.Module.OrderType"));
		module.setPublishNumber(_ctx.stringValue("GetAppPublishStatusResponse.Module.PublishNumber"));
		module.setPublishTime(_ctx.stringValue("GetAppPublishStatusResponse.Module.PublishTime"));
		module.setDescription(_ctx.stringValue("GetAppPublishStatusResponse.Module.Description"));
		module.setErrorStep(_ctx.stringValue("GetAppPublishStatusResponse.Module.ErrorStep"));
		module.setSiteId(_ctx.stringValue("GetAppPublishStatusResponse.Module.SiteId"));
		module.setDeployChannel(_ctx.stringValue("GetAppPublishStatusResponse.Module.DeployChannel"));
		module.setCanQuickRevert(_ctx.stringValue("GetAppPublishStatusResponse.Module.CanQuickRevert"));

		List<String> steps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppPublishStatusResponse.Module.Steps.Length"); i++) {
			steps.add(_ctx.stringValue("GetAppPublishStatusResponse.Module.Steps["+ i +"]"));
		}
		module.setSteps(steps);
		getAppPublishStatusResponse.setModule(module);
	 
	 	return getAppPublishStatusResponse;
	}
}