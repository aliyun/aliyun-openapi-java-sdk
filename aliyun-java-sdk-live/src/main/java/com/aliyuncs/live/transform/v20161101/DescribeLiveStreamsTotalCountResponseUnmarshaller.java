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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsTotalCountResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsTotalCountResponse.StreamCountInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamsTotalCountResponseUnmarshaller {

	public static DescribeLiveStreamsTotalCountResponse unmarshall(DescribeLiveStreamsTotalCountResponse describeLiveStreamsTotalCountResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamsTotalCountResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamsTotalCountResponse.RequestId"));

		List<StreamCountInfos> streamCountList = new ArrayList<StreamCountInfos>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamsTotalCountResponse.StreamCountList.Length"); i++) {
			StreamCountInfos streamCountInfos = new StreamCountInfos();
			streamCountInfos.setCount(_ctx.integerValue("DescribeLiveStreamsTotalCountResponse.StreamCountList["+ i +"].Count"));
			streamCountInfos.setTimestamp(_ctx.stringValue("DescribeLiveStreamsTotalCountResponse.StreamCountList["+ i +"].Timestamp"));

			streamCountList.add(streamCountInfos);
		}
		describeLiveStreamsTotalCountResponse.setStreamCountList(streamCountList);
	 
	 	return describeLiveStreamsTotalCountResponse;
	}
}