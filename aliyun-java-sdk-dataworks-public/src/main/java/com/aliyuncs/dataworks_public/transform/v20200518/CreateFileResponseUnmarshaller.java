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

import com.aliyuncs.dataworks_public.model.v20200518.CreateFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFileResponseUnmarshaller {

	public static CreateFileResponse unmarshall(CreateFileResponse createFileResponse, UnmarshallerContext _ctx) {
		
		createFileResponse.setRequestId(_ctx.stringValue("CreateFileResponse.RequestId"));
		createFileResponse.setHttpStatusCode(_ctx.integerValue("CreateFileResponse.HttpStatusCode"));
		createFileResponse.setData(_ctx.longValue("CreateFileResponse.Data"));
		createFileResponse.setErrorMessage(_ctx.stringValue("CreateFileResponse.ErrorMessage"));
		createFileResponse.setSuccess(_ctx.booleanValue("CreateFileResponse.Success"));
		createFileResponse.setErrorCode(_ctx.stringValue("CreateFileResponse.ErrorCode"));
	 
	 	return createFileResponse;
	}
}