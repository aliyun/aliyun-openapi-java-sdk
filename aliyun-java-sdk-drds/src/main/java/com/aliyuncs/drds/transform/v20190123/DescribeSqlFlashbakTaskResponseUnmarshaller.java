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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeSqlFlashbakTaskResponse;
import com.aliyuncs.drds.model.v20190123.DescribeSqlFlashbakTaskResponse.SqlFlashbackTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSqlFlashbakTaskResponseUnmarshaller {

	public static DescribeSqlFlashbakTaskResponse unmarshall(DescribeSqlFlashbakTaskResponse describeSqlFlashbakTaskResponse, UnmarshallerContext context) {
		
		describeSqlFlashbakTaskResponse.setRequestId(context.stringValue("DescribeSqlFlashbakTaskResponse.RequestId"));
		describeSqlFlashbakTaskResponse.setSuccess(context.booleanValue("DescribeSqlFlashbakTaskResponse.Success"));

		List<SqlFlashbackTask> sqlFlashbackTasks = new ArrayList<SqlFlashbackTask>();
		for (int i = 0; i < context.lengthValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks.Length"); i++) {
			SqlFlashbackTask sqlFlashbackTask = new SqlFlashbackTask();
			sqlFlashbackTask.setId(context.longValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].Id"));
			sqlFlashbackTask.setGmtCreate(context.longValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].GmtCreate"));
			sqlFlashbackTask.setGmtModified(context.longValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].GmtModified"));
			sqlFlashbackTask.setInstId(context.stringValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].InstId"));
			sqlFlashbackTask.setDbName(context.stringValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].DbName"));
			sqlFlashbackTask.setSearchStartTime(context.longValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].SearchStartTime"));
			sqlFlashbackTask.setSearchEndTime(context.longValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].SearchEndTime"));
			sqlFlashbackTask.setTableName(context.stringValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].TableName"));
			sqlFlashbackTask.setTraceId(context.stringValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].TraceId"));
			sqlFlashbackTask.setSqlType(context.stringValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].SqlType"));
			sqlFlashbackTask.setSqlPk(context.stringValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].SqlPk"));
			sqlFlashbackTask.setRecallType(context.integerValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].RecallType"));
			sqlFlashbackTask.setRecallStatus(context.integerValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].RecallStatus"));
			sqlFlashbackTask.setRecallProgress(context.integerValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].RecallProgress"));
			sqlFlashbackTask.setRecallRestoreType(context.integerValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].RecallRestoreType"));
			sqlFlashbackTask.setDownloadUrl(context.stringValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].DownloadUrl"));
			sqlFlashbackTask.setExpireTime(context.longValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].ExpireTime"));
			sqlFlashbackTask.setSqlCounter(context.longValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].SqlCounter"));

			sqlFlashbackTasks.add(sqlFlashbackTask);
		}
		describeSqlFlashbakTaskResponse.setSqlFlashbackTasks(sqlFlashbackTasks);
	 
	 	return describeSqlFlashbakTaskResponse;
	}
}