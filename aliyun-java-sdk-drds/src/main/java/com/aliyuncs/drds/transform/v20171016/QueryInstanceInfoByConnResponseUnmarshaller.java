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

package com.aliyuncs.drds.transform.v20171016;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20171016.QueryInstanceInfoByConnResponse;
import com.aliyuncs.drds.model.v20171016.QueryInstanceInfoByConnResponse.Data;
import com.aliyuncs.drds.model.v20171016.QueryInstanceInfoByConnResponse.Data.Vip;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInstanceInfoByConnResponseUnmarshaller {

	public static QueryInstanceInfoByConnResponse unmarshall(QueryInstanceInfoByConnResponse queryInstanceInfoByConnResponse, UnmarshallerContext _ctx) {
		
		queryInstanceInfoByConnResponse.setRequestId(_ctx.stringValue("QueryInstanceInfoByConnResponse.RequestId"));
		queryInstanceInfoByConnResponse.setSuccess(_ctx.booleanValue("QueryInstanceInfoByConnResponse.Success"));

		Data data = new Data();
		data.setDrdsInstanceId(_ctx.stringValue("QueryInstanceInfoByConnResponse.Data.DrdsInstanceId"));
		data.setType(_ctx.stringValue("QueryInstanceInfoByConnResponse.Data.Type"));
		data.setRegionId(_ctx.stringValue("QueryInstanceInfoByConnResponse.Data.RegionId"));
		data.setZoneId(_ctx.stringValue("QueryInstanceInfoByConnResponse.Data.ZoneId"));
		data.setDescription(_ctx.stringValue("QueryInstanceInfoByConnResponse.Data.Description"));
		data.setNetworkType(_ctx.stringValue("QueryInstanceInfoByConnResponse.Data.NetworkType"));
		data.setStatus(_ctx.stringValue("QueryInstanceInfoByConnResponse.Data.Status"));
		data.setCreateTime(_ctx.longValue("QueryInstanceInfoByConnResponse.Data.CreateTime"));
		data.setVersion(_ctx.longValue("QueryInstanceInfoByConnResponse.Data.Version"));
		data.setSpecification(_ctx.stringValue("QueryInstanceInfoByConnResponse.Data.Specification"));
		data.setSpecTypeId(_ctx.stringValue("QueryInstanceInfoByConnResponse.Data.SpecTypeId"));
		data.setSpecTypeName(_ctx.stringValue("QueryInstanceInfoByConnResponse.Data.SpecTypeName"));
		data.setVpcCloudInstanceId(_ctx.stringValue("QueryInstanceInfoByConnResponse.Data.VpcCloudInstanceId"));

		List<Vip> vips = new ArrayList<Vip>();
		for (int i = 0; i < _ctx.lengthValue("QueryInstanceInfoByConnResponse.Data.Vips.Length"); i++) {
			Vip vip = new Vip();
			vip.setIP(_ctx.stringValue("QueryInstanceInfoByConnResponse.Data.Vips["+ i +"].IP"));
			vip.setPort(_ctx.stringValue("QueryInstanceInfoByConnResponse.Data.Vips["+ i +"].Port"));
			vip.setType(_ctx.stringValue("QueryInstanceInfoByConnResponse.Data.Vips["+ i +"].Type"));
			vip.setVpcId(_ctx.stringValue("QueryInstanceInfoByConnResponse.Data.Vips["+ i +"].VpcId"));
			vip.setVswitchId(_ctx.stringValue("QueryInstanceInfoByConnResponse.Data.Vips["+ i +"].VswitchId"));

			vips.add(vip);
		}
		data.setVips(vips);
		queryInstanceInfoByConnResponse.setData(data);
	 
	 	return queryInstanceInfoByConnResponse;
	}
}