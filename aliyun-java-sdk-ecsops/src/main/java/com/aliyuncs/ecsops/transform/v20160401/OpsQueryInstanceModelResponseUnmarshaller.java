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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryInstanceModelResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryInstanceModelResponse.ClusterModel;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryInstanceModelResponse.RegionModel;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryInstanceModelResponse.ZoneModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryInstanceModelResponseUnmarshaller {

	public static OpsQueryInstanceModelResponse unmarshall(OpsQueryInstanceModelResponse opsQueryInstanceModelResponse, UnmarshallerContext _ctx) {
		
		opsQueryInstanceModelResponse.setRequestId(_ctx.stringValue("OpsQueryInstanceModelResponse.RequestId"));
		opsQueryInstanceModelResponse.setInstanceNumericId(_ctx.longValue("OpsQueryInstanceModelResponse.InstanceNumericId"));
		opsQueryInstanceModelResponse.setAliUid(_ctx.longValue("OpsQueryInstanceModelResponse.AliUid"));
		opsQueryInstanceModelResponse.setBid(_ctx.stringValue("OpsQueryInstanceModelResponse.Bid"));
		opsQueryInstanceModelResponse.setAgentId(_ctx.integerValue("OpsQueryInstanceModelResponse.AgentId"));
		opsQueryInstanceModelResponse.setInstanceId(_ctx.stringValue("OpsQueryInstanceModelResponse.InstanceId"));
		opsQueryInstanceModelResponse.setSecurityGroupId(_ctx.stringValue("OpsQueryInstanceModelResponse.SecurityGroupId"));
		opsQueryInstanceModelResponse.setStatus(_ctx.stringValue("OpsQueryInstanceModelResponse.Status"));
		opsQueryInstanceModelResponse.setBusinessStatus(_ctx.stringValue("OpsQueryInstanceModelResponse.BusinessStatus"));
		opsQueryInstanceModelResponse.setEcsBusinessStatus(_ctx.stringValue("OpsQueryInstanceModelResponse.EcsBusinessStatus"));
		opsQueryInstanceModelResponse.setImageNumericId(_ctx.longValue("OpsQueryInstanceModelResponse.ImageNumericId"));
		opsQueryInstanceModelResponse.setImageType(_ctx.stringValue("OpsQueryInstanceModelResponse.ImageType"));
		opsQueryInstanceModelResponse.setImageId(_ctx.stringValue("OpsQueryInstanceModelResponse.ImageId"));
		opsQueryInstanceModelResponse.setImageName(_ctx.stringValue("OpsQueryInstanceModelResponse.ImageName"));
		opsQueryInstanceModelResponse.setOsName(_ctx.stringValue("OpsQueryInstanceModelResponse.OsName"));
		opsQueryInstanceModelResponse.setOsType(_ctx.stringValue("OpsQueryInstanceModelResponse.OsType"));
		opsQueryInstanceModelResponse.setIsWin(_ctx.booleanValue("OpsQueryInstanceModelResponse.IsWin"));
		opsQueryInstanceModelResponse.setRegionNumericId(_ctx.longValue("OpsQueryInstanceModelResponse.RegionNumericId"));
		opsQueryInstanceModelResponse.setZoneNumericId(_ctx.longValue("OpsQueryInstanceModelResponse.ZoneNumericId"));
		opsQueryInstanceModelResponse.setClusterNumericId(_ctx.longValue("OpsQueryInstanceModelResponse.ClusterNumericId"));
		opsQueryInstanceModelResponse.setRecoverable(_ctx.booleanValue("OpsQueryInstanceModelResponse.Recoverable"));
		opsQueryInstanceModelResponse.setRecoverPolicy(_ctx.stringValue("OpsQueryInstanceModelResponse.RecoverPolicy"));
		opsQueryInstanceModelResponse.setGmtCreated(_ctx.stringValue("OpsQueryInstanceModelResponse.GmtCreated"));
		opsQueryInstanceModelResponse.setGmtModified(_ctx.stringValue("OpsQueryInstanceModelResponse.GmtModified"));
		opsQueryInstanceModelResponse.setGmtSync(_ctx.stringValue("OpsQueryInstanceModelResponse.GmtSync"));
		opsQueryInstanceModelResponse.setGmtRelease(_ctx.stringValue("OpsQueryInstanceModelResponse.GmtRelease"));
		opsQueryInstanceModelResponse.setGmtStarted(_ctx.stringValue("OpsQueryInstanceModelResponse.GmtStarted"));
		opsQueryInstanceModelResponse.setHostname(_ctx.stringValue("OpsQueryInstanceModelResponse.Hostname"));
		opsQueryInstanceModelResponse.setCores(_ctx.integerValue("OpsQueryInstanceModelResponse.Cores"));
		opsQueryInstanceModelResponse.setDiskSize(_ctx.integerValue("OpsQueryInstanceModelResponse.DiskSize"));
		opsQueryInstanceModelResponse.setMemory(_ctx.integerValue("OpsQueryInstanceModelResponse.Memory"));
		opsQueryInstanceModelResponse.setIntranetIp(_ctx.stringValue("OpsQueryInstanceModelResponse.IntranetIp"));
		opsQueryInstanceModelResponse.setInternetIp(_ctx.stringValue("OpsQueryInstanceModelResponse.InternetIp"));
		opsQueryInstanceModelResponse.setIntranetRx(_ctx.integerValue("OpsQueryInstanceModelResponse.IntranetRx"));
		opsQueryInstanceModelResponse.setIntranetTx(_ctx.integerValue("OpsQueryInstanceModelResponse.IntranetTx"));
		opsQueryInstanceModelResponse.setInternetRx(_ctx.integerValue("OpsQueryInstanceModelResponse.InternetRx"));
		opsQueryInstanceModelResponse.setInternetTx(_ctx.integerValue("OpsQueryInstanceModelResponse.InternetTx"));
		opsQueryInstanceModelResponse.setSystemDiskCategory(_ctx.stringValue("OpsQueryInstanceModelResponse.SystemDiskCategory"));
		opsQueryInstanceModelResponse.setImagePc(_ctx.stringValue("OpsQueryInstanceModelResponse.ImagePc"));
		opsQueryInstanceModelResponse.setIoOptimized(_ctx.booleanValue("OpsQueryInstanceModelResponse.IoOptimized"));

		RegionModel regionModel = new RegionModel();
		regionModel.setRegionNumericId(_ctx.longValue("OpsQueryInstanceModelResponse.RegionModel.RegionNumericId"));
		regionModel.setRegionIsActive(_ctx.stringValue("OpsQueryInstanceModelResponse.RegionModel.RegionIsActive"));
		regionModel.setRegionMemo(_ctx.stringValue("OpsQueryInstanceModelResponse.RegionModel.RegionMemo"));
		regionModel.setRegionId(_ctx.stringValue("OpsQueryInstanceModelResponse.RegionModel.RegionId"));
		regionModel.setRegionName(_ctx.stringValue("OpsQueryInstanceModelResponse.RegionModel.RegionName"));
		regionModel.setRegionIdAlias(_ctx.stringValue("OpsQueryInstanceModelResponse.RegionModel.RegionIdAlias"));
		opsQueryInstanceModelResponse.setRegionModel(regionModel);

		ZoneModel zoneModel = new ZoneModel();
		zoneModel.setZoneId(_ctx.stringValue("OpsQueryInstanceModelResponse.ZoneModel.ZoneId"));
		zoneModel.setRegionId(_ctx.stringValue("OpsQueryInstanceModelResponse.ZoneModel.RegionId"));
		zoneModel.setZoneCnName(_ctx.stringValue("OpsQueryInstanceModelResponse.ZoneModel.ZoneCnName"));
		zoneModel.setZoneEnName(_ctx.stringValue("OpsQueryInstanceModelResponse.ZoneModel.ZoneEnName"));
		zoneModel.setZoneStatus(_ctx.stringValue("OpsQueryInstanceModelResponse.ZoneModel.ZoneStatus"));
		opsQueryInstanceModelResponse.setZoneModel(zoneModel);

		ClusterModel clusterModel = new ClusterModel();
		clusterModel.setClusterNumericId(_ctx.longValue("OpsQueryInstanceModelResponse.ClusterModel.ClusterNumericId"));
		clusterModel.setClusterIsActive(_ctx.stringValue("OpsQueryInstanceModelResponse.ClusterModel.ClusterIsActive"));
		clusterModel.setRegionNumericId(_ctx.longValue("OpsQueryInstanceModelResponse.ClusterModel.RegionNumericId"));
		clusterModel.setClusterId(_ctx.stringValue("OpsQueryInstanceModelResponse.ClusterModel.ClusterId"));
		clusterModel.setClusterName(_ctx.stringValue("OpsQueryInstanceModelResponse.ClusterModel.ClusterName"));
		clusterModel.setClusterIdAlias(_ctx.stringValue("OpsQueryInstanceModelResponse.ClusterModel.ClusterIdAlias"));
		clusterModel.setClusterRouteIpSegment(_ctx.stringValue("OpsQueryInstanceModelResponse.ClusterModel.ClusterRouteIpSegment"));
		clusterModel.setClusterMemo(_ctx.stringValue("OpsQueryInstanceModelResponse.ClusterModel.ClusterMemo"));
		clusterModel.setClusterIsWritable(_ctx.booleanValue("OpsQueryInstanceModelResponse.ClusterModel.ClusterIsWritable"));
		clusterModel.setAvailableZoneID(_ctx.stringValue("OpsQueryInstanceModelResponse.ClusterModel.AvailableZoneID"));
		opsQueryInstanceModelResponse.setClusterModel(clusterModel);
	 
	 	return opsQueryInstanceModelResponse;
	}
}