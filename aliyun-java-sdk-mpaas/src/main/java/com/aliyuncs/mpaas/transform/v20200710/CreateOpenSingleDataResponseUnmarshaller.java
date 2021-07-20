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

package com.aliyuncs.mpaas.transform.v20200710;

import com.aliyuncs.mpaas.model.v20200710.CreateOpenSingleDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOpenSingleDataResponseUnmarshaller {

	public static CreateOpenSingleDataResponse unmarshall(CreateOpenSingleDataResponse createOpenSingleDataResponse, UnmarshallerContext _ctx) {
		
		createOpenSingleDataResponse.setRequestId(_ctx.stringValue("CreateOpenSingleDataResponse.RequestId"));
		createOpenSingleDataResponse.setResultCode(_ctx.stringValue("CreateOpenSingleDataResponse.ResultCode"));
		createOpenSingleDataResponse.setResultMessage(_ctx.stringValue("CreateOpenSingleDataResponse.ResultMessage"));
		createOpenSingleDataResponse.setResult(_ctx.booleanValue("CreateOpenSingleDataResponse.Result"));
	 
	 	return createOpenSingleDataResponse;
	}
}