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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.GetClusterInfoResponse;
import com.aliyuncs.arms.model.v20190808.GetClusterInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClusterInfoResponseUnmarshaller {

	public static GetClusterInfoResponse unmarshall(GetClusterInfoResponse getClusterInfoResponse, UnmarshallerContext _ctx) {
		
		getClusterInfoResponse.setRequestId(_ctx.stringValue("GetClusterInfoResponse.RequestId"));

		Data data = new Data();
		data.setIsFlink(_ctx.booleanValue("GetClusterInfoResponse.Data.IsFlink"));
		data.setGetClusterInfo(_ctx.stringValue("GetClusterInfoResponse.Data.GetClusterInfo"));
		data.setCheckType(_ctx.stringValue("GetClusterInfoResponse.Data.CheckType"));
		data.setNeedRetry(_ctx.booleanValue("GetClusterInfoResponse.Data.NeedRetry"));
		data.setArmsDBNotExist(_ctx.booleanValue("GetClusterInfoResponse.Data.ArmsDBNotExist"));
		data.setNodeSizeIsZero(_ctx.booleanValue("GetClusterInfoResponse.Data.NodeSizeIsZero"));
		data.setAgentHelmNotExist(_ctx.booleanValue("GetClusterInfoResponse.Data.AgentHelmNotExist"));
		data.setAgentServiceNotExist(_ctx.booleanValue("GetClusterInfoResponse.Data.AgentServiceNotExist"));
		data.setNeedIntervention(_ctx.booleanValue("GetClusterInfoResponse.Data.NeedIntervention"));
		data.setHaveAgentNodeIsNotReady(_ctx.booleanValue("GetClusterInfoResponse.Data.HaveAgentNodeIsNotReady"));
		data.setAckNotRunning(_ctx.booleanValue("GetClusterInfoResponse.Data.AckNotRunning"));
		data.setPodIsNotRestart(_ctx.booleanValue("GetClusterInfoResponse.Data.PodIsNotRestart"));
		getClusterInfoResponse.setData(data);
	 
	 	return getClusterInfoResponse;
	}
}