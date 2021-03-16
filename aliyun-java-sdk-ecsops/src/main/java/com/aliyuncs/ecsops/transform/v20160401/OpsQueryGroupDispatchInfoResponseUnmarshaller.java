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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryGroupDispatchInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryGroupDispatchInfoResponse.DispatchInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryGroupDispatchInfoResponseUnmarshaller {

	public static OpsQueryGroupDispatchInfoResponse unmarshall(OpsQueryGroupDispatchInfoResponse opsQueryGroupDispatchInfoResponse, UnmarshallerContext _ctx) {
		
		opsQueryGroupDispatchInfoResponse.setRequestId(_ctx.stringValue("OpsQueryGroupDispatchInfoResponse.RequestId"));

		List<DispatchInfo> dispatchInfos = new ArrayList<DispatchInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryGroupDispatchInfoResponse.DispatchInfos.Length"); i++) {
			DispatchInfo dispatchInfo = new DispatchInfo();
			dispatchInfo.setInstanceId(_ctx.stringValue("OpsQueryGroupDispatchInfoResponse.DispatchInfos["+ i +"].InstanceId"));
			dispatchInfo.setDispatched(_ctx.booleanValue("OpsQueryGroupDispatchInfoResponse.DispatchInfos["+ i +"].Dispatched"));

			dispatchInfos.add(dispatchInfo);
		}
		opsQueryGroupDispatchInfoResponse.setDispatchInfos(dispatchInfos);
	 
	 	return opsQueryGroupDispatchInfoResponse;
	}
}