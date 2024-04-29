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

import com.aliyuncs.live.model.v20161101.DescribeLiveGrtnDurationResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveGrtnDurationResponse.StreamData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveGrtnDurationResponseUnmarshaller {

	public static DescribeLiveGrtnDurationResponse unmarshall(DescribeLiveGrtnDurationResponse describeLiveGrtnDurationResponse, UnmarshallerContext _ctx) {
		
		describeLiveGrtnDurationResponse.setRequestId(_ctx.stringValue("DescribeLiveGrtnDurationResponse.RequestId"));

		List<StreamData> streamDetailData = new ArrayList<StreamData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveGrtnDurationResponse.StreamDetailData.Length"); i++) {
			StreamData streamData = new StreamData();
			streamData.setAppId(_ctx.stringValue("DescribeLiveGrtnDurationResponse.StreamDetailData["+ i +"].AppId"));
			streamData.setDuration(_ctx.longValue("DescribeLiveGrtnDurationResponse.StreamDetailData["+ i +"].Duration"));
			streamData.setMediaProfile(_ctx.stringValue("DescribeLiveGrtnDurationResponse.StreamDetailData["+ i +"].MediaProfile"));
			streamData.setMediaType(_ctx.stringValue("DescribeLiveGrtnDurationResponse.StreamDetailData["+ i +"].MediaType"));
			streamData.setTimeStamp(_ctx.stringValue("DescribeLiveGrtnDurationResponse.StreamDetailData["+ i +"].TimeStamp"));

			streamDetailData.add(streamData);
		}
		describeLiveGrtnDurationResponse.setStreamDetailData(streamDetailData);
	 
	 	return describeLiveGrtnDurationResponse;
	}
}