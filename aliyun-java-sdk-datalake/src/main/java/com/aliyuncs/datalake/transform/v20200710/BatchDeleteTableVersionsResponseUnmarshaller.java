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

package com.aliyuncs.datalake.transform.v20200710;

import com.aliyuncs.datalake.model.v20200710.BatchDeleteTableVersionsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchDeleteTableVersionsResponseUnmarshaller {

	public static BatchDeleteTableVersionsResponse unmarshall(BatchDeleteTableVersionsResponse batchDeleteTableVersionsResponse, UnmarshallerContext _ctx) {
		
		batchDeleteTableVersionsResponse.setRequestId(_ctx.stringValue("BatchDeleteTableVersionsResponse.RequestId"));
		batchDeleteTableVersionsResponse.setMessage(_ctx.stringValue("BatchDeleteTableVersionsResponse.Message"));
		batchDeleteTableVersionsResponse.setCode(_ctx.stringValue("BatchDeleteTableVersionsResponse.Code"));
		batchDeleteTableVersionsResponse.setSuccess(_ctx.booleanValue("BatchDeleteTableVersionsResponse.Success"));
	 
	 	return batchDeleteTableVersionsResponse;
	}
}