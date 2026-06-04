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

import com.aliyuncs.websitebuild.model.v20250429.QueryMaterialTaskDetailResponse;
import com.aliyuncs.websitebuild.model.v20250429.QueryMaterialTaskDetailResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMaterialTaskDetailResponseUnmarshaller {

	public static QueryMaterialTaskDetailResponse unmarshall(QueryMaterialTaskDetailResponse queryMaterialTaskDetailResponse, UnmarshallerContext _ctx) {
		
		queryMaterialTaskDetailResponse.setRequestId(_ctx.stringValue("QueryMaterialTaskDetailResponse.RequestId"));
		queryMaterialTaskDetailResponse.setErrorMsg(_ctx.stringValue("QueryMaterialTaskDetailResponse.ErrorMsg"));
		queryMaterialTaskDetailResponse.setSuccess(_ctx.booleanValue("QueryMaterialTaskDetailResponse.Success"));
		queryMaterialTaskDetailResponse.setErrorCode(_ctx.stringValue("QueryMaterialTaskDetailResponse.ErrorCode"));
		queryMaterialTaskDetailResponse.setDynamicCode(_ctx.stringValue("QueryMaterialTaskDetailResponse.DynamicCode"));
		queryMaterialTaskDetailResponse.setDynamicMessage(_ctx.stringValue("QueryMaterialTaskDetailResponse.DynamicMessage"));
		queryMaterialTaskDetailResponse.setSynchro(_ctx.booleanValue("QueryMaterialTaskDetailResponse.Synchro"));
		queryMaterialTaskDetailResponse.setAccessDeniedDetail(_ctx.stringValue("QueryMaterialTaskDetailResponse.AccessDeniedDetail"));
		queryMaterialTaskDetailResponse.setRootErrorMsg(_ctx.stringValue("QueryMaterialTaskDetailResponse.RootErrorMsg"));
		queryMaterialTaskDetailResponse.setRootErrorCode(_ctx.stringValue("QueryMaterialTaskDetailResponse.RootErrorCode"));
		queryMaterialTaskDetailResponse.setAllowRetry(_ctx.booleanValue("QueryMaterialTaskDetailResponse.AllowRetry"));
		queryMaterialTaskDetailResponse.setAppName(_ctx.stringValue("QueryMaterialTaskDetailResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryMaterialTaskDetailResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("QueryMaterialTaskDetailResponse.ErrorArgs["+ i +"]"));
		}
		queryMaterialTaskDetailResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setTaskId(_ctx.stringValue("QueryMaterialTaskDetailResponse.Module.TaskId"));
		module.setTaskType(_ctx.stringValue("QueryMaterialTaskDetailResponse.Module.TaskType"));
		module.setTaskParam(_ctx.stringValue("QueryMaterialTaskDetailResponse.Module.TaskParam"));
		module.setStatus(_ctx.stringValue("QueryMaterialTaskDetailResponse.Module.Status"));
		module.setSubStatus(_ctx.stringValue("QueryMaterialTaskDetailResponse.Module.SubStatus"));
		module.setSubmitTime(_ctx.stringValue("QueryMaterialTaskDetailResponse.Module.SubmitTime"));
		module.setCompleteTime(_ctx.stringValue("QueryMaterialTaskDetailResponse.Module.CompleteTime"));
		module.setFailReason(_ctx.stringValue("QueryMaterialTaskDetailResponse.Module.FailReason"));
		module.setCompleteTimeFormat(_ctx.stringValue("QueryMaterialTaskDetailResponse.Module.CompleteTimeFormat"));

		List<String> finalFileUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryMaterialTaskDetailResponse.Module.FinalFileUrls.Length"); i++) {
			finalFileUrls.add(_ctx.stringValue("QueryMaterialTaskDetailResponse.Module.FinalFileUrls["+ i +"]"));
		}
		module.setFinalFileUrls(finalFileUrls);
		queryMaterialTaskDetailResponse.setModule(module);
	 
	 	return queryMaterialTaskDetailResponse;
	}
}