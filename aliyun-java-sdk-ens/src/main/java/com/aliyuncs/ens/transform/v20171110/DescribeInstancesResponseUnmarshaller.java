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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeInstancesResponse;
import com.aliyuncs.ens.model.v20171110.DescribeInstancesResponse.Instance;
import com.aliyuncs.ens.model.v20171110.DescribeInstancesResponse.Instance.DataDiskItem;
import com.aliyuncs.ens.model.v20171110.DescribeInstancesResponse.Instance.NetworkAttributes;
import com.aliyuncs.ens.model.v20171110.DescribeInstancesResponse.Instance.NetworkInterfacesItem;
import com.aliyuncs.ens.model.v20171110.DescribeInstancesResponse.Instance.NetworkInterfacesItem.Ipv6Set;
import com.aliyuncs.ens.model.v20171110.DescribeInstancesResponse.Instance.NetworkInterfacesItem.PrivateIpSet;
import com.aliyuncs.ens.model.v20171110.DescribeInstancesResponse.Instance.PrivateIpAddress;
import com.aliyuncs.ens.model.v20171110.DescribeInstancesResponse.Instance.PublicIpAddress;
import com.aliyuncs.ens.model.v20171110.DescribeInstancesResponse.Instance.SystemDisk;
import com.aliyuncs.ens.model.v20171110.DescribeInstancesResponse.Instance.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext _ctx) {
		
		describeInstancesResponse.setRequestId(_ctx.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setCode(_ctx.integerValue("DescribeInstancesResponse.Code"));
		describeInstancesResponse.setPageSize(_ctx.integerValue("DescribeInstancesResponse.PageSize"));
		describeInstancesResponse.setPageNumber(_ctx.integerValue("DescribeInstancesResponse.PageNumber"));
		describeInstancesResponse.setTotalCount(_ctx.integerValue("DescribeInstancesResponse.TotalCount"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setCreationTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreationTime"));
			instance.setStatus(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Status"));
			instance.setSpecName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SpecName"));
			instance.setInstanceTypeFamily(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceTypeFamily"));
			instance.setInstanceResourceType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceResourceType"));
			instance.setHostName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].HostName"));
			instance.setInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setInternetMaxBandwidthIn(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].InternetMaxBandwidthIn"));
			instance.setInternetMaxBandwidthOut(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].InternetMaxBandwidthOut"));
			instance.setEnsRegionId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EnsRegionId"));
			instance.setCpu(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Cpu"));
			instance.setExpiredTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ExpiredTime"));
			instance.setInstanceName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setDisk(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Disk"));
			instance.setOSName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].OSName"));
			instance.setMemory(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Memory"));
			instance.setImageId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ImageId"));
			instance.setAutoReleaseTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].AutoReleaseTime"));
			instance.setSpotStrategy(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SpotStrategy"));
			instance.setKeyPairName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].KeyPairName"));
			instance.setServiceStatus(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ServiceStatus"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			instance.setSecurityGroupIds(securityGroupIds);

			List<String> innerIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].InnerIpAddress.Length"); j++) {
				innerIpAddress.add(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InnerIpAddress["+ j +"]"));
			}
			instance.setInnerIpAddress(innerIpAddress);

			List<String> publicIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].PublicIpAddress.Length"); j++) {
				publicIpAddress.add(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PublicIpAddress["+ j +"]"));
			}
			instance.setPublicIpAddress(publicIpAddress);

			SystemDisk systemDisk = new SystemDisk();
			systemDisk.setDevice_type(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.device_type"));
			systemDisk.setDisk_type(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.disk_type"));
			systemDisk.setSize(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.Size"));
			systemDisk.setDiskName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.DiskName"));
			systemDisk.setUuid(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.uuid"));
			systemDisk.setStorage(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.storage"));
			systemDisk.setDiskId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.DiskId"));
			systemDisk.setCategory(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.Category"));
			systemDisk.setName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.name"));
			instance.setSystemDisk(systemDisk);

			NetworkAttributes networkAttributes = new NetworkAttributes();
			networkAttributes.setNetworkId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkAttributes.NetworkId"));
			networkAttributes.setVSwitchId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkAttributes.VSwitchId"));

			List<String> privateIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].NetworkAttributes.PrivateIpAddress.Length"); j++) {
				privateIpAddress.add(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkAttributes.PrivateIpAddress["+ j +"]"));
			}
			networkAttributes.setPrivateIpAddress(privateIpAddress);
			instance.setNetworkAttributes(networkAttributes);

			List<DataDiskItem> dataDisk = new ArrayList<DataDiskItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk.Length"); j++) {
				DataDiskItem dataDiskItem = new DataDiskItem();
				dataDiskItem.setDevice_type(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].device_type"));
				dataDiskItem.setDisk_type(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].disk_type"));
				dataDiskItem.setSize(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].Size"));
				dataDiskItem.setDiskName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].DiskName"));
				dataDiskItem.setUuid(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].uuid"));
				dataDiskItem.setStorage(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].storage"));
				dataDiskItem.setDiskId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].DiskId"));
				dataDiskItem.setCategory(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].Category"));
				dataDiskItem.setName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].name"));
				dataDiskItem.setDiskSize(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].DiskSize"));
				dataDiskItem.setEncryptKeyId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].EncryptKeyId"));
				dataDiskItem.setEncrypted(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].Encrypted"));

				dataDisk.add(dataDiskItem);
			}
			instance.setDataDisk(dataDisk);

			List<PublicIpAddress> publicIpAddresses = new ArrayList<PublicIpAddress>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].PublicIpAddresses.Length"); j++) {
				PublicIpAddress publicIpAddress2 = new PublicIpAddress();
				publicIpAddress2.setIp(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PublicIpAddresses["+ j +"].Ip"));
				publicIpAddress2.setGateWay(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PublicIpAddresses["+ j +"].GateWay"));
				publicIpAddress2.setIsp(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PublicIpAddresses["+ j +"].Isp"));

				publicIpAddresses.add(publicIpAddress2);
			}
			instance.setPublicIpAddresses(publicIpAddresses);

			List<PrivateIpAddress> privateIpAddresses = new ArrayList<PrivateIpAddress>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].PrivateIpAddresses.Length"); j++) {
				PrivateIpAddress privateIpAddress2 = new PrivateIpAddress();
				privateIpAddress2.setIp(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PrivateIpAddresses["+ j +"].Ip"));
				privateIpAddress2.setGateWay(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PrivateIpAddresses["+ j +"].GateWay"));
				privateIpAddress2.setIsp(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PrivateIpAddresses["+ j +"].Isp"));

				privateIpAddresses.add(privateIpAddress2);
			}
			instance.setPrivateIpAddresses(privateIpAddresses);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagValue(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Tags["+ j +"].TagValue"));
				tagsItem.setTagKey(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tagsItem);
			}
			instance.setTags(tags);

			List<NetworkInterfacesItem> networkInterfaces = new ArrayList<NetworkInterfacesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces.Length"); j++) {
				NetworkInterfacesItem networkInterfacesItem = new NetworkInterfacesItem();
				networkInterfacesItem.setType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].Type"));
				networkInterfacesItem.setMacAddress(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].MacAddress"));
				networkInterfacesItem.setPrimaryIpAddress(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].PrimaryIpAddress"));
				networkInterfacesItem.setNetworkInterfaceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].NetworkInterfaceId"));

				List<PrivateIpSet> privateIpSets = new ArrayList<PrivateIpSet>();
				for (int k = 0; k < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].PrivateIpSets.Length"); k++) {
					PrivateIpSet privateIpSet = new PrivateIpSet();
					privateIpSet.setPrivateIpAddress(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].PrivateIpSets["+ k +"].PrivateIpAddress"));
					privateIpSet.setPrimary(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].PrivateIpSets["+ k +"].Primary"));

					privateIpSets.add(privateIpSet);
				}
				networkInterfacesItem.setPrivateIpSets(privateIpSets);

				List<Ipv6Set> ipv6Sets = new ArrayList<Ipv6Set>();
				for (int k = 0; k < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].Ipv6Sets.Length"); k++) {
					Ipv6Set ipv6Set = new Ipv6Set();
					ipv6Set.setIpv6Address(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].Ipv6Sets["+ k +"].Ipv6Address"));

					ipv6Sets.add(ipv6Set);
				}
				networkInterfacesItem.setIpv6Sets(ipv6Sets);

				networkInterfaces.add(networkInterfacesItem);
			}
			instance.setNetworkInterfaces(networkInterfaces);

			instances.add(instance);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}