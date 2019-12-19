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

import com.aliyuncs.reid.model.v20190928.DescribeCustomerFlowByLocationResponse;
import com.aliyuncs.reid.model.v20190928.DescribeCustomerFlowByLocationResponse.CustomerFlowItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomerFlowByLocationResponseUnmarshaller {

	public static DescribeCustomerFlowByLocationResponse unmarshall(DescribeCustomerFlowByLocationResponse describeCustomerFlowByLocationResponse, UnmarshallerContext _ctx) {
		
		describeCustomerFlowByLocationResponse.setRequestId(_ctx.stringValue("DescribeCustomerFlowByLocationResponse.RequestId"));
		describeCustomerFlowByLocationResponse.setLocationId(_ctx.longValue("DescribeCustomerFlowByLocationResponse.LocationId"));
		describeCustomerFlowByLocationResponse.setParentLocationIds(_ctx.stringValue("DescribeCustomerFlowByLocationResponse.ParentLocationIds"));
		describeCustomerFlowByLocationResponse.setSuccess(_ctx.booleanValue("DescribeCustomerFlowByLocationResponse.Success"));
		describeCustomerFlowByLocationResponse.setErrorCode(_ctx.stringValue("DescribeCustomerFlowByLocationResponse.ErrorCode"));
		describeCustomerFlowByLocationResponse.setErrorMessage(_ctx.stringValue("DescribeCustomerFlowByLocationResponse.ErrorMessage"));
		describeCustomerFlowByLocationResponse.setLocationName(_ctx.stringValue("DescribeCustomerFlowByLocationResponse.LocationName"));
		describeCustomerFlowByLocationResponse.setPercent(_ctx.floatValue("DescribeCustomerFlowByLocationResponse.Percent"));
		describeCustomerFlowByLocationResponse.setStoreId(_ctx.longValue("DescribeCustomerFlowByLocationResponse.StoreId"));
		describeCustomerFlowByLocationResponse.setCount(_ctx.longValue("DescribeCustomerFlowByLocationResponse.Count"));

		List<CustomerFlowItem> customerFlowItems = new ArrayList<CustomerFlowItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomerFlowByLocationResponse.CustomerFlowItems.Length"); i++) {
			CustomerFlowItem customerFlowItem = new CustomerFlowItem();
			customerFlowItem.setCount(_ctx.longValue("DescribeCustomerFlowByLocationResponse.CustomerFlowItems["+ i +"].Count"));
			customerFlowItem.setStoreId(_ctx.longValue("DescribeCustomerFlowByLocationResponse.CustomerFlowItems["+ i +"].StoreId"));
			customerFlowItem.setPercent(_ctx.floatValue("DescribeCustomerFlowByLocationResponse.CustomerFlowItems["+ i +"].Percent"));
			customerFlowItem.setLocationName(_ctx.stringValue("DescribeCustomerFlowByLocationResponse.CustomerFlowItems["+ i +"].LocationName"));
			customerFlowItem.setParentLocationIds(_ctx.stringValue("DescribeCustomerFlowByLocationResponse.CustomerFlowItems["+ i +"].ParentLocationIds"));
			customerFlowItem.setLocationId(_ctx.longValue("DescribeCustomerFlowByLocationResponse.CustomerFlowItems["+ i +"].LocationId"));

			customerFlowItems.add(customerFlowItem);
		}
		describeCustomerFlowByLocationResponse.setCustomerFlowItems(customerFlowItems);
	 
	 	return describeCustomerFlowByLocationResponse;
	}
}