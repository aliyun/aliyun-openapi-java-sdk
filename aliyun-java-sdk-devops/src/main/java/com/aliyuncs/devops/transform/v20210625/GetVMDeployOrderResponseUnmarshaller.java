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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.GetVMDeployOrderResponse;
import com.aliyuncs.devops.model.v20210625.GetVMDeployOrderResponse.DeployOrder;
import com.aliyuncs.devops.model.v20210625.GetVMDeployOrderResponse.DeployOrder.Action;
import com.aliyuncs.devops.model.v20210625.GetVMDeployOrderResponse.DeployOrder.DeployMachineInfo;
import com.aliyuncs.devops.model.v20210625.GetVMDeployOrderResponse.DeployOrder.DeployMachineInfo.DeployMachine;
import com.aliyuncs.devops.model.v20210625.GetVMDeployOrderResponse.DeployOrder.DeployMachineInfo.DeployMachine.Action2;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVMDeployOrderResponseUnmarshaller {

	public static GetVMDeployOrderResponse unmarshall(GetVMDeployOrderResponse getVMDeployOrderResponse, UnmarshallerContext _ctx) {
		
		getVMDeployOrderResponse.setRequestId(_ctx.stringValue("GetVMDeployOrderResponse.requestId"));
		getVMDeployOrderResponse.setErrorMessage(_ctx.stringValue("GetVMDeployOrderResponse.errorMessage"));
		getVMDeployOrderResponse.setSuccess(_ctx.booleanValue("GetVMDeployOrderResponse.success"));
		getVMDeployOrderResponse.setErrorCode(_ctx.stringValue("GetVMDeployOrderResponse.errorCode"));

		DeployOrder deployOrder = new DeployOrder();
		deployOrder.setDeployOrderId(_ctx.stringValue("GetVMDeployOrderResponse.deployOrder.deployOrderId"));
		deployOrder.setCreateTime(_ctx.longValue("GetVMDeployOrderResponse.deployOrder.createTime"));
		deployOrder.setUpdateTime(_ctx.longValue("GetVMDeployOrderResponse.deployOrder.updateTime"));
		deployOrder.setCreator(_ctx.stringValue("GetVMDeployOrderResponse.deployOrder.creator"));
		deployOrder.setCurrentBatch(_ctx.integerValue("GetVMDeployOrderResponse.deployOrder.currentBatch"));
		deployOrder.setTotalBatch(_ctx.integerValue("GetVMDeployOrderResponse.deployOrder.totalBatch"));
		deployOrder.setStatus(_ctx.stringValue("GetVMDeployOrderResponse.deployOrder.status"));
		deployOrder.setExceptionCode(_ctx.stringValue("GetVMDeployOrderResponse.deployOrder.exceptionCode"));

		DeployMachineInfo deployMachineInfo = new DeployMachineInfo();
		deployMachineInfo.setHostGroupId(_ctx.longValue("GetVMDeployOrderResponse.deployOrder.deployMachineInfo.hostGroupId"));
		deployMachineInfo.setBatchNum(_ctx.integerValue("GetVMDeployOrderResponse.deployOrder.deployMachineInfo.batchNum"));

		List<DeployMachine> deployMachines = new ArrayList<DeployMachine>();
		for (int i = 0; i < _ctx.lengthValue("GetVMDeployOrderResponse.deployOrder.deployMachineInfo.deployMachines.Length"); i++) {
			DeployMachine deployMachine = new DeployMachine();
			deployMachine.setCreateTime(_ctx.longValue("GetVMDeployOrderResponse.deployOrder.deployMachineInfo.deployMachines["+ i +"].createTime"));
			deployMachine.setUpdateTime(_ctx.longValue("GetVMDeployOrderResponse.deployOrder.deployMachineInfo.deployMachines["+ i +"].updateTime"));
			deployMachine.setStatus(_ctx.stringValue("GetVMDeployOrderResponse.deployOrder.deployMachineInfo.deployMachines["+ i +"].status"));
			deployMachine.setMachineSn(_ctx.stringValue("GetVMDeployOrderResponse.deployOrder.deployMachineInfo.deployMachines["+ i +"].machineSn"));
			deployMachine.setClientStatus(_ctx.stringValue("GetVMDeployOrderResponse.deployOrder.deployMachineInfo.deployMachines["+ i +"].clientStatus"));
			deployMachine.setIp(_ctx.stringValue("GetVMDeployOrderResponse.deployOrder.deployMachineInfo.deployMachines["+ i +"].ip"));
			deployMachine.setBatchNum(_ctx.integerValue("GetVMDeployOrderResponse.deployOrder.deployMachineInfo.deployMachines["+ i +"].batchNum"));

			List<Action2> actions1 = new ArrayList<Action2>();
			for (int j = 0; j < _ctx.lengthValue("GetVMDeployOrderResponse.deployOrder.deployMachineInfo.deployMachines["+ i +"].actions.Length"); j++) {
				Action2 action2 = new Action2();
				action2.setType(_ctx.stringValue("GetVMDeployOrderResponse.deployOrder.deployMachineInfo.deployMachines["+ i +"].actions["+ j +"].type"));
				action2.setDisable(_ctx.booleanValue("GetVMDeployOrderResponse.deployOrder.deployMachineInfo.deployMachines["+ i +"].actions["+ j +"].disable"));

				actions1.add(action2);
			}
			deployMachine.setActions1(actions1);

			deployMachines.add(deployMachine);
		}
		deployMachineInfo.setDeployMachines(deployMachines);
		deployOrder.setDeployMachineInfo(deployMachineInfo);

		List<Action> actions = new ArrayList<Action>();
		for (int i = 0; i < _ctx.lengthValue("GetVMDeployOrderResponse.deployOrder.actions.Length"); i++) {
			Action action = new Action();
			action.setType(_ctx.stringValue("GetVMDeployOrderResponse.deployOrder.actions["+ i +"].type"));
			action.setDisable(_ctx.booleanValue("GetVMDeployOrderResponse.deployOrder.actions["+ i +"].disable"));

			actions.add(action);
		}
		deployOrder.setActions(actions);
		getVMDeployOrderResponse.setDeployOrder(deployOrder);
	 
	 	return getVMDeployOrderResponse;
	}
}