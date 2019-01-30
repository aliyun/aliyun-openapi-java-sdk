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

package com.aliyuncs.arms.transform.v20181219;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20181219.GetServicesResponse;
import com.aliyuncs.arms.model.v20181219.GetServicesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServicesResponseUnmarshaller {

	public static GetServicesResponse unmarshall(GetServicesResponse getServicesResponse, UnmarshallerContext context) {
		
		getServicesResponse.setRequestId(context.stringValue("GetServicesResponse.RequestId"));

		Data data = new Data();

		List<String> services = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetServicesResponse.Data.Services.Length"); i++) {
			services.add(context.stringValue("GetServicesResponse.Data.Services["+ i +"]"));
		}
		data.setServices(services);
		getServicesResponse.setData(data);
	 
	 	return getServicesResponse;
	}
}