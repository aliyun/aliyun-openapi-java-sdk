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

package com.aliyuncs.selectdb.transform.v20230522;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.selectdb.model.v20230522.DescribeDBClusterConfigChangeLogsResponse;
import com.aliyuncs.selectdb.model.v20230522.DescribeDBClusterConfigChangeLogsResponse.Data;
import com.aliyuncs.selectdb.model.v20230522.DescribeDBClusterConfigChangeLogsResponse.Data.ParamChangeLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterConfigChangeLogsResponseUnmarshaller {

	public static DescribeDBClusterConfigChangeLogsResponse unmarshall(DescribeDBClusterConfigChangeLogsResponse describeDBClusterConfigChangeLogsResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterConfigChangeLogsResponse.setRequestId(_ctx.stringValue("DescribeDBClusterConfigChangeLogsResponse.RequestId"));
		describeDBClusterConfigChangeLogsResponse.setDynamicCode(_ctx.stringValue("DescribeDBClusterConfigChangeLogsResponse.DynamicCode"));
		describeDBClusterConfigChangeLogsResponse.setDynamicMessage(_ctx.stringValue("DescribeDBClusterConfigChangeLogsResponse.DynamicMessage"));
		describeDBClusterConfigChangeLogsResponse.setAccessDeniedDetail(_ctx.stringValue("DescribeDBClusterConfigChangeLogsResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setDbInstanceName(_ctx.stringValue("DescribeDBClusterConfigChangeLogsResponse.Data.DbInstanceName"));
		data.setDbInstanceId(_ctx.stringValue("DescribeDBClusterConfigChangeLogsResponse.Data.DbInstanceId"));
		data.setDbClusterId(_ctx.stringValue("DescribeDBClusterConfigChangeLogsResponse.Data.DbClusterId"));
		data.setTaskId(_ctx.integerValue("DescribeDBClusterConfigChangeLogsResponse.Data.TaskId"));

		List<ParamChangeLog> paramChangeLogs = new ArrayList<ParamChangeLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterConfigChangeLogsResponse.Data.ParamChangeLogs.Length"); i++) {
			ParamChangeLog paramChangeLog = new ParamChangeLog();
			paramChangeLog.setId(_ctx.longValue("DescribeDBClusterConfigChangeLogsResponse.Data.ParamChangeLogs["+ i +"].Id"));
			paramChangeLog.setName(_ctx.stringValue("DescribeDBClusterConfigChangeLogsResponse.Data.ParamChangeLogs["+ i +"].Name"));
			paramChangeLog.setOldValue(_ctx.stringValue("DescribeDBClusterConfigChangeLogsResponse.Data.ParamChangeLogs["+ i +"].OldValue"));
			paramChangeLog.setNewValue(_ctx.stringValue("DescribeDBClusterConfigChangeLogsResponse.Data.ParamChangeLogs["+ i +"].NewValue"));
			paramChangeLog.setIsApplied(_ctx.booleanValue("DescribeDBClusterConfigChangeLogsResponse.Data.ParamChangeLogs["+ i +"].IsApplied"));
			paramChangeLog.setGmtCreated(_ctx.stringValue("DescribeDBClusterConfigChangeLogsResponse.Data.ParamChangeLogs["+ i +"].GmtCreated"));
			paramChangeLog.setGmtModified(_ctx.stringValue("DescribeDBClusterConfigChangeLogsResponse.Data.ParamChangeLogs["+ i +"].GmtModified"));

			paramChangeLogs.add(paramChangeLog);
		}
		data.setParamChangeLogs(paramChangeLogs);
		describeDBClusterConfigChangeLogsResponse.setData(data);
	 
	 	return describeDBClusterConfigChangeLogsResponse;
	}
}