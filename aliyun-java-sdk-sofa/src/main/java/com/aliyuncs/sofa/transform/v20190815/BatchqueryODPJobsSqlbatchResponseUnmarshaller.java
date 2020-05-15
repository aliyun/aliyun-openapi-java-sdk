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

import com.aliyuncs.sofa.model.v20190815.BatchqueryODPJobsSqlbatchResponse;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPJobsSqlbatchResponse.Data;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPJobsSqlbatchResponse.Data.ContentItem;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPJobsSqlbatchResponse.Data.ContentItem.SqlJobsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchqueryODPJobsSqlbatchResponseUnmarshaller {

	public static BatchqueryODPJobsSqlbatchResponse unmarshall(BatchqueryODPJobsSqlbatchResponse batchqueryODPJobsSqlbatchResponse, UnmarshallerContext _ctx) {
		
		batchqueryODPJobsSqlbatchResponse.setRequestId(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.RequestId"));
		batchqueryODPJobsSqlbatchResponse.setResultCode(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.ResultCode"));
		batchqueryODPJobsSqlbatchResponse.setResultMessage(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.ResultMessage"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("BatchqueryODPJobsSqlbatchResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("BatchqueryODPJobsSqlbatchResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("BatchqueryODPJobsSqlbatchResponse.Data.Total"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchqueryODPJobsSqlbatchResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setContent(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].Content"));
			contentItem.setDescription(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].Description"));
			contentItem.setErrorMsg(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].ErrorMsg"));
			contentItem.setFinishedExecutions(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].FinishedExecutions"));
			contentItem.setGmtCreate(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].GmtCreate"));
			contentItem.setGmtModified(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].GmtModified"));
			contentItem.setId(_ctx.longValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].Id"));
			contentItem.setInstanceId(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].InstanceId"));
			contentItem.setLastEndTime(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].LastEndTime"));
			contentItem.setLastStartTime(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].LastStartTime"));
			contentItem.setName(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].Name"));
			contentItem.setSchemaName(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].SchemaName"));
			contentItem.setSqlJobMode(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].SqlJobMode"));
			contentItem.setStatus(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].Status"));
			contentItem.setTotalExecutions(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].TotalExecutions"));
			contentItem.setType(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].Type"));
			contentItem.setUserName(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].UserName"));
			contentItem.setZdalproxyInstanceId(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].ZdalproxyInstanceId"));

			List<SqlJobsItem> sqlJobs = new ArrayList<SqlJobsItem>();
			for (int j = 0; j < _ctx.lengthValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].SqlJobs.Length"); j++) {
				SqlJobsItem sqlJobsItem = new SqlJobsItem();
				sqlJobsItem.setCloudInstanceId(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].SqlJobs["+ j +"].CloudInstanceId"));
				sqlJobsItem.setContent(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].SqlJobs["+ j +"].Content"));
				sqlJobsItem.setErrorMsg(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].SqlJobs["+ j +"].ErrorMsg"));
				sqlJobsItem.setGmtCreate(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].SqlJobs["+ j +"].GmtCreate"));
				sqlJobsItem.setGmtModified(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].SqlJobs["+ j +"].GmtModified"));
				sqlJobsItem.setId(_ctx.longValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].SqlJobs["+ j +"].Id"));
				sqlJobsItem.setLastEndTime(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].SqlJobs["+ j +"].LastEndTime"));
				sqlJobsItem.setLastStartTime(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].SqlJobs["+ j +"].LastStartTime"));
				sqlJobsItem.setSqlBatchJobId(_ctx.longValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].SqlJobs["+ j +"].SqlBatchJobId"));
				sqlJobsItem.setStatus(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].SqlJobs["+ j +"].Status"));
				sqlJobsItem.setType(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].SqlJobs["+ j +"].Type"));
				sqlJobsItem.setVariables(_ctx.stringValue("BatchqueryODPJobsSqlbatchResponse.Data.Content["+ i +"].SqlJobs["+ j +"].Variables"));

				sqlJobs.add(sqlJobsItem);
			}
			contentItem.setSqlJobs(sqlJobs);

			content.add(contentItem);
		}
		data.setContent(content);
		batchqueryODPJobsSqlbatchResponse.setData(data);
	 
	 	return batchqueryODPJobsSqlbatchResponse;
	}
}