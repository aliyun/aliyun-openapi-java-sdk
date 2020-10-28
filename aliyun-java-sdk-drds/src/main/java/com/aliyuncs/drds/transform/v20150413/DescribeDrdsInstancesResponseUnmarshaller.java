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

package com.aliyuncs.drds.transform.v20150413;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20150413.DescribeDrdsInstancesResponse;
import com.aliyuncs.drds.model.v20150413.DescribeDrdsInstancesResponse.Instance;
import com.aliyuncs.drds.model.v20150413.DescribeDrdsInstancesResponse.Instance.Vip;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsInstancesResponseUnmarshaller {

	public static DescribeDrdsInstancesResponse unmarshall(DescribeDrdsInstancesResponse describeDrdsInstancesResponse, UnmarshallerContext _ctx) {
		
		describeDrdsInstancesResponse.setRequestId(_ctx.stringValue("DescribeDrdsInstancesResponse.RequestId"));
		describeDrdsInstancesResponse.setSuccess(_ctx.booleanValue("DescribeDrdsInstancesResponse.Success"));

		List<Instance> data = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsInstancesResponse.Data.Length"); i++) {
			Instance instance = new Instance();
			instance.setDrdsInstanceId(_ctx.stringValue("DescribeDrdsInstancesResponse.Data["+ i +"].DrdsInstanceId"));
			instance.setType(_ctx.stringValue("DescribeDrdsInstancesResponse.Data["+ i +"].Type"));
			instance.setRegionId(_ctx.stringValue("DescribeDrdsInstancesResponse.Data["+ i +"].RegionId"));
			instance.setZoneId(_ctx.stringValue("DescribeDrdsInstancesResponse.Data["+ i +"].ZoneId"));
			instance.setDescription(_ctx.stringValue("DescribeDrdsInstancesResponse.Data["+ i +"].Description"));
			instance.setNetworkType(_ctx.stringValue("DescribeDrdsInstancesResponse.Data["+ i +"].NetworkType"));
			instance.setStatus(_ctx.stringValue("DescribeDrdsInstancesResponse.Data["+ i +"].Status"));
			instance.setCreateTime(_ctx.longValue("DescribeDrdsInstancesResponse.Data["+ i +"].CreateTime"));
			instance.setVersion(_ctx.longValue("DescribeDrdsInstancesResponse.Data["+ i +"].Version"));

			List<Vip> vips = new ArrayList<Vip>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDrdsInstancesResponse.Data["+ i +"].Vips.Length"); j++) {
				Vip vip = new Vip();
				vip.setIP(_ctx.stringValue("DescribeDrdsInstancesResponse.Data["+ i +"].Vips["+ j +"].IP"));
				vip.setPort(_ctx.stringValue("DescribeDrdsInstancesResponse.Data["+ i +"].Vips["+ j +"].Port"));
				vip.setType(_ctx.stringValue("DescribeDrdsInstancesResponse.Data["+ i +"].Vips["+ j +"].Type"));

				vips.add(vip);
			}
			instance.setVips(vips);

			data.add(instance);
		}
		describeDrdsInstancesResponse.setData(data);
	 
	 	return describeDrdsInstancesResponse;
	}
}