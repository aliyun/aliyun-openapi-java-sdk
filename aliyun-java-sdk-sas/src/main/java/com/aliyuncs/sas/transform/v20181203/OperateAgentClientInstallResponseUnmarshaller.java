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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.OperateAgentClientInstallResponse;
import com.aliyuncs.sas.model.v20181203.OperateAgentClientInstallResponse.AegisCelintInstallRespose;
import com.aliyuncs.transform.UnmarshallerContext;


public class OperateAgentClientInstallResponseUnmarshaller {

	public static OperateAgentClientInstallResponse unmarshall(OperateAgentClientInstallResponse operateAgentClientInstallResponse, UnmarshallerContext _ctx) {
		
		operateAgentClientInstallResponse.setRequestId(_ctx.stringValue("OperateAgentClientInstallResponse.RequestId"));

		List<AegisCelintInstallRespose> aegisCelintInstallResposeList = new ArrayList<AegisCelintInstallRespose>();
		for (int i = 0; i < _ctx.lengthValue("OperateAgentClientInstallResponse.AegisCelintInstallResposeList.Length"); i++) {
			AegisCelintInstallRespose aegisCelintInstallRespose = new AegisCelintInstallRespose();
			aegisCelintInstallRespose.setUuid(_ctx.stringValue("OperateAgentClientInstallResponse.AegisCelintInstallResposeList["+ i +"].Uuid"));
			aegisCelintInstallRespose.setInstanceId(_ctx.stringValue("OperateAgentClientInstallResponse.AegisCelintInstallResposeList["+ i +"].InstanceId"));
			aegisCelintInstallRespose.setRecordId(_ctx.longValue("OperateAgentClientInstallResponse.AegisCelintInstallResposeList["+ i +"].RecordId"));

			aegisCelintInstallResposeList.add(aegisCelintInstallRespose);
		}
		operateAgentClientInstallResponse.setAegisCelintInstallResposeList(aegisCelintInstallResposeList);
	 
	 	return operateAgentClientInstallResponse;
	}
}