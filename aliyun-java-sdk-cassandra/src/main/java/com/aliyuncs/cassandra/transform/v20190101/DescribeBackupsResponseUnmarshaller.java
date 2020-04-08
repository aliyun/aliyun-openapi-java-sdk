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

package com.aliyuncs.cassandra.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cassandra.model.v20190101.DescribeBackupsResponse;
import com.aliyuncs.cassandra.model.v20190101.DescribeBackupsResponse.Backup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupsResponseUnmarshaller {

	public static DescribeBackupsResponse unmarshall(DescribeBackupsResponse describeBackupsResponse, UnmarshallerContext _ctx) {
		
		describeBackupsResponse.setRequestId(_ctx.stringValue("DescribeBackupsResponse.RequestId"));

		List<Backup> backups = new ArrayList<Backup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupsResponse.Backups.Length"); i++) {
			Backup backup = new Backup();
			backup.setClusterId(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].ClusterId"));
			backup.setDataCenterId(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].DataCenterId"));
			backup.setBackupId(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupId"));
			backup.setBackupType(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupType"));
			backup.setStatus(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].Status"));
			backup.setStartTime(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].StartTime"));
			backup.setEndTime(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].EndTime"));
			backup.setSize(_ctx.longValue("DescribeBackupsResponse.Backups["+ i +"].Size"));

			backups.add(backup);
		}
		describeBackupsResponse.setBackups(backups);
	 
	 	return describeBackupsResponse;
	}
}