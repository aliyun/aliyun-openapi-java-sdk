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

import com.aliyuncs.live.model.v20161101.DescribeLivePushProxyUsageDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLivePushProxyUsageDataResponse.PushProxyDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLivePushProxyUsageDataResponseUnmarshaller {

	public static DescribeLivePushProxyUsageDataResponse unmarshall(DescribeLivePushProxyUsageDataResponse describeLivePushProxyUsageDataResponse, UnmarshallerContext _ctx) {
		
		describeLivePushProxyUsageDataResponse.setRequestId(_ctx.stringValue("DescribeLivePushProxyUsageDataResponse.RequestId"));
		describeLivePushProxyUsageDataResponse.setEndTime(_ctx.stringValue("DescribeLivePushProxyUsageDataResponse.EndTime"));
		describeLivePushProxyUsageDataResponse.setStartTime(_ctx.stringValue("DescribeLivePushProxyUsageDataResponse.StartTime"));

		List<PushProxyDataItem> pushProxyData = new ArrayList<PushProxyDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLivePushProxyUsageDataResponse.PushProxyData.Length"); i++) {
			PushProxyDataItem pushProxyDataItem = new PushProxyDataItem();
			pushProxyDataItem.setTimeStamp(_ctx.stringValue("DescribeLivePushProxyUsageDataResponse.PushProxyData["+ i +"].TimeStamp"));
			pushProxyDataItem.setStreamCount(_ctx.longValue("DescribeLivePushProxyUsageDataResponse.PushProxyData["+ i +"].StreamCount"));
			pushProxyDataItem.setDomainName(_ctx.stringValue("DescribeLivePushProxyUsageDataResponse.PushProxyData["+ i +"].DomainName"));
			pushProxyDataItem.setRegion(_ctx.stringValue("DescribeLivePushProxyUsageDataResponse.PushProxyData["+ i +"].Region"));

			pushProxyData.add(pushProxyDataItem);
		}
		describeLivePushProxyUsageDataResponse.setPushProxyData(pushProxyData);
	 
	 	return describeLivePushProxyUsageDataResponse;
	}
}