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

package com.aliyuncs.mindlive.transform.v20210301;

import com.aliyuncs.mindlive.model.v20210301.RequestLiveTeleprompterStateResponse;
import com.aliyuncs.mindlive.model.v20210301.RequestLiveTeleprompterStateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestLiveTeleprompterStateResponseUnmarshaller {

	public static RequestLiveTeleprompterStateResponse unmarshall(RequestLiveTeleprompterStateResponse requestLiveTeleprompterStateResponse, UnmarshallerContext _ctx) {
		
		requestLiveTeleprompterStateResponse.setRequestId(_ctx.stringValue("RequestLiveTeleprompterStateResponse.RequestId"));
		requestLiveTeleprompterStateResponse.setErrorCode(_ctx.stringValue("RequestLiveTeleprompterStateResponse.ErrorCode"));
		requestLiveTeleprompterStateResponse.setErrorMessage(_ctx.stringValue("RequestLiveTeleprompterStateResponse.ErrorMessage"));
		requestLiveTeleprompterStateResponse.setSuccess(_ctx.booleanValue("RequestLiveTeleprompterStateResponse.Success"));

		Data data = new Data();
		data.setDisplay(_ctx.booleanValue("RequestLiveTeleprompterStateResponse.Data.Display"));
		requestLiveTeleprompterStateResponse.setData(data);
	 
	 	return requestLiveTeleprompterStateResponse;
	}
}