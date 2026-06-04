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

import com.aliyuncs.websitebuild.model.v20250429.ListAppTemplateDictsResponse;
import com.aliyuncs.websitebuild.model.v20250429.ListAppTemplateDictsResponse.ModuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppTemplateDictsResponseUnmarshaller {

	public static ListAppTemplateDictsResponse unmarshall(ListAppTemplateDictsResponse listAppTemplateDictsResponse, UnmarshallerContext _ctx) {
		
		listAppTemplateDictsResponse.setRequestId(_ctx.stringValue("ListAppTemplateDictsResponse.RequestId"));
		listAppTemplateDictsResponse.setDynamicCode(_ctx.stringValue("ListAppTemplateDictsResponse.DynamicCode"));
		listAppTemplateDictsResponse.setDynamicMessage(_ctx.stringValue("ListAppTemplateDictsResponse.DynamicMessage"));
		listAppTemplateDictsResponse.setSynchro(_ctx.booleanValue("ListAppTemplateDictsResponse.Synchro"));
		listAppTemplateDictsResponse.setAccessDeniedDetail(_ctx.stringValue("ListAppTemplateDictsResponse.AccessDeniedDetail"));
		listAppTemplateDictsResponse.setRootErrorMsg(_ctx.stringValue("ListAppTemplateDictsResponse.RootErrorMsg"));
		listAppTemplateDictsResponse.setRootErrorCode(_ctx.stringValue("ListAppTemplateDictsResponse.RootErrorCode"));
		listAppTemplateDictsResponse.setAllowRetry(_ctx.booleanValue("ListAppTemplateDictsResponse.AllowRetry"));
		listAppTemplateDictsResponse.setAppName(_ctx.stringValue("ListAppTemplateDictsResponse.AppName"));
		listAppTemplateDictsResponse.setNextToken(_ctx.stringValue("ListAppTemplateDictsResponse.NextToken"));
		listAppTemplateDictsResponse.setMaxResults(_ctx.integerValue("ListAppTemplateDictsResponse.MaxResults"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAppTemplateDictsResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ListAppTemplateDictsResponse.ErrorArgs["+ i +"]"));
		}
		listAppTemplateDictsResponse.setErrorArgs(errorArgs);

		List<ModuleItem> module = new ArrayList<ModuleItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppTemplateDictsResponse.Module.Length"); i++) {
			ModuleItem moduleItem = new ModuleItem();
			moduleItem.setDictType(_ctx.stringValue("ListAppTemplateDictsResponse.Module["+ i +"].DictType"));
			moduleItem.setDictCode(_ctx.stringValue("ListAppTemplateDictsResponse.Module["+ i +"].DictCode"));
			moduleItem.setDictLabel(_ctx.stringValue("ListAppTemplateDictsResponse.Module["+ i +"].DictLabel"));
			moduleItem.setDictValue(_ctx.stringValue("ListAppTemplateDictsResponse.Module["+ i +"].DictValue"));
			moduleItem.setSortOrder(_ctx.integerValue("ListAppTemplateDictsResponse.Module["+ i +"].SortOrder"));
			moduleItem.setHasTemplates(_ctx.booleanValue("ListAppTemplateDictsResponse.Module["+ i +"].HasTemplates"));

			module.add(moduleItem);
		}
		listAppTemplateDictsResponse.setModule(module);
	 
	 	return listAppTemplateDictsResponse;
	}
}