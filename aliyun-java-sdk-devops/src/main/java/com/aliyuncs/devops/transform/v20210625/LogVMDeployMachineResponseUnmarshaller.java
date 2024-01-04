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

import com.aliyuncs.devops.model.v20210625.LogVMDeployMachineResponse;
import com.aliyuncs.devops.model.v20210625.LogVMDeployMachineResponse.DeployMachineLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class LogVMDeployMachineResponseUnmarshaller {

	public static LogVMDeployMachineResponse unmarshall(LogVMDeployMachineResponse logVMDeployMachineResponse, UnmarshallerContext _ctx) {
		
		logVMDeployMachineResponse.setRequestId(_ctx.stringValue("LogVMDeployMachineResponse.requestId"));
		logVMDeployMachineResponse.setErrorMessage(_ctx.stringValue("LogVMDeployMachineResponse.errorMessage"));
		logVMDeployMachineResponse.setSuccess(_ctx.booleanValue("LogVMDeployMachineResponse.success"));
		logVMDeployMachineResponse.setErrorCode(_ctx.stringValue("LogVMDeployMachineResponse.errorCode"));

		DeployMachineLog deployMachineLog = new DeployMachineLog();
		deployMachineLog.setDeployLog(_ctx.stringValue("LogVMDeployMachineResponse.deployMachineLog.deployLog"));
		deployMachineLog.setAliyunRegion(_ctx.stringValue("LogVMDeployMachineResponse.deployMachineLog.aliyunRegion"));
		deployMachineLog.setDeployLogPath(_ctx.stringValue("LogVMDeployMachineResponse.deployMachineLog.deployLogPath"));
		deployMachineLog.setDeployBeginTime(_ctx.longValue("LogVMDeployMachineResponse.deployMachineLog.deployBeginTime"));
		deployMachineLog.setDeployEndTime(_ctx.longValue("LogVMDeployMachineResponse.deployMachineLog.deployEndTime"));
		logVMDeployMachineResponse.setDeployMachineLog(deployMachineLog);
	 
	 	return logVMDeployMachineResponse;
	}
}