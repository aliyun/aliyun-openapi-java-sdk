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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeMacConfigResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeMacConfigResponse.Config;
import com.aliyuncs.aegis.model.v20161111.DescribeMacConfigResponse.Config.Target;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMacConfigResponseUnmarshaller {

	public static DescribeMacConfigResponse unmarshall(DescribeMacConfigResponse describeMacConfigResponse, UnmarshallerContext context) {
		
		describeMacConfigResponse.setRequestId(context.stringValue("DescribeMacConfigResponse.RequestId"));
		describeMacConfigResponse.setCount(context.integerValue("DescribeMacConfigResponse.Count"));
		describeMacConfigResponse.setPageSize(context.integerValue("DescribeMacConfigResponse.PageSize"));
		describeMacConfigResponse.setCurrentPage(context.integerValue("DescribeMacConfigResponse.CurrentPage"));
		describeMacConfigResponse.setTotalCount(context.integerValue("DescribeMacConfigResponse.TotalCount"));

		List<Config> configs = new ArrayList<Config>();
		for (int i = 0; i < context.lengthValue("DescribeMacConfigResponse.Configs.Length"); i++) {
			Config config = new Config();
			config.setStartTime(context.stringValue("DescribeMacConfigResponse.Configs["+ i +"].StartTime"));
			config.setEndTime(context.stringValue("DescribeMacConfigResponse.Configs["+ i +"].EndTime"));
			config.setIp(context.stringValue("DescribeMacConfigResponse.Configs["+ i +"].Ip"));
			config.setStrategyId(context.longValue("DescribeMacConfigResponse.Configs["+ i +"].StrategyId"));
			config.setAccount(context.stringValue("DescribeMacConfigResponse.Configs["+ i +"].Account"));
			config.setLocation(context.stringValue("DescribeMacConfigResponse.Configs["+ i +"].Location"));
			config.setSwitcher(context.stringValue("DescribeMacConfigResponse.Configs["+ i +"].Switcher"));
			config.setVulType(context.stringValue("DescribeMacConfigResponse.Configs["+ i +"].VulType"));
			config.setUuidCount(context.integerValue("DescribeMacConfigResponse.Configs["+ i +"].UuidCount"));
			config.setTotalCount(context.integerValue("DescribeMacConfigResponse.Configs["+ i +"].TotalCount"));

			List<Target> targetList = new ArrayList<Target>();
			for (int j = 0; j < context.lengthValue("DescribeMacConfigResponse.Configs["+ i +"].TargetList.Length"); j++) {
				Target target = new Target();
				target.setFlag(context.stringValue("DescribeMacConfigResponse.Configs["+ i +"].TargetList["+ j +"].Flag"));
				target.setTargetType(context.stringValue("DescribeMacConfigResponse.Configs["+ i +"].TargetList["+ j +"].TargetType"));
				target.setTarget(context.stringValue("DescribeMacConfigResponse.Configs["+ i +"].TargetList["+ j +"].Target"));

				targetList.add(target);
			}
			config.setTargetList(targetList);

			configs.add(config);
		}
		describeMacConfigResponse.setConfigs(configs);
	 
	 	return describeMacConfigResponse;
	}
}