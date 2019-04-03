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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeBackupSetsResponse;
import com.aliyuncs.drds.model.v20190123.DescribeBackupSetsResponse.BackupSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupSetsResponseUnmarshaller {

	public static DescribeBackupSetsResponse unmarshall(DescribeBackupSetsResponse describeBackupSetsResponse, UnmarshallerContext context) {
		
		describeBackupSetsResponse.setRequestId(context.stringValue("DescribeBackupSetsResponse.RequestId"));
		describeBackupSetsResponse.setSuccess(context.booleanValue("DescribeBackupSetsResponse.Success"));

		List<BackupSet> backupSets = new ArrayList<BackupSet>();
		for (int i = 0; i < context.lengthValue("DescribeBackupSetsResponse.BackupSets.Length"); i++) {
			BackupSet backupSet = new BackupSet();
			backupSet.setId(context.stringValue("DescribeBackupSetsResponse.BackupSets["+ i +"].Id"));
			backupSet.setBackupStartTime(context.longValue("DescribeBackupSetsResponse.BackupSets["+ i +"].BackupStartTime"));
			backupSet.setBackupEndTime(context.longValue("DescribeBackupSetsResponse.BackupSets["+ i +"].BackupEndTime"));
			backupSet.setBackupMode(context.stringValue("DescribeBackupSetsResponse.BackupSets["+ i +"].BackupMode"));
			backupSet.setBackupLevel(context.stringValue("DescribeBackupSetsResponse.BackupSets["+ i +"].BackupLevel"));
			backupSet.setBackupType(context.stringValue("DescribeBackupSetsResponse.BackupSets["+ i +"].BackupType"));
			backupSet.setStatus(context.longValue("DescribeBackupSetsResponse.BackupSets["+ i +"].Status"));
			backupSet.setEnableRecovery(context.booleanValue("DescribeBackupSetsResponse.BackupSets["+ i +"].EnableRecovery"));
			backupSet.setBackupTotalSize(context.stringValue("DescribeBackupSetsResponse.BackupSets["+ i +"].BackupTotalSize"));
			backupSet.setBackupConsitentTime(context.stringValue("DescribeBackupSetsResponse.BackupSets["+ i +"].BackupConsitentTime"));

			List<String> backupDbs = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeBackupSetsResponse.BackupSets["+ i +"].BackupDbs.Length"); j++) {
				backupDbs.add(context.stringValue("DescribeBackupSetsResponse.BackupSets["+ i +"].BackupDbs["+ j +"]"));
			}
			backupSet.setBackupDbs(backupDbs);

			backupSets.add(backupSet);
		}
		describeBackupSetsResponse.setBackupSets(backupSets);
	 
	 	return describeBackupSetsResponse;
	}
}