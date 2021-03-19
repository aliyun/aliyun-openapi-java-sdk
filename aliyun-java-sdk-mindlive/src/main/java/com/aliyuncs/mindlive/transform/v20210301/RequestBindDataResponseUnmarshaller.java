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

import com.aliyuncs.mindlive.model.v20210301.RequestBindDataResponse;
import com.aliyuncs.mindlive.model.v20210301.RequestBindDataResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestBindDataResponseUnmarshaller {

	public static RequestBindDataResponse unmarshall(RequestBindDataResponse requestBindDataResponse, UnmarshallerContext _ctx) {
		
		requestBindDataResponse.setRequestId(_ctx.stringValue("RequestBindDataResponse.RequestId"));
		requestBindDataResponse.setSuccess(_ctx.booleanValue("RequestBindDataResponse.Success"));
		requestBindDataResponse.setErrorCode(_ctx.stringValue("RequestBindDataResponse.ErrorCode"));
		requestBindDataResponse.setErrorMessage(_ctx.stringValue("RequestBindDataResponse.ErrorMessage"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("RequestBindDataResponse.Data.Url"));
		data.setCode(_ctx.stringValue("RequestBindDataResponse.Data.Code"));
		data.setMaxKeepSeconds(_ctx.integerValue("RequestBindDataResponse.Data.MaxKeepSeconds"));
		requestBindDataResponse.setData(data);
	 
	 	return requestBindDataResponse;
	}
}