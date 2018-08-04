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

import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.Input;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.Properties;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStream.NetworkCost;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitMediaInfoJobResponseUnmarshaller {

	public static SubmitMediaInfoJobResponse unmarshall(SubmitMediaInfoJobResponse submitMediaInfoJobResponse, UnmarshallerContext context) {
		
		submitMediaInfoJobResponse.setRequestId(context.stringValue("SubmitMediaInfoJobResponse.RequestId"));

		MediaInfoJob mediaInfoJob = new MediaInfoJob();
		mediaInfoJob.setJobId(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.JobId"));
		mediaInfoJob.setUserData(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.UserData"));
		mediaInfoJob.setPipelineId(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.PipelineId"));
		mediaInfoJob.setAsync(context.booleanValue("SubmitMediaInfoJobResponse.MediaInfoJob.Async"));
		mediaInfoJob.setState(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.State"));
		mediaInfoJob.setCode(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Code"));
		mediaInfoJob.setMessage(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Message"));
		mediaInfoJob.setCreationTime(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.CreationTime"));

		Input input = new Input();
		input.setBucket(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Input.Bucket"));
		input.setLocation(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Input.Location"));
		input.setObject(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Input.Object"));
		mediaInfoJob.setInput(input);

		Properties properties = new Properties();
		properties.setWidth(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Width"));
		properties.setHeight(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Height"));
		properties.setBitrate(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Bitrate"));
		properties.setDuration(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Duration"));
		properties.setFps(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Fps"));
		properties.setFileSize(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.FileSize"));
		properties.setFileFormat(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.FileFormat"));

		Streams streams = new Streams();

		List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
		for (int i = 0; i < context.lengthValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList.Length"); i++) {
			VideoStream videoStream = new VideoStream();
			videoStream.setIndex(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Index"));
			videoStream.setCodecName(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].CodecName"));
			videoStream.setCodecLongName(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].CodecLongName"));
			videoStream.setProfile(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Profile"));
			videoStream.setCodecTimeBase(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].CodecTimeBase"));
			videoStream.setCodecTagString(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].CodecTagString"));
			videoStream.setCodecTag(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].CodecTag"));
			videoStream.setWidth(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Width"));
			videoStream.setHeight(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Height"));
			videoStream.setHasBFrames(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].HasBFrames"));
			videoStream.setSar(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Sar"));
			videoStream.setDar(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Dar"));
			videoStream.setPixFmt(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].PixFmt"));
			videoStream.setLevel(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Level"));
			videoStream.setFps(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Fps"));
			videoStream.setAvgFPS(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].AvgFPS"));
			videoStream.setTimebase(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Timebase"));
			videoStream.setStartTime(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].StartTime"));
			videoStream.setDuration(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Duration"));
			videoStream.setBitrate(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Bitrate"));
			videoStream.setNumFrames(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].NumFrames"));
			videoStream.setLang(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Lang"));
			videoStream.setRotate(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Rotate"));

			NetworkCost networkCost = new NetworkCost();
			networkCost.setPreloadTime(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.PreloadTime"));
			networkCost.setCostBandwidth(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.CostBandwidth"));
			networkCost.setAvgBitrate(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.AvgBitrate"));
			videoStream.setNetworkCost(networkCost);

			videoStreamList.add(videoStream);
		}
		streams.setVideoStreamList(videoStreamList);

		List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
		for (int i = 0; i < context.lengthValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList.Length"); i++) {
			AudioStream audioStream = new AudioStream();
			audioStream.setIndex(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Index"));
			audioStream.setCodecName(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].CodecName"));
			audioStream.setCodecTimeBase(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].CodecTimeBase"));
			audioStream.setCodecLongName(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].CodecLongName"));
			audioStream.setCodecTagString(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].CodecTagString"));
			audioStream.setCodecTag(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].CodecTag"));
			audioStream.setSampleFmt(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].SampleFmt"));
			audioStream.setSamplerate(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Samplerate"));
			audioStream.setChannels(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Channels"));
			audioStream.setChannelLayout(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].ChannelLayout"));
			audioStream.setTimebase(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Timebase"));
			audioStream.setStartTime(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].StartTime"));
			audioStream.setDuration(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Duration"));
			audioStream.setBitrate(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Bitrate"));
			audioStream.setNumFrames(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].NumFrames"));
			audioStream.setLang(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Lang"));

			audioStreamList.add(audioStream);
		}
		streams.setAudioStreamList(audioStreamList);

		List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
		for (int i = 0; i < context.lengthValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList.Length"); i++) {
			SubtitleStream subtitleStream = new SubtitleStream();
			subtitleStream.setIndex(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].Index"));
			subtitleStream.setCodecName(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecName"));
			subtitleStream.setCodecTimeBase(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecTimeBase"));
			subtitleStream.setCodecLongName(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecLongName"));
			subtitleStream.setCodecTagString(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecTagString"));
			subtitleStream.setCodecTag(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecTag"));
			subtitleStream.setTimebase(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].Timebase"));
			subtitleStream.setStartTime(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].StartTime"));
			subtitleStream.setDuration(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].Duration"));
			subtitleStream.setLang(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].Lang"));

			subtitleStreamList.add(subtitleStream);
		}
		streams.setSubtitleStreamList(subtitleStreamList);
		properties.setStreams(streams);

		Format format = new Format();
		format.setNumStreams(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format.NumStreams"));
		format.setNumPrograms(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format.NumPrograms"));
		format.setFormatName(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format.FormatName"));
		format.setFormatLongName(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format.FormatLongName"));
		format.setStartTime(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format.StartTime"));
		format.setDuration(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format.Duration"));
		format.setSize(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format.Size"));
		format.setBitrate(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format.Bitrate"));
		properties.setFormat(format);
		mediaInfoJob.setProperties(properties);

		MNSMessageResult mNSMessageResult = new MNSMessageResult();
		mNSMessageResult.setMessageId(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.MNSMessageResult.MessageId"));
		mNSMessageResult.setErrorMessage(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.MNSMessageResult.ErrorMessage"));
		mNSMessageResult.setErrorCode(context.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.MNSMessageResult.ErrorCode"));
		mediaInfoJob.setMNSMessageResult(mNSMessageResult);
		submitMediaInfoJobResponse.setMediaInfoJob(mediaInfoJob);
	 
	 	return submitMediaInfoJobResponse;
	}
}