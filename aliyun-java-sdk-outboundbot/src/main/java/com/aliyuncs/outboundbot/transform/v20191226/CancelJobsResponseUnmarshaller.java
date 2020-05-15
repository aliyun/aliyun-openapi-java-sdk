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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.CancelJobsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelJobsResponseUnmarshaller {

	public static CancelJobsResponse unmarshall(CancelJobsResponse cancelJobsResponse, UnmarshallerContext _ctx) {
		
		cancelJobsResponse.setRequestId(_ctx.stringValue("CancelJobsResponse.RequestId"));
		cancelJobsResponse.setSuccess(_ctx.booleanValue("CancelJobsResponse.Success"));
		cancelJobsResponse.setCode(_ctx.stringValue("CancelJobsResponse.Code"));
		cancelJobsResponse.setMessage(_ctx.stringValue("CancelJobsResponse.Message"));
		cancelJobsResponse.setHttpStatusCode(_ctx.integerValue("CancelJobsResponse.HttpStatusCode"));
	 
	 	return cancelJobsResponse;
	}
}