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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLiveRecordVideoResponseUnmarshaller {

	public static ListLiveRecordVideoResponse unmarshall(ListLiveRecordVideoResponse listLiveRecordVideoResponse, UnmarshallerContext _ctx) {
		
		listLiveRecordVideoResponse.setRequestId(_ctx.stringValue("ListLiveRecordVideoResponse.RequestId"));
		listLiveRecordVideoResponse.setTotal(_ctx.integerValue("ListLiveRecordVideoResponse.Total"));

		List<LiveRecordVideo> liveRecordVideoList = new ArrayList<LiveRecordVideo>();
		for (int i = 0; i < _ctx.lengthValue("ListLiveRecordVideoResponse.LiveRecordVideoList.Length"); i++) {
			LiveRecordVideo liveRecordVideo = new LiveRecordVideo();
			liveRecordVideo.setStreamName(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].StreamName"));
			liveRecordVideo.setDomainName(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].DomainName"));
			liveRecordVideo.setAppName(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].AppName"));
			liveRecordVideo.setPlaylistId(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlaylistId"));
			liveRecordVideo.setRecordStartTime(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].RecordStartTime"));
			liveRecordVideo.setRecordEndTime(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].RecordEndTime"));

			Video video = new Video();
			video.setVideoId(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.VideoId"));
			video.setTitle(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Title"));
			video.setTags(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Tags"));
			video.setStatus(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Status"));
			video.setSize(_ctx.longValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Size"));
			video.setPrivilege(_ctx.integerValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Privilege"));
			video.setDuration(_ctx.floatValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Duration"));
			video.setDescription(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Description"));
			video.setCustomerId(_ctx.longValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.CustomerId"));
			video.setCreateTime(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.CreateTime"));
			video.setCreationTime(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.CreationTime"));
			video.setModifyTime(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.ModifyTime"));
			video.setCoverURL(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.CoverURL"));
			video.setCateId(_ctx.integerValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.CateId"));
			video.setCateName(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.CateName"));
			video.setDownloadSwitch(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.DownloadSwitch"));
			video.setTemplateGroupId(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.TemplateGroupId"));

			List<String> snapshots = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Snapshots.Length"); j++) {
				snapshots.add(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].Video.Snapshots["+ j +"]"));
			}
			video.setSnapshots(snapshots);
			liveRecordVideo.setVideo(video);

			List<PlayInfo> playInfoList = new ArrayList<PlayInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList.Length"); j++) {
				PlayInfo playInfo = new PlayInfo();
				playInfo.setWidth(_ctx.longValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Width"));
				playInfo.setHeight(_ctx.longValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Height"));
				playInfo.setSize(_ctx.longValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Size"));
				playInfo.setPlayURL(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].PlayURL"));
				playInfo.setBitrate(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Bitrate"));
				playInfo.setDefinition(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Definition"));
				playInfo.setDuration(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Duration"));
				playInfo.setFormat(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Format"));
				playInfo.setFps(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Fps"));
				playInfo.setEncrypt(_ctx.longValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Encrypt"));
				playInfo.setPlaintext(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Plaintext"));
				playInfo.setComplexity(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Complexity"));
				playInfo.setStreamType(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].StreamType"));
				playInfo.setRand(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].Rand"));
				playInfo.setJobId(_ctx.stringValue("ListLiveRecordVideoResponse.LiveRecordVideoList["+ i +"].PlayInfoList["+ j +"].JobId"));

				playInfoList.add(playInfo);
			}
			liveRecordVideo.setPlayInfoList(playInfoList);

			liveRecordVideoList.add(liveRecordVideo);
		}
		listLiveRecordVideoResponse.setLiveRecordVideoList(liveRecordVideoList);
	 
	 	return listLiveRecordVideoResponse;
	}
}