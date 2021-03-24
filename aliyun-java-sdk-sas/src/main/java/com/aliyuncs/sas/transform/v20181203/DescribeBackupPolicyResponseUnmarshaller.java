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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeBackupPolicyResponse;
import com.aliyuncs.sas.model.v20181203.DescribeBackupPolicyResponse.BackupPolicyDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPolicyResponseUnmarshaller {

	public static DescribeBackupPolicyResponse unmarshall(DescribeBackupPolicyResponse describeBackupPolicyResponse, UnmarshallerContext _ctx) {
		
		describeBackupPolicyResponse.setRequestId(_ctx.stringValue("DescribeBackupPolicyResponse.RequestId"));

		BackupPolicyDetail backupPolicyDetail = new BackupPolicyDetail();
		backupPolicyDetail.setId(_ctx.longValue("DescribeBackupPolicyResponse.BackupPolicyDetail.Id"));
		backupPolicyDetail.setName(_ctx.stringValue("DescribeBackupPolicyResponse.BackupPolicyDetail.Name"));
		backupPolicyDetail.setPolicy(_ctx.stringValue("DescribeBackupPolicyResponse.BackupPolicyDetail.Policy"));
		backupPolicyDetail.setStatus(_ctx.stringValue("DescribeBackupPolicyResponse.BackupPolicyDetail.Status"));
		backupPolicyDetail.setClientStatus(_ctx.stringValue("DescribeBackupPolicyResponse.BackupPolicyDetail.ClientStatus"));

		List<String> uuidList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupPolicyResponse.BackupPolicyDetail.UuidList.Length"); i++) {
			uuidList.add(_ctx.stringValue("DescribeBackupPolicyResponse.BackupPolicyDetail.UuidList["+ i +"]"));
		}
		backupPolicyDetail.setUuidList(uuidList);
		describeBackupPolicyResponse.setBackupPolicyDetail(backupPolicyDetail);
	 
	 	return describeBackupPolicyResponse;
	}
}