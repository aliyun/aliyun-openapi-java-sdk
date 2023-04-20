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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.ListServiceInstancesResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.ListServiceInstancesResponse.ServiceInstance;
import com.aliyuncs.computenestsupplier.model.v20210521.ListServiceInstancesResponse.ServiceInstance.Service;
import com.aliyuncs.computenestsupplier.model.v20210521.ListServiceInstancesResponse.ServiceInstance.Service.ServiceInfo;
import com.aliyuncs.computenestsupplier.model.v20210521.ListServiceInstancesResponse.ServiceInstance.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceInstancesResponseUnmarshaller {

	public static ListServiceInstancesResponse unmarshall(ListServiceInstancesResponse listServiceInstancesResponse, UnmarshallerContext _ctx) {
		
		listServiceInstancesResponse.setRequestId(_ctx.stringValue("ListServiceInstancesResponse.RequestId"));
		listServiceInstancesResponse.setNextToken(_ctx.stringValue("ListServiceInstancesResponse.NextToken"));
		listServiceInstancesResponse.setTotalCount(_ctx.integerValue("ListServiceInstancesResponse.TotalCount"));
		listServiceInstancesResponse.setMaxResults(_ctx.stringValue("ListServiceInstancesResponse.MaxResults"));

		List<ServiceInstance> serviceInstances = new ArrayList<ServiceInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListServiceInstancesResponse.ServiceInstances.Length"); i++) {
			ServiceInstance serviceInstance = new ServiceInstance();
			serviceInstance.setStatus(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Status"));
			serviceInstance.setUpdateTime(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].UpdateTime"));
			serviceInstance.setName(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Name"));
			serviceInstance.setServiceInstanceId(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].ServiceInstanceId"));
			serviceInstance.setCreateTime(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].CreateTime"));
			serviceInstance.setUserId(_ctx.longValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].UserId"));
			serviceInstance.setParameters(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Parameters"));
			serviceInstance.setProgress(_ctx.longValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Progress"));
			serviceInstance.setStatusDetail(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].StatusDetail"));
			serviceInstance.setTemplateName(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].TemplateName"));
			serviceInstance.setOperatedServiceInstanceId(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].OperatedServiceInstanceId"));
			serviceInstance.setOperationStartTime(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].OperationStartTime"));
			serviceInstance.setOperationEndTime(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].OperationEndTime"));
			serviceInstance.setEnableInstanceOps(_ctx.booleanValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].EnableInstanceOps"));
			serviceInstance.setSource(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Source"));
			serviceInstance.setEndTime(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].EndTime"));
			serviceInstance.setServiceType(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].ServiceType"));
			serviceInstance.setPayType(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].PayType"));
			serviceInstance.setIsOperated(_ctx.booleanValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].IsOperated"));

			Service service = new Service();
			service.setStatus(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Service.Status"));
			service.setPublishTime(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Service.PublishTime"));
			service.setVersion(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Service.Version"));
			service.setDeployType(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Service.DeployType"));
			service.setServiceId(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Service.ServiceId"));
			service.setSupplierUrl(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Service.SupplierUrl"));
			service.setServiceType(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Service.ServiceType"));
			service.setSupplierName(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Service.SupplierName"));
			service.setVersionName(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Service.VersionName"));
			service.setDeployMetadata(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Service.DeployMetadata"));
			service.setEnablePrivateVpcConnection(_ctx.booleanValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Service.EnablePrivateVpcConnection"));

			List<ServiceInfo> serviceInfos = new ArrayList<ServiceInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Service.ServiceInfos.Length"); j++) {
				ServiceInfo serviceInfo = new ServiceInfo();
				serviceInfo.setLocale(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Service.ServiceInfos["+ j +"].Locale"));
				serviceInfo.setImage(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Service.ServiceInfos["+ j +"].Image"));
				serviceInfo.setName(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Service.ServiceInfos["+ j +"].Name"));
				serviceInfo.setShortDescription(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Service.ServiceInfos["+ j +"].ShortDescription"));

				serviceInfos.add(serviceInfo);
			}
			service.setServiceInfos(serviceInfos);
			serviceInstance.setService(service);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListServiceInstancesResponse.ServiceInstances["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			serviceInstance.setTags(tags);

			serviceInstances.add(serviceInstance);
		}
		listServiceInstancesResponse.setServiceInstances(serviceInstances);
	 
	 	return listServiceInstancesResponse;
	}
}