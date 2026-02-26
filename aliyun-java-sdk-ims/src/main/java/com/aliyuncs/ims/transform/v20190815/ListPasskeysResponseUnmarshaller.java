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

package com.aliyuncs.ims.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ims.model.v20190815.ListPasskeysResponse;
import com.aliyuncs.ims.model.v20190815.ListPasskeysResponse.Key;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPasskeysResponseUnmarshaller {

	public static ListPasskeysResponse unmarshall(ListPasskeysResponse listPasskeysResponse, UnmarshallerContext _ctx) {
		
		listPasskeysResponse.setRequestId(_ctx.stringValue("ListPasskeysResponse.RequestId"));

		List<Key> passkeys = new ArrayList<Key>();
		for (int i = 0; i < _ctx.lengthValue("ListPasskeysResponse.Passkeys.Length"); i++) {
			Key key = new Key();
			key.setPasskeyName(_ctx.stringValue("ListPasskeysResponse.Passkeys["+ i +"].PasskeyName"));
			key.setPasskeyId(_ctx.stringValue("ListPasskeysResponse.Passkeys["+ i +"].PasskeyId"));
			key.setCreateDate(_ctx.stringValue("ListPasskeysResponse.Passkeys["+ i +"].CreateDate"));
			key.setLastUseDate(_ctx.stringValue("ListPasskeysResponse.Passkeys["+ i +"].LastUseDate"));

			passkeys.add(key);
		}
		listPasskeysResponse.setPasskeys(passkeys);
	 
	 	return listPasskeysResponse;
	}
}