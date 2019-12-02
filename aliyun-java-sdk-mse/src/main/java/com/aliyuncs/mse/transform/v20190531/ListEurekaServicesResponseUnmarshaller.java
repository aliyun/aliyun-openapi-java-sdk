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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListEurekaServicesResponse;
import com.aliyuncs.mse.model.v20190531.ListEurekaServicesResponse.SimpleService;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEurekaServicesResponseUnmarshaller {

	public static ListEurekaServicesResponse unmarshall(ListEurekaServicesResponse listEurekaServicesResponse, UnmarshallerContext _ctx) {
		
		listEurekaServicesResponse.setRequestId(_ctx.stringValue("ListEurekaServicesResponse.RequestId"));
		listEurekaServicesResponse.setSuccess(_ctx.booleanValue("ListEurekaServicesResponse.Success"));
		listEurekaServicesResponse.setMessage(_ctx.stringValue("ListEurekaServicesResponse.Message"));
		listEurekaServicesResponse.setErrorCode(_ctx.stringValue("ListEurekaServicesResponse.ErrorCode"));
		listEurekaServicesResponse.setPageNumber(_ctx.integerValue("ListEurekaServicesResponse.PageNumber"));
		listEurekaServicesResponse.setPageSize(_ctx.integerValue("ListEurekaServicesResponse.PageSize"));
		listEurekaServicesResponse.setTotalCount(_ctx.integerValue("ListEurekaServicesResponse.TotalCount"));
		listEurekaServicesResponse.setHttpCode(_ctx.stringValue("ListEurekaServicesResponse.HttpCode"));

		List<SimpleService> data = new ArrayList<SimpleService>();
		for (int i = 0; i < _ctx.lengthValue("ListEurekaServicesResponse.Data.Length"); i++) {
			SimpleService simpleService = new SimpleService();
			simpleService.setName(_ctx.stringValue("ListEurekaServicesResponse.Data["+ i +"].Name"));
			simpleService.setUpStatus(_ctx.stringValue("ListEurekaServicesResponse.Data["+ i +"].UpStatus"));

			List<String> instancesId = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEurekaServicesResponse.Data["+ i +"].InstancesId.Length"); j++) {
				instancesId.add(_ctx.stringValue("ListEurekaServicesResponse.Data["+ i +"].InstancesId["+ j +"]"));
			}
			simpleService.setInstancesId(instancesId);

			data.add(simpleService);
		}
		listEurekaServicesResponse.setData(data);
	 
	 	return listEurekaServicesResponse;
	}
}