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

import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Input;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.Audio;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.Clip;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.Clip.TimeSpan;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.Container;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.MuxConfig;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.OutputFile;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.Properties;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.Properties.Format;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.Properties.Streams;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.Properties.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.Properties.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.Properties.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.Properties.Streams.VideoStream.NetworkCost;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.SubtitleConfig;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.SubtitleConfig.ExtSubtitle;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.SubtitleConfig.Subtitle;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.SuperReso;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.TransConfig;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.Video;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.Video.BitrateBnd;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.WaterMark;
import com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.WaterMark.InputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryJobListByFileResponseUnmarshaller {

	public static QueryJobListByFileResponse unmarshall(QueryJobListByFileResponse queryJobListByFileResponse, UnmarshallerContext context) {
		
		queryJobListByFileResponse.setRequestId(context.stringValue("QueryJobListByFileResponse.RequestId"));

		List<String> nonExistUploadFileObjects = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryJobListByFileResponse.NonExistUploadFileObjects.Length"); i++) {
			nonExistUploadFileObjects.add(context.stringValue("QueryJobListByFileResponse.NonExistUploadFileObjects["+ i +"]"));
		}
		queryJobListByFileResponse.setNonExistUploadFileObjects(nonExistUploadFileObjects);

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("QueryJobListByFileResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setUploadFileKey(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].UploadFileKey"));

			List<FileJob> fileJobList = new ArrayList<FileJob>();
			for (int j = 0; j < context.lengthValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList.Length"); j++) {
				FileJob fileJob = new FileJob();
				fileJob.setTemplateName(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TemplateName"));

				TranscodeJob transcodeJob = new TranscodeJob();
				transcodeJob.setJobId(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.JobId"));
				transcodeJob.setState(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.State"));
				transcodeJob.setCode(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Code"));
				transcodeJob.setMessage(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Message"));
				transcodeJob.setPercent(context.longValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Percent"));
				transcodeJob.setPipelineId(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.PipelineId"));
				transcodeJob.setCreationTime(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.CreationTime"));

				Input input = new Input();
				input.setBucket(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Input.Bucket"));
				input.setLocation(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Input.Location"));
				input.setObject(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Input.Object"));
				transcodeJob.setInput(input);

				Output output = new Output();
				output.setTemplateId(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.TemplateId"));
				output.setUserData(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.UserData"));
				output.setRotate(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Rotate"));
				output.setVideoStreamMap(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.VideoStreamMap"));
				output.setAudioStreamMap(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.AudioStreamMap"));
				output.setDeWatermark(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.DeWatermark"));
				output.setPriority(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Priority"));

				OutputFile outputFile = new OutputFile();
				outputFile.setBucket(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.OutputFile.Bucket"));
				outputFile.setLocation(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.OutputFile.Location"));
				outputFile.setObject(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.OutputFile.Object"));
				output.setOutputFile(outputFile);

				Properties properties = new Properties();
				properties.setWidth(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Width"));
				properties.setHeight(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Height"));
				properties.setBitrate(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Bitrate"));
				properties.setDuration(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Duration"));
				properties.setFps(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Fps"));
				properties.setFileSize(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.FileSize"));
				properties.setFileFormat(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.FileFormat"));

				Streams streams = new Streams();

				List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
				for (int k = 0; k < context.lengthValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList.Length"); k++) {
					VideoStream videoStream = new VideoStream();
					videoStream.setIndex(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].Index"));
					videoStream.setCodecName(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].CodecName"));
					videoStream.setCodecLongName(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].CodecLongName"));
					videoStream.setProfile(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].Profile"));
					videoStream.setCodecTimeBase(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].CodecTimeBase"));
					videoStream.setCodecTagString(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].CodecTagString"));
					videoStream.setCodecTag(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].CodecTag"));
					videoStream.setWidth(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].Width"));
					videoStream.setHeight(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].Height"));
					videoStream.setHasBFrames(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].HasBFrames"));
					videoStream.setSar(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].Sar"));
					videoStream.setDar(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].Dar"));
					videoStream.setPixFmt(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].PixFmt"));
					videoStream.setLevel(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].Level"));
					videoStream.setFps(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].Fps"));
					videoStream.setAvgFPS(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].AvgFPS"));
					videoStream.setTimebase(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].Timebase"));
					videoStream.setStartTime(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].StartTime"));
					videoStream.setDuration(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].Duration"));
					videoStream.setBitrate(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].Bitrate"));
					videoStream.setNumFrames(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].NumFrames"));
					videoStream.setLang(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].Lang"));

					NetworkCost networkCost = new NetworkCost();
					networkCost.setPreloadTime(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].NetworkCost.PreloadTime"));
					networkCost.setCostBandwidth(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].NetworkCost.CostBandwidth"));
					networkCost.setAvgBitrate(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.VideoStreamList["+ k +"].NetworkCost.AvgBitrate"));
					videoStream.setNetworkCost(networkCost);

					videoStreamList.add(videoStream);
				}
				streams.setVideoStreamList(videoStreamList);

				List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
				for (int k = 0; k < context.lengthValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList.Length"); k++) {
					AudioStream audioStream = new AudioStream();
					audioStream.setIndex(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList["+ k +"].Index"));
					audioStream.setCodecName(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList["+ k +"].CodecName"));
					audioStream.setCodecTimeBase(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList["+ k +"].CodecTimeBase"));
					audioStream.setCodecLongName(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList["+ k +"].CodecLongName"));
					audioStream.setCodecTagString(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList["+ k +"].CodecTagString"));
					audioStream.setCodecTag(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList["+ k +"].CodecTag"));
					audioStream.setSampleFmt(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList["+ k +"].SampleFmt"));
					audioStream.setSamplerate(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList["+ k +"].Samplerate"));
					audioStream.setChannels(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList["+ k +"].Channels"));
					audioStream.setChannelLayout(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList["+ k +"].ChannelLayout"));
					audioStream.setTimebase(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList["+ k +"].Timebase"));
					audioStream.setStartTime(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList["+ k +"].StartTime"));
					audioStream.setDuration(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList["+ k +"].Duration"));
					audioStream.setBitrate(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList["+ k +"].Bitrate"));
					audioStream.setNumFrames(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList["+ k +"].NumFrames"));
					audioStream.setLang(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.AudioStreamList["+ k +"].Lang"));

					audioStreamList.add(audioStream);
				}
				streams.setAudioStreamList(audioStreamList);

				List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
				for (int k = 0; k < context.lengthValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.SubtitleStreamList.Length"); k++) {
					SubtitleStream subtitleStream = new SubtitleStream();
					subtitleStream.setIndex(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.SubtitleStreamList["+ k +"].Index"));
					subtitleStream.setLang(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Streams.SubtitleStreamList["+ k +"].Lang"));

					subtitleStreamList.add(subtitleStream);
				}
				streams.setSubtitleStreamList(subtitleStreamList);
				properties.setStreams(streams);

				Format format = new Format();
				format.setNumStreams(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Format.NumStreams"));
				format.setNumPrograms(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Format.NumPrograms"));
				format.setFormatName(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Format.FormatName"));
				format.setFormatLongName(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Format.FormatLongName"));
				format.setStartTime(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Format.StartTime"));
				format.setDuration(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Format.Duration"));
				format.setSize(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Format.Size"));
				format.setBitrate(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Properties.Format.Bitrate"));
				properties.setFormat(format);
				output.setProperties(properties);

				Clip clip = new Clip();

				TimeSpan timeSpan = new TimeSpan();
				timeSpan.setSeek(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Clip.TimeSpan.Seek"));
				timeSpan.setDuration(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Clip.TimeSpan.Duration"));
				clip.setTimeSpan(timeSpan);
				output.setClip(clip);

				SuperReso superReso = new SuperReso();
				superReso.setIsHalfSample(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.SuperReso.IsHalfSample"));
				output.setSuperReso(superReso);

				SubtitleConfig subtitleConfig = new SubtitleConfig();

				List<Subtitle> subtitleList = new ArrayList<Subtitle>();
				for (int k = 0; k < context.lengthValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.SubtitleConfig.SubtitleList.Length"); k++) {
					Subtitle subtitle = new Subtitle();
					subtitle.setMap(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.SubtitleConfig.SubtitleList["+ k +"].Map"));

					subtitleList.add(subtitle);
				}
				subtitleConfig.setSubtitleList(subtitleList);

				List<ExtSubtitle> extSubtitleList = new ArrayList<ExtSubtitle>();
				for (int k = 0; k < context.lengthValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.SubtitleConfig.ExtSubtitleList.Length"); k++) {
					ExtSubtitle extSubtitle = new ExtSubtitle();

					com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.SubtitleConfig.ExtSubtitle.Input extSubtitleInput = new com.aliyuncs.mts.model.v20140618.QueryJobListByFileResponse.Job.FileJob.TranscodeJob.Output.SubtitleConfig.ExtSubtitle.Input();
					extSubtitleInput.setBucket(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.SubtitleConfig.ExtSubtitleList["+ k +"].Input.Bucket"));
					extSubtitleInput.setLocation(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.SubtitleConfig.ExtSubtitleList["+ k +"].Input.Location"));
					extSubtitleInput.setObject(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.SubtitleConfig.ExtSubtitleList["+ k +"].Input.Object"));
					extSubtitle.setInput(extSubtitleInput);

					extSubtitleList.add(extSubtitle);
				}
				subtitleConfig.setExtSubtitleList(extSubtitleList);
				output.setSubtitleConfig(subtitleConfig);

				TransConfig transConfig = new TransConfig();
				transConfig.setTransMode(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.TransConfig.TransMode"));
				output.setTransConfig(transConfig);

				MuxConfig muxConfig = new MuxConfig();

				Segment segment = new Segment();
				segment.setDuration(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.MuxConfig.Segment.Duration"));
				muxConfig.setSegment(segment);

				Gif gif = new Gif();
				gif.setLoop(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.MuxConfig.Gif.Loop"));
				gif.setFinalDelay(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.MuxConfig.Gif.FinalDelay"));
				muxConfig.setGif(gif);
				output.setMuxConfig(muxConfig);

				Audio audio = new Audio();
				audio.setCodec(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Audio.Codec"));
				audio.setProfile(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Audio.Profile"));
				audio.setSamplerate(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Audio.Samplerate"));
				audio.setBitrate(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Audio.Bitrate"));
				audio.setChannels(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Audio.Channels"));
				audio.setQscale(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Audio.Qscale"));
				output.setAudio(audio);

				Video video = new Video();
				video.setCodec(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.Codec"));
				video.setProfile(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.Profile"));
				video.setBitrate(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.Bitrate"));
				video.setCrf(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.Crf"));
				video.setWidth(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.Width"));
				video.setHeight(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.Height"));
				video.setFps(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.Fps"));
				video.setGop(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.Gop"));
				video.setPreset(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.Preset"));
				video.setScanMode(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.ScanMode"));
				video.setBufsize(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.Bufsize"));
				video.setMaxrate(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.Maxrate"));
				video.setPixFmt(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.PixFmt"));
				video.setDegrain(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.Degrain"));
				video.setQscale(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.Qscale"));

				BitrateBnd bitrateBnd = new BitrateBnd();
				bitrateBnd.setMax(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.BitrateBnd.Max"));
				bitrateBnd.setMin(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Video.BitrateBnd.Min"));
				video.setBitrateBnd(bitrateBnd);
				output.setVideo(video);

				Container container = new Container();
				container.setFormat(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.Container.Format"));
				output.setContainer(container);

				List<WaterMark> waterMarkList = new ArrayList<WaterMark>();
				for (int k = 0; k < context.lengthValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.WaterMarkList.Length"); k++) {
					WaterMark waterMark = new WaterMark();
					waterMark.setWaterMarkTemplateId(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.WaterMarkList["+ k +"].WaterMarkTemplateId"));

					InputFile inputFile = new InputFile();
					inputFile.setBucket(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.WaterMarkList["+ k +"].InputFile.Bucket"));
					inputFile.setLocation(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.WaterMarkList["+ k +"].InputFile.Location"));
					inputFile.setObject(context.stringValue("QueryJobListByFileResponse.JobList["+ i +"].FileJobList["+ j +"].TranscodeJob.Output.WaterMarkList["+ k +"].InputFile.Object"));
					waterMark.setInputFile(inputFile);

					waterMarkList.add(waterMark);
				}
				output.setWaterMarkList(waterMarkList);
				transcodeJob.setOutput(output);
				fileJob.setTranscodeJob(transcodeJob);

				fileJobList.add(fileJob);
			}
			job.setFileJobList(fileJobList);

			jobList.add(job);
		}
		queryJobListByFileResponse.setJobList(jobList);
	 
	 	return queryJobListByFileResponse;
	}
}