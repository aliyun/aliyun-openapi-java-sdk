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

package com.aliyuncs.cdrs.transform.v20201101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdrs.model.v20201101.ListAreaHotSpotMetricsResponse;
import com.aliyuncs.cdrs.model.v20201101.ListAreaHotSpotMetricsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAreaHotSpotMetricsResponseUnmarshaller {

	public static ListAreaHotSpotMetricsResponse unmarshall(ListAreaHotSpotMetricsResponse listAreaHotSpotMetricsResponse, UnmarshallerContext _ctx) {
		
		listAreaHotSpotMetricsResponse.setRequestId(_ctx.stringValue("ListAreaHotSpotMetricsResponse.RequestId"));
		listAreaHotSpotMetricsResponse.setCode(_ctx.stringValue("ListAreaHotSpotMetricsResponse.Code"));
		listAreaHotSpotMetricsResponse.setMessage(_ctx.stringValue("ListAreaHotSpotMetricsResponse.Message"));
		listAreaHotSpotMetricsResponse.setPageNumber(_ctx.stringValue("ListAreaHotSpotMetricsResponse.PageNumber"));
		listAreaHotSpotMetricsResponse.setPageSize(_ctx.stringValue("ListAreaHotSpotMetricsResponse.PageSize"));
		listAreaHotSpotMetricsResponse.setTotalCount(_ctx.stringValue("ListAreaHotSpotMetricsResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAreaHotSpotMetricsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTimes(_ctx.stringValue("ListAreaHotSpotMetricsResponse.Data["+ i +"].Times"));
			dataItem.setCoordinates(_ctx.stringValue("ListAreaHotSpotMetricsResponse.Data["+ i +"].Coordinates"));
			dataItem.setDeviceId(_ctx.stringValue("ListAreaHotSpotMetricsResponse.Data["+ i +"].DeviceId"));
			dataItem.setPersonId(_ctx.stringValue("ListAreaHotSpotMetricsResponse.Data["+ i +"].PersonId"));
			dataItem.setIntervalTime(_ctx.stringValue("ListAreaHotSpotMetricsResponse.Data["+ i +"].IntervalTime"));

			data.add(dataItem);
		}
		listAreaHotSpotMetricsResponse.setData(data);
	 
	 	return listAreaHotSpotMetricsResponse;
	}
}