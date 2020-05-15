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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeHanaRunningBackupsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeHanaRunningBackupsResponse.HanaBackupProgress;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHanaRunningBackupsResponseUnmarshaller {

	public static DescribeHanaRunningBackupsResponse unmarshall(DescribeHanaRunningBackupsResponse describeHanaRunningBackupsResponse, UnmarshallerContext _ctx) {
		
		describeHanaRunningBackupsResponse.setRequestId(_ctx.stringValue("DescribeHanaRunningBackupsResponse.RequestId"));
		describeHanaRunningBackupsResponse.setSuccess(_ctx.booleanValue("DescribeHanaRunningBackupsResponse.Success"));
		describeHanaRunningBackupsResponse.setCode(_ctx.stringValue("DescribeHanaRunningBackupsResponse.Code"));
		describeHanaRunningBackupsResponse.setMessage(_ctx.stringValue("DescribeHanaRunningBackupsResponse.Message"));
		describeHanaRunningBackupsResponse.setTotalCount(_ctx.longValue("DescribeHanaRunningBackupsResponse.TotalCount"));
		describeHanaRunningBackupsResponse.setPageSize(_ctx.integerValue("DescribeHanaRunningBackupsResponse.PageSize"));
		describeHanaRunningBackupsResponse.setPageNumber(_ctx.integerValue("DescribeHanaRunningBackupsResponse.PageNumber"));

		List<HanaBackupProgress> hanaBackupProgresses = new ArrayList<HanaBackupProgress>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHanaRunningBackupsResponse.HanaBackupProgresses.Length"); i++) {
			HanaBackupProgress hanaBackupProgress = new HanaBackupProgress();
			hanaBackupProgress.setDatabaseName(_ctx.stringValue("DescribeHanaRunningBackupsResponse.HanaBackupProgresses["+ i +"].DatabaseName"));
			hanaBackupProgress.setBackupId(_ctx.longValue("DescribeHanaRunningBackupsResponse.HanaBackupProgresses["+ i +"].BackupId"));
			hanaBackupProgress.setHost(_ctx.stringValue("DescribeHanaRunningBackupsResponse.HanaBackupProgresses["+ i +"].Host"));
			hanaBackupProgress.setPort(_ctx.stringValue("DescribeHanaRunningBackupsResponse.HanaBackupProgresses["+ i +"].Port"));
			hanaBackupProgress.setServiceName(_ctx.stringValue("DescribeHanaRunningBackupsResponse.HanaBackupProgresses["+ i +"].ServiceName"));
			hanaBackupProgress.setEntryTypeName(_ctx.stringValue("DescribeHanaRunningBackupsResponse.HanaBackupProgresses["+ i +"].EntryTypeName"));
			hanaBackupProgress.setSysStartTime(_ctx.stringValue("DescribeHanaRunningBackupsResponse.HanaBackupProgresses["+ i +"].SysStartTime"));
			hanaBackupProgress.setUtcStartTime(_ctx.stringValue("DescribeHanaRunningBackupsResponse.HanaBackupProgresses["+ i +"].UtcStartTime"));
			hanaBackupProgress.setSysEndTime(_ctx.stringValue("DescribeHanaRunningBackupsResponse.HanaBackupProgresses["+ i +"].SysEndTime"));
			hanaBackupProgress.setUtcEndTime(_ctx.stringValue("DescribeHanaRunningBackupsResponse.HanaBackupProgresses["+ i +"].UtcEndTime"));
			hanaBackupProgress.setStateName(_ctx.stringValue("DescribeHanaRunningBackupsResponse.HanaBackupProgresses["+ i +"].StateName"));
			hanaBackupProgress.setBackupSize(_ctx.longValue("DescribeHanaRunningBackupsResponse.HanaBackupProgresses["+ i +"].BackupSize"));
			hanaBackupProgress.setTransferedSize(_ctx.longValue("DescribeHanaRunningBackupsResponse.HanaBackupProgresses["+ i +"].TransferedSize"));

			hanaBackupProgresses.add(hanaBackupProgress);
		}
		describeHanaRunningBackupsResponse.setHanaBackupProgresses(hanaBackupProgresses);
	 
	 	return describeHanaRunningBackupsResponse;
	}
}