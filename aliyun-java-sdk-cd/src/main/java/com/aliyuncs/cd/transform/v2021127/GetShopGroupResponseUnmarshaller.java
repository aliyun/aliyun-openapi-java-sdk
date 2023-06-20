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

import com.aliyuncs.cd.model.v2021127.GetShopGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetShopGroupResponseUnmarshaller {

	public static GetShopGroupResponse unmarshall(GetShopGroupResponse getShopGroupResponse, UnmarshallerContext _ctx) {
		
		getShopGroupResponse.setRequestId(_ctx.stringValue("GetShopGroupResponse.RequestId"));
		getShopGroupResponse.setSuccess(_ctx.booleanValue("GetShopGroupResponse.Success"));
		getShopGroupResponse.setMessage(_ctx.stringValue("GetShopGroupResponse.Message"));
		getShopGroupResponse.setCode(_ctx.stringValue("GetShopGroupResponse.Code"));
		getShopGroupResponse.setHttpStatusCode(_ctx.integerValue("GetShopGroupResponse.HttpStatusCode"));
		getShopGroupResponse.setShopGroupId(_ctx.stringValue("GetShopGroupResponse.ShopGroupId"));
		getShopGroupResponse.setShopGroupName(_ctx.stringValue("GetShopGroupResponse.ShopGroupName"));
	 
	 	return getShopGroupResponse;
	}
}