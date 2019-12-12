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

import com.aliyuncs.sae.model.v20190506.BatchStartApplicationsResponse;
import com.aliyuncs.sae.model.v20190506.BatchStartApplicationsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchStartApplicationsResponseUnmarshaller {

	public static BatchStartApplicationsResponse unmarshall(BatchStartApplicationsResponse batchStartApplicationsResponse, UnmarshallerContext _ctx) {
		
		batchStartApplicationsResponse.setRequestId(_ctx.stringValue("BatchStartApplicationsResponse.RequestId"));
		batchStartApplicationsResponse.setCode(_ctx.stringValue("BatchStartApplicationsResponse.Code"));
		batchStartApplicationsResponse.setMessage(_ctx.stringValue("BatchStartApplicationsResponse.Message"));
		batchStartApplicationsResponse.setErrorCode(_ctx.stringValue("BatchStartApplicationsResponse.ErrorCode"));
		batchStartApplicationsResponse.setTraceId(_ctx.stringValue("BatchStartApplicationsResponse.TraceId"));
		batchStartApplicationsResponse.setSuccess(_ctx.booleanValue("BatchStartApplicationsResponse.Success"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("BatchStartApplicationsResponse.Data.ChangeOrderId"));
		batchStartApplicationsResponse.setData(data);
	 
	 	return batchStartApplicationsResponse;
	}
}