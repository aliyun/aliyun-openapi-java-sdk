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

import com.aliyuncs.mts.model.v20140618.SearchJobResponse;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Input;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.Audio;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.Clip;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.Clip.TimeSpan;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.Container;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.Merge;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.MuxConfig;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.OutputFile;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.Properties;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.Properties.Format;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.Properties.Streams;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.Properties.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.Properties.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.Properties.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.Properties.Streams.VideoStream.NetworkCost;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.SubtitleConfig;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.SubtitleConfig.ExtSubtitle;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.SubtitleConfig.Subtitle;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.SuperReso;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.TransConfig;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.Video;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.Video.BitrateBnd;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.WaterMark;
import com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.WaterMark.InputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchJobResponseUnmarshaller {

	public static SearchJobResponse unmarshall(SearchJobResponse searchJobResponse, UnmarshallerContext context) {
		
		searchJobResponse.setRequestId(context.stringValue("SearchJobResponse.RequestId"));
		searchJobResponse.setTotalCount(context.longValue("SearchJobResponse.TotalCount"));
		searchJobResponse.setPageNumber(context.longValue("SearchJobResponse.PageNumber"));
		searchJobResponse.setPageSize(context.longValue("SearchJobResponse.PageSize"));

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("SearchJobResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setJobId(context.stringValue("SearchJobResponse.JobList["+ i +"].JobId"));
			job.setState(context.stringValue("SearchJobResponse.JobList["+ i +"].State"));
			job.setCode(context.stringValue("SearchJobResponse.JobList["+ i +"].Code"));
			job.setMessage(context.stringValue("SearchJobResponse.JobList["+ i +"].Message"));
			job.setPercent(context.longValue("SearchJobResponse.JobList["+ i +"].Percent"));
			job.setPipelineId(context.stringValue("SearchJobResponse.JobList["+ i +"].PipelineId"));
			job.setCreationTime(context.stringValue("SearchJobResponse.JobList["+ i +"].CreationTime"));

			Input input = new Input();
			input.setBucket(context.stringValue("SearchJobResponse.JobList["+ i +"].Input.Bucket"));
			input.setLocation(context.stringValue("SearchJobResponse.JobList["+ i +"].Input.Location"));
			input.setObject(context.stringValue("SearchJobResponse.JobList["+ i +"].Input.Object"));
			job.setInput(input);

			Output output = new Output();
			output.setTemplateId(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.TemplateId"));
			output.setUserData(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.UserData"));
			output.setRotate(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Rotate"));
			output.setVideoStreamMap(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.VideoStreamMap"));
			output.setAudioStreamMap(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.AudioStreamMap"));
			output.setDeWatermark(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.DeWatermark"));
			output.setPriority(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Priority"));

			OutputFile outputFile = new OutputFile();
			outputFile.setBucket(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.OutputFile.Bucket"));
			outputFile.setLocation(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.OutputFile.Location"));
			outputFile.setObject(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.OutputFile.Object"));
			output.setOutputFile(outputFile);

			Properties properties = new Properties();
			properties.setWidth(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Width"));
			properties.setHeight(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Height"));
			properties.setBitrate(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Bitrate"));
			properties.setDuration(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Duration"));
			properties.setFps(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Fps"));
			properties.setFileSize(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.FileSize"));
			properties.setFileFormat(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.FileFormat"));

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < context.lengthValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setIndex(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setCodecName(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setCodecLongName(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setProfile(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setCodecTimeBase(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setCodecTagString(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setCodecTag(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setWidth(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setHeight(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setHasBFrames(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setSar(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setDar(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setPixFmt(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLevel(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Level"));
				videoStream.setFps(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setAvgFPS(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setTimebase(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setStartTime(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDuration(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setBitrate(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setNumFrames(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setLang(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Lang"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setCostBandwidth(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				networkCost.setAvgBitrate(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < context.lengthValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setIndex(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setCodecName(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setCodecTimeBase(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].CodecTimeBase"));
				audioStream.setCodecLongName(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setCodecTagString(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setCodecTag(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setSampleFmt(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setSamplerate(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setChannels(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setChannelLayout(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setTimebase(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setStartTime(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setDuration(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setBitrate(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setNumFrames(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setLang(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].Lang"));

				audioStreamList.add(audioStream);
			}
			streams.setAudioStreamList(audioStreamList);

			List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
			for (int j = 0; j < context.lengthValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.SubtitleStreamList.Length"); j++) {
				SubtitleStream subtitleStream = new SubtitleStream();
				subtitleStream.setIndex(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.SubtitleStreamList["+ j +"].Index"));
				subtitleStream.setLang(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Streams.SubtitleStreamList["+ j +"].Lang"));

				subtitleStreamList.add(subtitleStream);
			}
			streams.setSubtitleStreamList(subtitleStreamList);
			properties.setStreams(streams);

			Format format = new Format();
			format.setNumStreams(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Format.NumStreams"));
			format.setNumPrograms(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Format.NumPrograms"));
			format.setFormatName(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Format.FormatName"));
			format.setFormatLongName(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Format.FormatLongName"));
			format.setStartTime(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Format.StartTime"));
			format.setDuration(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Format.Duration"));
			format.setSize(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Format.Size"));
			format.setBitrate(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Properties.Format.Bitrate"));
			properties.setFormat(format);
			output.setProperties(properties);

			Clip clip = new Clip();

			TimeSpan timeSpan = new TimeSpan();
			timeSpan.setSeek(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Clip.TimeSpan.Seek"));
			timeSpan.setDuration(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Clip.TimeSpan.Duration"));
			clip.setTimeSpan(timeSpan);
			output.setClip(clip);

			SuperReso superReso = new SuperReso();
			superReso.setIsHalfSample(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.SuperReso.IsHalfSample"));
			output.setSuperReso(superReso);

			SubtitleConfig subtitleConfig = new SubtitleConfig();

			List<Subtitle> subtitleList = new ArrayList<Subtitle>();
			for (int j = 0; j < context.lengthValue("SearchJobResponse.JobList["+ i +"].Output.SubtitleConfig.SubtitleList.Length"); j++) {
				Subtitle subtitle = new Subtitle();
				subtitle.setMap(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.SubtitleConfig.SubtitleList["+ j +"].Map"));

				subtitleList.add(subtitle);
			}
			subtitleConfig.setSubtitleList(subtitleList);

			List<ExtSubtitle> extSubtitleList = new ArrayList<ExtSubtitle>();
			for (int j = 0; j < context.lengthValue("SearchJobResponse.JobList["+ i +"].Output.SubtitleConfig.ExtSubtitleList.Length"); j++) {
				ExtSubtitle extSubtitle = new ExtSubtitle();

				com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.SubtitleConfig.ExtSubtitle.Input extSubtitleInput = new com.aliyuncs.mts.model.v20140618.SearchJobResponse.Job.Output.SubtitleConfig.ExtSubtitle.Input();
				extSubtitleInput.setBucket(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Bucket"));
				extSubtitleInput.setLocation(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Location"));
				extSubtitleInput.setObject(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Object"));
				extSubtitle.setInput(extSubtitleInput);

				extSubtitleList.add(extSubtitle);
			}
			subtitleConfig.setExtSubtitleList(extSubtitleList);
			output.setSubtitleConfig(subtitleConfig);

			TransConfig transConfig = new TransConfig();
			transConfig.setTransMode(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.TransConfig.TransMode"));
			output.setTransConfig(transConfig);

			MuxConfig muxConfig = new MuxConfig();

			Segment segment = new Segment();
			segment.setDuration(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);

			Gif gif = new Gif();
			gif.setLoop(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.MuxConfig.Gif.Loop"));
			gif.setFinalDelay(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.MuxConfig.Gif.FinalDelay"));
			muxConfig.setGif(gif);
			output.setMuxConfig(muxConfig);

			Audio audio = new Audio();
			audio.setCodec(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Audio.Codec"));
			audio.setProfile(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Audio.Profile"));
			audio.setSamplerate(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Audio.Samplerate"));
			audio.setBitrate(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Audio.Bitrate"));
			audio.setChannels(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Audio.Channels"));
			audio.setQscale(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Audio.Qscale"));
			output.setAudio(audio);

			Video video = new Video();
			video.setCodec(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.Codec"));
			video.setProfile(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.Profile"));
			video.setBitrate(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.Bitrate"));
			video.setCrf(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.Crf"));
			video.setWidth(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.Width"));
			video.setHeight(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.Height"));
			video.setFps(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.Fps"));
			video.setGop(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.Gop"));
			video.setPreset(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.Preset"));
			video.setScanMode(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.ScanMode"));
			video.setBufsize(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.Bufsize"));
			video.setMaxrate(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.Maxrate"));
			video.setPixFmt(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.PixFmt"));
			video.setDegrain(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.Degrain"));
			video.setQscale(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.Qscale"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.BitrateBnd.Max"));
			bitrateBnd.setMin(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			output.setVideo(video);

			Container container = new Container();
			container.setFormat(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.Container.Format"));
			output.setContainer(container);

			List<WaterMark> waterMarkList = new ArrayList<WaterMark>();
			for (int j = 0; j < context.lengthValue("SearchJobResponse.JobList["+ i +"].Output.WaterMarkList.Length"); j++) {
				WaterMark waterMark = new WaterMark();
				waterMark.setWaterMarkTemplateId(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].WaterMarkTemplateId"));
				waterMark.setWidth(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].Width"));
				waterMark.setHeight(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].Height"));
				waterMark.setDx(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].Dx"));
				waterMark.setDy(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].Dy"));
				waterMark.setReferPos(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].ReferPos"));
				waterMark.setType(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].Type"));

				InputFile inputFile = new InputFile();
				inputFile.setBucket(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].InputFile.Bucket"));
				inputFile.setLocation(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].InputFile.Location"));
				inputFile.setObject(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].InputFile.Object"));
				waterMark.setInputFile(inputFile);

				waterMarkList.add(waterMark);
			}
			output.setWaterMarkList(waterMarkList);

			List<Merge> mergeList = new ArrayList<Merge>();
			for (int j = 0; j < context.lengthValue("SearchJobResponse.JobList["+ i +"].Output.MergeList.Length"); j++) {
				Merge merge = new Merge();
				merge.setMergeURL(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.MergeList["+ j +"].MergeURL"));
				merge.setStart(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.MergeList["+ j +"].Start"));
				merge.setDuration(context.stringValue("SearchJobResponse.JobList["+ i +"].Output.MergeList["+ j +"].Duration"));

				mergeList.add(merge);
			}
			output.setMergeList(mergeList);
			job.setOutput(output);

			jobList.add(job);
		}
		searchJobResponse.setJobList(jobList);
	 
	 	return searchJobResponse;
	}
}