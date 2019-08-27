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

package com.aliyuncs.webplus.transform.v20190320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.webplus.model.v20190320.DescribeConfigOptionsResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeConfigOptionsResponse.StackConfigOption;
import com.aliyuncs.webplus.model.v20190320.DescribeConfigOptionsResponse.StackConfigOption.ConfigOption;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConfigOptionsResponseUnmarshaller {

	public static DescribeConfigOptionsResponse unmarshall(DescribeConfigOptionsResponse describeConfigOptionsResponse, UnmarshallerContext _ctx) {
		
		describeConfigOptionsResponse.setRequestId(_ctx.stringValue("DescribeConfigOptionsResponse.RequestId"));
		describeConfigOptionsResponse.setCode(_ctx.stringValue("DescribeConfigOptionsResponse.Code"));
		describeConfigOptionsResponse.setMessage(_ctx.stringValue("DescribeConfigOptionsResponse.Message"));

		StackConfigOption stackConfigOption = new StackConfigOption();
		stackConfigOption.setStackId(_ctx.stringValue("DescribeConfigOptionsResponse.StackConfigOption.StackId"));
		stackConfigOption.setStackName(_ctx.stringValue("DescribeConfigOptionsResponse.StackConfigOption.StackName"));

		List<ConfigOption> configOptions = new ArrayList<ConfigOption>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions.Length"); i++) {
			ConfigOption configOption = new ConfigOption();
			configOption.setPathName(_ctx.stringValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].PathName"));
			configOption.setOptionName(_ctx.stringValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].OptionName"));
			configOption.setValueType(_ctx.stringValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].ValueType"));
			configOption.setDefaultValue(_ctx.stringValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].DefaultValue"));
			configOption.setChangeSeverity(_ctx.stringValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].ChangeSeverity"));
			configOption.setOptionDescription(_ctx.stringValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].OptionDescription"));
			configOption.setMaxLength(_ctx.integerValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].MaxLength"));
			configOption.setMaxValue(_ctx.longValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].MaxValue"));
			configOption.setMinValue(_ctx.longValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].MinValue"));
			configOption.setRegexPattern(_ctx.stringValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].RegexPattern"));
			configOption.setRegexDesc(_ctx.stringValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].RegexDesc"));
			configOption.setOptionLabel(_ctx.stringValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].OptionLabel"));
			configOption.setMinLength(_ctx.integerValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].MinLength"));
			configOption.setEditorType(_ctx.stringValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].EditorType"));
			configOption.setValueOptions(_ctx.stringValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].ValueOptions"));
			configOption.setHiddenOption(_ctx.booleanValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].HiddenOption"));
			configOption.setReadonlyOption(_ctx.booleanValue("DescribeConfigOptionsResponse.StackConfigOption.ConfigOptions["+ i +"].ReadonlyOption"));

			configOptions.add(configOption);
		}
		stackConfigOption.setConfigOptions(configOptions);
		describeConfigOptionsResponse.setStackConfigOption(stackConfigOption);
	 
	 	return describeConfigOptionsResponse;
	}
}