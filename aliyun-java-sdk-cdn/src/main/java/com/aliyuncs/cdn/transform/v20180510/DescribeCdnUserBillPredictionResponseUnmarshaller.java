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

import com.aliyuncs.cdn.model.v20180510.DescribeCdnUserBillPredictionResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnUserBillPredictionResponse.BillPredictionDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnUserBillPredictionResponseUnmarshaller {

	public static DescribeCdnUserBillPredictionResponse unmarshall(DescribeCdnUserBillPredictionResponse describeCdnUserBillPredictionResponse, UnmarshallerContext _ctx) {
		
		describeCdnUserBillPredictionResponse.setRequestId(_ctx.stringValue("DescribeCdnUserBillPredictionResponse.RequestId"));
		describeCdnUserBillPredictionResponse.setStartTime(_ctx.stringValue("DescribeCdnUserBillPredictionResponse.StartTime"));
		describeCdnUserBillPredictionResponse.setEndTime(_ctx.stringValue("DescribeCdnUserBillPredictionResponse.EndTime"));
		describeCdnUserBillPredictionResponse.setBillType(_ctx.stringValue("DescribeCdnUserBillPredictionResponse.BillType"));

		List<BillPredictionDataItem> billPredictionData = new ArrayList<BillPredictionDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnUserBillPredictionResponse.BillPredictionData.Length"); i++) {
			BillPredictionDataItem billPredictionDataItem = new BillPredictionDataItem();
			billPredictionDataItem.setValue(_ctx.floatValue("DescribeCdnUserBillPredictionResponse.BillPredictionData["+ i +"].Value"));
			billPredictionDataItem.setArea(_ctx.stringValue("DescribeCdnUserBillPredictionResponse.BillPredictionData["+ i +"].Area"));
			billPredictionDataItem.setTimeStp(_ctx.stringValue("DescribeCdnUserBillPredictionResponse.BillPredictionData["+ i +"].TimeStp"));

			billPredictionData.add(billPredictionDataItem);
		}
		describeCdnUserBillPredictionResponse.setBillPredictionData(billPredictionData);
	 
	 	return describeCdnUserBillPredictionResponse;
	}
}