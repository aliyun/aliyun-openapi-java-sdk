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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cd.model.v2021127.CreateShopGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateShopGroupResponseUnmarshaller {

	public static CreateShopGroupResponse unmarshall(CreateShopGroupResponse createShopGroupResponse, UnmarshallerContext _ctx) {
		
		createShopGroupResponse.setRequestId(_ctx.stringValue("CreateShopGroupResponse.RequestId"));
		createShopGroupResponse.setSuccess(_ctx.booleanValue("CreateShopGroupResponse.Success"));
		createShopGroupResponse.setMessage(_ctx.stringValue("CreateShopGroupResponse.Message"));
		createShopGroupResponse.setCode(_ctx.stringValue("CreateShopGroupResponse.Code"));
		createShopGroupResponse.setHttpStatusCode(_ctx.integerValue("CreateShopGroupResponse.HttpStatusCode"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateShopGroupResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("CreateShopGroupResponse.Data["+ i +"]"));
		}
		createShopGroupResponse.setData(data);
	 
	 	return createShopGroupResponse;
	}
}