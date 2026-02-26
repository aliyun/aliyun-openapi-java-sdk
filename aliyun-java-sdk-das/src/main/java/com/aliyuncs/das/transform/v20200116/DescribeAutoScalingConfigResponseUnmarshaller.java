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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.DescribeAutoScalingConfigResponse;
import com.aliyuncs.das.model.v20200116.DescribeAutoScalingConfigResponse.Data;
import com.aliyuncs.das.model.v20200116.DescribeAutoScalingConfigResponse.Data.Bandwidth;
import com.aliyuncs.das.model.v20200116.DescribeAutoScalingConfigResponse.Data.Resource;
import com.aliyuncs.das.model.v20200116.DescribeAutoScalingConfigResponse.Data.Shard;
import com.aliyuncs.das.model.v20200116.DescribeAutoScalingConfigResponse.Data.Spec;
import com.aliyuncs.das.model.v20200116.DescribeAutoScalingConfigResponse.Data.Storage;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoScalingConfigResponseUnmarshaller {

	public static DescribeAutoScalingConfigResponse unmarshall(DescribeAutoScalingConfigResponse describeAutoScalingConfigResponse, UnmarshallerContext _ctx) {
		
		describeAutoScalingConfigResponse.setRequestId(_ctx.stringValue("DescribeAutoScalingConfigResponse.RequestId"));
		describeAutoScalingConfigResponse.setCode(_ctx.stringValue("DescribeAutoScalingConfigResponse.Code"));
		describeAutoScalingConfigResponse.setMessage(_ctx.stringValue("DescribeAutoScalingConfigResponse.Message"));
		describeAutoScalingConfigResponse.setSuccess(_ctx.stringValue("DescribeAutoScalingConfigResponse.Success"));

		Data data = new Data();

		Spec spec = new Spec();
		spec.setUpgrade(_ctx.booleanValue("DescribeAutoScalingConfigResponse.Data.Spec.Upgrade"));
		spec.setCpuUsageUpperThreshold(_ctx.integerValue("DescribeAutoScalingConfigResponse.Data.Spec.CpuUsageUpperThreshold"));
		spec.setMemUsageUpperThreshold(_ctx.integerValue("DescribeAutoScalingConfigResponse.Data.Spec.MemUsageUpperThreshold"));
		spec.setMaxSpec(_ctx.stringValue("DescribeAutoScalingConfigResponse.Data.Spec.MaxSpec"));
		spec.setMaxReadOnlyNodes(_ctx.integerValue("DescribeAutoScalingConfigResponse.Data.Spec.MaxReadOnlyNodes"));
		spec.setObservationWindowSize(_ctx.stringValue("DescribeAutoScalingConfigResponse.Data.Spec.ObservationWindowSize"));
		spec.setCoolDownTime(_ctx.stringValue("DescribeAutoScalingConfigResponse.Data.Spec.CoolDownTime"));
		spec.setDowngrade(_ctx.booleanValue("DescribeAutoScalingConfigResponse.Data.Spec.Downgrade"));
		data.setSpec(spec);

		Storage storage = new Storage();
		storage.setUpgrade(_ctx.booleanValue("DescribeAutoScalingConfigResponse.Data.Storage.Upgrade"));
		storage.setDiskUsageUpperThreshold(_ctx.integerValue("DescribeAutoScalingConfigResponse.Data.Storage.DiskUsageUpperThreshold"));
		storage.setMaxStorage(_ctx.integerValue("DescribeAutoScalingConfigResponse.Data.Storage.MaxStorage"));
		data.setStorage(storage);

		Resource resource = new Resource();
		resource.setEnable(_ctx.booleanValue("DescribeAutoScalingConfigResponse.Data.Resource.Enable"));
		resource.setCpuUsageUpperThreshold(_ctx.integerValue("DescribeAutoScalingConfigResponse.Data.Resource.CpuUsageUpperThreshold"));
		resource.setCpuStep(_ctx.integerValue("DescribeAutoScalingConfigResponse.Data.Resource.CpuStep"));
		resource.setUpgradeObservationWindowSize(_ctx.stringValue("DescribeAutoScalingConfigResponse.Data.Resource.UpgradeObservationWindowSize"));
		resource.setDowngradeObservationWindowSize(_ctx.stringValue("DescribeAutoScalingConfigResponse.Data.Resource.DowngradeObservationWindowSize"));
		data.setResource(resource);

		Shard shard = new Shard();
		shard.setUpgrade(_ctx.booleanValue("DescribeAutoScalingConfigResponse.Data.Shard.Upgrade"));
		shard.setMemUsageUpperThreshold(_ctx.integerValue("DescribeAutoScalingConfigResponse.Data.Shard.MemUsageUpperThreshold"));
		shard.setMaxShards(_ctx.integerValue("DescribeAutoScalingConfigResponse.Data.Shard.MaxShards"));
		shard.setUpgradeObservationWindowSize(_ctx.stringValue("DescribeAutoScalingConfigResponse.Data.Shard.UpgradeObservationWindowSize"));
		shard.setDowngrade(_ctx.booleanValue("DescribeAutoScalingConfigResponse.Data.Shard.Downgrade"));
		shard.setMemUsageLowerThreshold(_ctx.integerValue("DescribeAutoScalingConfigResponse.Data.Shard.MemUsageLowerThreshold"));
		shard.setMinShards(_ctx.integerValue("DescribeAutoScalingConfigResponse.Data.Shard.MinShards"));
		shard.setDowngradeObservationWindowSize(_ctx.stringValue("DescribeAutoScalingConfigResponse.Data.Shard.DowngradeObservationWindowSize"));
		data.setShard(shard);

		Bandwidth bandwidth = new Bandwidth();
		bandwidth.setUpgrade(_ctx.booleanValue("DescribeAutoScalingConfigResponse.Data.Bandwidth.Upgrade"));
		bandwidth.setBandwidthUsageUpperThreshold(_ctx.integerValue("DescribeAutoScalingConfigResponse.Data.Bandwidth.BandwidthUsageUpperThreshold"));
		bandwidth.setObservationWindowSize(_ctx.stringValue("DescribeAutoScalingConfigResponse.Data.Bandwidth.ObservationWindowSize"));
		bandwidth.setDowngrade(_ctx.booleanValue("DescribeAutoScalingConfigResponse.Data.Bandwidth.Downgrade"));
		bandwidth.setBandwidthUsageLowerThreshold(_ctx.integerValue("DescribeAutoScalingConfigResponse.Data.Bandwidth.BandwidthUsageLowerThreshold"));
		data.setBandwidth(bandwidth);
		describeAutoScalingConfigResponse.setData(data);
	 
	 	return describeAutoScalingConfigResponse;
	}
}