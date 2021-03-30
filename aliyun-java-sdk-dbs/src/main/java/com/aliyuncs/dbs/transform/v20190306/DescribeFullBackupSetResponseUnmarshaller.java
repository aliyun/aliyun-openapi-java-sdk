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

package com.aliyuncs.dbs.transform.v20190306;

import com.aliyuncs.dbs.model.v20190306.DescribeFullBackupSetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFullBackupSetResponseUnmarshaller {

	public static DescribeFullBackupSetResponse unmarshall(DescribeFullBackupSetResponse describeFullBackupSetResponse, UnmarshallerContext _ctx) {
		
		describeFullBackupSetResponse.setRequestId(_ctx.stringValue("DescribeFullBackupSetResponse.RequestId"));
		describeFullBackupSetResponse.setSuccess(_ctx.booleanValue("DescribeFullBackupSetResponse.Success"));
		describeFullBackupSetResponse.setErrCode(_ctx.stringValue("DescribeFullBackupSetResponse.ErrCode"));
		describeFullBackupSetResponse.setErrMessage(_ctx.stringValue("DescribeFullBackupSetResponse.ErrMessage"));
		describeFullBackupSetResponse.setHttpStatusCode(_ctx.integerValue("DescribeFullBackupSetResponse.HttpStatusCode"));
		describeFullBackupSetResponse.setBackupSetId(_ctx.stringValue("DescribeFullBackupSetResponse.BackupSetId"));
		describeFullBackupSetResponse.setSourceEndpointIpPort(_ctx.stringValue("DescribeFullBackupSetResponse.SourceEndpointIpPort"));
		describeFullBackupSetResponse.setStartTime(_ctx.longValue("DescribeFullBackupSetResponse.StartTime"));
		describeFullBackupSetResponse.setEndTime(_ctx.longValue("DescribeFullBackupSetResponse.EndTime"));
		describeFullBackupSetResponse.setBackupStatus(_ctx.stringValue("DescribeFullBackupSetResponse.BackupStatus"));
		describeFullBackupSetResponse.setBackupSetExpiredTime(_ctx.longValue("DescribeFullBackupSetResponse.BackupSetExpiredTime"));
		describeFullBackupSetResponse.setBackupSize(_ctx.longValue("DescribeFullBackupSetResponse.BackupSize"));
		describeFullBackupSetResponse.setStorageMethod(_ctx.stringValue("DescribeFullBackupSetResponse.StorageMethod"));
		describeFullBackupSetResponse.setErrMessage1(_ctx.stringValue("DescribeFullBackupSetResponse.ErrMessage"));
		describeFullBackupSetResponse.setBackupObjects(_ctx.stringValue("DescribeFullBackupSetResponse.BackupObjects"));
		describeFullBackupSetResponse.setCreateTime(_ctx.longValue("DescribeFullBackupSetResponse.CreateTime"));
		describeFullBackupSetResponse.setFinishTime(_ctx.longValue("DescribeFullBackupSetResponse.FinishTime"));
	 
	 	return describeFullBackupSetResponse;
	}
}