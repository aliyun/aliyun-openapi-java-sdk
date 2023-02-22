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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeLoginSwitchConfigsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeLoginSwitchConfigsResponse.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoginSwitchConfigsResponseUnmarshaller {

	public static DescribeLoginSwitchConfigsResponse unmarshall(DescribeLoginSwitchConfigsResponse describeLoginSwitchConfigsResponse, UnmarshallerContext _ctx) {
		
		describeLoginSwitchConfigsResponse.setRequestId(_ctx.stringValue("DescribeLoginSwitchConfigsResponse.RequestId"));
		describeLoginSwitchConfigsResponse.setCount(_ctx.integerValue("DescribeLoginSwitchConfigsResponse.Count"));

		List<Config> configList = new ArrayList<Config>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoginSwitchConfigsResponse.ConfigList.Length"); i++) {
			Config config = new Config();
			config.setStatus(_ctx.integerValue("DescribeLoginSwitchConfigsResponse.ConfigList["+ i +"].Status"));
			config.setItem(_ctx.stringValue("DescribeLoginSwitchConfigsResponse.ConfigList["+ i +"].Item"));

			configList.add(config);
		}
		describeLoginSwitchConfigsResponse.setConfigList(configList);
	 
	 	return describeLoginSwitchConfigsResponse;
	}
}