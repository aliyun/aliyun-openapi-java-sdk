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

import com.aliyuncs.cd.model.v2021127.UpdateShopResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateShopResponseUnmarshaller {

	public static UpdateShopResponse unmarshall(UpdateShopResponse updateShopResponse, UnmarshallerContext _ctx) {
		
		updateShopResponse.setRequestId(_ctx.stringValue("UpdateShopResponse.RequestId"));
		updateShopResponse.setSuccess(_ctx.booleanValue("UpdateShopResponse.Success"));
		updateShopResponse.setMessage(_ctx.stringValue("UpdateShopResponse.Message"));
		updateShopResponse.setCode(_ctx.stringValue("UpdateShopResponse.Code"));
		updateShopResponse.setHttpStatusCode(_ctx.integerValue("UpdateShopResponse.HttpStatusCode"));
		updateShopResponse.setData(_ctx.stringValue("UpdateShopResponse.Data"));
	 
	 	return updateShopResponse;
	}
}