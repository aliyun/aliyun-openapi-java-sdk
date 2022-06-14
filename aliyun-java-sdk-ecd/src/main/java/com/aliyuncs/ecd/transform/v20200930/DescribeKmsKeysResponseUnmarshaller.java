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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeKmsKeysResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeKmsKeysResponse.Key;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKmsKeysResponseUnmarshaller {

	public static DescribeKmsKeysResponse unmarshall(DescribeKmsKeysResponse describeKmsKeysResponse, UnmarshallerContext _ctx) {
		
		describeKmsKeysResponse.setRequestId(_ctx.stringValue("DescribeKmsKeysResponse.RequestId"));
		describeKmsKeysResponse.setKmsServiceStatus(_ctx.stringValue("DescribeKmsKeysResponse.KmsServiceStatus"));
		describeKmsKeysResponse.setAuthorizeStatus(_ctx.stringValue("DescribeKmsKeysResponse.AuthorizeStatus"));

		List<Key> keys = new ArrayList<Key>();
		for (int i = 0; i < _ctx.lengthValue("DescribeKmsKeysResponse.Keys.Length"); i++) {
			Key key = new Key();
			key.setKeyId(_ctx.stringValue("DescribeKmsKeysResponse.Keys["+ i +"].KeyId"));
			key.setArn(_ctx.stringValue("DescribeKmsKeysResponse.Keys["+ i +"].Arn"));
			key.setAlias(_ctx.stringValue("DescribeKmsKeysResponse.Keys["+ i +"].Alias"));
			key.setType(_ctx.stringValue("DescribeKmsKeysResponse.Keys["+ i +"].Type"));

			keys.add(key);
		}
		describeKmsKeysResponse.setKeys(keys);
	 
	 	return describeKmsKeysResponse;
	}
}