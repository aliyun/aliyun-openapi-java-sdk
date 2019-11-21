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

package com.aliyuncs.reid.transform.v20190928;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid.model.v20190928.DescribePassengerFlowByLocationResponse;
import com.aliyuncs.reid.model.v20190928.DescribePassengerFlowByLocationResponse.PassengerFlowItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePassengerFlowByLocationResponseUnmarshaller {

	public static DescribePassengerFlowByLocationResponse unmarshall(DescribePassengerFlowByLocationResponse describePassengerFlowByLocationResponse, UnmarshallerContext _ctx) {
		
		describePassengerFlowByLocationResponse.setRequestId(_ctx.stringValue("DescribePassengerFlowByLocationResponse.RequestId"));
		describePassengerFlowByLocationResponse.setLocationId(_ctx.longValue("DescribePassengerFlowByLocationResponse.LocationId"));
		describePassengerFlowByLocationResponse.setParentLocationIds(_ctx.stringValue("DescribePassengerFlowByLocationResponse.ParentLocationIds"));
		describePassengerFlowByLocationResponse.setSuccess(_ctx.booleanValue("DescribePassengerFlowByLocationResponse.Success"));
		describePassengerFlowByLocationResponse.setDynamicMessage(_ctx.stringValue("DescribePassengerFlowByLocationResponse.DynamicMessage"));
		describePassengerFlowByLocationResponse.setErrorCode(_ctx.stringValue("DescribePassengerFlowByLocationResponse.ErrorCode"));
		describePassengerFlowByLocationResponse.setErrorMessage(_ctx.stringValue("DescribePassengerFlowByLocationResponse.ErrorMessage"));
		describePassengerFlowByLocationResponse.setLocationName(_ctx.stringValue("DescribePassengerFlowByLocationResponse.LocationName"));
		describePassengerFlowByLocationResponse.setMessage(_ctx.stringValue("DescribePassengerFlowByLocationResponse.Message"));
		describePassengerFlowByLocationResponse.setCode(_ctx.stringValue("DescribePassengerFlowByLocationResponse.Code"));
		describePassengerFlowByLocationResponse.setDynamicCode(_ctx.stringValue("DescribePassengerFlowByLocationResponse.DynamicCode"));
		describePassengerFlowByLocationResponse.setStoreId(_ctx.longValue("DescribePassengerFlowByLocationResponse.StoreId"));
		describePassengerFlowByLocationResponse.setPercent(_ctx.floatValue("DescribePassengerFlowByLocationResponse.Percent"));
		describePassengerFlowByLocationResponse.setCount(_ctx.longValue("DescribePassengerFlowByLocationResponse.Count"));

		List<PassengerFlowItem> passengerFlowItems = new ArrayList<PassengerFlowItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePassengerFlowByLocationResponse.PassengerFlowItems.Length"); i++) {
			PassengerFlowItem passengerFlowItem = new PassengerFlowItem();
			passengerFlowItem.setLocationName(_ctx.stringValue("DescribePassengerFlowByLocationResponse.PassengerFlowItems["+ i +"].LocationName"));
			passengerFlowItem.setParentLocationIds(_ctx.stringValue("DescribePassengerFlowByLocationResponse.PassengerFlowItems["+ i +"].ParentLocationIds"));
			passengerFlowItem.setLocationId(_ctx.longValue("DescribePassengerFlowByLocationResponse.PassengerFlowItems["+ i +"].LocationId"));
			passengerFlowItem.setCount(_ctx.longValue("DescribePassengerFlowByLocationResponse.PassengerFlowItems["+ i +"].Count"));
			passengerFlowItem.setStoreId(_ctx.longValue("DescribePassengerFlowByLocationResponse.PassengerFlowItems["+ i +"].StoreId"));
			passengerFlowItem.setPercent(_ctx.floatValue("DescribePassengerFlowByLocationResponse.PassengerFlowItems["+ i +"].Percent"));

			passengerFlowItems.add(passengerFlowItem);
		}
		describePassengerFlowByLocationResponse.setPassengerFlowItems(passengerFlowItems);
	 
	 	return describePassengerFlowByLocationResponse;
	}
}