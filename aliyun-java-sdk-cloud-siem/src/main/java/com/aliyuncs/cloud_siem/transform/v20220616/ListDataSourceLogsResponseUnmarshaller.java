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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.ListDataSourceLogsResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ListDataSourceLogsResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.ListDataSourceLogsResponse.Data.DataSourceInstanceLog;
import com.aliyuncs.cloud_siem.model.v20220616.ListDataSourceLogsResponse.Data.DataSourceInstanceLog.LogParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSourceLogsResponseUnmarshaller {

	public static ListDataSourceLogsResponse unmarshall(ListDataSourceLogsResponse listDataSourceLogsResponse, UnmarshallerContext _ctx) {
		
		listDataSourceLogsResponse.setRequestId(_ctx.stringValue("ListDataSourceLogsResponse.RequestId"));

		Data data = new Data();
		data.setSubUserId(_ctx.longValue("ListDataSourceLogsResponse.Data.SubUserId"));
		data.setDataSourceInstanceId(_ctx.stringValue("ListDataSourceLogsResponse.Data.DataSourceInstanceId"));
		data.setDataSourceInstanceName(_ctx.stringValue("ListDataSourceLogsResponse.Data.DataSourceInstanceName"));
		data.setDataSourceInstanceRemark(_ctx.stringValue("ListDataSourceLogsResponse.Data.DataSourceInstanceRemark"));
		data.setAccountId(_ctx.stringValue("ListDataSourceLogsResponse.Data.AccountId"));
		data.setCloudCode(_ctx.stringValue("ListDataSourceLogsResponse.Data.CloudCode"));

		List<DataSourceInstanceLog> dataSourceInstanceLogs = new ArrayList<DataSourceInstanceLog>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSourceLogsResponse.Data.DataSourceInstanceLogs.Length"); i++) {
			DataSourceInstanceLog dataSourceInstanceLog = new DataSourceInstanceLog();
			dataSourceInstanceLog.setLogInstanceId(_ctx.stringValue("ListDataSourceLogsResponse.Data.DataSourceInstanceLogs["+ i +"].LogInstanceId"));
			dataSourceInstanceLog.setLogCode(_ctx.stringValue("ListDataSourceLogsResponse.Data.DataSourceInstanceLogs["+ i +"].LogCode"));
			dataSourceInstanceLog.setLogMdsCode(_ctx.stringValue("ListDataSourceLogsResponse.Data.DataSourceInstanceLogs["+ i +"].LogMdsCode"));
			dataSourceInstanceLog.setTaskStatus(_ctx.integerValue("ListDataSourceLogsResponse.Data.DataSourceInstanceLogs["+ i +"].TaskStatus"));

			List<LogParam> logParams = new ArrayList<LogParam>();
			for (int j = 0; j < _ctx.lengthValue("ListDataSourceLogsResponse.Data.DataSourceInstanceLogs["+ i +"].LogParams.Length"); j++) {
				LogParam logParam = new LogParam();
				logParam.setParaCode(_ctx.stringValue("ListDataSourceLogsResponse.Data.DataSourceInstanceLogs["+ i +"].LogParams["+ j +"].ParaCode"));
				logParam.setParaValue(_ctx.stringValue("ListDataSourceLogsResponse.Data.DataSourceInstanceLogs["+ i +"].LogParams["+ j +"].ParaValue"));

				logParams.add(logParam);
			}
			dataSourceInstanceLog.setLogParams(logParams);

			dataSourceInstanceLogs.add(dataSourceInstanceLog);
		}
		data.setDataSourceInstanceLogs(dataSourceInstanceLogs);
		listDataSourceLogsResponse.setData(data);
	 
	 	return listDataSourceLogsResponse;
	}
}