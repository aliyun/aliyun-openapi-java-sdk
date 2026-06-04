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

import com.aliyuncs.websitebuild.model.v20250429.ListAppPluginsResponse;
import com.aliyuncs.websitebuild.model.v20250429.ListAppPluginsResponse.ModuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppPluginsResponseUnmarshaller {

	public static ListAppPluginsResponse unmarshall(ListAppPluginsResponse listAppPluginsResponse, UnmarshallerContext _ctx) {
		
		listAppPluginsResponse.setRequestId(_ctx.stringValue("ListAppPluginsResponse.RequestId"));
		listAppPluginsResponse.setDynamicCode(_ctx.stringValue("ListAppPluginsResponse.DynamicCode"));
		listAppPluginsResponse.setDynamicMessage(_ctx.stringValue("ListAppPluginsResponse.DynamicMessage"));
		listAppPluginsResponse.setSynchro(_ctx.booleanValue("ListAppPluginsResponse.Synchro"));
		listAppPluginsResponse.setAccessDeniedDetail(_ctx.stringValue("ListAppPluginsResponse.AccessDeniedDetail"));
		listAppPluginsResponse.setRootErrorMsg(_ctx.stringValue("ListAppPluginsResponse.RootErrorMsg"));
		listAppPluginsResponse.setRootErrorCode(_ctx.stringValue("ListAppPluginsResponse.RootErrorCode"));
		listAppPluginsResponse.setAllowRetry(_ctx.booleanValue("ListAppPluginsResponse.AllowRetry"));
		listAppPluginsResponse.setAppName(_ctx.stringValue("ListAppPluginsResponse.AppName"));
		listAppPluginsResponse.setNextToken(_ctx.stringValue("ListAppPluginsResponse.NextToken"));
		listAppPluginsResponse.setMaxResults(_ctx.integerValue("ListAppPluginsResponse.MaxResults"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAppPluginsResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ListAppPluginsResponse.ErrorArgs["+ i +"]"));
		}
		listAppPluginsResponse.setErrorArgs(errorArgs);

		List<ModuleItem> module = new ArrayList<ModuleItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppPluginsResponse.Module.Length"); i++) {
			ModuleItem moduleItem = new ModuleItem();
			moduleItem.setId(_ctx.longValue("ListAppPluginsResponse.Module["+ i +"].Id"));
			moduleItem.setCode(_ctx.stringValue("ListAppPluginsResponse.Module["+ i +"].Code"));
			moduleItem.setName(_ctx.stringValue("ListAppPluginsResponse.Module["+ i +"].Name"));
			moduleItem.setDesc(_ctx.stringValue("ListAppPluginsResponse.Module["+ i +"].Desc"));
			moduleItem.setIcon(_ctx.stringValue("ListAppPluginsResponse.Module["+ i +"].Icon"));
			moduleItem.setTags(_ctx.stringValue("ListAppPluginsResponse.Module["+ i +"].Tags"));
			moduleItem.setEnabled(_ctx.integerValue("ListAppPluginsResponse.Module["+ i +"].Enabled"));
			moduleItem.setDisplay(_ctx.integerValue("ListAppPluginsResponse.Module["+ i +"].Display"));
			moduleItem.setIsDeleted(_ctx.integerValue("ListAppPluginsResponse.Module["+ i +"].IsDeleted"));
			moduleItem.setConfigItems(_ctx.stringValue("ListAppPluginsResponse.Module["+ i +"].ConfigItems"));
			moduleItem.setEnv(_ctx.stringValue("ListAppPluginsResponse.Module["+ i +"].Env"));
			moduleItem.setSkillHeader(_ctx.stringValue("ListAppPluginsResponse.Module["+ i +"].SkillHeader"));
			moduleItem.setHooks(_ctx.stringValue("ListAppPluginsResponse.Module["+ i +"].Hooks"));
			moduleItem.setGmtCreateTime(_ctx.stringValue("ListAppPluginsResponse.Module["+ i +"].GmtCreateTime"));
			moduleItem.setGmtModifiedTime(_ctx.stringValue("ListAppPluginsResponse.Module["+ i +"].GmtModifiedTime"));

			module.add(moduleItem);
		}
		listAppPluginsResponse.setModule(module);
	 
	 	return listAppPluginsResponse;
	}
}