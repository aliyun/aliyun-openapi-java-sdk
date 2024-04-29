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

import com.aliyuncs.arms.model.v20190808.ListEnvCustomJobsResponse;
import com.aliyuncs.arms.model.v20190808.ListEnvCustomJobsResponse.Monitoring;
import com.aliyuncs.arms.model.v20190808.ListEnvCustomJobsResponse.Monitoring.ScrapeConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnvCustomJobsResponseUnmarshaller {

	public static ListEnvCustomJobsResponse unmarshall(ListEnvCustomJobsResponse listEnvCustomJobsResponse, UnmarshallerContext _ctx) {
		
		listEnvCustomJobsResponse.setRequestId(_ctx.stringValue("ListEnvCustomJobsResponse.RequestId"));
		listEnvCustomJobsResponse.setCode(_ctx.integerValue("ListEnvCustomJobsResponse.Code"));
		listEnvCustomJobsResponse.setMessage(_ctx.stringValue("ListEnvCustomJobsResponse.Message"));

		List<Monitoring> data = new ArrayList<Monitoring>();
		for (int i = 0; i < _ctx.lengthValue("ListEnvCustomJobsResponse.Data.Length"); i++) {
			Monitoring monitoring = new Monitoring();
			monitoring.setEnvironmentId(_ctx.stringValue("ListEnvCustomJobsResponse.Data["+ i +"].EnvironmentId"));
			monitoring.setRegionId(_ctx.stringValue("ListEnvCustomJobsResponse.Data["+ i +"].RegionId"));
			monitoring.setCustomJobName(_ctx.stringValue("ListEnvCustomJobsResponse.Data["+ i +"].CustomJobName"));
			monitoring.setConfigYaml(_ctx.stringValue("ListEnvCustomJobsResponse.Data["+ i +"].ConfigYaml"));
			monitoring.setStatus(_ctx.stringValue("ListEnvCustomJobsResponse.Data["+ i +"].Status"));
			monitoring.setCreationTimestamp(_ctx.stringValue("ListEnvCustomJobsResponse.Data["+ i +"].CreationTimestamp"));
			monitoring.setAddonName(_ctx.stringValue("ListEnvCustomJobsResponse.Data["+ i +"].AddonName"));
			monitoring.setAddonReleaseName(_ctx.stringValue("ListEnvCustomJobsResponse.Data["+ i +"].AddonReleaseName"));
			monitoring.setAddonVersion(_ctx.stringValue("ListEnvCustomJobsResponse.Data["+ i +"].AddonVersion"));

			List<ScrapeConfig> scrapeConfigs = new ArrayList<ScrapeConfig>();
			for (int j = 0; j < _ctx.lengthValue("ListEnvCustomJobsResponse.Data["+ i +"].ScrapeConfigs.Length"); j++) {
				ScrapeConfig scrapeConfig = new ScrapeConfig();
				scrapeConfig.setJobName(_ctx.stringValue("ListEnvCustomJobsResponse.Data["+ i +"].ScrapeConfigs["+ j +"].JobName"));
				scrapeConfig.setScrapeInterval(_ctx.stringValue("ListEnvCustomJobsResponse.Data["+ i +"].ScrapeConfigs["+ j +"].ScrapeInterval"));
				scrapeConfig.setMetricsPath(_ctx.stringValue("ListEnvCustomJobsResponse.Data["+ i +"].ScrapeConfigs["+ j +"].MetricsPath"));

				List<String> scrapeDiscoverys = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListEnvCustomJobsResponse.Data["+ i +"].ScrapeConfigs["+ j +"].ScrapeDiscoverys.Length"); k++) {
					scrapeDiscoverys.add(_ctx.stringValue("ListEnvCustomJobsResponse.Data["+ i +"].ScrapeConfigs["+ j +"].ScrapeDiscoverys["+ k +"]"));
				}
				scrapeConfig.setScrapeDiscoverys(scrapeDiscoverys);

				scrapeConfigs.add(scrapeConfig);
			}
			monitoring.setScrapeConfigs(scrapeConfigs);

			data.add(monitoring);
		}
		listEnvCustomJobsResponse.setData(data);
	 
	 	return listEnvCustomJobsResponse;
	}
}