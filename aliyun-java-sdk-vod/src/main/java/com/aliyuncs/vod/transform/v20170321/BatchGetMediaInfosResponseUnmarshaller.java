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

import com.aliyuncs.vod.model.v20170321.BatchGetMediaInfosResponse;
import com.aliyuncs.vod.model.v20170321.BatchGetMediaInfosResponse.MediaBasicInfo;
import com.aliyuncs.vod.model.v20170321.BatchGetMediaInfosResponse.MediaBasicInfo.MediaInfo;
import com.aliyuncs.vod.model.v20170321.BatchGetMediaInfosResponse.MediaBasicInfo.MezzanineInfo;
import com.aliyuncs.vod.model.v20170321.BatchGetMediaInfosResponse.MediaBasicInfo.MezzanineInfo.AudioStream;
import com.aliyuncs.vod.model.v20170321.BatchGetMediaInfosResponse.MediaBasicInfo.MezzanineInfo.VideoStream;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetMediaInfosResponseUnmarshaller {

	public static BatchGetMediaInfosResponse unmarshall(BatchGetMediaInfosResponse batchGetMediaInfosResponse, UnmarshallerContext _ctx) {
		
		batchGetMediaInfosResponse.setRequestId(_ctx.stringValue("BatchGetMediaInfosResponse.RequestId"));

		List<String> nonExistMediaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetMediaInfosResponse.NonExistMediaIds.Length"); i++) {
			nonExistMediaIds.add(_ctx.stringValue("BatchGetMediaInfosResponse.NonExistMediaIds["+ i +"]"));
		}
		batchGetMediaInfosResponse.setNonExistMediaIds(nonExistMediaIds);

		List<String> forbiddenMediaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetMediaInfosResponse.ForbiddenMediaIds.Length"); i++) {
			forbiddenMediaIds.add(_ctx.stringValue("BatchGetMediaInfosResponse.ForbiddenMediaIds["+ i +"]"));
		}
		batchGetMediaInfosResponse.setForbiddenMediaIds(forbiddenMediaIds);

		List<MediaBasicInfo> mediaInfos = new ArrayList<MediaBasicInfo>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetMediaInfosResponse.MediaInfos.Length"); i++) {
			MediaBasicInfo mediaBasicInfo = new MediaBasicInfo();
			mediaBasicInfo.setMediaId(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaId"));

			MediaInfo mediaInfo = new MediaInfo();
			mediaInfo.setStorageLocation(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.StorageLocation"));
			mediaInfo.setCreationTime(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.CreationTime"));
			mediaInfo.setStatus(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.Status"));
			mediaInfo.setCateId(_ctx.longValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.CateId"));
			mediaInfo.setMediaId(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.MediaId"));
			mediaInfo.setDownloadSwitch(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.DownloadSwitch"));
			mediaInfo.setTags(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.Tags"));
			mediaInfo.setModificationTime(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.ModificationTime"));
			mediaInfo.setRegionId(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.RegionId"));
			mediaInfo.setCateName(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.CateName"));
			mediaInfo.setDescription(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.Description"));
			mediaInfo.setPreprocessStatus(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.PreprocessStatus"));
			mediaInfo.setAppId(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.AppId"));
			mediaInfo.setCoverURL(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.CoverURL"));
			mediaInfo.setTemplateGroupId(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.TemplateGroupId"));
			mediaInfo.setTitle(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.Title"));
			mediaInfo.setStorageClass(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.StorageClass"));
			mediaInfo.setRestoreStatus(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.RestoreStatus"));
			mediaInfo.setRestoreExpiration(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.RestoreExpiration"));
			mediaInfo.setUserData(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.UserData"));

			List<String> snapshots = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.Snapshots.Length"); j++) {
				snapshots.add(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MediaInfo.Snapshots["+ j +"]"));
			}
			mediaInfo.setSnapshots(snapshots);
			mediaBasicInfo.setMediaInfo(mediaInfo);

			MezzanineInfo mezzanineInfo = new MezzanineInfo();
			mezzanineInfo.setCreationTime(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.CreationTime"));
			mezzanineInfo.setStatus(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.Status"));
			mezzanineInfo.setFileURL(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.FileURL"));
			mezzanineInfo.setMediaId(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.MediaId"));
			mezzanineInfo.setHeight(_ctx.longValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.Height"));
			mezzanineInfo.setBitrate(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.Bitrate"));
			mezzanineInfo.setFileName(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.FileName"));
			mezzanineInfo.setWidth(_ctx.longValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.Width"));
			mezzanineInfo.setSize(_ctx.longValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.Size"));
			mezzanineInfo.setCRC64(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.CRC64"));
			mezzanineInfo.setDuration(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.Duration"));
			mezzanineInfo.setFps(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.Fps"));

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < _ctx.lengthValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setIndex(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList["+ j +"].Index"));
				audioStream.setTimebase(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList["+ j +"].Timebase"));
				audioStream.setSampleFmt(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setSampleRate(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList["+ j +"].SampleRate"));
				audioStream.setChannelLayout(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setLang(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList["+ j +"].Lang"));
				audioStream.setCodecLongName(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setChannels(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList["+ j +"].Channels"));
				audioStream.setNumFrames(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setBitrate(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setCodecTagString(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setStartTime(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList["+ j +"].StartTime"));
				audioStream.setCodecName(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList["+ j +"].CodecName"));
				audioStream.setDuration(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList["+ j +"].Duration"));
				audioStream.setCodecTag(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setCodecTimeBase(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.AudioStreamList["+ j +"].CodecTimeBase"));

				audioStreamList.add(audioStream);
			}
			mezzanineInfo.setAudioStreamList(audioStreamList);

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < _ctx.lengthValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setTimebase(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].Timebase"));
				videoStream.setIndex(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].Index"));
				videoStream.setAvgFPS(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setPixFmt(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLang(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].Lang"));
				videoStream.setSar(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].Sar"));
				videoStream.setHeight(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].Height"));
				videoStream.setCodecLongName(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setNumFrames(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setBitrate(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setRotate(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].Rotate"));
				videoStream.setCodecTagString(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setHasBFrames(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setProfile(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].Profile"));
				videoStream.setStartTime(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDar(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].Dar"));
				videoStream.setCodecName(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].CodecName"));
				videoStream.setWidth(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].Width"));
				videoStream.setDuration(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].Duration"));
				videoStream.setFps(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].Fps"));
				videoStream.setCodecTag(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setCodecTimeBase(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setLevel(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].Level"));
				videoStream.setHDRType(_ctx.stringValue("BatchGetMediaInfosResponse.MediaInfos["+ i +"].MezzanineInfo.VideoStreamList["+ j +"].HDRType"));

				videoStreamList.add(videoStream);
			}
			mezzanineInfo.setVideoStreamList(videoStreamList);
			mediaBasicInfo.setMezzanineInfo(mezzanineInfo);

			mediaInfos.add(mediaBasicInfo);
		}
		batchGetMediaInfosResponse.setMediaInfos(mediaInfos);
	 
	 	return batchGetMediaInfosResponse;
	}
}