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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserBillTypeResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserBillTypeResponse.BillTypeDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnUserBillTypeResponseUnmarshaller {

	public static DescribeDcdnUserBillTypeResponse unmarshall(DescribeDcdnUserBillTypeResponse describeDcdnUserBillTypeResponse, UnmarshallerContext _ctx) {
		
		describeDcdnUserBillTypeResponse.setRequestId(_ctx.stringValue("DescribeDcdnUserBillTypeResponse.RequestId"));

		List<BillTypeDataItem> billTypeData = new ArrayList<BillTypeDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnUserBillTypeResponse.BillTypeData.Length"); i++) {
			BillTypeDataItem billTypeDataItem = new BillTypeDataItem();
			billTypeDataItem.setStartTime(_ctx.stringValue("DescribeDcdnUserBillTypeResponse.BillTypeData["+ i +"].StartTime"));
			billTypeDataItem.setEndTime(_ctx.stringValue("DescribeDcdnUserBillTypeResponse.BillTypeData["+ i +"].EndTime"));
			billTypeDataItem.setProduct(_ctx.stringValue("DescribeDcdnUserBillTypeResponse.BillTypeData["+ i +"].Product"));
			billTypeDataItem.setDimension(_ctx.stringValue("DescribeDcdnUserBillTypeResponse.BillTypeData["+ i +"].Dimension"));
			billTypeDataItem.setBillType(_ctx.stringValue("DescribeDcdnUserBillTypeResponse.BillTypeData["+ i +"].BillType"));
			billTypeDataItem.setBillingCycle(_ctx.stringValue("DescribeDcdnUserBillTypeResponse.BillTypeData["+ i +"].BillingCycle"));

			billTypeData.add(billTypeDataItem);
		}
		describeDcdnUserBillTypeResponse.setBillTypeData(billTypeData);
	 
	 	return describeDcdnUserBillTypeResponse;
	}
}