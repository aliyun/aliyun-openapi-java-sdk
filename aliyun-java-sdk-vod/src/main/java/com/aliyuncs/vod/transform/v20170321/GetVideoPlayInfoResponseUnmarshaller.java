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

import com.aliyuncs.vod.model.v20170321.GetVideoPlayInfoResponse;
import com.aliyuncs.vod.model.v20170321.GetVideoPlayInfoResponse.PlayInfo;
import com.aliyuncs.vod.model.v20170321.GetVideoPlayInfoResponse.VideoInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVideoPlayInfoResponseUnmarshaller {

	public static GetVideoPlayInfoResponse unmarshall(GetVideoPlayInfoResponse getVideoPlayInfoResponse, UnmarshallerContext context) {
		
		getVideoPlayInfoResponse.setRequestId(context.stringValue("GetVideoPlayInfoResponse.RequestId"));

		PlayInfo playInfo = new PlayInfo();
		playInfo.setAccessKeyId(context.stringValue("GetVideoPlayInfoResponse.PlayInfo.AccessKeyId"));
		playInfo.setAccessKeySecret(context.stringValue("GetVideoPlayInfoResponse.PlayInfo.AccessKeySecret"));
		playInfo.setAuthInfo(context.stringValue("GetVideoPlayInfoResponse.PlayInfo.AuthInfo"));
		playInfo.setSecurityToken(context.stringValue("GetVideoPlayInfoResponse.PlayInfo.SecurityToken"));
		playInfo.setRegion(context.stringValue("GetVideoPlayInfoResponse.PlayInfo.Region"));
		playInfo.setPlayDomain(context.stringValue("GetVideoPlayInfoResponse.PlayInfo.PlayDomain"));
		getVideoPlayInfoResponse.setPlayInfo(playInfo);

		VideoInfo videoInfo = new VideoInfo();
		videoInfo.setCoverURL(context.stringValue("GetVideoPlayInfoResponse.VideoInfo.CoverURL"));
		videoInfo.setCustomerId(context.longValue("GetVideoPlayInfoResponse.VideoInfo.CustomerId"));
		videoInfo.setDuration(context.floatValue("GetVideoPlayInfoResponse.VideoInfo.Duration"));
		videoInfo.setStatus(context.stringValue("GetVideoPlayInfoResponse.VideoInfo.Status"));
		videoInfo.setTitle(context.stringValue("GetVideoPlayInfoResponse.VideoInfo.Title"));
		videoInfo.setVideoId(context.stringValue("GetVideoPlayInfoResponse.VideoInfo.VideoId"));
		getVideoPlayInfoResponse.setVideoInfo(videoInfo);
	 
	 	return getVideoPlayInfoResponse;
	}
}