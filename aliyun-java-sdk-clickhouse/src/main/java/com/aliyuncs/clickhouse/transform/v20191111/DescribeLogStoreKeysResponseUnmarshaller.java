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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeLogStoreKeysResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogStoreKeysResponseUnmarshaller {

	public static DescribeLogStoreKeysResponse unmarshall(DescribeLogStoreKeysResponse describeLogStoreKeysResponse, UnmarshallerContext _ctx) {
		
		describeLogStoreKeysResponse.setRequestId(_ctx.stringValue("DescribeLogStoreKeysResponse.RequestId"));

		List<String> logStoreKeys = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogStoreKeysResponse.LogStoreKeys.Length"); i++) {
			logStoreKeys.add(_ctx.stringValue("DescribeLogStoreKeysResponse.LogStoreKeys["+ i +"]"));
		}
		describeLogStoreKeysResponse.setLogStoreKeys(logStoreKeys);
	 
	 	return describeLogStoreKeysResponse;
	}
}