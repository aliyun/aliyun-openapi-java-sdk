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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeServcieScheduleResponse;
import com.aliyuncs.ens.model.v20171110.DescribeServcieScheduleResponse.PodAbstractInfo;
import com.aliyuncs.ens.model.v20171110.DescribeServcieScheduleResponse.PodAbstractInfo.ContainerStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServcieScheduleResponseUnmarshaller {

	public static DescribeServcieScheduleResponse unmarshall(DescribeServcieScheduleResponse describeServcieScheduleResponse, UnmarshallerContext _ctx) {
		
		describeServcieScheduleResponse.setRequestId(_ctx.stringValue("DescribeServcieScheduleResponse.RequestId"));
		describeServcieScheduleResponse.setIndex(_ctx.integerValue("DescribeServcieScheduleResponse.Index"));
		describeServcieScheduleResponse.setInstanceId(_ctx.stringValue("DescribeServcieScheduleResponse.InstanceId"));
		describeServcieScheduleResponse.setInstanceIp(_ctx.stringValue("DescribeServcieScheduleResponse.InstanceIp"));
		describeServcieScheduleResponse.setInstancePort(_ctx.integerValue("DescribeServcieScheduleResponse.InstancePort"));
		describeServcieScheduleResponse.setRequestRepeated(_ctx.booleanValue("DescribeServcieScheduleResponse.RequestRepeated"));
		describeServcieScheduleResponse.setTcpPorts(_ctx.stringValue("DescribeServcieScheduleResponse.TcpPorts"));

		PodAbstractInfo podAbstractInfo = new PodAbstractInfo();
		podAbstractInfo.setContainerService(_ctx.booleanValue("DescribeServcieScheduleResponse.PodAbstractInfo.ContainerService"));
		podAbstractInfo.setName(_ctx.booleanValue("DescribeServcieScheduleResponse.PodAbstractInfo.Name"));
		podAbstractInfo.setNamespace(_ctx.booleanValue("DescribeServcieScheduleResponse.PodAbstractInfo.Namespace"));
		podAbstractInfo.setResourceScope(_ctx.booleanValue("DescribeServcieScheduleResponse.PodAbstractInfo.ResourceScope"));
		podAbstractInfo.setStatus(_ctx.booleanValue("DescribeServcieScheduleResponse.PodAbstractInfo.Status"));

		List<ContainerStatus> containerStatuses = new ArrayList<ContainerStatus>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServcieScheduleResponse.PodAbstractInfo.ContainerStatuses.Length"); i++) {
			ContainerStatus containerStatus = new ContainerStatus();
			containerStatus.setContainerId(_ctx.stringValue("DescribeServcieScheduleResponse.PodAbstractInfo.ContainerStatuses["+ i +"].ContainerId"));
			containerStatus.setName(_ctx.stringValue("DescribeServcieScheduleResponse.PodAbstractInfo.ContainerStatuses["+ i +"].Name"));

			containerStatuses.add(containerStatus);
		}
		podAbstractInfo.setContainerStatuses(containerStatuses);
		describeServcieScheduleResponse.setPodAbstractInfo(podAbstractInfo);
	 
	 	return describeServcieScheduleResponse;
	}
}