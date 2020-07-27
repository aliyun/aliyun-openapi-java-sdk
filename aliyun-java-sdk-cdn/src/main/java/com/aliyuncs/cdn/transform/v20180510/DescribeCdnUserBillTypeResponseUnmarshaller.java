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

import com.aliyuncs.cdn.model.v20180510.DescribeCdnUserBillTypeResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnUserBillTypeResponse.BillTypeDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnUserBillTypeResponseUnmarshaller {

	public static DescribeCdnUserBillTypeResponse unmarshall(DescribeCdnUserBillTypeResponse describeCdnUserBillTypeResponse, UnmarshallerContext _ctx) {
		
		describeCdnUserBillTypeResponse.setRequestId(_ctx.stringValue("DescribeCdnUserBillTypeResponse.RequestId"));

		List<BillTypeDataItem> billTypeData = new ArrayList<BillTypeDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnUserBillTypeResponse.BillTypeData.Length"); i++) {
			BillTypeDataItem billTypeDataItem = new BillTypeDataItem();
			billTypeDataItem.setStartTime(_ctx.stringValue("DescribeCdnUserBillTypeResponse.BillTypeData["+ i +"].StartTime"));
			billTypeDataItem.setEndTime(_ctx.stringValue("DescribeCdnUserBillTypeResponse.BillTypeData["+ i +"].EndTime"));
			billTypeDataItem.setProduct(_ctx.stringValue("DescribeCdnUserBillTypeResponse.BillTypeData["+ i +"].Product"));
			billTypeDataItem.setDimension(_ctx.stringValue("DescribeCdnUserBillTypeResponse.BillTypeData["+ i +"].Dimension"));
			billTypeDataItem.setBillType(_ctx.stringValue("DescribeCdnUserBillTypeResponse.BillTypeData["+ i +"].BillType"));
			billTypeDataItem.setBillingCycle(_ctx.stringValue("DescribeCdnUserBillTypeResponse.BillTypeData["+ i +"].BillingCycle"));

			billTypeData.add(billTypeDataItem);
		}
		describeCdnUserBillTypeResponse.setBillTypeData(billTypeData);
	 
	 	return describeCdnUserBillTypeResponse;
	}
}