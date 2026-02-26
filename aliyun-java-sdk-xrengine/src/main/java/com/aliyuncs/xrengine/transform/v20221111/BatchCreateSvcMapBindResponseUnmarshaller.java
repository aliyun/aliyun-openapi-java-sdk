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

import com.aliyuncs.xrengine.model.v20221111.BatchCreateSvcMapBindResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCreateSvcMapBindResponseUnmarshaller {

	public static BatchCreateSvcMapBindResponse unmarshall(BatchCreateSvcMapBindResponse batchCreateSvcMapBindResponse, UnmarshallerContext _ctx) {
		
		batchCreateSvcMapBindResponse.setRequestId(_ctx.stringValue("BatchCreateSvcMapBindResponse.RequestId"));
		batchCreateSvcMapBindResponse.setSuccess(_ctx.booleanValue("BatchCreateSvcMapBindResponse.Success"));
		batchCreateSvcMapBindResponse.setCode(_ctx.stringValue("BatchCreateSvcMapBindResponse.Code"));
		batchCreateSvcMapBindResponse.setMessage(_ctx.stringValue("BatchCreateSvcMapBindResponse.Message"));
		batchCreateSvcMapBindResponse.setErrorName(_ctx.stringValue("BatchCreateSvcMapBindResponse.ErrorName"));
		batchCreateSvcMapBindResponse.setHttpCode(_ctx.integerValue("BatchCreateSvcMapBindResponse.HttpCode"));
		batchCreateSvcMapBindResponse.setData(_ctx.booleanValue("BatchCreateSvcMapBindResponse.Data"));
	 
	 	return batchCreateSvcMapBindResponse;
	}
}