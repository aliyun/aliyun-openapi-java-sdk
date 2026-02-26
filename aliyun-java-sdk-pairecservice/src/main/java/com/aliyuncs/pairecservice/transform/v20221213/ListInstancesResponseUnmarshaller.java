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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.ListInstancesResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListInstancesResponse.InstancesItem;
import com.aliyuncs.pairecservice.model.v20221213.ListInstancesResponse.InstancesItem.Config;
import com.aliyuncs.pairecservice.model.v20221213.ListInstancesResponse.InstancesItem.Config.DataManagementsItem;
import com.aliyuncs.pairecservice.model.v20221213.ListInstancesResponse.InstancesItem.Config.EnginesItem;
import com.aliyuncs.pairecservice.model.v20221213.ListInstancesResponse.InstancesItem.Config.MonitorsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setTotalCount(_ctx.integerValue("ListInstancesResponse.TotalCount"));

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceId"));
			instancesItem.setType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Type"));
			instancesItem.setStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Status"));
			instancesItem.setRegionId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].RegionId"));
			instancesItem.setGmtCreateTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].GmtCreateTime"));
			instancesItem.setGmtModifiedTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].GmtModifiedTime"));
			instancesItem.setExpiredTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ExpiredTime"));
			instancesItem.setCommodityCode(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].CommodityCode"));
			instancesItem.setChargeType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ChargeType"));

			Config config = new Config();

			List<EnginesItem> engines = new ArrayList<EnginesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.Instances["+ i +"].Config.Engines.Length"); j++) {
				EnginesItem enginesItem = new EnginesItem();
				enginesItem.setComponentCode(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Config.Engines["+ j +"].ComponentCode"));
				enginesItem.setType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Config.Engines["+ j +"].Type"));
				enginesItem.setMeta(_ctx.mapValue("ListInstancesResponse.Instances["+ i +"].Config.Engines["+ j +"].Meta"));

				engines.add(enginesItem);
			}
			config.setEngines(engines);

			List<MonitorsItem> monitors = new ArrayList<MonitorsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.Instances["+ i +"].Config.Monitors.Length"); j++) {
				MonitorsItem monitorsItem = new MonitorsItem();
				monitorsItem.setComponentCode(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Config.Monitors["+ j +"].ComponentCode"));
				monitorsItem.setType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Config.Monitors["+ j +"].Type"));
				monitorsItem.setMeta(_ctx.mapValue("ListInstancesResponse.Instances["+ i +"].Config.Monitors["+ j +"].Meta"));

				monitors.add(monitorsItem);
			}
			config.setMonitors(monitors);

			List<DataManagementsItem> dataManagements = new ArrayList<DataManagementsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.Instances["+ i +"].Config.DataManagements.Length"); j++) {
				DataManagementsItem dataManagementsItem = new DataManagementsItem();
				dataManagementsItem.setComponentCode(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Config.DataManagements["+ j +"].ComponentCode"));
				dataManagementsItem.setType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Config.DataManagements["+ j +"].Type"));
				dataManagementsItem.setMeta(_ctx.mapValue("ListInstancesResponse.Instances["+ i +"].Config.DataManagements["+ j +"].Meta"));

				dataManagements.add(dataManagementsItem);
			}
			config.setDataManagements(dataManagements);
			instancesItem.setConfig(config);

			instances.add(instancesItem);
		}
		listInstancesResponse.setInstances(instances);
	 
	 	return listInstancesResponse;
	}
}