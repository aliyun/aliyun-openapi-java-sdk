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

import com.aliyuncs.live.model.v20161101.DescribeCasterStreamUrlResponse;
import com.aliyuncs.live.model.v20161101.DescribeCasterStreamUrlResponse.CasterStream;
import com.aliyuncs.live.model.v20161101.DescribeCasterStreamUrlResponse.CasterStream.StreamInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasterStreamUrlResponseUnmarshaller {

	public static DescribeCasterStreamUrlResponse unmarshall(DescribeCasterStreamUrlResponse describeCasterStreamUrlResponse, UnmarshallerContext _ctx) {
		
		describeCasterStreamUrlResponse.setRequestId(_ctx.stringValue("DescribeCasterStreamUrlResponse.RequestId"));
		describeCasterStreamUrlResponse.setCasterId(_ctx.stringValue("DescribeCasterStreamUrlResponse.CasterId"));
		describeCasterStreamUrlResponse.setTotal(_ctx.integerValue("DescribeCasterStreamUrlResponse.Total"));

		List<CasterStream> casterStreams = new ArrayList<CasterStream>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasterStreamUrlResponse.CasterStreams.Length"); i++) {
			CasterStream casterStream = new CasterStream();
			casterStream.setSceneId(_ctx.stringValue("DescribeCasterStreamUrlResponse.CasterStreams["+ i +"].SceneId"));
			casterStream.setStreamUrl(_ctx.stringValue("DescribeCasterStreamUrlResponse.CasterStreams["+ i +"].StreamUrl"));
			casterStream.setRtmpUrl(_ctx.stringValue("DescribeCasterStreamUrlResponse.CasterStreams["+ i +"].RtmpUrl"));
			casterStream.setOutputType(_ctx.integerValue("DescribeCasterStreamUrlResponse.CasterStreams["+ i +"].OutputType"));

			List<StreamInfo> streamInfos = new ArrayList<StreamInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCasterStreamUrlResponse.CasterStreams["+ i +"].StreamInfos.Length"); j++) {
				StreamInfo streamInfo = new StreamInfo();
				streamInfo.setTranscodeConfig(_ctx.stringValue("DescribeCasterStreamUrlResponse.CasterStreams["+ i +"].StreamInfos["+ j +"].TranscodeConfig"));
				streamInfo.setVideoFormat(_ctx.stringValue("DescribeCasterStreamUrlResponse.CasterStreams["+ i +"].StreamInfos["+ j +"].VideoFormat"));
				streamInfo.setOutputStreamUrl(_ctx.stringValue("DescribeCasterStreamUrlResponse.CasterStreams["+ i +"].StreamInfos["+ j +"].OutputStreamUrl"));

				streamInfos.add(streamInfo);
			}
			casterStream.setStreamInfos(streamInfos);

			casterStreams.add(casterStream);
		}
		describeCasterStreamUrlResponse.setCasterStreams(casterStreams);
	 
	 	return describeCasterStreamUrlResponse;
	}
}