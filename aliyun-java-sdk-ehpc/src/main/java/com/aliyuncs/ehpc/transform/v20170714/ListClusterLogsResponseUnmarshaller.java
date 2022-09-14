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

	public static ListClusterLogsResponse unmarshall(ListClusterLogsResponse listClusterLogsResponse, UnmarshallerContext _ctx) {
		
		listClusterLogsResponse.setRequestId(_ctx.stringValue("ListClusterLogsResponse.RequestId"));
		listClusterLogsResponse.setPageSize(_ctx.integerValue("ListClusterLogsResponse.PageSize"));
		listClusterLogsResponse.setPageNumber(_ctx.integerValue("ListClusterLogsResponse.PageNumber"));
		listClusterLogsResponse.setTotalCount(_ctx.integerValue("ListClusterLogsResponse.TotalCount"));
		listClusterLogsResponse.setClusterId(_ctx.stringValue("ListClusterLogsResponse.ClusterId"));

		List<LogInfo> logs = new ArrayList<LogInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterLogsResponse.Logs.Length"); i++) {
			LogInfo logInfo = new LogInfo();
			logInfo.setOperation(_ctx.stringValue("ListClusterLogsResponse.Logs["+ i +"].Operation"));
			logInfo.setMessage(_ctx.stringValue("ListClusterLogsResponse.Logs["+ i +"].Message"));
			logInfo.setCreateTime(_ctx.stringValue("ListClusterLogsResponse.Logs["+ i +"].CreateTime"));
			logInfo.setLevel(_ctx.stringValue("ListClusterLogsResponse.Logs["+ i +"].Level"));

			logs.add(logInfo);
		}
		listClusterLogsResponse.setLogs(logs);
	 
	 	return listClusterLogsResponse;
	}
}