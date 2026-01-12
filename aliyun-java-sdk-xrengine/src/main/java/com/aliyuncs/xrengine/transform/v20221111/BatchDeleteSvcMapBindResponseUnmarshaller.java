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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.BatchDeleteSvcMapBindResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchDeleteSvcMapBindResponseUnmarshaller {

	public static BatchDeleteSvcMapBindResponse unmarshall(BatchDeleteSvcMapBindResponse batchDeleteSvcMapBindResponse, UnmarshallerContext _ctx) {
		
		batchDeleteSvcMapBindResponse.setRequestId(_ctx.stringValue("BatchDeleteSvcMapBindResponse.RequestId"));
		batchDeleteSvcMapBindResponse.setSuccess(_ctx.booleanValue("BatchDeleteSvcMapBindResponse.Success"));
		batchDeleteSvcMapBindResponse.setCode(_ctx.stringValue("BatchDeleteSvcMapBindResponse.Code"));
		batchDeleteSvcMapBindResponse.setMessage(_ctx.stringValue("BatchDeleteSvcMapBindResponse.Message"));
		batchDeleteSvcMapBindResponse.setErrorName(_ctx.stringValue("BatchDeleteSvcMapBindResponse.ErrorName"));
		batchDeleteSvcMapBindResponse.setHttpCode(_ctx.integerValue("BatchDeleteSvcMapBindResponse.HttpCode"));
		batchDeleteSvcMapBindResponse.setData(_ctx.booleanValue("BatchDeleteSvcMapBindResponse.Data"));
	 
	 	return batchDeleteSvcMapBindResponse;
	}
}