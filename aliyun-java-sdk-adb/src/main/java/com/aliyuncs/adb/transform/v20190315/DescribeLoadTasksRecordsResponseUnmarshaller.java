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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeLoadTasksRecordsResponse;
import com.aliyuncs.adb.model.v20190315.DescribeLoadTasksRecordsResponse.LoadTaskRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadTasksRecordsResponseUnmarshaller {

	public static DescribeLoadTasksRecordsResponse unmarshall(DescribeLoadTasksRecordsResponse describeLoadTasksRecordsResponse, UnmarshallerContext _ctx) {
		
		describeLoadTasksRecordsResponse.setRequestId(_ctx.stringValue("DescribeLoadTasksRecordsResponse.RequestId"));
		describeLoadTasksRecordsResponse.setTotalCount(_ctx.stringValue("DescribeLoadTasksRecordsResponse.TotalCount"));
		describeLoadTasksRecordsResponse.setPageSize(_ctx.stringValue("DescribeLoadTasksRecordsResponse.PageSize"));
		describeLoadTasksRecordsResponse.setPageNumber(_ctx.stringValue("DescribeLoadTasksRecordsResponse.PageNumber"));
		describeLoadTasksRecordsResponse.setDBClusterId(_ctx.stringValue("DescribeLoadTasksRecordsResponse.DBClusterId"));

		List<LoadTaskRecord> loadTasksRecords = new ArrayList<LoadTaskRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadTasksRecordsResponse.LoadTasksRecords.Length"); i++) {
			LoadTaskRecord loadTaskRecord = new LoadTaskRecord();
			loadTaskRecord.setProcessRows(_ctx.longValue("DescribeLoadTasksRecordsResponse.LoadTasksRecords["+ i +"].ProcessRows"));
			loadTaskRecord.setState(_ctx.stringValue("DescribeLoadTasksRecordsResponse.LoadTasksRecords["+ i +"].State"));
			loadTaskRecord.setCreateTime(_ctx.stringValue("DescribeLoadTasksRecordsResponse.LoadTasksRecords["+ i +"].CreateTime"));
			loadTaskRecord.setJobName(_ctx.stringValue("DescribeLoadTasksRecordsResponse.LoadTasksRecords["+ i +"].JobName"));
			loadTaskRecord.setUpdateTime(_ctx.stringValue("DescribeLoadTasksRecordsResponse.LoadTasksRecords["+ i +"].UpdateTime"));
			loadTaskRecord.setDBName(_ctx.stringValue("DescribeLoadTasksRecordsResponse.LoadTasksRecords["+ i +"].DBName"));
			loadTaskRecord.setProcessID(_ctx.stringValue("DescribeLoadTasksRecordsResponse.LoadTasksRecords["+ i +"].ProcessID"));
			loadTaskRecord.setSql(_ctx.stringValue("DescribeLoadTasksRecordsResponse.LoadTasksRecords["+ i +"].Sql"));

			loadTasksRecords.add(loadTaskRecord);
		}
		describeLoadTasksRecordsResponse.setLoadTasksRecords(loadTasksRecords);
	 
	 	return describeLoadTasksRecordsResponse;
	}
}