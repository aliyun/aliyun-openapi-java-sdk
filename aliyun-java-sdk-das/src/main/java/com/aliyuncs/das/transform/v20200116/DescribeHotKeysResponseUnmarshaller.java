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

import com.aliyuncs.das.model.v20200116.DescribeHotKeysResponse;
import com.aliyuncs.das.model.v20200116.DescribeHotKeysResponse.HotKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHotKeysResponseUnmarshaller {

	public static DescribeHotKeysResponse unmarshall(DescribeHotKeysResponse describeHotKeysResponse, UnmarshallerContext _ctx) {
		
		describeHotKeysResponse.setRequestId(_ctx.stringValue("DescribeHotKeysResponse.RequestId"));
		describeHotKeysResponse.setCode(_ctx.stringValue("DescribeHotKeysResponse.Code"));
		describeHotKeysResponse.setMessage(_ctx.stringValue("DescribeHotKeysResponse.Message"));
		describeHotKeysResponse.setSuccess(_ctx.stringValue("DescribeHotKeysResponse.Success"));

		List<HotKey> data = new ArrayList<HotKey>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHotKeysResponse.Data.Length"); i++) {
			HotKey hotKey = new HotKey();
			hotKey.setDb(_ctx.integerValue("DescribeHotKeysResponse.Data["+ i +"].Db"));
			hotKey.setKeyType(_ctx.stringValue("DescribeHotKeysResponse.Data["+ i +"].KeyType"));
			hotKey.setSize(_ctx.longValue("DescribeHotKeysResponse.Data["+ i +"].Size"));
			hotKey.setHot(_ctx.stringValue("DescribeHotKeysResponse.Data["+ i +"].Hot"));
			hotKey.setKey(_ctx.stringValue("DescribeHotKeysResponse.Data["+ i +"].Key"));

			data.add(hotKey);
		}
		describeHotKeysResponse.setData(data);
	 
	 	return describeHotKeysResponse;
	}
}