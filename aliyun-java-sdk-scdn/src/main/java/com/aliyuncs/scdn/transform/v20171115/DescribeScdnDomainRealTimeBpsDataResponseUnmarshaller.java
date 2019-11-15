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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeBpsDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeBpsDataResponse.BpsModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainRealTimeBpsDataResponseUnmarshaller {

	public static DescribeScdnDomainRealTimeBpsDataResponse unmarshall(DescribeScdnDomainRealTimeBpsDataResponse describeScdnDomainRealTimeBpsDataResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainRealTimeBpsDataResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainRealTimeBpsDataResponse.RequestId"));

		List<BpsModel> data = new ArrayList<BpsModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainRealTimeBpsDataResponse.Data.Length"); i++) {
			BpsModel bpsModel = new BpsModel();
			bpsModel.setBps(_ctx.floatValue("DescribeScdnDomainRealTimeBpsDataResponse.Data["+ i +"].Bps"));
			bpsModel.setTimeStamp(_ctx.stringValue("DescribeScdnDomainRealTimeBpsDataResponse.Data["+ i +"].TimeStamp"));

			data.add(bpsModel);
		}
		describeScdnDomainRealTimeBpsDataResponse.setData(data);
	 
	 	return describeScdnDomainRealTimeBpsDataResponse;
	}
}