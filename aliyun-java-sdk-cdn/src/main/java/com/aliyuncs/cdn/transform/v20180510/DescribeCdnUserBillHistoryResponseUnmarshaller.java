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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeCdnUserBillHistoryResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnUserBillHistoryResponse.BillHistoryDataItem;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnUserBillHistoryResponse.BillHistoryDataItem.BillingDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnUserBillHistoryResponseUnmarshaller {

	public static DescribeCdnUserBillHistoryResponse unmarshall(DescribeCdnUserBillHistoryResponse describeCdnUserBillHistoryResponse, UnmarshallerContext _ctx) {
		
		describeCdnUserBillHistoryResponse.setRequestId(_ctx.stringValue("DescribeCdnUserBillHistoryResponse.RequestId"));

		List<BillHistoryDataItem> billHistoryData = new ArrayList<BillHistoryDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnUserBillHistoryResponse.BillHistoryData.Length"); i++) {
			BillHistoryDataItem billHistoryDataItem = new BillHistoryDataItem();
			billHistoryDataItem.setDimension(_ctx.stringValue("DescribeCdnUserBillHistoryResponse.BillHistoryData["+ i +"].Dimension"));
			billHistoryDataItem.setBillType(_ctx.stringValue("DescribeCdnUserBillHistoryResponse.BillHistoryData["+ i +"].BillType"));
			billHistoryDataItem.setBillTime(_ctx.stringValue("DescribeCdnUserBillHistoryResponse.BillHistoryData["+ i +"].BillTime"));

			List<BillingDataItem> billingData = new ArrayList<BillingDataItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCdnUserBillHistoryResponse.BillHistoryData["+ i +"].BillingData.Length"); j++) {
				BillingDataItem billingDataItem = new BillingDataItem();
				billingDataItem.setChargeType(_ctx.stringValue("DescribeCdnUserBillHistoryResponse.BillHistoryData["+ i +"].BillingData["+ j +"].ChargeType"));
				billingDataItem.setCdnRegion(_ctx.stringValue("DescribeCdnUserBillHistoryResponse.BillHistoryData["+ i +"].BillingData["+ j +"].CdnRegion"));
				billingDataItem.setBandwidth(_ctx.floatValue("DescribeCdnUserBillHistoryResponse.BillHistoryData["+ i +"].BillingData["+ j +"].Bandwidth"));
				billingDataItem.setFlow(_ctx.floatValue("DescribeCdnUserBillHistoryResponse.BillHistoryData["+ i +"].BillingData["+ j +"].Flow"));
				billingDataItem.setCount(_ctx.floatValue("DescribeCdnUserBillHistoryResponse.BillHistoryData["+ i +"].BillingData["+ j +"].Count"));

				billingData.add(billingDataItem);
			}
			billHistoryDataItem.setBillingData(billingData);

			billHistoryData.add(billHistoryDataItem);
		}
		describeCdnUserBillHistoryResponse.setBillHistoryData(billHistoryData);
	 
	 	return describeCdnUserBillHistoryResponse;
	}
}