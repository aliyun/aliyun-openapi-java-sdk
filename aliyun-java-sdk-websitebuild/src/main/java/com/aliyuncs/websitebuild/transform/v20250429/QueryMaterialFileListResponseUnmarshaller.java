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

import com.aliyuncs.websitebuild.model.v20250429.QueryMaterialFileListResponse;
import com.aliyuncs.websitebuild.model.v20250429.QueryMaterialFileListResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.QueryMaterialFileListResponse.Module.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMaterialFileListResponseUnmarshaller {

	public static QueryMaterialFileListResponse unmarshall(QueryMaterialFileListResponse queryMaterialFileListResponse, UnmarshallerContext _ctx) {
		
		queryMaterialFileListResponse.setRequestId(_ctx.stringValue("QueryMaterialFileListResponse.RequestId"));
		queryMaterialFileListResponse.setErrorMsg(_ctx.stringValue("QueryMaterialFileListResponse.ErrorMsg"));
		queryMaterialFileListResponse.setSuccess(_ctx.booleanValue("QueryMaterialFileListResponse.Success"));
		queryMaterialFileListResponse.setErrorCode(_ctx.stringValue("QueryMaterialFileListResponse.ErrorCode"));
		queryMaterialFileListResponse.setDynamicCode(_ctx.stringValue("QueryMaterialFileListResponse.DynamicCode"));
		queryMaterialFileListResponse.setDynamicMessage(_ctx.stringValue("QueryMaterialFileListResponse.DynamicMessage"));
		queryMaterialFileListResponse.setSynchro(_ctx.booleanValue("QueryMaterialFileListResponse.Synchro"));
		queryMaterialFileListResponse.setAccessDeniedDetail(_ctx.stringValue("QueryMaterialFileListResponse.AccessDeniedDetail"));
		queryMaterialFileListResponse.setRootErrorMsg(_ctx.stringValue("QueryMaterialFileListResponse.RootErrorMsg"));
		queryMaterialFileListResponse.setRootErrorCode(_ctx.stringValue("QueryMaterialFileListResponse.RootErrorCode"));
		queryMaterialFileListResponse.setAllowRetry(_ctx.booleanValue("QueryMaterialFileListResponse.AllowRetry"));
		queryMaterialFileListResponse.setAppName(_ctx.stringValue("QueryMaterialFileListResponse.AppName"));
		queryMaterialFileListResponse.setMaxResults(_ctx.integerValue("QueryMaterialFileListResponse.MaxResults"));
		queryMaterialFileListResponse.setNextToken(_ctx.stringValue("QueryMaterialFileListResponse.NextToken"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryMaterialFileListResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("QueryMaterialFileListResponse.ErrorArgs["+ i +"]"));
		}
		queryMaterialFileListResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setTotalItemNum(_ctx.integerValue("QueryMaterialFileListResponse.Module.TotalItemNum"));
		module.setCurrentPageNum(_ctx.integerValue("QueryMaterialFileListResponse.Module.CurrentPageNum"));
		module.setPageSize(_ctx.integerValue("QueryMaterialFileListResponse.Module.PageSize"));
		module.setTotalPageNum(_ctx.integerValue("QueryMaterialFileListResponse.Module.TotalPageNum"));
		module.setPrePage(_ctx.booleanValue("QueryMaterialFileListResponse.Module.PrePage"));
		module.setNextPage(_ctx.booleanValue("QueryMaterialFileListResponse.Module.NextPage"));
		module.setResultLimit(_ctx.booleanValue("QueryMaterialFileListResponse.Module.ResultLimit"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMaterialFileListResponse.Module.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBizId(_ctx.stringValue("QueryMaterialFileListResponse.Module.Data["+ i +"].BizId"));
			dataItem.setFileId(_ctx.stringValue("QueryMaterialFileListResponse.Module.Data["+ i +"].FileId"));
			dataItem.setName(_ctx.stringValue("QueryMaterialFileListResponse.Module.Data["+ i +"].Name"));
			dataItem.setSuffix(_ctx.stringValue("QueryMaterialFileListResponse.Module.Data["+ i +"].Suffix"));
			dataItem.setType(_ctx.stringValue("QueryMaterialFileListResponse.Module.Data["+ i +"].Type"));
			dataItem.setContentType(_ctx.stringValue("QueryMaterialFileListResponse.Module.Data["+ i +"].ContentType"));
			dataItem.setDirectoryId(_ctx.stringValue("QueryMaterialFileListResponse.Module.Data["+ i +"].DirectoryId"));
			dataItem.setFileUrl(_ctx.stringValue("QueryMaterialFileListResponse.Module.Data["+ i +"].FileUrl"));
			dataItem.setWidth(_ctx.integerValue("QueryMaterialFileListResponse.Module.Data["+ i +"].Width"));
			dataItem.setHeight(_ctx.integerValue("QueryMaterialFileListResponse.Module.Data["+ i +"].Height"));
			dataItem.setStorageSize(_ctx.stringValue("QueryMaterialFileListResponse.Module.Data["+ i +"].StorageSize"));
			dataItem.setDeletedTime(_ctx.stringValue("QueryMaterialFileListResponse.Module.Data["+ i +"].DeletedTime"));
			dataItem.setStatus(_ctx.stringValue("QueryMaterialFileListResponse.Module.Data["+ i +"].Status"));
			dataItem.setCreateTime(_ctx.stringValue("QueryMaterialFileListResponse.Module.Data["+ i +"].CreateTime"));

			data.add(dataItem);
		}
		module.setData(data);
		queryMaterialFileListResponse.setModule(module);
	 
	 	return queryMaterialFileListResponse;
	}
}