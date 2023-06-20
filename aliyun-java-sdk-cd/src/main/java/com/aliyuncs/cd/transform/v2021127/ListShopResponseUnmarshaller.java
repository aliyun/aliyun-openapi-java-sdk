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

package com.aliyuncs.cd.transform.v2021127;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cd.model.v2021127.ListShopResponse;
import com.aliyuncs.cd.model.v2021127.ListShopResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListShopResponseUnmarshaller {

	public static ListShopResponse unmarshall(ListShopResponse listShopResponse, UnmarshallerContext _ctx) {
		
		listShopResponse.setRequestId(_ctx.stringValue("ListShopResponse.RequestId"));
		listShopResponse.setSuccess(_ctx.booleanValue("ListShopResponse.Success"));
		listShopResponse.setMessage(_ctx.stringValue("ListShopResponse.Message"));
		listShopResponse.setCode(_ctx.stringValue("ListShopResponse.Code"));
		listShopResponse.setHttpStatusCode(_ctx.integerValue("ListShopResponse.HttpStatusCode"));
		listShopResponse.setTotalCount(_ctx.longValue("ListShopResponse.TotalCount"));
		listShopResponse.setPageNumber(_ctx.integerValue("ListShopResponse.PageNumber"));
		listShopResponse.setPageSize(_ctx.integerValue("ListShopResponse.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListShopResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setShopId(_ctx.stringValue("ListShopResponse.Data["+ i +"].ShopId"));
			dataItem.setShopName(_ctx.stringValue("ListShopResponse.Data["+ i +"].ShopName"));
			dataItem.setLocation(_ctx.stringValue("ListShopResponse.Data["+ i +"].Location"));
			dataItem.setLongitude(_ctx.stringValue("ListShopResponse.Data["+ i +"].Longitude"));
			dataItem.setLatitude(_ctx.stringValue("ListShopResponse.Data["+ i +"].Latitude"));
			dataItem.setRegionAddress(_ctx.stringValue("ListShopResponse.Data["+ i +"].RegionAddress"));
			dataItem.setRegionCode(_ctx.stringValue("ListShopResponse.Data["+ i +"].RegionCode"));
			dataItem.setRemark(_ctx.stringValue("ListShopResponse.Data["+ i +"].Remark"));
			dataItem.setDeviceNum(_ctx.integerValue("ListShopResponse.Data["+ i +"].DeviceNum"));
			dataItem.setGmtCreateTime(_ctx.longValue("ListShopResponse.Data["+ i +"].GmtCreateTime"));
			dataItem.setWeekdaysStartTime(_ctx.stringValue("ListShopResponse.Data["+ i +"].WeekdaysStartTime"));
			dataItem.setWeekdaysEndTime(_ctx.stringValue("ListShopResponse.Data["+ i +"].WeekdaysEndTime"));
			dataItem.setWeekendStartTime(_ctx.stringValue("ListShopResponse.Data["+ i +"].WeekendStartTime"));
			dataItem.setWeekendEndTime(_ctx.stringValue("ListShopResponse.Data["+ i +"].WeekendEndTime"));
			dataItem.setBusinessStatus(_ctx.integerValue("ListShopResponse.Data["+ i +"].BusinessStatus"));

			List<String> deviceMacList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListShopResponse.Data["+ i +"].DeviceMacList.Length"); j++) {
				deviceMacList.add(_ctx.stringValue("ListShopResponse.Data["+ i +"].DeviceMacList["+ j +"]"));
			}
			dataItem.setDeviceMacList(deviceMacList);

			List<String> shopGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListShopResponse.Data["+ i +"].ShopGroupIds.Length"); j++) {
				shopGroupIds.add(_ctx.stringValue("ListShopResponse.Data["+ i +"].ShopGroupIds["+ j +"]"));
			}
			dataItem.setShopGroupIds(shopGroupIds);

			data.add(dataItem);
		}
		listShopResponse.setData(data);
	 
	 	return listShopResponse;
	}
}