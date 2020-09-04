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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnBgpTrafficDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnBgpTrafficDataResponse.BgpData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnBgpTrafficDataResponseUnmarshaller {

	public static DescribeDcdnBgpTrafficDataResponse unmarshall(DescribeDcdnBgpTrafficDataResponse describeDcdnBgpTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnBgpTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnBgpTrafficDataResponse.RequestId"));
		describeDcdnBgpTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnBgpTrafficDataResponse.StartTime"));
		describeDcdnBgpTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnBgpTrafficDataResponse.EndTime"));

		List<BgpData> bgpDataInterval = new ArrayList<BgpData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnBgpTrafficDataResponse.BgpDataInterval.Length"); i++) {
			BgpData bgpData = new BgpData();
			bgpData.setIn(_ctx.longValue("DescribeDcdnBgpTrafficDataResponse.BgpDataInterval["+ i +"].In"));
			bgpData.setOut(_ctx.longValue("DescribeDcdnBgpTrafficDataResponse.BgpDataInterval["+ i +"].Out"));
			bgpData.setTimeStamp(_ctx.stringValue("DescribeDcdnBgpTrafficDataResponse.BgpDataInterval["+ i +"].TimeStamp"));

			bgpDataInterval.add(bgpData);
		}
		describeDcdnBgpTrafficDataResponse.setBgpDataInterval(bgpDataInterval);
	 
	 	return describeDcdnBgpTrafficDataResponse;
	}
}