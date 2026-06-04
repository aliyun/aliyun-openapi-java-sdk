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

import com.aliyuncs.websitebuild.model.v20250429.GetAppCodeWorkspaceDetailResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppCodeWorkspaceDetailResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.GetAppCodeWorkspaceDetailResponse.Module.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppCodeWorkspaceDetailResponseUnmarshaller {

	public static GetAppCodeWorkspaceDetailResponse unmarshall(GetAppCodeWorkspaceDetailResponse getAppCodeWorkspaceDetailResponse, UnmarshallerContext _ctx) {
		
		getAppCodeWorkspaceDetailResponse.setRequestId(_ctx.stringValue("GetAppCodeWorkspaceDetailResponse.RequestId"));
		getAppCodeWorkspaceDetailResponse.setDynamicCode(_ctx.stringValue("GetAppCodeWorkspaceDetailResponse.DynamicCode"));
		getAppCodeWorkspaceDetailResponse.setDynamicMessage(_ctx.stringValue("GetAppCodeWorkspaceDetailResponse.DynamicMessage"));
		getAppCodeWorkspaceDetailResponse.setSynchro(_ctx.booleanValue("GetAppCodeWorkspaceDetailResponse.Synchro"));
		getAppCodeWorkspaceDetailResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppCodeWorkspaceDetailResponse.AccessDeniedDetail"));
		getAppCodeWorkspaceDetailResponse.setRootErrorMsg(_ctx.stringValue("GetAppCodeWorkspaceDetailResponse.RootErrorMsg"));
		getAppCodeWorkspaceDetailResponse.setRootErrorCode(_ctx.stringValue("GetAppCodeWorkspaceDetailResponse.RootErrorCode"));
		getAppCodeWorkspaceDetailResponse.setAllowRetry(_ctx.booleanValue("GetAppCodeWorkspaceDetailResponse.AllowRetry"));
		getAppCodeWorkspaceDetailResponse.setAppName(_ctx.stringValue("GetAppCodeWorkspaceDetailResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppCodeWorkspaceDetailResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppCodeWorkspaceDetailResponse.ErrorArgs["+ i +"]"));
		}
		getAppCodeWorkspaceDetailResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setSiteId(_ctx.stringValue("GetAppCodeWorkspaceDetailResponse.Module.SiteId"));
		module.setActiveLogicalNumber(_ctx.integerValue("GetAppCodeWorkspaceDetailResponse.Module.ActiveLogicalNumber"));
		module.setMaxLogicalNumber(_ctx.integerValue("GetAppCodeWorkspaceDetailResponse.Module.MaxLogicalNumber"));
		module.setIsDirty(_ctx.booleanValue("GetAppCodeWorkspaceDetailResponse.Module.IsDirty"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < _ctx.lengthValue("GetAppCodeWorkspaceDetailResponse.Module.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setLogicalNumber(_ctx.integerValue("GetAppCodeWorkspaceDetailResponse.Module.Snapshots["+ i +"].LogicalNumber"));
			snapshot.setChangeLog(_ctx.stringValue("GetAppCodeWorkspaceDetailResponse.Module.Snapshots["+ i +"].ChangeLog"));
			snapshot.setGmtCreateTime(_ctx.stringValue("GetAppCodeWorkspaceDetailResponse.Module.Snapshots["+ i +"].GmtCreateTime"));

			snapshots.add(snapshot);
		}
		module.setSnapshots(snapshots);
		getAppCodeWorkspaceDetailResponse.setModule(module);
	 
	 	return getAppCodeWorkspaceDetailResponse;
	}
}