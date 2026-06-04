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

import com.aliyuncs.websitebuild.model.v20250429.QueryMaterialTaskListResponse;
import com.aliyuncs.websitebuild.model.v20250429.QueryMaterialTaskListResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.QueryMaterialTaskListResponse.Module.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMaterialTaskListResponseUnmarshaller {

	public static QueryMaterialTaskListResponse unmarshall(QueryMaterialTaskListResponse queryMaterialTaskListResponse, UnmarshallerContext _ctx) {
		
		queryMaterialTaskListResponse.setRequestId(_ctx.stringValue("QueryMaterialTaskListResponse.RequestId"));
		queryMaterialTaskListResponse.setErrorMsg(_ctx.stringValue("QueryMaterialTaskListResponse.ErrorMsg"));
		queryMaterialTaskListResponse.setSuccess(_ctx.booleanValue("QueryMaterialTaskListResponse.Success"));
		queryMaterialTaskListResponse.setErrorCode(_ctx.stringValue("QueryMaterialTaskListResponse.ErrorCode"));
		queryMaterialTaskListResponse.setDynamicCode(_ctx.stringValue("QueryMaterialTaskListResponse.DynamicCode"));
		queryMaterialTaskListResponse.setDynamicMessage(_ctx.stringValue("QueryMaterialTaskListResponse.DynamicMessage"));
		queryMaterialTaskListResponse.setSynchro(_ctx.booleanValue("QueryMaterialTaskListResponse.Synchro"));
		queryMaterialTaskListResponse.setAccessDeniedDetail(_ctx.stringValue("QueryMaterialTaskListResponse.AccessDeniedDetail"));
		queryMaterialTaskListResponse.setRootErrorMsg(_ctx.stringValue("QueryMaterialTaskListResponse.RootErrorMsg"));
		queryMaterialTaskListResponse.setRootErrorCode(_ctx.stringValue("QueryMaterialTaskListResponse.RootErrorCode"));
		queryMaterialTaskListResponse.setAllowRetry(_ctx.booleanValue("QueryMaterialTaskListResponse.AllowRetry"));
		queryMaterialTaskListResponse.setAppName(_ctx.stringValue("QueryMaterialTaskListResponse.AppName"));
		queryMaterialTaskListResponse.setMaxResults(_ctx.integerValue("QueryMaterialTaskListResponse.MaxResults"));
		queryMaterialTaskListResponse.setNextToken(_ctx.stringValue("QueryMaterialTaskListResponse.NextToken"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryMaterialTaskListResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("QueryMaterialTaskListResponse.ErrorArgs["+ i +"]"));
		}
		queryMaterialTaskListResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setTotalItemNum(_ctx.integerValue("QueryMaterialTaskListResponse.Module.TotalItemNum"));
		module.setCurrentPageNum(_ctx.integerValue("QueryMaterialTaskListResponse.Module.CurrentPageNum"));
		module.setPageSize(_ctx.integerValue("QueryMaterialTaskListResponse.Module.PageSize"));
		module.setTotalPageNum(_ctx.integerValue("QueryMaterialTaskListResponse.Module.TotalPageNum"));
		module.setPrePage(_ctx.booleanValue("QueryMaterialTaskListResponse.Module.PrePage"));
		module.setNextPage(_ctx.booleanValue("QueryMaterialTaskListResponse.Module.NextPage"));
		module.setResultLimit(_ctx.booleanValue("QueryMaterialTaskListResponse.Module.ResultLimit"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMaterialTaskListResponse.Module.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTaskId(_ctx.stringValue("QueryMaterialTaskListResponse.Module.Data["+ i +"].TaskId"));
			dataItem.setTaskType(_ctx.stringValue("QueryMaterialTaskListResponse.Module.Data["+ i +"].TaskType"));
			dataItem.setTaskParam(_ctx.stringValue("QueryMaterialTaskListResponse.Module.Data["+ i +"].TaskParam"));
			dataItem.setStatus(_ctx.stringValue("QueryMaterialTaskListResponse.Module.Data["+ i +"].Status"));
			dataItem.setSubStatus(_ctx.stringValue("QueryMaterialTaskListResponse.Module.Data["+ i +"].SubStatus"));
			dataItem.setSubmitTime(_ctx.stringValue("QueryMaterialTaskListResponse.Module.Data["+ i +"].SubmitTime"));
			dataItem.setCompleteTime(_ctx.stringValue("QueryMaterialTaskListResponse.Module.Data["+ i +"].CompleteTime"));
			dataItem.setFailReason(_ctx.stringValue("QueryMaterialTaskListResponse.Module.Data["+ i +"].FailReason"));
			dataItem.setCompleteTimeFormat(_ctx.stringValue("QueryMaterialTaskListResponse.Module.Data["+ i +"].CompleteTimeFormat"));

			List<String> finalFileUrls = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryMaterialTaskListResponse.Module.Data["+ i +"].FinalFileUrls.Length"); j++) {
				finalFileUrls.add(_ctx.stringValue("QueryMaterialTaskListResponse.Module.Data["+ i +"].FinalFileUrls["+ j +"]"));
			}
			dataItem.setFinalFileUrls(finalFileUrls);

			data.add(dataItem);
		}
		module.setData(data);
		queryMaterialTaskListResponse.setModule(module);
	 
	 	return queryMaterialTaskListResponse;
	}
}