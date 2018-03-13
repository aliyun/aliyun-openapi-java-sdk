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
package com.aliyuncs.ehpc.transform.v20170714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20170714.ListClusterLogsResponse;
import com.aliyuncs.ehpc.model.v20170714.ListClusterLogsResponse.LogInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterLogsResponseUnmarshaller {

	public static ListClusterLogsResponse unmarshall(ListClusterLogsResponse listClusterLogsResponse, UnmarshallerContext context) {
		
		listClusterLogsResponse.setRequestId(context.stringValue("ListClusterLogsResponse.RequestId"));
		listClusterLogsResponse.setTotalCount(context.integerValue("ListClusterLogsResponse.TotalCount"));
		listClusterLogsResponse.setPageNumber(context.integerValue("ListClusterLogsResponse.PageNumber"));
		listClusterLogsResponse.setPageSize(context.integerValue("ListClusterLogsResponse.PageSize"));
		listClusterLogsResponse.setClusterId(context.stringValue("ListClusterLogsResponse.ClusterId"));

		List<LogInfo> logs = new ArrayList<LogInfo>();
		for (int i = 0; i < context.lengthValue("ListClusterLogsResponse.Logs.Length"); i++) {
			LogInfo logInfo = new LogInfo();
			logInfo.setOperation(context.stringValue("ListClusterLogsResponse.Logs["+ i +"].Operation"));
			logInfo.setLevel(context.stringValue("ListClusterLogsResponse.Logs["+ i +"].Level"));
			logInfo.setMessage(context.stringValue("ListClusterLogsResponse.Logs["+ i +"].Message"));
			logInfo.setCreateTime(context.stringValue("ListClusterLogsResponse.Logs["+ i +"].CreateTime"));

			logs.add(logInfo);
		}
		listClusterLogsResponse.setLogs(logs);
	 
	 	return listClusterLogsResponse;
	}
}