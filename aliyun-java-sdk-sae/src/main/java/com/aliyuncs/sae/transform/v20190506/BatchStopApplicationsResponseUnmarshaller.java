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

import com.aliyuncs.sae.model.v20190506.BatchStopApplicationsResponse;
import com.aliyuncs.sae.model.v20190506.BatchStopApplicationsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchStopApplicationsResponseUnmarshaller {

	public static BatchStopApplicationsResponse unmarshall(BatchStopApplicationsResponse batchStopApplicationsResponse, UnmarshallerContext _ctx) {
		
		batchStopApplicationsResponse.setRequestId(_ctx.stringValue("BatchStopApplicationsResponse.RequestId"));
		batchStopApplicationsResponse.setCode(_ctx.stringValue("BatchStopApplicationsResponse.Code"));
		batchStopApplicationsResponse.setMessage(_ctx.stringValue("BatchStopApplicationsResponse.Message"));
		batchStopApplicationsResponse.setErrorCode(_ctx.stringValue("BatchStopApplicationsResponse.ErrorCode"));
		batchStopApplicationsResponse.setTraceId(_ctx.stringValue("BatchStopApplicationsResponse.TraceId"));
		batchStopApplicationsResponse.setSuccess(_ctx.booleanValue("BatchStopApplicationsResponse.Success"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("BatchStopApplicationsResponse.Data.ChangeOrderId"));
		batchStopApplicationsResponse.setData(data);
	 
	 	return batchStopApplicationsResponse;
	}
}