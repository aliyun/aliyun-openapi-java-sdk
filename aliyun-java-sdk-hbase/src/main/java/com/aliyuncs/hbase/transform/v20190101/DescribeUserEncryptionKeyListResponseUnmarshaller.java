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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.DescribeUserEncryptionKeyListResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeUserEncryptionKeyListResponse.KmsKeysItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserEncryptionKeyListResponseUnmarshaller {

	public static DescribeUserEncryptionKeyListResponse unmarshall(DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyListResponse, UnmarshallerContext _ctx) {
		
		describeUserEncryptionKeyListResponse.setRequestId(_ctx.stringValue("DescribeUserEncryptionKeyListResponse.RequestId"));

		List<KmsKeysItem> kmsKeys = new ArrayList<KmsKeysItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserEncryptionKeyListResponse.KmsKeys.Length"); i++) {
			KmsKeysItem kmsKeysItem = new KmsKeysItem();
			kmsKeysItem.setKeyId(_ctx.stringValue("DescribeUserEncryptionKeyListResponse.KmsKeys["+ i +"].KeyId"));

			kmsKeys.add(kmsKeysItem);
		}
		describeUserEncryptionKeyListResponse.setKmsKeys(kmsKeys);
	 
	 	return describeUserEncryptionKeyListResponse;
	}
}