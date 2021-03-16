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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeLimitInstancesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeLimitInstancesResponse.LimitInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeLimitInstancesResponseUnmarshaller {

	public static OpsDescribeLimitInstancesResponse unmarshall(OpsDescribeLimitInstancesResponse opsDescribeLimitInstancesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeLimitInstancesResponse.setRequestId(_ctx.stringValue("OpsDescribeLimitInstancesResponse.RequestId"));
		opsDescribeLimitInstancesResponse.setCode(_ctx.stringValue("OpsDescribeLimitInstancesResponse.Code"));
		opsDescribeLimitInstancesResponse.setMessage(_ctx.stringValue("OpsDescribeLimitInstancesResponse.Message"));
		opsDescribeLimitInstancesResponse.setSuccess(_ctx.stringValue("OpsDescribeLimitInstancesResponse.Success"));
		opsDescribeLimitInstancesResponse.setTotal(_ctx.longValue("OpsDescribeLimitInstancesResponse.Total"));

		List<LimitInstance> limitInstances = new ArrayList<LimitInstance>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeLimitInstancesResponse.LimitInstances.Length"); i++) {
			LimitInstance limitInstance = new LimitInstance();
			limitInstance.setLimitType(_ctx.stringValue("OpsDescribeLimitInstancesResponse.LimitInstances["+ i +"].LimitType"));
			limitInstance.setInstanceId(_ctx.stringValue("OpsDescribeLimitInstancesResponse.LimitInstances["+ i +"].InstanceId"));
			limitInstance.setPrivateRxBps(_ctx.longValue("OpsDescribeLimitInstancesResponse.LimitInstances["+ i +"].PrivateRxBps"));
			limitInstance.setPrivateTxBps(_ctx.longValue("OpsDescribeLimitInstancesResponse.LimitInstances["+ i +"].PrivateTxBps"));
			limitInstance.setPrivateRxPps(_ctx.longValue("OpsDescribeLimitInstancesResponse.LimitInstances["+ i +"].PrivateRxPps"));
			limitInstance.setPrivateTxPps(_ctx.longValue("OpsDescribeLimitInstancesResponse.LimitInstances["+ i +"].PrivateTxPps"));
			limitInstance.setPublicRxBps(_ctx.longValue("OpsDescribeLimitInstancesResponse.LimitInstances["+ i +"].PublicRxBps"));
			limitInstance.setPublicTxBps(_ctx.longValue("OpsDescribeLimitInstancesResponse.LimitInstances["+ i +"].PublicTxBps"));
			limitInstance.setPublicRxPps(_ctx.longValue("OpsDescribeLimitInstancesResponse.LimitInstances["+ i +"].PublicRxPps"));
			limitInstance.setPublicTxPps(_ctx.longValue("OpsDescribeLimitInstancesResponse.LimitInstances["+ i +"].PublicTxPps"));
			limitInstance.setSessionQuota(_ctx.longValue("OpsDescribeLimitInstancesResponse.LimitInstances["+ i +"].SessionQuota"));
			limitInstance.setSessionEstablishRate(_ctx.longValue("OpsDescribeLimitInstancesResponse.LimitInstances["+ i +"].SessionEstablishRate"));

			limitInstances.add(limitInstance);
		}
		opsDescribeLimitInstancesResponse.setLimitInstances(limitInstances);
	 
	 	return opsDescribeLimitInstancesResponse;
	}
}