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

package com.aliyuncs.sophonsoar.transform.v20220728;

import com.aliyuncs.sophonsoar.model.v20220728.DescribePlaybookInputOutputResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribePlaybookInputOutputResponse.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePlaybookInputOutputResponseUnmarshaller {

	public static DescribePlaybookInputOutputResponse unmarshall(DescribePlaybookInputOutputResponse describePlaybookInputOutputResponse, UnmarshallerContext _ctx) {
		
		describePlaybookInputOutputResponse.setRequestId(_ctx.stringValue("DescribePlaybookInputOutputResponse.RequestId"));

		Config config = new Config();
		config.setParamType(_ctx.stringValue("DescribePlaybookInputOutputResponse.Config.ParamType"));
		config.setExeConfig(_ctx.stringValue("DescribePlaybookInputOutputResponse.Config.ExeConfig"));
		config.setInputParams(_ctx.stringValue("DescribePlaybookInputOutputResponse.Config.InputParams"));
		config.setOutputParams(_ctx.stringValue("DescribePlaybookInputOutputResponse.Config.OutputParams"));
		config.setPlaybookUuid(_ctx.stringValue("DescribePlaybookInputOutputResponse.Config.PlaybookUuid"));
		config.setType(_ctx.stringValue("DescribePlaybookInputOutputResponse.Config.Type"));
		config.setModelCode(_ctx.stringValue("DescribePlaybookInputOutputResponse.Config.ModelCode"));
		config.setModelName(_ctx.stringValue("DescribePlaybookInputOutputResponse.Config.ModelName"));
		describePlaybookInputOutputResponse.setConfig(config);
	 
	 	return describePlaybookInputOutputResponse;
	}
}