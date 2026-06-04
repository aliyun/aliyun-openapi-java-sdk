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

import com.aliyuncs.websitebuild.model.v20250429.ListAppPluginConfigsResponse;
import com.aliyuncs.websitebuild.model.v20250429.ListAppPluginConfigsResponse.ModuleItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppPluginConfigsResponseUnmarshaller {

	public static ListAppPluginConfigsResponse unmarshall(ListAppPluginConfigsResponse listAppPluginConfigsResponse, UnmarshallerContext _ctx) {
		
		listAppPluginConfigsResponse.setRequestId(_ctx.stringValue("ListAppPluginConfigsResponse.RequestId"));
		listAppPluginConfigsResponse.setDynamicCode(_ctx.stringValue("ListAppPluginConfigsResponse.DynamicCode"));
		listAppPluginConfigsResponse.setDynamicMessage(_ctx.stringValue("ListAppPluginConfigsResponse.DynamicMessage"));
		listAppPluginConfigsResponse.setSynchro(_ctx.booleanValue("ListAppPluginConfigsResponse.Synchro"));
		listAppPluginConfigsResponse.setAccessDeniedDetail(_ctx.stringValue("ListAppPluginConfigsResponse.AccessDeniedDetail"));
		listAppPluginConfigsResponse.setRootErrorMsg(_ctx.stringValue("ListAppPluginConfigsResponse.RootErrorMsg"));
		listAppPluginConfigsResponse.setRootErrorCode(_ctx.stringValue("ListAppPluginConfigsResponse.RootErrorCode"));
		listAppPluginConfigsResponse.setAllowRetry(_ctx.booleanValue("ListAppPluginConfigsResponse.AllowRetry"));
		listAppPluginConfigsResponse.setAppName(_ctx.stringValue("ListAppPluginConfigsResponse.AppName"));
		listAppPluginConfigsResponse.setNextToken(_ctx.stringValue("ListAppPluginConfigsResponse.NextToken"));
		listAppPluginConfigsResponse.setMaxResults(_ctx.integerValue("ListAppPluginConfigsResponse.MaxResults"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAppPluginConfigsResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ListAppPluginConfigsResponse.ErrorArgs["+ i +"]"));
		}
		listAppPluginConfigsResponse.setErrorArgs(errorArgs);

		List<ModuleItem> module = new ArrayList<ModuleItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppPluginConfigsResponse.Module.Length"); i++) {
			ModuleItem moduleItem = new ModuleItem();
			moduleItem.setId(_ctx.longValue("ListAppPluginConfigsResponse.Module["+ i +"].Id"));
			moduleItem.setUserId(_ctx.stringValue("ListAppPluginConfigsResponse.Module["+ i +"].UserId"));
			moduleItem.setBizId(_ctx.stringValue("ListAppPluginConfigsResponse.Module["+ i +"].BizId"));
			moduleItem.setPluginId(_ctx.stringValue("ListAppPluginConfigsResponse.Module["+ i +"].PluginId"));
			moduleItem.setPluginName(_ctx.stringValue("ListAppPluginConfigsResponse.Module["+ i +"].PluginName"));
			moduleItem.setPluginDesc(_ctx.stringValue("ListAppPluginConfigsResponse.Module["+ i +"].PluginDesc"));
			moduleItem.setPluginConfig(_ctx.stringValue("ListAppPluginConfigsResponse.Module["+ i +"].PluginConfig"));
			moduleItem.setGmtCreateTime(_ctx.stringValue("ListAppPluginConfigsResponse.Module["+ i +"].GmtCreateTime"));
			moduleItem.setGmtModifiedTime(_ctx.stringValue("ListAppPluginConfigsResponse.Module["+ i +"].GmtModifiedTime"));
			moduleItem.setExtend(_ctx.mapValue("ListAppPluginConfigsResponse.Module["+ i +"].Extend"));
			moduleItem.setSiteName(_ctx.stringValue("ListAppPluginConfigsResponse.Module["+ i +"].SiteName"));
			moduleItem.setEnabled(_ctx.integerValue("ListAppPluginConfigsResponse.Module["+ i +"].Enabled"));
			moduleItem.setDisplay(_ctx.integerValue("ListAppPluginConfigsResponse.Module["+ i +"].Display"));

			module.add(moduleItem);
		}
		listAppPluginConfigsResponse.setModule(module);
	 
	 	return listAppPluginConfigsResponse;
	}
}