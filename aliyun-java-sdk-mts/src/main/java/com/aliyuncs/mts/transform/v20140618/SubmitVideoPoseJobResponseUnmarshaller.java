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

	public static SubmitVideoPoseJobResponse unmarshall(SubmitVideoPoseJobResponse submitVideoPoseJobResponse, UnmarshallerContext _ctx) {
		
		submitVideoPoseJobResponse.setRequestId(_ctx.stringValue("SubmitVideoPoseJobResponse.RequestId"));

		VideoPoseJob videoPoseJob = new VideoPoseJob();
		videoPoseJob.setState(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.State"));
		videoPoseJob.setJobId(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.JobId"));
		videoPoseJob.setUserData(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.UserData"));
		videoPoseJob.setPipelineId(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.PipelineId"));

		OutputConfig outputConfig = new OutputConfig();

		DataFile dataFile = new DataFile();
		dataFile.setRoleArn(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.DataFile.RoleArn"));
		dataFile.setObject(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.DataFile.Object"));
		dataFile.setLocation(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.DataFile.Location"));
		dataFile.setBucket(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.DataFile.Bucket"));
		outputConfig.setDataFile(dataFile);

		VideoFile videoFile = new VideoFile();
		videoFile.setRoleArn(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.VideoFile.RoleArn"));
		videoFile.setObject(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.VideoFile.Object"));
		videoFile.setLocation(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.VideoFile.Location"));
		videoFile.setBucket(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.VideoFile.Bucket"));
		outputConfig.setVideoFile(videoFile);
		videoPoseJob.setOutputConfig(outputConfig);

		MNSMessageResult mNSMessageResult = new MNSMessageResult();
		mNSMessageResult.setMessageId(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.MNSMessageResult.MessageId"));
		mNSMessageResult.setErrorMessage(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.MNSMessageResult.ErrorMessage"));
		mNSMessageResult.setErrorCode(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.MNSMessageResult.ErrorCode"));
		videoPoseJob.setMNSMessageResult(mNSMessageResult);

		Input input = new Input();
		input.setRoleArn(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Input.RoleArn"));
		input.setObject(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Input.Object"));
		input.setLocation(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Input.Location"));
		input.setBucket(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Input.Bucket"));
		videoPoseJob.setInput(input);

		Properties properties = new Properties();
		properties.setWidth(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Width"));
		properties.setHeight(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Height"));
		properties.setDuration(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Duration"));
		properties.setFps(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Fps"));
		properties.setBitrate(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Bitrate"));
		properties.setFileFormat(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.FileFormat"));
		properties.setFileSize(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.FileSize"));

		Streams streams = new Streams();

		List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
		for (int i = 0; i < _ctx.lengthValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList.Length"); i++) {
			VideoStream videoStream = new VideoStream();
			videoStream.setSar(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Sar"));
			videoStream.setHeight(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Height"));
			videoStream.setCodecTagString(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].CodecTagString"));
			videoStream.setWidth(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Width"));
			videoStream.setIndex(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Index"));
			videoStream.setTimebase(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Timebase"));
			videoStream.setAvgFPS(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].AvgFPS"));
			videoStream.setPixFmt(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].PixFmt"));
			videoStream.setLang(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Lang"));
			videoStream.setCodecLongName(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].CodecLongName"));
			videoStream.setNumFrames(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].NumFrames"));
			videoStream.setRotate(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Rotate"));
			videoStream.setBitrate(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Bitrate"));
			videoStream.setHasBFrames(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].HasBFrames"));
			videoStream.setProfile(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Profile"));
			videoStream.setStartTime(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].StartTime"));
			videoStream.setDar(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Dar"));
			videoStream.setCodecName(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].CodecName"));
			videoStream.setDuration(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Duration"));
			videoStream.setFps(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Fps"));
			videoStream.setCodecTag(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].CodecTag"));
			videoStream.setCodecTimeBase(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].CodecTimeBase"));
			videoStream.setLevel(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Level"));

			NetworkCost networkCost = new NetworkCost();
			networkCost.setPreloadTime(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.PreloadTime"));
			networkCost.setAvgBitrate(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.AvgBitrate"));
			networkCost.setCostBandwidth(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.CostBandwidth"));
			videoStream.setNetworkCost(networkCost);

			videoStreamList.add(videoStream);
		}
		streams.setVideoStreamList(videoStreamList);

		List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
		for (int i = 0; i < _ctx.lengthValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList.Length"); i++) {
			AudioStream audioStream = new AudioStream();
			audioStream.setTimebase(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Timebase"));
			audioStream.setIndex(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Index"));
			audioStream.setSampleFmt(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].SampleFmt"));
			audioStream.setChannelLayout(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].ChannelLayout"));
			audioStream.setLang(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Lang"));
			audioStream.setSamplerate(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Samplerate"));
			audioStream.setCodecLongName(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].CodecLongName"));
			audioStream.setChannels(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Channels"));
			audioStream.setNumFrames(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].NumFrames"));
			audioStream.setBitrate(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Bitrate"));
			audioStream.setCodecTagString(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].CodecTagString"));
			audioStream.setStartTime(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].StartTime"));
			audioStream.setCodecName(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].CodecName"));
			audioStream.setDuration(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Duration"));
			audioStream.setCodecTag(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].CodecTag"));
			audioStream.setCodecTimeBase(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].CodecTimeBase"));

			audioStreamList.add(audioStream);
		}
		streams.setAudioStreamList(audioStreamList);

		List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
		for (int i = 0; i < _ctx.lengthValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList.Length"); i++) {
			SubtitleStream subtitleStream = new SubtitleStream();
			subtitleStream.setTimebase(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].Timebase"));
			subtitleStream.setIndex(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].Index"));
			subtitleStream.setStartTime(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].StartTime"));
			subtitleStream.setCodecName(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecName"));
			subtitleStream.setLang(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].Lang"));
			subtitleStream.setCodecLongName(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecLongName"));
			subtitleStream.setDuration(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].Duration"));
			subtitleStream.setCodecTag(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecTag"));
			subtitleStream.setCodecTimeBase(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecTimeBase"));
			subtitleStream.setCodecTagString(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecTagString"));

			subtitleStreamList.add(subtitleStream);
		}
		streams.setSubtitleStreamList(subtitleStreamList);
		properties.setStreams(streams);

		Format format = new Format();
		format.setStartTime(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.StartTime"));
		format.setNumPrograms(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.NumPrograms"));
		format.setSize(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.Size"));
		format.setNumStreams(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.NumStreams"));
		format.setFormatLongName(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.FormatLongName"));
		format.setDuration(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.Duration"));
		format.setBitrate(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.Bitrate"));
		format.setFormatName(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.FormatName"));
		properties.setFormat(format);
		videoPoseJob.setProperties(properties);
		submitVideoPoseJobResponse.setVideoPoseJob(videoPoseJob);
	 
	 	return submitVideoPoseJobResponse;
	}
}