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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeDataBackupsResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDataBackupsResponse.Backup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataBackupsResponseUnmarshaller {

	public static DescribeDataBackupsResponse unmarshall(DescribeDataBackupsResponse describeDataBackupsResponse, UnmarshallerContext _ctx) {
		
		describeDataBackupsResponse.setRequestId(_ctx.stringValue("DescribeDataBackupsResponse.RequestId"));
		describeDataBackupsResponse.setTotalCount(_ctx.integerValue("DescribeDataBackupsResponse.TotalCount"));
		describeDataBackupsResponse.setPageNumber(_ctx.integerValue("DescribeDataBackupsResponse.PageNumber"));
		describeDataBackupsResponse.setPageSize(_ctx.integerValue("DescribeDataBackupsResponse.PageSize"));

		List<Backup> items = new ArrayList<Backup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataBackupsResponse.Items.Length"); i++) {
			Backup backup = new Backup();
			backup.setBackupSetId(_ctx.stringValue("DescribeDataBackupsResponse.Items["+ i +"].BackupSetId"));
			backup.setDBInstanceId(_ctx.stringValue("DescribeDataBackupsResponse.Items["+ i +"].DBInstanceId"));
			backup.setBackupStartTime(_ctx.stringValue("DescribeDataBackupsResponse.Items["+ i +"].BackupStartTime"));
			backup.setBackupEndTime(_ctx.stringValue("DescribeDataBackupsResponse.Items["+ i +"].BackupEndTime"));
			backup.setDataType(_ctx.stringValue("DescribeDataBackupsResponse.Items["+ i +"].DataType"));
			backup.setBackupMode(_ctx.stringValue("DescribeDataBackupsResponse.Items["+ i +"].BackupMode"));
			backup.setConsistentTime(_ctx.longValue("DescribeDataBackupsResponse.Items["+ i +"].ConsistentTime"));
			backup.setBackupStatus(_ctx.stringValue("DescribeDataBackupsResponse.Items["+ i +"].BackupStatus"));
			backup.setBackupSize(_ctx.longValue("DescribeDataBackupsResponse.Items["+ i +"].BackupSize"));
			backup.setBaksetName(_ctx.stringValue("DescribeDataBackupsResponse.Items["+ i +"].BaksetName"));
			backup.setBackupStartTimeLocal(_ctx.stringValue("DescribeDataBackupsResponse.Items["+ i +"].BackupStartTimeLocal"));
			backup.setBackupEndTimeLocal(_ctx.stringValue("DescribeDataBackupsResponse.Items["+ i +"].BackupEndTimeLocal"));

			items.add(backup);
		}
		describeDataBackupsResponse.setItems(items);
	 
	 	return describeDataBackupsResponse;
	}
}