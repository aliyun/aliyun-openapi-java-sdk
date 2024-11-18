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

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterAttributeResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterAttributeResponse.DBNode;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterAttributeResponse.RelatedAPInstance;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterAttributeResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterAttributeResponseUnmarshaller {

	public static DescribeDBClusterAttributeResponse unmarshall(DescribeDBClusterAttributeResponse describeDBClusterAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterAttributeResponse.setRequestId(_ctx.stringValue("DescribeDBClusterAttributeResponse.RequestId"));
		describeDBClusterAttributeResponse.setDeletionLock(_ctx.integerValue("DescribeDBClusterAttributeResponse.DeletionLock"));
		describeDBClusterAttributeResponse.setCategory(_ctx.stringValue("DescribeDBClusterAttributeResponse.Category"));
		describeDBClusterAttributeResponse.setResourceGroupId(_ctx.stringValue("DescribeDBClusterAttributeResponse.ResourceGroupId"));
		describeDBClusterAttributeResponse.setDataLevel1BackupChainSize(_ctx.longValue("DescribeDBClusterAttributeResponse.DataLevel1BackupChainSize"));
		describeDBClusterAttributeResponse.setDBClusterId(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBClusterId"));
		describeDBClusterAttributeResponse.setDBType(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBType"));
		describeDBClusterAttributeResponse.setDBClusterNetworkType(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBClusterNetworkType"));
		describeDBClusterAttributeResponse.setIsLatestVersion(_ctx.booleanValue("DescribeDBClusterAttributeResponse.IsLatestVersion"));
		describeDBClusterAttributeResponse.setHasCompleteStandbyRes(_ctx.booleanValue("DescribeDBClusterAttributeResponse.HasCompleteStandbyRes"));
		describeDBClusterAttributeResponse.setHotStandbyClusterStatus(_ctx.stringValue("DescribeDBClusterAttributeResponse.HotStandbyClusterStatus"));
		describeDBClusterAttributeResponse.setHotStandbyCluster(_ctx.stringValue("DescribeDBClusterAttributeResponse.HotStandbyCluster"));
		describeDBClusterAttributeResponse.setDataSyncMode(_ctx.stringValue("DescribeDBClusterAttributeResponse.DataSyncMode"));
		describeDBClusterAttributeResponse.setStandbyHAMode(_ctx.stringValue("DescribeDBClusterAttributeResponse.StandbyHAMode"));
		describeDBClusterAttributeResponse.setCompressStorageMode(_ctx.stringValue("DescribeDBClusterAttributeResponse.CompressStorageMode"));
		describeDBClusterAttributeResponse.setStorageMax(_ctx.longValue("DescribeDBClusterAttributeResponse.StorageMax"));
		describeDBClusterAttributeResponse.setDBVersion(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBVersion"));
		describeDBClusterAttributeResponse.setZoneIds(_ctx.stringValue("DescribeDBClusterAttributeResponse.ZoneIds"));
		describeDBClusterAttributeResponse.setMaintainTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.MaintainTime"));
		describeDBClusterAttributeResponse.setEngine(_ctx.stringValue("DescribeDBClusterAttributeResponse.Engine"));
		describeDBClusterAttributeResponse.setVPCId(_ctx.stringValue("DescribeDBClusterAttributeResponse.VPCId"));
		describeDBClusterAttributeResponse.setDBClusterStatus(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBClusterStatus"));
		describeDBClusterAttributeResponse.setVSwitchId(_ctx.stringValue("DescribeDBClusterAttributeResponse.VSwitchId"));
		describeDBClusterAttributeResponse.setDBClusterDescription(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBClusterDescription"));
		describeDBClusterAttributeResponse.setExpired(_ctx.stringValue("DescribeDBClusterAttributeResponse.Expired"));
		describeDBClusterAttributeResponse.setPayType(_ctx.stringValue("DescribeDBClusterAttributeResponse.PayType"));
		describeDBClusterAttributeResponse.setStoragePayType(_ctx.stringValue("DescribeDBClusterAttributeResponse.StoragePayType"));
		describeDBClusterAttributeResponse.setLockMode(_ctx.stringValue("DescribeDBClusterAttributeResponse.LockMode"));
		describeDBClusterAttributeResponse.setStorageUsed(_ctx.longValue("DescribeDBClusterAttributeResponse.StorageUsed"));
		describeDBClusterAttributeResponse.setCompressStorageUsed(_ctx.longValue("DescribeDBClusterAttributeResponse.CompressStorageUsed"));
		describeDBClusterAttributeResponse.setStorageSpace(_ctx.longValue("DescribeDBClusterAttributeResponse.StorageSpace"));
		describeDBClusterAttributeResponse.setDBVersionStatus(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBVersionStatus"));
		describeDBClusterAttributeResponse.setCreationTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.CreationTime"));
		describeDBClusterAttributeResponse.setSQLSize(_ctx.longValue("DescribeDBClusterAttributeResponse.SQLSize"));
		describeDBClusterAttributeResponse.setInodeTotal(_ctx.longValue("DescribeDBClusterAttributeResponse.InodeTotal"));
		describeDBClusterAttributeResponse.setInodeUsed(_ctx.longValue("DescribeDBClusterAttributeResponse.InodeUsed"));
		describeDBClusterAttributeResponse.setBlktagTotal(_ctx.longValue("DescribeDBClusterAttributeResponse.BlktagTotal"));
		describeDBClusterAttributeResponse.setBlktagUsed(_ctx.longValue("DescribeDBClusterAttributeResponse.BlktagUsed"));
		describeDBClusterAttributeResponse.setRegionId(_ctx.stringValue("DescribeDBClusterAttributeResponse.RegionId"));
		describeDBClusterAttributeResponse.setExpireTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.ExpireTime"));
		describeDBClusterAttributeResponse.setSubCategory(_ctx.stringValue("DescribeDBClusterAttributeResponse.SubCategory"));
		describeDBClusterAttributeResponse.setDeployUnit(_ctx.stringValue("DescribeDBClusterAttributeResponse.DeployUnit"));
		describeDBClusterAttributeResponse.setIsProxyLatestVersion(_ctx.booleanValue("DescribeDBClusterAttributeResponse.IsProxyLatestVersion"));
		describeDBClusterAttributeResponse.setStorageType(_ctx.stringValue("DescribeDBClusterAttributeResponse.StorageType"));
		describeDBClusterAttributeResponse.setServerlessType(_ctx.stringValue("DescribeDBClusterAttributeResponse.ServerlessType"));
		describeDBClusterAttributeResponse.setStrictConsistency(_ctx.stringValue("DescribeDBClusterAttributeResponse.StrictConsistency"));
		describeDBClusterAttributeResponse.setProxyCpuCores(_ctx.stringValue("DescribeDBClusterAttributeResponse.ProxyCpuCores"));
		describeDBClusterAttributeResponse.setProxyStandardCpuCores(_ctx.stringValue("DescribeDBClusterAttributeResponse.ProxyStandardCpuCores"));
		describeDBClusterAttributeResponse.setProxyType(_ctx.stringValue("DescribeDBClusterAttributeResponse.ProxyType"));
		describeDBClusterAttributeResponse.setProxyStatus(_ctx.stringValue("DescribeDBClusterAttributeResponse.ProxyStatus"));
		describeDBClusterAttributeResponse.setFeatureHTAPSupported(_ctx.stringValue("DescribeDBClusterAttributeResponse.FeatureHTAPSupported"));
		describeDBClusterAttributeResponse.setProxyServerlessType(_ctx.stringValue("DescribeDBClusterAttributeResponse.ProxyServerlessType"));
		describeDBClusterAttributeResponse.setArchitecture(_ctx.stringValue("DescribeDBClusterAttributeResponse.Architecture"));
		describeDBClusterAttributeResponse.setAiType(_ctx.stringValue("DescribeDBClusterAttributeResponse.AiType"));
		describeDBClusterAttributeResponse.setProvisionedIops(_ctx.stringValue("DescribeDBClusterAttributeResponse.ProvisionedIops"));
		describeDBClusterAttributeResponse.setHotStandbyHealthy(_ctx.booleanValue("DescribeDBClusterAttributeResponse.HotStandbyHealthy"));
		describeDBClusterAttributeResponse.setHotStandbyWhiteListSwitch(_ctx.booleanValue("DescribeDBClusterAttributeResponse.HotStandbyWhiteListSwitch"));
		describeDBClusterAttributeResponse.setStorageTypeWhiteListSwitch(_ctx.booleanValue("DescribeDBClusterAttributeResponse.StorageTypeWhiteListSwitch"));
		describeDBClusterAttributeResponse.setAiFreeMode(_ctx.stringValue("DescribeDBClusterAttributeResponse.AiFreeMode"));
		describeDBClusterAttributeResponse.setAiCreatingTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.AiCreatingTime"));
		describeDBClusterAttributeResponse.setSupportInstantSwitchWithImci(_ctx.stringValue("DescribeDBClusterAttributeResponse.SupportInstantSwitchWithImci"));
		describeDBClusterAttributeResponse.setOrca(_ctx.stringValue("DescribeDBClusterAttributeResponse.Orca"));
		describeDBClusterAttributeResponse.setSourceDBCluster(_ctx.stringValue("DescribeDBClusterAttributeResponse.SourceDBCluster"));
		describeDBClusterAttributeResponse.setRestoreType(_ctx.stringValue("DescribeDBClusterAttributeResponse.RestoreType"));
		describeDBClusterAttributeResponse.setRestoreDataPoint(_ctx.stringValue("DescribeDBClusterAttributeResponse.RestoreDataPoint"));
		describeDBClusterAttributeResponse.setSourceRegionId(_ctx.stringValue("DescribeDBClusterAttributeResponse.SourceRegionId"));
		describeDBClusterAttributeResponse.setImciAutoIndex(_ctx.stringValue("DescribeDBClusterAttributeResponse.ImciAutoIndex"));
		describeDBClusterAttributeResponse.setBurstingEnabled(_ctx.stringValue("DescribeDBClusterAttributeResponse.BurstingEnabled"));

		RelatedAPInstance relatedAPInstance = new RelatedAPInstance();
		relatedAPInstance.setName(_ctx.stringValue("DescribeDBClusterAttributeResponse.RelatedAPInstance.Name"));
		relatedAPInstance.setClassCode(_ctx.stringValue("DescribeDBClusterAttributeResponse.RelatedAPInstance.ClassCode"));
		relatedAPInstance.setOssStorageUsed(_ctx.stringValue("DescribeDBClusterAttributeResponse.RelatedAPInstance.OssStorageUsed"));
		relatedAPInstance.setTotalAPNodes(_ctx.stringValue("DescribeDBClusterAttributeResponse.RelatedAPInstance.TotalAPNodes"));
		relatedAPInstance.setStorageUsedMB(_ctx.floatValue("DescribeDBClusterAttributeResponse.RelatedAPInstance.StorageUsedMB"));
		relatedAPInstance.setAPNodeStatus(_ctx.stringValue("DescribeDBClusterAttributeResponse.RelatedAPInstance.APNodeStatus"));
		describeDBClusterAttributeResponse.setRelatedAPInstance(relatedAPInstance);

		List<DBNode> dBNodes = new ArrayList<DBNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterAttributeResponse.DBNodes.Length"); i++) {
			DBNode dBNode = new DBNode();
			dBNode.setCreationTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].CreationTime"));
			dBNode.setFailoverPriority(_ctx.integerValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].FailoverPriority"));
			dBNode.setMaxIOPS(_ctx.integerValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].MaxIOPS"));
			dBNode.setDBNodeClass(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeClass"));
			dBNode.setCpuCores(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].CpuCores"));
			dBNode.setMemorySize(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].MemorySize"));
			dBNode.setDBNodeRole(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeRole"));
			dBNode.setZoneId(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].ZoneId"));
			dBNode.setMaxConnections(_ctx.integerValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].MaxConnections"));
			dBNode.setDBNodeStatus(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeStatus"));
			dBNode.setDBNodeId(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeId"));
			dBNode.setImciSwitch(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].ImciSwitch"));
			dBNode.setHotReplicaMode(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].HotReplicaMode"));
			dBNode.setAddedCpuCores(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].AddedCpuCores"));
			dBNode.setMasterId(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].MasterId"));
			dBNode.setSccMode(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].SccMode"));
			dBNode.setServerWeight(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].ServerWeight"));
			dBNode.setServerlessType(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].ServerlessType"));
			dBNode.setSubCluster(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].SubCluster"));
			dBNode.setTair(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].Tair"));
			dBNode.setRemoteMemorySize(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].RemoteMemorySize"));
			dBNode.setOrca(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].Orca"));
			dBNode.setMirrorInsName(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].MirrorInsName"));
			dBNode.setMultiMasterLocalStandby(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].MultiMasterLocalStandby"));
			dBNode.setMultiMasterPrimaryNode(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].MultiMasterPrimaryNode"));
			dBNode.setDBNodeDescription(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeDescription"));

			dBNodes.add(dBNode);
		}
		describeDBClusterAttributeResponse.setDBNodes(dBNodes);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterAttributeResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeDBClusterAttributeResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeDBClusterAttributeResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		describeDBClusterAttributeResponse.setTags(tags);
	 
	 	return describeDBClusterAttributeResponse;
	}
}