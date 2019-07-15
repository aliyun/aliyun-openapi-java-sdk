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

package com.aliyuncs.aas.transform.v20150701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aas.model.v20150701.ListAccessKeysForAccountResponse;
import com.aliyuncs.aas.model.v20150701.ListAccessKeysForAccountResponse.AccessKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccessKeysForAccountResponseUnmarshaller {

	public static ListAccessKeysForAccountResponse unmarshall(ListAccessKeysForAccountResponse listAccessKeysForAccountResponse, UnmarshallerContext _ctx) {
		
		listAccessKeysForAccountResponse.setRequestId(_ctx.stringValue("ListAccessKeysForAccountResponse.RequestId"));
		listAccessKeysForAccountResponse.setPK(_ctx.stringValue("ListAccessKeysForAccountResponse.PK"));

		List<AccessKey> accessKeys = new ArrayList<AccessKey>();
		for (int i = 0; i < _ctx.lengthValue("ListAccessKeysForAccountResponse.AccessKeys.Length"); i++) {
			AccessKey accessKey = new AccessKey();
			accessKey.setCreateTime(_ctx.stringValue("ListAccessKeysForAccountResponse.AccessKeys["+ i +"].CreateTime"));
			accessKey.setAccessKeyId(_ctx.stringValue("ListAccessKeysForAccountResponse.AccessKeys["+ i +"].AccessKeyId"));
			accessKey.setAccessKeySecret(_ctx.stringValue("ListAccessKeysForAccountResponse.AccessKeys["+ i +"].AccessKeySecret"));
			accessKey.setAccessKeyStatus(_ctx.stringValue("ListAccessKeysForAccountResponse.AccessKeys["+ i +"].AccessKeyStatus"));
			accessKey.setAccessKeyType(_ctx.stringValue("ListAccessKeysForAccountResponse.AccessKeys["+ i +"].AccessKeyType"));

			accessKeys.add(accessKey);
		}
		listAccessKeysForAccountResponse.setAccessKeys(accessKeys);
	 
	 	return listAccessKeysForAccountResponse;
	}
}