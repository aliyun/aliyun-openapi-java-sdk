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

import com.aliyuncs.websitebuild.model.v20250429.RollbackAppCodeSnapshotResponse;
import com.aliyuncs.websitebuild.model.v20250429.RollbackAppCodeSnapshotResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class RollbackAppCodeSnapshotResponseUnmarshaller {

	public static RollbackAppCodeSnapshotResponse unmarshall(RollbackAppCodeSnapshotResponse rollbackAppCodeSnapshotResponse, UnmarshallerContext _ctx) {
		
		rollbackAppCodeSnapshotResponse.setRequestId(_ctx.stringValue("RollbackAppCodeSnapshotResponse.RequestId"));
		rollbackAppCodeSnapshotResponse.setDynamicCode(_ctx.stringValue("RollbackAppCodeSnapshotResponse.DynamicCode"));
		rollbackAppCodeSnapshotResponse.setDynamicMessage(_ctx.stringValue("RollbackAppCodeSnapshotResponse.DynamicMessage"));
		rollbackAppCodeSnapshotResponse.setSynchro(_ctx.booleanValue("RollbackAppCodeSnapshotResponse.Synchro"));
		rollbackAppCodeSnapshotResponse.setAccessDeniedDetail(_ctx.stringValue("RollbackAppCodeSnapshotResponse.AccessDeniedDetail"));
		rollbackAppCodeSnapshotResponse.setRootErrorMsg(_ctx.stringValue("RollbackAppCodeSnapshotResponse.RootErrorMsg"));
		rollbackAppCodeSnapshotResponse.setRootErrorCode(_ctx.stringValue("RollbackAppCodeSnapshotResponse.RootErrorCode"));
		rollbackAppCodeSnapshotResponse.setAllowRetry(_ctx.booleanValue("RollbackAppCodeSnapshotResponse.AllowRetry"));
		rollbackAppCodeSnapshotResponse.setAppName(_ctx.stringValue("RollbackAppCodeSnapshotResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RollbackAppCodeSnapshotResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("RollbackAppCodeSnapshotResponse.ErrorArgs["+ i +"]"));
		}
		rollbackAppCodeSnapshotResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setLogicalNumber(_ctx.integerValue("RollbackAppCodeSnapshotResponse.Module.LogicalNumber"));
		module.setChangeLog(_ctx.stringValue("RollbackAppCodeSnapshotResponse.Module.ChangeLog"));
		module.setGmtCreate(_ctx.stringValue("RollbackAppCodeSnapshotResponse.Module.GmtCreate"));
		rollbackAppCodeSnapshotResponse.setModule(module);
	 
	 	return rollbackAppCodeSnapshotResponse;
	}
}