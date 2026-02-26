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

import com.aliyuncs.bpstudio.model.v20210931.GetApplicationVariables4FailResponse;
import com.aliyuncs.bpstudio.model.v20210931.GetApplicationVariables4FailResponse.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationVariables4FailResponseUnmarshaller {

	public static GetApplicationVariables4FailResponse unmarshall(GetApplicationVariables4FailResponse getApplicationVariables4FailResponse, UnmarshallerContext _ctx) {
		
		getApplicationVariables4FailResponse.setRequestId(_ctx.stringValue("GetApplicationVariables4FailResponse.RequestId"));
		getApplicationVariables4FailResponse.setMessage(_ctx.stringValue("GetApplicationVariables4FailResponse.Message"));
		getApplicationVariables4FailResponse.setCode(_ctx.integerValue("GetApplicationVariables4FailResponse.Code"));

		List<Items> data = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationVariables4FailResponse.Data.Length"); i++) {
			Items items = new Items();
			items.setRegion(_ctx.stringValue("GetApplicationVariables4FailResponse.Data["+ i +"].Region"));
			items.setAttribute(_ctx.stringValue("GetApplicationVariables4FailResponse.Data["+ i +"].Attribute"));
			items.setVariable(_ctx.stringValue("GetApplicationVariables4FailResponse.Data["+ i +"].Variable"));
			items.setPlaceHolder(_ctx.stringValue("GetApplicationVariables4FailResponse.Data["+ i +"].PlaceHolder"));
			items.setValue(_ctx.stringValue("GetApplicationVariables4FailResponse.Data["+ i +"].Value"));
			items.setDefaultValue(_ctx.stringValue("GetApplicationVariables4FailResponse.Data["+ i +"].DefaultValue"));

			data.add(items);
		}
		getApplicationVariables4FailResponse.setData(data);
	 
	 	return getApplicationVariables4FailResponse;
	}
}