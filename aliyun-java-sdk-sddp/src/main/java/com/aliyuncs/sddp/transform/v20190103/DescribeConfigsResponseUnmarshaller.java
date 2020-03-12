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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeConfigsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeConfigsResponse.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConfigsResponseUnmarshaller {

	public static DescribeConfigsResponse unmarshall(DescribeConfigsResponse describeConfigsResponse, UnmarshallerContext _ctx) {
		
		describeConfigsResponse.setRequestId(_ctx.stringValue("DescribeConfigsResponse.RequestId"));

		List<Config> configList = new ArrayList<Config>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigsResponse.ConfigList.Length"); i++) {
			Config config = new Config();
			config.setId(_ctx.longValue("DescribeConfigsResponse.ConfigList["+ i +"].Id"));
			config.setCode(_ctx.integerValue("DescribeConfigsResponse.ConfigList["+ i +"].Code"));
			config.setDescription(_ctx.stringValue("DescribeConfigsResponse.ConfigList["+ i +"].Description"));
			config.setValue(_ctx.longValue("DescribeConfigsResponse.ConfigList["+ i +"].Value"));
			config.setDefaultValue(_ctx.stringValue("DescribeConfigsResponse.ConfigList["+ i +"].DefaultValue"));

			configList.add(config);
		}
		describeConfigsResponse.setConfigList(configList);
	 
	 	return describeConfigsResponse;
	}
}