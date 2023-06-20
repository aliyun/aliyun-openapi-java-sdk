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

import com.aliyuncs.cd.model.v2021127.CreateShopResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateShopResponseUnmarshaller {

	public static CreateShopResponse unmarshall(CreateShopResponse createShopResponse, UnmarshallerContext _ctx) {
		
		createShopResponse.setRequestId(_ctx.stringValue("CreateShopResponse.RequestId"));
		createShopResponse.setSuccess(_ctx.booleanValue("CreateShopResponse.Success"));
		createShopResponse.setMessage(_ctx.stringValue("CreateShopResponse.Message"));
		createShopResponse.setCode(_ctx.stringValue("CreateShopResponse.Code"));
		createShopResponse.setHttpStatusCode(_ctx.integerValue("CreateShopResponse.HttpStatusCode"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateShopResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("CreateShopResponse.Data["+ i +"]"));
		}
		createShopResponse.setData(data);
	 
	 	return createShopResponse;
	}
}