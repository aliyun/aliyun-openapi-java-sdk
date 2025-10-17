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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeDbClusterAttributeZonalResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDbClusterAttributeZonalResponse.DBNode;
import com.aliyuncs.polardb.model.v20170801.DescribeDbClusterAttributeZonalResponse.RelatedAPInstance;
import com.aliyuncs.polardb.model.v20170801.DescribeDbClusterAttributeZonalResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDbClusterAttributeZonalResponseUnmarshaller {

	public static DescribeDbClusterAttributeZonalResponse unmarshall(DescribeDbClusterAttributeZonalResponse describeDbClusterAttributeZonalResponse, UnmarshallerContext _ctx) {
		
		describeDbClusterAttributeZonalResponse.setRequestId(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.RequestId"));
		describeDbClusterAttributeZonalResponse.setDeletionLock(_ctx.integerValue("DescribeDbClusterAttributeZonalResponse.DeletionLock"));
		describeDbClusterAttributeZonalResponse.setCategory(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.Category"));
		describeDbClusterAttributeZonalResponse.setResourceGroupId(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.ResourceGroupId"));
		describeDbClusterAttributeZonalResponse.setDataLevel1BackupChainSize(_ctx.longValue("DescribeDbClusterAttributeZonalResponse.DataLevel1BackupChainSize"));
		describeDbClusterAttributeZonalResponse.setDBClusterId(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBClusterId"));
		describeDbClusterAttributeZonalResponse.setDBType(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBType"));
		describeDbClusterAttributeZonalResponse.setDBClusterNetworkType(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBClusterNetworkType"));
		describeDbClusterAttributeZonalResponse.setIsLatestVersion(_ctx.booleanValue("DescribeDbClusterAttributeZonalResponse.IsLatestVersion"));
		describeDbClusterAttributeZonalResponse.setHasCompleteStandbyRes(_ctx.booleanValue("DescribeDbClusterAttributeZonalResponse.HasCompleteStandbyRes"));
		describeDbClusterAttributeZonalResponse.setHotStandbyClusterStatus(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.HotStandbyClusterStatus"));
		describeDbClusterAttributeZonalResponse.setHotStandbyCluster(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.HotStandbyCluster"));
		describeDbClusterAttributeZonalResponse.setDataSyncMode(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DataSyncMode"));
		describeDbClusterAttributeZonalResponse.setStandbyHAMode(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.StandbyHAMode"));
		describeDbClusterAttributeZonalResponse.setCompressStorageMode(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.CompressStorageMode"));
		describeDbClusterAttributeZonalResponse.setStorageMax(_ctx.longValue("DescribeDbClusterAttributeZonalResponse.StorageMax"));
		describeDbClusterAttributeZonalResponse.setDBVersion(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBVersion"));
		describeDbClusterAttributeZonalResponse.setZoneIds(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.ZoneIds"));
		describeDbClusterAttributeZonalResponse.setMaintainTime(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.MaintainTime"));
		describeDbClusterAttributeZonalResponse.setEngine(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.Engine"));
		describeDbClusterAttributeZonalResponse.setVPCId(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.VPCId"));
		describeDbClusterAttributeZonalResponse.setDBClusterStatus(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBClusterStatus"));
		describeDbClusterAttributeZonalResponse.setVSwitchId(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.VSwitchId"));
		describeDbClusterAttributeZonalResponse.setDBClusterDescription(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBClusterDescription"));
		describeDbClusterAttributeZonalResponse.setExpired(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.Expired"));
		describeDbClusterAttributeZonalResponse.setPayType(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.PayType"));
		describeDbClusterAttributeZonalResponse.setStoragePayType(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.StoragePayType"));
		describeDbClusterAttributeZonalResponse.setLockMode(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.LockMode"));
		describeDbClusterAttributeZonalResponse.setStorageUsed(_ctx.longValue("DescribeDbClusterAttributeZonalResponse.StorageUsed"));
		describeDbClusterAttributeZonalResponse.setCompressStorageUsed(_ctx.longValue("DescribeDbClusterAttributeZonalResponse.CompressStorageUsed"));
		describeDbClusterAttributeZonalResponse.setStorageSpace(_ctx.longValue("DescribeDbClusterAttributeZonalResponse.StorageSpace"));
		describeDbClusterAttributeZonalResponse.setDBVersionStatus(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBVersionStatus"));
		describeDbClusterAttributeZonalResponse.setCreationTime(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.CreationTime"));
		describeDbClusterAttributeZonalResponse.setSQLSize(_ctx.longValue("DescribeDbClusterAttributeZonalResponse.SQLSize"));
		describeDbClusterAttributeZonalResponse.setInodeTotal(_ctx.longValue("DescribeDbClusterAttributeZonalResponse.InodeTotal"));
		describeDbClusterAttributeZonalResponse.setInodeUsed(_ctx.longValue("DescribeDbClusterAttributeZonalResponse.InodeUsed"));
		describeDbClusterAttributeZonalResponse.setBlktagTotal(_ctx.longValue("DescribeDbClusterAttributeZonalResponse.BlktagTotal"));
		describeDbClusterAttributeZonalResponse.setBlktagUsed(_ctx.longValue("DescribeDbClusterAttributeZonalResponse.BlktagUsed"));
		describeDbClusterAttributeZonalResponse.setRegionId(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.RegionId"));
		describeDbClusterAttributeZonalResponse.setExpireTime(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.ExpireTime"));
		describeDbClusterAttributeZonalResponse.setSubCategory(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.SubCategory"));
		describeDbClusterAttributeZonalResponse.setDeployUnit(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DeployUnit"));
		describeDbClusterAttributeZonalResponse.setIsProxyLatestVersion(_ctx.booleanValue("DescribeDbClusterAttributeZonalResponse.IsProxyLatestVersion"));
		describeDbClusterAttributeZonalResponse.setStorageType(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.StorageType"));
		describeDbClusterAttributeZonalResponse.setServerlessType(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.ServerlessType"));
		describeDbClusterAttributeZonalResponse.setStrictConsistency(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.StrictConsistency"));
		describeDbClusterAttributeZonalResponse.setProxyCpuCores(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.ProxyCpuCores"));
		describeDbClusterAttributeZonalResponse.setProxyStandardCpuCores(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.ProxyStandardCpuCores"));
		describeDbClusterAttributeZonalResponse.setProxyType(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.ProxyType"));
		describeDbClusterAttributeZonalResponse.setProxyStatus(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.ProxyStatus"));
		describeDbClusterAttributeZonalResponse.setFeatureHTAPSupported(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.FeatureHTAPSupported"));
		describeDbClusterAttributeZonalResponse.setProxyServerlessType(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.ProxyServerlessType"));
		describeDbClusterAttributeZonalResponse.setArchitecture(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.Architecture"));
		describeDbClusterAttributeZonalResponse.setAiType(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.AiType"));
		describeDbClusterAttributeZonalResponse.setProvisionedIops(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.ProvisionedIops"));
		describeDbClusterAttributeZonalResponse.setHotStandbyHealthy(_ctx.booleanValue("DescribeDbClusterAttributeZonalResponse.HotStandbyHealthy"));
		describeDbClusterAttributeZonalResponse.setHotStandbyWhiteListSwitch(_ctx.booleanValue("DescribeDbClusterAttributeZonalResponse.HotStandbyWhiteListSwitch"));
		describeDbClusterAttributeZonalResponse.setStorageTypeWhiteListSwitch(_ctx.booleanValue("DescribeDbClusterAttributeZonalResponse.StorageTypeWhiteListSwitch"));
		describeDbClusterAttributeZonalResponse.setAiFreeMode(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.AiFreeMode"));
		describeDbClusterAttributeZonalResponse.setAiCreatingTime(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.AiCreatingTime"));
		describeDbClusterAttributeZonalResponse.setSupportInstantSwitchWithImci(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.SupportInstantSwitchWithImci"));
		describeDbClusterAttributeZonalResponse.setOrca(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.Orca"));
		describeDbClusterAttributeZonalResponse.setSourceDBCluster(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.SourceDBCluster"));
		describeDbClusterAttributeZonalResponse.setRestoreType(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.RestoreType"));
		describeDbClusterAttributeZonalResponse.setRestoreDataPoint(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.RestoreDataPoint"));
		describeDbClusterAttributeZonalResponse.setSourceRegionId(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.SourceRegionId"));
		describeDbClusterAttributeZonalResponse.setImciAutoIndex(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.ImciAutoIndex"));
		describeDbClusterAttributeZonalResponse.setOsVersion(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.OsVersion"));
		describeDbClusterAttributeZonalResponse.setAutoUpgradeMinorVersion(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.AutoUpgradeMinorVersion"));
		describeDbClusterAttributeZonalResponse.setBurstingEnabled(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.BurstingEnabled"));
		describeDbClusterAttributeZonalResponse.setRowCompression(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.RowCompression"));
		describeDbClusterAttributeZonalResponse.setImperceptibleSwitch(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.ImperceptibleSwitch"));
		describeDbClusterAttributeZonalResponse.setCnNodeCount(_ctx.integerValue("DescribeDbClusterAttributeZonalResponse.CnNodeCount"));
		describeDbClusterAttributeZonalResponse.setDnNodeCount(_ctx.integerValue("DescribeDbClusterAttributeZonalResponse.DnNodeCount"));
		describeDbClusterAttributeZonalResponse.setDocumentDB(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DocumentDB"));
		describeDbClusterAttributeZonalResponse.setBackupDowngradeLevel(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.BackupDowngradeLevel"));
		describeDbClusterAttributeZonalResponse.setRelativeAICluster(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.RelativeAICluster"));
		describeDbClusterAttributeZonalResponse.setDynamoDB(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DynamoDB"));
		describeDbClusterAttributeZonalResponse.setDBClusterClass(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBClusterClass"));

		RelatedAPInstance relatedAPInstance = new RelatedAPInstance();
		relatedAPInstance.setName(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.RelatedAPInstance.Name"));
		relatedAPInstance.setClassCode(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.RelatedAPInstance.ClassCode"));
		relatedAPInstance.setOssStorageUsed(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.RelatedAPInstance.OssStorageUsed"));
		relatedAPInstance.setTotalAPNodes(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.RelatedAPInstance.TotalAPNodes"));
		relatedAPInstance.setStorageUsedMB(_ctx.floatValue("DescribeDbClusterAttributeZonalResponse.RelatedAPInstance.StorageUsedMB"));
		relatedAPInstance.setAPNodeStatus(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.RelatedAPInstance.APNodeStatus"));
		describeDbClusterAttributeZonalResponse.setRelatedAPInstance(relatedAPInstance);

		List<DBNode> dBNodes = new ArrayList<DBNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDbClusterAttributeZonalResponse.DBNodes.Length"); i++) {
			DBNode dBNode = new DBNode();
			dBNode.setDBNodeStatus(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].DBNodeStatus"));
			dBNode.setSubGroupDescription(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].SubGroupDescription"));
			dBNode.setAddedCpuCores(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].AddedCpuCores"));
			dBNode.setOrca(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].Orca"));
			dBNode.setDBNodeRole(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].DBNodeRole"));
			dBNode.setSubCluster(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].SubCluster"));
			dBNode.setOsVersion(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].OsVersion"));
			dBNode.setSupportMemPool(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].SupportMemPool"));
			dBNode.setImciSwitch(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].ImciSwitch"));
			dBNode.setDBNodeId(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].DBNodeId"));
			dBNode.setRemoteMemorySize(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].RemoteMemorySize"));
			dBNode.setBlktagUsed(_ctx.longValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].BlktagUsed"));
			dBNode.setSubGroupType(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].SubGroupType"));
			dBNode.setTair(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].Tair"));
			dBNode.setStorageMax(_ctx.longValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].StorageMax"));
			dBNode.setMultiMasterLocalStandby(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].MultiMasterLocalStandby"));
			dBNode.setMultiMasterPrimaryNode(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].MultiMasterPrimaryNode"));
			dBNode.setSccMode(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].SccMode"));
			dBNode.setIsPrimaryCN(_ctx.booleanValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].IsPrimaryCN"));
			dBNode.setStandbyZoneIds(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].StandbyZoneIds"));
			dBNode.setInodeUsed(_ctx.longValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].InodeUsed"));
			dBNode.setFailoverPriority(_ctx.integerValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].FailoverPriority"));
			dBNode.setServerWeight(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].ServerWeight"));
			dBNode.setDBNodeDescription(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].DBNodeDescription"));
			dBNode.setMemorySize(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].MemorySize"));
			dBNode.setBlktagTotal(_ctx.longValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].BlktagTotal"));
			dBNode.setMirrorInsName(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].MirrorInsName"));
			dBNode.setZoneId(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].ZoneId"));
			dBNode.setMaxConnections(_ctx.integerValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].MaxConnections"));
			dBNode.setArchitecture(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].Architecture"));
			dBNode.setSubGroupName(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].SubGroupName"));
			dBNode.setMaxIOPS(_ctx.integerValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].MaxIOPS"));
			dBNode.setDBNodeClass(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].DBNodeClass"));
			dBNode.setStorageUsed(_ctx.longValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].StorageUsed"));
			dBNode.setInodeTotal(_ctx.longValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].InodeTotal"));
			dBNode.setServerlessType(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].ServerlessType"));
			dBNode.setCreationTime(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].CreationTime"));
			dBNode.setCpuCores(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].CpuCores"));
			dBNode.setMasterId(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].MasterId"));
			dBNode.setHotReplicaMode(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.DBNodes["+ i +"].HotReplicaMode"));

			dBNodes.add(dBNode);
		}
		describeDbClusterAttributeZonalResponse.setDBNodes(dBNodes);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDbClusterAttributeZonalResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setValue(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.Tags["+ i +"].Value"));
			tag.setKey(_ctx.stringValue("DescribeDbClusterAttributeZonalResponse.Tags["+ i +"].Key"));

			tags.add(tag);
		}
		describeDbClusterAttributeZonalResponse.setTags(tags);
	 
	 	return describeDbClusterAttributeZonalResponse;
	}
}