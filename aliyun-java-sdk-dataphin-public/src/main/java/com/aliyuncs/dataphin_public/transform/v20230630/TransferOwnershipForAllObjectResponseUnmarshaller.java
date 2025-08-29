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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.TransferOwnershipForAllObjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TransferOwnershipForAllObjectResponseUnmarshaller {

	public static TransferOwnershipForAllObjectResponse unmarshall(TransferOwnershipForAllObjectResponse transferOwnershipForAllObjectResponse, UnmarshallerContext _ctx) {
		
		transferOwnershipForAllObjectResponse.setRequestId(_ctx.stringValue("TransferOwnershipForAllObjectResponse.RequestId"));
		transferOwnershipForAllObjectResponse.setSuccess(_ctx.booleanValue("TransferOwnershipForAllObjectResponse.Success"));
		transferOwnershipForAllObjectResponse.setHttpStatusCode(_ctx.integerValue("TransferOwnershipForAllObjectResponse.HttpStatusCode"));
		transferOwnershipForAllObjectResponse.setCode(_ctx.stringValue("TransferOwnershipForAllObjectResponse.Code"));
		transferOwnershipForAllObjectResponse.setMessage(_ctx.stringValue("TransferOwnershipForAllObjectResponse.Message"));
		transferOwnershipForAllObjectResponse.setData(_ctx.longValue("TransferOwnershipForAllObjectResponse.Data"));
	 
	 	return transferOwnershipForAllObjectResponse;
	}
}