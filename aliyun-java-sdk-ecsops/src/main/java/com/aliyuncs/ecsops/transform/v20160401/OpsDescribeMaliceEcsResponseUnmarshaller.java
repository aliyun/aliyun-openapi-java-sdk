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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeMaliceEcsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeMaliceEcsResponse.MaliceInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeMaliceEcsResponseUnmarshaller {

	public static OpsDescribeMaliceEcsResponse unmarshall(OpsDescribeMaliceEcsResponse opsDescribeMaliceEcsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeMaliceEcsResponse.setRequestId(_ctx.stringValue("OpsDescribeMaliceEcsResponse.RequestId"));
		opsDescribeMaliceEcsResponse.setCode(_ctx.stringValue("OpsDescribeMaliceEcsResponse.Code"));
		opsDescribeMaliceEcsResponse.setMessage(_ctx.stringValue("OpsDescribeMaliceEcsResponse.Message"));
		opsDescribeMaliceEcsResponse.setSuccess(_ctx.booleanValue("OpsDescribeMaliceEcsResponse.Success"));
		opsDescribeMaliceEcsResponse.setTotalCount(_ctx.integerValue("OpsDescribeMaliceEcsResponse.TotalCount"));
		opsDescribeMaliceEcsResponse.setPageNo(_ctx.integerValue("OpsDescribeMaliceEcsResponse.PageNo"));
		opsDescribeMaliceEcsResponse.setPageSize(_ctx.integerValue("OpsDescribeMaliceEcsResponse.PageSize"));

		List<MaliceInstance> maliceInstances = new ArrayList<MaliceInstance>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeMaliceEcsResponse.MaliceInstances.Length"); i++) {
			MaliceInstance maliceInstance = new MaliceInstance();
			maliceInstance.setId(_ctx.longValue("OpsDescribeMaliceEcsResponse.MaliceInstances["+ i +"].Id"));
			maliceInstance.setInstanceId(_ctx.stringValue("OpsDescribeMaliceEcsResponse.MaliceInstances["+ i +"].InstanceId"));
			maliceInstance.setInternetIp(_ctx.stringValue("OpsDescribeMaliceEcsResponse.MaliceInstances["+ i +"].InternetIp"));
			maliceInstance.setBandWidth(_ctx.integerValue("OpsDescribeMaliceEcsResponse.MaliceInstances["+ i +"].BandWidth"));
			maliceInstance.setIsLock(_ctx.booleanValue("OpsDescribeMaliceEcsResponse.MaliceInstances["+ i +"].IsLock"));
			maliceInstance.setStatus(_ctx.booleanValue("OpsDescribeMaliceEcsResponse.MaliceInstances["+ i +"].Status"));
			maliceInstance.setOperator(_ctx.stringValue("OpsDescribeMaliceEcsResponse.MaliceInstances["+ i +"].Operator"));
			maliceInstance.setReason(_ctx.stringValue("OpsDescribeMaliceEcsResponse.MaliceInstances["+ i +"].Reason"));
			maliceInstance.setProof(_ctx.stringValue("OpsDescribeMaliceEcsResponse.MaliceInstances["+ i +"].Proof"));
			maliceInstance.setLockType(_ctx.stringValue("OpsDescribeMaliceEcsResponse.MaliceInstances["+ i +"].LockType"));
			maliceInstance.setGmtCreated(_ctx.stringValue("OpsDescribeMaliceEcsResponse.MaliceInstances["+ i +"].GmtCreated"));
			maliceInstance.setGmtUnlocked(_ctx.stringValue("OpsDescribeMaliceEcsResponse.MaliceInstances["+ i +"].GmtUnlocked"));
			maliceInstance.setGmtModified(_ctx.stringValue("OpsDescribeMaliceEcsResponse.MaliceInstances["+ i +"].GmtModified"));

			maliceInstances.add(maliceInstance);
		}
		opsDescribeMaliceEcsResponse.setMaliceInstances(maliceInstances);
	 
	 	return opsDescribeMaliceEcsResponse;
	}
}