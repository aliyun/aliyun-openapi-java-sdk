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

import com.aliyuncs.drds.model.v20190123.DescribeDrdsInstanceResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsInstanceResponse.Data;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsInstanceResponse.Data.Vip;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsInstanceResponseUnmarshaller {

	public static DescribeDrdsInstanceResponse unmarshall(DescribeDrdsInstanceResponse describeDrdsInstanceResponse, UnmarshallerContext _ctx) {
		
		describeDrdsInstanceResponse.setRequestId(_ctx.stringValue("DescribeDrdsInstanceResponse.RequestId"));
		describeDrdsInstanceResponse.setSuccess(_ctx.booleanValue("DescribeDrdsInstanceResponse.Success"));

		Data data = new Data();
		data.setDrdsInstanceId(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.DrdsInstanceId"));
		data.setType(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.Type"));
		data.setRegionId(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.RegionId"));
		data.setZoneId(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.ZoneId"));
		data.setDescription(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.Description"));
		data.setNetworkType(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.NetworkType"));
		data.setStatus(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.Status"));
		data.setCreateTime(_ctx.longValue("DescribeDrdsInstanceResponse.Data.CreateTime"));
		data.setVersion(_ctx.longValue("DescribeDrdsInstanceResponse.Data.Version"));
		data.setInstanceSeries(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.InstanceSeries"));
		data.setInstanceSpec(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.InstanceSpec"));
		data.setVpcCloudInstanceId(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.VpcCloudInstanceId"));
		data.setInstRole(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.InstRole"));
		data.setCommodityCode(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.CommodityCode"));
		data.setExpireDate(_ctx.longValue("DescribeDrdsInstanceResponse.Data.ExpireDate"));
		data.setVersionAction(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.VersionAction"));
		data.setLabel(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.Label"));
		data.setMasterInstanceId(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.MasterInstanceId"));
		data.setMachineType(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.MachineType"));
		data.setOrderInstanceId(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.OrderInstanceId"));
		data.setMysqlVersion(_ctx.integerValue("DescribeDrdsInstanceResponse.Data.MysqlVersion"));
		data.setStorageType(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.StorageType"));

		List<String> readOnlyDBInstanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsInstanceResponse.Data.ReadOnlyDBInstanceIds.Length"); i++) {
			readOnlyDBInstanceIds.add(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.ReadOnlyDBInstanceIds["+ i +"]"));
		}
		data.setReadOnlyDBInstanceIds(readOnlyDBInstanceIds);

		List<Vip> vips = new ArrayList<Vip>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsInstanceResponse.Data.Vips.Length"); i++) {
			Vip vip = new Vip();
			vip.setDns(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.Vips["+ i +"].Dns"));
			vip.setExpireDays(_ctx.longValue("DescribeDrdsInstanceResponse.Data.Vips["+ i +"].ExpireDays"));
			vip.setPort(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.Vips["+ i +"].Port"));
			vip.setType(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.Vips["+ i +"].Type"));
			vip.setVpcId(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.Vips["+ i +"].VpcId"));
			vip.setVswitchId(_ctx.stringValue("DescribeDrdsInstanceResponse.Data.Vips["+ i +"].VswitchId"));

			vips.add(vip);
		}
		data.setVips(vips);
		describeDrdsInstanceResponse.setData(data);
	 
	 	return describeDrdsInstanceResponse;
	}
}