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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.GetVideoPlayAuthResponse;
import com.aliyuncs.vod.model.v20170321.GetVideoPlayAuthResponse.VideoMeta;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVideoPlayAuthResponseUnmarshaller {

	public static GetVideoPlayAuthResponse unmarshall(GetVideoPlayAuthResponse getVideoPlayAuthResponse, UnmarshallerContext _ctx) {
		
		getVideoPlayAuthResponse.setRequestId(_ctx.stringValue("GetVideoPlayAuthResponse.RequestId"));
		getVideoPlayAuthResponse.setPlayAuth(_ctx.stringValue("GetVideoPlayAuthResponse.PlayAuth"));

		VideoMeta videoMeta = new VideoMeta();
		videoMeta.setCoverURL(_ctx.stringValue("GetVideoPlayAuthResponse.VideoMeta.CoverURL"));
		videoMeta.setDuration(_ctx.floatValue("GetVideoPlayAuthResponse.VideoMeta.Duration"));
		videoMeta.setStatus(_ctx.stringValue("GetVideoPlayAuthResponse.VideoMeta.Status"));
		videoMeta.setTitle(_ctx.stringValue("GetVideoPlayAuthResponse.VideoMeta.Title"));
		videoMeta.setVideoId(_ctx.stringValue("GetVideoPlayAuthResponse.VideoMeta.VideoId"));
		getVideoPlayAuthResponse.setVideoMeta(videoMeta);
	 
	 	return getVideoPlayAuthResponse;
	}
}