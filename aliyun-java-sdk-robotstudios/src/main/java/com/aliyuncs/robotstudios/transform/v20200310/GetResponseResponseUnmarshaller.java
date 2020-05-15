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

package com.aliyuncs.robotstudios.transform.v20200310;

import com.aliyuncs.robotstudios.model.v20200310.GetResponseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResponseResponseUnmarshaller {

	public static GetResponseResponse unmarshall(GetResponseResponse getResponseResponse, UnmarshallerContext _ctx) {
		
		getResponseResponse.setRequestId(_ctx.stringValue("GetResponseResponse.RequestId"));
		getResponseResponse.setCode(_ctx.stringValue("GetResponseResponse.Code"));
		getResponseResponse.setSuccess(_ctx.stringValue("GetResponseResponse.Success"));
		getResponseResponse.setErrorMessage(_ctx.stringValue("GetResponseResponse.ErrorMessage"));
		getResponseResponse.setErrorCode(_ctx.stringValue("GetResponseResponse.ErrorCode"));
		getResponseResponse.setData(_ctx.stringValue("GetResponseResponse.Data"));
	 
	 	return getResponseResponse;
	}
}