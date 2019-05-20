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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.BatchUpdateTaobaoUserMapResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchUpdateTaobaoUserMapResponseUnmarshaller {

	public static BatchUpdateTaobaoUserMapResponse unmarshall(BatchUpdateTaobaoUserMapResponse batchUpdateTaobaoUserMapResponse, UnmarshallerContext context) {
		
		batchUpdateTaobaoUserMapResponse.setRequestId(context.stringValue("BatchUpdateTaobaoUserMapResponse.RequestId"));
		batchUpdateTaobaoUserMapResponse.setSuccess(context.booleanValue("BatchUpdateTaobaoUserMapResponse.Success"));
		batchUpdateTaobaoUserMapResponse.setCode(context.stringValue("BatchUpdateTaobaoUserMapResponse.Code"));
		batchUpdateTaobaoUserMapResponse.setMessage(context.stringValue("BatchUpdateTaobaoUserMapResponse.Message"));
		batchUpdateTaobaoUserMapResponse.setHttpStatusCode(context.integerValue("BatchUpdateTaobaoUserMapResponse.HttpStatusCode"));
		batchUpdateTaobaoUserMapResponse.setCount(context.integerValue("BatchUpdateTaobaoUserMapResponse.Count"));
	 
	 	return batchUpdateTaobaoUserMapResponse;
	}
}