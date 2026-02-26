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

package com.aliyuncs.wyota.transform.v20210420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.wyota.model.v20210420.DescribeWorkZonesResponse;
import com.aliyuncs.wyota.model.v20210420.DescribeWorkZonesResponse.Data;
import com.aliyuncs.wyota.model.v20210420.DescribeWorkZonesResponse.Data.WorkZoneDTOListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWorkZonesResponseUnmarshaller {

	public static DescribeWorkZonesResponse unmarshall(DescribeWorkZonesResponse describeWorkZonesResponse, UnmarshallerContext _ctx) {
		
		describeWorkZonesResponse.setRequestId(_ctx.stringValue("DescribeWorkZonesResponse.RequestId"));
		describeWorkZonesResponse.setCode(_ctx.stringValue("DescribeWorkZonesResponse.Code"));
		describeWorkZonesResponse.setMessage(_ctx.stringValue("DescribeWorkZonesResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("DescribeWorkZonesResponse.Data.TotalCount"));

		List<WorkZoneDTOListItem> workZoneDTOList = new ArrayList<WorkZoneDTOListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWorkZonesResponse.Data.WorkZoneDTOList.Length"); i++) {
			WorkZoneDTOListItem workZoneDTOListItem = new WorkZoneDTOListItem();
			workZoneDTOListItem.setZoneId(_ctx.stringValue("DescribeWorkZonesResponse.Data.WorkZoneDTOList["+ i +"].ZoneId"));
			workZoneDTOListItem.setZoneName(_ctx.stringValue("DescribeWorkZonesResponse.Data.WorkZoneDTOList["+ i +"].ZoneName"));
			workZoneDTOListItem.setSeatCol(_ctx.integerValue("DescribeWorkZonesResponse.Data.WorkZoneDTOList["+ i +"].SeatCol"));
			workZoneDTOListItem.setSeatRow(_ctx.integerValue("DescribeWorkZonesResponse.Data.WorkZoneDTOList["+ i +"].SeatRow"));
			workZoneDTOListItem.setTenantId(_ctx.stringValue("DescribeWorkZonesResponse.Data.WorkZoneDTOList["+ i +"].TenantId"));

			workZoneDTOList.add(workZoneDTOListItem);
		}
		data.setWorkZoneDTOList(workZoneDTOList);
		describeWorkZonesResponse.setData(data);
	 
	 	return describeWorkZonesResponse;
	}
}