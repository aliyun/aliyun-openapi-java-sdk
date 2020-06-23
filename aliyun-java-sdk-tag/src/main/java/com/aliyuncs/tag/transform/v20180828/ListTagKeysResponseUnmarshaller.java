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

package com.aliyuncs.tag.transform.v20180828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.tag.model.v20180828.ListTagKeysResponse;
import com.aliyuncs.tag.model.v20180828.ListTagKeysResponse.Key;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagKeysResponseUnmarshaller {

	public static ListTagKeysResponse unmarshall(ListTagKeysResponse listTagKeysResponse, UnmarshallerContext _ctx) {
		
		listTagKeysResponse.setRequestId(_ctx.stringValue("ListTagKeysResponse.RequestId"));
		listTagKeysResponse.setNextToken(_ctx.stringValue("ListTagKeysResponse.NextToken"));

		List<Key> keys = new ArrayList<Key>();
		for (int i = 0; i < _ctx.lengthValue("ListTagKeysResponse.Keys.Length"); i++) {
			Key key = new Key();
			key.setCategory(_ctx.stringValue("ListTagKeysResponse.Keys["+ i +"].Category"));
			key.setKey(_ctx.stringValue("ListTagKeysResponse.Keys["+ i +"].Key"));

			keys.add(key);
		}
		listTagKeysResponse.setKeys(keys);
	 
	 	return listTagKeysResponse;
	}
}