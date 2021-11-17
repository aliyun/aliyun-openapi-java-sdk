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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.RequestAuthorizationDataResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.RequestAuthorizationDataResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestAuthorizationDataResponseUnmarshaller {

	public static RequestAuthorizationDataResponse unmarshall(RequestAuthorizationDataResponse requestAuthorizationDataResponse, UnmarshallerContext _ctx) {
		
		requestAuthorizationDataResponse.setRequestId(_ctx.stringValue("RequestAuthorizationDataResponse.RequestId"));
		requestAuthorizationDataResponse.setErrorMessage(_ctx.stringValue("RequestAuthorizationDataResponse.ErrorMessage"));
		requestAuthorizationDataResponse.setSuccess(_ctx.booleanValue("RequestAuthorizationDataResponse.Success"));
		requestAuthorizationDataResponse.setErrorCode(_ctx.stringValue("RequestAuthorizationDataResponse.ErrorCode"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("RequestAuthorizationDataResponse.Data.Url"));
		requestAuthorizationDataResponse.setData(data);
	 
	 	return requestAuthorizationDataResponse;
	}
}