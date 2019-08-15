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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainSrcTrafficDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainSrcTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainSrcTrafficDataResponseUnmarshaller {

	public static DescribeDomainSrcTrafficDataResponse unmarshall(DescribeDomainSrcTrafficDataResponse describeDomainSrcTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainSrcTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeDomainSrcTrafficDataResponse.RequestId"));
		describeDomainSrcTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeDomainSrcTrafficDataResponse.DomainName"));
		describeDomainSrcTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeDomainSrcTrafficDataResponse.StartTime"));
		describeDomainSrcTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeDomainSrcTrafficDataResponse.EndTime"));
		describeDomainSrcTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainSrcTrafficDataResponse.DataInterval"));

		List<DataModule> srcTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainSrcTrafficDataResponse.SrcTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDomainSrcTrafficDataResponse.SrcTrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeDomainSrcTrafficDataResponse.SrcTrafficDataPerInterval["+ i +"].Value"));
			dataModule.setHttpsValue(_ctx.stringValue("DescribeDomainSrcTrafficDataResponse.SrcTrafficDataPerInterval["+ i +"].HttpsValue"));

			srcTrafficDataPerInterval.add(dataModule);
		}
		describeDomainSrcTrafficDataResponse.setSrcTrafficDataPerInterval(srcTrafficDataPerInterval);
	 
	 	return describeDomainSrcTrafficDataResponse;
	}
}