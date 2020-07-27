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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeCdnUserConfigsResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnUserConfigsResponse.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnUserConfigsResponseUnmarshaller {

	public static DescribeCdnUserConfigsResponse unmarshall(DescribeCdnUserConfigsResponse describeCdnUserConfigsResponse, UnmarshallerContext _ctx) {
		
		describeCdnUserConfigsResponse.setRequestId(_ctx.stringValue("DescribeCdnUserConfigsResponse.RequestId"));

		List<Config> configs = new ArrayList<Config>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnUserConfigsResponse.Configs.Length"); i++) {
			Config config = new Config();
			config.setArgValue(_ctx.stringValue("DescribeCdnUserConfigsResponse.Configs["+ i +"].ArgValue"));
			config.setArgName(_ctx.stringValue("DescribeCdnUserConfigsResponse.Configs["+ i +"].ArgName"));
			config.setFunctionName(_ctx.stringValue("DescribeCdnUserConfigsResponse.Configs["+ i +"].FunctionName"));

			configs.add(config);
		}
		describeCdnUserConfigsResponse.setConfigs(configs);
	 
	 	return describeCdnUserConfigsResponse;
	}
}