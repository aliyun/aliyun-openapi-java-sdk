/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
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
import com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMediaListResponseUnmarshaller {

	public static QueryMediaListResponse unmarshall(QueryMediaListResponse queryMediaListResponse, UnmarshallerContext context) {
		
		queryMediaListResponse.setRequestId(context.stringValue("QueryMediaListResponse.RequestId"));

		List<String> nonExistMediaIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryMediaListResponse.NonExistMediaIds.Length"); i++) {
			nonExistMediaIds.add(context.stringValue("QueryMediaListResponse.NonExistMediaIds["+ i +"]"));
		}
		queryMediaListResponse.setNonExistMediaIds(nonExistMediaIds);

		List<Media> mediaList = new ArrayList<Media>();
		for (int i = 0; i < context.lengthValue("QueryMediaListResponse.MediaList.Length"); i++) {
			Media media = new Media();
			media.setMediaId(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaId"));
			media.setTitle(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].Title"));
			media.setDescription(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].Description"));
			media.setCoverURL(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].CoverURL"));
			media.setCateId(context.longValue("QueryMediaListResponse.MediaList["+ i +"].CateId"));
			media.setDuration(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].Duration"));
			media.setFormat(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].Format"));
			media.setSize(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].Size"));
			media.setBitrate(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].Bitrate"));
			media.setWidth(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].Width"));
			media.setHeight(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].Height"));
			media.setFps(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].Fps"));
			media.setPublishState(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].PublishState"));
			media.setCreationTime(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].CreationTime"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryMediaListResponse.MediaList["+ i +"].Tags.Length"); j++) {
				tags.add(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].Tags["+ j +"]"));
			}
			media.setTags(tags);

			List<String> runIdList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryMediaListResponse.MediaList["+ i +"].RunIdList.Length"); j++) {
				runIdList.add(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].RunIdList["+ j +"]"));
			}
			media.setRunIdList(runIdList);

			File file = new File();
			file.setURL(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].File.URL"));
			file.setState(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].File.State"));
			media.setFile(file);

			MediaInfo mediaInfo = new MediaInfo();

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < context.lengthValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setIndex(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setCodecName(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setCodecLongName(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setProfile(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setCodecTimeBase(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setCodecTagString(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setCodecTag(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setWidth(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setHeight(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setHasBFrames(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setSar(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setDar(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setPixFmt(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLevel(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Level"));
				videoStream.setFps(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setAvgFPS(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setTimebase(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setStartTime(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDuration(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setBitrate(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setNumFrames(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setLang(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Lang"));
				videoStream.setRotate(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Rotate"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setCostBandwidth(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				networkCost.setAvgBitrate(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < context.lengthValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setIndex(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setCodecName(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setCodecTimeBase(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecTimeBase"));
				audioStream.setCodecLongName(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setCodecTagString(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setCodecTag(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setSampleFmt(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setSamplerate(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setChannels(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setChannelLayout(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setTimebase(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setStartTime(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setDuration(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setBitrate(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setNumFrames(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setLang(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Lang"));

				audioStreamList.add(audioStream);
			}
			streams.setAudioStreamList(audioStreamList);

			List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
			for (int j = 0; j < context.lengthValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.SubtitleStreamList.Length"); j++) {
				SubtitleStream subtitleStream = new SubtitleStream();
				subtitleStream.setIndex(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.SubtitleStreamList["+ j +"].Index"));
				subtitleStream.setLang(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Streams.SubtitleStreamList["+ j +"].Lang"));

				subtitleStreamList.add(subtitleStream);
			}
			streams.setSubtitleStreamList(subtitleStreamList);
			mediaInfo.setStreams(streams);

			Format format = new Format();
			format.setNumStreams(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.NumStreams"));
			format.setNumPrograms(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.NumPrograms"));
			format.setFormatName(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.FormatName"));
			format.setFormatLongName(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.FormatLongName"));
			format.setStartTime(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.StartTime"));
			format.setDuration(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.Duration"));
			format.setSize(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.Size"));
			format.setBitrate(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].MediaInfo.Format.Bitrate"));
			mediaInfo.setFormat(format);
			media.setMediaInfo(mediaInfo);

			List<Play> playList = new ArrayList<Play>();
			for (int j = 0; j < context.lengthValue("QueryMediaListResponse.MediaList["+ i +"].PlayList.Length"); j++) {
				Play play = new Play();
				play.setActivityName(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].ActivityName"));
				play.setMediaWorkflowName(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].MediaWorkflowName"));
				play.setDuration(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Duration"));
				play.setFormat(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Format"));
				play.setSize(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Size"));
				play.setBitrate(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Bitrate"));
				play.setWidth(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Width"));
				play.setHeight(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Height"));
				play.setFps(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].Fps"));

				com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.Play.File playFile = new com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.Play.File();
				playFile.setURL(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].File.URL"));
				playFile.setState(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].PlayList["+ j +"].File.State"));
				play.setFile(playFile);

				playList.add(play);
			}
			media.setPlayList(playList);

			List<Snapshot> snapshotList = new ArrayList<Snapshot>();
			for (int j = 0; j < context.lengthValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList.Length"); j++) {
				Snapshot snapshot = new Snapshot();
				snapshot.setType(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].Type"));
				snapshot.setMediaWorkflowName(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].MediaWorkflowName"));
				snapshot.setActivityName(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].ActivityName"));
				snapshot.setCount(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].Count"));

				com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.Snapshot.File snapshotFile = new com.aliyuncs.mts.model.v20140618.QueryMediaListResponse.Media.Snapshot.File();
				snapshotFile.setURL(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].File.URL"));
				snapshotFile.setState(context.stringValue("QueryMediaListResponse.MediaList["+ i +"].SnapshotList["+ j +"].File.State"));
				snapshot.setFile(snapshotFile);

				snapshotList.add(snapshot);
			}
			media.setSnapshotList(snapshotList);

			mediaList.add(media);
		}
		queryMediaListResponse.setMediaList(mediaList);
	 
	 	return queryMediaListResponse;
	}
}