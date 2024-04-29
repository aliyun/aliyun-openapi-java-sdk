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

import com.aliyuncs.live.model.v20161101.DescribeLiveProducerUsageDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveProducerUsageDataResponse.BillProducerDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveProducerUsageDataResponseUnmarshaller {

	public static DescribeLiveProducerUsageDataResponse unmarshall(DescribeLiveProducerUsageDataResponse describeLiveProducerUsageDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveProducerUsageDataResponse.setRequestId(_ctx.stringValue("DescribeLiveProducerUsageDataResponse.RequestId"));
		describeLiveProducerUsageDataResponse.setEndTime(_ctx.stringValue("DescribeLiveProducerUsageDataResponse.EndTime"));
		describeLiveProducerUsageDataResponse.setStartTime(_ctx.stringValue("DescribeLiveProducerUsageDataResponse.StartTime"));

		List<BillProducerDataItem> billProducerData = new ArrayList<BillProducerDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveProducerUsageDataResponse.BillProducerData.Length"); i++) {
			BillProducerDataItem billProducerDataItem = new BillProducerDataItem();
			billProducerDataItem.setDomainName(_ctx.stringValue("DescribeLiveProducerUsageDataResponse.BillProducerData["+ i +"].DomainName"));
			billProducerDataItem.setInstance(_ctx.stringValue("DescribeLiveProducerUsageDataResponse.BillProducerData["+ i +"].Instance"));
			billProducerDataItem.setOutputHdDuration(_ctx.longValue("DescribeLiveProducerUsageDataResponse.BillProducerData["+ i +"].OutputHdDuration"));
			billProducerDataItem.setOutputLdDuration(_ctx.longValue("DescribeLiveProducerUsageDataResponse.BillProducerData["+ i +"].OutputLdDuration"));
			billProducerDataItem.setOutputSdDuration(_ctx.longValue("DescribeLiveProducerUsageDataResponse.BillProducerData["+ i +"].OutputSdDuration"));
			billProducerDataItem.setRegion(_ctx.stringValue("DescribeLiveProducerUsageDataResponse.BillProducerData["+ i +"].Region"));
			billProducerDataItem.setTimeStamp(_ctx.stringValue("DescribeLiveProducerUsageDataResponse.BillProducerData["+ i +"].TimeStamp"));
			billProducerDataItem.setTranHdDuration(_ctx.longValue("DescribeLiveProducerUsageDataResponse.BillProducerData["+ i +"].TranHdDuration"));
			billProducerDataItem.setTranLdDuration(_ctx.longValue("DescribeLiveProducerUsageDataResponse.BillProducerData["+ i +"].TranLdDuration"));
			billProducerDataItem.setTranSdDuration(_ctx.longValue("DescribeLiveProducerUsageDataResponse.BillProducerData["+ i +"].TranSdDuration"));
			billProducerDataItem.setType(_ctx.stringValue("DescribeLiveProducerUsageDataResponse.BillProducerData["+ i +"].Type"));

			billProducerData.add(billProducerDataItem);
		}
		describeLiveProducerUsageDataResponse.setBillProducerData(billProducerData);
	 
	 	return describeLiveProducerUsageDataResponse;
	}
}