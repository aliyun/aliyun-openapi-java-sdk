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
import com.aliyuncs.ens.model.v20171110.DescribeInstancesResponse.Instance.PrivateIpAddress;
import com.aliyuncs.ens.model.v20171110.DescribeInstancesResponse.Instance.PublicIpAddress;
import com.aliyuncs.ens.model.v20171110.DescribeInstancesResponse.Instance.SystemDisk;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext _ctx) {
		
		describeInstancesResponse.setRequestId(_ctx.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setCode(_ctx.integerValue("DescribeInstancesResponse.Code"));
		describeInstancesResponse.setTotalCount(_ctx.integerValue("DescribeInstancesResponse.TotalCount"));
		describeInstancesResponse.setPageNumber(_ctx.integerValue("DescribeInstancesResponse.PageNumber"));
		describeInstancesResponse.setPageSize(_ctx.integerValue("DescribeInstancesResponse.PageSize"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setInstanceName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setEnsRegionId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].EnsRegionId"));
			instance.setCpu(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Cpu"));
			instance.setMemory(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Memory"));
			instance.setDisk(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].Disk"));
			instance.setInternetMaxBandwidthIn(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].InternetMaxBandwidthIn"));
			instance.setInternetMaxBandwidthOut(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].InternetMaxBandwidthOut"));
			instance.setCreationTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreationTime"));
			instance.setStatus(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Status"));
			instance.setImageId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ImageId"));
			instance.setExpiredTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ExpiredTime"));
			instance.setInstanceResourceType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceResourceType"));
			instance.setSpecName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SpecName"));
			instance.setOSName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].OSName"));

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
			systemDisk.setStorage(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.storage"));
			systemDisk.setUuid(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.uuid"));
			systemDisk.setDisk_type(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.disk_type"));
			systemDisk.setName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.name"));
			systemDisk.setCategory(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.Category"));
			systemDisk.setSize(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.Size"));
			systemDisk.setDiskId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.DiskId"));
			systemDisk.setDiskName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].SystemDisk.DiskName"));
			instance.setSystemDisk(systemDisk);

			List<DataDiskItem> dataDisk = new ArrayList<DataDiskItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk.Length"); j++) {
				DataDiskItem dataDiskItem = new DataDiskItem();
				dataDiskItem.setDevice_type(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].device_type"));
				dataDiskItem.setStorage(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].storage"));
				dataDiskItem.setUuid(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].uuid"));
				dataDiskItem.setDisk_type(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].disk_type"));
				dataDiskItem.setName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].name"));
				dataDiskItem.setCategory(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].Category"));
				dataDiskItem.setSize(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].Size"));
				dataDiskItem.setDiskId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].DiskId"));
				dataDiskItem.setDiskName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].DataDisk["+ j +"].DiskName"));

				dataDisk.add(dataDiskItem);
			}
			instance.setDataDisk(dataDisk);

			List<PublicIpAddress> publicIpAddresses = new ArrayList<PublicIpAddress>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].PublicIpAddresses.Length"); j++) {
				PublicIpAddress publicIpAddress_ = new PublicIpAddress();
				publicIpAddress_.setIp(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PublicIpAddresses["+ j +"].Ip"));
				publicIpAddress_.setGateWay(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PublicIpAddresses["+ j +"].GateWay"));
				publicIpAddress_.setIsp(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PublicIpAddresses["+ j +"].Isp"));

				publicIpAddresses.add(publicIpAddress_);
			}
			instance.setPublicIpAddresses(publicIpAddresses);

			List<PrivateIpAddress> privateIpAddresses = new ArrayList<PrivateIpAddress>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].PrivateIpAddresses.Length"); j++) {
				PrivateIpAddress privateIpAddress = new PrivateIpAddress();
				privateIpAddress.setIp(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PrivateIpAddresses["+ j +"].Ip"));
				privateIpAddress.setGateWay(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PrivateIpAddresses["+ j +"].GateWay"));
				privateIpAddress.setIsp(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].PrivateIpAddresses["+ j +"].Isp"));

				privateIpAddresses.add(privateIpAddress);
			}
			instance.setPrivateIpAddresses(privateIpAddresses);

			instances.add(instance);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}