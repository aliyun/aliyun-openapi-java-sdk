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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.InnerCallServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerCallServiceResponseUnmarshaller {

	public static InnerCallServiceResponse unmarshall(InnerCallServiceResponse innerCallServiceResponse, UnmarshallerContext _ctx) {
		
		innerCallServiceResponse.setRequestId(_ctx.stringValue("InnerCallServiceResponse.RequestId"));
		innerCallServiceResponse.setResult(_ctx.stringValue("InnerCallServiceResponse.Result"));
		innerCallServiceResponse.setCode(_ctx.booleanValue("InnerCallServiceResponse.Code"));
		innerCallServiceResponse.setErrorCode(_ctx.stringValue("InnerCallServiceResponse.ErrorCode"));
		innerCallServiceResponse.setMessage(_ctx.stringValue("InnerCallServiceResponse.Message"));
	 
	 	return innerCallServiceResponse;
	}
}