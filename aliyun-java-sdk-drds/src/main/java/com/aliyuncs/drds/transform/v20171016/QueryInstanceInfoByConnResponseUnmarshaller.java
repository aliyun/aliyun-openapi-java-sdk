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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInstanceInfoByConnResponseUnmarshaller {

	public static QueryInstanceInfoByConnResponse unmarshall(QueryInstanceInfoByConnResponse queryInstanceInfoByConnResponse, UnmarshallerContext context) {
		
		queryInstanceInfoByConnResponse.setRequestId(context.stringValue("QueryInstanceInfoByConnResponse.RequestId"));
		queryInstanceInfoByConnResponse.setSuccess(context.booleanValue("QueryInstanceInfoByConnResponse.Success"));

		Data data = new Data();
		data.setDrdsInstanceId(context.stringValue("QueryInstanceInfoByConnResponse.Data.DrdsInstanceId"));
		data.setType(context.stringValue("QueryInstanceInfoByConnResponse.Data.Type"));
		data.setRegionId(context.stringValue("QueryInstanceInfoByConnResponse.Data.RegionId"));
		data.setZoneId(context.stringValue("QueryInstanceInfoByConnResponse.Data.ZoneId"));
		data.setDescription(context.stringValue("QueryInstanceInfoByConnResponse.Data.Description"));
		data.setNetworkType(context.stringValue("QueryInstanceInfoByConnResponse.Data.NetworkType"));
		data.setStatus(context.stringValue("QueryInstanceInfoByConnResponse.Data.Status"));
		data.setCreateTime(context.longValue("QueryInstanceInfoByConnResponse.Data.CreateTime"));
		data.setVersion(context.longValue("QueryInstanceInfoByConnResponse.Data.Version"));
		data.setSpecification(context.stringValue("QueryInstanceInfoByConnResponse.Data.Specification"));
		data.setSpecTypeId(context.stringValue("QueryInstanceInfoByConnResponse.Data.SpecTypeId"));
		data.setSpecTypeName(context.stringValue("QueryInstanceInfoByConnResponse.Data.SpecTypeName"));
		data.setVpcCloudInstanceId(context.stringValue("QueryInstanceInfoByConnResponse.Data.VpcCloudInstanceId"));

		List<Vip> vips = new ArrayList<Vip>();
		for (int i = 0; i < context.lengthValue("QueryInstanceInfoByConnResponse.Data.Vips.Length"); i++) {
			Vip vip = new Vip();
			vip.setIP(context.stringValue("QueryInstanceInfoByConnResponse.Data.Vips["+ i +"].IP"));
			vip.setPort(context.stringValue("QueryInstanceInfoByConnResponse.Data.Vips["+ i +"].Port"));
			vip.setType(context.stringValue("QueryInstanceInfoByConnResponse.Data.Vips["+ i +"].Type"));
			vip.setVpcId(context.stringValue("QueryInstanceInfoByConnResponse.Data.Vips["+ i +"].VpcId"));
			vip.setVswitchId(context.stringValue("QueryInstanceInfoByConnResponse.Data.Vips["+ i +"].VswitchId"));

			vips.add(vip);
		}
		data.setVips(vips);
		queryInstanceInfoByConnResponse.setData(data);
	 
	 	return queryInstanceInfoByConnResponse;
	}
}