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

package com.aliyuncs.agency.transform.v20200324;

import com.aliyuncs.agency.model.v20200324.CreateBpmsResultResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBpmsResultResponseUnmarshaller {

	public static CreateBpmsResultResponse unmarshall(CreateBpmsResultResponse createBpmsResultResponse, UnmarshallerContext _ctx) {
		
		createBpmsResultResponse.setRequestId(_ctx.stringValue("CreateBpmsResultResponse.RequestId"));
		createBpmsResultResponse.setCode(_ctx.stringValue("CreateBpmsResultResponse.Code"));
		createBpmsResultResponse.setSuccess(_ctx.booleanValue("CreateBpmsResultResponse.Success"));
		createBpmsResultResponse.setData(_ctx.stringValue("CreateBpmsResultResponse.Data"));
	 
	 	return createBpmsResultResponse;
	}
}