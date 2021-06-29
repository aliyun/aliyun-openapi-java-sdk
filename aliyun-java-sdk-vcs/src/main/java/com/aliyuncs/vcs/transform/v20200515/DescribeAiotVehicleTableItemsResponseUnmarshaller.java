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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.DescribeAiotVehicleTableItemsResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeAiotVehicleTableItemsResponse.VehicleTableItems;
import com.aliyuncs.vcs.model.v20200515.DescribeAiotVehicleTableItemsResponse.VehicleTableItems.VehicleTableItemType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAiotVehicleTableItemsResponseUnmarshaller {

	public static DescribeAiotVehicleTableItemsResponse unmarshall(DescribeAiotVehicleTableItemsResponse describeAiotVehicleTableItemsResponse, UnmarshallerContext _ctx) {
		
		describeAiotVehicleTableItemsResponse.setRequestId(_ctx.stringValue("DescribeAiotVehicleTableItemsResponse.RequestId"));
		describeAiotVehicleTableItemsResponse.setCode(_ctx.stringValue("DescribeAiotVehicleTableItemsResponse.Code"));
		describeAiotVehicleTableItemsResponse.setMessage(_ctx.stringValue("DescribeAiotVehicleTableItemsResponse.Message"));

		VehicleTableItems vehicleTableItems = new VehicleTableItems();
		vehicleTableItems.setPageNum(_ctx.longValue("DescribeAiotVehicleTableItemsResponse.VehicleTableItems.PageNum"));
		vehicleTableItems.setPageSize(_ctx.longValue("DescribeAiotVehicleTableItemsResponse.VehicleTableItems.PageSize"));
		vehicleTableItems.setTotalNum(_ctx.longValue("DescribeAiotVehicleTableItemsResponse.VehicleTableItems.TotalNum"));

		List<VehicleTableItemType> vehicleTableItemList = new ArrayList<VehicleTableItemType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAiotVehicleTableItemsResponse.VehicleTableItems.VehicleTableItemList.Length"); i++) {
			VehicleTableItemType vehicleTableItemType = new VehicleTableItemType();
			vehicleTableItemType.setVehicleTableItemId(_ctx.stringValue("DescribeAiotVehicleTableItemsResponse.VehicleTableItems.VehicleTableItemList["+ i +"].VehicleTableItemId"));
			vehicleTableItemType.setVehicleTableId(_ctx.stringValue("DescribeAiotVehicleTableItemsResponse.VehicleTableItems.VehicleTableItemList["+ i +"].VehicleTableId"));
			vehicleTableItemType.setPlateNo(_ctx.stringValue("DescribeAiotVehicleTableItemsResponse.VehicleTableItems.VehicleTableItemList["+ i +"].PlateNo"));
			vehicleTableItemType.setOwnerName(_ctx.stringValue("DescribeAiotVehicleTableItemsResponse.VehicleTableItems.VehicleTableItemList["+ i +"].OwnerName"));
			vehicleTableItemType.setPhoneNo(_ctx.stringValue("DescribeAiotVehicleTableItemsResponse.VehicleTableItems.VehicleTableItemList["+ i +"].PhoneNo"));
			vehicleTableItemType.setBeginTime(_ctx.stringValue("DescribeAiotVehicleTableItemsResponse.VehicleTableItems.VehicleTableItemList["+ i +"].BeginTime"));
			vehicleTableItemType.setEndTime(_ctx.stringValue("DescribeAiotVehicleTableItemsResponse.VehicleTableItems.VehicleTableItemList["+ i +"].EndTime"));
			vehicleTableItemType.setRemarks(_ctx.stringValue("DescribeAiotVehicleTableItemsResponse.VehicleTableItems.VehicleTableItemList["+ i +"].Remarks"));

			vehicleTableItemList.add(vehicleTableItemType);
		}
		vehicleTableItems.setVehicleTableItemList(vehicleTableItemList);
		describeAiotVehicleTableItemsResponse.setVehicleTableItems(vehicleTableItems);
	 
	 	return describeAiotVehicleTableItemsResponse;
	}
}