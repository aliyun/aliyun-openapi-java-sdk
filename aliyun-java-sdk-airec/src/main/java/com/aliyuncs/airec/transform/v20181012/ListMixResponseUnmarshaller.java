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

import com.aliyuncs.airec.model.v20181012.ListMixResponse;
import com.aliyuncs.airec.model.v20181012.ListMixResponse.ResultItem;
import com.aliyuncs.airec.model.v20181012.ListMixResponse.ResultItem.Parameter;
import com.aliyuncs.airec.model.v20181012.ListMixResponse.ResultItem.Parameter.SettingsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMixResponseUnmarshaller {

	public static ListMixResponse unmarshall(ListMixResponse listMixResponse, UnmarshallerContext context) {
		
		listMixResponse.setRequestId(context.stringValue("ListMixResponse.RequestId"));
		listMixResponse.setCode(context.stringValue("ListMixResponse.Code"));
		listMixResponse.setMessage(context.stringValue("ListMixResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("ListMixResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setName(context.stringValue("ListMixResponse.Result["+ i +"].Name"));
			resultItem.setGmtCreate(context.stringValue("ListMixResponse.Result["+ i +"].GmtCreate"));
			resultItem.setGmtModified(context.stringValue("ListMixResponse.Result["+ i +"].GmtModified"));

			Parameter parameter = new Parameter();

			List<SettingsItem> settings = new ArrayList<SettingsItem>();
			for (int j = 0; j < context.lengthValue("ListMixResponse.Result["+ i +"].Parameter.Settings.Length"); j++) {
				SettingsItem settingsItem = new SettingsItem();
				settingsItem.setName(context.stringValue("ListMixResponse.Result["+ i +"].Parameter.Settings["+ j +"].Name"));
				settingsItem.setValue(context.integerValue("ListMixResponse.Result["+ i +"].Parameter.Settings["+ j +"].Value"));

				settings.add(settingsItem);
			}
			parameter.setSettings(settings);
			resultItem.setParameter(parameter);

			result.add(resultItem);
		}
		listMixResponse.setResult(result);
	 
	 	return listMixResponse;
	}
}