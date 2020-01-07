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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.ListPodsResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListPodsResponse.ListPodsResponse1;
import com.aliyuncs.retailcloud.model.v20180313.ListPodsResponse.ListPodsResponse1.DeployStep;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPodsResponseUnmarshaller {

	public static ListPodsResponse unmarshall(ListPodsResponse listPodsResponse, UnmarshallerContext _ctx) {
		
		listPodsResponse.setRequestId(_ctx.stringValue("ListPodsResponse.RequestId"));
		listPodsResponse.setCode(_ctx.integerValue("ListPodsResponse.Code"));
		listPodsResponse.setErrorMsg(_ctx.stringValue("ListPodsResponse.ErrorMsg"));
		listPodsResponse.setPageNumber(_ctx.integerValue("ListPodsResponse.PageNumber"));
		listPodsResponse.setPageSize(_ctx.integerValue("ListPodsResponse.PageSize"));
		listPodsResponse.setTotalCount(_ctx.longValue("ListPodsResponse.TotalCount"));

		List<ListPodsResponse1> data = new ArrayList<ListPodsResponse1>();
		for (int i = 0; i < _ctx.lengthValue("ListPodsResponse.Data.Length"); i++) {
			ListPodsResponse1 listPodsResponse1 = new ListPodsResponse1();
			listPodsResponse1.setAppInstanceId(_ctx.stringValue("ListPodsResponse.Data["+ i +"].AppInstanceId"));
			listPodsResponse1.setDeployOrderId(_ctx.longValue("ListPodsResponse.Data["+ i +"].DeployOrderId"));
			listPodsResponse1.setDeployPartitionNum(_ctx.integerValue("ListPodsResponse.Data["+ i +"].DeployPartitionNum"));
			listPodsResponse1.setGroupName(_ctx.stringValue("ListPodsResponse.Data["+ i +"].GroupName"));
			listPodsResponse1.setHostIp(_ctx.stringValue("ListPodsResponse.Data["+ i +"].HostIp"));
			listPodsResponse1.setHostName(_ctx.stringValue("ListPodsResponse.Data["+ i +"].HostName"));
			listPodsResponse1.setPodIp(_ctx.stringValue("ListPodsResponse.Data["+ i +"].PodIp"));
			listPodsResponse1.setRegion(_ctx.stringValue("ListPodsResponse.Data["+ i +"].Region"));
			listPodsResponse1.setResult(_ctx.integerValue("ListPodsResponse.Data["+ i +"].Result"));
			listPodsResponse1.setResultName(_ctx.stringValue("ListPodsResponse.Data["+ i +"].ResultName"));
			listPodsResponse1.setStartTime(_ctx.stringValue("ListPodsResponse.Data["+ i +"].StartTime"));
			listPodsResponse1.setStatus(_ctx.integerValue("ListPodsResponse.Data["+ i +"].Status"));
			listPodsResponse1.setStatusName(_ctx.stringValue("ListPodsResponse.Data["+ i +"].StatusName"));
			listPodsResponse1.setUpdateTime(_ctx.stringValue("ListPodsResponse.Data["+ i +"].UpdateTime"));

			List<DeployStep> deploySteps = new ArrayList<DeployStep>();
			for (int j = 0; j < _ctx.lengthValue("ListPodsResponse.Data["+ i +"].DeploySteps.Length"); j++) {
				DeployStep deployStep = new DeployStep();
				deployStep.setStatus(_ctx.stringValue("ListPodsResponse.Data["+ i +"].DeploySteps["+ j +"].Status"));
				deployStep.setStepCode(_ctx.stringValue("ListPodsResponse.Data["+ i +"].DeploySteps["+ j +"].StepCode"));
				deployStep.setStepName(_ctx.stringValue("ListPodsResponse.Data["+ i +"].DeploySteps["+ j +"].StepName"));

				deploySteps.add(deployStep);
			}
			listPodsResponse1.setDeploySteps(deploySteps);

			data.add(listPodsResponse1);
		}
		listPodsResponse.setData(data);
	 
	 	return listPodsResponse;
	}
}