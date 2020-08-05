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

import com.aliyuncs.sae.model.v20190506.BindDebugSlbResponse;
import com.aliyuncs.sae.model.v20190506.BindDebugSlbResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindDebugSlbResponseUnmarshaller {

	public static BindDebugSlbResponse unmarshall(BindDebugSlbResponse bindDebugSlbResponse, UnmarshallerContext _ctx) {
		
		bindDebugSlbResponse.setRequestId(_ctx.stringValue("BindDebugSlbResponse.RequestId"));
		bindDebugSlbResponse.setCode(_ctx.stringValue("BindDebugSlbResponse.Code"));
		bindDebugSlbResponse.setMessage(_ctx.stringValue("BindDebugSlbResponse.Message"));
		bindDebugSlbResponse.setErrorCode(_ctx.stringValue("BindDebugSlbResponse.ErrorCode"));
		bindDebugSlbResponse.setSuccess(_ctx.booleanValue("BindDebugSlbResponse.Success"));
		bindDebugSlbResponse.setTraceId(_ctx.stringValue("BindDebugSlbResponse.TraceId"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("BindDebugSlbResponse.Data.ChangeOrderId"));
		bindDebugSlbResponse.setData(data);
	 
	 	return bindDebugSlbResponse;
	}
}