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

package com.aliyuncs.cloudmarketing.model.v20180910;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RequestUploadFileRequest extends RpcAcsRequest<RequestUploadFileResponse> {
	
	public RequestUploadFileRequest() {
		super("cloudmarketing", "2018-09-10", "RequestUploadFile");
	}

	@Override
	public Class<RequestUploadFileResponse> getResponseClass() {
		return RequestUploadFileResponse.class;
	}

}
