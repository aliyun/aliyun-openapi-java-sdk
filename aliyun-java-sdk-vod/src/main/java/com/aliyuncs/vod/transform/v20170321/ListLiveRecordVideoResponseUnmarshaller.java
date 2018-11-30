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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListLiveRecordVideoResponse;
import com.aliyuncs.vod.model.v20170321.ListLiveRecordVideoResponse.LiveRecordVideo;
import com.aliyuncs.vod.model.v20170321.ListLiveRecordVideoResponse.LiveRecordVideo.PlayInfo;
import com.aliyuncs.vod.model.v20170321.ListLiveRecordVideoResponse.LiveRecordVideo.Video;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLiveRecordVideoResponseUnmarshaller {

	public static ListLiveRecordVideoResponse unmarshall(ListLiveRecordVideoResponse listLiveRecordVideoResponse, UnmarshallerContext context) {
		
		listLiveRecordVideoResponse.setRequestId(context.stringValue("ListLiveRecordVideoResponse.RequestId"));
		listLiveRecordVideoResponse.setTotal(context.integerValue("ListLiveRecordVideoResponse.Total"));

		List<LiveRecordVideo> liveRecordVideoList = new ArrayList<LiveRecordVideo>();
		for (int i = 0; i < context.lengthValue("ListLiveRecordVideoResponse.LiveRecordVideoList.Length"); i++) {
			LiveRecordVideo liveRecordVideo = new LiveRecordVideo();
			liveRecordVideo.setStreamName(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].StreamName"));
			liveRecordVideo.setDomainName(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].DomainName"));
			liveRecordVideo.setAppName(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].AppName"));
			liveRecordVideo.setPlaylistId(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlaylistId"));
			liveRecordVideo.setRecordStartTime(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].RecordStartTime"));
			liveRecordVideo.setRecordEndTime(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].RecordEndTime"));

			Video video = new Video();
			video.setVideoId(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.VideoId"));
			video.setTitle(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Title"));
			video.setTags(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Tags"));
			video.setStatus(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Status"));
			video.setSize(context.longValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Size"));
			video.setPrivilege(context.integerValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Privilege"));
			video.setDuration(context.floatValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Duration"));
			video.setDescription(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Description"));
			video.setCustomerId(context.longValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.CustomerId"));
			video.setCreateTime(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.CreateTime"));
			video.setCreationTime(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.CreationTime"));
			video.setModifyTime(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.ModifyTime"));
			video.setCoverURL(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.CoverURL"));
			video.setCateId(context.integerValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.CateId"));
			video.setCateName(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.CateName"));
			video.setDownloadSwitch(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.DownloadSwitch"));
			video.setTemplateGroupId(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.TemplateGroupId"));

			List<String> snapshots = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Snapshots.Length"); j++) {
				snapshots.add(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Snapshots["+ j +"]"));
			}
			video.setSnapshots(snapshots);
			liveRecordVideo.setVideo(video);

			List<PlayInfo> playInfoList = new ArrayList<PlayInfo>();
			for (int j = 0; j < context.lengthValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList.Length"); j++) {
				PlayInfo playInfo = new PlayInfo();
				playInfo.setWidth(context.longValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Width"));
				playInfo.setHeight(context.longValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Height"));
				playInfo.setSize(context.longValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Size"));
				playInfo.setPlayURL(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].PlayURL"));
				playInfo.setBitrate(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Bitrate"));
				playInfo.setDefinition(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Definition"));
				playInfo.setDuration(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Duration"));
				playInfo.setFormat(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Format"));
				playInfo.setFps(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Fps"));
				playInfo.setEncrypt(context.longValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Encrypt"));
				playInfo.setPlaintext(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Plaintext"));
				playInfo.setComplexity(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Complexity"));
				playInfo.setStreamType(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].StreamType"));
				playInfo.setRand(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Rand"));
				playInfo.setJobId(context.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].JobId"));

				playInfoList.add(playInfo);
			}
			liveRecordVideo.setPlayInfoList(playInfoList);

			liveRecordVideoList.add(liveRecordVideo);
		}
		listLiveRecordVideoResponse.setLiveRecordVideoList(liveRecordVideoList);
	 
	 	return listLiveRecordVideoResponse;
	}
}