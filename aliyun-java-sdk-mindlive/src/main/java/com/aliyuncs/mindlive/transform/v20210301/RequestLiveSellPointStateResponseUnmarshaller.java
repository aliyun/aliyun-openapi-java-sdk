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

import com.aliyuncs.mindlive.model.v20210301.RequestLiveSellPointStateResponse;
import com.aliyuncs.mindlive.model.v20210301.RequestLiveSellPointStateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestLiveSellPointStateResponseUnmarshaller {

	public static RequestLiveSellPointStateResponse unmarshall(RequestLiveSellPointStateResponse requestLiveSellPointStateResponse, UnmarshallerContext _ctx) {
		
		requestLiveSellPointStateResponse.setRequestId(_ctx.stringValue("RequestLiveSellPointStateResponse.RequestId"));
		requestLiveSellPointStateResponse.setErrorCode(_ctx.stringValue("RequestLiveSellPointStateResponse.ErrorCode"));
		requestLiveSellPointStateResponse.setErrorMessage(_ctx.stringValue("RequestLiveSellPointStateResponse.ErrorMessage"));
		requestLiveSellPointStateResponse.setSuccess(_ctx.booleanValue("RequestLiveSellPointStateResponse.Success"));

		Data data = new Data();
		data.setDisplay(_ctx.booleanValue("RequestLiveSellPointStateResponse.Data.Display"));
		requestLiveSellPointStateResponse.setData(data);
	 
	 	return requestLiveSellPointStateResponse;
	}
}