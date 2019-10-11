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

import com.aliyuncs.airec.model.v20181012.DeleteMixResponse;
import com.aliyuncs.airec.model.v20181012.DeleteMixResponse.Result;
import com.aliyuncs.airec.model.v20181012.DeleteMixResponse.Result.Parameter;
import com.aliyuncs.airec.model.v20181012.DeleteMixResponse.Result.Parameter.SettingsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMixResponseUnmarshaller {

	public static DeleteMixResponse unmarshall(DeleteMixResponse deleteMixResponse, UnmarshallerContext _ctx) {
		
		deleteMixResponse.setRequestId(_ctx.stringValue("DeleteMixResponse.RequestId"));
		deleteMixResponse.setCode(_ctx.stringValue("DeleteMixResponse.Code"));
		deleteMixResponse.setMessage(_ctx.stringValue("DeleteMixResponse.Message"));

		Result result = new Result();
		result.setName(_ctx.stringValue("DeleteMixResponse.Result.Name"));
		result.setGmtCreate(_ctx.stringValue("DeleteMixResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("DeleteMixResponse.Result.GmtModified"));

		Parameter parameter = new Parameter();

		List<SettingsItem> settings = new ArrayList<SettingsItem>();
		for (int i = 0; i < _ctx.lengthValue("DeleteMixResponse.Result.Parameter.Settings.Length"); i++) {
			SettingsItem settingsItem = new SettingsItem();
			settingsItem.setName(_ctx.stringValue("DeleteMixResponse.Result.Parameter.Settings["+ i +"].Name"));
			settingsItem.setValue(_ctx.stringValue("DeleteMixResponse.Result.Parameter.Settings["+ i +"].Value"));

			settings.add(settingsItem);
		}
		parameter.setSettings(settings);
		result.setParameter(parameter);
		deleteMixResponse.setResult(result);
	 
	 	return deleteMixResponse;
	}
}