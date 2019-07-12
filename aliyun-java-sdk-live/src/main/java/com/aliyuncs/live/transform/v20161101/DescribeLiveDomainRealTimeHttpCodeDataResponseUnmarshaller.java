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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainRealTimeHttpCodeDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainRealTimeHttpCodeDataResponse.UsageData;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainRealTimeHttpCodeDataResponse.UsageData.RealTimeCodeProportionData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainRealTimeHttpCodeDataResponseUnmarshaller {

	public static DescribeLiveDomainRealTimeHttpCodeDataResponse unmarshall(DescribeLiveDomainRealTimeHttpCodeDataResponse describeLiveDomainRealTimeHttpCodeDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainRealTimeHttpCodeDataResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainRealTimeHttpCodeDataResponse.RequestId"));
		describeLiveDomainRealTimeHttpCodeDataResponse.setDomainName(_ctx.stringValue("DescribeLiveDomainRealTimeHttpCodeDataResponse.DomainName"));
		describeLiveDomainRealTimeHttpCodeDataResponse.setStartTime(_ctx.stringValue("DescribeLiveDomainRealTimeHttpCodeDataResponse.StartTime"));
		describeLiveDomainRealTimeHttpCodeDataResponse.setEndTime(_ctx.stringValue("DescribeLiveDomainRealTimeHttpCodeDataResponse.EndTime"));
		describeLiveDomainRealTimeHttpCodeDataResponse.setDataInterval(_ctx.stringValue("DescribeLiveDomainRealTimeHttpCodeDataResponse.DataInterval"));

		List<UsageData> realTimeHttpCodeData = new ArrayList<UsageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(_ctx.stringValue("DescribeLiveDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].TimeStamp"));

			List<RealTimeCodeProportionData> value = new ArrayList<RealTimeCodeProportionData>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value.Length"); j++) {
				RealTimeCodeProportionData realTimeCodeProportionData = new RealTimeCodeProportionData();
				realTimeCodeProportionData.setCode(_ctx.stringValue("DescribeLiveDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Code"));
				realTimeCodeProportionData.setProportion(_ctx.stringValue("DescribeLiveDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Proportion"));
				realTimeCodeProportionData.setCount(_ctx.stringValue("DescribeLiveDomainRealTimeHttpCodeDataResponse.RealTimeHttpCodeData["+ i +"].Value["+ j +"].Count"));

				value.add(realTimeCodeProportionData);
			}
			usageData.setValue(value);

			realTimeHttpCodeData.add(usageData);
		}
		describeLiveDomainRealTimeHttpCodeDataResponse.setRealTimeHttpCodeData(realTimeHttpCodeData);
	 
	 	return describeLiveDomainRealTimeHttpCodeDataResponse;
	}
}