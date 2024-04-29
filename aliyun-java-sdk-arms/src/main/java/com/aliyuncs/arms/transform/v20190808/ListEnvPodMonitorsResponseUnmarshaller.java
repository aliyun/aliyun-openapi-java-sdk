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

import com.aliyuncs.arms.model.v20190808.ListEnvPodMonitorsResponse;
import com.aliyuncs.arms.model.v20190808.ListEnvPodMonitorsResponse.Monitoring;
import com.aliyuncs.arms.model.v20190808.ListEnvPodMonitorsResponse.Monitoring.Endpoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnvPodMonitorsResponseUnmarshaller {

	public static ListEnvPodMonitorsResponse unmarshall(ListEnvPodMonitorsResponse listEnvPodMonitorsResponse, UnmarshallerContext _ctx) {
		
		listEnvPodMonitorsResponse.setRequestId(_ctx.stringValue("ListEnvPodMonitorsResponse.RequestId"));
		listEnvPodMonitorsResponse.setCode(_ctx.integerValue("ListEnvPodMonitorsResponse.Code"));
		listEnvPodMonitorsResponse.setMessage(_ctx.stringValue("ListEnvPodMonitorsResponse.Message"));

		List<Monitoring> data = new ArrayList<Monitoring>();
		for (int i = 0; i < _ctx.lengthValue("ListEnvPodMonitorsResponse.Data.Length"); i++) {
			Monitoring monitoring = new Monitoring();
			monitoring.setRegionId(_ctx.stringValue("ListEnvPodMonitorsResponse.Data["+ i +"].RegionId"));
			monitoring.setEnvironmentId(_ctx.stringValue("ListEnvPodMonitorsResponse.Data["+ i +"].EnvironmentId"));
			monitoring.setNamespace(_ctx.stringValue("ListEnvPodMonitorsResponse.Data["+ i +"].Namespace"));
			monitoring.setPodMonitorName(_ctx.stringValue("ListEnvPodMonitorsResponse.Data["+ i +"].PodMonitorName"));
			monitoring.setConfigYaml(_ctx.stringValue("ListEnvPodMonitorsResponse.Data["+ i +"].ConfigYaml"));
			monitoring.setStatus(_ctx.stringValue("ListEnvPodMonitorsResponse.Data["+ i +"].Status"));
			monitoring.setCreationTimestamp(_ctx.stringValue("ListEnvPodMonitorsResponse.Data["+ i +"].CreationTimestamp"));
			monitoring.setAddonName(_ctx.stringValue("ListEnvPodMonitorsResponse.Data["+ i +"].AddonName"));
			monitoring.setAddonReleaseName(_ctx.stringValue("ListEnvPodMonitorsResponse.Data["+ i +"].AddonReleaseName"));
			monitoring.setAddonVersion(_ctx.stringValue("ListEnvPodMonitorsResponse.Data["+ i +"].AddonVersion"));

			List<Endpoint> endpoints = new ArrayList<Endpoint>();
			for (int j = 0; j < _ctx.lengthValue("ListEnvPodMonitorsResponse.Data["+ i +"].Endpoints.Length"); j++) {
				Endpoint endpoint = new Endpoint();
				endpoint.setPort(_ctx.stringValue("ListEnvPodMonitorsResponse.Data["+ i +"].Endpoints["+ j +"].Port"));
				endpoint.setTargetPort(_ctx.integerValue("ListEnvPodMonitorsResponse.Data["+ i +"].Endpoints["+ j +"].TargetPort"));
				endpoint.setPath(_ctx.stringValue("ListEnvPodMonitorsResponse.Data["+ i +"].Endpoints["+ j +"].Path"));
				endpoint.setInterval(_ctx.stringValue("ListEnvPodMonitorsResponse.Data["+ i +"].Endpoints["+ j +"].Interval"));
				endpoint.setMatchedTargetCount(_ctx.integerValue("ListEnvPodMonitorsResponse.Data["+ i +"].Endpoints["+ j +"].MatchedTargetCount"));

				endpoints.add(endpoint);
			}
			monitoring.setEndpoints(endpoints);

			data.add(monitoring);
		}
		listEnvPodMonitorsResponse.setData(data);
	 
	 	return listEnvPodMonitorsResponse;
	}
}