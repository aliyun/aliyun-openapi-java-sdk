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

import com.aliyuncs.hbr.model.v20170908.DescribeHanaBackupsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeHanaBackupsResponse.HanaBackup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHanaBackupsResponseUnmarshaller {

	public static DescribeHanaBackupsResponse unmarshall(DescribeHanaBackupsResponse describeHanaBackupsResponse, UnmarshallerContext _ctx) {
		
		describeHanaBackupsResponse.setRequestId(_ctx.stringValue("DescribeHanaBackupsResponse.RequestId"));
		describeHanaBackupsResponse.setSuccess(_ctx.booleanValue("DescribeHanaBackupsResponse.Success"));
		describeHanaBackupsResponse.setCode(_ctx.stringValue("DescribeHanaBackupsResponse.Code"));
		describeHanaBackupsResponse.setMessage(_ctx.stringValue("DescribeHanaBackupsResponse.Message"));
		describeHanaBackupsResponse.setTotalCount(_ctx.longValue("DescribeHanaBackupsResponse.TotalCount"));
		describeHanaBackupsResponse.setPageSize(_ctx.integerValue("DescribeHanaBackupsResponse.PageSize"));
		describeHanaBackupsResponse.setPageNumber(_ctx.integerValue("DescribeHanaBackupsResponse.PageNumber"));

		List<HanaBackup> hanaBackups = new ArrayList<HanaBackup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHanaBackupsResponse.HanaBackups.Length"); i++) {
			HanaBackup hanaBackup = new HanaBackup();
			hanaBackup.setDatabaseName(_ctx.stringValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].DatabaseName"));
			hanaBackup.setBackupId(_ctx.longValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].BackupId"));
			hanaBackup.setHost(_ctx.stringValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].Host"));
			hanaBackup.setPort(_ctx.integerValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].Port"));
			hanaBackup.setServiceName(_ctx.stringValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].ServiceName"));
			hanaBackup.setEntryTypeName(_ctx.stringValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].EntryTypeName"));
			hanaBackup.setSysStartTime(_ctx.stringValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].SysStartTime"));
			hanaBackup.setUtcStartTime(_ctx.stringValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].UtcStartTime"));
			hanaBackup.setSysEndTime(_ctx.stringValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].SysEndTime"));
			hanaBackup.setUtcEndTime(_ctx.stringValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].UtcEndTime"));
			hanaBackup.setStateName(_ctx.stringValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].StateName"));
			hanaBackup.setBackupSize(_ctx.longValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].BackupSize"));
			hanaBackup.setTransferedSize(_ctx.longValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].TransferedSize"));
			hanaBackup.setComment(_ctx.stringValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].Comment"));
			hanaBackup.setMessage(_ctx.stringValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].Message"));
			hanaBackup.setSystemId(_ctx.stringValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].SystemId"));
			hanaBackup.setDuration(_ctx.longValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].Duration"));
			hanaBackup.setBackupPrefix(_ctx.stringValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].BackupPrefix"));
			hanaBackup.setDestinationPath(_ctx.stringValue("DescribeHanaBackupsResponse.HanaBackups["+ i +"].DestinationPath"));

			hanaBackups.add(hanaBackup);
		}
		describeHanaBackupsResponse.setHanaBackups(hanaBackups);
	 
	 	return describeHanaBackupsResponse;
	}
}