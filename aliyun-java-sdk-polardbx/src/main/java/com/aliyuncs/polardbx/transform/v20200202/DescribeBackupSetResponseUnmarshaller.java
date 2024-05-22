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

import com.aliyuncs.polardbx.model.v20200202.DescribeBackupSetResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeBackupSetResponse.BackupSet;
import com.aliyuncs.polardbx.model.v20200202.DescribeBackupSetResponse.BackupSet.OSS;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupSetResponseUnmarshaller {

	public static DescribeBackupSetResponse unmarshall(DescribeBackupSetResponse describeBackupSetResponse, UnmarshallerContext _ctx) {
		
		describeBackupSetResponse.setRequestId(_ctx.stringValue("DescribeBackupSetResponse.RequestId"));
		describeBackupSetResponse.setMessage(_ctx.stringValue("DescribeBackupSetResponse.Message"));
		describeBackupSetResponse.setSuccess(_ctx.booleanValue("DescribeBackupSetResponse.Success"));

		List<BackupSet> data = new ArrayList<BackupSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupSetResponse.Data.Length"); i++) {
			BackupSet backupSet = new BackupSet();
			backupSet.setEndTime(_ctx.longValue("DescribeBackupSetResponse.Data["+ i +"].EndTime"));
			backupSet.setStatus(_ctx.integerValue("DescribeBackupSetResponse.Data["+ i +"].Status"));
			backupSet.setBackupSetSize(_ctx.longValue("DescribeBackupSetResponse.Data["+ i +"].BackupSetSize"));
			backupSet.setBackupSetId(_ctx.longValue("DescribeBackupSetResponse.Data["+ i +"].BackupSetId"));
			backupSet.setBackupType(_ctx.integerValue("DescribeBackupSetResponse.Data["+ i +"].BackupType"));
			backupSet.setBeginTime(_ctx.longValue("DescribeBackupSetResponse.Data["+ i +"].BeginTime"));
			backupSet.setBackupModel(_ctx.integerValue("DescribeBackupSetResponse.Data["+ i +"].BackupModel"));

			List<OSS> oSSList = new ArrayList<OSS>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupSetResponse.Data["+ i +"].OSSList.Length"); j++) {
				OSS oSS = new OSS();
				oSS.setBackupSetFile(_ctx.stringValue("DescribeBackupSetResponse.Data["+ i +"].OSSList["+ j +"].BackupSetFile"));
				oSS.setLinkExpiredTime(_ctx.stringValue("DescribeBackupSetResponse.Data["+ i +"].OSSList["+ j +"].LinkExpiredTime"));
				oSS.setIntranetDownloadLink(_ctx.stringValue("DescribeBackupSetResponse.Data["+ i +"].OSSList["+ j +"].IntranetDownloadLink"));
				oSS.setDownloadLink(_ctx.stringValue("DescribeBackupSetResponse.Data["+ i +"].OSSList["+ j +"].DownloadLink"));

				oSSList.add(oSS);
			}
			backupSet.setOSSList(oSSList);

			data.add(backupSet);
		}
		describeBackupSetResponse.setData(data);
	 
	 	return describeBackupSetResponse;
	}
}