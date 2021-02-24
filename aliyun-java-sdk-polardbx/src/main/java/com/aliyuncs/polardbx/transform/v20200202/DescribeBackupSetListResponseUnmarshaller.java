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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.DescribeBackupSetListResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeBackupSetListResponse.BackupSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupSetListResponseUnmarshaller {

	public static DescribeBackupSetListResponse unmarshall(DescribeBackupSetListResponse describeBackupSetListResponse, UnmarshallerContext _ctx) {
		
		describeBackupSetListResponse.setRequestId(_ctx.stringValue("DescribeBackupSetListResponse.RequestId"));
		describeBackupSetListResponse.setMessage(_ctx.stringValue("DescribeBackupSetListResponse.Message"));
		describeBackupSetListResponse.setSuccess(_ctx.booleanValue("DescribeBackupSetListResponse.Success"));

		List<BackupSet> data = new ArrayList<BackupSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupSetListResponse.Data.Length"); i++) {
			BackupSet backupSet = new BackupSet();
			backupSet.setBackupSetId(_ctx.longValue("DescribeBackupSetListResponse.Data["+ i +"].BackupSetId"));
			backupSet.setBeginTime(_ctx.longValue("DescribeBackupSetListResponse.Data["+ i +"].BeginTime"));
			backupSet.setEndTime(_ctx.longValue("DescribeBackupSetListResponse.Data["+ i +"].EndTime"));
			backupSet.setBackupSetSize(_ctx.longValue("DescribeBackupSetListResponse.Data["+ i +"].BackupSetSize"));
			backupSet.setBackupModel(_ctx.integerValue("DescribeBackupSetListResponse.Data["+ i +"].BackupModel"));
			backupSet.setStatus(_ctx.integerValue("DescribeBackupSetListResponse.Data["+ i +"].Status"));
			backupSet.setBackupType(_ctx.integerValue("DescribeBackupSetListResponse.Data["+ i +"].BackupType"));

			data.add(backupSet);
		}
		describeBackupSetListResponse.setData(data);
	 
	 	return describeBackupSetListResponse;
	}
}