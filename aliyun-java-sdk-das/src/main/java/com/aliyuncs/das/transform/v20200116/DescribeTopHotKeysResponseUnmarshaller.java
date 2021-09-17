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

import com.aliyuncs.das.model.v20200116.DescribeTopHotKeysResponse;
import com.aliyuncs.das.model.v20200116.DescribeTopHotKeysResponse.HotKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTopHotKeysResponseUnmarshaller {

	public static DescribeTopHotKeysResponse unmarshall(DescribeTopHotKeysResponse describeTopHotKeysResponse, UnmarshallerContext _ctx) {
		
		describeTopHotKeysResponse.setRequestId(_ctx.stringValue("DescribeTopHotKeysResponse.RequestId"));
		describeTopHotKeysResponse.setMessage(_ctx.stringValue("DescribeTopHotKeysResponse.Message"));
		describeTopHotKeysResponse.setCode(_ctx.stringValue("DescribeTopHotKeysResponse.Code"));
		describeTopHotKeysResponse.setSuccess(_ctx.stringValue("DescribeTopHotKeysResponse.Success"));

		List<HotKey> data = new ArrayList<HotKey>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTopHotKeysResponse.Data.Length"); i++) {
			HotKey hotKey = new HotKey();
			hotKey.setDb(_ctx.integerValue("DescribeTopHotKeysResponse.Data["+ i +"].Db"));
			hotKey.setKey(_ctx.stringValue("DescribeTopHotKeysResponse.Data["+ i +"].Key"));
			hotKey.setHot(_ctx.stringValue("DescribeTopHotKeysResponse.Data["+ i +"].Hot"));
			hotKey.setKeyType(_ctx.stringValue("DescribeTopHotKeysResponse.Data["+ i +"].KeyType"));
			hotKey.setLfu(_ctx.integerValue("DescribeTopHotKeysResponse.Data["+ i +"].Lfu"));
			hotKey.setNodeId(_ctx.stringValue("DescribeTopHotKeysResponse.Data["+ i +"].NodeId"));

			data.add(hotKey);
		}
		describeTopHotKeysResponse.setData(data);
	 
	 	return describeTopHotKeysResponse;
	}
}