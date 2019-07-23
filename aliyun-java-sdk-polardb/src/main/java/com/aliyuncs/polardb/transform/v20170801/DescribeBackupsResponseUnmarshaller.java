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

import com.aliyuncs.polardb.model.v20170801.DescribeBackupsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeBackupsResponse.Backup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupsResponseUnmarshaller {

	public static DescribeBackupsResponse unmarshall(DescribeBackupsResponse describeBackupsResponse, UnmarshallerContext _ctx) {
		
		describeBackupsResponse.setRequestId(_ctx.stringValue("DescribeBackupsResponse.RequestId"));
		describeBackupsResponse.setTotalRecordCount(_ctx.stringValue("DescribeBackupsResponse.TotalRecordCount"));
		describeBackupsResponse.setPageNumber(_ctx.stringValue("DescribeBackupsResponse.PageNumber"));
		describeBackupsResponse.setPageRecordCount(_ctx.stringValue("DescribeBackupsResponse.PageRecordCount"));

		List<Backup> items = new ArrayList<Backup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupsResponse.Items.Length"); i++) {
			Backup backup = new Backup();
			backup.setBackupId(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupId"));
			backup.setDBClusterId(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].DBClusterId"));
			backup.setBackupStatus(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupStatus"));
			backup.setBackupStartTime(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupStartTime"));
			backup.setBackupEndTime(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupEndTime"));
			backup.setBackupType(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupType"));
			backup.setBackupMode(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupMode"));
			backup.setBackupMethod(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupMethod"));
			backup.setStoreStatus(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].StoreStatus"));

			items.add(backup);
		}
		describeBackupsResponse.setItems(items);
	 
	 	return describeBackupsResponse;
	}
}