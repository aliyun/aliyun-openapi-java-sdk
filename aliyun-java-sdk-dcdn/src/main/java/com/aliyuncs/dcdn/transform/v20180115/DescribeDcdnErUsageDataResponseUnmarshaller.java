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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnErUsageDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnErUsageDataResponse.ErAccItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnErUsageDataResponseUnmarshaller {

	public static DescribeDcdnErUsageDataResponse unmarshall(DescribeDcdnErUsageDataResponse describeDcdnErUsageDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnErUsageDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnErUsageDataResponse.RequestId"));
		describeDcdnErUsageDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnErUsageDataResponse.EndTime"));
		describeDcdnErUsageDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnErUsageDataResponse.StartTime"));

		List<ErAccItem> erAccData = new ArrayList<ErAccItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnErUsageDataResponse.ErAccData.Length"); i++) {
			ErAccItem erAccItem = new ErAccItem();
			erAccItem.setErAcc(_ctx.longValue("DescribeDcdnErUsageDataResponse.ErAccData["+ i +"].ErAcc"));
			erAccItem.setTimeStamp(_ctx.stringValue("DescribeDcdnErUsageDataResponse.ErAccData["+ i +"].TimeStamp"));
			erAccItem.setSpec(_ctx.stringValue("DescribeDcdnErUsageDataResponse.ErAccData["+ i +"].Spec"));
			erAccItem.setRoutine(_ctx.stringValue("DescribeDcdnErUsageDataResponse.ErAccData["+ i +"].Routine"));

			erAccData.add(erAccItem);
		}
		describeDcdnErUsageDataResponse.setErAccData(erAccData);
	 
	 	return describeDcdnErUsageDataResponse;
	}
}