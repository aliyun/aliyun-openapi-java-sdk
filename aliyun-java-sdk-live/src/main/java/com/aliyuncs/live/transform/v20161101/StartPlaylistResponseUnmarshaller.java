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

import com.aliyuncs.live.model.v20161101.StartPlaylistResponse;
import com.aliyuncs.live.model.v20161101.StartPlaylistResponse.StreamInfo;
import com.aliyuncs.live.model.v20161101.StartPlaylistResponse.StreamInfo.Stream;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartPlaylistResponseUnmarshaller {

	public static StartPlaylistResponse unmarshall(StartPlaylistResponse startPlaylistResponse, UnmarshallerContext _ctx) {
		
		startPlaylistResponse.setRequestId(_ctx.stringValue("StartPlaylistResponse.RequestId"));
		startPlaylistResponse.setProgramId(_ctx.stringValue("StartPlaylistResponse.ProgramId"));

		StreamInfo streamInfo = new StreamInfo();
		streamInfo.setDomainName(_ctx.stringValue("StartPlaylistResponse.StreamInfo.DomainName"));
		streamInfo.setAppName(_ctx.stringValue("StartPlaylistResponse.StreamInfo.AppName"));
		streamInfo.setStreamName(_ctx.stringValue("StartPlaylistResponse.StreamInfo.StreamName"));

		List<Stream> streams = new ArrayList<Stream>();
		for (int i = 0; i < _ctx.lengthValue("StartPlaylistResponse.StreamInfo.Streams.Length"); i++) {
			Stream stream = new Stream();
			stream.setPullFlvUrl(_ctx.stringValue("StartPlaylistResponse.StreamInfo.Streams["+ i +"].PullFlvUrl"));
			stream.setPullRtmpUrl(_ctx.stringValue("StartPlaylistResponse.StreamInfo.Streams["+ i +"].PullRtmpUrl"));
			stream.setPullM3U8Url(_ctx.stringValue("StartPlaylistResponse.StreamInfo.Streams["+ i +"].PullM3U8Url"));
			stream.setQuality(_ctx.stringValue("StartPlaylistResponse.StreamInfo.Streams["+ i +"].Quality"));

			streams.add(stream);
		}
		streamInfo.setStreams(streams);
		startPlaylistResponse.setStreamInfo(streamInfo);
	 
	 	return startPlaylistResponse;
	}
}