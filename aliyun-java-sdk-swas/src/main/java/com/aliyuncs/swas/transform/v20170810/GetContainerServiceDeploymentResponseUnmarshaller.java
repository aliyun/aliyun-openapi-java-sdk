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

import com.aliyuncs.swas.model.v20170810.GetContainerServiceDeploymentResponse;
import com.aliyuncs.swas.model.v20170810.GetContainerServiceDeploymentResponse.Container;
import com.aliyuncs.swas.model.v20170810.GetContainerServiceDeploymentResponse.Pod;
import com.aliyuncs.swas.model.v20170810.GetContainerServiceDeploymentResponse.Pod.ContainerState;
import com.aliyuncs.swas.model.v20170810.GetContainerServiceDeploymentResponse.PublicEndpoint;
import com.aliyuncs.swas.model.v20170810.GetContainerServiceDeploymentResponse.PublicEndpoint.HealthCheck;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContainerServiceDeploymentResponseUnmarshaller {

	public static GetContainerServiceDeploymentResponse unmarshall(GetContainerServiceDeploymentResponse getContainerServiceDeploymentResponse, UnmarshallerContext _ctx) {
		
		getContainerServiceDeploymentResponse.setRequestId(_ctx.stringValue("GetContainerServiceDeploymentResponse.RequestId"));
		getContainerServiceDeploymentResponse.setIsSuccess(_ctx.booleanValue("GetContainerServiceDeploymentResponse.IsSuccess"));
		getContainerServiceDeploymentResponse.setCode(_ctx.stringValue("GetContainerServiceDeploymentResponse.Code"));
		getContainerServiceDeploymentResponse.setMessage(_ctx.stringValue("GetContainerServiceDeploymentResponse.Message"));
		getContainerServiceDeploymentResponse.setDeploymentStatus(_ctx.stringValue("GetContainerServiceDeploymentResponse.DeploymentStatus"));
		getContainerServiceDeploymentResponse.setDeploymentName(_ctx.stringValue("GetContainerServiceDeploymentResponse.DeploymentName"));
		getContainerServiceDeploymentResponse.setRegistryCacheName(_ctx.stringValue("GetContainerServiceDeploymentResponse.RegistryCacheName"));

		PublicEndpoint publicEndpoint = new PublicEndpoint();
		publicEndpoint.setContainerName(_ctx.stringValue("GetContainerServiceDeploymentResponse.PublicEndpoint.ContainerName"));
		publicEndpoint.setContainerPort(_ctx.stringValue("GetContainerServiceDeploymentResponse.PublicEndpoint.ContainerPort"));

		HealthCheck healthCheck = new HealthCheck();
		healthCheck.setFallCount(_ctx.integerValue("GetContainerServiceDeploymentResponse.PublicEndpoint.HealthCheck.FallCount"));
		healthCheck.setRiseCount(_ctx.integerValue("GetContainerServiceDeploymentResponse.PublicEndpoint.HealthCheck.RiseCount"));
		healthCheck.setInterval(_ctx.integerValue("GetContainerServiceDeploymentResponse.PublicEndpoint.HealthCheck.Interval"));
		healthCheck.setPath(_ctx.stringValue("GetContainerServiceDeploymentResponse.PublicEndpoint.HealthCheck.Path"));
		healthCheck.setTimeout(_ctx.integerValue("GetContainerServiceDeploymentResponse.PublicEndpoint.HealthCheck.Timeout"));
		healthCheck.setSuccessCodes(_ctx.stringValue("GetContainerServiceDeploymentResponse.PublicEndpoint.HealthCheck.SuccessCodes"));
		publicEndpoint.setHealthCheck(healthCheck);
		getContainerServiceDeploymentResponse.setPublicEndpoint(publicEndpoint);

		List<Container> containers = new ArrayList<Container>();
		for (int i = 0; i < _ctx.lengthValue("GetContainerServiceDeploymentResponse.Containers.Length"); i++) {
			Container container = new Container();
			container.setContainerName(_ctx.stringValue("GetContainerServiceDeploymentResponse.Containers["+ i +"].ContainerName"));
			container.setCommand(_ctx.stringValue("GetContainerServiceDeploymentResponse.Containers["+ i +"].Command"));
			container.setEnvironment(_ctx.stringValue("GetContainerServiceDeploymentResponse.Containers["+ i +"].Environment"));
			container.setImage(_ctx.stringValue("GetContainerServiceDeploymentResponse.Containers["+ i +"].Image"));
			container.setPorts(_ctx.stringValue("GetContainerServiceDeploymentResponse.Containers["+ i +"].Ports"));

			containers.add(container);
		}
		getContainerServiceDeploymentResponse.setContainers(containers);

		List<Pod> pods = new ArrayList<Pod>();
		for (int i = 0; i < _ctx.lengthValue("GetContainerServiceDeploymentResponse.Pods.Length"); i++) {
			Pod pod = new Pod();
			pod.setPodName(_ctx.stringValue("GetContainerServiceDeploymentResponse.Pods["+ i +"].PodName"));
			pod.setPodStatus(_ctx.stringValue("GetContainerServiceDeploymentResponse.Pods["+ i +"].PodStatus"));

			List<ContainerState> containerStates = new ArrayList<ContainerState>();
			for (int j = 0; j < _ctx.lengthValue("GetContainerServiceDeploymentResponse.Pods["+ i +"].ContainerStates.Length"); j++) {
				ContainerState containerState = new ContainerState();
				containerState.setContainerName(_ctx.stringValue("GetContainerServiceDeploymentResponse.Pods["+ i +"].ContainerStates["+ j +"].ContainerName"));
				containerState.setContainerStatus(_ctx.stringValue("GetContainerServiceDeploymentResponse.Pods["+ i +"].ContainerStates["+ j +"].ContainerStatus"));
				containerState.setMessage(_ctx.stringValue("GetContainerServiceDeploymentResponse.Pods["+ i +"].ContainerStates["+ j +"].Message"));

				containerStates.add(containerState);
			}
			pod.setContainerStates(containerStates);

			pods.add(pod);
		}
		getContainerServiceDeploymentResponse.setPods(pods);
	 
	 	return getContainerServiceDeploymentResponse;
	}
}