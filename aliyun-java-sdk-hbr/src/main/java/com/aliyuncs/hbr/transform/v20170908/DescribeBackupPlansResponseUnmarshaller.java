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
import com.aliyuncs.hbr.model.v20170908.DescribeBackupPlansResponse.BackupPlan.OtsDetail;
import com.aliyuncs.hbr.model.v20170908.DescribeBackupPlansResponse.BackupPlan.Resource;
import com.aliyuncs.hbr.model.v20170908.DescribeBackupPlansResponse.BackupPlan.Rule;
import com.aliyuncs.hbr.model.v20170908.DescribeBackupPlansResponse.BackupPlan.TrialInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPlansResponseUnmarshaller {

	public static DescribeBackupPlansResponse unmarshall(DescribeBackupPlansResponse describeBackupPlansResponse, UnmarshallerContext _ctx) {
		
		describeBackupPlansResponse.setRequestId(_ctx.stringValue("DescribeBackupPlansResponse.RequestId"));
		describeBackupPlansResponse.setSuccess(_ctx.booleanValue("DescribeBackupPlansResponse.Success"));
		describeBackupPlansResponse.setCode(_ctx.stringValue("DescribeBackupPlansResponse.Code"));
		describeBackupPlansResponse.setMessage(_ctx.stringValue("DescribeBackupPlansResponse.Message"));
		describeBackupPlansResponse.setPageNumber(_ctx.integerValue("DescribeBackupPlansResponse.PageNumber"));
		describeBackupPlansResponse.setPageSize(_ctx.integerValue("DescribeBackupPlansResponse.PageSize"));
		describeBackupPlansResponse.setTotalCount(_ctx.longValue("DescribeBackupPlansResponse.TotalCount"));

		List<BackupPlan> backupPlans = new ArrayList<BackupPlan>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupPlansResponse.BackupPlans.Length"); i++) {
			BackupPlan backupPlan = new BackupPlan();
			backupPlan.setVaultId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].VaultId"));
			backupPlan.setBackupType(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].BackupType"));
			backupPlan.setCreateTime(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].CreateTime"));
			backupPlan.setDataSourceId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].DataSourceId"));
			backupPlan.setSourceType(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].SourceType"));
			backupPlan.setDisabled(_ctx.booleanValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Disabled"));
			backupPlan.setPrefix(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Prefix"));
			backupPlan.setOptions(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Options"));
			backupPlan.setClientId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].ClientId"));
			backupPlan.setExclude(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Exclude"));
			backupPlan.setRetention(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Retention"));
			backupPlan.setCreatedTime(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].CreatedTime"));
			backupPlan.setClusterId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].ClusterId"));
			backupPlan.setBucket(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Bucket"));
			backupPlan.setDetail(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Detail"));
			backupPlan.setSchedule(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Schedule"));
			backupPlan.setSpeedLimit(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].SpeedLimit"));
			backupPlan.setInstanceId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].InstanceId"));
			backupPlan.setPlanId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].PlanId"));
			backupPlan.setBackupSourceGroupId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].BackupSourceGroupId"));
			backupPlan.setFileSystemId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].FileSystemId"));
			backupPlan.setInstanceName(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].InstanceName"));
			backupPlan.setUpdatedTime(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].UpdatedTime"));
			backupPlan.setPlanName(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].PlanName"));
			backupPlan.setInclude(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Include"));
			backupPlan.setInstanceGroupId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].InstanceGroupId"));
			backupPlan.setCrossAccountType(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].CrossAccountType"));
			backupPlan.setCrossAccountUserId(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].CrossAccountUserId"));
			backupPlan.setCrossAccountRoleName(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].CrossAccountRoleName"));
			backupPlan.setKeepLatestSnapshots(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].KeepLatestSnapshots"));
			backupPlan.setDestSourceType(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].DestSourceType"));
			backupPlan.setDestDataSourceId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].DestDataSourceId"));
			backupPlan.setDestDataSourceDetail(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].DestDataSourceDetail"));
			backupPlan.setChangeListPath(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].ChangeListPath"));

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Paths.Length"); j++) {
				paths.add(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Paths["+ j +"]"));
			}
			backupPlan.setPaths(paths);

			OtsDetail otsDetail = new OtsDetail();

			List<String> tableNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].OtsDetail.TableNames.Length"); j++) {
				tableNames.add(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].OtsDetail.TableNames["+ j +"]"));
			}
			otsDetail.setTableNames(tableNames);
			backupPlan.setOtsDetail(otsDetail);

			TrialInfo trialInfo = new TrialInfo();
			trialInfo.setTrialStartTime(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].TrialInfo.TrialStartTime"));
			trialInfo.setTrialVaultReleaseTime(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].TrialInfo.TrialVaultReleaseTime"));
			trialInfo.setTrialExpireTime(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].TrialInfo.TrialExpireTime"));
			trialInfo.setKeepAfterTrialExpiration(_ctx.booleanValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].TrialInfo.KeepAfterTrialExpiration"));
			backupPlan.setTrialInfo(trialInfo);

			List<Rule> rules = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Rules.Length"); j++) {
				Rule rule = new Rule();
				rule.setDestinationRetention(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Rules["+ j +"].DestinationRetention"));
				rule.setSchedule(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Rules["+ j +"].Schedule"));
				rule.setRetention(_ctx.longValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Rules["+ j +"].Retention"));
				rule.setDisabled(_ctx.booleanValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Rules["+ j +"].Disabled"));
				rule.setDoCopy(_ctx.booleanValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Rules["+ j +"].DoCopy"));
				rule.setDestinationRegionId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Rules["+ j +"].DestinationRegionId"));
				rule.setRuleId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Rules["+ j +"].RuleId"));
				rule.setRuleName(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Rules["+ j +"].RuleName"));
				rule.setBackupType(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Rules["+ j +"].BackupType"));

				rules.add(rule);
			}
			backupPlan.setRules(rules);

			List<Resource> resources = new ArrayList<Resource>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Resources.Length"); j++) {
				Resource resource = new Resource();
				resource.setSourceType(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Resources["+ j +"].SourceType"));
				resource.setResourceId(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Resources["+ j +"].ResourceId"));
				resource.setExtra(_ctx.stringValue("DescribeBackupPlansResponse.BackupPlans["+ i +"].Resources["+ j +"].Extra"));

				resources.add(resource);
			}
			backupPlan.setResources(resources);

			backupPlans.add(backupPlan);
		}
		describeBackupPlansResponse.setBackupPlans(backupPlans);
	 
	 	return describeBackupPlansResponse;
	}
}