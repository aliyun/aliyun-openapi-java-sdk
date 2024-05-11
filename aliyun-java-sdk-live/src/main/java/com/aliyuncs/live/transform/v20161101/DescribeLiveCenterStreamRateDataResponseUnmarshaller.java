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

import com.aliyuncs.live.model.v20161101.DescribeLiveCenterStreamRateDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveCenterStreamRateDataResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveCenterStreamRateDataResponseUnmarshaller {

	public static DescribeLiveCenterStreamRateDataResponse unmarshall(DescribeLiveCenterStreamRateDataResponse describeLiveCenterStreamRateDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveCenterStreamRateDataResponse.setRequestId(_ctx.stringValue("DescribeLiveCenterStreamRateDataResponse.RequestId"));

		List<Data> rateDatas = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveCenterStreamRateDataResponse.RateDatas.Length"); i++) {
			Data data = new Data();
			data.setVideoFps(_ctx.stringValue("DescribeLiveCenterStreamRateDataResponse.RateDatas["+ i +"].VideoFps"));
			data.setVideoRate(_ctx.stringValue("DescribeLiveCenterStreamRateDataResponse.RateDatas["+ i +"].VideoRate"));
			data.setAudioFps(_ctx.stringValue("DescribeLiveCenterStreamRateDataResponse.RateDatas["+ i +"].AudioFps"));
			data.setAudioRate(_ctx.stringValue("DescribeLiveCenterStreamRateDataResponse.RateDatas["+ i +"].AudioRate"));
			data.setTime(_ctx.stringValue("DescribeLiveCenterStreamRateDataResponse.RateDatas["+ i +"].Time"));

			rateDatas.add(data);
		}
		describeLiveCenterStreamRateDataResponse.setRateDatas(rateDatas);
	 
	 	return describeLiveCenterStreamRateDataResponse;
	}
}