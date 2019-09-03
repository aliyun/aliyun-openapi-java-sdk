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

import com.aliyuncs.drds.model.v20190123.InnerDescribeDrdsInstancesResponse;
import com.aliyuncs.drds.model.v20190123.InnerDescribeDrdsInstancesResponse.Instance;
import com.aliyuncs.drds.model.v20190123.InnerDescribeDrdsInstancesResponse.Instance.Vip;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDescribeDrdsInstancesResponseUnmarshaller {

	public static InnerDescribeDrdsInstancesResponse unmarshall(InnerDescribeDrdsInstancesResponse innerDescribeDrdsInstancesResponse, UnmarshallerContext _ctx) {
		
		innerDescribeDrdsInstancesResponse.setRequestId(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.RequestId"));
		innerDescribeDrdsInstancesResponse.setPageNumber(_ctx.integerValue("InnerDescribeDrdsInstancesResponse.PageNumber"));
		innerDescribeDrdsInstancesResponse.setPageSize(_ctx.integerValue("InnerDescribeDrdsInstancesResponse.PageSize"));
		innerDescribeDrdsInstancesResponse.setTotal(_ctx.integerValue("InnerDescribeDrdsInstancesResponse.Total"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("InnerDescribeDrdsInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setDrdsInstanceId(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].DrdsInstanceId"));
			instance.setType(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].Type"));
			instance.setRegionId(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setZoneId(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].ZoneId"));
			instance.setDescription(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].Description"));
			instance.setNetworkType(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].NetworkType"));
			instance.setStatus(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].Status"));
			instance.setCreateTime(_ctx.longValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].CreateTime"));
			instance.setVersion(_ctx.longValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].Version"));
			instance.setCommodityCode(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].CommodityCode"));
			instance.setInstRole(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].InstRole"));
			instance.setInstanceSeries(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].InstanceSeries"));
			instance.setInstanceSpec(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].InstanceSpec"));
			instance.setMasterInstanceId(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].MasterInstanceId"));
			instance.setVpcCloudInstanceId(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].VpcCloudInstanceId"));
			instance.setVpcId(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].VpcId"));
			instance.setExpireDate(_ctx.longValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].ExpireDate"));
			instance.setVersionAction(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].VersionAction"));
			instance.setLabel(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].Label"));
			instance.setMachineType(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].MachineType"));
			instance.setOrderInstanceId(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].OrderInstanceId"));

			List<String> readOnlyDBInstanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].ReadOnlyDBInstanceIds.Length"); j++) {
				readOnlyDBInstanceIds.add(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].ReadOnlyDBInstanceIds["+ j +"]"));
			}
			instance.setReadOnlyDBInstanceIds(readOnlyDBInstanceIds);

			List<Vip> vips = new ArrayList<Vip>();
			for (int j = 0; j < _ctx.lengthValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].Vips.Length"); j++) {
				Vip vip = new Vip();
				vip.setIP(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].Vips["+ j +"].IP"));
				vip.setPort(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].Vips["+ j +"].Port"));
				vip.setType(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].Vips["+ j +"].Type"));
				vip.setVpcId(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].Vips["+ j +"].VpcId"));
				vip.setVswitchId(_ctx.stringValue("InnerDescribeDrdsInstancesResponse.Instances["+ i +"].Vips["+ j +"].VswitchId"));

				vips.add(vip);
			}
			instance.setVips(vips);

			instances.add(instance);
		}
		innerDescribeDrdsInstancesResponse.setInstances(instances);
	 
	 	return innerDescribeDrdsInstancesResponse;
	}
}