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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeNetworkPingTraceResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeNetworkPingTraceResponse.NetworkPingTrace;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeNetworkPingTraceResponseUnmarshaller {

	public static OpsDescribeNetworkPingTraceResponse unmarshall(OpsDescribeNetworkPingTraceResponse opsDescribeNetworkPingTraceResponse, UnmarshallerContext _ctx) {
		
		opsDescribeNetworkPingTraceResponse.setRequestId(_ctx.stringValue("OpsDescribeNetworkPingTraceResponse.RequestId"));
		opsDescribeNetworkPingTraceResponse.setPageSize(_ctx.integerValue("OpsDescribeNetworkPingTraceResponse.PageSize"));
		opsDescribeNetworkPingTraceResponse.setTotal(_ctx.integerValue("OpsDescribeNetworkPingTraceResponse.Total"));
		opsDescribeNetworkPingTraceResponse.setPageNo(_ctx.integerValue("OpsDescribeNetworkPingTraceResponse.PageNo"));

		List<NetworkPingTrace> networkPingTraces = new ArrayList<NetworkPingTrace>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeNetworkPingTraceResponse.NetworkPingTraces.Length"); i++) {
			NetworkPingTrace networkPingTrace = new NetworkPingTrace();
			networkPingTrace.setStatus(_ctx.stringValue("OpsDescribeNetworkPingTraceResponse.NetworkPingTraces["+ i +"].Status"));
			networkPingTrace.setTargetResourceIp(_ctx.stringValue("OpsDescribeNetworkPingTraceResponse.NetworkPingTraces["+ i +"].TargetResourceIp"));
			networkPingTrace.setTargetResourceId(_ctx.stringValue("OpsDescribeNetworkPingTraceResponse.NetworkPingTraces["+ i +"].TargetResourceId"));
			networkPingTrace.setNetworkPingTraceId(_ctx.stringValue("OpsDescribeNetworkPingTraceResponse.NetworkPingTraces["+ i +"].NetworkPingTraceId"));
			networkPingTrace.setGmtCreate(_ctx.stringValue("OpsDescribeNetworkPingTraceResponse.NetworkPingTraces["+ i +"].GmtCreate"));
			networkPingTrace.setResourceIp(_ctx.stringValue("OpsDescribeNetworkPingTraceResponse.NetworkPingTraces["+ i +"].ResourceIp"));
			networkPingTrace.setResourceId(_ctx.stringValue("OpsDescribeNetworkPingTraceResponse.NetworkPingTraces["+ i +"].ResourceId"));
			networkPingTrace.setOssFileName(_ctx.stringValue("OpsDescribeNetworkPingTraceResponse.NetworkPingTraces["+ i +"].OssFileName"));
			networkPingTrace.setMessage(_ctx.stringValue("OpsDescribeNetworkPingTraceResponse.NetworkPingTraces["+ i +"].Message"));

			networkPingTraces.add(networkPingTrace);
		}
		opsDescribeNetworkPingTraceResponse.setNetworkPingTraces(networkPingTraces);
	 
	 	return opsDescribeNetworkPingTraceResponse;
	}
}