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

package com.aliyuncs.dt_oc_info.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20200401.GetFoodDrugAdministrationThreeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFoodDrugAdministrationThreeResponseUnmarshaller {

	public static GetFoodDrugAdministrationThreeResponse unmarshall(GetFoodDrugAdministrationThreeResponse getFoodDrugAdministrationThreeResponse, UnmarshallerContext _ctx) {
		
		getFoodDrugAdministrationThreeResponse.setRequestId(_ctx.stringValue("GetFoodDrugAdministrationThreeResponse.RequestId"));
		getFoodDrugAdministrationThreeResponse.setCode(_ctx.integerValue("GetFoodDrugAdministrationThreeResponse.Code"));
		getFoodDrugAdministrationThreeResponse.setMessage(_ctx.stringValue("GetFoodDrugAdministrationThreeResponse.Message"));
		getFoodDrugAdministrationThreeResponse.setTotal(_ctx.integerValue("GetFoodDrugAdministrationThreeResponse.Total"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetFoodDrugAdministrationThreeResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetFoodDrugAdministrationThreeResponse.Data["+ i +"]"));
		}
		getFoodDrugAdministrationThreeResponse.setData(data);
	 
	 	return getFoodDrugAdministrationThreeResponse;
	}
}