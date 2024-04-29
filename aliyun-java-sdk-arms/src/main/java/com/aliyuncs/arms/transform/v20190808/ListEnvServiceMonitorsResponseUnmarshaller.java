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

import com.aliyuncs.arms.model.v20190808.ListEnvServiceMonitorsResponse;
import com.aliyuncs.arms.model.v20190808.ListEnvServiceMonitorsResponse.Monitoring;
import com.aliyuncs.arms.model.v20190808.ListEnvServiceMonitorsResponse.Monitoring.Endpoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnvServiceMonitorsResponseUnmarshaller {

	public static ListEnvServiceMonitorsResponse unmarshall(ListEnvServiceMonitorsResponse listEnvServiceMonitorsResponse, UnmarshallerContext _ctx) {
		
		listEnvServiceMonitorsResponse.setRequestId(_ctx.stringValue("ListEnvServiceMonitorsResponse.RequestId"));
		listEnvServiceMonitorsResponse.setCode(_ctx.integerValue("ListEnvServiceMonitorsResponse.Code"));
		listEnvServiceMonitorsResponse.setMessage(_ctx.stringValue("ListEnvServiceMonitorsResponse.Message"));

		List<Monitoring> data = new ArrayList<Monitoring>();
		for (int i = 0; i < _ctx.lengthValue("ListEnvServiceMonitorsResponse.Data.Length"); i++) {
			Monitoring monitoring = new Monitoring();
			monitoring.setRegionId(_ctx.stringValue("ListEnvServiceMonitorsResponse.Data["+ i +"].RegionId"));
			monitoring.setEnvironmentId(_ctx.stringValue("ListEnvServiceMonitorsResponse.Data["+ i +"].EnvironmentId"));
			monitoring.setNamespace(_ctx.stringValue("ListEnvServiceMonitorsResponse.Data["+ i +"].Namespace"));
			monitoring.setServiceMonitorName(_ctx.stringValue("ListEnvServiceMonitorsResponse.Data["+ i +"].ServiceMonitorName"));
			monitoring.setConfigYaml(_ctx.stringValue("ListEnvServiceMonitorsResponse.Data["+ i +"].ConfigYaml"));
			monitoring.setStatus(_ctx.stringValue("ListEnvServiceMonitorsResponse.Data["+ i +"].Status"));
			monitoring.setCreationTimestamp(_ctx.stringValue("ListEnvServiceMonitorsResponse.Data["+ i +"].CreationTimestamp"));
			monitoring.setAddonName(_ctx.stringValue("ListEnvServiceMonitorsResponse.Data["+ i +"].AddonName"));
			monitoring.setAddonReleaseName(_ctx.stringValue("ListEnvServiceMonitorsResponse.Data["+ i +"].AddonReleaseName"));
			monitoring.setAddonVersion(_ctx.stringValue("ListEnvServiceMonitorsResponse.Data["+ i +"].AddonVersion"));
			monitoring.setMatchedServiceCount(_ctx.integerValue("ListEnvServiceMonitorsResponse.Data["+ i +"].MatchedServiceCount"));

			List<Endpoint> endpoints = new ArrayList<Endpoint>();
			for (int j = 0; j < _ctx.lengthValue("ListEnvServiceMonitorsResponse.Data["+ i +"].Endpoints.Length"); j++) {
				Endpoint endpoint = new Endpoint();
				endpoint.setPort(_ctx.stringValue("ListEnvServiceMonitorsResponse.Data["+ i +"].Endpoints["+ j +"].Port"));
				endpoint.setTargetPort(_ctx.integerValue("ListEnvServiceMonitorsResponse.Data["+ i +"].Endpoints["+ j +"].TargetPort"));
				endpoint.setPath(_ctx.stringValue("ListEnvServiceMonitorsResponse.Data["+ i +"].Endpoints["+ j +"].Path"));
				endpoint.setInterval(_ctx.stringValue("ListEnvServiceMonitorsResponse.Data["+ i +"].Endpoints["+ j +"].Interval"));
				endpoint.setMatchedTargetCount(_ctx.integerValue("ListEnvServiceMonitorsResponse.Data["+ i +"].Endpoints["+ j +"].MatchedTargetCount"));

				endpoints.add(endpoint);
			}
			monitoring.setEndpoints(endpoints);

			data.add(monitoring);
		}
		listEnvServiceMonitorsResponse.setData(data);
	 
	 	return listEnvServiceMonitorsResponse;
	}
}