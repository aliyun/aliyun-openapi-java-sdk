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

import com.aliyuncs.mse.model.v20190531.ListAnsServicesResponse;
import com.aliyuncs.mse.model.v20190531.ListAnsServicesResponse.SimpleNacosAnsService;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAnsServicesResponseUnmarshaller {

	public static ListAnsServicesResponse unmarshall(ListAnsServicesResponse listAnsServicesResponse, UnmarshallerContext _ctx) {
		
		listAnsServicesResponse.setRequestId(_ctx.stringValue("ListAnsServicesResponse.RequestId"));
		listAnsServicesResponse.setSuccess(_ctx.booleanValue("ListAnsServicesResponse.Success"));
		listAnsServicesResponse.setMessage(_ctx.stringValue("ListAnsServicesResponse.Message"));
		listAnsServicesResponse.setErrorCode(_ctx.stringValue("ListAnsServicesResponse.ErrorCode"));
		listAnsServicesResponse.setPageNumber(_ctx.integerValue("ListAnsServicesResponse.PageNumber"));
		listAnsServicesResponse.setPageSize(_ctx.integerValue("ListAnsServicesResponse.PageSize"));
		listAnsServicesResponse.setTotalCount(_ctx.integerValue("ListAnsServicesResponse.TotalCount"));
		listAnsServicesResponse.setHttpCode(_ctx.stringValue("ListAnsServicesResponse.HttpCode"));

		List<SimpleNacosAnsService> data = new ArrayList<SimpleNacosAnsService>();
		for (int i = 0; i < _ctx.lengthValue("ListAnsServicesResponse.Data.Length"); i++) {
			SimpleNacosAnsService simpleNacosAnsService = new SimpleNacosAnsService();
			simpleNacosAnsService.setName(_ctx.stringValue("ListAnsServicesResponse.Data["+ i +"].Name"));
			simpleNacosAnsService.setGroupName(_ctx.stringValue("ListAnsServicesResponse.Data["+ i +"].GroupName"));
			simpleNacosAnsService.setClusterCount(_ctx.integerValue("ListAnsServicesResponse.Data["+ i +"].ClusterCount"));
			simpleNacosAnsService.setIpCount(_ctx.integerValue("ListAnsServicesResponse.Data["+ i +"].IpCount"));
			simpleNacosAnsService.setHealthyInstanceCount(_ctx.integerValue("ListAnsServicesResponse.Data["+ i +"].HealthyInstanceCount"));

			data.add(simpleNacosAnsService);
		}
		listAnsServicesResponse.setData(data);
	 
	 	return listAnsServicesResponse;
	}
}