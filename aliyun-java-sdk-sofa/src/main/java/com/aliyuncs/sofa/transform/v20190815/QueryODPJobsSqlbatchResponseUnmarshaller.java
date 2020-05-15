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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryODPJobsSqlbatchResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPJobsSqlbatchResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryODPJobsSqlbatchResponse.Data.SqlJobsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPJobsSqlbatchResponseUnmarshaller {

	public static QueryODPJobsSqlbatchResponse unmarshall(QueryODPJobsSqlbatchResponse queryODPJobsSqlbatchResponse, UnmarshallerContext _ctx) {
		
		queryODPJobsSqlbatchResponse.setRequestId(_ctx.stringValue("QueryODPJobsSqlbatchResponse.RequestId"));
		queryODPJobsSqlbatchResponse.setResultCode(_ctx.stringValue("QueryODPJobsSqlbatchResponse.ResultCode"));
		queryODPJobsSqlbatchResponse.setResultMessage(_ctx.stringValue("QueryODPJobsSqlbatchResponse.ResultMessage"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.Content"));
		data.setDescription(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.Description"));
		data.setErrorMsg(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.ErrorMsg"));
		data.setFinishedExecutions(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.FinishedExecutions"));
		data.setGmtCreate(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.GmtModified"));
		data.setId(_ctx.longValue("QueryODPJobsSqlbatchResponse.Data.Id"));
		data.setInstanceId(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.InstanceId"));
		data.setLastEndTime(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.LastEndTime"));
		data.setLastStartTime(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.LastStartTime"));
		data.setName(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.Name"));
		data.setSchemaName(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.SchemaName"));
		data.setSqlJobMode(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.SqlJobMode"));
		data.setStatus(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.Status"));
		data.setTotalExecutions(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.TotalExecutions"));
		data.setType(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.Type"));
		data.setUserName(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.UserName"));
		data.setZdalproxyInstanceId(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.ZdalproxyInstanceId"));

		List<SqlJobsItem> sqlJobs = new ArrayList<SqlJobsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryODPJobsSqlbatchResponse.Data.SqlJobs.Length"); i++) {
			SqlJobsItem sqlJobsItem = new SqlJobsItem();
			sqlJobsItem.setCloudInstanceId(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.SqlJobs["+ i +"].CloudInstanceId"));
			sqlJobsItem.setContent(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.SqlJobs["+ i +"].Content"));
			sqlJobsItem.setErrorMsg(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.SqlJobs["+ i +"].ErrorMsg"));
			sqlJobsItem.setGmtCreate(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.SqlJobs["+ i +"].GmtCreate"));
			sqlJobsItem.setGmtModified(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.SqlJobs["+ i +"].GmtModified"));
			sqlJobsItem.setId(_ctx.longValue("QueryODPJobsSqlbatchResponse.Data.SqlJobs["+ i +"].Id"));
			sqlJobsItem.setLastEndTime(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.SqlJobs["+ i +"].LastEndTime"));
			sqlJobsItem.setLastStartTime(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.SqlJobs["+ i +"].LastStartTime"));
			sqlJobsItem.setSqlBatchJobId(_ctx.longValue("QueryODPJobsSqlbatchResponse.Data.SqlJobs["+ i +"].SqlBatchJobId"));
			sqlJobsItem.setStatus(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.SqlJobs["+ i +"].Status"));
			sqlJobsItem.setType(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.SqlJobs["+ i +"].Type"));
			sqlJobsItem.setVariables(_ctx.stringValue("QueryODPJobsSqlbatchResponse.Data.SqlJobs["+ i +"].Variables"));

			sqlJobs.add(sqlJobsItem);
		}
		data.setSqlJobs(sqlJobs);
		queryODPJobsSqlbatchResponse.setData(data);
	 
	 	return queryODPJobsSqlbatchResponse;
	}
}