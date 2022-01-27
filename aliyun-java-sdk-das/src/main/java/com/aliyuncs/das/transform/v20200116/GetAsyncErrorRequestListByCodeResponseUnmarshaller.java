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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.GetAsyncErrorRequestListByCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAsyncErrorRequestListByCodeResponseUnmarshaller {

	public static GetAsyncErrorRequestListByCodeResponse unmarshall(GetAsyncErrorRequestListByCodeResponse getAsyncErrorRequestListByCodeResponse, UnmarshallerContext _ctx) {
		
		getAsyncErrorRequestListByCodeResponse.setRequestId(_ctx.stringValue("GetAsyncErrorRequestListByCodeResponse.RequestId"));
		getAsyncErrorRequestListByCodeResponse.setCode(_ctx.stringValue("GetAsyncErrorRequestListByCodeResponse.Code"));
		getAsyncErrorRequestListByCodeResponse.setMessage(_ctx.stringValue("GetAsyncErrorRequestListByCodeResponse.Message"));
		getAsyncErrorRequestListByCodeResponse.setData(_ctx.stringValue("GetAsyncErrorRequestListByCodeResponse.Data"));
		getAsyncErrorRequestListByCodeResponse.setSuccess(_ctx.stringValue("GetAsyncErrorRequestListByCodeResponse.Success"));
	 
	 	return getAsyncErrorRequestListByCodeResponse;
	}
}