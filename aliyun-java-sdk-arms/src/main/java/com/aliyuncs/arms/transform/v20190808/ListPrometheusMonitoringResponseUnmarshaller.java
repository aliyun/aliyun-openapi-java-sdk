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

import com.aliyuncs.arms.model.v20190808.ListPrometheusMonitoringResponse;
import com.aliyuncs.arms.model.v20190808.ListPrometheusMonitoringResponse.Monitoring;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrometheusMonitoringResponseUnmarshaller {

	public static ListPrometheusMonitoringResponse unmarshall(ListPrometheusMonitoringResponse listPrometheusMonitoringResponse, UnmarshallerContext _ctx) {
		
		listPrometheusMonitoringResponse.setRequestId(_ctx.stringValue("ListPrometheusMonitoringResponse.RequestId"));
		listPrometheusMonitoringResponse.setCode(_ctx.integerValue("ListPrometheusMonitoringResponse.Code"));
		listPrometheusMonitoringResponse.setMessage(_ctx.stringValue("ListPrometheusMonitoringResponse.Message"));

		List<Monitoring> data = new ArrayList<Monitoring>();
		for (int i = 0; i < _ctx.lengthValue("ListPrometheusMonitoringResponse.Data.Length"); i++) {
			Monitoring monitoring = new Monitoring();
			monitoring.setClusterId(_ctx.stringValue("ListPrometheusMonitoringResponse.Data["+ i +"].ClusterId"));
			monitoring.setMonitoringName(_ctx.stringValue("ListPrometheusMonitoringResponse.Data["+ i +"].MonitoringName"));
			monitoring.setType(_ctx.stringValue("ListPrometheusMonitoringResponse.Data["+ i +"].Type"));
			monitoring.setConfigYaml(_ctx.stringValue("ListPrometheusMonitoringResponse.Data["+ i +"].ConfigYaml"));
			monitoring.setStatus(_ctx.stringValue("ListPrometheusMonitoringResponse.Data["+ i +"].Status"));

			data.add(monitoring);
		}
		listPrometheusMonitoringResponse.setData(data);
	 
	 	return listPrometheusMonitoringResponse;
	}
}