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

import com.aliyuncs.hbr.model.v20170908.DescribeBackupPlansResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeBackupPlansResponse.BackupPlan;
import com.aliyuncs.hbr.model.v20170908.DescribeBackupPlansResponse.BackupPlan.TrialInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPlansResponseUnmarshaller {

	public static DescribeBackupPlansResponse unmarshall(DescribeBackupPlansResponse describeBackupPlansResponse, UnmarshallerContext _ctx) {
		
		describeBackupPlansResponse.setRequestId(_ctx.stringValue("DescribeBackupPlansResponse.RequestId"));
		describeBackupPlansResponse.setSuccess(_ctx.booleanValue("DescribeBackupPlansResponse.Success"));
		describeBackupPlansResponse.setCode(_ctx.stringValue("DescribeBackupPlansResponse.Code"));
		describeBackupPlansResponse.setMessage(_ctx.stringValue("DescribeBackupPlansResponse.Message"));
		describeBackupPlansResponse.setTotalCount(_ctx.longValue("DescribeBackupPlansResponse.TotalCount"));
		describeBackupPlansResponse.setPageSize(_ctx.integerValue("DescribeBackupPlansResponse.PageSize"));
		describeBackupPlansResponse.setPageNumber(_ctx.integerValue("DescribeBackupPlansResponse.PageNumber"));

		List<BackupPlan> backupPlans = new ArrayList<BackupPlan>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupPlansResponse.BackupPlans.Length"); i++) {
			BackupPlan backupPlan = new BackupPlan();
			backupPlan.setVaultId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].VaultId"));
			backupPlan.setBackupSourceGroupId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].BackupSourceGroupId"));
			backupPlan.setPlanId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].PlanId"));
			backupPlan.setPlanName(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].PlanName"));
			backupPlan.setSourceType(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].SourceType"));
			backupPlan.setBackupType(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].BackupType"));
			backupPlan.setSchedule(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Schedule"));
			backupPlan.setRetention(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Retention"));
			backupPlan.setClusterId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].ClusterId"));
			backupPlan.setDisabled(_ctx.booleanValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Disabled"));
			backupPlan.setCreatedTime(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].CreatedTime"));
			backupPlan.setUpdatedTime(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].UpdatedTime"));
			backupPlan.setFileSystemId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].FileSystemId"));
			backupPlan.setCreateTime(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].CreateTime"));
			backupPlan.setBucket(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Bucket"));
			backupPlan.setPrefix(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Prefix"));
			backupPlan.setInstanceId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].InstanceId"));
			backupPlan.setDetail(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Detail"));
			backupPlan.setClientId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].ClientId"));
			backupPlan.setSpeedLimit(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].SpeedLimit"));
			backupPlan.setOptions(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Options"));
			backupPlan.setInclude(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Include"));
			backupPlan.setExclude(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Exclude"));
			backupPlan.setDataSourceId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].DataSourceId"));

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Paths.Length"); j++) {
				paths.add(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Paths["+ j +"]"));
			}
			backupPlan.setPaths(paths);

			TrialInfo trialInfo = new TrialInfo();
			trialInfo.setTrialStartTime(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].TrialInfo.TrialStartTime"));
			trialInfo.setTrialExpireTime(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].TrialInfo.TrialExpireTime"));
			trialInfo.setKeepAfterTrialExpiration(_ctx.booleanValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].TrialInfo.KeepAfterTrialExpiration"));
			trialInfo.setTrialVaultReleaseTime(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].TrialInfo.TrialVaultReleaseTime"));
			backupPlan.setTrialInfo(trialInfo);

			backupPlans.add(backupPlan);
		}
		describeBackupPlansResponse.setBackupPlans(backupPlans);
	 
	 	return describeBackupPlansResponse;
	}
}