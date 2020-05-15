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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.DescribeBackupTablesResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeBackupTablesResponse.BackupRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupTablesResponseUnmarshaller {

	public static DescribeBackupTablesResponse unmarshall(DescribeBackupTablesResponse describeBackupTablesResponse, UnmarshallerContext _ctx) {
		
		describeBackupTablesResponse.setRequestId(_ctx.stringValue("DescribeBackupTablesResponse.RequestId"));
		describeBackupTablesResponse.setTotal(_ctx.longValue("DescribeBackupTablesResponse.Total"));
		describeBackupTablesResponse.setPageSize(_ctx.integerValue("DescribeBackupTablesResponse.PageSize"));
		describeBackupTablesResponse.setPageNumber(_ctx.integerValue("DescribeBackupTablesResponse.PageNumber"));

		List<String> tables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupTablesResponse.Tables.Length"); i++) {
			tables.add(_ctx.stringValue("DescribeBackupTablesResponse.Tables["+ i +"]"));
		}
		describeBackupTablesResponse.setTables(tables);

		List<BackupRecord> backupRecords = new ArrayList<BackupRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupTablesResponse.BackupRecords.Length"); i++) {
			BackupRecord backupRecord = new BackupRecord();
			backupRecord.setTable(_ctx.stringValue("DescribeBackupTablesResponse.BackupRecords["+ i +"].Table"));
			backupRecord.setState(_ctx.stringValue("DescribeBackupTablesResponse.BackupRecords["+ i +"].State"));
			backupRecord.setStartTime(_ctx.stringValue("DescribeBackupTablesResponse.BackupRecords["+ i +"].StartTime"));
			backupRecord.setEndTime(_ctx.stringValue("DescribeBackupTablesResponse.BackupRecords["+ i +"].EndTime"));
			backupRecord.setProcess(_ctx.stringValue("DescribeBackupTablesResponse.BackupRecords["+ i +"].Process"));
			backupRecord.setDataSize(_ctx.stringValue("DescribeBackupTablesResponse.BackupRecords["+ i +"].DataSize"));
			backupRecord.setSpeed(_ctx.stringValue("DescribeBackupTablesResponse.BackupRecords["+ i +"].Speed"));
			backupRecord.setMessage(_ctx.stringValue("DescribeBackupTablesResponse.BackupRecords["+ i +"].Message"));

			backupRecords.add(backupRecord);
		}
		describeBackupTablesResponse.setBackupRecords(backupRecords);
	 
	 	return describeBackupTablesResponse;
	}
}