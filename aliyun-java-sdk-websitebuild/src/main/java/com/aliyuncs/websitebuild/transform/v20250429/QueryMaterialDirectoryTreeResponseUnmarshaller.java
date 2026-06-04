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

import com.aliyuncs.websitebuild.model.v20250429.QueryMaterialDirectoryTreeResponse;
import com.aliyuncs.websitebuild.model.v20250429.QueryMaterialDirectoryTreeResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.QueryMaterialDirectoryTreeResponse.Module.DirectoryListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMaterialDirectoryTreeResponseUnmarshaller {

	public static QueryMaterialDirectoryTreeResponse unmarshall(QueryMaterialDirectoryTreeResponse queryMaterialDirectoryTreeResponse, UnmarshallerContext _ctx) {
		
		queryMaterialDirectoryTreeResponse.setRequestId(_ctx.stringValue("QueryMaterialDirectoryTreeResponse.RequestId"));
		queryMaterialDirectoryTreeResponse.setErrorMsg(_ctx.stringValue("QueryMaterialDirectoryTreeResponse.ErrorMsg"));
		queryMaterialDirectoryTreeResponse.setSuccess(_ctx.booleanValue("QueryMaterialDirectoryTreeResponse.Success"));
		queryMaterialDirectoryTreeResponse.setErrorCode(_ctx.stringValue("QueryMaterialDirectoryTreeResponse.ErrorCode"));
		queryMaterialDirectoryTreeResponse.setDynamicCode(_ctx.stringValue("QueryMaterialDirectoryTreeResponse.DynamicCode"));
		queryMaterialDirectoryTreeResponse.setDynamicMessage(_ctx.stringValue("QueryMaterialDirectoryTreeResponse.DynamicMessage"));
		queryMaterialDirectoryTreeResponse.setSynchro(_ctx.booleanValue("QueryMaterialDirectoryTreeResponse.Synchro"));
		queryMaterialDirectoryTreeResponse.setAccessDeniedDetail(_ctx.stringValue("QueryMaterialDirectoryTreeResponse.AccessDeniedDetail"));
		queryMaterialDirectoryTreeResponse.setRootErrorMsg(_ctx.stringValue("QueryMaterialDirectoryTreeResponse.RootErrorMsg"));
		queryMaterialDirectoryTreeResponse.setRootErrorCode(_ctx.stringValue("QueryMaterialDirectoryTreeResponse.RootErrorCode"));
		queryMaterialDirectoryTreeResponse.setAllowRetry(_ctx.booleanValue("QueryMaterialDirectoryTreeResponse.AllowRetry"));
		queryMaterialDirectoryTreeResponse.setAppName(_ctx.stringValue("QueryMaterialDirectoryTreeResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryMaterialDirectoryTreeResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("QueryMaterialDirectoryTreeResponse.ErrorArgs["+ i +"]"));
		}
		queryMaterialDirectoryTreeResponse.setErrorArgs(errorArgs);

		Module module = new Module();

		List<DirectoryListItem> directoryList = new ArrayList<DirectoryListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMaterialDirectoryTreeResponse.Module.DirectoryList.Length"); i++) {
			DirectoryListItem directoryListItem = new DirectoryListItem();
			directoryListItem.setBizId(_ctx.stringValue("QueryMaterialDirectoryTreeResponse.Module.DirectoryList["+ i +"].BizId"));
			directoryListItem.setDirectoryId(_ctx.stringValue("QueryMaterialDirectoryTreeResponse.Module.DirectoryList["+ i +"].DirectoryId"));
			directoryListItem.setName(_ctx.stringValue("QueryMaterialDirectoryTreeResponse.Module.DirectoryList["+ i +"].Name"));
			directoryListItem.setType(_ctx.stringValue("QueryMaterialDirectoryTreeResponse.Module.DirectoryList["+ i +"].Type"));
			directoryListItem.setSortNum(_ctx.stringValue("QueryMaterialDirectoryTreeResponse.Module.DirectoryList["+ i +"].SortNum"));

			List<String> children = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryMaterialDirectoryTreeResponse.Module.DirectoryList["+ i +"].Children.Length"); j++) {
				children.add(_ctx.stringValue("QueryMaterialDirectoryTreeResponse.Module.DirectoryList["+ i +"].Children["+ j +"]"));
			}
			directoryListItem.setChildren(children);

			directoryList.add(directoryListItem);
		}
		module.setDirectoryList(directoryList);
		queryMaterialDirectoryTreeResponse.setModule(module);
	 
	 	return queryMaterialDirectoryTreeResponse;
	}
}