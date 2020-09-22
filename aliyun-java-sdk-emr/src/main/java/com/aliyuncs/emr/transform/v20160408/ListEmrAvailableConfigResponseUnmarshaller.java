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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListEmrAvailableConfigResponse;
import com.aliyuncs.emr.model.v20160408.ListEmrAvailableConfigResponse.EmrMainVersion;
import com.aliyuncs.emr.model.v20160408.ListEmrAvailableConfigResponse.EmrMainVersion.ClusterTypeInfo;
import com.aliyuncs.emr.model.v20160408.ListEmrAvailableConfigResponse.EmrMainVersion.ClusterTypeInfo.ClusterServiceInfo;
import com.aliyuncs.emr.model.v20160408.ListEmrAvailableConfigResponse.SecurityGroup;
import com.aliyuncs.emr.model.v20160408.ListEmrAvailableConfigResponse.VpcInfo;
import com.aliyuncs.emr.model.v20160408.ListEmrAvailableConfigResponse.VpcInfo.VswitchInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEmrAvailableConfigResponseUnmarshaller {

	public static ListEmrAvailableConfigResponse unmarshall(ListEmrAvailableConfigResponse listEmrAvailableConfigResponse, UnmarshallerContext _ctx) {
		
		listEmrAvailableConfigResponse.setRequestId(_ctx.stringValue("ListEmrAvailableConfigResponse.RequestId"));

		List<String> keyPairNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListEmrAvailableConfigResponse.KeyPairNameList.Length"); i++) {
			keyPairNameList.add(_ctx.stringValue("ListEmrAvailableConfigResponse.KeyPairNameList["+ i +"]"));
		}
		listEmrAvailableConfigResponse.setKeyPairNameList(keyPairNameList);

		List<EmrMainVersion> emrMainVersionList = new ArrayList<EmrMainVersion>();
		for (int i = 0; i < _ctx.lengthValue("ListEmrAvailableConfigResponse.EmrMainVersionList.Length"); i++) {
			EmrMainVersion emrMainVersion = new EmrMainVersion();
			emrMainVersion.setRegionId(_ctx.stringValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].RegionId"));
			emrMainVersion.setMainVersionName(_ctx.stringValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].MainVersionName"));
			emrMainVersion.setEcmVersion(_ctx.booleanValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].EcmVersion"));
			emrMainVersion.setStackName(_ctx.stringValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].StackName"));
			emrMainVersion.setStackVersion(_ctx.stringValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].StackVersion"));
			emrMainVersion.setExtraInfo(_ctx.stringValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].ExtraInfo"));
			emrMainVersion.setOnCloudNative(_ctx.booleanValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].OnCloudNative"));
			emrMainVersion.setPublishType(_ctx.stringValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].PublishType"));

			List<ClusterTypeInfo> clusterTypeInfoList = new ArrayList<ClusterTypeInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList.Length"); j++) {
				ClusterTypeInfo clusterTypeInfo = new ClusterTypeInfo();
				clusterTypeInfo.setClusterType(_ctx.stringValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ClusterType"));

				List<ClusterServiceInfo> clusterServiceInfoList = new ArrayList<ClusterServiceInfo>();
				for (int k = 0; k < _ctx.lengthValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ClusterServiceInfoList.Length"); k++) {
					ClusterServiceInfo clusterServiceInfo = new ClusterServiceInfo();
					clusterServiceInfo.setServiceName(_ctx.stringValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ClusterServiceInfoList["+ k +"].ServiceName"));
					clusterServiceInfo.setServiceDisplayName(_ctx.stringValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ClusterServiceInfoList["+ k +"].ServiceDisplayName"));
					clusterServiceInfo.setServiceVersion(_ctx.stringValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ClusterServiceInfoList["+ k +"].ServiceVersion"));
					clusterServiceInfo.setMandatory(_ctx.booleanValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ClusterServiceInfoList["+ k +"].Mandatory"));

					clusterServiceInfoList.add(clusterServiceInfo);
				}
				clusterTypeInfo.setClusterServiceInfoList(clusterServiceInfoList);

				clusterTypeInfoList.add(clusterTypeInfo);
			}
			emrMainVersion.setClusterTypeInfoList(clusterTypeInfoList);

			emrMainVersionList.add(emrMainVersion);
		}
		listEmrAvailableConfigResponse.setEmrMainVersionList(emrMainVersionList);

		List<SecurityGroup> securityGroupList = new ArrayList<SecurityGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListEmrAvailableConfigResponse.SecurityGroupList.Length"); i++) {
			SecurityGroup securityGroup = new SecurityGroup();
			securityGroup.setSecurityGroupId(_ctx.stringValue("ListEmrAvailableConfigResponse.SecurityGroupList["+ i +"].SecurityGroupId"));
			securityGroup.setDescription(_ctx.stringValue("ListEmrAvailableConfigResponse.SecurityGroupList["+ i +"].Description"));
			securityGroup.setSecurityGroupName(_ctx.stringValue("ListEmrAvailableConfigResponse.SecurityGroupList["+ i +"].SecurityGroupName"));
			securityGroup.setVpcId(_ctx.stringValue("ListEmrAvailableConfigResponse.SecurityGroupList["+ i +"].VpcId"));
			securityGroup.setCreationTime(_ctx.stringValue("ListEmrAvailableConfigResponse.SecurityGroupList["+ i +"].CreationTime"));
			securityGroup.setSecurityGroupType(_ctx.stringValue("ListEmrAvailableConfigResponse.SecurityGroupList["+ i +"].SecurityGroupType"));
			securityGroup.setAvailableInstanceAmount(_ctx.integerValue("ListEmrAvailableConfigResponse.SecurityGroupList["+ i +"].AvailableInstanceAmount"));
			securityGroup.setEcsCount(_ctx.integerValue("ListEmrAvailableConfigResponse.SecurityGroupList["+ i +"].EcsCount"));

			securityGroupList.add(securityGroup);
		}
		listEmrAvailableConfigResponse.setSecurityGroupList(securityGroupList);

		List<VpcInfo> vpcInfoList = new ArrayList<VpcInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListEmrAvailableConfigResponse.VpcInfoList.Length"); i++) {
			VpcInfo vpcInfo = new VpcInfo();
			vpcInfo.setVpcId(_ctx.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VpcId"));
			vpcInfo.setVpcName(_ctx.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VpcName"));
			vpcInfo.setCidrBlock(_ctx.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].CidrBlock"));
			vpcInfo.setCreationTime(_ctx.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].CreationTime"));
			vpcInfo.setVRouterId(_ctx.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VRouterId"));
			vpcInfo.setDescription(_ctx.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].Description"));

			List<VswitchInfo> vswitchInfoList = new ArrayList<VswitchInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList.Length"); j++) {
				VswitchInfo vswitchInfo = new VswitchInfo();
				vswitchInfo.setVpcId(_ctx.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList["+ j +"].VpcId"));
				vswitchInfo.setVswitchId(_ctx.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList["+ j +"].VswitchId"));
				vswitchInfo.setVswitchName(_ctx.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList["+ j +"].VswitchName"));
				vswitchInfo.setZoneId(_ctx.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList["+ j +"].ZoneId"));
				vswitchInfo.setCidrBlock(_ctx.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList["+ j +"].CidrBlock"));
				vswitchInfo.setAvailableIpAddressCount(_ctx.longValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList["+ j +"].AvailableIpAddressCount"));
				vswitchInfo.setDescription(_ctx.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList["+ j +"].Description"));
				vswitchInfo.setCreationTime(_ctx.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList["+ j +"].CreationTime"));

				vswitchInfoList.add(vswitchInfo);
			}
			vpcInfo.setVswitchInfoList(vswitchInfoList);

			vpcInfoList.add(vpcInfo);
		}
		listEmrAvailableConfigResponse.setVpcInfoList(vpcInfoList);
	 
	 	return listEmrAvailableConfigResponse;
	}
}