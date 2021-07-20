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

package com.aliyuncs.iotcc.transform.v20210513;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotcc.model.v20210513.ListServiceResponse;
import com.aliyuncs.iotcc.model.v20210513.ListServiceResponse.ServiceModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceResponseUnmarshaller {

	public static ListServiceResponse unmarshall(ListServiceResponse listServiceResponse, UnmarshallerContext _ctx) {
		
		listServiceResponse.setRequestId(_ctx.stringValue("ListServiceResponse.RequestId"));
		listServiceResponse.setTotalCount(_ctx.integerValue("ListServiceResponse.TotalCount"));
		listServiceResponse.setNextToken(_ctx.stringValue("ListServiceResponse.NextToken"));
		listServiceResponse.setMaxResults(_ctx.integerValue("ListServiceResponse.MaxResults"));

		List<ServiceModel> services = new ArrayList<ServiceModel>();
		for (int i = 0; i < _ctx.lengthValue("ListServiceResponse.Services.Length"); i++) {
			ServiceModel serviceModel = new ServiceModel();
			serviceModel.setIoTCloudConnectorId(_ctx.stringValue("ListServiceResponse.Services["+ i +"].IoTCloudConnectorId"));
			serviceModel.setServiceId(_ctx.stringValue("ListServiceResponse.Services["+ i +"].ServiceId"));
			serviceModel.setServiceStatus(_ctx.stringValue("ListServiceResponse.Services["+ i +"].ServiceStatus"));
			serviceModel.setServiceName(_ctx.stringValue("ListServiceResponse.Services["+ i +"].ServiceName"));
			serviceModel.setServiceDescription(_ctx.stringValue("ListServiceResponse.Services["+ i +"].ServiceDescription"));

			services.add(serviceModel);
		}
		listServiceResponse.setServices(services);
	 
	 	return listServiceResponse;
	}
}