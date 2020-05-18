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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainPushBpsDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainPushBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainPushBpsDataResponseUnmarshaller {

	public static DescribeLiveDomainPushBpsDataResponse unmarshall(DescribeLiveDomainPushBpsDataResponse describeLiveDomainPushBpsDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainPushBpsDataResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainPushBpsDataResponse.RequestId"));
		describeLiveDomainPushBpsDataResponse.setDomainName(_ctx.stringValue("DescribeLiveDomainPushBpsDataResponse.DomainName"));
		describeLiveDomainPushBpsDataResponse.setStartTime(_ctx.stringValue("DescribeLiveDomainPushBpsDataResponse.StartTime"));
		describeLiveDomainPushBpsDataResponse.setEndTime(_ctx.stringValue("DescribeLiveDomainPushBpsDataResponse.EndTime"));
		describeLiveDomainPushBpsDataResponse.setDataInterval(_ctx.stringValue("DescribeLiveDomainPushBpsDataResponse.DataInterval"));

		List<DataModule> bpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainPushBpsDataResponse.BpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeLiveDomainPushBpsDataResponse.BpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setBpsValue(_ctx.stringValue("DescribeLiveDomainPushBpsDataResponse.BpsDataPerInterval["+ i +"].BpsValue"));

			bpsDataPerInterval.add(dataModule);
		}
		describeLiveDomainPushBpsDataResponse.setBpsDataPerInterval(bpsDataPerInterval);
	 
	 	return describeLiveDomainPushBpsDataResponse;
	}
}