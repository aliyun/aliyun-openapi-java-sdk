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
import com.aliyuncs.retailcloud.model.v20180313.ListPodsResponse.PodDetail;
import com.aliyuncs.retailcloud.model.v20180313.ListPodsResponse.PodDetail.DeployStep;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPodsResponseUnmarshaller {

	public static ListPodsResponse unmarshall(ListPodsResponse listPodsResponse, UnmarshallerContext _ctx) {
		
		listPodsResponse.setRequestId(_ctx.stringValue("ListPodsResponse.RequestId"));
		listPodsResponse.setCode(_ctx.integerValue("ListPodsResponse.Code"));
		listPodsResponse.setErrorMsg(_ctx.stringValue("ListPodsResponse.ErrorMsg"));
		listPodsResponse.setPageNumber(_ctx.integerValue("ListPodsResponse.PageNumber"));
		listPodsResponse.setPageSize(_ctx.integerValue("ListPodsResponse.PageSize"));
		listPodsResponse.setTotalCount(_ctx.longValue("ListPodsResponse.TotalCount"));

		List<PodDetail> data = new ArrayList<PodDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListPodsResponse.Data.Length"); i++) {
			PodDetail podDetail = new PodDetail();
			podDetail.setAppInstanceId(_ctx.stringValue("ListPodsResponse.Data["+ i +"].AppInstanceId"));
			podDetail.setDeployOrderId(_ctx.longValue("ListPodsResponse.Data["+ i +"].DeployOrderId"));
			podDetail.setDeployPartitionNum(_ctx.integerValue("ListPodsResponse.Data["+ i +"].DeployPartitionNum"));
			podDetail.setGroupName(_ctx.stringValue("ListPodsResponse.Data["+ i +"].GroupName"));
			podDetail.setHostIp(_ctx.stringValue("ListPodsResponse.Data["+ i +"].HostIp"));
			podDetail.setHostName(_ctx.stringValue("ListPodsResponse.Data["+ i +"].HostName"));
			podDetail.setPodIp(_ctx.stringValue("ListPodsResponse.Data["+ i +"].PodIp"));
			podDetail.setRegion(_ctx.stringValue("ListPodsResponse.Data["+ i +"].Region"));
			podDetail.setResult(_ctx.integerValue("ListPodsResponse.Data["+ i +"].Result"));
			podDetail.setResultName(_ctx.stringValue("ListPodsResponse.Data["+ i +"].ResultName"));
			podDetail.setStartTime(_ctx.stringValue("ListPodsResponse.Data["+ i +"].StartTime"));
			podDetail.setStatus(_ctx.integerValue("ListPodsResponse.Data["+ i +"].Status"));
			podDetail.setStatusName(_ctx.stringValue("ListPodsResponse.Data["+ i +"].StatusName"));
			podDetail.setUpdateTime(_ctx.stringValue("ListPodsResponse.Data["+ i +"].UpdateTime"));

			List<DeployStep> deploySteps = new ArrayList<DeployStep>();
			for (int j = 0; j < _ctx.lengthValue("ListPodsResponse.Data["+ i +"].DeploySteps.Length"); j++) {
				DeployStep deployStep = new DeployStep();
				deployStep.setStatus(_ctx.stringValue("ListPodsResponse.Data["+ i +"].DeploySteps["+ j +"].Status"));
				deployStep.setStepCode(_ctx.stringValue("ListPodsResponse.Data["+ i +"].DeploySteps["+ j +"].StepCode"));
				deployStep.setStepName(_ctx.stringValue("ListPodsResponse.Data["+ i +"].DeploySteps["+ j +"].StepName"));

				deploySteps.add(deployStep);
			}
			podDetail.setDeploySteps(deploySteps);

			data.add(podDetail);
		}
		listPodsResponse.setData(data);
	 
	 	return listPodsResponse;
	}
}