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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsSgQueryRemoteQueueResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsSgQueryRemoteQueueResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsSgQueryRemoteQueueResponseUnmarshaller {

	public static OpsSgQueryRemoteQueueResponse unmarshall(OpsSgQueryRemoteQueueResponse opsSgQueryRemoteQueueResponse, UnmarshallerContext _ctx) {
		
		opsSgQueryRemoteQueueResponse.setRequestId(_ctx.stringValue("OpsSgQueryRemoteQueueResponse.RequestId"));
		opsSgQueryRemoteQueueResponse.setMessage(_ctx.stringValue("OpsSgQueryRemoteQueueResponse.Message"));
		opsSgQueryRemoteQueueResponse.setCode(_ctx.stringValue("OpsSgQueryRemoteQueueResponse.Code"));
		opsSgQueryRemoteQueueResponse.setSuccess(_ctx.booleanValue("OpsSgQueryRemoteQueueResponse.Success"));

		Data data = new Data();
		data.setResultInfoStr(_ctx.stringValue("OpsSgQueryRemoteQueueResponse.Data.ResultInfoStr"));
		opsSgQueryRemoteQueueResponse.setData(data);
	 
	 	return opsSgQueryRemoteQueueResponse;
	}
}