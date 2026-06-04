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

import com.aliyuncs.websitebuild.model.v20250429.GetAppWorkspaceDirectoryResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppWorkspaceDirectoryResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.GetAppWorkspaceDirectoryResponse.Module.DirectoryListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppWorkspaceDirectoryResponseUnmarshaller {

	public static GetAppWorkspaceDirectoryResponse unmarshall(GetAppWorkspaceDirectoryResponse getAppWorkspaceDirectoryResponse, UnmarshallerContext _ctx) {
		
		getAppWorkspaceDirectoryResponse.setRequestId(_ctx.stringValue("GetAppWorkspaceDirectoryResponse.RequestId"));
		getAppWorkspaceDirectoryResponse.setDynamicCode(_ctx.stringValue("GetAppWorkspaceDirectoryResponse.DynamicCode"));
		getAppWorkspaceDirectoryResponse.setDynamicMessage(_ctx.stringValue("GetAppWorkspaceDirectoryResponse.DynamicMessage"));
		getAppWorkspaceDirectoryResponse.setSynchro(_ctx.booleanValue("GetAppWorkspaceDirectoryResponse.Synchro"));
		getAppWorkspaceDirectoryResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppWorkspaceDirectoryResponse.AccessDeniedDetail"));
		getAppWorkspaceDirectoryResponse.setRootErrorMsg(_ctx.stringValue("GetAppWorkspaceDirectoryResponse.RootErrorMsg"));
		getAppWorkspaceDirectoryResponse.setRootErrorCode(_ctx.stringValue("GetAppWorkspaceDirectoryResponse.RootErrorCode"));
		getAppWorkspaceDirectoryResponse.setAllowRetry(_ctx.booleanValue("GetAppWorkspaceDirectoryResponse.AllowRetry"));
		getAppWorkspaceDirectoryResponse.setAppName(_ctx.stringValue("GetAppWorkspaceDirectoryResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppWorkspaceDirectoryResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppWorkspaceDirectoryResponse.ErrorArgs["+ i +"]"));
		}
		getAppWorkspaceDirectoryResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setCurrentTime(_ctx.stringValue("GetAppWorkspaceDirectoryResponse.Module.CurrentTime"));

		List<DirectoryListItem> directoryList = new ArrayList<DirectoryListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppWorkspaceDirectoryResponse.Module.DirectoryList.Length"); i++) {
			DirectoryListItem directoryListItem = new DirectoryListItem();
			directoryListItem.setLabel(_ctx.stringValue("GetAppWorkspaceDirectoryResponse.Module.DirectoryList["+ i +"].Label"));
			directoryListItem.setKey(_ctx.stringValue("GetAppWorkspaceDirectoryResponse.Module.DirectoryList["+ i +"].Key"));

			List<String> children = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAppWorkspaceDirectoryResponse.Module.DirectoryList["+ i +"].Children.Length"); j++) {
				children.add(_ctx.stringValue("GetAppWorkspaceDirectoryResponse.Module.DirectoryList["+ i +"].Children["+ j +"]"));
			}
			directoryListItem.setChildren(children);

			directoryList.add(directoryListItem);
		}
		module.setDirectoryList(directoryList);
		getAppWorkspaceDirectoryResponse.setModule(module);
	 
	 	return getAppWorkspaceDirectoryResponse;
	}
}