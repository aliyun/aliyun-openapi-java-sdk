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

import com.aliyuncs.webplus.model.v20190320.DescribeConfigIndexResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeConfigIndexResponse.ConfigGroup;
import com.aliyuncs.webplus.model.v20190320.DescribeConfigIndexResponse.ConfigGroup.ConfigPath;
import com.aliyuncs.webplus.model.v20190320.DescribeConfigIndexResponse.ConfigGroup.ConfigPath.ConfigOption;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConfigIndexResponseUnmarshaller {

	public static DescribeConfigIndexResponse unmarshall(DescribeConfigIndexResponse describeConfigIndexResponse, UnmarshallerContext _ctx) {
		
		describeConfigIndexResponse.setRequestId(_ctx.stringValue("DescribeConfigIndexResponse.RequestId"));
		describeConfigIndexResponse.setCode(_ctx.stringValue("DescribeConfigIndexResponse.Code"));
		describeConfigIndexResponse.setMessage(_ctx.stringValue("DescribeConfigIndexResponse.Message"));
		describeConfigIndexResponse.setStackId(_ctx.stringValue("DescribeConfigIndexResponse.StackId"));
		describeConfigIndexResponse.setStackName(_ctx.stringValue("DescribeConfigIndexResponse.StackName"));

		List<ConfigGroup> configGroups = new ArrayList<ConfigGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigIndexResponse.ConfigGroups.Length"); i++) {
			ConfigGroup configGroup = new ConfigGroup();
			configGroup.setGroupName(_ctx.stringValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].GroupName"));
			configGroup.setGroupLabel(_ctx.stringValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].GroupLabel"));

			List<ConfigPath> configPaths = new ArrayList<ConfigPath>();
			for (int j = 0; j < _ctx.lengthValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths.Length"); j++) {
				ConfigPath configPath = new ConfigPath();
				configPath.setPathName(_ctx.stringValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].PathName"));
				configPath.setPathLabel(_ctx.stringValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].PathLabel"));
				configPath.setHiddenPath(_ctx.booleanValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].HiddenPath"));

				List<ConfigOption> configOptions = new ArrayList<ConfigOption>();
				for (int k = 0; k < _ctx.lengthValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions.Length"); k++) {
					ConfigOption configOption = new ConfigOption();
					configOption.setPathName(_ctx.stringValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].PathName"));
					configOption.setOptionName(_ctx.stringValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].OptionName"));
					configOption.setOptionLabel(_ctx.stringValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].OptionLabel"));
					configOption.setValueType(_ctx.stringValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].ValueType"));
					configOption.setDefaultValue(_ctx.stringValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].DefaultValue"));
					configOption.setChangeSeverity(_ctx.stringValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].ChangeSeverity"));
					configOption.setOptionDescription(_ctx.stringValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].OptionDescription"));
					configOption.setMaxLength(_ctx.integerValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].MaxLength"));
					configOption.setMinLength(_ctx.integerValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].MinLength"));
					configOption.setMaxValue(_ctx.longValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].MaxValue"));
					configOption.setMinValue(_ctx.longValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].MinValue"));
					configOption.setRegexPattern(_ctx.stringValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].RegexPattern"));
					configOption.setRegexDesc(_ctx.stringValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].RegexDesc"));
					configOption.setEditorType(_ctx.stringValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].EditorType"));
					configOption.setValueOptions(_ctx.stringValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].ValueOptions"));
					configOption.setReadonlyOption(_ctx.booleanValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].ReadonlyOption"));
					configOption.setHiddenOption(_ctx.booleanValue("DescribeConfigIndexResponse.ConfigGroups["+ i +"].ConfigPaths["+ j +"].ConfigOptions["+ k +"].HiddenOption"));

					configOptions.add(configOption);
				}
				configPath.setConfigOptions(configOptions);

				configPaths.add(configPath);
			}
			configGroup.setConfigPaths(configPaths);

			configGroups.add(configGroup);
		}
		describeConfigIndexResponse.setConfigGroups(configGroups);
	 
	 	return describeConfigIndexResponse;
	}
}