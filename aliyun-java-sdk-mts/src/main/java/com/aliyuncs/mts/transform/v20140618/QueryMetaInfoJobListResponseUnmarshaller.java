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

import com.aliyuncs.mts.model.v20140618.QueryMetaInfoJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryMetaInfoJobListResponse.MetaInfoJob;
import com.aliyuncs.mts.model.v20140618.QueryMetaInfoJobListResponse.MetaInfoJob.Input;
import com.aliyuncs.mts.model.v20140618.QueryMetaInfoJobListResponse.MetaInfoJob.Properties;
import com.aliyuncs.mts.model.v20140618.QueryMetaInfoJobListResponse.MetaInfoJob.Properties.Format;
import com.aliyuncs.mts.model.v20140618.QueryMetaInfoJobListResponse.MetaInfoJob.Properties.Streams;
import com.aliyuncs.mts.model.v20140618.QueryMetaInfoJobListResponse.MetaInfoJob.Properties.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.QueryMetaInfoJobListResponse.MetaInfoJob.Properties.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.QueryMetaInfoJobListResponse.MetaInfoJob.Properties.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.QueryMetaInfoJobListResponse.MetaInfoJob.Properties.Streams.VideoStream.NetworkCost;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMetaInfoJobListResponseUnmarshaller {

	public static QueryMetaInfoJobListResponse unmarshall(QueryMetaInfoJobListResponse queryMetaInfoJobListResponse, UnmarshallerContext context) {
		
		queryMetaInfoJobListResponse.setRequestId(context.stringValue("QueryMetaInfoJobListResponse.RequestId"));

		List<String> nonExistMetaInfoJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryMetaInfoJobListResponse.NonExistMetaInfoJobIds.Length"); i++) {
			nonExistMetaInfoJobIds.add(context.stringValue("QueryMetaInfoJobListResponse.NonExistMetaInfoJobIds["+ i +"]"));
		}
		queryMetaInfoJobListResponse.setNonExistMetaInfoJobIds(nonExistMetaInfoJobIds);

		List<MetaInfoJob> metaInfoJobList = new ArrayList<MetaInfoJob>();
		for (int i = 0; i < context.lengthValue("QueryMetaInfoJobListResponse.MetaInfoJobList.Length"); i++) {
			MetaInfoJob metaInfoJob = new MetaInfoJob();
			metaInfoJob.setJobId(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].JobId"));
			metaInfoJob.setUserData(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].UserData"));
			metaInfoJob.setPipelineId(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].PipelineId"));
			metaInfoJob.setState(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].State"));
			metaInfoJob.setCode(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Code"));
			metaInfoJob.setMessage(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Message"));
			metaInfoJob.setCreationTime(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].CreationTime"));

			Input input = new Input();
			input.setBucket(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Input.Bucket"));
			input.setLocation(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Input.Location"));
			input.setObject(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Input.Object"));
			metaInfoJob.setInput(input);

			Properties properties = new Properties();
			properties.setWidth(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Width"));
			properties.setHeight(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Height"));
			properties.setBitrate(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Bitrate"));
			properties.setDuration(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Duration"));
			properties.setFps(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Fps"));
			properties.setFileSize(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.FileSize"));
			properties.setFileFormat(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.FileFormat"));

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < context.lengthValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setIndex(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setCodecName(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setCodecLongName(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setProfile(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setCodecTimeBase(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setCodecTagString(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setCodecTag(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setWidth(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setHeight(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setHasBFrames(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setSar(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setDar(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setPixFmt(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLevel(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Level"));
				videoStream.setFps(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setAvgFPS(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setTimebase(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setStartTime(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDuration(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setBitrate(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setNumFrames(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setLang(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Lang"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setCostBandwidth(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				networkCost.setAvgBitrate(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < context.lengthValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setIndex(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setCodecName(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setCodecTimeBase(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecTimeBase"));
				audioStream.setCodecLongName(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setCodecTagString(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setCodecTag(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setSampleFmt(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setSamplerate(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setChannels(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setChannelLayout(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setTimebase(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setStartTime(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setDuration(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setBitrate(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setNumFrames(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setLang(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Lang"));

				audioStreamList.add(audioStream);
			}
			streams.setAudioStreamList(audioStreamList);

			List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
			for (int j = 0; j < context.lengthValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.SubtitleStreamList.Length"); j++) {
				SubtitleStream subtitleStream = new SubtitleStream();
				subtitleStream.setIndex(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].Index"));
				subtitleStream.setLang(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].Lang"));

				subtitleStreamList.add(subtitleStream);
			}
			streams.setSubtitleStreamList(subtitleStreamList);
			properties.setStreams(streams);

			Format format = new Format();
			format.setNumStreams(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Format.NumStreams"));
			format.setNumPrograms(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Format.NumPrograms"));
			format.setFormatName(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Format.FormatName"));
			format.setFormatLongName(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Format.FormatLongName"));
			format.setStartTime(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Format.StartTime"));
			format.setDuration(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Format.Duration"));
			format.setSize(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Format.Size"));
			format.setBitrate(context.stringValue("QueryMetaInfoJobListResponse.MetaInfoJobList["+ i +"].Properties.Format.Bitrate"));
			properties.setFormat(format);
			metaInfoJob.setProperties(properties);

			metaInfoJobList.add(metaInfoJob);
		}
		queryMetaInfoJobListResponse.setMetaInfoJobList(metaInfoJobList);
	 
	 	return queryMetaInfoJobListResponse;
	}
}