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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeFileSystemsResponse;
import com.aliyuncs.nas.model.v20170626.DescribeFileSystemsResponse.FileSystem;
import com.aliyuncs.nas.model.v20170626.DescribeFileSystemsResponse.FileSystem.Ldap;
import com.aliyuncs.nas.model.v20170626.DescribeFileSystemsResponse.FileSystem.MountTarget;
import com.aliyuncs.nas.model.v20170626.DescribeFileSystemsResponse.FileSystem.MountTarget.ClientMasterNode;
import com.aliyuncs.nas.model.v20170626.DescribeFileSystemsResponse.FileSystem.MountTarget.Tag;
import com.aliyuncs.nas.model.v20170626.DescribeFileSystemsResponse.FileSystem.Tag2;
import com.aliyuncs.nas.model.v20170626.DescribeFileSystemsResponse.FileSystem._Package;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFileSystemsResponseUnmarshaller {

	public static DescribeFileSystemsResponse unmarshall(DescribeFileSystemsResponse describeFileSystemsResponse, UnmarshallerContext _ctx) {
		
		describeFileSystemsResponse.setRequestId(_ctx.stringValue("DescribeFileSystemsResponse.RequestId"));
		describeFileSystemsResponse.setTotalCount(_ctx.integerValue("DescribeFileSystemsResponse.TotalCount"));
		describeFileSystemsResponse.setPageSize(_ctx.integerValue("DescribeFileSystemsResponse.PageSize"));
		describeFileSystemsResponse.setPageNumber(_ctx.integerValue("DescribeFileSystemsResponse.PageNumber"));

		List<FileSystem> fileSystems = new ArrayList<FileSystem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFileSystemsResponse.FileSystems.Length"); i++) {
			FileSystem fileSystem = new FileSystem();
			fileSystem.setFileSystemId(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].FileSystemId"));
			fileSystem.setDescription(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Description"));
			fileSystem.setCreateTime(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].CreateTime"));
			fileSystem.setExpiredTime(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].ExpiredTime"));
			fileSystem.setRegionId(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].RegionId"));
			fileSystem.setZoneId(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].ZoneId"));
			fileSystem.setProtocolType(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].ProtocolType"));
			fileSystem.setStorageType(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].StorageType"));
			fileSystem.setFileSystemType(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].FileSystemType"));
			fileSystem.setEncryptType(_ctx.integerValue("DescribeFileSystemsResponse.FileSystems["+ i +"].EncryptType"));
			fileSystem.setMeteredSize(_ctx.longValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MeteredSize"));
			fileSystem.setMeteredIASize(_ctx.longValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MeteredIASize"));
			fileSystem.setBandwidth(_ctx.longValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Bandwidth"));
			fileSystem.setCapacity(_ctx.longValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Capacity"));
			fileSystem.setAutoSnapshotPolicyId(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].AutoSnapshotPolicyId"));
			fileSystem.setStatus(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Status"));
			fileSystem.setChargeType(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].ChargeType"));
			fileSystem.setMountTargetCountLimit(_ctx.longValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargetCountLimit"));
			fileSystem.setNasNamespaceId(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].NasNamespaceId"));
			fileSystem.setKMSKeyId(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].KMSKeyId"));
			fileSystem.setVersion(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Version"));

			List<String> supportedFeatures = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeFileSystemsResponse.FileSystems["+ i +"].SupportedFeatures.Length"); j++) {
				supportedFeatures.add(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].SupportedFeatures["+ j +"]"));
			}
			fileSystem.setSupportedFeatures(supportedFeatures);

			Ldap ldap = new Ldap();
			ldap.setBindDN(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Ldap.BindDN"));
			ldap.setURI(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Ldap.URI"));
			ldap.setSearchBase(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Ldap.SearchBase"));
			fileSystem.setLdap(ldap);

			List<MountTarget> mountTargets = new ArrayList<MountTarget>();
			for (int j = 0; j < _ctx.lengthValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets.Length"); j++) {
				MountTarget mountTarget = new MountTarget();
				mountTarget.setMountTargetDomain(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].MountTargetDomain"));
				mountTarget.setNetworkType(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].NetworkType"));
				mountTarget.setVpcId(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].VpcId"));
				mountTarget.setVswId(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].VswId"));
				mountTarget.setAccessGroupName(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].AccessGroupName"));
				mountTarget.setStatus(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].Status"));
				mountTarget.setDualStackMountTargetDomain(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].DualStackMountTargetDomain"));

				List<ClientMasterNode> clientMasterNodes = new ArrayList<ClientMasterNode>();
				for (int k = 0; k < _ctx.lengthValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].ClientMasterNodes.Length"); k++) {
					ClientMasterNode clientMasterNode = new ClientMasterNode();
					clientMasterNode.setEcsId(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].ClientMasterNodes["+ k +"].EcsId"));
					clientMasterNode.setEcsIp(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].ClientMasterNodes["+ k +"].EcsIp"));
					clientMasterNode.setDefaultPasswd(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].ClientMasterNodes["+ k +"].DefaultPasswd"));

					clientMasterNodes.add(clientMasterNode);
				}
				mountTarget.setClientMasterNodes(clientMasterNodes);

				List<Tag> tags1 = new ArrayList<Tag>();
				for (int k = 0; k < _ctx.lengthValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].Tags.Length"); k++) {
					Tag tag = new Tag();
					tag.setKey(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].Tags["+ k +"].Key"));
					tag.setValue(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].MountTargets["+ j +"].Tags["+ k +"].Value"));

					tags1.add(tag);
				}
				mountTarget.setTags1(tags1);

				mountTargets.add(mountTarget);
			}
			fileSystem.setMountTargets(mountTargets);

			List<_Package> packages = new ArrayList<_Package>();
			for (int j = 0; j < _ctx.lengthValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Packages.Length"); j++) {
				_Package _package = new _Package();
				_package.setPackageId(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Packages["+ j +"].PackageId"));
				_package.setPackageType(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Packages["+ j +"].PackageType"));
				_package.setSize(_ctx.longValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Packages["+ j +"].Size"));
				_package.setStartTime(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Packages["+ j +"].StartTime"));
				_package.setExpiredTime(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Packages["+ j +"].ExpiredTime"));

				packages.add(_package);
			}
			fileSystem.setPackages(packages);

			List<Tag2> tags = new ArrayList<Tag2>();
			for (int j = 0; j < _ctx.lengthValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Tags.Length"); j++) {
				Tag2 tag2 = new Tag2();
				tag2.setKey(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Tags["+ j +"].Key"));
				tag2.setValue(_ctx.stringValue("DescribeFileSystemsResponse.FileSystems["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag2);
			}
			fileSystem.setTags(tags);

			fileSystems.add(fileSystem);
		}
		describeFileSystemsResponse.setFileSystems(fileSystems);
	 
	 	return describeFileSystemsResponse;
	}
}