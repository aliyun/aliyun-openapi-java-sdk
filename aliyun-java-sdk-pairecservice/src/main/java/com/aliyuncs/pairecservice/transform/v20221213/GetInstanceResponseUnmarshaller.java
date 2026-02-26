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

import com.aliyuncs.pairecservice.model.v20221213.GetInstanceResponse;
import com.aliyuncs.pairecservice.model.v20221213.GetInstanceResponse.Config;
import com.aliyuncs.pairecservice.model.v20221213.GetInstanceResponse.Config.DataManagementsItem;
import com.aliyuncs.pairecservice.model.v20221213.GetInstanceResponse.Config.EnginesItem;
import com.aliyuncs.pairecservice.model.v20221213.GetInstanceResponse.Config.MonitorsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceResponseUnmarshaller {

	public static GetInstanceResponse unmarshall(GetInstanceResponse getInstanceResponse, UnmarshallerContext _ctx) {
		
		getInstanceResponse.setRequestId(_ctx.stringValue("GetInstanceResponse.RequestId"));
		getInstanceResponse.setInstanceId(_ctx.stringValue("GetInstanceResponse.InstanceId"));
		getInstanceResponse.setType(_ctx.stringValue("GetInstanceResponse.Type"));
		getInstanceResponse.setStatus(_ctx.stringValue("GetInstanceResponse.Status"));
		getInstanceResponse.setRegionId(_ctx.stringValue("GetInstanceResponse.RegionId"));
		getInstanceResponse.setGmtCreateTime(_ctx.stringValue("GetInstanceResponse.GmtCreateTime"));
		getInstanceResponse.setGmtModifiedTime(_ctx.stringValue("GetInstanceResponse.GmtModifiedTime"));
		getInstanceResponse.setExpiredTime(_ctx.stringValue("GetInstanceResponse.ExpiredTime"));
		getInstanceResponse.setCommodityCode(_ctx.stringValue("GetInstanceResponse.CommodityCode"));
		getInstanceResponse.setChargeType(_ctx.stringValue("GetInstanceResponse.ChargeType"));

		Config config = new Config();

		List<EnginesItem> engines = new ArrayList<EnginesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceResponse.Config.Engines.Length"); i++) {
			EnginesItem enginesItem = new EnginesItem();
			enginesItem.setComponentCode(_ctx.stringValue("GetInstanceResponse.Config.Engines["+ i +"].ComponentCode"));
			enginesItem.setType(_ctx.stringValue("GetInstanceResponse.Config.Engines["+ i +"].Type"));
			enginesItem.setMeta(_ctx.mapValue("GetInstanceResponse.Config.Engines["+ i +"].Meta"));

			engines.add(enginesItem);
		}
		config.setEngines(engines);

		List<MonitorsItem> monitors = new ArrayList<MonitorsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceResponse.Config.Monitors.Length"); i++) {
			MonitorsItem monitorsItem = new MonitorsItem();
			monitorsItem.setComponentCode(_ctx.stringValue("GetInstanceResponse.Config.Monitors["+ i +"].ComponentCode"));
			monitorsItem.setType(_ctx.stringValue("GetInstanceResponse.Config.Monitors["+ i +"].Type"));
			monitorsItem.setMeta(_ctx.mapValue("GetInstanceResponse.Config.Monitors["+ i +"].Meta"));

			monitors.add(monitorsItem);
		}
		config.setMonitors(monitors);

		List<DataManagementsItem> dataManagements = new ArrayList<DataManagementsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceResponse.Config.DataManagements.Length"); i++) {
			DataManagementsItem dataManagementsItem = new DataManagementsItem();
			dataManagementsItem.setComponentCode(_ctx.stringValue("GetInstanceResponse.Config.DataManagements["+ i +"].ComponentCode"));
			dataManagementsItem.setType(_ctx.stringValue("GetInstanceResponse.Config.DataManagements["+ i +"].Type"));
			dataManagementsItem.setMeta(_ctx.mapValue("GetInstanceResponse.Config.DataManagements["+ i +"].Meta"));

			dataManagements.add(dataManagementsItem);
		}
		config.setDataManagements(dataManagements);
		getInstanceResponse.setConfig(config);
	 
	 	return getInstanceResponse;
	}
}