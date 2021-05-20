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

import com.aliyuncs.mts.model.v20140618.QueryVideoPoseJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryVideoPoseJobListResponse.Job;
import com.aliyuncs.mts.model.v20140618.QueryVideoPoseJobListResponse.Job.Input;
import com.aliyuncs.mts.model.v20140618.QueryVideoPoseJobListResponse.Job.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.QueryVideoPoseJobListResponse.Job.OutputConfig;
import com.aliyuncs.mts.model.v20140618.QueryVideoPoseJobListResponse.Job.OutputConfig.DataFile;
import com.aliyuncs.mts.model.v20140618.QueryVideoPoseJobListResponse.Job.OutputConfig.VideoFile;
import com.aliyuncs.mts.model.v20140618.QueryVideoPoseJobListResponse.Job.Properties;
import com.aliyuncs.mts.model.v20140618.QueryVideoPoseJobListResponse.Job.Properties.Format;
import com.aliyuncs.mts.model.v20140618.QueryVideoPoseJobListResponse.Job.Properties.Streams;
import com.aliyuncs.mts.model.v20140618.QueryVideoPoseJobListResponse.Job.Properties.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.QueryVideoPoseJobListResponse.Job.Properties.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.QueryVideoPoseJobListResponse.Job.Properties.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.QueryVideoPoseJobListResponse.Job.Properties.Streams.VideoStream.NetworkCost;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVideoPoseJobListResponseUnmarshaller {

	public static QueryVideoPoseJobListResponse unmarshall(QueryVideoPoseJobListResponse queryVideoPoseJobListResponse, UnmarshallerContext _ctx) {
		
		queryVideoPoseJobListResponse.setRequestId(_ctx.stringValue("QueryVideoPoseJobListResponse.RequestId"));

		List<String> nonExistJobIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryVideoPoseJobListResponse.NonExistJobIds.Length"); i++) {
			nonExistJobIds.add(_ctx.stringValue("QueryVideoPoseJobListResponse.NonExistJobIds["+ i +"]"));
		}
		queryVideoPoseJobListResponse.setNonExistJobIds(nonExistJobIds);

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("QueryVideoPoseJobListResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setState(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].State"));
			job.setJobId(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].JobId"));
			job.setUserData(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].UserData"));
			job.setPipelineId(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].PipelineId"));

			OutputConfig outputConfig = new OutputConfig();

			DataFile dataFile = new DataFile();
			dataFile.setRoleArn(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].OutputConfig.DataFile.RoleArn"));
			dataFile.setObject(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].OutputConfig.DataFile.Object"));
			dataFile.setLocation(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].OutputConfig.DataFile.Location"));
			dataFile.setBucket(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].OutputConfig.DataFile.Bucket"));
			outputConfig.setDataFile(dataFile);

			VideoFile videoFile = new VideoFile();
			videoFile.setRoleArn(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].OutputConfig.VideoFile.RoleArn"));
			videoFile.setObject(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].OutputConfig.VideoFile.Object"));
			videoFile.setLocation(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].OutputConfig.VideoFile.Location"));
			videoFile.setBucket(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].OutputConfig.VideoFile.Bucket"));
			outputConfig.setVideoFile(videoFile);
			job.setOutputConfig(outputConfig);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].MNSMessageResult.ErrorCode"));
			job.setMNSMessageResult(mNSMessageResult);

			Input input = new Input();
			input.setRoleArn(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Input.RoleArn"));
			input.setObject(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Input.Object"));
			input.setLocation(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Input.Location"));
			input.setBucket(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Input.Bucket"));
			job.setInput(input);

			Properties properties = new Properties();
			properties.setWidth(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Width"));
			properties.setHeight(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Height"));
			properties.setDuration(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Duration"));
			properties.setFps(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Fps"));
			properties.setBitrate(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Bitrate"));
			properties.setFileFormat(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.FileFormat"));
			properties.setFileSize(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.FileSize"));

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < _ctx.lengthValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setSar(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setHeight(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setCodecTagString(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setWidth(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setIndex(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setTimebase(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setAvgFPS(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setPixFmt(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLang(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Lang"));
				videoStream.setCodecLongName(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setNumFrames(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setRotate(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Rotate"));
				videoStream.setBitrate(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setHasBFrames(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setProfile(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setStartTime(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDar(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setCodecName(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setDuration(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setFps(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setCodecTag(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setCodecTimeBase(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setLevel(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Level"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setAvgBitrate(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				networkCost.setCostBandwidth(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < _ctx.lengthValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setTimebase(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setIndex(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setSampleFmt(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setChannelLayout(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setLang(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Lang"));
				audioStream.setSamplerate(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setCodecLongName(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setChannels(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setNumFrames(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setBitrate(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setCodecTagString(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setStartTime(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setCodecName(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setDuration(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setCodecTag(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setCodecTimeBase(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecTimeBase"));

				audioStreamList.add(audioStream);
			}
			streams.setAudioStreamList(audioStreamList);

			List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
			for (int j = 0; j < _ctx.lengthValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList.Length"); j++) {
				SubtitleStream subtitleStream = new SubtitleStream();
				subtitleStream.setTimebase(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].Timebase"));
				subtitleStream.setIndex(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].Index"));
				subtitleStream.setStartTime(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].StartTime"));
				subtitleStream.setCodecName(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].CodecName"));
				subtitleStream.setLang(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].Lang"));
				subtitleStream.setCodecLongName(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].CodecLongName"));
				subtitleStream.setDuration(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].Duration"));
				subtitleStream.setCodecTag(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].CodecTag"));
				subtitleStream.setCodecTimeBase(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].CodecTimeBase"));
				subtitleStream.setCodecTagString(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].CodecTagString"));

				subtitleStreamList.add(subtitleStream);
			}
			streams.setSubtitleStreamList(subtitleStreamList);
			properties.setStreams(streams);

			Format format = new Format();
			format.setStartTime(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Format.StartTime"));
			format.setNumPrograms(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Format.NumPrograms"));
			format.setSize(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Format.Size"));
			format.setNumStreams(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Format.NumStreams"));
			format.setFormatLongName(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Format.FormatLongName"));
			format.setDuration(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Format.Duration"));
			format.setBitrate(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Format.Bitrate"));
			format.setFormatName(_ctx.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Format.FormatName"));
			properties.setFormat(format);
			job.setProperties(properties);

			jobList.add(job);
		}
		queryVideoPoseJobListResponse.setJobList(jobList);
	 
	 	return queryVideoPoseJobListResponse;
	}
}