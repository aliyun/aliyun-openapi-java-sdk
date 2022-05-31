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

package com.aliyuncs.cloudesl.transform.v20200201;

import com.aliyuncs.cloudesl.model.v20200201.BatchUpdateEventResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchUpdateEventResponseUnmarshaller {

	public static BatchUpdateEventResponse unmarshall(BatchUpdateEventResponse batchUpdateEventResponse, UnmarshallerContext _ctx) {
		
		batchUpdateEventResponse.setRequestId(_ctx.stringValue("BatchUpdateEventResponse.RequestId"));
		batchUpdateEventResponse.setErrorMessage(_ctx.stringValue("BatchUpdateEventResponse.ErrorMessage"));
		batchUpdateEventResponse.setSuccess(_ctx.booleanValue("BatchUpdateEventResponse.Success"));
		batchUpdateEventResponse.setErrorCode(_ctx.stringValue("BatchUpdateEventResponse.ErrorCode"));
		batchUpdateEventResponse.setCode(_ctx.stringValue("BatchUpdateEventResponse.Code"));
		batchUpdateEventResponse.setMessage(_ctx.stringValue("BatchUpdateEventResponse.Message"));
		batchUpdateEventResponse.setDynamicMessage(_ctx.stringValue("BatchUpdateEventResponse.DynamicMessage"));
		batchUpdateEventResponse.setDynamicCode(_ctx.stringValue("BatchUpdateEventResponse.DynamicCode"));
	 
	 	return batchUpdateEventResponse;
	}
}