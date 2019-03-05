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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeBpsDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRealTimeBpsDataResponse.BpsModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainRealTimeBpsDataResponseUnmarshaller {

	public static DescribeDcdnDomainRealTimeBpsDataResponse unmarshall(DescribeDcdnDomainRealTimeBpsDataResponse describeDcdnDomainRealTimeBpsDataResponse, UnmarshallerContext context) {
		
		describeDcdnDomainRealTimeBpsDataResponse.setRequestId(context.stringValue("DescribeDcdnDomainRealTimeBpsDataResponse.RequestId"));

		List<BpsModel> data = new ArrayList<BpsModel>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainRealTimeBpsDataResponse.Data.Length"); i++) {
			BpsModel bpsModel = new BpsModel();
			bpsModel.setBps(context.floatValue("DescribeDcdnDomainRealTimeBpsDataResponse.Data["+ i +"].Bps"));
			bpsModel.setTimeStamp(context.stringValue("DescribeDcdnDomainRealTimeBpsDataResponse.Data["+ i +"].TimeStamp"));

			data.add(bpsModel);
		}
		describeDcdnDomainRealTimeBpsDataResponse.setData(data);
	 
	 	return describeDcdnDomainRealTimeBpsDataResponse;
	}
}