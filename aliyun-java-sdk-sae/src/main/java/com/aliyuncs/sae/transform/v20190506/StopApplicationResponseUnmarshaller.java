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

import com.aliyuncs.sae.model.v20190506.StopApplicationResponse;
import com.aliyuncs.sae.model.v20190506.StopApplicationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopApplicationResponseUnmarshaller {

	public static StopApplicationResponse unmarshall(StopApplicationResponse stopApplicationResponse, UnmarshallerContext _ctx) {
		
		stopApplicationResponse.setRequestId(_ctx.stringValue("StopApplicationResponse.RequestId"));
		stopApplicationResponse.setCode(_ctx.stringValue("StopApplicationResponse.Code"));
		stopApplicationResponse.setSuccess(_ctx.booleanValue("StopApplicationResponse.Success"));
		stopApplicationResponse.setErrorCode(_ctx.stringValue("StopApplicationResponse.ErrorCode"));
		stopApplicationResponse.setMessage(_ctx.stringValue("StopApplicationResponse.Message"));
		stopApplicationResponse.setTraceId(_ctx.stringValue("StopApplicationResponse.TraceId"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("StopApplicationResponse.Data.ChangeOrderId"));
		stopApplicationResponse.setData(data);
	 
	 	return stopApplicationResponse;
	}
}