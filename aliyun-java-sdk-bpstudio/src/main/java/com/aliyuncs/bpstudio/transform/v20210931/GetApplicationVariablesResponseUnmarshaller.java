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

package com.aliyuncs.bpstudio.transform.v20210931;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bpstudio.model.v20210931.GetApplicationVariablesResponse;
import com.aliyuncs.bpstudio.model.v20210931.GetApplicationVariablesResponse.Items;
import com.aliyuncs.bpstudio.model.v20210931.GetApplicationVariablesResponse.Items.Variables;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationVariablesResponseUnmarshaller {

	public static GetApplicationVariablesResponse unmarshall(GetApplicationVariablesResponse getApplicationVariablesResponse, UnmarshallerContext _ctx) {
		
		getApplicationVariablesResponse.setRequestId(_ctx.stringValue("GetApplicationVariablesResponse.RequestId"));
		getApplicationVariablesResponse.setMessage(_ctx.stringValue("GetApplicationVariablesResponse.Message"));
		getApplicationVariablesResponse.setCode(_ctx.integerValue("GetApplicationVariablesResponse.Code"));

		List<Items> data = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationVariablesResponse.Data.Length"); i++) {
			Items items = new Items();
			items.setInstanceId(_ctx.stringValue("GetApplicationVariablesResponse.Data["+ i +"].InstanceId"));

			List<Variables> variableList = new ArrayList<Variables>();
			for (int j = 0; j < _ctx.lengthValue("GetApplicationVariablesResponse.Data["+ i +"].VariableList.Length"); j++) {
				Variables variables = new Variables();
				variables.setVariable(_ctx.stringValue("GetApplicationVariablesResponse.Data["+ i +"].VariableList["+ j +"].Variable"));
				variables.setValue(_ctx.stringValue("GetApplicationVariablesResponse.Data["+ i +"].VariableList["+ j +"].Value"));

				variableList.add(variables);
			}
			items.setVariableList(variableList);

			data.add(items);
		}
		getApplicationVariablesResponse.setData(data);
	 
	 	return getApplicationVariablesResponse;
	}
}