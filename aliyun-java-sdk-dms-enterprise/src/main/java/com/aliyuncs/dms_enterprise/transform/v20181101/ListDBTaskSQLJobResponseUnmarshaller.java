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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListDBTaskSQLJobResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDBTaskSQLJobResponse.DBTaskSQLJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDBTaskSQLJobResponseUnmarshaller {

	public static ListDBTaskSQLJobResponse unmarshall(ListDBTaskSQLJobResponse listDBTaskSQLJobResponse, UnmarshallerContext _ctx) {
		
		listDBTaskSQLJobResponse.setRequestId(_ctx.stringValue("ListDBTaskSQLJobResponse.RequestId"));
		listDBTaskSQLJobResponse.setTotalCount(_ctx.longValue("ListDBTaskSQLJobResponse.TotalCount"));
		listDBTaskSQLJobResponse.setErrorCode(_ctx.stringValue("ListDBTaskSQLJobResponse.ErrorCode"));
		listDBTaskSQLJobResponse.setErrorMessage(_ctx.stringValue("ListDBTaskSQLJobResponse.ErrorMessage"));
		listDBTaskSQLJobResponse.setSuccess(_ctx.booleanValue("ListDBTaskSQLJobResponse.Success"));

		List<DBTaskSQLJob> dBTaskSQLJobList = new ArrayList<DBTaskSQLJob>();
		for (int i = 0; i < _ctx.lengthValue("ListDBTaskSQLJobResponse.DBTaskSQLJobList.Length"); i++) {
			DBTaskSQLJob dBTaskSQLJob = new DBTaskSQLJob();
			dBTaskSQLJob.setStatus(_ctx.stringValue("ListDBTaskSQLJobResponse.DBTaskSQLJobList["+ i +"].Status"));
			dBTaskSQLJob.setComment(_ctx.stringValue("ListDBTaskSQLJobResponse.DBTaskSQLJobList["+ i +"].Comment"));
			dBTaskSQLJob.setLastExecTime(_ctx.stringValue("ListDBTaskSQLJobResponse.DBTaskSQLJobList["+ i +"].LastExecTime"));
			dBTaskSQLJob.setDbSearchName(_ctx.stringValue("ListDBTaskSQLJobResponse.DBTaskSQLJobList["+ i +"].DbSearchName"));
			dBTaskSQLJob.setJobType(_ctx.stringValue("ListDBTaskSQLJobResponse.DBTaskSQLJobList["+ i +"].JobType"));
			dBTaskSQLJob.setCreateTime(_ctx.stringValue("ListDBTaskSQLJobResponse.DBTaskSQLJobList["+ i +"].CreateTime"));
			dBTaskSQLJob.setDbTaskGroupId(_ctx.longValue("ListDBTaskSQLJobResponse.DBTaskSQLJobList["+ i +"].DbTaskGroupId"));
			dBTaskSQLJob.setDbId(_ctx.longValue("ListDBTaskSQLJobResponse.DBTaskSQLJobList["+ i +"].DbId"));
			dBTaskSQLJob.setLogic(_ctx.booleanValue("ListDBTaskSQLJobResponse.DBTaskSQLJobList["+ i +"].Logic"));
			dBTaskSQLJob.setJobId(_ctx.longValue("ListDBTaskSQLJobResponse.DBTaskSQLJobList["+ i +"].JobId"));
			dBTaskSQLJob.setTransactional(_ctx.booleanValue("ListDBTaskSQLJobResponse.DBTaskSQLJobList["+ i +"].Transactional"));

			dBTaskSQLJobList.add(dBTaskSQLJob);
		}
		listDBTaskSQLJobResponse.setDBTaskSQLJobList(dBTaskSQLJobList);
	 
	 	return listDBTaskSQLJobResponse;
	}
}