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
import com.aliyuncs.devops.model.v20210625.ListUserKeysResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserKeysResponseUnmarshaller {

	public static ListUserKeysResponse unmarshall(ListUserKeysResponse listUserKeysResponse, UnmarshallerContext _ctx) {
		
		listUserKeysResponse.setRequestId(_ctx.stringValue("ListUserKeysResponse.requestId"));
		listUserKeysResponse.setErrorCode(_ctx.stringValue("ListUserKeysResponse.errorCode"));
		listUserKeysResponse.setErrorMessage(_ctx.stringValue("ListUserKeysResponse.errorMessage"));
		listUserKeysResponse.setSuccess(_ctx.booleanValue("ListUserKeysResponse.success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUserKeysResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("ListUserKeysResponse.result["+ i +"].id"));
			resultItem.setTittle(_ctx.stringValue("ListUserKeysResponse.result["+ i +"].tittle"));
			resultItem.setPublicKey(_ctx.stringValue("ListUserKeysResponse.result["+ i +"].publicKey"));
			resultItem.setFingerPrint(_ctx.stringValue("ListUserKeysResponse.result["+ i +"].fingerPrint"));
			resultItem.setKeyScope(_ctx.stringValue("ListUserKeysResponse.result["+ i +"].keyScope"));
			resultItem.setCreatedAt(_ctx.stringValue("ListUserKeysResponse.result["+ i +"].createdAt"));
			resultItem.setExpireTime(_ctx.stringValue("ListUserKeysResponse.result["+ i +"].expireTime"));
			resultItem.setLastUsedTime(_ctx.stringValue("ListUserKeysResponse.result["+ i +"].lastUsedTime"));

			result.add(resultItem);
		}
		listUserKeysResponse.setResult(result);
	 
	 	return listUserKeysResponse;
	}
}