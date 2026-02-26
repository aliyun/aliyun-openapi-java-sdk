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

import com.aliyuncs.sae.model.v20190506.ExecJobResponse;
import com.aliyuncs.sae.model.v20190506.ExecJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecJobResponseUnmarshaller {

	public static ExecJobResponse unmarshall(ExecJobResponse execJobResponse, UnmarshallerContext _ctx) {
		
		execJobResponse.setRequestId(_ctx.stringValue("ExecJobResponse.RequestId"));
		execJobResponse.setMessage(_ctx.stringValue("ExecJobResponse.Message"));
		execJobResponse.setTraceId(_ctx.stringValue("ExecJobResponse.TraceId"));
		execJobResponse.setErrorCode(_ctx.stringValue("ExecJobResponse.ErrorCode"));
		execJobResponse.setCode(_ctx.stringValue("ExecJobResponse.Code"));
		execJobResponse.setSuccess(_ctx.booleanValue("ExecJobResponse.Success"));

		Data data = new Data();
		data.setData(_ctx.stringValue("ExecJobResponse.Data.Data"));
		data.setMsg(_ctx.stringValue("ExecJobResponse.Data.Msg"));
		data.setSuccess(_ctx.stringValue("ExecJobResponse.Data.Success"));
		data.setCode(_ctx.stringValue("ExecJobResponse.Data.Code"));
		execJobResponse.setData(data);
	 
	 	return execJobResponse;
	}
}