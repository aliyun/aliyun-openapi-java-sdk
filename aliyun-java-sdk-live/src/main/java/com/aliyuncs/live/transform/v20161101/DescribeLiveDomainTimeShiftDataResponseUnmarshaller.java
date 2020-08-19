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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainTimeShiftDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainTimeShiftDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainTimeShiftDataResponseUnmarshaller {

	public static DescribeLiveDomainTimeShiftDataResponse unmarshall(DescribeLiveDomainTimeShiftDataResponse describeLiveDomainTimeShiftDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainTimeShiftDataResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainTimeShiftDataResponse.RequestId"));

		List<DataModule> timeShiftData = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainTimeShiftDataResponse.TimeShiftData.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeLiveDomainTimeShiftDataResponse.TimeShiftData["+ i +"].TimeStamp"));
			dataModule.setSize(_ctx.stringValue("DescribeLiveDomainTimeShiftDataResponse.TimeShiftData["+ i +"].Size"));
			dataModule.setType(_ctx.stringValue("DescribeLiveDomainTimeShiftDataResponse.TimeShiftData["+ i +"].Type"));

			timeShiftData.add(dataModule);
		}
		describeLiveDomainTimeShiftDataResponse.setTimeShiftData(timeShiftData);
	 
	 	return describeLiveDomainTimeShiftDataResponse;
	}
}