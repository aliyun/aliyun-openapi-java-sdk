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

package com.aliyuncs.iotsoc.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotsoc.model.v20190815.GetAnomalyEventTrendResponse;
import com.aliyuncs.iotsoc.model.v20190815.GetAnomalyEventTrendResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAnomalyEventTrendResponseUnmarshaller {

	public static GetAnomalyEventTrendResponse unmarshall(GetAnomalyEventTrendResponse getAnomalyEventTrendResponse, UnmarshallerContext _ctx) {
		
		getAnomalyEventTrendResponse.setRequestId(_ctx.stringValue("GetAnomalyEventTrendResponse.RequestId"));
		getAnomalyEventTrendResponse.setSuccess(_ctx.booleanValue("GetAnomalyEventTrendResponse.Success"));
		getAnomalyEventTrendResponse.setCode(_ctx.stringValue("GetAnomalyEventTrendResponse.Code"));
		getAnomalyEventTrendResponse.setMessage(_ctx.stringValue("GetAnomalyEventTrendResponse.Message"));

		Data data = new Data();

		List<String> systemObjectTrend = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAnomalyEventTrendResponse.Data.SystemObjectTrend.Length"); i++) {
			systemObjectTrend.add(_ctx.stringValue("GetAnomalyEventTrendResponse.Data.SystemObjectTrend["+ i +"]"));
		}
		data.setSystemObjectTrend(systemObjectTrend);

		List<String> applicationBehaviorTrend = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAnomalyEventTrendResponse.Data.ApplicationBehaviorTrend.Length"); i++) {
			applicationBehaviorTrend.add(_ctx.stringValue("GetAnomalyEventTrendResponse.Data.ApplicationBehaviorTrend["+ i +"]"));
		}
		data.setApplicationBehaviorTrend(applicationBehaviorTrend);

		List<String> networkFlowTrend = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAnomalyEventTrendResponse.Data.NetworkFlowTrend.Length"); i++) {
			networkFlowTrend.add(_ctx.stringValue("GetAnomalyEventTrendResponse.Data.NetworkFlowTrend["+ i +"]"));
		}
		data.setNetworkFlowTrend(networkFlowTrend);
		getAnomalyEventTrendResponse.setData(data);
	 
	 	return getAnomalyEventTrendResponse;
	}
}