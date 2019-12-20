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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.AddAddressResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddAddressResponseUnmarshaller {

	public static AddAddressResponse unmarshall(AddAddressResponse addAddressResponse, UnmarshallerContext _ctx) {
		
		addAddressResponse.setRequestId(_ctx.stringValue("AddAddressResponse.RequestId"));
		addAddressResponse.setCode(_ctx.stringValue("AddAddressResponse.Code"));
		addAddressResponse.setMessage(_ctx.stringValue("AddAddressResponse.Message"));
		addAddressResponse.setAddressId(_ctx.longValue("AddAddressResponse.AddressId"));
	 
	 	return addAddressResponse;
	}
}