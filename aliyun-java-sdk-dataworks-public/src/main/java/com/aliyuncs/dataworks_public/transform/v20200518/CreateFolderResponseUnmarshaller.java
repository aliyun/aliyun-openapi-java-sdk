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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.CreateFolderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFolderResponseUnmarshaller {

	public static CreateFolderResponse unmarshall(CreateFolderResponse createFolderResponse, UnmarshallerContext _ctx) {
		
		createFolderResponse.setRequestId(_ctx.stringValue("CreateFolderResponse.RequestId"));
		createFolderResponse.setHttpStatusCode(_ctx.integerValue("CreateFolderResponse.HttpStatusCode"));
		createFolderResponse.setData(_ctx.stringValue("CreateFolderResponse.Data"));
		createFolderResponse.setErrorMessage(_ctx.stringValue("CreateFolderResponse.ErrorMessage"));
		createFolderResponse.setSuccess(_ctx.booleanValue("CreateFolderResponse.Success"));
		createFolderResponse.setErrorCode(_ctx.stringValue("CreateFolderResponse.ErrorCode"));
	 
	 	return createFolderResponse;
	}
}