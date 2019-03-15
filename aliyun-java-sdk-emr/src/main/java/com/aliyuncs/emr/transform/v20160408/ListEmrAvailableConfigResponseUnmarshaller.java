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

	public static ListEmrAvailableConfigResponse unmarshall(ListEmrAvailableConfigResponse listEmrAvailableConfigResponse, UnmarshallerContext context) {
		
		listEmrAvailableConfigResponse.setRequestId(context.stringValue("ListEmrAvailableConfigResponse.RequestId"));

		List<String> keyPairNameList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListEmrAvailableConfigResponse.KeyPairNameList.Length"); i++) {
			keyPairNameList.add(context.stringValue("ListEmrAvailableConfigResponse.KeyPairNameList["+ i +"]"));
		}
		listEmrAvailableConfigResponse.setKeyPairNameList(keyPairNameList);

		List<EmrMainVersion> emrMainVersionList = new ArrayList<EmrMainVersion>();
		for (int i = 0; i < context.lengthValue("ListEmrAvailableConfigResponse.EmrMainVersionList.Length"); i++) {
			EmrMainVersion emrMainVersion = new EmrMainVersion();
			emrMainVersion.setRegionId(context.stringValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].RegionId"));
			emrMainVersion.setMainVersionName(context.stringValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].MainVersionName"));
			emrMainVersion.setEcmVersion(context.booleanValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].EcmVersion"));

			List<ClusterTypeInfo> clusterTypeInfoList = new ArrayList<ClusterTypeInfo>();
			for (int j = 0; j < context.lengthValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList.Length"); j++) {
				ClusterTypeInfo clusterTypeInfo = new ClusterTypeInfo();
				clusterTypeInfo.setClusterType(context.stringValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ClusterType"));

				List<ClusterServiceInfo> clusterServiceInfoList = new ArrayList<ClusterServiceInfo>();
				for (int k = 0; k < context.lengthValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ClusterServiceInfoList.Length"); k++) {
					ClusterServiceInfo clusterServiceInfo = new ClusterServiceInfo();
					clusterServiceInfo.setServiceName(context.stringValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ClusterServiceInfoList["+ k +"].ServiceName"));
					clusterServiceInfo.setServiceDisplayName(context.stringValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ClusterServiceInfoList["+ k +"].ServiceDisplayName"));
					clusterServiceInfo.setServiceVersion(context.stringValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ClusterServiceInfoList["+ k +"].ServiceVersion"));
					clusterServiceInfo.setMandatory(context.booleanValue("ListEmrAvailableConfigResponse.EmrMainVersionList["+ i +"].ClusterTypeInfoList["+ j +"].ClusterServiceInfoList["+ k +"].Mandatory"));

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
		for (int i = 0; i < context.lengthValue("ListEmrAvailableConfigResponse.SecurityGroupList.Length"); i++) {
			SecurityGroup securityGroup = new SecurityGroup();
			securityGroup.setSecurityGroupId(context.stringValue("ListEmrAvailableConfigResponse.SecurityGroupList["+ i +"].SecurityGroupId"));
			securityGroup.setDescription(context.stringValue("ListEmrAvailableConfigResponse.SecurityGroupList["+ i +"].Description"));
			securityGroup.setSecurityGroupName(context.stringValue("ListEmrAvailableConfigResponse.SecurityGroupList["+ i +"].SecurityGroupName"));
			securityGroup.setVpcId(context.stringValue("ListEmrAvailableConfigResponse.SecurityGroupList["+ i +"].VpcId"));
			securityGroup.setCreationTime(context.stringValue("ListEmrAvailableConfigResponse.SecurityGroupList["+ i +"].CreationTime"));
			securityGroup.setAvailableInstanceAmount(context.integerValue("ListEmrAvailableConfigResponse.SecurityGroupList["+ i +"].AvailableInstanceAmount"));
			securityGroup.setEcsCount(context.integerValue("ListEmrAvailableConfigResponse.SecurityGroupList["+ i +"].EcsCount"));

			securityGroupList.add(securityGroup);
		}
		listEmrAvailableConfigResponse.setSecurityGroupList(securityGroupList);

		List<VpcInfo> vpcInfoList = new ArrayList<VpcInfo>();
		for (int i = 0; i < context.lengthValue("ListEmrAvailableConfigResponse.VpcInfoList.Length"); i++) {
			VpcInfo vpcInfo = new VpcInfo();
			vpcInfo.setVpcId(context.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VpcId"));
			vpcInfo.setVpcName(context.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VpcName"));
			vpcInfo.setCidrBlock(context.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].CidrBlock"));
			vpcInfo.setCreationTime(context.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].CreationTime"));
			vpcInfo.setVRouterId(context.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VRouterId"));
			vpcInfo.setDescription(context.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].Description"));

			List<VswitchInfo> vswitchInfoList = new ArrayList<VswitchInfo>();
			for (int j = 0; j < context.lengthValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList.Length"); j++) {
				VswitchInfo vswitchInfo = new VswitchInfo();
				vswitchInfo.setVpcId(context.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList["+ j +"].VpcId"));
				vswitchInfo.setVswitchId(context.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList["+ j +"].VswitchId"));
				vswitchInfo.setVswitchName(context.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList["+ j +"].VswitchName"));
				vswitchInfo.setZoneId(context.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList["+ j +"].ZoneId"));
				vswitchInfo.setCidrBlock(context.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList["+ j +"].CidrBlock"));
				vswitchInfo.setAvailableIpAddressCount(context.longValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList["+ j +"].AvailableIpAddressCount"));
				vswitchInfo.setDescription(context.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList["+ j +"].Description"));
				vswitchInfo.setCreationTime(context.stringValue("ListEmrAvailableConfigResponse.VpcInfoList["+ i +"].VswitchInfoList["+ j +"].CreationTime"));

				vswitchInfoList.add(vswitchInfo);
			}
			vpcInfo.setVswitchInfoList(vswitchInfoList);

			vpcInfoList.add(vpcInfo);
		}
		listEmrAvailableConfigResponse.setVpcInfoList(vpcInfoList);
	 
	 	return listEmrAvailableConfigResponse;
	}
}