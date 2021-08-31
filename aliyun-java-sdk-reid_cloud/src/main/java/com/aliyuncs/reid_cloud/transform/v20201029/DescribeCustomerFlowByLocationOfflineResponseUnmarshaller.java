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

package com.aliyuncs.reid_cloud.transform.v20201029;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid_cloud.model.v20201029.DescribeCustomerFlowByLocationOfflineResponse;
import com.aliyuncs.reid_cloud.model.v20201029.DescribeCustomerFlowByLocationOfflineResponse.CustomerSummaryItem;
import com.aliyuncs.reid_cloud.model.v20201029.DescribeCustomerFlowByLocationOfflineResponse.CustomerSummaryItem.CustomerFlow;
import com.aliyuncs.reid_cloud.model.v20201029.DescribeCustomerFlowByLocationOfflineResponse.CustomerSummaryItem.CustomerFlow.CustomerFlowItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomerFlowByLocationOfflineResponseUnmarshaller {

	public static DescribeCustomerFlowByLocationOfflineResponse unmarshall(DescribeCustomerFlowByLocationOfflineResponse describeCustomerFlowByLocationOfflineResponse, UnmarshallerContext _ctx) {
		
		describeCustomerFlowByLocationOfflineResponse.setRequestId(_ctx.stringValue("DescribeCustomerFlowByLocationOfflineResponse.RequestId"));
		describeCustomerFlowByLocationOfflineResponse.setMessage(_ctx.stringValue("DescribeCustomerFlowByLocationOfflineResponse.Message"));
		describeCustomerFlowByLocationOfflineResponse.setDynamicMessage(_ctx.stringValue("DescribeCustomerFlowByLocationOfflineResponse.DynamicMessage"));
		describeCustomerFlowByLocationOfflineResponse.setCode(_ctx.stringValue("DescribeCustomerFlowByLocationOfflineResponse.Code"));
		describeCustomerFlowByLocationOfflineResponse.setSuccess(_ctx.booleanValue("DescribeCustomerFlowByLocationOfflineResponse.Success"));
		describeCustomerFlowByLocationOfflineResponse.setStoreId(_ctx.longValue("DescribeCustomerFlowByLocationOfflineResponse.StoreId"));
		describeCustomerFlowByLocationOfflineResponse.setSummaryDay(_ctx.stringValue("DescribeCustomerFlowByLocationOfflineResponse.SummaryDay"));
		describeCustomerFlowByLocationOfflineResponse.setDynamicCode(_ctx.stringValue("DescribeCustomerFlowByLocationOfflineResponse.DynamicCode"));
		describeCustomerFlowByLocationOfflineResponse.setErrorCode(_ctx.stringValue("DescribeCustomerFlowByLocationOfflineResponse.ErrorCode"));
		describeCustomerFlowByLocationOfflineResponse.setErrorMessage(_ctx.stringValue("DescribeCustomerFlowByLocationOfflineResponse.ErrorMessage"));

		List<CustomerSummaryItem> customerSummary = new ArrayList<CustomerSummaryItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomerFlowByLocationOfflineResponse.CustomerSummary.Length"); i++) {
			CustomerSummaryItem customerSummaryItem = new CustomerSummaryItem();
			customerSummaryItem.setSummaryStartTime(_ctx.longValue("DescribeCustomerFlowByLocationOfflineResponse.CustomerSummary["+ i +"].SummaryStartTime"));
			customerSummaryItem.setSummaryEndTime(_ctx.longValue("DescribeCustomerFlowByLocationOfflineResponse.CustomerSummary["+ i +"].SummaryEndTime"));

			List<CustomerFlow> customerFlows = new ArrayList<CustomerFlow>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCustomerFlowByLocationOfflineResponse.CustomerSummary["+ i +"].CustomerFlows.Length"); j++) {
				CustomerFlow customerFlow = new CustomerFlow();
				customerFlow.setCurrentLocationId(_ctx.longValue("DescribeCustomerFlowByLocationOfflineResponse.CustomerSummary["+ i +"].CustomerFlows["+ j +"].CurrentLocationId"));
				customerFlow.setCount(_ctx.longValue("DescribeCustomerFlowByLocationOfflineResponse.CustomerSummary["+ i +"].CustomerFlows["+ j +"].Count"));

				List<CustomerFlowItem> customerFlowItems = new ArrayList<CustomerFlowItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeCustomerFlowByLocationOfflineResponse.CustomerSummary["+ i +"].CustomerFlows["+ j +"].CustomerFlowItems.Length"); k++) {
					CustomerFlowItem customerFlowItem = new CustomerFlowItem();
					customerFlowItem.setLocationId(_ctx.longValue("DescribeCustomerFlowByLocationOfflineResponse.CustomerSummary["+ i +"].CustomerFlows["+ j +"].CustomerFlowItems["+ k +"].LocationId"));

					List<Long> ukId = new ArrayList<Long>();
					for (int l = 0; l < _ctx.lengthValue("DescribeCustomerFlowByLocationOfflineResponse.CustomerSummary["+ i +"].CustomerFlows["+ j +"].CustomerFlowItems["+ k +"].UkId.Length"); l++) {
						ukId.add(_ctx.longValue("DescribeCustomerFlowByLocationOfflineResponse.CustomerSummary["+ i +"].CustomerFlows["+ j +"].CustomerFlowItems["+ k +"].UkId["+ l +"]"));
					}
					customerFlowItem.setUkId(ukId);

					customerFlowItems.add(customerFlowItem);
				}
				customerFlow.setCustomerFlowItems(customerFlowItems);

				customerFlows.add(customerFlow);
			}
			customerSummaryItem.setCustomerFlows(customerFlows);

			customerSummary.add(customerSummaryItem);
		}
		describeCustomerFlowByLocationOfflineResponse.setCustomerSummary(customerSummary);
	 
	 	return describeCustomerFlowByLocationOfflineResponse;
	}
}