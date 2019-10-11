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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.CreateMixResponse;
import com.aliyuncs.airec.model.v20181012.CreateMixResponse.Result;
import com.aliyuncs.airec.model.v20181012.CreateMixResponse.Result.Parameter;
import com.aliyuncs.airec.model.v20181012.CreateMixResponse.Result.Parameter.SettingsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMixResponseUnmarshaller {

	public static CreateMixResponse unmarshall(CreateMixResponse createMixResponse, UnmarshallerContext _ctx) {
		
		createMixResponse.setRequestId(_ctx.stringValue("CreateMixResponse.RequestId"));
		createMixResponse.setCode(_ctx.stringValue("CreateMixResponse.Code"));
		createMixResponse.setMessage(_ctx.stringValue("CreateMixResponse.Message"));

		Result result = new Result();
		result.setName(_ctx.stringValue("CreateMixResponse.Result.Name"));
		result.setGmtCreate(_ctx.stringValue("CreateMixResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("CreateMixResponse.Result.GmtModified"));

		Parameter parameter = new Parameter();

		List<SettingsItem> settings = new ArrayList<SettingsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateMixResponse.Result.Parameter.Settings.Length"); i++) {
			SettingsItem settingsItem = new SettingsItem();
			settingsItem.setName(_ctx.stringValue("CreateMixResponse.Result.Parameter.Settings["+ i +"].Name"));
			settingsItem.setValue(_ctx.integerValue("CreateMixResponse.Result.Parameter.Settings["+ i +"].Value"));

			settings.add(settingsItem);
		}
		parameter.setSettings(settings);
		result.setParameter(parameter);
		createMixResponse.setResult(result);
	 
	 	return createMixResponse;
	}
}