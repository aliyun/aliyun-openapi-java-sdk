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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetTraceAppResponse;
import com.aliyuncs.arms.model.v20190808.GetTraceAppResponse.TraceApp;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTraceAppResponseUnmarshaller {

	public static GetTraceAppResponse unmarshall(GetTraceAppResponse getTraceAppResponse, UnmarshallerContext _ctx) {
		
		getTraceAppResponse.setRequestId(_ctx.stringValue("GetTraceAppResponse.RequestId"));

		TraceApp traceApp = new TraceApp();
		traceApp.setAppId(_ctx.longValue("GetTraceAppResponse.TraceApp.AppId"));
		traceApp.setPid(_ctx.stringValue("GetTraceAppResponse.TraceApp.Pid"));
		traceApp.setAppName(_ctx.stringValue("GetTraceAppResponse.TraceApp.AppName"));
		traceApp.setType(_ctx.stringValue("GetTraceAppResponse.TraceApp.Type"));
		traceApp.setUserId(_ctx.stringValue("GetTraceAppResponse.TraceApp.UserId"));
		traceApp.setRegionId(_ctx.stringValue("GetTraceAppResponse.TraceApp.RegionId"));
		traceApp.setCreateTime(_ctx.longValue("GetTraceAppResponse.TraceApp.CreateTime"));
		traceApp.setUpdateTime(_ctx.longValue("GetTraceAppResponse.TraceApp.UpdateTime"));
		traceApp.setShow(_ctx.booleanValue("GetTraceAppResponse.TraceApp.Show"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTraceAppResponse.TraceApp.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("GetTraceAppResponse.TraceApp.Labels["+ i +"]"));
		}
		traceApp.setLabels(labels);
		getTraceAppResponse.setTraceApp(traceApp);
	 
	 	return getTraceAppResponse;
	}
}