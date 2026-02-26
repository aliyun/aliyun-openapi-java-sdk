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

package com.aliyuncs.kms.transform.v20160120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.kms.model.v20160120.ListClientKeysResponse;
import com.aliyuncs.kms.model.v20160120.ListClientKeysResponse.ClientKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClientKeysResponseUnmarshaller {

	public static ListClientKeysResponse unmarshall(ListClientKeysResponse listClientKeysResponse, UnmarshallerContext _ctx) {
		
		listClientKeysResponse.setRequestId(_ctx.stringValue("ListClientKeysResponse.RequestId"));

		List<ClientKey> clientKeys = new ArrayList<ClientKey>();
		for (int i = 0; i < _ctx.lengthValue("ListClientKeysResponse.ClientKeys.Length"); i++) {
			ClientKey clientKey = new ClientKey();
			clientKey.setClientKeyId(_ctx.stringValue("ListClientKeysResponse.ClientKeys["+ i +"].ClientKeyId"));
			clientKey.setCreateTime(_ctx.stringValue("ListClientKeysResponse.ClientKeys["+ i +"].CreateTime"));
			clientKey.setPublicKeyData(_ctx.stringValue("ListClientKeysResponse.ClientKeys["+ i +"].PublicKeyData"));
			clientKey.setKeyAlgorithm(_ctx.stringValue("ListClientKeysResponse.ClientKeys["+ i +"].KeyAlgorithm"));
			clientKey.setNotBefore(_ctx.stringValue("ListClientKeysResponse.ClientKeys["+ i +"].NotBefore"));
			clientKey.setNotAfter(_ctx.stringValue("ListClientKeysResponse.ClientKeys["+ i +"].NotAfter"));
			clientKey.setKeyOrigin(_ctx.stringValue("ListClientKeysResponse.ClientKeys["+ i +"].KeyOrigin"));
			clientKey.setAapName(_ctx.stringValue("ListClientKeysResponse.ClientKeys["+ i +"].AapName"));

			clientKeys.add(clientKey);
		}
		listClientKeysResponse.setClientKeys(clientKeys);
	 
	 	return listClientKeysResponse;
	}
}