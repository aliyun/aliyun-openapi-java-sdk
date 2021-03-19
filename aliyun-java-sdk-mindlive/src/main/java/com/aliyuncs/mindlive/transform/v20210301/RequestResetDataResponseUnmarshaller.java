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

import com.aliyuncs.mindlive.model.v20210301.RequestResetDataResponse;
import com.aliyuncs.mindlive.model.v20210301.RequestResetDataResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestResetDataResponseUnmarshaller {

	public static RequestResetDataResponse unmarshall(RequestResetDataResponse requestResetDataResponse, UnmarshallerContext _ctx) {
		
		requestResetDataResponse.setRequestId(_ctx.stringValue("RequestResetDataResponse.RequestId"));
		requestResetDataResponse.setSuccess(_ctx.booleanValue("RequestResetDataResponse.Success"));
		requestResetDataResponse.setErrorCode(_ctx.stringValue("RequestResetDataResponse.ErrorCode"));
		requestResetDataResponse.setErrorMessage(_ctx.stringValue("RequestResetDataResponse.ErrorMessage"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("RequestResetDataResponse.Data.Url"));
		requestResetDataResponse.setData(data);
	 
	 	return requestResetDataResponse;
	}
}