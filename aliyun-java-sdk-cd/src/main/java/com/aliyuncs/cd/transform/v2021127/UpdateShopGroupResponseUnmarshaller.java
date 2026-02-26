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

import com.aliyuncs.cd.model.v2021127.UpdateShopGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateShopGroupResponseUnmarshaller {

	public static UpdateShopGroupResponse unmarshall(UpdateShopGroupResponse updateShopGroupResponse, UnmarshallerContext _ctx) {
		
		updateShopGroupResponse.setRequestId(_ctx.stringValue("UpdateShopGroupResponse.RequestId"));
		updateShopGroupResponse.setSuccess(_ctx.booleanValue("UpdateShopGroupResponse.Success"));
		updateShopGroupResponse.setMessage(_ctx.stringValue("UpdateShopGroupResponse.Message"));
		updateShopGroupResponse.setCode(_ctx.stringValue("UpdateShopGroupResponse.Code"));
		updateShopGroupResponse.setHttpStatusCode(_ctx.integerValue("UpdateShopGroupResponse.HttpStatusCode"));
		updateShopGroupResponse.setData(_ctx.stringValue("UpdateShopGroupResponse.Data"));
	 
	 	return updateShopGroupResponse;
	}
}