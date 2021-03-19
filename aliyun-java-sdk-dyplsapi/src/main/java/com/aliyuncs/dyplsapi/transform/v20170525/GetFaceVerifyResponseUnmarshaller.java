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

package com.aliyuncs.dyplsapi.transform.v20170525;

import com.aliyuncs.dyplsapi.model.v20170525.GetFaceVerifyResponse;
import com.aliyuncs.dyplsapi.model.v20170525.GetFaceVerifyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFaceVerifyResponseUnmarshaller {

	public static GetFaceVerifyResponse unmarshall(GetFaceVerifyResponse getFaceVerifyResponse, UnmarshallerContext _ctx) {
		
		getFaceVerifyResponse.setRequestId(_ctx.stringValue("GetFaceVerifyResponse.RequestId"));
		getFaceVerifyResponse.setCode(_ctx.stringValue("GetFaceVerifyResponse.Code"));
		getFaceVerifyResponse.setMessage(_ctx.stringValue("GetFaceVerifyResponse.Message"));

		Data data = new Data();
		data.setVerifyResult(_ctx.stringValue("GetFaceVerifyResponse.Data.VerifyResult"));
		getFaceVerifyResponse.setData(data);
	 
	 	return getFaceVerifyResponse;
	}
}