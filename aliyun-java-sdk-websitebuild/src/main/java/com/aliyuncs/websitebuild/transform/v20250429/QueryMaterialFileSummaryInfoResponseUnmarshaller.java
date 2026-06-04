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

import com.aliyuncs.websitebuild.model.v20250429.QueryMaterialFileSummaryInfoResponse;
import com.aliyuncs.websitebuild.model.v20250429.QueryMaterialFileSummaryInfoResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMaterialFileSummaryInfoResponseUnmarshaller {

	public static QueryMaterialFileSummaryInfoResponse unmarshall(QueryMaterialFileSummaryInfoResponse queryMaterialFileSummaryInfoResponse, UnmarshallerContext _ctx) {
		
		queryMaterialFileSummaryInfoResponse.setRequestId(_ctx.stringValue("QueryMaterialFileSummaryInfoResponse.RequestId"));
		queryMaterialFileSummaryInfoResponse.setDynamicCode(_ctx.stringValue("QueryMaterialFileSummaryInfoResponse.DynamicCode"));
		queryMaterialFileSummaryInfoResponse.setDynamicMessage(_ctx.stringValue("QueryMaterialFileSummaryInfoResponse.DynamicMessage"));
		queryMaterialFileSummaryInfoResponse.setSynchro(_ctx.booleanValue("QueryMaterialFileSummaryInfoResponse.Synchro"));
		queryMaterialFileSummaryInfoResponse.setAccessDeniedDetail(_ctx.stringValue("QueryMaterialFileSummaryInfoResponse.AccessDeniedDetail"));
		queryMaterialFileSummaryInfoResponse.setRootErrorMsg(_ctx.stringValue("QueryMaterialFileSummaryInfoResponse.RootErrorMsg"));
		queryMaterialFileSummaryInfoResponse.setRootErrorCode(_ctx.stringValue("QueryMaterialFileSummaryInfoResponse.RootErrorCode"));
		queryMaterialFileSummaryInfoResponse.setAllowRetry(_ctx.booleanValue("QueryMaterialFileSummaryInfoResponse.AllowRetry"));
		queryMaterialFileSummaryInfoResponse.setAppName(_ctx.stringValue("QueryMaterialFileSummaryInfoResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryMaterialFileSummaryInfoResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("QueryMaterialFileSummaryInfoResponse.ErrorArgs["+ i +"]"));
		}
		queryMaterialFileSummaryInfoResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setFileNum(_ctx.longValue("QueryMaterialFileSummaryInfoResponse.Module.FileNum"));
		module.setStorageSize(_ctx.stringValue("QueryMaterialFileSummaryInfoResponse.Module.StorageSize"));
		queryMaterialFileSummaryInfoResponse.setModule(module);
	 
	 	return queryMaterialFileSummaryInfoResponse;
	}
}