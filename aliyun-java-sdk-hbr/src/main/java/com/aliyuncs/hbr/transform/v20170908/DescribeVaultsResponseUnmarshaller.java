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

import com.aliyuncs.hbr.model.v20170908.DescribeVaultsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeVaultsResponse.Vault;
import com.aliyuncs.hbr.model.v20170908.DescribeVaultsResponse.Vault.BackupPlanStatistics;
import com.aliyuncs.hbr.model.v20170908.DescribeVaultsResponse.Vault.Endpoint;
import com.aliyuncs.hbr.model.v20170908.DescribeVaultsResponse.Vault.ReplicationProgress;
import com.aliyuncs.hbr.model.v20170908.DescribeVaultsResponse.Vault.Tag;
import com.aliyuncs.hbr.model.v20170908.DescribeVaultsResponse.Vault.TrialInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVaultsResponseUnmarshaller {

	public static DescribeVaultsResponse unmarshall(DescribeVaultsResponse describeVaultsResponse, UnmarshallerContext _ctx) {
		
		describeVaultsResponse.setRequestId(_ctx.stringValue("DescribeVaultsResponse.RequestId"));
		describeVaultsResponse.setSuccess(_ctx.booleanValue("DescribeVaultsResponse.Success"));
		describeVaultsResponse.setCode(_ctx.stringValue("DescribeVaultsResponse.Code"));
		describeVaultsResponse.setMessage(_ctx.stringValue("DescribeVaultsResponse.Message"));
		describeVaultsResponse.setPageNumber(_ctx.integerValue("DescribeVaultsResponse.PageNumber"));
		describeVaultsResponse.setPageSize(_ctx.integerValue("DescribeVaultsResponse.PageSize"));
		describeVaultsResponse.setTotalCount(_ctx.integerValue("DescribeVaultsResponse.TotalCount"));

		List<Vault> vaults = new ArrayList<Vault>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVaultsResponse.Vaults.Length"); i++) {
			Vault vault = new Vault();
			vault.setStatus(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].Status"));
			vault.setVaultId(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].VaultId"));
			vault.setChargeType(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].ChargeType"));
			vault.setVaultType(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].VaultType"));
			vault.setDedup(_ctx.booleanValue("DescribeVaultsResponse.Vaults["+ i +"].Dedup"));
			vault.setReplicationSourceVaultId(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].ReplicationSourceVaultId"));
			vault.setIndexUpdateTime(_ctx.longValue("DescribeVaultsResponse.Vaults["+ i +"].IndexUpdateTime"));
			vault.setDescription(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].Description"));
			vault.setVaultStorageClass(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].VaultStorageClass"));
			vault.setRetention(_ctx.longValue("DescribeVaultsResponse.Vaults["+ i +"].Retention"));
			vault.setCreatedTime(_ctx.longValue("DescribeVaultsResponse.Vaults["+ i +"].CreatedTime"));
			vault.setIndexLevel(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].IndexLevel"));
			vault.setVaultName(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].VaultName"));
			vault.setStorageSize(_ctx.longValue("DescribeVaultsResponse.Vaults["+ i +"].StorageSize"));
			vault.setLatestReplicationTime(_ctx.longValue("DescribeVaultsResponse.Vaults["+ i +"].LatestReplicationTime"));
			vault.setVaultStatusMessage(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].VaultStatusMessage"));
			vault.setReplication(_ctx.booleanValue("DescribeVaultsResponse.Vaults["+ i +"].Replication"));
			vault.setReplicationSourceRegionId(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].ReplicationSourceRegionId"));
			vault.setVaultRegionId(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].VaultRegionId"));
			vault.setUpdatedTime(_ctx.longValue("DescribeVaultsResponse.Vaults["+ i +"].UpdatedTime"));
			vault.setResourceGroupId(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].ResourceGroupId"));
			vault.setBucketName(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].BucketName"));
			vault.setSearchEnabled(_ctx.booleanValue("DescribeVaultsResponse.Vaults["+ i +"].SearchEnabled"));
			vault.setIndexAvailable(_ctx.booleanValue("DescribeVaultsResponse.Vaults["+ i +"].IndexAvailable"));
			vault.setBytesDone(_ctx.longValue("DescribeVaultsResponse.Vaults["+ i +"].BytesDone"));
			vault.setEncryptType(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].EncryptType"));
			vault.setWormEnabled(_ctx.booleanValue("DescribeVaultsResponse.Vaults["+ i +"].WormEnabled"));
			vault.setSnapshotCount(_ctx.longValue("DescribeVaultsResponse.Vaults["+ i +"].SnapshotCount"));
			vault.setCompressionAlgorithm(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].CompressionAlgorithm"));
			vault.setRedundancyType(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].RedundancyType"));
			vault.setKmsKeyId(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].KmsKeyId"));
			vault.setChargedStorageSize(_ctx.longValue("DescribeVaultsResponse.Vaults["+ i +"].ChargedStorageSize"));

			List<String> sourceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVaultsResponse.Vaults["+ i +"].SourceTypes.Length"); j++) {
				sourceTypes.add(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].SourceTypes["+ j +"]"));
			}
			vault.setSourceTypes(sourceTypes);

			ReplicationProgress replicationProgress = new ReplicationProgress();
			replicationProgress.setHistoricalReplicationProgress(_ctx.integerValue("DescribeVaultsResponse.Vaults["+ i +"].ReplicationProgress.HistoricalReplicationProgress"));
			replicationProgress.setNewReplicationProgress(_ctx.longValue("DescribeVaultsResponse.Vaults["+ i +"].ReplicationProgress.NewReplicationProgress"));
			vault.setReplicationProgress(replicationProgress);

			BackupPlanStatistics backupPlanStatistics = new BackupPlanStatistics();
			backupPlanStatistics.setOracle(_ctx.integerValue("DescribeVaultsResponse.Vaults["+ i +"].BackupPlanStatistics.Oracle"));
			backupPlanStatistics.setLocalFile(_ctx.integerValue("DescribeVaultsResponse.Vaults["+ i +"].BackupPlanStatistics.LocalFile"));
			backupPlanStatistics.setNas(_ctx.integerValue("DescribeVaultsResponse.Vaults["+ i +"].BackupPlanStatistics.Nas"));
			backupPlanStatistics.setCommonNas(_ctx.integerValue("DescribeVaultsResponse.Vaults["+ i +"].BackupPlanStatistics.CommonNas"));
			backupPlanStatistics.setIsilon(_ctx.integerValue("DescribeVaultsResponse.Vaults["+ i +"].BackupPlanStatistics.Isilon"));
			backupPlanStatistics.setOss(_ctx.integerValue("DescribeVaultsResponse.Vaults["+ i +"].BackupPlanStatistics.Oss"));
			backupPlanStatistics.setSqlServer(_ctx.integerValue("DescribeVaultsResponse.Vaults["+ i +"].BackupPlanStatistics.SqlServer"));
			backupPlanStatistics.setCsg(_ctx.integerValue("DescribeVaultsResponse.Vaults["+ i +"].BackupPlanStatistics.Csg"));
			backupPlanStatistics.setEcsFile(_ctx.integerValue("DescribeVaultsResponse.Vaults["+ i +"].BackupPlanStatistics.EcsFile"));
			backupPlanStatistics.setMySql(_ctx.integerValue("DescribeVaultsResponse.Vaults["+ i +"].BackupPlanStatistics.MySql"));
			backupPlanStatistics.setEcsHana(_ctx.integerValue("DescribeVaultsResponse.Vaults["+ i +"].BackupPlanStatistics.EcsHana"));
			backupPlanStatistics.setLocalVm(_ctx.integerValue("DescribeVaultsResponse.Vaults["+ i +"].BackupPlanStatistics.LocalVm"));
			backupPlanStatistics.setOts(_ctx.integerValue("DescribeVaultsResponse.Vaults["+ i +"].BackupPlanStatistics.Ots"));
			vault.setBackupPlanStatistics(backupPlanStatistics);

			TrialInfo trialInfo = new TrialInfo();
			trialInfo.setTrialStartTime(_ctx.longValue("DescribeVaultsResponse.Vaults["+ i +"].TrialInfo.TrialStartTime"));
			trialInfo.setTrialVaultReleaseTime(_ctx.longValue("DescribeVaultsResponse.Vaults["+ i +"].TrialInfo.TrialVaultReleaseTime"));
			trialInfo.setTrialExpireTime(_ctx.longValue("DescribeVaultsResponse.Vaults["+ i +"].TrialInfo.TrialExpireTime"));
			trialInfo.setKeepAfterTrialExpiration(_ctx.booleanValue("DescribeVaultsResponse.Vaults["+ i +"].TrialInfo.KeepAfterTrialExpiration"));
			vault.setTrialInfo(trialInfo);

			Endpoint endpoint = new Endpoint();
			endpoint.setVpc(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].Endpoint.Vpc"));
			endpoint.setClassic(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].Endpoint.Classic"));
			endpoint.setPub(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].Endpoint.Pub"));
			vault.setEndpoint(endpoint);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVaultsResponse.Vaults["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeVaultsResponse.Vaults["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			vault.setTags(tags);

			vaults.add(vault);
		}
		describeVaultsResponse.setVaults(vaults);
	 
	 	return describeVaultsResponse;
	}
}