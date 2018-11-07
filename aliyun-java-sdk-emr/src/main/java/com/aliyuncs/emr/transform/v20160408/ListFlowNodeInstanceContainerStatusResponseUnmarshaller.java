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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListFlowNodeInstanceContainerStatusResponse;
import com.aliyuncs.emr.model.v20160408.ListFlowNodeInstanceContainerStatusResponse.ContainerStatus;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowNodeInstanceContainerStatusResponseUnmarshaller {

	public static ListFlowNodeInstanceContainerStatusResponse unmarshall(ListFlowNodeInstanceContainerStatusResponse listFlowNodeInstanceContainerStatusResponse, UnmarshallerContext context) {
		
		listFlowNodeInstanceContainerStatusResponse.setRequestId(context.stringValue("ListFlowNodeInstanceContainerStatusResponse.RequestId"));
		listFlowNodeInstanceContainerStatusResponse.setPageNumber(context.integerValue("ListFlowNodeInstanceContainerStatusResponse.PageNumber"));
		listFlowNodeInstanceContainerStatusResponse.setPageSize(context.integerValue("ListFlowNodeInstanceContainerStatusResponse.PageSize"));
		listFlowNodeInstanceContainerStatusResponse.setTotal(context.integerValue("ListFlowNodeInstanceContainerStatusResponse.Total"));

		List<ContainerStatus> containerStatusList = new ArrayList<ContainerStatus>();
		for (int i = 0; i < context.lengthValue("ListFlowNodeInstanceContainerStatusResponse.ContainerStatusList.Length"); i++) {
			ContainerStatus containerStatus = new ContainerStatus();
			containerStatus.setApplicationId(context.stringValue("ListFlowNodeInstanceContainerStatusResponse.ContainerStatusList["+ i +"].ApplicationId"));
			containerStatus.setContainerId(context.stringValue("ListFlowNodeInstanceContainerStatusResponse.ContainerStatusList["+ i +"].ContainerId"));
			containerStatus.setHostName(context.stringValue("ListFlowNodeInstanceContainerStatusResponse.ContainerStatusList["+ i +"].HostName"));
			containerStatus.setStatus(context.stringValue("ListFlowNodeInstanceContainerStatusResponse.ContainerStatusList["+ i +"].Status"));

			containerStatusList.add(containerStatus);
		}
		listFlowNodeInstanceContainerStatusResponse.setContainerStatusList(containerStatusList);
	 
	 	return listFlowNodeInstanceContainerStatusResponse;
	}
}