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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeDrdsInstancesResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsInstancesResponse.Instance;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsInstancesResponse.Instance.Vip;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsInstancesResponseUnmarshaller {

	public static DescribeDrdsInstancesResponse unmarshall(DescribeDrdsInstancesResponse describeDrdsInstancesResponse, UnmarshallerContext _ctx) {
		
		describeDrdsInstancesResponse.setRequestId(_ctx.stringValue("DescribeDrdsInstancesResponse.RequestId"));
		describeDrdsInstancesResponse.setPageNumber(_ctx.integerValue("DescribeDrdsInstancesResponse.PageNumber"));
		describeDrdsInstancesResponse.setPageSize(_ctx.integerValue("DescribeDrdsInstancesResponse.PageSize"));
		describeDrdsInstancesResponse.setTotal(_ctx.integerValue("DescribeDrdsInstancesResponse.Total"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setVpcId(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].VpcId"));
			instance.setStatus(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Status"));
			instance.setType(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Type"));
			instance.setCommodityCode(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].CommodityCode"));
			instance.setMachineType(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].MachineType"));
			instance.setCreateTime(_ctx.longValue("DescribeDrdsInstancesResponse.Instances["+ i +"].CreateTime"));
			instance.setVersionAction(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].VersionAction"));
			instance.setInstanceSeries(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].InstanceSeries"));
			instance.setNetworkType(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].NetworkType"));
			instance.setLabel(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Label"));
			instance.setProductVersion(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].ProductVersion"));
			instance.setInstanceSpec(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].InstanceSpec"));
			instance.setRegionId(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setVpcCloudInstanceId(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].VpcCloudInstanceId"));
			instance.setDescription(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Description"));
			instance.setVersion(_ctx.longValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Version"));
			instance.setResourceGroupId(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].ResourceGroupId"));
			instance.setZoneId(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].ZoneId"));
			instance.setDrdsInstanceId(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].DrdsInstanceId"));
			instance.setExpireDate(_ctx.longValue("DescribeDrdsInstancesResponse.Instances["+ i +"].ExpireDate"));
			instance.setMasterInstanceId(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].MasterInstanceId"));
			instance.setOrderInstanceId(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].OrderInstanceId"));
			instance.setInstRole(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].InstRole"));
			instance.setSeries(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].series"));

			List<String> readOnlyDBInstanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDrdsInstancesResponse.Instances["+ i +"].ReadOnlyDBInstanceIds.Length"); j++) {
				readOnlyDBInstanceIds.add(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].ReadOnlyDBInstanceIds["+ j +"]"));
			}
			instance.setReadOnlyDBInstanceIds(readOnlyDBInstanceIds);

			List<Vip> vips = new ArrayList<Vip>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Vips.Length"); j++) {
				Vip vip = new Vip();
				vip.setVpcId(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Vips["+ j +"].VpcId"));
				vip.setType(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Vips["+ j +"].Type"));
				vip.setVswitchId(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Vips["+ j +"].VswitchId"));
				vip.setPort(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Vips["+ j +"].Port"));
				vip.setIP(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Vips["+ j +"].IP"));
				vip.setDns(_ctx.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Vips["+ j +"].dns"));

				vips.add(vip);
			}
			instance.setVips(vips);

			instances.add(instance);
		}
		describeDrdsInstancesResponse.setInstances(instances);
	 
	 	return describeDrdsInstancesResponse;
	}
}