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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeKmsKeysResponse;
import com.aliyuncs.adb.model.v20190315.DescribeKmsKeysResponse.KmsKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKmsKeysResponseUnmarshaller {

	public static DescribeKmsKeysResponse unmarshall(DescribeKmsKeysResponse describeKmsKeysResponse, UnmarshallerContext _ctx) {
		
		describeKmsKeysResponse.setRequestId(_ctx.stringValue("DescribeKmsKeysResponse.RequestId"));

		List<KmsKey> kmsKeys = new ArrayList<KmsKey>();
		for (int i = 0; i < _ctx.lengthValue("DescribeKmsKeysResponse.KmsKeys.Length"); i++) {
			KmsKey kmsKey = new KmsKey();
			kmsKey.setKeyAlias(_ctx.stringValue("DescribeKmsKeysResponse.KmsKeys["+ i +"].KeyAlias"));
			kmsKey.setKeyId(_ctx.stringValue("DescribeKmsKeysResponse.KmsKeys["+ i +"].KeyId"));

			kmsKeys.add(kmsKey);
		}
		describeKmsKeysResponse.setKmsKeys(kmsKeys);
	 
	 	return describeKmsKeysResponse;
	}
}