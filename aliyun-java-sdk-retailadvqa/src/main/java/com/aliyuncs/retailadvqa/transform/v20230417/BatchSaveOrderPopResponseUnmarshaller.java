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

package com.aliyuncs.retailadvqa.transform.v20230417;

import com.aliyuncs.retailadvqa.model.v20230417.BatchSaveOrderPopResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchSaveOrderPopResponseUnmarshaller {

	public static BatchSaveOrderPopResponse unmarshall(BatchSaveOrderPopResponse batchSaveOrderPopResponse, UnmarshallerContext _ctx) {
		
		batchSaveOrderPopResponse.setRequestId(_ctx.stringValue("BatchSaveOrderPopResponse.RequestId"));
		batchSaveOrderPopResponse.setSuccess(_ctx.booleanValue("BatchSaveOrderPopResponse.Success"));
		batchSaveOrderPopResponse.setHttpStatusCode(_ctx.stringValue("BatchSaveOrderPopResponse.HttpStatusCode"));
		batchSaveOrderPopResponse.setErrorCode(_ctx.stringValue("BatchSaveOrderPopResponse.ErrorCode"));
		batchSaveOrderPopResponse.setErrorMessage(_ctx.stringValue("BatchSaveOrderPopResponse.ErrorMessage"));
	 
	 	return batchSaveOrderPopResponse;
	}
}