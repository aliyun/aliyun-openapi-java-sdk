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

import com.aliyuncs.ecsops.model.v20160401.OpsFailureInjectionResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsFailureInjectionResponse.FailedMachine;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsFailureInjectionResponseUnmarshaller {

	public static OpsFailureInjectionResponse unmarshall(OpsFailureInjectionResponse opsFailureInjectionResponse, UnmarshallerContext _ctx) {
		
		opsFailureInjectionResponse.setRequestId(_ctx.stringValue("OpsFailureInjectionResponse.RequestId"));
		opsFailureInjectionResponse.setStatus(_ctx.stringValue("OpsFailureInjectionResponse.Status"));
		opsFailureInjectionResponse.setFinished(_ctx.booleanValue("OpsFailureInjectionResponse.Finished"));
		opsFailureInjectionResponse.setToken(_ctx.stringValue("OpsFailureInjectionResponse.Token"));
		opsFailureInjectionResponse.setValidMachineIdCount(_ctx.integerValue("OpsFailureInjectionResponse.ValidMachineIdCount"));

		List<FailedMachine> failedMachines = new ArrayList<FailedMachine>();
		for (int i = 0; i < _ctx.lengthValue("OpsFailureInjectionResponse.FailedMachines.Length"); i++) {
			FailedMachine failedMachine = new FailedMachine();
			failedMachine.setInfo(_ctx.stringValue("OpsFailureInjectionResponse.FailedMachines["+ i +"].Info"));
			failedMachine.setFailedReason(_ctx.stringValue("OpsFailureInjectionResponse.FailedMachines["+ i +"].FailedReason"));
			failedMachine.setMachineId(_ctx.stringValue("OpsFailureInjectionResponse.FailedMachines["+ i +"].MachineId"));

			failedMachines.add(failedMachine);
		}
		opsFailureInjectionResponse.setFailedMachines(failedMachines);
	 
	 	return opsFailureInjectionResponse;
	}
}