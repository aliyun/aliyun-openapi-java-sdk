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

import com.aliyuncs.mts.model.v20140618.SearchMediaResponse;
import com.aliyuncs.mts.model.v20140618.SearchMediaResponse.Media;
import com.aliyuncs.mts.model.v20140618.SearchMediaResponse.Media.MediaInfo;
import com.aliyuncs.mts.model.v20140618.SearchMediaResponse.Media.MediaInfo.Format;
import com.aliyuncs.mts.model.v20140618.SearchMediaResponse.Media.MediaInfo.Streams;
import com.aliyuncs.mts.model.v20140618.SearchMediaResponse.Media.MediaInfo.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.SearchMediaResponse.Media.MediaInfo.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.SearchMediaResponse.Media.MediaInfo.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.SearchMediaResponse.Media.MediaInfo.Streams.VideoStream.NetworkCost;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchMediaResponseUnmarshaller {

	public static SearchMediaResponse unmarshall(SearchMediaResponse searchMediaResponse, UnmarshallerContext context) {
		
		searchMediaResponse.setRequestId(context.stringValue("SearchMediaResponse.RequestId"));
		searchMediaResponse.setTotalCount(context.longValue("SearchMediaResponse.TotalCount"));
		searchMediaResponse.setPageNumber(context.longValue("SearchMediaResponse.PageNumber"));
		searchMediaResponse.setPageSize(context.longValue("SearchMediaResponse.PageSize"));

		List<Media> mediaList = new ArrayList<Media>();
		for (int i = 0; i < context.lengthValue("SearchMediaResponse.MediaList.Length"); i++) {
			Media media = new Media();
			media.setMediaId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaId"));
			media.setFileURL(context.stringValue("SearchMediaResponse.MediaList["+ i +"].FileURL"));
			media.setState(context.stringValue("SearchMediaResponse.MediaList["+ i +"].State"));
			media.setCreationTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].CreationTime"));

			MediaInfo mediaInfo = new MediaInfo();

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < context.lengthValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setIndex(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setCodecName(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setCodecLongName(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setProfile(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setCodecTimeBase(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setCodecTagString(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setCodecTag(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setWidth(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setHeight(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setHasBFrames(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setSar(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setDar(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setPixFmt(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLevel(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Level"));
				videoStream.setFps(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setAvgFPS(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setTimebase(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setStartTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDuration(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setBitrate(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setNumFrames(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setLang(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].Lang"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setCostBandwidth(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				networkCost.setAvgBitrate(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < context.lengthValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setIndex(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setCodecName(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setCodecTimeBase(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecTimeBase"));
				audioStream.setCodecLongName(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setCodecTagString(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setCodecTag(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setSampleFmt(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setSamplerate(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setChannels(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setChannelLayout(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setTimebase(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setStartTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setDuration(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setBitrate(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setNumFrames(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setLang(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.AudioStreamList["+ j +"].Lang"));

				audioStreamList.add(audioStream);
			}
			streams.setAudioStreamList(audioStreamList);

			List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
			for (int j = 0; j < context.lengthValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.SubtitleStreamList.Length"); j++) {
				SubtitleStream subtitleStream = new SubtitleStream();
				subtitleStream.setIndex(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.SubtitleStreamList["+ j +"].Index"));
				subtitleStream.setLang(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Streams.SubtitleStreamList["+ j +"].Lang"));

				subtitleStreamList.add(subtitleStream);
			}
			streams.setSubtitleStreamList(subtitleStreamList);
			mediaInfo.setStreams(streams);

			Format format = new Format();
			format.setNumStreams(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Format.NumStreams"));
			format.setNumPrograms(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Format.NumPrograms"));
			format.setFormatName(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Format.FormatName"));
			format.setFormatLongName(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Format.FormatLongName"));
			format.setStartTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Format.StartTime"));
			format.setDuration(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Format.Duration"));
			format.setSize(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Format.Size"));
			format.setBitrate(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaInfo.Format.Bitrate"));
			mediaInfo.setFormat(format);
			media.setMediaInfo(mediaInfo);

			mediaList.add(media);
		}
		searchMediaResponse.setMediaList(mediaList);
	 
	 	return searchMediaResponse;
	}
}