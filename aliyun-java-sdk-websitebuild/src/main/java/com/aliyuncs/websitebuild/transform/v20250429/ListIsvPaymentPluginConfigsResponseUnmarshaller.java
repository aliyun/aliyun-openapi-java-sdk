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

import com.aliyuncs.websitebuild.model.v20250429.ListIsvPaymentPluginConfigsResponse;
import com.aliyuncs.websitebuild.model.v20250429.ListIsvPaymentPluginConfigsResponse.ModuleItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIsvPaymentPluginConfigsResponseUnmarshaller {

	public static ListIsvPaymentPluginConfigsResponse unmarshall(ListIsvPaymentPluginConfigsResponse listIsvPaymentPluginConfigsResponse, UnmarshallerContext _ctx) {
		
		listIsvPaymentPluginConfigsResponse.setRequestId(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.RequestId"));
		listIsvPaymentPluginConfigsResponse.setDynamicCode(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.DynamicCode"));
		listIsvPaymentPluginConfigsResponse.setDynamicMessage(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.DynamicMessage"));
		listIsvPaymentPluginConfigsResponse.setSynchro(_ctx.booleanValue("ListIsvPaymentPluginConfigsResponse.Synchro"));
		listIsvPaymentPluginConfigsResponse.setAccessDeniedDetail(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.AccessDeniedDetail"));
		listIsvPaymentPluginConfigsResponse.setRootErrorMsg(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.RootErrorMsg"));
		listIsvPaymentPluginConfigsResponse.setRootErrorCode(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.RootErrorCode"));
		listIsvPaymentPluginConfigsResponse.setAllowRetry(_ctx.booleanValue("ListIsvPaymentPluginConfigsResponse.AllowRetry"));
		listIsvPaymentPluginConfigsResponse.setAppName(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.AppName"));
		listIsvPaymentPluginConfigsResponse.setNextToken(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.NextToken"));
		listIsvPaymentPluginConfigsResponse.setMaxResults(_ctx.integerValue("ListIsvPaymentPluginConfigsResponse.MaxResults"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListIsvPaymentPluginConfigsResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.ErrorArgs["+ i +"]"));
		}
		listIsvPaymentPluginConfigsResponse.setErrorArgs(errorArgs);

		List<ModuleItem> module = new ArrayList<ModuleItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIsvPaymentPluginConfigsResponse.Module.Length"); i++) {
			ModuleItem moduleItem = new ModuleItem();
			moduleItem.setId(_ctx.longValue("ListIsvPaymentPluginConfigsResponse.Module["+ i +"].Id"));
			moduleItem.setUserId(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.Module["+ i +"].UserId"));
			moduleItem.setBizId(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.Module["+ i +"].BizId"));
			moduleItem.setPluginId(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.Module["+ i +"].PluginId"));
			moduleItem.setPluginName(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.Module["+ i +"].PluginName"));
			moduleItem.setPluginDesc(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.Module["+ i +"].PluginDesc"));
			moduleItem.setPluginConfig(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.Module["+ i +"].PluginConfig"));
			moduleItem.setGmtCreateTime(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.Module["+ i +"].GmtCreateTime"));
			moduleItem.setGmtModifiedTime(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.Module["+ i +"].GmtModifiedTime"));
			moduleItem.setExtend(_ctx.mapValue("ListIsvPaymentPluginConfigsResponse.Module["+ i +"].Extend"));
			moduleItem.setSiteName(_ctx.stringValue("ListIsvPaymentPluginConfigsResponse.Module["+ i +"].SiteName"));

			module.add(moduleItem);
		}
		listIsvPaymentPluginConfigsResponse.setModule(module);
	 
	 	return listIsvPaymentPluginConfigsResponse;
	}
}