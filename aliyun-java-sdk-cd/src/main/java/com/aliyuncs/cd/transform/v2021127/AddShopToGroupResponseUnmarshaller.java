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

import com.aliyuncs.cd.model.v2021127.AddShopToGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddShopToGroupResponseUnmarshaller {

	public static AddShopToGroupResponse unmarshall(AddShopToGroupResponse addShopToGroupResponse, UnmarshallerContext _ctx) {
		
		addShopToGroupResponse.setRequestId(_ctx.stringValue("AddShopToGroupResponse.RequestId"));
		addShopToGroupResponse.setSuccess(_ctx.booleanValue("AddShopToGroupResponse.Success"));
		addShopToGroupResponse.setMessage(_ctx.stringValue("AddShopToGroupResponse.Message"));
		addShopToGroupResponse.setCode(_ctx.stringValue("AddShopToGroupResponse.Code"));
		addShopToGroupResponse.setHttpStatusCode(_ctx.integerValue("AddShopToGroupResponse.HttpStatusCode"));
		addShopToGroupResponse.setData(_ctx.stringValue("AddShopToGroupResponse.Data"));
	 
	 	return addShopToGroupResponse;
	}
}