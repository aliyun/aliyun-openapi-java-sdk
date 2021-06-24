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

import com.aliyuncs.ecsops.model.v20160401.OpsKickVmResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsKickVmResponse.KickVmResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsKickVmResponseUnmarshaller {

	public static OpsKickVmResponse unmarshall(OpsKickVmResponse opsKickVmResponse, UnmarshallerContext _ctx) {
		
		opsKickVmResponse.setRequestId(_ctx.stringValue("OpsKickVmResponse.RequestId"));

		List<KickVmResult> kickVmResultArrays = new ArrayList<KickVmResult>();
		for (int i = 0; i < _ctx.lengthValue("OpsKickVmResponse.KickVmResultArrays.Length"); i++) {
			KickVmResult kickVmResult = new KickVmResult();
			kickVmResult.setUsedTime(_ctx.longValue("OpsKickVmResponse.KickVmResultArrays["+ i +"].UsedTime"));
			kickVmResult.setResult(_ctx.stringValue("OpsKickVmResponse.KickVmResultArrays["+ i +"].Result"));
			kickVmResult.setInstanceId(_ctx.stringValue("OpsKickVmResponse.KickVmResultArrays["+ i +"].InstanceId"));
			kickVmResult.setOutput(_ctx.stringValue("OpsKickVmResponse.KickVmResultArrays["+ i +"].Output"));

			kickVmResultArrays.add(kickVmResult);
		}
		opsKickVmResponse.setKickVmResultArrays(kickVmResultArrays);
	 
	 	return opsKickVmResponse;
	}
}