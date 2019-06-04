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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamCountResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamCountResponse.StreamCountInfo;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamCountResponse.StreamCountInfo.StreamCountDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamCountResponseUnmarshaller {

	public static DescribeLiveStreamCountResponse unmarshall(DescribeLiveStreamCountResponse describeLiveStreamCountResponse, UnmarshallerContext context) {
		
		describeLiveStreamCountResponse.setRequestId(context.stringValue("DescribeLiveStreamCountResponse.RequestId"));

		List<StreamCountInfo> streamCountInfos = new ArrayList<StreamCountInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamCountResponse.StreamCountInfos.Length"); i++) {
			StreamCountInfo streamCountInfo = new StreamCountInfo();
			streamCountInfo.setCount(context.longValue("DescribeLiveStreamCountResponse.StreamCountInfos["+ i +"].Count"));
			streamCountInfo.setLimit(context.longValue("DescribeLiveStreamCountResponse.StreamCountInfos["+ i +"].Limit"));
			streamCountInfo.setType(context.stringValue("DescribeLiveStreamCountResponse.StreamCountInfos["+ i +"].Type"));

			List<StreamCountDetail> streamCountDetails = new ArrayList<StreamCountDetail>();
			for (int j = 0; j < context.lengthValue("DescribeLiveStreamCountResponse.StreamCountInfos["+ i +"].StreamCountDetails.Length"); j++) {
				StreamCountDetail streamCountDetail = new StreamCountDetail();
				streamCountDetail.setFormat(context.stringValue("DescribeLiveStreamCountResponse.StreamCountInfos["+ i +"].StreamCountDetails["+ j +"].Format"));
				streamCountDetail.setVideoDataRate(context.longValue("DescribeLiveStreamCountResponse.StreamCountInfos["+ i +"].StreamCountDetails["+ j +"].VideoDataRate"));
				streamCountDetail.setCount(context.longValue("DescribeLiveStreamCountResponse.StreamCountInfos["+ i +"].StreamCountDetails["+ j +"].Count"));

				streamCountDetails.add(streamCountDetail);
			}
			streamCountInfo.setStreamCountDetails(streamCountDetails);

			streamCountInfos.add(streamCountInfo);
		}
		describeLiveStreamCountResponse.setStreamCountInfos(streamCountInfos);
	 
	 	return describeLiveStreamCountResponse;
	}
}