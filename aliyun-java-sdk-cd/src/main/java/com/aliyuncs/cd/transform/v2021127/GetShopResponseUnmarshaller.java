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

import com.aliyuncs.cd.model.v2021127.GetShopResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetShopResponseUnmarshaller {

	public static GetShopResponse unmarshall(GetShopResponse getShopResponse, UnmarshallerContext _ctx) {
		
		getShopResponse.setRequestId(_ctx.stringValue("GetShopResponse.RequestId"));
		getShopResponse.setSuccess(_ctx.booleanValue("GetShopResponse.Success"));
		getShopResponse.setMessage(_ctx.stringValue("GetShopResponse.Message"));
		getShopResponse.setCode(_ctx.stringValue("GetShopResponse.Code"));
		getShopResponse.setHttpStatusCode(_ctx.integerValue("GetShopResponse.HttpStatusCode"));
		getShopResponse.setShopId(_ctx.stringValue("GetShopResponse.ShopId"));
		getShopResponse.setShopName(_ctx.stringValue("GetShopResponse.ShopName"));
		getShopResponse.setLocation(_ctx.stringValue("GetShopResponse.Location"));
		getShopResponse.setLongitude(_ctx.stringValue("GetShopResponse.Longitude"));
		getShopResponse.setLatitude(_ctx.stringValue("GetShopResponse.Latitude"));
		getShopResponse.setRegionAddress(_ctx.stringValue("GetShopResponse.RegionAddress"));
		getShopResponse.setRegionCode(_ctx.stringValue("GetShopResponse.RegionCode"));
		getShopResponse.setRemark(_ctx.stringValue("GetShopResponse.Remark"));
		getShopResponse.setDeviceNum(_ctx.integerValue("GetShopResponse.DeviceNum"));
		getShopResponse.setGmtCreateTime(_ctx.longValue("GetShopResponse.GmtCreateTime"));
		getShopResponse.setWeekdaysStartTime(_ctx.stringValue("GetShopResponse.WeekdaysStartTime"));
		getShopResponse.setWeekdaysEndTime(_ctx.stringValue("GetShopResponse.WeekdaysEndTime"));
		getShopResponse.setWeekendStartTime(_ctx.stringValue("GetShopResponse.WeekendStartTime"));
		getShopResponse.setWeekendEndTime(_ctx.stringValue("GetShopResponse.WeekendEndTime"));
		getShopResponse.setBusinessStatus(_ctx.integerValue("GetShopResponse.BusinessStatus"));

		List<String> deviceMacList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetShopResponse.DeviceMacList.Length"); i++) {
			deviceMacList.add(_ctx.stringValue("GetShopResponse.DeviceMacList["+ i +"]"));
		}
		getShopResponse.setDeviceMacList(deviceMacList);

		List<String> shopGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetShopResponse.ShopGroupIds.Length"); i++) {
			shopGroupIds.add(_ctx.stringValue("GetShopResponse.ShopGroupIds["+ i +"]"));
		}
		getShopResponse.setShopGroupIds(shopGroupIds);
	 
	 	return getShopResponse;
	}
}