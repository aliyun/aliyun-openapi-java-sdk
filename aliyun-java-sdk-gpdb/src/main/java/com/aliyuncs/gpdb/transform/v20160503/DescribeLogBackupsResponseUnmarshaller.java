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

import com.aliyuncs.gpdb.model.v20160503.DescribeLogBackupsResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeLogBackupsResponse.Backup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogBackupsResponseUnmarshaller {

	public static DescribeLogBackupsResponse unmarshall(DescribeLogBackupsResponse describeLogBackupsResponse, UnmarshallerContext _ctx) {
		
		describeLogBackupsResponse.setRequestId(_ctx.stringValue("DescribeLogBackupsResponse.RequestId"));
		describeLogBackupsResponse.setTotalCount(_ctx.integerValue("DescribeLogBackupsResponse.TotalCount"));
		describeLogBackupsResponse.setPageNumber(_ctx.integerValue("DescribeLogBackupsResponse.PageNumber"));
		describeLogBackupsResponse.setPageSize(_ctx.integerValue("DescribeLogBackupsResponse.PageSize"));
		describeLogBackupsResponse.setTotalLogSize(_ctx.longValue("DescribeLogBackupsResponse.TotalLogSize"));

		List<Backup> items = new ArrayList<Backup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogBackupsResponse.Items.Length"); i++) {
			Backup backup = new Backup();
			backup.setBackupId(_ctx.stringValue("DescribeLogBackupsResponse.Items["+ i +"].BackupId"));
			backup.setDBInstanceId(_ctx.stringValue("DescribeLogBackupsResponse.Items["+ i +"].DBInstanceId"));
			backup.setSegmentName(_ctx.stringValue("DescribeLogBackupsResponse.Items["+ i +"].SegmentName"));
			backup.setLogFileName(_ctx.stringValue("DescribeLogBackupsResponse.Items["+ i +"].LogFileName"));
			backup.setLogTime(_ctx.stringValue("DescribeLogBackupsResponse.Items["+ i +"].LogTime"));
			backup.setLogFileSize(_ctx.longValue("DescribeLogBackupsResponse.Items["+ i +"].LogFileSize"));

			items.add(backup);
		}
		describeLogBackupsResponse.setItems(items);
	 
	 	return describeLogBackupsResponse;
	}
}