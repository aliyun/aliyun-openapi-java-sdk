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

import com.aliyuncs.websitebuild.model.v20250429.UploadMaterialFileResponse;
import com.aliyuncs.websitebuild.model.v20250429.UploadMaterialFileResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadMaterialFileResponseUnmarshaller {

	public static UploadMaterialFileResponse unmarshall(UploadMaterialFileResponse uploadMaterialFileResponse, UnmarshallerContext _ctx) {
		
		uploadMaterialFileResponse.setRequestId(_ctx.stringValue("UploadMaterialFileResponse.RequestId"));
		uploadMaterialFileResponse.setErrorMsg(_ctx.stringValue("UploadMaterialFileResponse.ErrorMsg"));
		uploadMaterialFileResponse.setSuccess(_ctx.booleanValue("UploadMaterialFileResponse.Success"));
		uploadMaterialFileResponse.setErrorCode(_ctx.stringValue("UploadMaterialFileResponse.ErrorCode"));
		uploadMaterialFileResponse.setDynamicCode(_ctx.stringValue("UploadMaterialFileResponse.DynamicCode"));
		uploadMaterialFileResponse.setDynamicMessage(_ctx.stringValue("UploadMaterialFileResponse.DynamicMessage"));
		uploadMaterialFileResponse.setSynchro(_ctx.booleanValue("UploadMaterialFileResponse.Synchro"));
		uploadMaterialFileResponse.setAccessDeniedDetail(_ctx.stringValue("UploadMaterialFileResponse.AccessDeniedDetail"));
		uploadMaterialFileResponse.setRootErrorMsg(_ctx.stringValue("UploadMaterialFileResponse.RootErrorMsg"));
		uploadMaterialFileResponse.setRootErrorCode(_ctx.stringValue("UploadMaterialFileResponse.RootErrorCode"));
		uploadMaterialFileResponse.setAllowRetry(_ctx.booleanValue("UploadMaterialFileResponse.AllowRetry"));
		uploadMaterialFileResponse.setAppName(_ctx.stringValue("UploadMaterialFileResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UploadMaterialFileResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("UploadMaterialFileResponse.ErrorArgs["+ i +"]"));
		}
		uploadMaterialFileResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setBizId(_ctx.stringValue("UploadMaterialFileResponse.Module.BizId"));
		module.setFileId(_ctx.stringValue("UploadMaterialFileResponse.Module.FileId"));
		module.setName(_ctx.stringValue("UploadMaterialFileResponse.Module.Name"));
		module.setSuffix(_ctx.stringValue("UploadMaterialFileResponse.Module.Suffix"));
		module.setType(_ctx.stringValue("UploadMaterialFileResponse.Module.Type"));
		module.setContentType(_ctx.stringValue("UploadMaterialFileResponse.Module.ContentType"));
		module.setDirectoryId(_ctx.stringValue("UploadMaterialFileResponse.Module.DirectoryId"));
		module.setFileUrl(_ctx.stringValue("UploadMaterialFileResponse.Module.FileUrl"));
		module.setWidth(_ctx.integerValue("UploadMaterialFileResponse.Module.Width"));
		module.setHeight(_ctx.integerValue("UploadMaterialFileResponse.Module.Height"));
		module.setStorageSize(_ctx.stringValue("UploadMaterialFileResponse.Module.StorageSize"));
		module.setDeletedTime(_ctx.stringValue("UploadMaterialFileResponse.Module.DeletedTime"));
		module.setStatus(_ctx.stringValue("UploadMaterialFileResponse.Module.Status"));
		module.setCreateTime(_ctx.stringValue("UploadMaterialFileResponse.Module.CreateTime"));
		uploadMaterialFileResponse.setModule(module);
	 
	 	return uploadMaterialFileResponse;
	}
}