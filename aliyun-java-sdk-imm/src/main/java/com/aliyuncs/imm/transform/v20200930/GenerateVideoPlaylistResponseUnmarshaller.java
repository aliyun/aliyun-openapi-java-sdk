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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.GenerateVideoPlaylistResponse;
import com.aliyuncs.imm.model.v20200930.GenerateVideoPlaylistResponse.AudioPlaylistItem;
import com.aliyuncs.imm.model.v20200930.GenerateVideoPlaylistResponse.SubtitlePlaylistItem;
import com.aliyuncs.imm.model.v20200930.GenerateVideoPlaylistResponse.VideoPlaylistItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateVideoPlaylistResponseUnmarshaller {

	public static GenerateVideoPlaylistResponse unmarshall(GenerateVideoPlaylistResponse generateVideoPlaylistResponse, UnmarshallerContext _ctx) {
		
		generateVideoPlaylistResponse.setRequestId(_ctx.stringValue("GenerateVideoPlaylistResponse.RequestId"));
		generateVideoPlaylistResponse.setToken(_ctx.stringValue("GenerateVideoPlaylistResponse.Token"));
		generateVideoPlaylistResponse.setURI(_ctx.stringValue("GenerateVideoPlaylistResponse.URI"));

		List<VideoPlaylistItem> videoPlaylist = new ArrayList<VideoPlaylistItem>();
		for (int i = 0; i < _ctx.lengthValue("GenerateVideoPlaylistResponse.VideoPlaylist.Length"); i++) {
			VideoPlaylistItem videoPlaylistItem = new VideoPlaylistItem();
			videoPlaylistItem.setToken(_ctx.stringValue("GenerateVideoPlaylistResponse.VideoPlaylist["+ i +"].Token"));
			videoPlaylistItem.setURI(_ctx.stringValue("GenerateVideoPlaylistResponse.VideoPlaylist["+ i +"].URI"));

			videoPlaylist.add(videoPlaylistItem);
		}
		generateVideoPlaylistResponse.setVideoPlaylist(videoPlaylist);

		List<AudioPlaylistItem> audioPlaylist = new ArrayList<AudioPlaylistItem>();
		for (int i = 0; i < _ctx.lengthValue("GenerateVideoPlaylistResponse.AudioPlaylist.Length"); i++) {
			AudioPlaylistItem audioPlaylistItem = new AudioPlaylistItem();
			audioPlaylistItem.setToken(_ctx.stringValue("GenerateVideoPlaylistResponse.AudioPlaylist["+ i +"].Token"));
			audioPlaylistItem.setURI(_ctx.stringValue("GenerateVideoPlaylistResponse.AudioPlaylist["+ i +"].URI"));

			audioPlaylist.add(audioPlaylistItem);
		}
		generateVideoPlaylistResponse.setAudioPlaylist(audioPlaylist);

		List<SubtitlePlaylistItem> subtitlePlaylist = new ArrayList<SubtitlePlaylistItem>();
		for (int i = 0; i < _ctx.lengthValue("GenerateVideoPlaylistResponse.SubtitlePlaylist.Length"); i++) {
			SubtitlePlaylistItem subtitlePlaylistItem = new SubtitlePlaylistItem();
			subtitlePlaylistItem.setToken(_ctx.stringValue("GenerateVideoPlaylistResponse.SubtitlePlaylist["+ i +"].Token"));
			subtitlePlaylistItem.setURI(_ctx.stringValue("GenerateVideoPlaylistResponse.SubtitlePlaylist["+ i +"].URI"));
			subtitlePlaylistItem.setLanguage(_ctx.stringValue("GenerateVideoPlaylistResponse.SubtitlePlaylist["+ i +"].Language"));
			subtitlePlaylistItem.setIndex(_ctx.integerValue("GenerateVideoPlaylistResponse.SubtitlePlaylist["+ i +"].Index"));

			subtitlePlaylist.add(subtitlePlaylistItem);
		}
		generateVideoPlaylistResponse.setSubtitlePlaylist(subtitlePlaylist);
	 
	 	return generateVideoPlaylistResponse;
	}
}