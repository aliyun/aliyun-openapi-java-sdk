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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.DescribeDefaultAlgorithmsResponse;
import com.aliyuncs.airec.model.v20201126.DescribeDefaultAlgorithmsResponse.ResultItem;
import com.aliyuncs.airec.model.v20201126.DescribeDefaultAlgorithmsResponse.ResultItem.ConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDefaultAlgorithmsResponseUnmarshaller {

	public static DescribeDefaultAlgorithmsResponse unmarshall(DescribeDefaultAlgorithmsResponse describeDefaultAlgorithmsResponse, UnmarshallerContext _ctx) {
		
		describeDefaultAlgorithmsResponse.setRequestId(_ctx.stringValue("DescribeDefaultAlgorithmsResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDefaultAlgorithmsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setKey(_ctx.stringValue("DescribeDefaultAlgorithmsResponse.result["+ i +"].key"));
			resultItem.setName(_ctx.stringValue("DescribeDefaultAlgorithmsResponse.result["+ i +"].name"));
			resultItem.setCategory(_ctx.stringValue("DescribeDefaultAlgorithmsResponse.result["+ i +"].category"));
			resultItem.setType(_ctx.stringValue("DescribeDefaultAlgorithmsResponse.result["+ i +"].type"));
			resultItem.setDefaultValue(_ctx.stringValue("DescribeDefaultAlgorithmsResponse.result["+ i +"].defaultValue"));
			resultItem.setExperimentValue(_ctx.stringValue("DescribeDefaultAlgorithmsResponse.result["+ i +"].experimentValue"));
			resultItem.setHasConfig(_ctx.booleanValue("DescribeDefaultAlgorithmsResponse.result["+ i +"].hasConfig"));

			List<ConfigItem> config = new ArrayList<ConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDefaultAlgorithmsResponse.result["+ i +"].config.Length"); j++) {
				ConfigItem configItem = new ConfigItem();
				configItem.setKey(_ctx.stringValue("DescribeDefaultAlgorithmsResponse.result["+ i +"].config["+ j +"].key"));
				configItem.setName(_ctx.stringValue("DescribeDefaultAlgorithmsResponse.result["+ i +"].config["+ j +"].name"));
				configItem.setDefaultValue(_ctx.stringValue("DescribeDefaultAlgorithmsResponse.result["+ i +"].config["+ j +"].defaultValue"));
				configItem.setExperimentValue(_ctx.stringValue("DescribeDefaultAlgorithmsResponse.result["+ i +"].config["+ j +"].experimentValue"));

				config.add(configItem);
			}
			resultItem.setConfig(config);

			result.add(resultItem);
		}
		describeDefaultAlgorithmsResponse.setResult(result);
	 
	 	return describeDefaultAlgorithmsResponse;
	}
}