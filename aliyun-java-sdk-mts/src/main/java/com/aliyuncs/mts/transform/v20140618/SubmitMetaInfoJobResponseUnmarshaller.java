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

import com.aliyuncs.mts.model.v20140618.SubmitMetaInfoJobResponse;
import com.aliyuncs.mts.model.v20140618.SubmitMetaInfoJobResponse.MetaInfoJob;
import com.aliyuncs.mts.model.v20140618.SubmitMetaInfoJobResponse.MetaInfoJob.Input;
import com.aliyuncs.mts.model.v20140618.SubmitMetaInfoJobResponse.MetaInfoJob.Properties;
import com.aliyuncs.mts.model.v20140618.SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Format;
import com.aliyuncs.mts.model.v20140618.SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams;
import com.aliyuncs.mts.model.v20140618.SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStream.NetworkCost;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitMetaInfoJobResponseUnmarshaller {

	public static SubmitMetaInfoJobResponse unmarshall(SubmitMetaInfoJobResponse submitMetaInfoJobResponse, UnmarshallerContext context) {
		
		submitMetaInfoJobResponse.setRequestId(context.stringValue("SubmitMetaInfoJobResponse.RequestId"));

		MetaInfoJob metaInfoJob = new MetaInfoJob();
		metaInfoJob.setJobId(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.JobId"));
		metaInfoJob.setUserData(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.UserData"));
		metaInfoJob.setPipelineId(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.PipelineId"));
		metaInfoJob.setState(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.State"));
		metaInfoJob.setCode(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Code"));
		metaInfoJob.setMessage(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Message"));
		metaInfoJob.setCreationTime(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.CreationTime"));

		Input input = new Input();
		input.setBucket(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Input.Bucket"));
		input.setLocation(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Input.Location"));
		input.setObject(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Input.Object"));
		metaInfoJob.setInput(input);

		Properties properties = new Properties();
		properties.setWidth(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Width"));
		properties.setHeight(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Height"));
		properties.setBitrate(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Bitrate"));
		properties.setDuration(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Duration"));
		properties.setFps(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Fps"));
		properties.setFileSize(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.FileSize"));
		properties.setFileFormat(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.FileFormat"));

		Streams streams = new Streams();

		List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
		for (int i = 0; i < context.lengthValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList.Length"); i++) {
			VideoStream videoStream = new VideoStream();
			videoStream.setIndex(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Index"));
			videoStream.setCodecName(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].CodecName"));
			videoStream.setCodecLongName(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].CodecLongName"));
			videoStream.setProfile(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Profile"));
			videoStream.setCodecTimeBase(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].CodecTimeBase"));
			videoStream.setCodecTagString(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].CodecTagString"));
			videoStream.setCodecTag(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].CodecTag"));
			videoStream.setWidth(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Width"));
			videoStream.setHeight(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Height"));
			videoStream.setHasBFrames(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].HasBFrames"));
			videoStream.setSar(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Sar"));
			videoStream.setDar(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Dar"));
			videoStream.setPixFmt(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].PixFmt"));
			videoStream.setLevel(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Level"));
			videoStream.setFps(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Fps"));
			videoStream.setAvgFPS(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].AvgFPS"));
			videoStream.setTimebase(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Timebase"));
			videoStream.setStartTime(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].StartTime"));
			videoStream.setDuration(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Duration"));
			videoStream.setBitrate(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Bitrate"));
			videoStream.setNumFrames(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].NumFrames"));
			videoStream.setLang(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Lang"));

			NetworkCost networkCost = new NetworkCost();
			networkCost.setPreloadTime(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.PreloadTime"));
			networkCost.setCostBandwidth(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.CostBandwidth"));
			networkCost.setAvgBitrate(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.AvgBitrate"));
			videoStream.setNetworkCost(networkCost);

			videoStreamList.add(videoStream);
		}
		streams.setVideoStreamList(videoStreamList);

		List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
		for (int i = 0; i < context.lengthValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList.Length"); i++) {
			AudioStream audioStream = new AudioStream();
			audioStream.setIndex(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Index"));
			audioStream.setCodecName(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList["+ i +"].CodecName"));
			audioStream.setCodecTimeBase(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList["+ i +"].CodecTimeBase"));
			audioStream.setCodecLongName(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList["+ i +"].CodecLongName"));
			audioStream.setCodecTagString(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList["+ i +"].CodecTagString"));
			audioStream.setCodecTag(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList["+ i +"].CodecTag"));
			audioStream.setSampleFmt(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList["+ i +"].SampleFmt"));
			audioStream.setSamplerate(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Samplerate"));
			audioStream.setChannels(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Channels"));
			audioStream.setChannelLayout(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList["+ i +"].ChannelLayout"));
			audioStream.setTimebase(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Timebase"));
			audioStream.setStartTime(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList["+ i +"].StartTime"));
			audioStream.setDuration(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Duration"));
			audioStream.setBitrate(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Bitrate"));
			audioStream.setNumFrames(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList["+ i +"].NumFrames"));
			audioStream.setLang(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Lang"));

			audioStreamList.add(audioStream);
		}
		streams.setAudioStreamList(audioStreamList);

		List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
		for (int i = 0; i < context.lengthValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.SubtitleStreamList.Length"); i++) {
			SubtitleStream subtitleStream = new SubtitleStream();
			subtitleStream.setIndex(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].Index"));
			subtitleStream.setLang(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].Lang"));

			subtitleStreamList.add(subtitleStream);
		}
		streams.setSubtitleStreamList(subtitleStreamList);
		properties.setStreams(streams);

		Format format = new Format();
		format.setNumStreams(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Format.NumStreams"));
		format.setNumPrograms(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Format.NumPrograms"));
		format.setFormatName(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Format.FormatName"));
		format.setFormatLongName(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Format.FormatLongName"));
		format.setStartTime(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Format.StartTime"));
		format.setDuration(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Format.Duration"));
		format.setSize(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Format.Size"));
		format.setBitrate(context.stringValue("SubmitMetaInfoJobResponse.MetaInfoJob.Properties.Format.Bitrate"));
		properties.setFormat(format);
		metaInfoJob.setProperties(properties);
		submitMetaInfoJobResponse.setMetaInfoJob(metaInfoJob);
	 
	 	return submitMetaInfoJobResponse;
	}
}