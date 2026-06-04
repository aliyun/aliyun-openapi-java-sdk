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

import com.aliyuncs.websitebuild.model.v20250429.QueryMaterialFileDetailResponse;
import com.aliyuncs.websitebuild.model.v20250429.QueryMaterialFileDetailResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMaterialFileDetailResponseUnmarshaller {

	public static QueryMaterialFileDetailResponse unmarshall(QueryMaterialFileDetailResponse queryMaterialFileDetailResponse, UnmarshallerContext _ctx) {
		
		queryMaterialFileDetailResponse.setRequestId(_ctx.stringValue("QueryMaterialFileDetailResponse.RequestId"));
		queryMaterialFileDetailResponse.setErrorMsg(_ctx.stringValue("QueryMaterialFileDetailResponse.ErrorMsg"));
		queryMaterialFileDetailResponse.setSuccess(_ctx.booleanValue("QueryMaterialFileDetailResponse.Success"));
		queryMaterialFileDetailResponse.setErrorCode(_ctx.stringValue("QueryMaterialFileDetailResponse.ErrorCode"));
		queryMaterialFileDetailResponse.setDynamicCode(_ctx.stringValue("QueryMaterialFileDetailResponse.DynamicCode"));
		queryMaterialFileDetailResponse.setDynamicMessage(_ctx.stringValue("QueryMaterialFileDetailResponse.DynamicMessage"));
		queryMaterialFileDetailResponse.setSynchro(_ctx.booleanValue("QueryMaterialFileDetailResponse.Synchro"));
		queryMaterialFileDetailResponse.setAccessDeniedDetail(_ctx.stringValue("QueryMaterialFileDetailResponse.AccessDeniedDetail"));
		queryMaterialFileDetailResponse.setRootErrorMsg(_ctx.stringValue("QueryMaterialFileDetailResponse.RootErrorMsg"));
		queryMaterialFileDetailResponse.setRootErrorCode(_ctx.stringValue("QueryMaterialFileDetailResponse.RootErrorCode"));
		queryMaterialFileDetailResponse.setAllowRetry(_ctx.booleanValue("QueryMaterialFileDetailResponse.AllowRetry"));
		queryMaterialFileDetailResponse.setAppName(_ctx.stringValue("QueryMaterialFileDetailResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryMaterialFileDetailResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("QueryMaterialFileDetailResponse.ErrorArgs["+ i +"]"));
		}
		queryMaterialFileDetailResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setBizId(_ctx.stringValue("QueryMaterialFileDetailResponse.Module.BizId"));
		module.setFileId(_ctx.stringValue("QueryMaterialFileDetailResponse.Module.FileId"));
		module.setName(_ctx.stringValue("QueryMaterialFileDetailResponse.Module.Name"));
		module.setSuffix(_ctx.stringValue("QueryMaterialFileDetailResponse.Module.Suffix"));
		module.setType(_ctx.stringValue("QueryMaterialFileDetailResponse.Module.Type"));
		module.setContentType(_ctx.stringValue("QueryMaterialFileDetailResponse.Module.ContentType"));
		module.setDirectoryId(_ctx.stringValue("QueryMaterialFileDetailResponse.Module.DirectoryId"));
		module.setFileUrl(_ctx.stringValue("QueryMaterialFileDetailResponse.Module.FileUrl"));
		module.setWidth(_ctx.integerValue("QueryMaterialFileDetailResponse.Module.Width"));
		module.setHeight(_ctx.integerValue("QueryMaterialFileDetailResponse.Module.Height"));
		module.setStorageSize(_ctx.stringValue("QueryMaterialFileDetailResponse.Module.StorageSize"));
		module.setDeletedTime(_ctx.stringValue("QueryMaterialFileDetailResponse.Module.DeletedTime"));
		module.setStatus(_ctx.stringValue("QueryMaterialFileDetailResponse.Module.Status"));
		module.setCreateTime(_ctx.stringValue("QueryMaterialFileDetailResponse.Module.CreateTime"));
		queryMaterialFileDetailResponse.setModule(module);
	 
	 	return queryMaterialFileDetailResponse;
	}
}