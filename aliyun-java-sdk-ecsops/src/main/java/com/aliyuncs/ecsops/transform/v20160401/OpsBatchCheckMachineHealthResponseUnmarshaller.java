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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsBatchCheckMachineHealthResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsBatchCheckMachineHealthResponse.MachineHealthInfo;
import com.aliyuncs.ecsops.model.v20160401.OpsBatchCheckMachineHealthResponse.MachineHealthInfo.HealthInfo;
import com.aliyuncs.ecsops.model.v20160401.OpsBatchCheckMachineHealthResponse.MachineHealthInfo.HealthInfo.ResultInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsBatchCheckMachineHealthResponseUnmarshaller {

	public static OpsBatchCheckMachineHealthResponse unmarshall(OpsBatchCheckMachineHealthResponse opsBatchCheckMachineHealthResponse, UnmarshallerContext _ctx) {
		
		opsBatchCheckMachineHealthResponse.setRequestId(_ctx.stringValue("OpsBatchCheckMachineHealthResponse.RequestId"));
		opsBatchCheckMachineHealthResponse.setToken(_ctx.stringValue("OpsBatchCheckMachineHealthResponse.Token"));
		opsBatchCheckMachineHealthResponse.setStatus(_ctx.stringValue("OpsBatchCheckMachineHealthResponse.Status"));
		opsBatchCheckMachineHealthResponse.setFinished(_ctx.booleanValue("OpsBatchCheckMachineHealthResponse.Finished"));
		opsBatchCheckMachineHealthResponse.setCheckTime(_ctx.stringValue("OpsBatchCheckMachineHealthResponse.CheckTime"));

		List<String> machineIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsBatchCheckMachineHealthResponse.MachineIds.Length"); i++) {
			machineIds.add(_ctx.stringValue("OpsBatchCheckMachineHealthResponse.MachineIds["+ i +"]"));
		}
		opsBatchCheckMachineHealthResponse.setMachineIds(machineIds);

		List<MachineHealthInfo> machineHealthInfos = new ArrayList<MachineHealthInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsBatchCheckMachineHealthResponse.MachineHealthInfos.Length"); i++) {
			MachineHealthInfo machineHealthInfo = new MachineHealthInfo();
			machineHealthInfo.setMachineId(_ctx.stringValue("OpsBatchCheckMachineHealthResponse.MachineHealthInfos["+ i +"].MachineId"));

			List<HealthInfo> healthInfos = new ArrayList<HealthInfo>();
			for (int j = 0; j < _ctx.lengthValue("OpsBatchCheckMachineHealthResponse.MachineHealthInfos["+ i +"].HealthInfos.Length"); j++) {
				HealthInfo healthInfo = new HealthInfo();
				healthInfo.setMachineId(_ctx.stringValue("OpsBatchCheckMachineHealthResponse.MachineHealthInfos["+ i +"].HealthInfos["+ j +"].MachineId"));
				healthInfo.setCheckItem(_ctx.stringValue("OpsBatchCheckMachineHealthResponse.MachineHealthInfos["+ i +"].HealthInfos["+ j +"].CheckItem"));
				healthInfo.setDetailInfo(_ctx.stringValue("OpsBatchCheckMachineHealthResponse.MachineHealthInfos["+ i +"].HealthInfos["+ j +"].DetailInfo"));

				List<ResultInfo> resultInfos = new ArrayList<ResultInfo>();
				for (int k = 0; k < _ctx.lengthValue("OpsBatchCheckMachineHealthResponse.MachineHealthInfos["+ i +"].HealthInfos["+ j +"].ResultInfos.Length"); k++) {
					ResultInfo resultInfo = new ResultInfo();
					resultInfo.setResultKey(_ctx.stringValue("OpsBatchCheckMachineHealthResponse.MachineHealthInfos["+ i +"].HealthInfos["+ j +"].ResultInfos["+ k +"].ResultKey"));
					resultInfo.setResultValue(_ctx.stringValue("OpsBatchCheckMachineHealthResponse.MachineHealthInfos["+ i +"].HealthInfos["+ j +"].ResultInfos["+ k +"].ResultValue"));
					resultInfo.setResultMsg(_ctx.stringValue("OpsBatchCheckMachineHealthResponse.MachineHealthInfos["+ i +"].HealthInfos["+ j +"].ResultInfos["+ k +"].ResultMsg"));

					resultInfos.add(resultInfo);
				}
				healthInfo.setResultInfos(resultInfos);

				healthInfos.add(healthInfo);
			}
			machineHealthInfo.setHealthInfos(healthInfos);

			machineHealthInfos.add(machineHealthInfo);
		}
		opsBatchCheckMachineHealthResponse.setMachineHealthInfos(machineHealthInfos);
	 
	 	return opsBatchCheckMachineHealthResponse;
	}
}