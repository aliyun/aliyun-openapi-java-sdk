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

import com.aliyuncs.sae.model.v20190506.BindSlbResponse;
import com.aliyuncs.sae.model.v20190506.BindSlbResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindSlbResponseUnmarshaller {

	public static BindSlbResponse unmarshall(BindSlbResponse bindSlbResponse, UnmarshallerContext _ctx) {
		
		bindSlbResponse.setRequestId(_ctx.stringValue("BindSlbResponse.RequestId"));
		bindSlbResponse.setCode(_ctx.stringValue("BindSlbResponse.Code"));
		bindSlbResponse.setMessage(_ctx.stringValue("BindSlbResponse.Message"));
		bindSlbResponse.setErrorCode(_ctx.stringValue("BindSlbResponse.ErrorCode"));
		bindSlbResponse.setSuccess(_ctx.booleanValue("BindSlbResponse.Success"));
		bindSlbResponse.setTraceId(_ctx.stringValue("BindSlbResponse.TraceId"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("BindSlbResponse.Data.ChangeOrderId"));
		bindSlbResponse.setData(data);
	 
	 	return bindSlbResponse;
	}
}