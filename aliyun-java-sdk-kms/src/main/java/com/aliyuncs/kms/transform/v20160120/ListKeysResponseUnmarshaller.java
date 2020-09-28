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

import com.aliyuncs.kms.model.v20160120.ListKeysResponse;
import com.aliyuncs.kms.model.v20160120.ListKeysResponse.Key;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListKeysResponseUnmarshaller {

	public static ListKeysResponse unmarshall(ListKeysResponse listKeysResponse, UnmarshallerContext _ctx) {
		
		listKeysResponse.setRequestId(_ctx.stringValue("ListKeysResponse.RequestId"));
		listKeysResponse.setPageNumber(_ctx.integerValue("ListKeysResponse.PageNumber"));
		listKeysResponse.setPageSize(_ctx.integerValue("ListKeysResponse.PageSize"));
		listKeysResponse.setTotalCount(_ctx.integerValue("ListKeysResponse.TotalCount"));

		List<Key> keys = new ArrayList<Key>();
		for (int i = 0; i < _ctx.lengthValue("ListKeysResponse.Keys.Length"); i++) {
			Key key = new Key();
			key.setKeyArn(_ctx.stringValue("ListKeysResponse.Keys["+ i +"].KeyArn"));
			key.setKeyId(_ctx.stringValue("ListKeysResponse.Keys["+ i +"].KeyId"));

			keys.add(key);
		}
		listKeysResponse.setKeys(keys);
	 
	 	return listKeysResponse;
	}
}