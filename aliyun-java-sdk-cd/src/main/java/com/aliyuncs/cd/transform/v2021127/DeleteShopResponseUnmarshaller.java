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

package com.aliyuncs.cd.transform.v2021127;

import com.aliyuncs.cd.model.v2021127.DeleteShopResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteShopResponseUnmarshaller {

	public static DeleteShopResponse unmarshall(DeleteShopResponse deleteShopResponse, UnmarshallerContext _ctx) {
		
		deleteShopResponse.setRequestId(_ctx.stringValue("DeleteShopResponse.RequestId"));
		deleteShopResponse.setSuccess(_ctx.booleanValue("DeleteShopResponse.Success"));
		deleteShopResponse.setMessage(_ctx.stringValue("DeleteShopResponse.Message"));
		deleteShopResponse.setCode(_ctx.stringValue("DeleteShopResponse.Code"));
		deleteShopResponse.setHttpStatusCode(_ctx.integerValue("DeleteShopResponse.HttpStatusCode"));
		deleteShopResponse.setData(_ctx.stringValue("DeleteShopResponse.Data"));
	 
	 	return deleteShopResponse;
	}
}