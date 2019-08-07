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

import com.aliyuncs.webplus.model.v20190320.ValidateConfigSettingResponse;
import com.aliyuncs.webplus.model.v20190320.ValidateConfigSettingResponse.ConfigValidationResult;
import com.aliyuncs.webplus.model.v20190320.ValidateConfigSettingResponse.ConfigValidationResult.ConfigOption;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValidateConfigSettingResponseUnmarshaller {

	public static ValidateConfigSettingResponse unmarshall(ValidateConfigSettingResponse validateConfigSettingResponse, UnmarshallerContext _ctx) {
		
		validateConfigSettingResponse.setRequestId(_ctx.stringValue("ValidateConfigSettingResponse.RequestId"));
		validateConfigSettingResponse.setCode(_ctx.stringValue("ValidateConfigSettingResponse.Code"));
		validateConfigSettingResponse.setMessage(_ctx.stringValue("ValidateConfigSettingResponse.Message"));

		List<ConfigValidationResult> configValidationResults = new ArrayList<ConfigValidationResult>();
		for (int i = 0; i < _ctx.lengthValue("ValidateConfigSettingResponse.ConfigValidationResults.Length"); i++) {
			ConfigValidationResult configValidationResult = new ConfigValidationResult();
			configValidationResult.setPathName(_ctx.stringValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].PathName"));
			configValidationResult.setOptionName(_ctx.stringValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].OptionName"));
			configValidationResult.setResultSeverity(_ctx.stringValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ResultSeverity"));
			configValidationResult.setResultMessage(_ctx.stringValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ResultMessage"));

			ConfigOption configOption = new ConfigOption();
			configOption.setPathName(_ctx.stringValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.PathName"));
			configOption.setOptionName(_ctx.stringValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.OptionName"));
			configOption.setValueType(_ctx.stringValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.ValueType"));
			configOption.setDefaultValue(_ctx.stringValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.DefaultValue"));
			configOption.setChangeSeverity(_ctx.stringValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.ChangeSeverity"));
			configOption.setOptionDescription(_ctx.stringValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.OptionDescription"));
			configOption.setMaxLength(_ctx.integerValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.MaxLength"));
			configOption.setMaxValue(_ctx.longValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.MaxValue"));
			configOption.setMinValue(_ctx.longValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.MinValue"));
			configOption.setRegexPattern(_ctx.stringValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.RegexPattern"));
			configOption.setRegexDesc(_ctx.stringValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.RegexDesc"));
			configOption.setOptionLabel(_ctx.stringValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.OptionLabel"));
			configOption.setMinLength(_ctx.integerValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.MinLength"));
			configOption.setEditorType(_ctx.stringValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.EditorType"));
			configOption.setValueOptions(_ctx.stringValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.ValueOptions"));
			configOption.setHiddenOption(_ctx.booleanValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.HiddenOption"));
			configOption.setReadonlyOption(_ctx.booleanValue("ValidateConfigSettingResponse.ConfigValidationResults["+ i +"].ConfigOption.ReadonlyOption"));
			configValidationResult.setConfigOption(configOption);

			configValidationResults.add(configValidationResult);
		}
		validateConfigSettingResponse.setConfigValidationResults(configValidationResults);
	 
	 	return validateConfigSettingResponse;
	}
}