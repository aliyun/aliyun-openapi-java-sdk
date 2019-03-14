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

import com.aliyuncs.ram.model.v20150501.ListPublicKeysResponse;
import com.aliyuncs.ram.model.v20150501.ListPublicKeysResponse.PublicKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPublicKeysResponseUnmarshaller {

	public static ListPublicKeysResponse unmarshall(ListPublicKeysResponse listPublicKeysResponse, UnmarshallerContext context) {
		
		listPublicKeysResponse.setRequestId(context.stringValue("ListPublicKeysResponse.RequestId"));

		List<PublicKey> publicKeys = new ArrayList<PublicKey>();
		for (int i = 0; i < context.lengthValue("ListPublicKeysResponse.PublicKeys.Length"); i++) {
			PublicKey publicKey = new PublicKey();
			publicKey.setPublicKeyId(context.stringValue("ListPublicKeysResponse.PublicKeys["+ i +"].PublicKeyId"));
			publicKey.setStatus(context.stringValue("ListPublicKeysResponse.PublicKeys["+ i +"].Status"));
			publicKey.setCreateDate(context.stringValue("ListPublicKeysResponse.PublicKeys["+ i +"].CreateDate"));

			publicKeys.add(publicKey);
		}
		listPublicKeysResponse.setPublicKeys(publicKeys);
	 
	 	return listPublicKeysResponse;
	}
}