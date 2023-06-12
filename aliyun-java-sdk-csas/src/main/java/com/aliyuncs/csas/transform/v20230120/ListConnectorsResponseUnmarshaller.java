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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.ListConnectorsResponse;
import com.aliyuncs.csas.model.v20230120.ListConnectorsResponse.Connector;
import com.aliyuncs.csas.model.v20230120.ListConnectorsResponse.Connector.Application;
import com.aliyuncs.csas.model.v20230120.ListConnectorsResponse.Connector.UpgradeTime;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConnectorsResponseUnmarshaller {

	public static ListConnectorsResponse unmarshall(ListConnectorsResponse listConnectorsResponse, UnmarshallerContext _ctx) {
		
		listConnectorsResponse.setRequestId(_ctx.stringValue("ListConnectorsResponse.RequestId"));
		listConnectorsResponse.setTotalNum(_ctx.integerValue("ListConnectorsResponse.TotalNum"));

		List<Connector> connectors = new ArrayList<Connector>();
		for (int i = 0; i < _ctx.lengthValue("ListConnectorsResponse.Connectors.Length"); i++) {
			Connector connector = new Connector();
			connector.setConnectorId(_ctx.stringValue("ListConnectorsResponse.Connectors["+ i +"].ConnectorId"));
			connector.setName(_ctx.stringValue("ListConnectorsResponse.Connectors["+ i +"].Name"));
			connector.setRegionId(_ctx.stringValue("ListConnectorsResponse.Connectors["+ i +"].RegionId"));
			connector.setSwitchStatus(_ctx.stringValue("ListConnectorsResponse.Connectors["+ i +"].SwitchStatus"));
			connector.setStatus(_ctx.stringValue("ListConnectorsResponse.Connectors["+ i +"].Status"));
			connector.setCreateTime(_ctx.stringValue("ListConnectorsResponse.Connectors["+ i +"].CreateTime"));

			UpgradeTime upgradeTime = new UpgradeTime();
			upgradeTime.setStart(_ctx.stringValue("ListConnectorsResponse.Connectors["+ i +"].UpgradeTime.Start"));
			upgradeTime.setEnd(_ctx.stringValue("ListConnectorsResponse.Connectors["+ i +"].UpgradeTime.End"));
			connector.setUpgradeTime(upgradeTime);

			List<Application> applications = new ArrayList<Application>();
			for (int j = 0; j < _ctx.lengthValue("ListConnectorsResponse.Connectors["+ i +"].Applications.Length"); j++) {
				Application application = new Application();
				application.setApplicationId(_ctx.stringValue("ListConnectorsResponse.Connectors["+ i +"].Applications["+ j +"].ApplicationId"));
				application.setApplicationName(_ctx.stringValue("ListConnectorsResponse.Connectors["+ i +"].Applications["+ j +"].ApplicationName"));

				applications.add(application);
			}
			connector.setApplications(applications);

			connectors.add(connector);
		}
		listConnectorsResponse.setConnectors(connectors);
	 
	 	return listConnectorsResponse;
	}
}