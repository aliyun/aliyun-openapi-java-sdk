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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.DescribeBackupPolicyResponse;
import com.aliyuncs.rds.model.v20140815.DescribeBackupPolicyResponse.DuplicationLocation;
import com.aliyuncs.rds.model.v20140815.DescribeBackupPolicyResponse.DuplicationLocation.Location;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPolicyResponseUnmarshaller {

	public static DescribeBackupPolicyResponse unmarshall(DescribeBackupPolicyResponse describeBackupPolicyResponse, UnmarshallerContext _ctx) {
		
		describeBackupPolicyResponse.setRequestId(_ctx.stringValue("DescribeBackupPolicyResponse.RequestId"));
		describeBackupPolicyResponse.setLogBackupRetentionPeriod(_ctx.integerValue("DescribeBackupPolicyResponse.LogBackupRetentionPeriod"));
		describeBackupPolicyResponse.setArchiveBackupKeepPolicy(_ctx.stringValue("DescribeBackupPolicyResponse.ArchiveBackupKeepPolicy"));
		describeBackupPolicyResponse.setArchiveBackupKeepCount(_ctx.stringValue("DescribeBackupPolicyResponse.ArchiveBackupKeepCount"));
		describeBackupPolicyResponse.setLocalLogRetentionHours(_ctx.integerValue("DescribeBackupPolicyResponse.LocalLogRetentionHours"));
		describeBackupPolicyResponse.setBackupRetentionPeriod(_ctx.integerValue("DescribeBackupPolicyResponse.BackupRetentionPeriod"));
		describeBackupPolicyResponse.setPreferredBackupPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredBackupPeriod"));
		describeBackupPolicyResponse.setCompressType(_ctx.stringValue("DescribeBackupPolicyResponse.CompressType"));
		describeBackupPolicyResponse.setSupportReleasedKeep(_ctx.integerValue("DescribeBackupPolicyResponse.SupportReleasedKeep"));
		describeBackupPolicyResponse.setLocalLogRetentionSpace(_ctx.stringValue("DescribeBackupPolicyResponse.LocalLogRetentionSpace"));
		describeBackupPolicyResponse.setSupportVolumeShadowCopy(_ctx.integerValue("DescribeBackupPolicyResponse.SupportVolumeShadowCopy"));
		describeBackupPolicyResponse.setBackupMethod(_ctx.stringValue("DescribeBackupPolicyResponse.BackupMethod"));
		describeBackupPolicyResponse.setLogBackupFrequency(_ctx.stringValue("DescribeBackupPolicyResponse.LogBackupFrequency"));
		describeBackupPolicyResponse.setPreferredNextBackupTime(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredNextBackupTime"));
		describeBackupPolicyResponse.setHighSpaceUsageProtection(_ctx.stringValue("DescribeBackupPolicyResponse.HighSpaceUsageProtection"));
		describeBackupPolicyResponse.setDuplicationContent(_ctx.stringValue("DescribeBackupPolicyResponse.DuplicationContent"));
		describeBackupPolicyResponse.setArchiveBackupRetentionPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.ArchiveBackupRetentionPeriod"));
		describeBackupPolicyResponse.setBackupInterval(_ctx.stringValue("DescribeBackupPolicyResponse.BackupInterval"));
		describeBackupPolicyResponse.setReleasedKeepPolicy(_ctx.stringValue("DescribeBackupPolicyResponse.ReleasedKeepPolicy"));
		describeBackupPolicyResponse.setPreferredBackupTime(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredBackupTime"));
		describeBackupPolicyResponse.setDuplication(_ctx.stringValue("DescribeBackupPolicyResponse.Duplication"));
		describeBackupPolicyResponse.setLogBackupLocalRetentionNumber(_ctx.integerValue("DescribeBackupPolicyResponse.LogBackupLocalRetentionNumber"));
		describeBackupPolicyResponse.setCategory(_ctx.stringValue("DescribeBackupPolicyResponse.Category"));
		describeBackupPolicyResponse.setEnableBackupLog(_ctx.stringValue("DescribeBackupPolicyResponse.EnableBackupLog"));
		describeBackupPolicyResponse.setBackupLog(_ctx.stringValue("DescribeBackupPolicyResponse.BackupLog"));

		DuplicationLocation duplicationLocation = new DuplicationLocation();
		duplicationLocation.setSotrage(_ctx.stringValue("DescribeBackupPolicyResponse.DuplicationLocation.Sotrage"));

		Location location = new Location();
		location.setBucket(_ctx.stringValue("DescribeBackupPolicyResponse.DuplicationLocation.Location.Bucket"));
		location.setEndpoint(_ctx.stringValue("DescribeBackupPolicyResponse.DuplicationLocation.Location.Endpoint"));
		duplicationLocation.setLocation(location);
		describeBackupPolicyResponse.setDuplicationLocation(duplicationLocation);
	 
	 	return describeBackupPolicyResponse;
	}
}