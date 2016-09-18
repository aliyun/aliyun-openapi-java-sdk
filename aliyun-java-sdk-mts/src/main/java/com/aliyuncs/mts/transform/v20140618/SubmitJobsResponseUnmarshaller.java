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

import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Input;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Audio;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Clip;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Clip.TimeSpan;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Container;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Merge;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.MuxConfig;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.OutputFile;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Properties;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Properties.Format;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Properties.Streams;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Properties.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Properties.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Properties.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Properties.Streams.VideoStream.NetworkCost;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.SubtitleConfig;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.SubtitleConfig.ExtSubtitle;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.SubtitleConfig.Subtitle;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.SuperReso;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.TransConfig;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Video;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Video.BitrateBnd;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.WaterMark;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.WaterMark.InputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitJobsResponseUnmarshaller {

	public static SubmitJobsResponse unmarshall(SubmitJobsResponse submitJobsResponse, UnmarshallerContext context) {
		
		submitJobsResponse.setRequestId(context.stringValue("SubmitJobsResponse.RequestId"));

		List<JobResult> jobResultList = new ArrayList<JobResult>();
		for (int i = 0; i < context.lengthValue("SubmitJobsResponse.JobResultList.Length"); i++) {
			JobResult jobResult = new JobResult();
			jobResult.setSuccess(context.booleanValue("SubmitJobsResponse.JobResultList["+ i +"].Success"));
			jobResult.setCode(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Code"));
			jobResult.setMessage(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Message"));

			Job job = new Job();
			job.setJobId(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.JobId"));
			job.setState(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.State"));
			job.setCode(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Code"));
			job.setMessage(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Message"));
			job.setPercent(context.longValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Percent"));
			job.setPipelineId(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.PipelineId"));
			job.setCreationTime(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.CreationTime"));

			Input input = new Input();
			input.setBucket(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Input.Bucket"));
			input.setLocation(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Input.Location"));
			input.setObject(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Input.Object"));
			job.setInput(input);

			Output output = new Output();
			output.setTemplateId(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TemplateId"));
			output.setUserData(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.UserData"));
			output.setRotate(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Rotate"));
			output.setVideoStreamMap(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.VideoStreamMap"));
			output.setAudioStreamMap(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.AudioStreamMap"));
			output.setDeWatermark(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.DeWatermark"));
			output.setPriority(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Priority"));

			OutputFile outputFile = new OutputFile();
			outputFile.setBucket(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutputFile.Bucket"));
			outputFile.setLocation(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutputFile.Location"));
			outputFile.setObject(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutputFile.Object"));
			output.setOutputFile(outputFile);

			Properties properties = new Properties();
			properties.setWidth(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Width"));
			properties.setHeight(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Height"));
			properties.setBitrate(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Bitrate"));
			properties.setDuration(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Duration"));
			properties.setFps(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Fps"));
			properties.setFileSize(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.FileSize"));
			properties.setFileFormat(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.FileFormat"));

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < context.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setIndex(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setCodecName(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setCodecLongName(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setProfile(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setCodecTimeBase(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setCodecTagString(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setCodecTag(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setWidth(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setHeight(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setHasBFrames(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setSar(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setDar(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setPixFmt(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLevel(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Level"));
				videoStream.setFps(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setAvgFPS(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setTimebase(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setStartTime(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDuration(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setBitrate(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setNumFrames(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setLang(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Lang"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setCostBandwidth(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				networkCost.setAvgBitrate(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < context.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setIndex(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setCodecName(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setCodecTimeBase(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].CodecTimeBase"));
				audioStream.setCodecLongName(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setCodecTagString(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setCodecTag(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setSampleFmt(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setSamplerate(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setChannels(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setChannelLayout(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setTimebase(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setStartTime(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setDuration(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setBitrate(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setNumFrames(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setLang(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Lang"));

				audioStreamList.add(audioStream);
			}
			streams.setAudioStreamList(audioStreamList);

			List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
			for (int j = 0; j < context.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.SubtitleStreamList.Length"); j++) {
				SubtitleStream subtitleStream = new SubtitleStream();
				subtitleStream.setIndex(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.SubtitleStreamList["+ j +"].Index"));
				subtitleStream.setLang(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.SubtitleStreamList["+ j +"].Lang"));

				subtitleStreamList.add(subtitleStream);
			}
			streams.setSubtitleStreamList(subtitleStreamList);
			properties.setStreams(streams);

			Format format = new Format();
			format.setNumStreams(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.NumStreams"));
			format.setNumPrograms(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.NumPrograms"));
			format.setFormatName(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.FormatName"));
			format.setFormatLongName(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.FormatLongName"));
			format.setStartTime(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.StartTime"));
			format.setDuration(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.Duration"));
			format.setSize(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.Size"));
			format.setBitrate(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.Bitrate"));
			properties.setFormat(format);
			output.setProperties(properties);

			Clip clip = new Clip();

			TimeSpan timeSpan = new TimeSpan();
			timeSpan.setSeek(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Clip.TimeSpan.Seek"));
			timeSpan.setDuration(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Clip.TimeSpan.Duration"));
			clip.setTimeSpan(timeSpan);
			output.setClip(clip);

			SuperReso superReso = new SuperReso();
			superReso.setIsHalfSample(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SuperReso.IsHalfSample"));
			output.setSuperReso(superReso);

			SubtitleConfig subtitleConfig = new SubtitleConfig();

			List<Subtitle> subtitleList = new ArrayList<Subtitle>();
			for (int j = 0; j < context.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.SubtitleList.Length"); j++) {
				Subtitle subtitle = new Subtitle();
				subtitle.setMap(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.SubtitleList["+ j +"].Map"));

				subtitleList.add(subtitle);
			}
			subtitleConfig.setSubtitleList(subtitleList);

			List<ExtSubtitle> extSubtitleList = new ArrayList<ExtSubtitle>();
			for (int j = 0; j < context.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.ExtSubtitleList.Length"); j++) {
				ExtSubtitle extSubtitle = new ExtSubtitle();

				com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.SubtitleConfig.ExtSubtitle.Input extSubtitleInput = new com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.SubtitleConfig.ExtSubtitle.Input();
				extSubtitleInput.setBucket(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Bucket"));
				extSubtitleInput.setLocation(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Location"));
				extSubtitleInput.setObject(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Object"));
				extSubtitle.setInput(extSubtitleInput);

				extSubtitleList.add(extSubtitle);
			}
			subtitleConfig.setExtSubtitleList(extSubtitleList);
			output.setSubtitleConfig(subtitleConfig);

			TransConfig transConfig = new TransConfig();
			transConfig.setTransMode(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.TransMode"));
			output.setTransConfig(transConfig);

			MuxConfig muxConfig = new MuxConfig();

			Segment segment = new Segment();
			segment.setDuration(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);

			Gif gif = new Gif();
			gif.setLoop(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MuxConfig.Gif.Loop"));
			gif.setFinalDelay(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MuxConfig.Gif.FinalDelay"));
			muxConfig.setGif(gif);
			output.setMuxConfig(muxConfig);

			Audio audio = new Audio();
			audio.setCodec(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Codec"));
			audio.setProfile(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Profile"));
			audio.setSamplerate(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Samplerate"));
			audio.setBitrate(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Bitrate"));
			audio.setChannels(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Channels"));
			audio.setQscale(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Qscale"));
			output.setAudio(audio);

			Video video = new Video();
			video.setCodec(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Codec"));
			video.setProfile(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Profile"));
			video.setBitrate(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Bitrate"));
			video.setCrf(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Crf"));
			video.setWidth(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Width"));
			video.setHeight(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Height"));
			video.setFps(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Fps"));
			video.setGop(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Gop"));
			video.setPreset(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Preset"));
			video.setScanMode(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.ScanMode"));
			video.setBufsize(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Bufsize"));
			video.setMaxrate(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Maxrate"));
			video.setPixFmt(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.PixFmt"));
			video.setDegrain(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Degrain"));
			video.setQscale(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Qscale"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.BitrateBnd.Max"));
			bitrateBnd.setMin(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			output.setVideo(video);

			Container container = new Container();
			container.setFormat(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Container.Format"));
			output.setContainer(container);

			List<WaterMark> waterMarkList = new ArrayList<WaterMark>();
			for (int j = 0; j < context.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList.Length"); j++) {
				WaterMark waterMark = new WaterMark();
				waterMark.setWaterMarkTemplateId(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].WaterMarkTemplateId"));
				waterMark.setWidth(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].Width"));
				waterMark.setHeight(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].Height"));
				waterMark.setDx(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].Dx"));
				waterMark.setDy(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].Dy"));
				waterMark.setReferPos(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].ReferPos"));
				waterMark.setType(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].Type"));

				InputFile inputFile = new InputFile();
				inputFile.setBucket(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].InputFile.Bucket"));
				inputFile.setLocation(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].InputFile.Location"));
				inputFile.setObject(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].InputFile.Object"));
				waterMark.setInputFile(inputFile);

				waterMarkList.add(waterMark);
			}
			output.setWaterMarkList(waterMarkList);

			List<Merge> mergeList = new ArrayList<Merge>();
			for (int j = 0; j < context.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MergeList.Length"); j++) {
				Merge merge = new Merge();
				merge.setMergeURL(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MergeList["+ j +"].MergeURL"));
				merge.setStart(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MergeList["+ j +"].Start"));
				merge.setDuration(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MergeList["+ j +"].Duration"));

				mergeList.add(merge);
			}
			output.setMergeList(mergeList);
			job.setOutput(output);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(context.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.MNSMessageResult.ErrorCode"));
			job.setMNSMessageResult(mNSMessageResult);
			jobResult.setJob(job);

			jobResultList.add(jobResult);
		}
		submitJobsResponse.setJobResultList(jobResultList);
	 
	 	return submitJobsResponse;
	}
}