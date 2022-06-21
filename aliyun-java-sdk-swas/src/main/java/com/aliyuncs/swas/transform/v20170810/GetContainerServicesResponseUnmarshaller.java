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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetContainerServicesResponse;
import com.aliyuncs.swas.model.v20170810.GetContainerServicesResponse.ContainerService;
import com.aliyuncs.swas.model.v20170810.GetContainerServicesResponse.ContainerService.Deployment;
import com.aliyuncs.swas.model.v20170810.GetContainerServicesResponse.ContainerService.Deployment.Container;
import com.aliyuncs.swas.model.v20170810.GetContainerServicesResponse.ContainerService.Deployment.Pod;
import com.aliyuncs.swas.model.v20170810.GetContainerServicesResponse.ContainerService.Deployment.Pod.ContainerState;
import com.aliyuncs.swas.model.v20170810.GetContainerServicesResponse.ContainerService.Deployment.PublicEndpoint;
import com.aliyuncs.swas.model.v20170810.GetContainerServicesResponse.ContainerService.Deployment.PublicEndpoint.HealthCheck;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContainerServicesResponseUnmarshaller {

	public static GetContainerServicesResponse unmarshall(GetContainerServicesResponse getContainerServicesResponse, UnmarshallerContext _ctx) {
		
		getContainerServicesResponse.setRequestId(_ctx.stringValue("GetContainerServicesResponse.RequestId"));
		getContainerServicesResponse.setIsSuccess(_ctx.booleanValue("GetContainerServicesResponse.IsSuccess"));
		getContainerServicesResponse.setPageSize(_ctx.integerValue("GetContainerServicesResponse.PageSize"));
		getContainerServicesResponse.setPageNumber(_ctx.integerValue("GetContainerServicesResponse.PageNumber"));
		getContainerServicesResponse.setTotalCount(_ctx.integerValue("GetContainerServicesResponse.TotalCount"));
		getContainerServicesResponse.setCode(_ctx.stringValue("GetContainerServicesResponse.Code"));

		List<ContainerService> containerServices = new ArrayList<ContainerService>();
		for (int i = 0; i < _ctx.lengthValue("GetContainerServicesResponse.ContainerServices.Length"); i++) {
			ContainerService containerService = new ContainerService();
			containerService.setRegionId(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].RegionId"));
			containerService.setContainerServiceId(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].ContainerServiceId"));
			containerService.setContainerServiceName(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].ContainerServiceName"));
			containerService.setScale(_ctx.integerValue("GetContainerServicesResponse.ContainerServices["+ i +"].Scale"));
			containerService.setContainerServiceEdition(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].ContainerServiceEdition"));
			containerService.setPrivateDomainName(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].PrivateDomainName"));
			containerService.setDomains(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Domains"));
			containerService.setDNSName(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].DNSName"));
			containerService.setStorage(_ctx.integerValue("GetContainerServicesResponse.ContainerServices["+ i +"].Storage"));
			containerService.setStorageType(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].StorageType"));
			containerService.setContainerServiceStatus(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].ContainerServiceStatus"));
			containerService.setBussinessStatus(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].BussinessStatus"));
			containerService.setExpiredTime(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].ExpiredTime"));
			containerService.setCreationTime(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].CreationTime"));
			containerService.setChargeType(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].ChargeType"));
			containerService.setCpu(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Cpu"));
			containerService.setMemory(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Memory"));
			containerService.setBandwidth(_ctx.integerValue("GetContainerServicesResponse.ContainerServices["+ i +"].Bandwidth"));

			Deployment deployment = new Deployment();
			deployment.setDeploymentName(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.DeploymentName"));
			deployment.setDeploymentStatus(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.DeploymentStatus"));

			PublicEndpoint publicEndpoint = new PublicEndpoint();
			publicEndpoint.setContainerName(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.PublicEndpoint.ContainerName"));
			publicEndpoint.setContainerPort(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.PublicEndpoint.ContainerPort"));

			HealthCheck healthCheck = new HealthCheck();
			healthCheck.setFallCount(_ctx.integerValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.PublicEndpoint.HealthCheck.FallCount"));
			healthCheck.setRiseCount(_ctx.integerValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.PublicEndpoint.HealthCheck.RiseCount"));
			healthCheck.setInterval(_ctx.integerValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.PublicEndpoint.HealthCheck.Interval"));
			healthCheck.setPath(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.PublicEndpoint.HealthCheck.Path"));
			healthCheck.setTimeout(_ctx.integerValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.PublicEndpoint.HealthCheck.Timeout"));
			healthCheck.setSuccessCodes(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.PublicEndpoint.HealthCheck.SuccessCodes"));
			publicEndpoint.setHealthCheck(healthCheck);
			deployment.setPublicEndpoint(publicEndpoint);

			List<Container> containers = new ArrayList<Container>();
			for (int j = 0; j < _ctx.lengthValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.Containers.Length"); j++) {
				Container container = new Container();
				container.setContainerName(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.Containers["+ j +"].ContainerName"));
				container.setCommand(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.Containers["+ j +"].Command"));
				container.setEnvironment(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.Containers["+ j +"].Environment"));
				container.setImage(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.Containers["+ j +"].Image"));
				container.setPorts(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.Containers["+ j +"].Ports"));

				containers.add(container);
			}
			deployment.setContainers(containers);

			List<Pod> pods = new ArrayList<Pod>();
			for (int j = 0; j < _ctx.lengthValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.Pods.Length"); j++) {
				Pod pod = new Pod();
				pod.setPodName(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.Pods["+ j +"].PodName"));
				pod.setPodStatus(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.Pods["+ j +"].PodStatus"));

				List<ContainerState> containerStates = new ArrayList<ContainerState>();
				for (int k = 0; k < _ctx.lengthValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.Pods["+ j +"].ContainerStates.Length"); k++) {
					ContainerState containerState = new ContainerState();
					containerState.setContainerName(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.Pods["+ j +"].ContainerStates["+ k +"].ContainerName"));
					containerState.setContainerStatus(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.Pods["+ j +"].ContainerStates["+ k +"].ContainerStatus"));
					containerState.setMessage(_ctx.stringValue("GetContainerServicesResponse.ContainerServices["+ i +"].Deployment.Pods["+ j +"].ContainerStates["+ k +"].Message"));

					containerStates.add(containerState);
				}
				pod.setContainerStates(containerStates);

				pods.add(pod);
			}
			deployment.setPods(pods);
			containerService.setDeployment(deployment);

			containerServices.add(containerService);
		}
		getContainerServicesResponse.setContainerServices(containerServices);
	 
	 	return getContainerServicesResponse;
	}
}