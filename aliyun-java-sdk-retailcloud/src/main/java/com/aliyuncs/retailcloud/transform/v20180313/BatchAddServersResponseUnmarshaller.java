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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.BatchAddServersResponse;
import com.aliyuncs.retailcloud.model.v20180313.BatchAddServersResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchAddServersResponseUnmarshaller {

	public static BatchAddServersResponse unmarshall(BatchAddServersResponse batchAddServersResponse, UnmarshallerContext _ctx) {
		
		batchAddServersResponse.setRequestId(_ctx.stringValue("BatchAddServersResponse.RequestId"));
		batchAddServersResponse.setCode(_ctx.integerValue("BatchAddServersResponse.Code"));
		batchAddServersResponse.setErrMsg(_ctx.stringValue("BatchAddServersResponse.ErrMsg"));

		Result result = new Result();
		result.setSuccess(_ctx.booleanValue("BatchAddServersResponse.Result.Success"));
		batchAddServersResponse.setResult(result);
	 
	 	return batchAddServersResponse;
	}
}