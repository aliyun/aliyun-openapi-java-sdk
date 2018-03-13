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
package com.aliyuncs.ram.transform.v20150501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ram.model.v20150501.ListAccessKeysResponse;
import com.aliyuncs.ram.model.v20150501.ListAccessKeysResponse.AccessKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccessKeysResponseUnmarshaller {

	public static ListAccessKeysResponse unmarshall(ListAccessKeysResponse listAccessKeysResponse, UnmarshallerContext context) {
		
		listAccessKeysResponse.setRequestId(context.stringValue("ListAccessKeysResponse.RequestId"));

		List<AccessKey> accessKeys = new ArrayList<AccessKey>();
		for (int i = 0; i < context.lengthValue("ListAccessKeysResponse.AccessKeys.Length"); i++) {
			AccessKey accessKey = new AccessKey();
			accessKey.setAccessKeyId(context.stringValue("ListAccessKeysResponse.AccessKeys["+ i +"].AccessKeyId"));
			accessKey.setStatus(context.stringValue("ListAccessKeysResponse.AccessKeys["+ i +"].Status"));
			accessKey.setCreateDate(context.stringValue("ListAccessKeysResponse.AccessKeys["+ i +"].CreateDate"));

			accessKeys.add(accessKey);
		}
		listAccessKeysResponse.setAccessKeys(accessKeys);
	 
	 	return listAccessKeysResponse;
	}
}