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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.BatchInsertItemsResponse;
import com.aliyuncs.cloudesl.model.v20200201.BatchInsertItemsResponse.BatchResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchInsertItemsResponseUnmarshaller {

	public static BatchInsertItemsResponse unmarshall(BatchInsertItemsResponse batchInsertItemsResponse, UnmarshallerContext _ctx) {
		
		batchInsertItemsResponse.setRequestId(_ctx.stringValue("BatchInsertItemsResponse.RequestId"));
		batchInsertItemsResponse.setErrorMessage(_ctx.stringValue("BatchInsertItemsResponse.ErrorMessage"));
		batchInsertItemsResponse.setSuccess(_ctx.booleanValue("BatchInsertItemsResponse.Success"));
		batchInsertItemsResponse.setErrorCode(_ctx.stringValue("BatchInsertItemsResponse.ErrorCode"));
		batchInsertItemsResponse.setCode(_ctx.stringValue("BatchInsertItemsResponse.Code"));
		batchInsertItemsResponse.setMessage(_ctx.stringValue("BatchInsertItemsResponse.Message"));
		batchInsertItemsResponse.setDynamicMessage(_ctx.stringValue("BatchInsertItemsResponse.DynamicMessage"));
		batchInsertItemsResponse.setDynamicCode(_ctx.stringValue("BatchInsertItemsResponse.DynamicCode"));

		List<BatchResult> batchResults = new ArrayList<BatchResult>();
		for (int i = 0; i < _ctx.lengthValue("BatchInsertItemsResponse.BatchResults.Length"); i++) {
			BatchResult batchResult = new BatchResult();
			batchResult.setIndex(_ctx.integerValue("BatchInsertItemsResponse.BatchResults["+ i +"].Index"));
			batchResult.setMessage(_ctx.stringValue("BatchInsertItemsResponse.BatchResults["+ i +"].Message"));
			batchResult.setSuccess(_ctx.booleanValue("BatchInsertItemsResponse.BatchResults["+ i +"].Success"));
			batchResult.setErrorCode(_ctx.stringValue("BatchInsertItemsResponse.BatchResults["+ i +"].ErrorCode"));

			batchResults.add(batchResult);
		}
		batchInsertItemsResponse.setBatchResults(batchResults);
	 
	 	return batchInsertItemsResponse;
	}
}