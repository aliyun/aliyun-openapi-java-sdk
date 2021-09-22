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

package com.aliyuncs.computenest.transform.v20210601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenest.model.v20210601.GetServiceInstanceResponse;
import com.aliyuncs.computenest.model.v20210601.GetServiceInstanceResponse.Service;
import com.aliyuncs.computenest.model.v20210601.GetServiceInstanceResponse.Service.ServiceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceInstanceResponseUnmarshaller {

	public static GetServiceInstanceResponse unmarshall(GetServiceInstanceResponse getServiceInstanceResponse, UnmarshallerContext _ctx) {
		
		getServiceInstanceResponse.setRequestId(_ctx.stringValue("GetServiceInstanceResponse.RequestId"));
		getServiceInstanceResponse.setOutputs(_ctx.stringValue("GetServiceInstanceResponse.Outputs"));
		getServiceInstanceResponse.setStatus(_ctx.stringValue("GetServiceInstanceResponse.Status"));
		getServiceInstanceResponse.setTemplateName(_ctx.stringValue("GetServiceInstanceResponse.TemplateName"));
		getServiceInstanceResponse.setUpdateTime(_ctx.stringValue("GetServiceInstanceResponse.UpdateTime"));
		getServiceInstanceResponse.setProgress(_ctx.longValue("GetServiceInstanceResponse.Progress"));
		getServiceInstanceResponse.setParameters(_ctx.stringValue("GetServiceInstanceResponse.Parameters"));
		getServiceInstanceResponse.setServiceInstanceId(_ctx.stringValue("GetServiceInstanceResponse.ServiceInstanceId"));
		getServiceInstanceResponse.setCreateTime(_ctx.stringValue("GetServiceInstanceResponse.CreateTime"));
		getServiceInstanceResponse.setStatusDetail(_ctx.stringValue("GetServiceInstanceResponse.StatusDetail"));
		getServiceInstanceResponse.setResources(_ctx.stringValue("GetServiceInstanceResponse.Resources"));
		getServiceInstanceResponse.setOperationStartTime(_ctx.stringValue("GetServiceInstanceResponse.OperationStartTime"));
		getServiceInstanceResponse.setOperationEndTime(_ctx.stringValue("GetServiceInstanceResponse.OperationEndTime"));
		getServiceInstanceResponse.setOperatedServiceInstanceId(_ctx.stringValue("GetServiceInstanceResponse.OperatedServiceInstanceId"));
		getServiceInstanceResponse.setEnableInstanceOps(_ctx.booleanValue("GetServiceInstanceResponse.EnableInstanceOps"));
		getServiceInstanceResponse.setIsOperated(_ctx.booleanValue("GetServiceInstanceResponse.IsOperated"));

		Service service = new Service();
		service.setStatus(_ctx.stringValue("GetServiceInstanceResponse.Service.Status"));
		service.setPublishTime(_ctx.stringValue("GetServiceInstanceResponse.Service.PublishTime"));
		service.setVersion(_ctx.stringValue("GetServiceInstanceResponse.Service.Version"));
		service.setDeployMetadata(_ctx.stringValue("GetServiceInstanceResponse.Service.DeployMetadata"));
		service.setDeployType(_ctx.stringValue("GetServiceInstanceResponse.Service.DeployType"));
		service.setServiceId(_ctx.stringValue("GetServiceInstanceResponse.Service.ServiceId"));
		service.setSupplierUrl(_ctx.stringValue("GetServiceInstanceResponse.Service.SupplierUrl"));
		service.setServiceType(_ctx.stringValue("GetServiceInstanceResponse.Service.ServiceType"));
		service.setSupplierName(_ctx.stringValue("GetServiceInstanceResponse.Service.SupplierName"));

		List<ServiceInfo> serviceInfos = new ArrayList<ServiceInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceInstanceResponse.Service.ServiceInfos.Length"); i++) {
			ServiceInfo serviceInfo = new ServiceInfo();
			serviceInfo.setLocale(_ctx.stringValue("GetServiceInstanceResponse.Service.ServiceInfos["+ i +"].Locale"));
			serviceInfo.setImage(_ctx.stringValue("GetServiceInstanceResponse.Service.ServiceInfos["+ i +"].Image"));
			serviceInfo.setName(_ctx.stringValue("GetServiceInstanceResponse.Service.ServiceInfos["+ i +"].Name"));
			serviceInfo.setShortDescription(_ctx.stringValue("GetServiceInstanceResponse.Service.ServiceInfos["+ i +"].ShortDescription"));

			serviceInfos.add(serviceInfo);
		}
		service.setServiceInfos(serviceInfos);
		getServiceInstanceResponse.setService(service);
	 
	 	return getServiceInstanceResponse;
	}
}