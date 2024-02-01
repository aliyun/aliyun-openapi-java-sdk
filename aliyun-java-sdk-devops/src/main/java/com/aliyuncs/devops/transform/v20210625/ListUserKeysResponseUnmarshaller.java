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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListUserKeysResponse;
import com.aliyuncs.devops.model.v20210625.ListUserKeysResponse.List_keys_result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserKeysResponseUnmarshaller {

	public static ListUserKeysResponse unmarshall(ListUserKeysResponse listUserKeysResponse, UnmarshallerContext _ctx) {
		
		listUserKeysResponse.setRequestId(_ctx.stringValue("ListUserKeysResponse.requestId"));
		listUserKeysResponse.setErrorCode(_ctx.stringValue("ListUserKeysResponse.errorCode"));
		listUserKeysResponse.setErrorMessage(_ctx.stringValue("ListUserKeysResponse.errorMessage"));
		listUserKeysResponse.setSuccess(_ctx.booleanValue("ListUserKeysResponse.success"));

		List<List_keys_result> result = new ArrayList<List_keys_result>();
		for (int i = 0; i < _ctx.lengthValue("ListUserKeysResponse.result.Length"); i++) {
			List_keys_result list_keys_result = new List_keys_result();
			list_keys_result.setId(_ctx.longValue("ListUserKeysResponse.result["+ i +"].id"));
			list_keys_result.setTittle(_ctx.stringValue("ListUserKeysResponse.result["+ i +"].tittle"));
			list_keys_result.setTitle(_ctx.stringValue("ListUserKeysResponse.result["+ i +"].title"));
			list_keys_result.setPublicKey(_ctx.stringValue("ListUserKeysResponse.result["+ i +"].publicKey"));
			list_keys_result.setFingerPrint(_ctx.stringValue("ListUserKeysResponse.result["+ i +"].fingerPrint"));
			list_keys_result.setKeyScope(_ctx.stringValue("ListUserKeysResponse.result["+ i +"].keyScope"));
			list_keys_result.setCreatedAt(_ctx.stringValue("ListUserKeysResponse.result["+ i +"].createdAt"));
			list_keys_result.setExpireTime(_ctx.stringValue("ListUserKeysResponse.result["+ i +"].expireTime"));
			list_keys_result.setLastUsedTime(_ctx.stringValue("ListUserKeysResponse.result["+ i +"].lastUsedTime"));

			result.add(list_keys_result);
		}
		listUserKeysResponse.setResult(result);
	 
	 	return listUserKeysResponse;
	}
}