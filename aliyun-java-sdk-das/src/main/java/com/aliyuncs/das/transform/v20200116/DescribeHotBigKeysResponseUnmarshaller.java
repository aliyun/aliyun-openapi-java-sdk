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

import com.aliyuncs.das.model.v20200116.DescribeHotBigKeysResponse;
import com.aliyuncs.das.model.v20200116.DescribeHotBigKeysResponse.Data;
import com.aliyuncs.das.model.v20200116.DescribeHotBigKeysResponse.Data.BigKey;
import com.aliyuncs.das.model.v20200116.DescribeHotBigKeysResponse.Data.HotKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHotBigKeysResponseUnmarshaller {

	public static DescribeHotBigKeysResponse unmarshall(DescribeHotBigKeysResponse describeHotBigKeysResponse, UnmarshallerContext _ctx) {
		
		describeHotBigKeysResponse.setRequestId(_ctx.stringValue("DescribeHotBigKeysResponse.RequestId"));
		describeHotBigKeysResponse.setMessage(_ctx.stringValue("DescribeHotBigKeysResponse.Message"));
		describeHotBigKeysResponse.setCode(_ctx.stringValue("DescribeHotBigKeysResponse.Code"));
		describeHotBigKeysResponse.setSuccess(_ctx.stringValue("DescribeHotBigKeysResponse.Success"));

		Data data = new Data();
		data.setHotKeyMsg(_ctx.stringValue("DescribeHotBigKeysResponse.Data.HotKeyMsg"));
		data.setBigKeyMsg(_ctx.stringValue("DescribeHotBigKeysResponse.Data.BigKeyMsg"));

		List<HotKey> hotKeys = new ArrayList<HotKey>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHotBigKeysResponse.Data.HotKeys.Length"); i++) {
			HotKey hotKey = new HotKey();
			hotKey.setKey(_ctx.stringValue("DescribeHotBigKeysResponse.Data.HotKeys["+ i +"].Key"));
			hotKey.setDb(_ctx.integerValue("DescribeHotBigKeysResponse.Data.HotKeys["+ i +"].Db"));
			hotKey.setHot(_ctx.stringValue("DescribeHotBigKeysResponse.Data.HotKeys["+ i +"].Hot"));
			hotKey.setKeyType(_ctx.stringValue("DescribeHotBigKeysResponse.Data.HotKeys["+ i +"].KeyType"));
			hotKey.setLfu(_ctx.integerValue("DescribeHotBigKeysResponse.Data.HotKeys["+ i +"].Lfu"));
			hotKey.setNodeId(_ctx.stringValue("DescribeHotBigKeysResponse.Data.HotKeys["+ i +"].NodeId"));

			hotKeys.add(hotKey);
		}
		data.setHotKeys(hotKeys);

		List<BigKey> bigKeys = new ArrayList<BigKey>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHotBigKeysResponse.Data.BigKeys.Length"); i++) {
			BigKey bigKey = new BigKey();
			bigKey.setDb(_ctx.integerValue("DescribeHotBigKeysResponse.Data.BigKeys["+ i +"].Db"));
			bigKey.setKey(_ctx.stringValue("DescribeHotBigKeysResponse.Data.BigKeys["+ i +"].Key"));
			bigKey.setKeyType(_ctx.stringValue("DescribeHotBigKeysResponse.Data.BigKeys["+ i +"].KeyType"));
			bigKey.setSize(_ctx.longValue("DescribeHotBigKeysResponse.Data.BigKeys["+ i +"].Size"));
			bigKey.setNodeId(_ctx.stringValue("DescribeHotBigKeysResponse.Data.BigKeys["+ i +"].NodeId"));

			bigKeys.add(bigKey);
		}
		data.setBigKeys(bigKeys);
		describeHotBigKeysResponse.setData(data);
	 
	 	return describeHotBigKeysResponse;
	}
}