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

import com.aliyuncs.live.model.v20161101.DescribeLiveDetectPornDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDetectPornDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDetectPornDataResponseUnmarshaller {

	public static DescribeLiveDetectPornDataResponse unmarshall(DescribeLiveDetectPornDataResponse describeLiveDetectPornDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveDetectPornDataResponse.setRequestId(_ctx.stringValue("DescribeLiveDetectPornDataResponse.RequestId"));

		List<DataModule> detectPornData = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDetectPornDataResponse.DetectPornData.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeLiveDetectPornDataResponse.DetectPornData["+ i +"].TimeStamp"));
			dataModule.setApp(_ctx.stringValue("DescribeLiveDetectPornDataResponse.DetectPornData["+ i +"].App"));
			dataModule.setDomain(_ctx.stringValue("DescribeLiveDetectPornDataResponse.DetectPornData["+ i +"].Domain"));
			dataModule.setStream(_ctx.stringValue("DescribeLiveDetectPornDataResponse.DetectPornData["+ i +"].Stream"));
			dataModule.setFee(_ctx.stringValue("DescribeLiveDetectPornDataResponse.DetectPornData["+ i +"].Fee"));
			dataModule.setScene(_ctx.stringValue("DescribeLiveDetectPornDataResponse.DetectPornData["+ i +"].Scene"));
			dataModule.setRegion(_ctx.stringValue("DescribeLiveDetectPornDataResponse.DetectPornData["+ i +"].Region"));
			dataModule.setCount(_ctx.longValue("DescribeLiveDetectPornDataResponse.DetectPornData["+ i +"].Count"));

			detectPornData.add(dataModule);
		}
		describeLiveDetectPornDataResponse.setDetectPornData(detectPornData);
	 
	 	return describeLiveDetectPornDataResponse;
	}
}