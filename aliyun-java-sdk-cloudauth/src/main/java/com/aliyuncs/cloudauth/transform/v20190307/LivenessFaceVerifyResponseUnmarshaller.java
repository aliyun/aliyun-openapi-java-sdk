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

package com.aliyuncs.cloudauth.transform.v20190307;

import com.aliyuncs.cloudauth.model.v20190307.LivenessFaceVerifyResponse;
import com.aliyuncs.cloudauth.model.v20190307.LivenessFaceVerifyResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class LivenessFaceVerifyResponseUnmarshaller {

	public static LivenessFaceVerifyResponse unmarshall(LivenessFaceVerifyResponse livenessFaceVerifyResponse, UnmarshallerContext _ctx) {
		
		livenessFaceVerifyResponse.setRequestId(_ctx.stringValue("LivenessFaceVerifyResponse.RequestId"));
		livenessFaceVerifyResponse.setMessage(_ctx.stringValue("LivenessFaceVerifyResponse.Message"));
		livenessFaceVerifyResponse.setCode(_ctx.stringValue("LivenessFaceVerifyResponse.Code"));

		ResultObject resultObject = new ResultObject();
		resultObject.setPassed(_ctx.stringValue("LivenessFaceVerifyResponse.ResultObject.Passed"));
		resultObject.setMaterialInfo(_ctx.stringValue("LivenessFaceVerifyResponse.ResultObject.MaterialInfo"));
		resultObject.setSubCode(_ctx.stringValue("LivenessFaceVerifyResponse.ResultObject.SubCode"));
		livenessFaceVerifyResponse.setResultObject(resultObject);
	 
	 	return livenessFaceVerifyResponse;
	}
}