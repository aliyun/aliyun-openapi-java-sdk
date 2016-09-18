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

import com.aliyuncs.mts.model.v20140618.QueryMediaInfoJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryMediaInfoJobListResponse.MediaInfoJob;
import com.aliyuncs.mts.model.v20140618.QueryMediaInfoJobListResponse.MediaInfoJob.Input;
import com.aliyuncs.mts.model.v20140618.QueryMediaInfoJobListResponse.MediaInfoJob.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaInfoJobListResponse.MediaInfoJob.Properties;
import com.aliyuncs.mts.model.v20140618.QueryMediaInfoJobListResponse.MediaInfoJob.Properties.Format;
import com.aliyuncs.mts.model.v20140618.QueryMediaInfoJobListResponse.MediaInfoJob.Properties.Streams;
import com.aliyuncs.mts.model.v20140618.QueryMediaInfoJobListResponse.MediaInfoJob.Properties.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.QueryMediaInfoJobListResponse.MediaInfoJob.Properties.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.QueryMediaInfoJobListResponse.MediaInfoJob.Properties.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.QueryMediaInfoJobListResponse.MediaInfoJob.Properties.Streams.VideoStream.NetworkCost;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMediaInfoJobListResponseUnmarshaller {

	public static QueryMediaInfoJobListResponse unmarshall(QueryMediaInfoJobListResponse queryMediaInfoJobListResponse, UnmarshallerContext context) {
		
		queryMediaInfoJobListResponse.setRequestId(context.stringValue("QueryMediaInfoJobListResponse.RequestId"));

		List<String> nonExistMediaInfoJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryMediaInfoJobListResponse.NonExistMediaInfoJobIds.Length"); i++) {
			nonExistMediaInfoJobIds.add(context.stringValue("QueryMediaInfoJobListResponse.NonExistMediaInfoJobIds["+ i +"]"));
		}
		queryMediaInfoJobListResponse.setNonExistMediaInfoJobIds(nonExistMediaInfoJobIds);

		List<MediaInfoJob> mediaInfoJobList = new ArrayList<MediaInfoJob>();
		for (int i = 0; i < context.lengthValue("QueryMediaInfoJobListResponse.MediaInfoJobList.Length"); i++) {
			MediaInfoJob mediaInfoJob = new MediaInfoJob();
			mediaInfoJob.setJobId(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].JobId"));
			mediaInfoJob.setUserData(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].UserData"));
			mediaInfoJob.setPipelineId(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].PipelineId"));
			mediaInfoJob.setState(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].State"));
			mediaInfoJob.setCode(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Code"));
			mediaInfoJob.setMessage(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Message"));
			mediaInfoJob.setCreationTime(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].CreationTime"));

			Input input = new Input();
			input.setBucket(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Input.Bucket"));
			input.setLocation(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Input.Location"));
			input.setObject(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Input.Object"));
			mediaInfoJob.setInput(input);

			Properties properties = new Properties();
			properties.setWidth(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Width"));
			properties.setHeight(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Height"));
			properties.setBitrate(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Bitrate"));
			properties.setDuration(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Duration"));
			properties.setFps(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Fps"));
			properties.setFileSize(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.FileSize"));
			properties.setFileFormat(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.FileFormat"));

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < context.lengthValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setIndex(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setCodecName(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setCodecLongName(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setProfile(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setCodecTimeBase(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setCodecTagString(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setCodecTag(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setWidth(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setHeight(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setHasBFrames(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setSar(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setDar(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setPixFmt(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLevel(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Level"));
				videoStream.setFps(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setAvgFPS(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setTimebase(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setStartTime(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDuration(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setBitrate(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setNumFrames(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setLang(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Lang"));
				videoStream.setRotate(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Rotate"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setCostBandwidth(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				networkCost.setAvgBitrate(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < context.lengthValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setIndex(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setCodecName(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setCodecTimeBase(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecTimeBase"));
				audioStream.setCodecLongName(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setCodecTagString(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setCodecTag(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setSampleFmt(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setSamplerate(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setChannels(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setChannelLayout(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setTimebase(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setStartTime(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setDuration(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setBitrate(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setNumFrames(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setLang(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Lang"));

				audioStreamList.add(audioStream);
			}
			streams.setAudioStreamList(audioStreamList);

			List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
			for (int j = 0; j < context.lengthValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.SubtitleStreamList.Length"); j++) {
				SubtitleStream subtitleStream = new SubtitleStream();
				subtitleStream.setIndex(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].Index"));
				subtitleStream.setLang(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].Lang"));

				subtitleStreamList.add(subtitleStream);
			}
			streams.setSubtitleStreamList(subtitleStreamList);
			properties.setStreams(streams);

			Format format = new Format();
			format.setNumStreams(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Format.NumStreams"));
			format.setNumPrograms(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Format.NumPrograms"));
			format.setFormatName(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Format.FormatName"));
			format.setFormatLongName(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Format.FormatLongName"));
			format.setStartTime(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Format.StartTime"));
			format.setDuration(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Format.Duration"));
			format.setSize(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Format.Size"));
			format.setBitrate(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].Properties.Format.Bitrate"));
			properties.setFormat(format);
			mediaInfoJob.setProperties(properties);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(context.stringValue("QueryMediaInfoJobListResponse.MediaInfoJobList["+ i +"].MNSMessageResult.ErrorCode"));
			mediaInfoJob.setMNSMessageResult(mNSMessageResult);

			mediaInfoJobList.add(mediaInfoJob);
		}
		queryMediaInfoJobListResponse.setMediaInfoJobList(mediaInfoJobList);
	 
	 	return queryMediaInfoJobListResponse;
	}
}