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

import com.aliyuncs.drds.model.v20190123.DescribeFirstDrdsInstanceByOrderIdResponse;
import com.aliyuncs.drds.model.v20190123.DescribeFirstDrdsInstanceByOrderIdResponse.Data;
import com.aliyuncs.drds.model.v20190123.DescribeFirstDrdsInstanceByOrderIdResponse.Data.Vip;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFirstDrdsInstanceByOrderIdResponseUnmarshaller {

	public static DescribeFirstDrdsInstanceByOrderIdResponse unmarshall(DescribeFirstDrdsInstanceByOrderIdResponse describeFirstDrdsInstanceByOrderIdResponse, UnmarshallerContext _ctx) {
		
		describeFirstDrdsInstanceByOrderIdResponse.setRequestId(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.RequestId"));
		describeFirstDrdsInstanceByOrderIdResponse.setSuccess(_ctx.booleanValue("DescribeFirstDrdsInstanceByOrderIdResponse.Success"));

		Data data = new Data();
		data.setDrdsInstanceId(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.DrdsInstanceId"));
		data.setType(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.Type"));
		data.setRegionId(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.RegionId"));
		data.setZoneId(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.ZoneId"));
		data.setDescription(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.Description"));
		data.setNetworkType(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.NetworkType"));
		data.setStatus(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.Status"));
		data.setCreateTime(_ctx.longValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.CreateTime"));
		data.setVersion(_ctx.longValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.Version"));
		data.setInstanceSeries(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.InstanceSeries"));
		data.setInstanceSpec(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.InstanceSpec"));
		data.setVpcCloudInstanceId(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.VpcCloudInstanceId"));
		data.setInstRole(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.InstRole"));
		data.setCommodityCode(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.CommodityCode"));
		data.setExpireDate(_ctx.longValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.ExpireDate"));
		data.setVersionAction(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.VersionAction"));
		data.setLabel(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.Label"));
		data.setMasterInstanceId(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.MasterInstanceId"));
		data.setMachineType(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.MachineType"));
		data.setOrderInstanceId(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.OrderInstanceId"));
		data.setMysqlVersion(_ctx.integerValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.MysqlVersion"));

		List<String> readOnlyDBInstanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.ReadOnlyDBInstanceIds.Length"); i++) {
			readOnlyDBInstanceIds.add(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.ReadOnlyDBInstanceIds["+ i +"]"));
		}
		data.setReadOnlyDBInstanceIds(readOnlyDBInstanceIds);

		List<Vip> vips = new ArrayList<Vip>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.Vips.Length"); i++) {
			Vip vip = new Vip();
			vip.setDns(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.Vips["+ i +"].Dns"));
			vip.setExpireDays(_ctx.longValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.Vips["+ i +"].ExpireDays"));
			vip.setPort(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.Vips["+ i +"].Port"));
			vip.setType(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.Vips["+ i +"].Type"));
			vip.setVpcId(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.Vips["+ i +"].VpcId"));
			vip.setVswitchId(_ctx.stringValue("DescribeFirstDrdsInstanceByOrderIdResponse.Data.Vips["+ i +"].VswitchId"));

			vips.add(vip);
		}
		data.setVips(vips);
		describeFirstDrdsInstanceByOrderIdResponse.setData(data);
	 
	 	return describeFirstDrdsInstanceByOrderIdResponse;
	}
}