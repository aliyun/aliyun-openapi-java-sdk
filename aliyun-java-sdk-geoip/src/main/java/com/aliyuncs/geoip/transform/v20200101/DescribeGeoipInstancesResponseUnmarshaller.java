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

package com.aliyuncs.geoip.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.geoip.model.v20200101.DescribeGeoipInstancesResponse;
import com.aliyuncs.geoip.model.v20200101.DescribeGeoipInstancesResponse.GeoipInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGeoipInstancesResponseUnmarshaller {

	public static DescribeGeoipInstancesResponse unmarshall(DescribeGeoipInstancesResponse describeGeoipInstancesResponse, UnmarshallerContext _ctx) {
		
		describeGeoipInstancesResponse.setRequestId(_ctx.stringValue("DescribeGeoipInstancesResponse.RequestId"));

		List<GeoipInstance> geoipInstances = new ArrayList<GeoipInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGeoipInstancesResponse.GeoipInstances.Length"); i++) {
			GeoipInstance geoipInstance = new GeoipInstance();
			geoipInstance.setProductCode(_ctx.stringValue("DescribeGeoipInstancesResponse.GeoipInstances["+ i +"].ProductCode"));
			geoipInstance.setInstanceId(_ctx.stringValue("DescribeGeoipInstancesResponse.GeoipInstances["+ i +"].InstanceId"));
			geoipInstance.setVersionCode(_ctx.stringValue("DescribeGeoipInstancesResponse.GeoipInstances["+ i +"].VersionCode"));
			geoipInstance.setStatus(_ctx.stringValue("DescribeGeoipInstancesResponse.GeoipInstances["+ i +"].Status"));
			geoipInstance.setCreateTime(_ctx.stringValue("DescribeGeoipInstancesResponse.GeoipInstances["+ i +"].CreateTime"));
			geoipInstance.setCreateTimestamp(_ctx.longValue("DescribeGeoipInstancesResponse.GeoipInstances["+ i +"].CreateTimestamp"));
			geoipInstance.setExpireTime(_ctx.stringValue("DescribeGeoipInstancesResponse.GeoipInstances["+ i +"].ExpireTime"));
			geoipInstance.setExpireTimestamp(_ctx.longValue("DescribeGeoipInstancesResponse.GeoipInstances["+ i +"].ExpireTimestamp"));
			geoipInstance.setMaxQps(_ctx.longValue("DescribeGeoipInstancesResponse.GeoipInstances["+ i +"].MaxQps"));
			geoipInstance.setMaxQpd(_ctx.longValue("DescribeGeoipInstancesResponse.GeoipInstances["+ i +"].MaxQpd"));

			geoipInstances.add(geoipInstance);
		}
		describeGeoipInstancesResponse.setGeoipInstances(geoipInstances);
	 
	 	return describeGeoipInstancesResponse;
	}
}