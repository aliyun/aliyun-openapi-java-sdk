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

import com.aliyuncs.arms.model.v20190808.GetPrometheusMonitoringResponse;
import com.aliyuncs.arms.model.v20190808.GetPrometheusMonitoringResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPrometheusMonitoringResponseUnmarshaller {

	public static GetPrometheusMonitoringResponse unmarshall(GetPrometheusMonitoringResponse getPrometheusMonitoringResponse, UnmarshallerContext _ctx) {
		
		getPrometheusMonitoringResponse.setRequestId(_ctx.stringValue("GetPrometheusMonitoringResponse.RequestId"));
		getPrometheusMonitoringResponse.setCode(_ctx.integerValue("GetPrometheusMonitoringResponse.Code"));
		getPrometheusMonitoringResponse.setMessage(_ctx.stringValue("GetPrometheusMonitoringResponse.Message"));

		Data data = new Data();
		data.setClusterId(_ctx.stringValue("GetPrometheusMonitoringResponse.Data.ClusterId"));
		data.setMonitoringName(_ctx.stringValue("GetPrometheusMonitoringResponse.Data.MonitoringName"));
		data.setType(_ctx.stringValue("GetPrometheusMonitoringResponse.Data.Type"));
		data.setStatus(_ctx.stringValue("GetPrometheusMonitoringResponse.Data.Status"));
		data.setConfigYaml(_ctx.stringValue("GetPrometheusMonitoringResponse.Data.ConfigYaml"));
		getPrometheusMonitoringResponse.setData(data);
	 
	 	return getPrometheusMonitoringResponse;
	}
}