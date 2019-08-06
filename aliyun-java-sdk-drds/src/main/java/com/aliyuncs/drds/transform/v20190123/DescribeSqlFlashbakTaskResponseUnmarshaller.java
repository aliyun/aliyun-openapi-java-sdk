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

	public static DescribeSqlFlashbakTaskResponse unmarshall(DescribeSqlFlashbakTaskResponse describeSqlFlashbakTaskResponse, UnmarshallerContext _ctx) {
		
		describeSqlFlashbakTaskResponse.setRequestId(_ctx.stringValue("DescribeSqlFlashbakTaskResponse.RequestId"));
		describeSqlFlashbakTaskResponse.setSuccess(_ctx.booleanValue("DescribeSqlFlashbakTaskResponse.Success"));

		List<SqlFlashbackTask> sqlFlashbackTasks = new ArrayList<SqlFlashbackTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks.Length"); i++) {
			SqlFlashbackTask sqlFlashbackTask = new SqlFlashbackTask();
			sqlFlashbackTask.setId(_ctx.longValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].Id"));
			sqlFlashbackTask.setGmtCreate(_ctx.longValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].GmtCreate"));
			sqlFlashbackTask.setGmtModified(_ctx.longValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].GmtModified"));
			sqlFlashbackTask.setInstId(_ctx.stringValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].InstId"));
			sqlFlashbackTask.setDbName(_ctx.stringValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].DbName"));
			sqlFlashbackTask.setSearchStartTime(_ctx.longValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].SearchStartTime"));
			sqlFlashbackTask.setSearchEndTime(_ctx.longValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].SearchEndTime"));
			sqlFlashbackTask.setTableName(_ctx.stringValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].TableName"));
			sqlFlashbackTask.setTraceId(_ctx.stringValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].TraceId"));
			sqlFlashbackTask.setSqlType(_ctx.stringValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].SqlType"));
			sqlFlashbackTask.setSqlPk(_ctx.stringValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].SqlPk"));
			sqlFlashbackTask.setRecallType(_ctx.integerValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].RecallType"));
			sqlFlashbackTask.setRecallStatus(_ctx.integerValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].RecallStatus"));
			sqlFlashbackTask.setRecallProgress(_ctx.integerValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].RecallProgress"));
			sqlFlashbackTask.setRecallRestoreType(_ctx.integerValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].RecallRestoreType"));
			sqlFlashbackTask.setDownloadUrl(_ctx.stringValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].DownloadUrl"));
			sqlFlashbackTask.setExpireTime(_ctx.longValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].ExpireTime"));
			sqlFlashbackTask.setSqlCounter(_ctx.longValue("DescribeSqlFlashbakTaskResponse.SqlFlashbackTasks["+ i +"].SqlCounter"));

			sqlFlashbackTasks.add(sqlFlashbackTask);
		}
		describeSqlFlashbakTaskResponse.setSqlFlashbackTasks(sqlFlashbackTasks);
	 
	 	return describeSqlFlashbakTaskResponse;
	}
}