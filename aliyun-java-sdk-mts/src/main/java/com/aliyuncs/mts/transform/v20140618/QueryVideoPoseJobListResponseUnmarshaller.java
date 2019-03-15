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

	public static QueryVideoPoseJobListResponse unmarshall(QueryVideoPoseJobListResponse queryVideoPoseJobListResponse, UnmarshallerContext context) {
		
		queryVideoPoseJobListResponse.setRequestId(context.stringValue("QueryVideoPoseJobListResponse.RequestId"));

		List<String> nonExistJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryVideoPoseJobListResponse.NonExistJobIds.Length"); i++) {
			nonExistJobIds.add(context.stringValue("QueryVideoPoseJobListResponse.NonExistJobIds["+ i +"]"));
		}
		queryVideoPoseJobListResponse.setNonExistJobIds(nonExistJobIds);

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("QueryVideoPoseJobListResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setJobId(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].JobId"));
			job.setPipelineId(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].PipelineId"));
			job.setUserData(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].UserData"));
			job.setState(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].State"));

			Input input = new Input();
			input.setBucket(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Input.Bucket"));
			input.setLocation(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Input.Location"));
			input.setObject(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Input.Object"));
			input.setRoleArn(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Input.RoleArn"));
			job.setInput(input);

			OutputConfig outputConfig = new OutputConfig();

			VideoFile videoFile = new VideoFile();
			videoFile.setBucket(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].OutputConfig.VideoFile.Bucket"));
			videoFile.setLocation(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].OutputConfig.VideoFile.Location"));
			videoFile.setObject(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].OutputConfig.VideoFile.Object"));
			videoFile.setRoleArn(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].OutputConfig.VideoFile.RoleArn"));
			outputConfig.setVideoFile(videoFile);

			DataFile dataFile = new DataFile();
			dataFile.setBucket(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].OutputConfig.DataFile.Bucket"));
			dataFile.setLocation(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].OutputConfig.DataFile.Location"));
			dataFile.setObject(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].OutputConfig.DataFile.Object"));
			dataFile.setRoleArn(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].OutputConfig.DataFile.RoleArn"));
			outputConfig.setDataFile(dataFile);
			job.setOutputConfig(outputConfig);

			Properties properties = new Properties();
			properties.setWidth(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Width"));
			properties.setHeight(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Height"));
			properties.setBitrate(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Bitrate"));
			properties.setDuration(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Duration"));
			properties.setFps(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Fps"));
			properties.setFileSize(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.FileSize"));
			properties.setFileFormat(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.FileFormat"));

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < context.lengthValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setIndex(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setCodecName(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setCodecLongName(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setProfile(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setCodecTimeBase(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setCodecTagString(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setCodecTag(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setWidth(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setHeight(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setHasBFrames(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setSar(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setDar(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setPixFmt(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLevel(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Level"));
				videoStream.setFps(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setAvgFPS(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setTimebase(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setStartTime(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDuration(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setBitrate(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setNumFrames(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setLang(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Lang"));
				videoStream.setRotate(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].Rotate"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setCostBandwidth(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				networkCost.setAvgBitrate(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < context.lengthValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setIndex(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setCodecName(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setCodecTimeBase(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecTimeBase"));
				audioStream.setCodecLongName(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setCodecTagString(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setCodecTag(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setSampleFmt(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setSamplerate(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setChannels(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setChannelLayout(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setTimebase(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setStartTime(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setDuration(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setBitrate(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setNumFrames(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setLang(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.AudioStreamList["+ j +"].Lang"));

				audioStreamList.add(audioStream);
			}
			streams.setAudioStreamList(audioStreamList);

			List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
			for (int j = 0; j < context.lengthValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList.Length"); j++) {
				SubtitleStream subtitleStream = new SubtitleStream();
				subtitleStream.setIndex(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].Index"));
				subtitleStream.setCodecName(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].CodecName"));
				subtitleStream.setCodecTimeBase(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].CodecTimeBase"));
				subtitleStream.setCodecLongName(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].CodecLongName"));
				subtitleStream.setCodecTagString(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].CodecTagString"));
				subtitleStream.setCodecTag(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].CodecTag"));
				subtitleStream.setTimebase(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].Timebase"));
				subtitleStream.setStartTime(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].StartTime"));
				subtitleStream.setDuration(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].Duration"));
				subtitleStream.setLang(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Streams.SubtitleStreamList["+ j +"].Lang"));

				subtitleStreamList.add(subtitleStream);
			}
			streams.setSubtitleStreamList(subtitleStreamList);
			properties.setStreams(streams);

			Format format = new Format();
			format.setNumStreams(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Format.NumStreams"));
			format.setNumPrograms(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Format.NumPrograms"));
			format.setFormatName(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Format.FormatName"));
			format.setFormatLongName(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Format.FormatLongName"));
			format.setStartTime(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Format.StartTime"));
			format.setDuration(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Format.Duration"));
			format.setSize(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Format.Size"));
			format.setBitrate(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].Properties.Format.Bitrate"));
			properties.setFormat(format);
			job.setProperties(properties);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(context.stringValue("QueryVideoPoseJobListResponse.JobList["+ i +"].MNSMessageResult.ErrorCode"));
			job.setMNSMessageResult(mNSMessageResult);

			jobList.add(job);
		}
		queryVideoPoseJobListResponse.setJobList(jobList);
	 
	 	return queryVideoPoseJobListResponse;
	}
}