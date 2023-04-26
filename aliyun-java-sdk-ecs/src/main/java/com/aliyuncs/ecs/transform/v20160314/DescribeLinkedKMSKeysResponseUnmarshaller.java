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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeLinkedKMSKeysResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeLinkedKMSKeysResponse.KMSKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLinkedKMSKeysResponseUnmarshaller {

	public static DescribeLinkedKMSKeysResponse unmarshall(DescribeLinkedKMSKeysResponse describeLinkedKMSKeysResponse, UnmarshallerContext _ctx) {
		
		describeLinkedKMSKeysResponse.setRequestId(_ctx.stringValue("DescribeLinkedKMSKeysResponse.RequestId"));

		List<KMSKey> kMSKeys = new ArrayList<KMSKey>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLinkedKMSKeysResponse.KMSKeys.Length"); i++) {
			KMSKey kMSKey = new KMSKey();
			kMSKey.setAlias(_ctx.stringValue("DescribeLinkedKMSKeysResponse.KMSKeys["+ i +"].Alias"));
			kMSKey.setKMSKeyId(_ctx.stringValue("DescribeLinkedKMSKeysResponse.KMSKeys["+ i +"].KMSKeyId"));

			kMSKeys.add(kMSKey);
		}
		describeLinkedKMSKeysResponse.setKMSKeys(kMSKeys);
	 
	 	return describeLinkedKMSKeysResponse;
	}
}