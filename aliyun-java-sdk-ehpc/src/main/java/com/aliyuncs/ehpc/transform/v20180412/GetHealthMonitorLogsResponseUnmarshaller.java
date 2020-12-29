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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.GetHealthMonitorLogsResponse;
import com.aliyuncs.ehpc.model.v20180412.GetHealthMonitorLogsResponse.Logs;
import com.aliyuncs.ehpc.model.v20180412.GetHealthMonitorLogsResponse.Logs.CheckListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHealthMonitorLogsResponseUnmarshaller {

	public static GetHealthMonitorLogsResponse unmarshall(GetHealthMonitorLogsResponse getHealthMonitorLogsResponse, UnmarshallerContext _ctx) {
		
		getHealthMonitorLogsResponse.setRequestId(_ctx.stringValue("GetHealthMonitorLogsResponse.RequestId"));

		List<Logs> logInfo = new ArrayList<Logs>();
		for (int i = 0; i < _ctx.lengthValue("GetHealthMonitorLogsResponse.LogInfo.Length"); i++) {
			Logs logs = new Logs();
			logs.setHealthId(_ctx.stringValue("GetHealthMonitorLogsResponse.LogInfo["+ i +"].HealthId"));
			logs.setHostName(_ctx.stringValue("GetHealthMonitorLogsResponse.LogInfo["+ i +"].HostName"));
			logs.setInstanceId(_ctx.stringValue("GetHealthMonitorLogsResponse.LogInfo["+ i +"].InstanceId"));
			logs.setItemDescription(_ctx.stringValue("GetHealthMonitorLogsResponse.LogInfo["+ i +"].ItemDescription"));
			logs.setItemName(_ctx.stringValue("GetHealthMonitorLogsResponse.LogInfo["+ i +"].ItemName"));
			logs.setLevel(_ctx.stringValue("GetHealthMonitorLogsResponse.LogInfo["+ i +"].Level"));
			logs.setSceneDescription(_ctx.stringValue("GetHealthMonitorLogsResponse.LogInfo["+ i +"].SceneDescription"));
			logs.setSceneName(_ctx.stringValue("GetHealthMonitorLogsResponse.LogInfo["+ i +"].SceneName"));
			logs.setTime(_ctx.integerValue("GetHealthMonitorLogsResponse.LogInfo["+ i +"].Time"));

			List<CheckListItem> checkList = new ArrayList<CheckListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetHealthMonitorLogsResponse.LogInfo["+ i +"].CheckList.Length"); j++) {
				CheckListItem checkListItem = new CheckListItem();
				checkListItem.setCheckDescription(_ctx.stringValue("GetHealthMonitorLogsResponse.LogInfo["+ i +"].CheckList["+ j +"].CheckDescription"));
				checkListItem.setCheckInfo(_ctx.stringValue("GetHealthMonitorLogsResponse.LogInfo["+ i +"].CheckList["+ j +"].CheckInfo"));
				checkListItem.setCheckName(_ctx.stringValue("GetHealthMonitorLogsResponse.LogInfo["+ i +"].CheckList["+ j +"].CheckName"));
				checkListItem.setCheckSolution(_ctx.stringValue("GetHealthMonitorLogsResponse.LogInfo["+ i +"].CheckList["+ j +"].CheckSolution"));

				checkList.add(checkListItem);
			}
			logs.setCheckList(checkList);

			logInfo.add(logs);
		}
		getHealthMonitorLogsResponse.setLogInfo(logInfo);
	 
	 	return getHealthMonitorLogsResponse;
	}
}