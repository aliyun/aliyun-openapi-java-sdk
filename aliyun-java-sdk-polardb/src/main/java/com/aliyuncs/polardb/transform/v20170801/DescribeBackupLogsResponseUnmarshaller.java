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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeBackupLogsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeBackupLogsResponse.BackupLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupLogsResponseUnmarshaller {

	public static DescribeBackupLogsResponse unmarshall(DescribeBackupLogsResponse describeBackupLogsResponse, UnmarshallerContext _ctx) {
		
		describeBackupLogsResponse.setRequestId(_ctx.stringValue("DescribeBackupLogsResponse.RequestId"));
		describeBackupLogsResponse.setTotalRecordCount(_ctx.stringValue("DescribeBackupLogsResponse.TotalRecordCount"));
		describeBackupLogsResponse.setPageNumber(_ctx.stringValue("DescribeBackupLogsResponse.PageNumber"));
		describeBackupLogsResponse.setPageRecordCount(_ctx.stringValue("DescribeBackupLogsResponse.PageRecordCount"));

		List<BackupLog> items = new ArrayList<BackupLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupLogsResponse.Items.Length"); i++) {
			BackupLog backupLog = new BackupLog();
			backupLog.setBackupLogId(_ctx.stringValue("DescribeBackupLogsResponse.Items["+ i +"].BackupLogId"));
			backupLog.setBackupLogName(_ctx.stringValue("DescribeBackupLogsResponse.Items["+ i +"].BackupLogName"));
			backupLog.setBackupLogStartTime(_ctx.stringValue("DescribeBackupLogsResponse.Items["+ i +"].BackupLogStartTime"));
			backupLog.setBackupLogEndTime(_ctx.stringValue("DescribeBackupLogsResponse.Items["+ i +"].BackupLogEndTime"));
			backupLog.setBackupLogSize(_ctx.stringValue("DescribeBackupLogsResponse.Items["+ i +"].BackupLogSize"));
			backupLog.setDownloadLink(_ctx.stringValue("DescribeBackupLogsResponse.Items["+ i +"].DownloadLink"));
			backupLog.setIntranetDownloadLink(_ctx.stringValue("DescribeBackupLogsResponse.Items["+ i +"].IntranetDownloadLink"));
			backupLog.setLinkExpiredTime(_ctx.stringValue("DescribeBackupLogsResponse.Items["+ i +"].LinkExpiredTime"));

			items.add(backupLog);
		}
		describeBackupLogsResponse.setItems(items);
	 
	 	return describeBackupLogsResponse;
	}
}