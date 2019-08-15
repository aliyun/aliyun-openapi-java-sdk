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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainSrcBpsDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainSrcBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainSrcBpsDataResponseUnmarshaller {

	public static DescribeDomainSrcBpsDataResponse unmarshall(DescribeDomainSrcBpsDataResponse describeDomainSrcBpsDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainSrcBpsDataResponse.setRequestId(_ctx.stringValue("DescribeDomainSrcBpsDataResponse.RequestId"));
		describeDomainSrcBpsDataResponse.setDomainName(_ctx.stringValue("DescribeDomainSrcBpsDataResponse.DomainName"));
		describeDomainSrcBpsDataResponse.setStartTime(_ctx.stringValue("DescribeDomainSrcBpsDataResponse.StartTime"));
		describeDomainSrcBpsDataResponse.setEndTime(_ctx.stringValue("DescribeDomainSrcBpsDataResponse.EndTime"));
		describeDomainSrcBpsDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainSrcBpsDataResponse.DataInterval"));

		List<DataModule> srcBpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainSrcBpsDataResponse.SrcBpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDomainSrcBpsDataResponse.SrcBpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeDomainSrcBpsDataResponse.SrcBpsDataPerInterval["+ i +"].Value"));
			dataModule.setHttpsValue(_ctx.stringValue("DescribeDomainSrcBpsDataResponse.SrcBpsDataPerInterval["+ i +"].HttpsValue"));

			srcBpsDataPerInterval.add(dataModule);
		}
		describeDomainSrcBpsDataResponse.setSrcBpsDataPerInterval(srcBpsDataPerInterval);
	 
	 	return describeDomainSrcBpsDataResponse;
	}
}