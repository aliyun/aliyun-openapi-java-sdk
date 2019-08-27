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

import com.aliyuncs.webplus.model.v20190320.DescribeConfigSettingsResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeConfigSettingsResponse.ConfigSetting;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConfigSettingsResponseUnmarshaller {

	public static DescribeConfigSettingsResponse unmarshall(DescribeConfigSettingsResponse describeConfigSettingsResponse, UnmarshallerContext _ctx) {
		
		describeConfigSettingsResponse.setRequestId(_ctx.stringValue("DescribeConfigSettingsResponse.RequestId"));
		describeConfigSettingsResponse.setCode(_ctx.stringValue("DescribeConfigSettingsResponse.Code"));
		describeConfigSettingsResponse.setMessage(_ctx.stringValue("DescribeConfigSettingsResponse.Message"));

		List<ConfigSetting> configSettings = new ArrayList<ConfigSetting>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigSettingsResponse.ConfigSettings.Length"); i++) {
			ConfigSetting configSetting = new ConfigSetting();
			configSetting.setPathName(_ctx.stringValue("DescribeConfigSettingsResponse.ConfigSettings["+ i +"].PathName"));
			configSetting.setOptionName(_ctx.stringValue("DescribeConfigSettingsResponse.ConfigSettings["+ i +"].OptionName"));
			configSetting.setSettingValue(_ctx.stringValue("DescribeConfigSettingsResponse.ConfigSettings["+ i +"].SettingValue"));

			configSettings.add(configSetting);
		}
		describeConfigSettingsResponse.setConfigSettings(configSettings);
	 
	 	return describeConfigSettingsResponse;
	}
}