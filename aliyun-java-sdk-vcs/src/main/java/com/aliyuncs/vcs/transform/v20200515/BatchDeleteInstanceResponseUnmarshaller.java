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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.BatchDeleteInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchDeleteInstanceResponseUnmarshaller {

	public static BatchDeleteInstanceResponse unmarshall(BatchDeleteInstanceResponse batchDeleteInstanceResponse, UnmarshallerContext _ctx) {
		
		batchDeleteInstanceResponse.setRequestId(_ctx.stringValue("BatchDeleteInstanceResponse.RequestId"));
		batchDeleteInstanceResponse.setMessage(_ctx.stringValue("BatchDeleteInstanceResponse.Message"));
		batchDeleteInstanceResponse.setCode(_ctx.stringValue("BatchDeleteInstanceResponse.Code"));
		batchDeleteInstanceResponse.setSuccess(_ctx.booleanValue("BatchDeleteInstanceResponse.Success"));
	 
	 	return batchDeleteInstanceResponse;
	}
}