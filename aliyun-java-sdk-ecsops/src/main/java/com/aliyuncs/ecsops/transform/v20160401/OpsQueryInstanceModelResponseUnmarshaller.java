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
		opsQueryInstanceModelResponse.setRecoverPolicy(_ctx.stringValue("OpsQueryInstanceModelResponse.RecoverPolicy"));
		opsQueryInstanceModelResponse.setMemory(_ctx.integerValue("OpsQueryInstanceModelResponse.Memory"));
		opsQueryInstanceModelResponse.setGmtModified(_ctx.stringValue("OpsQueryInstanceModelResponse.GmtModified"));
		opsQueryInstanceModelResponse.setIsWin(_ctx.booleanValue("OpsQueryInstanceModelResponse.IsWin"));
		opsQueryInstanceModelResponse.setGmtCreated(_ctx.stringValue("OpsQueryInstanceModelResponse.GmtCreated"));
		opsQueryInstanceModelResponse.setIntranetIp(_ctx.stringValue("OpsQueryInstanceModelResponse.IntranetIp"));
		opsQueryInstanceModelResponse.setBusinessStatus(_ctx.stringValue("OpsQueryInstanceModelResponse.BusinessStatus"));
		opsQueryInstanceModelResponse.setGmtSync(_ctx.stringValue("OpsQueryInstanceModelResponse.GmtSync"));
		opsQueryInstanceModelResponse.setClusterNumericId(_ctx.longValue("OpsQueryInstanceModelResponse.ClusterNumericId"));
		opsQueryInstanceModelResponse.setImageType(_ctx.stringValue("OpsQueryInstanceModelResponse.ImageType"));
		opsQueryInstanceModelResponse.setInternetIp(_ctx.stringValue("OpsQueryInstanceModelResponse.InternetIp"));
		opsQueryInstanceModelResponse.setOsType(_ctx.stringValue("OpsQueryInstanceModelResponse.OsType"));
		opsQueryInstanceModelResponse.setImageId(_ctx.stringValue("OpsQueryInstanceModelResponse.ImageId"));
		opsQueryInstanceModelResponse.setDiskSize(_ctx.integerValue("OpsQueryInstanceModelResponse.DiskSize"));
		opsQueryInstanceModelResponse.setAgentId(_ctx.integerValue("OpsQueryInstanceModelResponse.AgentId"));
		opsQueryInstanceModelResponse.setBid(_ctx.stringValue("OpsQueryInstanceModelResponse.Bid"));
		opsQueryInstanceModelResponse.setGmtStarted(_ctx.stringValue("OpsQueryInstanceModelResponse.GmtStarted"));
		opsQueryInstanceModelResponse.setRecoverable(_ctx.booleanValue("OpsQueryInstanceModelResponse.Recoverable"));
		opsQueryInstanceModelResponse.setStatus(_ctx.stringValue("OpsQueryInstanceModelResponse.Status"));
		opsQueryInstanceModelResponse.setImagePc(_ctx.stringValue("OpsQueryInstanceModelResponse.ImagePc"));
		opsQueryInstanceModelResponse.setIoOptimized(_ctx.booleanValue("OpsQueryInstanceModelResponse.IoOptimized"));
		opsQueryInstanceModelResponse.setRegionNumericId(_ctx.longValue("OpsQueryInstanceModelResponse.RegionNumericId"));
		opsQueryInstanceModelResponse.setInstanceId(_ctx.stringValue("OpsQueryInstanceModelResponse.InstanceId"));
		opsQueryInstanceModelResponse.setEcsBusinessStatus(_ctx.stringValue("OpsQueryInstanceModelResponse.EcsBusinessStatus"));
		opsQueryInstanceModelResponse.setSecurityGroupId(_ctx.stringValue("OpsQueryInstanceModelResponse.SecurityGroupId"));
		opsQueryInstanceModelResponse.setOsName(_ctx.stringValue("OpsQueryInstanceModelResponse.OsName"));
		opsQueryInstanceModelResponse.setIntranetTx(_ctx.integerValue("OpsQueryInstanceModelResponse.IntranetTx"));
		opsQueryInstanceModelResponse.setHostname(_ctx.stringValue("OpsQueryInstanceModelResponse.Hostname"));
		opsQueryInstanceModelResponse.setZoneNumericId(_ctx.longValue("OpsQueryInstanceModelResponse.ZoneNumericId"));
		opsQueryInstanceModelResponse.setIntranetRx(_ctx.integerValue("OpsQueryInstanceModelResponse.IntranetRx"));
		opsQueryInstanceModelResponse.setSystemDiskCategory(_ctx.stringValue("OpsQueryInstanceModelResponse.SystemDiskCategory"));
		opsQueryInstanceModelResponse.setCores(_ctx.integerValue("OpsQueryInstanceModelResponse.Cores"));
		opsQueryInstanceModelResponse.setImageName(_ctx.stringValue("OpsQueryInstanceModelResponse.ImageName"));
		opsQueryInstanceModelResponse.setInternetTx(_ctx.integerValue("OpsQueryInstanceModelResponse.InternetTx"));
		opsQueryInstanceModelResponse.setGmtRelease(_ctx.stringValue("OpsQueryInstanceModelResponse.GmtRelease"));
		opsQueryInstanceModelResponse.setInternetRx(_ctx.integerValue("OpsQueryInstanceModelResponse.InternetRx"));
		opsQueryInstanceModelResponse.setImageNumericId(_ctx.longValue("OpsQueryInstanceModelResponse.ImageNumericId"));
		opsQueryInstanceModelResponse.setInstanceNumericId(_ctx.longValue("OpsQueryInstanceModelResponse.InstanceNumericId"));
		opsQueryInstanceModelResponse.setAliUid(_ctx.longValue("OpsQueryInstanceModelResponse.AliUid"));

		ZoneModel zoneModel = new ZoneModel();
		zoneModel.setZoneEnName(_ctx.stringValue("OpsQueryInstanceModelResponse.ZoneModel.ZoneEnName"));
		zoneModel.setZoneStatus(_ctx.stringValue("OpsQueryInstanceModelResponse.ZoneModel.ZoneStatus"));
		zoneModel.setZoneId(_ctx.stringValue("OpsQueryInstanceModelResponse.ZoneModel.ZoneId"));
		zoneModel.setZoneCnName(_ctx.stringValue("OpsQueryInstanceModelResponse.ZoneModel.ZoneCnName"));
		zoneModel.setRegionId(_ctx.stringValue("OpsQueryInstanceModelResponse.ZoneModel.RegionId"));
		opsQueryInstanceModelResponse.setZoneModel(zoneModel);

		RegionModel regionModel = new RegionModel();
		regionModel.setRegionMemo(_ctx.stringValue("OpsQueryInstanceModelResponse.RegionModel.RegionMemo"));
		regionModel.setRegionName(_ctx.stringValue("OpsQueryInstanceModelResponse.RegionModel.RegionName"));
		regionModel.setRegionNumericId(_ctx.longValue("OpsQueryInstanceModelResponse.RegionModel.RegionNumericId"));
		regionModel.setRegionIdAlias(_ctx.stringValue("OpsQueryInstanceModelResponse.RegionModel.RegionIdAlias"));
		regionModel.setRegionIsActive(_ctx.stringValue("OpsQueryInstanceModelResponse.RegionModel.RegionIsActive"));
		regionModel.setRegionId(_ctx.stringValue("OpsQueryInstanceModelResponse.RegionModel.RegionId"));
		opsQueryInstanceModelResponse.setRegionModel(regionModel);

		ClusterModel clusterModel = new ClusterModel();
		clusterModel.setClusterRouteIpSegment(_ctx.stringValue("OpsQueryInstanceModelResponse.ClusterModel.ClusterRouteIpSegment"));
		clusterModel.setAvailableZoneID(_ctx.stringValue("OpsQueryInstanceModelResponse.ClusterModel.AvailableZoneID"));
		clusterModel.setClusterNumericId(_ctx.longValue("OpsQueryInstanceModelResponse.ClusterModel.ClusterNumericId"));
		clusterModel.setClusterName(_ctx.stringValue("OpsQueryInstanceModelResponse.ClusterModel.ClusterName"));
		clusterModel.setRegionNumericId(_ctx.longValue("OpsQueryInstanceModelResponse.ClusterModel.RegionNumericId"));
		clusterModel.setClusterIsWritable(_ctx.booleanValue("OpsQueryInstanceModelResponse.ClusterModel.ClusterIsWritable"));
		clusterModel.setClusterMemo(_ctx.stringValue("OpsQueryInstanceModelResponse.ClusterModel.ClusterMemo"));
		clusterModel.setClusterIsActive(_ctx.stringValue("OpsQueryInstanceModelResponse.ClusterModel.ClusterIsActive"));
		clusterModel.setClusterIdAlias(_ctx.stringValue("OpsQueryInstanceModelResponse.ClusterModel.ClusterIdAlias"));
		clusterModel.setClusterId(_ctx.stringValue("OpsQueryInstanceModelResponse.ClusterModel.ClusterId"));
		opsQueryInstanceModelResponse.setClusterModel(clusterModel);
	 
	 	return opsQueryInstanceModelResponse;
	}
}