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

package com.aliyuncs.mns.transform.v20210319;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mns.model.v20210319.ListProjectResponse;
import com.aliyuncs.mns.model.v20210319.ListProjectResponse.DataItem;
import com.aliyuncs.mns.model.v20210319.ListProjectResponse.DataItem.AlertsItem;
import com.aliyuncs.mns.model.v20210319.ListProjectResponse.DataItem.LogStoresItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectResponseUnmarshaller {

	public static ListProjectResponse unmarshall(ListProjectResponse listProjectResponse, UnmarshallerContext _ctx) {
		
		listProjectResponse.setRequestId(_ctx.stringValue("ListProjectResponse.RequestId"));
		listProjectResponse.setCode(_ctx.longValue("ListProjectResponse.Code"));
		listProjectResponse.setStatus(_ctx.stringValue("ListProjectResponse.Status"));
		listProjectResponse.setMessage(_ctx.stringValue("ListProjectResponse.Message"));
		listProjectResponse.setSuccess(_ctx.booleanValue("ListProjectResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setProjectName(_ctx.stringValue("ListProjectResponse.Data["+ i +"].ProjectName"));

			List<LogStoresItem> logStores = new ArrayList<LogStoresItem>();
			for (int j = 0; j < _ctx.lengthValue("ListProjectResponse.Data["+ i +"].LogStores.Length"); j++) {
				LogStoresItem logStoresItem = new LogStoresItem();
				logStoresItem.setLogStoreName(_ctx.stringValue("ListProjectResponse.Data["+ i +"].LogStores["+ j +"].LogStoreName"));

				logStores.add(logStoresItem);
			}
			dataItem.setLogStores(logStores);

			List<AlertsItem> alerts = new ArrayList<AlertsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListProjectResponse.Data["+ i +"].Alerts.Length"); j++) {
				AlertsItem alertsItem = new AlertsItem();
				alertsItem.setAlertName(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Alerts["+ j +"].AlertName"));

				alerts.add(alertsItem);
			}
			dataItem.setAlerts(alerts);

			data.add(dataItem);
		}
		listProjectResponse.setData(data);
	 
	 	return listProjectResponse;
	}
}