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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.DescribeTopBigKeysResponse;
import com.aliyuncs.das.model.v20200116.DescribeTopBigKeysResponse.BigKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTopBigKeysResponseUnmarshaller {

	public static DescribeTopBigKeysResponse unmarshall(DescribeTopBigKeysResponse describeTopBigKeysResponse, UnmarshallerContext _ctx) {
		
		describeTopBigKeysResponse.setRequestId(_ctx.stringValue("DescribeTopBigKeysResponse.RequestId"));
		describeTopBigKeysResponse.setMessage(_ctx.stringValue("DescribeTopBigKeysResponse.Message"));
		describeTopBigKeysResponse.setCode(_ctx.stringValue("DescribeTopBigKeysResponse.Code"));
		describeTopBigKeysResponse.setSuccess(_ctx.stringValue("DescribeTopBigKeysResponse.Success"));

		List<BigKey> data = new ArrayList<BigKey>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTopBigKeysResponse.Data.Length"); i++) {
			BigKey bigKey = new BigKey();
			bigKey.setKeyType(_ctx.stringValue("DescribeTopBigKeysResponse.Data["+ i +"].KeyType"));
			bigKey.setSize(_ctx.longValue("DescribeTopBigKeysResponse.Data["+ i +"].Size"));
			bigKey.setNodeId(_ctx.stringValue("DescribeTopBigKeysResponse.Data["+ i +"].NodeId"));
			bigKey.setDb(_ctx.integerValue("DescribeTopBigKeysResponse.Data["+ i +"].Db"));
			bigKey.setKey(_ctx.stringValue("DescribeTopBigKeysResponse.Data["+ i +"].Key"));

			data.add(bigKey);
		}
		describeTopBigKeysResponse.setData(data);
	 
	 	return describeTopBigKeysResponse;
	}
}