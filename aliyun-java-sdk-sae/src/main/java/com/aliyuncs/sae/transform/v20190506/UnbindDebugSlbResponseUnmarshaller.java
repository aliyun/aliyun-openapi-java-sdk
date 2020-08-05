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

import com.aliyuncs.sae.model.v20190506.UnbindDebugSlbResponse;
import com.aliyuncs.sae.model.v20190506.UnbindDebugSlbResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnbindDebugSlbResponseUnmarshaller {

	public static UnbindDebugSlbResponse unmarshall(UnbindDebugSlbResponse unbindDebugSlbResponse, UnmarshallerContext _ctx) {
		
		unbindDebugSlbResponse.setRequestId(_ctx.stringValue("UnbindDebugSlbResponse.RequestId"));
		unbindDebugSlbResponse.setCode(_ctx.stringValue("UnbindDebugSlbResponse.Code"));
		unbindDebugSlbResponse.setMessage(_ctx.stringValue("UnbindDebugSlbResponse.Message"));
		unbindDebugSlbResponse.setErrorCode(_ctx.stringValue("UnbindDebugSlbResponse.ErrorCode"));
		unbindDebugSlbResponse.setSuccess(_ctx.booleanValue("UnbindDebugSlbResponse.Success"));
		unbindDebugSlbResponse.setTraceId(_ctx.stringValue("UnbindDebugSlbResponse.TraceId"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("UnbindDebugSlbResponse.Data.ChangeOrderId"));
		unbindDebugSlbResponse.setData(data);
	 
	 	return unbindDebugSlbResponse;
	}
}