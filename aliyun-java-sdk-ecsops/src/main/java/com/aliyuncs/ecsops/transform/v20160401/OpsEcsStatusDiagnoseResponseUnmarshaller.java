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

import com.aliyuncs.ecsops.model.v20160401.OpsEcsStatusDiagnoseResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsEcsStatusDiagnoseResponse.EcsStatusDiagnose;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsEcsStatusDiagnoseResponseUnmarshaller {

	public static OpsEcsStatusDiagnoseResponse unmarshall(OpsEcsStatusDiagnoseResponse opsEcsStatusDiagnoseResponse, UnmarshallerContext _ctx) {
		
		opsEcsStatusDiagnoseResponse.setRequestId(_ctx.stringValue("OpsEcsStatusDiagnoseResponse.RequestId"));

		List<EcsStatusDiagnose> ecsStatusDiagnoseSet = new ArrayList<EcsStatusDiagnose>();
		for (int i = 0; i < _ctx.lengthValue("OpsEcsStatusDiagnoseResponse.EcsStatusDiagnoseSet.Length"); i++) {
			EcsStatusDiagnose ecsStatusDiagnose = new EcsStatusDiagnose();
			ecsStatusDiagnose.setInstanceId(_ctx.stringValue("OpsEcsStatusDiagnoseResponse.EcsStatusDiagnoseSet["+ i +"].InstanceId"));
			ecsStatusDiagnose.setStatus(_ctx.stringValue("OpsEcsStatusDiagnoseResponse.EcsStatusDiagnoseSet["+ i +"].Status"));
			ecsStatusDiagnose.setHouyiStatus(_ctx.stringValue("OpsEcsStatusDiagnoseResponse.EcsStatusDiagnoseSet["+ i +"].HouyiStatus"));
			ecsStatusDiagnose.setStatusOnNc(_ctx.stringValue("OpsEcsStatusDiagnoseResponse.EcsStatusDiagnoseSet["+ i +"].StatusOnNc"));
			ecsStatusDiagnose.setYaochiConsistent(_ctx.booleanValue("OpsEcsStatusDiagnoseResponse.EcsStatusDiagnoseSet["+ i +"].YaochiConsistent"));
			ecsStatusDiagnose.setHouyiConsistent(_ctx.booleanValue("OpsEcsStatusDiagnoseResponse.EcsStatusDiagnoseSet["+ i +"].HouyiConsistent"));
			ecsStatusDiagnose.setSyncResult(_ctx.stringValue("OpsEcsStatusDiagnoseResponse.EcsStatusDiagnoseSet["+ i +"].SyncResult"));

			ecsStatusDiagnoseSet.add(ecsStatusDiagnose);
		}
		opsEcsStatusDiagnoseResponse.setEcsStatusDiagnoseSet(ecsStatusDiagnoseSet);
	 
	 	return opsEcsStatusDiagnoseResponse;
	}
}