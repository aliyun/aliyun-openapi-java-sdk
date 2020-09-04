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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnBgpBpsDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnBgpBpsDataResponse.BgpData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnBgpBpsDataResponseUnmarshaller {

	public static DescribeDcdnBgpBpsDataResponse unmarshall(DescribeDcdnBgpBpsDataResponse describeDcdnBgpBpsDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnBgpBpsDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnBgpBpsDataResponse.RequestId"));
		describeDcdnBgpBpsDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnBgpBpsDataResponse.StartTime"));
		describeDcdnBgpBpsDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnBgpBpsDataResponse.EndTime"));

		List<BgpData> bgpDataInterval = new ArrayList<BgpData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnBgpBpsDataResponse.BgpDataInterval.Length"); i++) {
			BgpData bgpData = new BgpData();
			bgpData.setIn(_ctx.floatValue("DescribeDcdnBgpBpsDataResponse.BgpDataInterval["+ i +"].In"));
			bgpData.setOut(_ctx.floatValue("DescribeDcdnBgpBpsDataResponse.BgpDataInterval["+ i +"].Out"));
			bgpData.setTimeStamp(_ctx.stringValue("DescribeDcdnBgpBpsDataResponse.BgpDataInterval["+ i +"].TimeStamp"));

			bgpDataInterval.add(bgpData);
		}
		describeDcdnBgpBpsDataResponse.setBgpDataInterval(bgpDataInterval);
	 
	 	return describeDcdnBgpBpsDataResponse;
	}
}