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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.ListServiceInstanceUpgradeHistoryResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.ListServiceInstanceUpgradeHistoryResponse.ServiceInstanceLogs;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceInstanceUpgradeHistoryResponseUnmarshaller {

	public static ListServiceInstanceUpgradeHistoryResponse unmarshall(ListServiceInstanceUpgradeHistoryResponse listServiceInstanceUpgradeHistoryResponse, UnmarshallerContext _ctx) {
		
		listServiceInstanceUpgradeHistoryResponse.setRequestId(_ctx.stringValue("ListServiceInstanceUpgradeHistoryResponse.RequestId"));
		listServiceInstanceUpgradeHistoryResponse.setNextToken(_ctx.stringValue("ListServiceInstanceUpgradeHistoryResponse.NextToken"));
		listServiceInstanceUpgradeHistoryResponse.setMaxResults(_ctx.stringValue("ListServiceInstanceUpgradeHistoryResponse.MaxResults"));
		listServiceInstanceUpgradeHistoryResponse.setTotalCount(_ctx.longValue("ListServiceInstanceUpgradeHistoryResponse.TotalCount"));

		List<ServiceInstanceLogs> upgradeHistory = new ArrayList<ServiceInstanceLogs>();
		for (int i = 0; i < _ctx.lengthValue("ListServiceInstanceUpgradeHistoryResponse.UpgradeHistory.Length"); i++) {
			ServiceInstanceLogs serviceInstanceLogs = new ServiceInstanceLogs();
			serviceInstanceLogs.setUpgradeHistoryId(_ctx.stringValue("ListServiceInstanceUpgradeHistoryResponse.UpgradeHistory["+ i +"].UpgradeHistoryId"));
			serviceInstanceLogs.setType(_ctx.stringValue("ListServiceInstanceUpgradeHistoryResponse.UpgradeHistory["+ i +"].Type"));
			serviceInstanceLogs.setFromVersion(_ctx.stringValue("ListServiceInstanceUpgradeHistoryResponse.UpgradeHistory["+ i +"].FromVersion"));
			serviceInstanceLogs.setToVersion(_ctx.stringValue("ListServiceInstanceUpgradeHistoryResponse.UpgradeHistory["+ i +"].ToVersion"));
			serviceInstanceLogs.setStatus(_ctx.stringValue("ListServiceInstanceUpgradeHistoryResponse.UpgradeHistory["+ i +"].Status"));
			serviceInstanceLogs.setResults(_ctx.stringValue("ListServiceInstanceUpgradeHistoryResponse.UpgradeHistory["+ i +"].Results"));
			serviceInstanceLogs.setStartTime(_ctx.stringValue("ListServiceInstanceUpgradeHistoryResponse.UpgradeHistory["+ i +"].StartTime"));
			serviceInstanceLogs.setEndTime(_ctx.stringValue("ListServiceInstanceUpgradeHistoryResponse.UpgradeHistory["+ i +"].EndTime"));

			upgradeHistory.add(serviceInstanceLogs);
		}
		listServiceInstanceUpgradeHistoryResponse.setUpgradeHistory(upgradeHistory);
	 
	 	return listServiceInstanceUpgradeHistoryResponse;
	}
}