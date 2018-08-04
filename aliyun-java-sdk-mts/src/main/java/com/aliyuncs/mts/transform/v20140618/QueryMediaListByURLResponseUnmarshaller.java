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

import com.aliyuncs.mts.model.v20140618.QueryMediaListByURLResponse;
import com.aliyuncs.mts.model.v20140618.QueryMediaListByURLResponse.Media;
import com.aliyuncs.mts.model.v20140618.QueryMediaListByURLResponse.Media.File;
import com.aliyuncs.mts.model.v20140618.QueryMediaListByURLResponse.Media.MediaInfo;
import com.aliyuncs.mts.model.v20140618.QueryMediaListByURLResponse.Media.MediaInfo.Format;
import com.aliyuncs.mts.model.v20140618.QueryMediaListByURLResponse.Media.MediaInfo.Streams;
import com.aliyuncs.mts.model.v20140618.QueryMediaListByURLResponse.Media.MediaInfo.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.QueryMediaListByURLResponse.Media.MediaInfo.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.QueryMediaListByURLResponse.Media.MediaInfo.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.QueryMediaListByURLResponse.Media.MediaInfo.Streams.VideoStream.NetworkCost;
import com.aliyuncs.mts.model.v20140618.QueryMediaListByURLResponse.Media.Play;
import com.aliyuncs.mts.model.v20140618.QueryMediaListByURLResponse.Media.Play.File1;
import com.aliyuncs.mts.model.v20140618.QueryMediaListByURLResponse.Media.Snapshot;
import com.aliyuncs.mts.model.v20140618.QueryMediaListByURLResponse.Media.Snapshot.File2;
import com.aliyuncs.mts.model.v20140618.QueryMediaListByURLResponse.Media.Summary;
import com.aliyuncs.mts.model.v20140618.QueryMediaListByURLResponse.Media.Summary.File3;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMediaListByURLResponseUnmarshaller {

	public static QueryMediaListByURLResponse unmarshall(QueryMediaListByURLResponse queryMediaListByURLResponse, UnmarshallerContext context) {
		
		queryMediaListByURLResponse.setRequestId(context.stringValue("QueryMediaListByURLResponse.RequestId"));

		List<String> nonExistFileURLs = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryMediaListByURLResponse.NonExistFileURLs.Length"); i++) {
			nonExistFileURLs.add(context.stringValue("QueryMediaListByURLResponse.NonExistFileURLs["+ i +"]"));
		}
		queryMediaListByURLResponse.setNonExistFileURLs(nonExistFileURLs);

		List<Media> mediaList = new ArrayList<Media>();
		for (int i = 0; i < context.lengthValue("QueryMediaListByURLResponse.MediaList.Length"); i++) {
			Media media = new Media();
			media.setMediaId(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaId"));
			media.setTitle(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].Title"));
			media.setDescription(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].Description"));
			media.setCoverURL(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].CoverURL"));
			media.setCateId(context.longValue("QueryMediaListByURLResponse.MediaList["+ i +"].CateId"));
			media.setDuration(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].Duration"));
			media.setFormat(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].Format"));
			media.setSize(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].Size"));
			media.setBitrate(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].Bitrate"));
			media.setWidth(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].Width"));
			media.setHeight(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].Height"));
			media.setFps(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].Fps"));
			media.setPublishState(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].PublishState"));
			media.setCensorState(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].CensorState"));
			media.setCreationTime(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].CreationTime"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryMediaListByURLResponse.MediaList["+ i +"].Tags.Length"); j++) {
				tags.add(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].Tags["+ j +"]"));
			}
			media.setTags(tags);

			List<String> runIdList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryMediaListByURLResponse.MediaList["+ i +"].RunIdList.Length"); j++) {
				runIdList.add(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].RunIdList["+ j +"]"));
			}
			media.setRunIdList(runIdList);

			File file = new File();
			file.setURL(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].File.URL"));
			file.setState(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].File.State"));
			media.setFile(file);

			MediaInfo mediaInfo = new MediaInfo();

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < context.lengthValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setIndex(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setCodecName(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setCodecLongName(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setProfile(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setCodecTimeBase(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setCodecTagString(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setCodecTag(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setWidth(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setHeight(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setHasBFrames(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setSar(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setDar(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setPixFmt(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLevel(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Level"));
				videoStream.setFps(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setAvgFPS(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setTimebase(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setStartTime(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDuration(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setBitrate(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setNumFrames(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setLang(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Lang"));
				videoStream.setRotate(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Rotate"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setCostBandwidth(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				networkCost.setAvgBitrate(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < context.lengthValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setIndex(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setCodecName(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setCodecTimeBase(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecTimeBase"));
				audioStream.setCodecLongName(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setCodecTagString(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setCodecTag(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setSampleFmt(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setSamplerate(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setChannels(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setChannelLayout(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setTimebase(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setStartTime(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setDuration(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setBitrate(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setNumFrames(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setLang(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Lang"));

				audioStreamList.add(audioStream);
			}
			streams.setAudioStreamList(audioStreamList);

			List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
			for (int j = 0; j < context.lengthValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.SubtitleStreamList.Length"); j++) {
				SubtitleStream subtitleStream = new SubtitleStream();
				subtitleStream.setIndex(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.SubtitleStreamList["+ j +"].Index"));
				subtitleStream.setLang(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Streams.SubtitleStreamList["+ j +"].Lang"));

				subtitleStreamList.add(subtitleStream);
			}
			streams.setSubtitleStreamList(subtitleStreamList);
			mediaInfo.setStreams(streams);

			Format format = new Format();
			format.setNumStreams(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Format.NumStreams"));
			format.setNumPrograms(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Format.NumPrograms"));
			format.setFormatName(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Format.FormatName"));
			format.setFormatLongName(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Format.FormatLongName"));
			format.setStartTime(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Format.StartTime"));
			format.setDuration(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Format.Duration"));
			format.setSize(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Format.Size"));
			format.setBitrate(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].MediaInfo.Format.Bitrate"));
			mediaInfo.setFormat(format);
			media.setMediaInfo(mediaInfo);

			List<Play> playList = new ArrayList<Play>();
			for (int j = 0; j < context.lengthValue("QueryMediaListByURLResponse.MediaList["+ i +"].PlayList.Length"); j++) {
				Play play = new Play();
				play.setActivityName(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].PlayList["+ j +"].ActivityName"));
				play.setMediaWorkflowId(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].PlayList["+ j +"].MediaWorkflowId"));
				play.setMediaWorkflowName(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].PlayList["+ j +"].MediaWorkflowName"));
				play.setDuration(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].PlayList["+ j +"].Duration"));
				play.setFormat(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].PlayList["+ j +"].Format"));
				play.setSize(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].PlayList["+ j +"].Size"));
				play.setBitrate(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].PlayList["+ j +"].Bitrate"));
				play.setWidth(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].PlayList["+ j +"].Width"));
				play.setHeight(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].PlayList["+ j +"].Height"));
				play.setFps(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].PlayList["+ j +"].Fps"));
				play.setEncryption(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].PlayList["+ j +"].Encryption"));

				File1 file1 = new File1();
				file1.setURL(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].PlayList["+ j +"].File.URL"));
				file1.setState(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].PlayList["+ j +"].File.State"));
				play.setFile1(file1);

				playList.add(play);
			}
			media.setPlayList(playList);

			List<Snapshot> snapshotList = new ArrayList<Snapshot>();
			for (int j = 0; j < context.lengthValue("QueryMediaListByURLResponse.MediaList["+ i +"].SnapshotList.Length"); j++) {
				Snapshot snapshot = new Snapshot();
				snapshot.setType(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].SnapshotList["+ j +"].Type"));
				snapshot.setMediaWorkflowId(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].SnapshotList["+ j +"].MediaWorkflowId"));
				snapshot.setMediaWorkflowName(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].SnapshotList["+ j +"].MediaWorkflowName"));
				snapshot.setActivityName(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].SnapshotList["+ j +"].ActivityName"));
				snapshot.setCount(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].SnapshotList["+ j +"].Count"));

				File2 file2 = new File2();
				file2.setURL(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].SnapshotList["+ j +"].File.URL"));
				file2.setState(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].SnapshotList["+ j +"].File.State"));
				snapshot.setFile2(file2);

				snapshotList.add(snapshot);
			}
			media.setSnapshotList(snapshotList);

			List<Summary> summaryList = new ArrayList<Summary>();
			for (int j = 0; j < context.lengthValue("QueryMediaListByURLResponse.MediaList["+ i +"].SummaryList.Length"); j++) {
				Summary summary = new Summary();
				summary.setType(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].SummaryList["+ j +"].Type"));
				summary.setMediaWorkflowId(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].SummaryList["+ j +"].MediaWorkflowId"));
				summary.setMediaWorkflowName(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].SummaryList["+ j +"].MediaWorkflowName"));
				summary.setActivityName(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].SummaryList["+ j +"].ActivityName"));

				File3 file3 = new File3();
				file3.setURL(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].SummaryList["+ j +"].File.URL"));
				file3.setState(context.stringValue("QueryMediaListByURLResponse.MediaList["+ i +"].SummaryList["+ j +"].File.State"));
				summary.setFile3(file3);

				summaryList.add(summary);
			}
			media.setSummaryList(summaryList);

			mediaList.add(media);
		}
		queryMediaListByURLResponse.setMediaList(mediaList);
	 
	 	return queryMediaListByURLResponse;
	}
}