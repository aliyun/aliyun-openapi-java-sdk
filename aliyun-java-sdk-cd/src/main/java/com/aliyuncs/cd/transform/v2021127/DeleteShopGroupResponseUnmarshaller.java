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

import com.aliyuncs.cd.model.v2021127.DeleteShopGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteShopGroupResponseUnmarshaller {

	public static DeleteShopGroupResponse unmarshall(DeleteShopGroupResponse deleteShopGroupResponse, UnmarshallerContext _ctx) {
		
		deleteShopGroupResponse.setRequestId(_ctx.stringValue("DeleteShopGroupResponse.RequestId"));
		deleteShopGroupResponse.setSuccess(_ctx.booleanValue("DeleteShopGroupResponse.Success"));
		deleteShopGroupResponse.setMessage(_ctx.stringValue("DeleteShopGroupResponse.Message"));
		deleteShopGroupResponse.setCode(_ctx.stringValue("DeleteShopGroupResponse.Code"));
		deleteShopGroupResponse.setHttpStatusCode(_ctx.integerValue("DeleteShopGroupResponse.HttpStatusCode"));
		deleteShopGroupResponse.setData(_ctx.stringValue("DeleteShopGroupResponse.Data"));
	 
	 	return deleteShopGroupResponse;
	}
}