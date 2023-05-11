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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.BatchUnbindProjectProductsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchUnbindProjectProductsResponseUnmarshaller {

	public static BatchUnbindProjectProductsResponse unmarshall(BatchUnbindProjectProductsResponse batchUnbindProjectProductsResponse, UnmarshallerContext _ctx) {
		
		batchUnbindProjectProductsResponse.setRequestId(_ctx.stringValue("BatchUnbindProjectProductsResponse.RequestId"));
		batchUnbindProjectProductsResponse.setSuccess(_ctx.booleanValue("BatchUnbindProjectProductsResponse.Success"));
		batchUnbindProjectProductsResponse.setCode(_ctx.stringValue("BatchUnbindProjectProductsResponse.Code"));
		batchUnbindProjectProductsResponse.setErrorMessage(_ctx.stringValue("BatchUnbindProjectProductsResponse.ErrorMessage"));
		batchUnbindProjectProductsResponse.setData(_ctx.booleanValue("BatchUnbindProjectProductsResponse.Data"));
	 
	 	return batchUnbindProjectProductsResponse;
	}
}