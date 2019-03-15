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

import com.aliyuncs.mts.model.v20140618.SubmitVideoPoseJobResponse;
import com.aliyuncs.mts.model.v20140618.SubmitVideoPoseJobResponse.VideoPoseJob;
import com.aliyuncs.mts.model.v20140618.SubmitVideoPoseJobResponse.VideoPoseJob.Input;
import com.aliyuncs.mts.model.v20140618.SubmitVideoPoseJobResponse.VideoPoseJob.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig;
import com.aliyuncs.mts.model.v20140618.SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.DataFile;
import com.aliyuncs.mts.model.v20140618.SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.VideoFile;
import com.aliyuncs.mts.model.v20140618.SubmitVideoPoseJobResponse.VideoPoseJob.Properties;
import com.aliyuncs.mts.model.v20140618.SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format;
import com.aliyuncs.mts.model.v20140618.SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams;
import com.aliyuncs.mts.model.v20140618.SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStream.NetworkCost;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitVideoPoseJobResponseUnmarshaller {

	public static SubmitVideoPoseJobResponse unmarshall(SubmitVideoPoseJobResponse submitVideoPoseJobResponse, UnmarshallerContext context) {
		
		submitVideoPoseJobResponse.setRequestId(context.stringValue("SubmitVideoPoseJobResponse.RequestId"));

		VideoPoseJob videoPoseJob = new VideoPoseJob();
		videoPoseJob.setJobId(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.JobId"));
		videoPoseJob.setPipelineId(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.PipelineId"));
		videoPoseJob.setUserData(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.UserData"));
		videoPoseJob.setState(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.State"));

		Input input = new Input();
		input.setBucket(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Input.Bucket"));
		input.setLocation(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Input.Location"));
		input.setObject(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Input.Object"));
		input.setRoleArn(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Input.RoleArn"));
		videoPoseJob.setInput(input);

		OutputConfig outputConfig = new OutputConfig();

		VideoFile videoFile = new VideoFile();
		videoFile.setBucket(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.VideoFile.Bucket"));
		videoFile.setLocation(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.VideoFile.Location"));
		videoFile.setObject(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.VideoFile.Object"));
		videoFile.setRoleArn(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.VideoFile.RoleArn"));
		outputConfig.setVideoFile(videoFile);

		DataFile dataFile = new DataFile();
		dataFile.setBucket(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.DataFile.Bucket"));
		dataFile.setLocation(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.DataFile.Location"));
		dataFile.setObject(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.DataFile.Object"));
		dataFile.setRoleArn(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.DataFile.RoleArn"));
		outputConfig.setDataFile(dataFile);
		videoPoseJob.setOutputConfig(outputConfig);

		Properties properties = new Properties();
		properties.setWidth(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Width"));
		properties.setHeight(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Height"));
		properties.setBitrate(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Bitrate"));
		properties.setDuration(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Duration"));
		properties.setFps(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Fps"));
		properties.setFileSize(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.FileSize"));
		properties.setFileFormat(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.FileFormat"));

		Streams streams = new Streams();

		List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
		for (int i = 0; i < context.lengthValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList.Length"); i++) {
			VideoStream videoStream = new VideoStream();
			videoStream.setIndex(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Index"));
			videoStream.setCodecName(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].CodecName"));
			videoStream.setCodecLongName(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].CodecLongName"));
			videoStream.setProfile(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Profile"));
			videoStream.setCodecTimeBase(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].CodecTimeBase"));
			videoStream.setCodecTagString(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].CodecTagString"));
			videoStream.setCodecTag(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].CodecTag"));
			videoStream.setWidth(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Width"));
			videoStream.setHeight(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Height"));
			videoStream.setHasBFrames(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].HasBFrames"));
			videoStream.setSar(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Sar"));
			videoStream.setDar(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Dar"));
			videoStream.setPixFmt(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].PixFmt"));
			videoStream.setLevel(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Level"));
			videoStream.setFps(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Fps"));
			videoStream.setAvgFPS(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].AvgFPS"));
			videoStream.setTimebase(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Timebase"));
			videoStream.setStartTime(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].StartTime"));
			videoStream.setDuration(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Duration"));
			videoStream.setBitrate(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Bitrate"));
			videoStream.setNumFrames(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].NumFrames"));
			videoStream.setLang(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Lang"));
			videoStream.setRotate(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Rotate"));

			NetworkCost networkCost = new NetworkCost();
			networkCost.setPreloadTime(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.PreloadTime"));
			networkCost.setCostBandwidth(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.CostBandwidth"));
			networkCost.setAvgBitrate(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.AvgBitrate"));
			videoStream.setNetworkCost(networkCost);

			videoStreamList.add(videoStream);
		}
		streams.setVideoStreamList(videoStreamList);

		List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
		for (int i = 0; i < context.lengthValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList.Length"); i++) {
			AudioStream audioStream = new AudioStream();
			audioStream.setIndex(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Index"));
			audioStream.setCodecName(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].CodecName"));
			audioStream.setCodecTimeBase(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].CodecTimeBase"));
			audioStream.setCodecLongName(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].CodecLongName"));
			audioStream.setCodecTagString(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].CodecTagString"));
			audioStream.setCodecTag(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].CodecTag"));
			audioStream.setSampleFmt(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].SampleFmt"));
			audioStream.setSamplerate(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Samplerate"));
			audioStream.setChannels(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Channels"));
			audioStream.setChannelLayout(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].ChannelLayout"));
			audioStream.setTimebase(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Timebase"));
			audioStream.setStartTime(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].StartTime"));
			audioStream.setDuration(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Duration"));
			audioStream.setBitrate(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Bitrate"));
			audioStream.setNumFrames(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].NumFrames"));
			audioStream.setLang(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Lang"));

			audioStreamList.add(audioStream);
		}
		streams.setAudioStreamList(audioStreamList);

		List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
		for (int i = 0; i < context.lengthValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList.Length"); i++) {
			SubtitleStream subtitleStream = new SubtitleStream();
			subtitleStream.setIndex(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].Index"));
			subtitleStream.setCodecName(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecName"));
			subtitleStream.setCodecTimeBase(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecTimeBase"));
			subtitleStream.setCodecLongName(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecLongName"));
			subtitleStream.setCodecTagString(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecTagString"));
			subtitleStream.setCodecTag(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecTag"));
			subtitleStream.setTimebase(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].Timebase"));
			subtitleStream.setStartTime(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].StartTime"));
			subtitleStream.setDuration(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].Duration"));
			subtitleStream.setLang(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].Lang"));

			subtitleStreamList.add(subtitleStream);
		}
		streams.setSubtitleStreamList(subtitleStreamList);
		properties.setStreams(streams);

		Format format = new Format();
		format.setNumStreams(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.NumStreams"));
		format.setNumPrograms(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.NumPrograms"));
		format.setFormatName(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.FormatName"));
		format.setFormatLongName(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.FormatLongName"));
		format.setStartTime(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.StartTime"));
		format.setDuration(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.Duration"));
		format.setSize(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.Size"));
		format.setBitrate(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.Bitrate"));
		properties.setFormat(format);
		videoPoseJob.setProperties(properties);

		MNSMessageResult mNSMessageResult = new MNSMessageResult();
		mNSMessageResult.setMessageId(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.MNSMessageResult.MessageId"));
		mNSMessageResult.setErrorMessage(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.MNSMessageResult.ErrorMessage"));
		mNSMessageResult.setErrorCode(context.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.MNSMessageResult.ErrorCode"));
		videoPoseJob.setMNSMessageResult(mNSMessageResult);
		submitVideoPoseJobResponse.setVideoPoseJob(videoPoseJob);
	 
	 	return submitVideoPoseJobResponse;
	}
}