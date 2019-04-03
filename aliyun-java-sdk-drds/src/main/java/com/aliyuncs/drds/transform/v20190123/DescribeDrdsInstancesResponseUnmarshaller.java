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

	public static DescribeDrdsInstancesResponse unmarshall(DescribeDrdsInstancesResponse describeDrdsInstancesResponse, UnmarshallerContext context) {
		
		describeDrdsInstancesResponse.setRequestId(context.stringValue("DescribeDrdsInstancesResponse.RequestId"));
		describeDrdsInstancesResponse.setPageNumber(context.integerValue("DescribeDrdsInstancesResponse.PageNumber"));
		describeDrdsInstancesResponse.setPageSize(context.integerValue("DescribeDrdsInstancesResponse.PageSize"));
		describeDrdsInstancesResponse.setTotal(context.integerValue("DescribeDrdsInstancesResponse.Total"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("DescribeDrdsInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setDrdsInstanceId(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].DrdsInstanceId"));
			instance.setType(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Type"));
			instance.setRegionId(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setZoneId(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].ZoneId"));
			instance.setDescription(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Description"));
			instance.setNetworkType(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].NetworkType"));
			instance.setStatus(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Status"));
			instance.setCreateTime(context.longValue("DescribeDrdsInstancesResponse.Instances["+ i +"].CreateTime"));
			instance.setVersion(context.longValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Version"));
			instance.setCommodityCode(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].CommodityCode"));
			instance.setInstRole(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].InstRole"));
			instance.setInstanceSeries(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].InstanceSeries"));
			instance.setInstanceSpec(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].InstanceSpec"));
			instance.setMasterInstanceId(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].MasterInstanceId"));
			instance.setVpcCloudInstanceId(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].VpcCloudInstanceId"));
			instance.setVpcId(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].VpcId"));
			instance.setExpireDate(context.longValue("DescribeDrdsInstancesResponse.Instances["+ i +"].ExpireDate"));
			instance.setVersionAction(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].VersionAction"));
			instance.setLabel(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Label"));

			List<String> readOnlyDBInstanceIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeDrdsInstancesResponse.Instances["+ i +"].ReadOnlyDBInstanceIds.Length"); j++) {
				readOnlyDBInstanceIds.add(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].ReadOnlyDBInstanceIds["+ j +"]"));
			}
			instance.setReadOnlyDBInstanceIds(readOnlyDBInstanceIds);

			List<Vip> vips = new ArrayList<Vip>();
			for (int j = 0; j < context.lengthValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Vips.Length"); j++) {
				Vip vip = new Vip();
				vip.setIP(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Vips["+ j +"].IP"));
				vip.setPort(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Vips["+ j +"].Port"));
				vip.setType(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Vips["+ j +"].Type"));
				vip.setVpcId(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Vips["+ j +"].VpcId"));
				vip.setVswitchId(context.stringValue("DescribeDrdsInstancesResponse.Instances["+ i +"].Vips["+ j +"].VswitchId"));

				vips.add(vip);
			}
			instance.setVips(vips);

			instances.add(instance);
		}
		describeDrdsInstancesResponse.setInstances(instances);
	 
	 	return describeDrdsInstancesResponse;
	}
}