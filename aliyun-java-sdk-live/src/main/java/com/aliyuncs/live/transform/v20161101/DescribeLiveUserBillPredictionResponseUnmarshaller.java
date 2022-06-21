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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveUserBillPredictionResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveUserBillPredictionResponse.BillPredictionDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveUserBillPredictionResponseUnmarshaller {

	public static DescribeLiveUserBillPredictionResponse unmarshall(DescribeLiveUserBillPredictionResponse describeLiveUserBillPredictionResponse, UnmarshallerContext _ctx) {
		
		describeLiveUserBillPredictionResponse.setRequestId(_ctx.stringValue("DescribeLiveUserBillPredictionResponse.RequestId"));
		describeLiveUserBillPredictionResponse.setStartTime(_ctx.stringValue("DescribeLiveUserBillPredictionResponse.StartTime"));
		describeLiveUserBillPredictionResponse.setEndTime(_ctx.stringValue("DescribeLiveUserBillPredictionResponse.EndTime"));
		describeLiveUserBillPredictionResponse.setBillType(_ctx.stringValue("DescribeLiveUserBillPredictionResponse.BillType"));

		List<BillPredictionDataItem> billPredictionData = new ArrayList<BillPredictionDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveUserBillPredictionResponse.BillPredictionData.Length"); i++) {
			BillPredictionDataItem billPredictionDataItem = new BillPredictionDataItem();
			billPredictionDataItem.setValue(_ctx.floatValue("DescribeLiveUserBillPredictionResponse.BillPredictionData["+ i +"].Value"));
			billPredictionDataItem.setArea(_ctx.stringValue("DescribeLiveUserBillPredictionResponse.BillPredictionData["+ i +"].Area"));
			billPredictionDataItem.setTimeStp(_ctx.stringValue("DescribeLiveUserBillPredictionResponse.BillPredictionData["+ i +"].TimeStp"));

			billPredictionData.add(billPredictionDataItem);
		}
		describeLiveUserBillPredictionResponse.setBillPredictionData(billPredictionData);
	 
	 	return describeLiveUserBillPredictionResponse;
	}
}