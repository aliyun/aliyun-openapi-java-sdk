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

import com.aliyuncs.mindlive_biz.model.v20210214.RequestGlobalSellingPointStateResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.RequestGlobalSellingPointStateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestGlobalSellingPointStateResponseUnmarshaller {

	public static RequestGlobalSellingPointStateResponse unmarshall(RequestGlobalSellingPointStateResponse requestGlobalSellingPointStateResponse, UnmarshallerContext _ctx) {
		
		requestGlobalSellingPointStateResponse.setRequestId(_ctx.stringValue("RequestGlobalSellingPointStateResponse.RequestId"));
		requestGlobalSellingPointStateResponse.setErrorMessage(_ctx.stringValue("RequestGlobalSellingPointStateResponse.ErrorMessage"));
		requestGlobalSellingPointStateResponse.setSuccess(_ctx.booleanValue("RequestGlobalSellingPointStateResponse.Success"));
		requestGlobalSellingPointStateResponse.setErrorCode(_ctx.stringValue("RequestGlobalSellingPointStateResponse.ErrorCode"));

		Data data = new Data();
		data.setDisplay(_ctx.booleanValue("RequestGlobalSellingPointStateResponse.Data.Display"));
		requestGlobalSellingPointStateResponse.setData(data);
	 
	 	return requestGlobalSellingPointStateResponse;
	}
}