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

package com.aliyuncs.cloudphone.transform.v20201230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphone.model.v20201230.ListKeyPairsResponse;
import com.aliyuncs.cloudphone.model.v20201230.ListKeyPairsResponse.KeyPair;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListKeyPairsResponseUnmarshaller {

	public static ListKeyPairsResponse unmarshall(ListKeyPairsResponse listKeyPairsResponse, UnmarshallerContext _ctx) {
		
		listKeyPairsResponse.setRequestId(_ctx.stringValue("ListKeyPairsResponse.RequestId"));
		listKeyPairsResponse.setNextToken(_ctx.stringValue("ListKeyPairsResponse.NextToken"));
		listKeyPairsResponse.setTotalCount(_ctx.integerValue("ListKeyPairsResponse.TotalCount"));
		listKeyPairsResponse.setMaxResults(_ctx.integerValue("ListKeyPairsResponse.MaxResults"));

		List<KeyPair> keyPairs = new ArrayList<KeyPair>();
		for (int i = 0; i < _ctx.lengthValue("ListKeyPairsResponse.KeyPairs.Length"); i++) {
			KeyPair keyPair = new KeyPair();
			keyPair.setCreationTime(_ctx.stringValue("ListKeyPairsResponse.KeyPairs["+ i +"].CreationTime"));
			keyPair.setKeyPairName(_ctx.stringValue("ListKeyPairsResponse.KeyPairs["+ i +"].KeyPairName"));
			keyPair.setKeyPairFingerPrint(_ctx.stringValue("ListKeyPairsResponse.KeyPairs["+ i +"].KeyPairFingerPrint"));

			keyPairs.add(keyPair);
		}
		listKeyPairsResponse.setKeyPairs(keyPairs);
	 
	 	return listKeyPairsResponse;
	}
}