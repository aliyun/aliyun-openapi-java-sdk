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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainPushTrafficDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainPushTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainPushTrafficDataResponseUnmarshaller {

	public static DescribeLiveDomainPushTrafficDataResponse unmarshall(DescribeLiveDomainPushTrafficDataResponse describeLiveDomainPushTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainPushTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainPushTrafficDataResponse.RequestId"));
		describeLiveDomainPushTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeLiveDomainPushTrafficDataResponse.DomainName"));
		describeLiveDomainPushTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeLiveDomainPushTrafficDataResponse.StartTime"));
		describeLiveDomainPushTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeLiveDomainPushTrafficDataResponse.EndTime"));
		describeLiveDomainPushTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeLiveDomainPushTrafficDataResponse.DataInterval"));

		List<DataModule> trafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainPushTrafficDataResponse.TrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeLiveDomainPushTrafficDataResponse.TrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setTrafficValue(_ctx.stringValue("DescribeLiveDomainPushTrafficDataResponse.TrafficDataPerInterval["+ i +"].TrafficValue"));

			trafficDataPerInterval.add(dataModule);
		}
		describeLiveDomainPushTrafficDataResponse.setTrafficDataPerInterval(trafficDataPerInterval);
	 
	 	return describeLiveDomainPushTrafficDataResponse;
	}
}