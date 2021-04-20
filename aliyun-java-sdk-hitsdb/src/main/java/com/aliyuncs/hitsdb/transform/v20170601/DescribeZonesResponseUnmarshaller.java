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

package com.aliyuncs.hitsdb.transform.v20170601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20170601.DescribeZonesResponse;
import com.aliyuncs.hitsdb.model.v20170601.DescribeZonesResponse.ZoneModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeZonesResponseUnmarshaller {

	public static DescribeZonesResponse unmarshall(DescribeZonesResponse describeZonesResponse, UnmarshallerContext _ctx) {
		
		describeZonesResponse.setRequestId(_ctx.stringValue("DescribeZonesResponse.RequestId"));

		List<ZoneModel> zoneList = new ArrayList<ZoneModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeZonesResponse.ZoneList.Length"); i++) {
			ZoneModel zoneModel = new ZoneModel();
			zoneModel.setZoneId(_ctx.stringValue("DescribeZonesResponse.ZoneList["+ i +"].ZoneId"));
			zoneModel.setLocalName(_ctx.stringValue("DescribeZonesResponse.ZoneList["+ i +"].LocalName"));

			zoneList.add(zoneModel);
		}
		describeZonesResponse.setZoneList(zoneList);
	 
	 	return describeZonesResponse;
	}
}