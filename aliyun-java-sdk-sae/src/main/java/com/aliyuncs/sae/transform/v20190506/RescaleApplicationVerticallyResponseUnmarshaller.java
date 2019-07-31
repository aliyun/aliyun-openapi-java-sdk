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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.RescaleApplicationVerticallyResponse;
import com.aliyuncs.sae.model.v20190506.RescaleApplicationVerticallyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RescaleApplicationVerticallyResponseUnmarshaller {

	public static RescaleApplicationVerticallyResponse unmarshall(RescaleApplicationVerticallyResponse rescaleApplicationVerticallyResponse, UnmarshallerContext _ctx) {
		
		rescaleApplicationVerticallyResponse.setRequestId(_ctx.stringValue("RescaleApplicationVerticallyResponse.RequestId"));
		rescaleApplicationVerticallyResponse.setCode(_ctx.stringValue("RescaleApplicationVerticallyResponse.Code"));
		rescaleApplicationVerticallyResponse.setSuccess(_ctx.booleanValue("RescaleApplicationVerticallyResponse.Success"));
		rescaleApplicationVerticallyResponse.setErrorCode(_ctx.stringValue("RescaleApplicationVerticallyResponse.ErrorCode"));
		rescaleApplicationVerticallyResponse.setMessage(_ctx.stringValue("RescaleApplicationVerticallyResponse.Message"));
		rescaleApplicationVerticallyResponse.setTraceId(_ctx.stringValue("RescaleApplicationVerticallyResponse.TraceId"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("RescaleApplicationVerticallyResponse.Data.ChangeOrderId"));
		rescaleApplicationVerticallyResponse.setData(data);
	 
	 	return rescaleApplicationVerticallyResponse;
	}
}