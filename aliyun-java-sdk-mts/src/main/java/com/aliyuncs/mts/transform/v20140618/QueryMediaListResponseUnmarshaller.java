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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.File;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.MediaInfo;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.MediaInfo.Format;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.MediaInfo.Streams;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.MediaInfo.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.MediaInfo.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.MediaInfo.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.MediaInfo.Streams.VideoStream.NetworkCost;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.Play;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.Play.File1;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.Snapshot;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.Snapshot.File3;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.Summary;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.Summary.File2;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMediaListResponseUnmarshaller {

	public static QueryMediaListResponse unmarshall(QueryMediaListResponse queryMediaListResponse, UnmarshallerContext _ctx) {
		
		queryMediaListResponse.setRequestId(_ctx.stringValue("QueryMediaListResponse.RequestId"));

		List<String> nonExistMediaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryMediaListResponse.NonExistMediaIds.Length"); i++) {
			nonExistMediaIds.add(_ctx.stringValue("QueryMediaListResponse.NonExistMediaIds["+ i +"]"));
		}
		queryMediaListResponse.setNonExistMediaIds(nonExistMediaIds);

		List<Media> mediaList = new ArrayList<Media>();
		for (int i = 0; i < _ctx.lengthValue("QueryMediaListResponse.MediaList.Length"); i++) {
			Media media = new Media();
			media.setCreationTime(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].CreationTime"));
			media.setCateId(_ctx.longValue("QueryMediaListResponse.MediaList["+ i +"].CateId"));
			media.setHeight(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Height"));
			media.setCensorState(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].CensorState"));
			media.setBitrate(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Bitrate"));
			media.setMediaId(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaId"));
			media.setPublishState(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PublishState"));
			media.setDescription(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Description"));
			media.setSize(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Size"));
			media.setWidth(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Width"));
			media.setCoverURL(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].CoverURL"));
			media.setDuration(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Duration"));
			media.setFps(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Fps"));
			media.setTitle(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Title"));
			media.setFormat(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Format"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaListResponse.MediaList["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Tags["+ j +"]"));
			}
			media.setTags(tags);

			List<String> runIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaListResponse.MediaList["+ i +"].RunIdList.Length"); j++) {
				runIdList.add(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].RunIdList["+ j +"]"));
			}
			media.setRunIdList(runIdList);

			File file = new File();
			file.setState(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].File.State"));
			file.setURL(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].File.URL"));
			media.setFile(file);

			MediaInfo mediaInfo = new MediaInfo();

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setSar(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setHeight(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setCodecTagString(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setWidth(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setIndex(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setTimebase(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setAvgFPS(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setPixFmt(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLang(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Lang"));
				videoStream.setCodecLongName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setNumFrames(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setRotate(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Rotate"));
				videoStream.setBitrate(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setHasBFrames(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setProfile(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setStartTime(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDar(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setCodecName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setDuration(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setFps(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setCodecTag(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setCodecTimeBase(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setLevel(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Level"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setAvgBitrate(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				networkCost.setCostBandwidth(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setTimebase(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setIndex(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setSampleFmt(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setChannelLayout(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setLang(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Lang"));
				audioStream.setSamplerate(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setCodecLongName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setChannels(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setNumFrames(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setBitrate(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setCodecTagString(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setStartTime(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setCodecName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setDuration(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setCodecTag(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setCodecTimeBase(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecTimeBase"));

				audioStreamList.add(audioStream);
			}
			streams.setAudioStreamList(audioStreamList);

			List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.SubtitleStreamList.Length"); j++) {
				SubtitleStream subtitleStream = new SubtitleStream();
				subtitleStream.setIndex(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.SubtitleStreamList["+ j +"].Index"));
				subtitleStream.setLang(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.SubtitleStreamList["+ j +"].Lang"));

				subtitleStreamList.add(subtitleStream);
			}
			streams.setSubtitleStreamList(subtitleStreamList);
			mediaInfo.setStreams(streams);

			Format format = new Format();
			format.setStartTime(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.StartTime"));
			format.setNumPrograms(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.NumPrograms"));
			format.setSize(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.Size"));
			format.setNumStreams(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.NumStreams"));
			format.setFormatLongName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.FormatLongName"));
			format.setDuration(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.Duration"));
			format.setBitrate(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.Bitrate"));
			format.setFormatName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.FormatName"));
			mediaInfo.setFormat(format);
			media.setMediaInfo(mediaInfo);

			List<Play> playList = new ArrayList<Play>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaListResponse.MediaList["+ i +"].PlayList.Length"); j++) {
				Play play = new Play();
				play.setEncryption(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Encryption"));
				play.setHeight(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Height"));
				play.setBitrate(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Bitrate"));
				play.setMediaWorkflowId(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].MediaWorkflowId"));
				play.setWidth(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Width"));
				play.setSize(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Size"));
				play.setFps(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Fps"));
				play.setDuration(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Duration"));
				play.setActivityName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].ActivityName"));
				play.setFormat(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Format"));
				play.setMediaWorkflowName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].MediaWorkflowName"));

				File1 file1 = new File1();
				file1.setState(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].File.State"));
				file1.setURL(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].File.URL"));
				play.setFile1(file1);

				playList.add(play);
			}
			media.setPlayList(playList);

			List<Summary> summaryList = new ArrayList<Summary>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaListResponse.MediaList["+ i +"].SummaryList.Length"); j++) {
				Summary summary = new Summary();
				summary.setType(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SummaryList["+ j +"].Type"));
				summary.setMediaWorkflowId(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SummaryList["+ j +"].MediaWorkflowId"));
				summary.setActivityName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SummaryList["+ j +"].ActivityName"));
				summary.setMediaWorkflowName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SummaryList["+ j +"].MediaWorkflowName"));

				File2 file2 = new File2();
				file2.setState(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SummaryList["+ j +"].File.State"));
				file2.setURL(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SummaryList["+ j +"].File.URL"));
				summary.setFile2(file2);

				summaryList.add(summary);
			}
			media.setSummaryList(summaryList);

			List<Snapshot> snapshotList = new ArrayList<Snapshot>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList.Length"); j++) {
				Snapshot snapshot = new Snapshot();
				snapshot.setType(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].Type"));
				snapshot.setMediaWorkflowId(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].MediaWorkflowId"));
				snapshot.setActivityName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].ActivityName"));
				snapshot.setCount(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].Count"));
				snapshot.setMediaWorkflowName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].MediaWorkflowName"));

				File3 file3 = new File3();
				file3.setState(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].File.State"));
				file3.setURL(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].File.URL"));
				snapshot.setFile3(file3);

				snapshotList.add(snapshot);
			}
			media.setSnapshotList(snapshotList);

			mediaList.add(media);
		}
		queryMediaListResponse.setMediaList(mediaList);
	 
	 	return queryMediaListResponse;
	}
}