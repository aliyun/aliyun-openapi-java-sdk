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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMixResponseUnmarshaller {

	public static DeleteMixResponse unmarshall(DeleteMixResponse deleteMixResponse, UnmarshallerContext context) {
		
		deleteMixResponse.setRequestId(context.stringValue("DeleteMixResponse.RequestId"));
		deleteMixResponse.setCode(context.stringValue("DeleteMixResponse.Code"));
		deleteMixResponse.setMessage(context.stringValue("DeleteMixResponse.Message"));

		Result result = new Result();
		result.setName(context.stringValue("DeleteMixResponse.Result.Name"));
		result.setGmtCreate(context.stringValue("DeleteMixResponse.Result.GmtCreate"));
		result.setGmtModified(context.stringValue("DeleteMixResponse.Result.GmtModified"));

		Parameter parameter = new Parameter();

		List<SettingsItem> settings = new ArrayList<SettingsItem>();
		for (int i = 0; i < context.lengthValue("DeleteMixResponse.Result.Parameter.Settings.Length"); i++) {
			SettingsItem settingsItem = new SettingsItem();
			settingsItem.setName(context.stringValue("DeleteMixResponse.Result.Parameter.Settings["+ i +"].Name"));
			settingsItem.setValue(context.stringValue("DeleteMixResponse.Result.Parameter.Settings["+ i +"].Value"));

			settings.add(settingsItem);
		}
		parameter.setSettings(settings);
		result.setParameter(parameter);
		deleteMixResponse.setResult(result);
	 
	 	return deleteMixResponse;
	}
}