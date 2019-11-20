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
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.Snapshot.File2;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.Summary;
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.Summary.File3;
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
			media.setMediaId(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaId"));
			media.setTitle(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Title"));
			media.setDescription(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Description"));
			media.setCoverURL(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].CoverURL"));
			media.setCateId(_ctx.longValue("QueryMediaListResponse.MediaList["+ i +"].CateId"));
			media.setDuration(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Duration"));
			media.setFormat(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Format"));
			media.setSize(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Size"));
			media.setBitrate(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Bitrate"));
			media.setWidth(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Width"));
			media.setHeight(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Height"));
			media.setFps(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].Fps"));
			media.setPublishState(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PublishState"));
			media.setCensorState(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].CensorState"));
			media.setCreationTime(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].CreationTime"));

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
			file.setURL(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].File.URL"));
			file.setState(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].File.State"));
			media.setFile(file);

			MediaInfo mediaInfo = new MediaInfo();

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setIndex(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setCodecName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setCodecLongName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setProfile(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setCodecTimeBase(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setCodecTagString(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setCodecTag(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setWidth(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setHeight(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setHasBFrames(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setSar(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setDar(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setPixFmt(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLevel(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Level"));
				videoStream.setFps(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setAvgFPS(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setTimebase(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setStartTime(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDuration(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setBitrate(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setNumFrames(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setLang(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Lang"));
				videoStream.setRotate(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Rotate"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setCostBandwidth(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				networkCost.setAvgBitrate(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setIndex(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setCodecName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setCodecTimeBase(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecTimeBase"));
				audioStream.setCodecLongName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setCodecTagString(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setCodecTag(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setSampleFmt(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setSamplerate(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setChannels(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setChannelLayout(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setTimebase(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setStartTime(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setDuration(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setBitrate(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setNumFrames(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setLang(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Lang"));

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
			format.setNumStreams(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.NumStreams"));
			format.setNumPrograms(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.NumPrograms"));
			format.setFormatName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.FormatName"));
			format.setFormatLongName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.FormatLongName"));
			format.setStartTime(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.StartTime"));
			format.setDuration(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.Duration"));
			format.setSize(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.Size"));
			format.setBitrate(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.Bitrate"));
			mediaInfo.setFormat(format);
			media.setMediaInfo(mediaInfo);

			List<Play> playList = new ArrayList<Play>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaListResponse.MediaList["+ i +"].PlayList.Length"); j++) {
				Play play = new Play();
				play.setActivityName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].ActivityName"));
				play.setMediaWorkflowId(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].MediaWorkflowId"));
				play.setMediaWorkflowName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].MediaWorkflowName"));
				play.setDuration(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Duration"));
				play.setFormat(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Format"));
				play.setSize(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Size"));
				play.setBitrate(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Bitrate"));
				play.setWidth(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Width"));
				play.setHeight(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Height"));
				play.setFps(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Fps"));
				play.setEncryption(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Encryption"));

				File1 file1 = new File1();
				file1.setURL(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].File.URL"));
				file1.setState(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].File.State"));
				play.setFile1(file1);

				playList.add(play);
			}
			media.setPlayList(playList);

			List<Snapshot> snapshotList = new ArrayList<Snapshot>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList.Length"); j++) {
				Snapshot snapshot = new Snapshot();
				snapshot.setType(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].Type"));
				snapshot.setMediaWorkflowId(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].MediaWorkflowId"));
				snapshot.setMediaWorkflowName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].MediaWorkflowName"));
				snapshot.setActivityName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].ActivityName"));
				snapshot.setCount(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].Count"));

				File2 file2 = new File2();
				file2.setURL(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].File.URL"));
				file2.setState(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].File.State"));
				snapshot.setFile2(file2);

				snapshotList.add(snapshot);
			}
			media.setSnapshotList(snapshotList);

			List<Summary> summaryList = new ArrayList<Summary>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaListResponse.MediaList["+ i +"].SummaryList.Length"); j++) {
				Summary summary = new Summary();
				summary.setType(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SummaryList["+ j +"].Type"));
				summary.setMediaWorkflowId(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SummaryList["+ j +"].MediaWorkflowId"));
				summary.setMediaWorkflowName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SummaryList["+ j +"].MediaWorkflowName"));
				summary.setActivityName(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SummaryList["+ j +"].ActivityName"));

				File3 file3 = new File3();
				file3.setURL(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SummaryList["+ j +"].File.URL"));
				file3.setState(_ctx.stringValue("QueryMediaListResponse.MediaList["+ i +"].SummaryList["+ j +"].File.State"));
				summary.setFile3(file3);

				summaryList.add(summary);
			}
			media.setSummaryList(summaryList);

			mediaList.add(media);
		}
		queryMediaListResponse.setMediaList(mediaList);
	 
	 	return queryMediaListResponse;
	}
}