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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.ListKeyPairsResponse;
import com.aliyuncs.swas_open.model.v20200601.ListKeyPairsResponse.KeyPair;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListKeyPairsResponseUnmarshaller {

	public static ListKeyPairsResponse unmarshall(ListKeyPairsResponse listKeyPairsResponse, UnmarshallerContext _ctx) {
		
		listKeyPairsResponse.setRequestId(_ctx.stringValue("ListKeyPairsResponse.RequestId"));
		listKeyPairsResponse.setTotalCount(_ctx.integerValue("ListKeyPairsResponse.TotalCount"));
		listKeyPairsResponse.setPageSize(_ctx.integerValue("ListKeyPairsResponse.PageSize"));
		listKeyPairsResponse.setPageNumber(_ctx.integerValue("ListKeyPairsResponse.PageNumber"));

		List<KeyPair> keyPairs = new ArrayList<KeyPair>();
		for (int i = 0; i < _ctx.lengthValue("ListKeyPairsResponse.KeyPairs.Length"); i++) {
			KeyPair keyPair = new KeyPair();
			keyPair.setCreationTime(_ctx.stringValue("ListKeyPairsResponse.KeyPairs["+ i +"].CreationTime"));
			keyPair.setKeyPairName(_ctx.stringValue("ListKeyPairsResponse.KeyPairs["+ i +"].KeyPairName"));
			keyPair.setPublicKey(_ctx.stringValue("ListKeyPairsResponse.KeyPairs["+ i +"].PublicKey"));

			List<String> instanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListKeyPairsResponse.KeyPairs["+ i +"].InstanceIds.Length"); j++) {
				instanceIds.add(_ctx.stringValue("ListKeyPairsResponse.KeyPairs["+ i +"].InstanceIds["+ j +"]"));
			}
			keyPair.setInstanceIds(instanceIds);

			keyPairs.add(keyPair);
		}
		listKeyPairsResponse.setKeyPairs(keyPairs);
	 
	 	return listKeyPairsResponse;
	}
}