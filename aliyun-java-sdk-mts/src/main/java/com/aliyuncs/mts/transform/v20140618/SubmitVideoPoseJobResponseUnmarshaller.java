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
		videoPoseJob.setJobId(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.JobId"));
		videoPoseJob.setPipelineId(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.PipelineId"));
		videoPoseJob.setUserData(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.UserData"));
		videoPoseJob.setState(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.State"));

		Input input = new Input();
		input.setBucket(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Input.Bucket"));
		input.setLocation(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Input.Location"));
		input.setObject(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Input.Object"));
		input.setRoleArn(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Input.RoleArn"));
		videoPoseJob.setInput(input);

		OutputConfig outputConfig = new OutputConfig();

		VideoFile videoFile = new VideoFile();
		videoFile.setBucket(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.VideoFile.Bucket"));
		videoFile.setLocation(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.VideoFile.Location"));
		videoFile.setObject(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.VideoFile.Object"));
		videoFile.setRoleArn(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.VideoFile.RoleArn"));
		outputConfig.setVideoFile(videoFile);

		DataFile dataFile = new DataFile();
		dataFile.setBucket(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.DataFile.Bucket"));
		dataFile.setLocation(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.DataFile.Location"));
		dataFile.setObject(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.DataFile.Object"));
		dataFile.setRoleArn(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.OutputConfig.DataFile.RoleArn"));
		outputConfig.setDataFile(dataFile);
		videoPoseJob.setOutputConfig(outputConfig);

		Properties properties = new Properties();
		properties.setWidth(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Width"));
		properties.setHeight(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Height"));
		properties.setBitrate(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Bitrate"));
		properties.setDuration(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Duration"));
		properties.setFps(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Fps"));
		properties.setFileSize(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.FileSize"));
		properties.setFileFormat(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.FileFormat"));

		Streams streams = new Streams();

		List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
		for (int i = 0; i < _ctx.lengthValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList.Length"); i++) {
			VideoStream videoStream = new VideoStream();
			videoStream.setIndex(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Index"));
			videoStream.setCodecName(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].CodecName"));
			videoStream.setCodecLongName(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].CodecLongName"));
			videoStream.setProfile(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Profile"));
			videoStream.setCodecTimeBase(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].CodecTimeBase"));
			videoStream.setCodecTagString(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].CodecTagString"));
			videoStream.setCodecTag(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].CodecTag"));
			videoStream.setWidth(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Width"));
			videoStream.setHeight(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Height"));
			videoStream.setHasBFrames(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].HasBFrames"));
			videoStream.setSar(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Sar"));
			videoStream.setDar(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Dar"));
			videoStream.setPixFmt(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].PixFmt"));
			videoStream.setLevel(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Level"));
			videoStream.setFps(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Fps"));
			videoStream.setAvgFPS(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].AvgFPS"));
			videoStream.setTimebase(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Timebase"));
			videoStream.setStartTime(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].StartTime"));
			videoStream.setDuration(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Duration"));
			videoStream.setBitrate(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Bitrate"));
			videoStream.setNumFrames(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].NumFrames"));
			videoStream.setLang(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Lang"));
			videoStream.setRotate(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].Rotate"));

			NetworkCost networkCost = new NetworkCost();
			networkCost.setPreloadTime(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.PreloadTime"));
			networkCost.setCostBandwidth(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.CostBandwidth"));
			networkCost.setAvgBitrate(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.AvgBitrate"));
			videoStream.setNetworkCost(networkCost);

			videoStreamList.add(videoStream);
		}
		streams.setVideoStreamList(videoStreamList);

		List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
		for (int i = 0; i < _ctx.lengthValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList.Length"); i++) {
			AudioStream audioStream = new AudioStream();
			audioStream.setIndex(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Index"));
			audioStream.setCodecName(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].CodecName"));
			audioStream.setCodecTimeBase(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].CodecTimeBase"));
			audioStream.setCodecLongName(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].CodecLongName"));
			audioStream.setCodecTagString(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].CodecTagString"));
			audioStream.setCodecTag(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].CodecTag"));
			audioStream.setSampleFmt(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].SampleFmt"));
			audioStream.setSamplerate(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Samplerate"));
			audioStream.setChannels(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Channels"));
			audioStream.setChannelLayout(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].ChannelLayout"));
			audioStream.setTimebase(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Timebase"));
			audioStream.setStartTime(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].StartTime"));
			audioStream.setDuration(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Duration"));
			audioStream.setBitrate(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Bitrate"));
			audioStream.setNumFrames(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].NumFrames"));
			audioStream.setLang(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.AudioStreamList["+ i +"].Lang"));

			audioStreamList.add(audioStream);
		}
		streams.setAudioStreamList(audioStreamList);

		List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
		for (int i = 0; i < _ctx.lengthValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList.Length"); i++) {
			SubtitleStream subtitleStream = new SubtitleStream();
			subtitleStream.setIndex(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].Index"));
			subtitleStream.setCodecName(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecName"));
			subtitleStream.setCodecTimeBase(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecTimeBase"));
			subtitleStream.setCodecLongName(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecLongName"));
			subtitleStream.setCodecTagString(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecTagString"));
			subtitleStream.setCodecTag(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecTag"));
			subtitleStream.setTimebase(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].Timebase"));
			subtitleStream.setStartTime(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].StartTime"));
			subtitleStream.setDuration(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].Duration"));
			subtitleStream.setLang(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Streams.SubtitleStreamList["+ i +"].Lang"));

			subtitleStreamList.add(subtitleStream);
		}
		streams.setSubtitleStreamList(subtitleStreamList);
		properties.setStreams(streams);

		Format format = new Format();
		format.setNumStreams(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.NumStreams"));
		format.setNumPrograms(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.NumPrograms"));
		format.setFormatName(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.FormatName"));
		format.setFormatLongName(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.FormatLongName"));
		format.setStartTime(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.StartTime"));
		format.setDuration(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.Duration"));
		format.setSize(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.Size"));
		format.setBitrate(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.Properties.Format.Bitrate"));
		properties.setFormat(format);
		videoPoseJob.setProperties(properties);

		MNSMessageResult mNSMessageResult = new MNSMessageResult();
		mNSMessageResult.setMessageId(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.MNSMessageResult.MessageId"));
		mNSMessageResult.setErrorMessage(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.MNSMessageResult.ErrorMessage"));
		mNSMessageResult.setErrorCode(_ctx.stringValue("SubmitVideoPoseJobResponse.VideoPoseJob.MNSMessageResult.ErrorCode"));
		videoPoseJob.setMNSMessageResult(mNSMessageResult);
		submitVideoPoseJobResponse.setVideoPoseJob(videoPoseJob);
	 
	 	return submitVideoPoseJobResponse;
	}
}