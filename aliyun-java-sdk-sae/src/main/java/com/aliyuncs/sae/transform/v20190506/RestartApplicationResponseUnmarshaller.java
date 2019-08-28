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

import com.aliyuncs.sae.model.v20190506.RestartApplicationResponse;
import com.aliyuncs.sae.model.v20190506.RestartApplicationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestartApplicationResponseUnmarshaller {

	public static RestartApplicationResponse unmarshall(RestartApplicationResponse restartApplicationResponse, UnmarshallerContext _ctx) {
		
		restartApplicationResponse.setRequestId(_ctx.stringValue("RestartApplicationResponse.RequestId"));
		restartApplicationResponse.setCode(_ctx.stringValue("RestartApplicationResponse.Code"));
		restartApplicationResponse.setSuccess(_ctx.booleanValue("RestartApplicationResponse.Success"));
		restartApplicationResponse.setErrorCode(_ctx.stringValue("RestartApplicationResponse.ErrorCode"));
		restartApplicationResponse.setMessage(_ctx.stringValue("RestartApplicationResponse.Message"));
		restartApplicationResponse.setTraceId(_ctx.stringValue("RestartApplicationResponse.TraceId"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("RestartApplicationResponse.Data.ChangeOrderId"));
		restartApplicationResponse.setData(data);
	 
	 	return restartApplicationResponse;
	}
}