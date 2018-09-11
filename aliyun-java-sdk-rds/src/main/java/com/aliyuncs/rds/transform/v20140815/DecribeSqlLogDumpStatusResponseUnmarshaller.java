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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DecribeSqlLogDumpStatusResponse;
import com.aliyuncs.rds.model.v20140815.DecribeSqlLogDumpStatusResponse.SqlLogDumpStatus;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DecribeSqlLogDumpStatusResponseUnmarshaller {

	public static DecribeSqlLogDumpStatusResponse unmarshall(DecribeSqlLogDumpStatusResponse decribeSqlLogDumpStatusResponse, UnmarshallerContext context) {
		
		decribeSqlLogDumpStatusResponse.setRequestId(context.stringValue("DecribeSqlLogDumpStatusResponse.RequestId"));
		decribeSqlLogDumpStatusResponse.setDBInstanceID(context.integerValue("DecribeSqlLogDumpStatusResponse.DBInstanceID"));
		decribeSqlLogDumpStatusResponse.setDBInstanceName(context.stringValue("DecribeSqlLogDumpStatusResponse.DBInstanceName"));
		decribeSqlLogDumpStatusResponse.setIsEnableSqlLogDump(context.stringValue("DecribeSqlLogDumpStatusResponse.IsEnableSqlLogDump"));

		List<SqlLogDumpStatus> items = new ArrayList<SqlLogDumpStatus>();
		for (int i = 0; i < context.lengthValue("DecribeSqlLogDumpStatusResponse.Items.Length"); i++) {
			SqlLogDumpStatus sqlLogDumpStatus = new SqlLogDumpStatus();
			sqlLogDumpStatus.setDumpStartTime(context.stringValue("DecribeSqlLogDumpStatusResponse.Items["+ i +"].DumpStartTime"));
			sqlLogDumpStatus.setJobName(context.stringValue("DecribeSqlLogDumpStatusResponse.Items["+ i +"].JobName"));
			sqlLogDumpStatus.setCreateTime(context.stringValue("DecribeSqlLogDumpStatusResponse.Items["+ i +"].CreateTime"));
			sqlLogDumpStatus.setUpdateTime(context.stringValue("DecribeSqlLogDumpStatusResponse.Items["+ i +"].UpdateTime"));
			sqlLogDumpStatus.setProcessRows(context.longValue("DecribeSqlLogDumpStatusResponse.Items["+ i +"].ProcessRows"));
			sqlLogDumpStatus.setTotalRows(context.longValue("DecribeSqlLogDumpStatusResponse.Items["+ i +"].TotalRows"));
			sqlLogDumpStatus.setJobStatus(context.stringValue("DecribeSqlLogDumpStatusResponse.Items["+ i +"].JobStatus"));
			sqlLogDumpStatus.setFailMsg(context.stringValue("DecribeSqlLogDumpStatusResponse.Items["+ i +"].FailMsg"));
			sqlLogDumpStatus.setStatus(context.integerValue("DecribeSqlLogDumpStatusResponse.Items["+ i +"].Status"));
			sqlLogDumpStatus.setErrorCode(context.stringValue("DecribeSqlLogDumpStatusResponse.Items["+ i +"].ErrorCode"));

			items.add(sqlLogDumpStatus);
		}
		decribeSqlLogDumpStatusResponse.setItems(items);
	 
	 	return decribeSqlLogDumpStatusResponse;
	}
}