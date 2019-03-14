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

import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.ComplexEditingConfigsItem;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.ComplexEditingConfigsItem.Editing;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.ComplexEditingConfigsItem.Editing.Clip;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.ComplexEditingConfigsItem.Editing.Clip.Effect;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.ComplexEditingConfigsItem.Editing.Timeline;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.ComplexEditingConfigsItem.Editing.Timeline.TimelineConfig;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.ComplexEditingConfigsItem.Editing.Timeline.TimelineConfig.TimelineConfigAudio;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.ComplexEditingConfigsItem.Editing.Timeline.TimelineConfig.TimelineConfigVideo;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.ComplexEditingConfigsItem.Editing.Timeline.Track;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.ComplexEditingConfigsItem.Editing.Timeline.Track.Clip1;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.ComplexEditingConfigsItem.Editing.Timeline.Track.Clip1.ClipsConfig;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.ComplexEditingConfigsItem.Editing.Timeline.Track.Clip1.ClipsConfig.ClipsConfigVideo;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.InputsItem;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.InputsItem.EditingInput;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.InputsItem.EditingInput.InputConfig;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.InputsItem.EditingInput.InputFile;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.Audio;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.Audio.Volume;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.Clip4;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.Clip4.TimeSpan;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.Container;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.DigiWaterMark;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.DigiWaterMark.InputFile3;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.Encryption;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.M3U8NonStandardSupport;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.M3U8NonStandardSupport.TS;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.Merge;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.MuxConfig;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.OutputFile;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.Properties;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.Properties.Format;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.Properties.Streams;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.Properties.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.Properties.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.Properties.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.Properties.Streams.VideoStream.NetworkCost;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.SubtitleConfig;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.SubtitleConfig.ExtSubtitle;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.SubtitleConfig.ExtSubtitle.Input;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.SubtitleConfig.Subtitle;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.SuperReso;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.TransConfig;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.Video;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.Video.BitrateBnd;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.WaterMark;
import com.aliyuncs.mts.model.v20140618.QueryComplexJobListResponse.Job.TranscodeOutput.WaterMark.InputFile2;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryComplexJobListResponseUnmarshaller {

	public static QueryComplexJobListResponse unmarshall(QueryComplexJobListResponse queryComplexJobListResponse, UnmarshallerContext context) {
		
		queryComplexJobListResponse.setRequestId(context.stringValue("QueryComplexJobListResponse.RequestId"));

		List<String> nonExistJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryComplexJobListResponse.NonExistJobIds.Length"); i++) {
			nonExistJobIds.add(context.stringValue("QueryComplexJobListResponse.NonExistJobIds["+ i +"]"));
		}
		queryComplexJobListResponse.setNonExistJobIds(nonExistJobIds);

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("QueryComplexJobListResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setJobId(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].JobId"));
			job.setState(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].State"));
			job.setCode(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].Code"));
			job.setMessage(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].Message"));
			job.setPercent(context.longValue("QueryComplexJobListResponse.JobList["+ i +"].Percent"));
			job.setPipelineId(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].PipelineId"));
			job.setCreationTime(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].CreationTime"));
			job.setFinishTime(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].FinishTime"));

			TranscodeOutput transcodeOutput = new TranscodeOutput();
			transcodeOutput.setTemplateId(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TemplateId"));
			transcodeOutput.setUserData(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.UserData"));
			transcodeOutput.setRotate(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Rotate"));
			transcodeOutput.setVideoStreamMap(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.VideoStreamMap"));
			transcodeOutput.setAudioStreamMap(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.AudioStreamMap"));
			transcodeOutput.setDeWatermark(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.DeWatermark"));
			transcodeOutput.setPriority(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Priority"));
			transcodeOutput.setWaterMarkConfigUrl(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkConfigUrl"));
			transcodeOutput.setMergeConfigUrl(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MergeConfigUrl"));

			DigiWaterMark digiWaterMark = new DigiWaterMark();
			digiWaterMark.setType(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.DigiWaterMark.Type"));
			digiWaterMark.setAlpha(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.DigiWaterMark.Alpha"));

			InputFile3 inputFile3 = new InputFile3();
			inputFile3.setBucket(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.DigiWaterMark.InputFile.Bucket"));
			inputFile3.setLocation(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.DigiWaterMark.InputFile.Location"));
			inputFile3.setObject(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.DigiWaterMark.InputFile.Object"));
			digiWaterMark.setInputFile3(inputFile3);
			transcodeOutput.setDigiWaterMark(digiWaterMark);

			OutputFile outputFile = new OutputFile();
			outputFile.setBucket(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.OutputFile.Bucket"));
			outputFile.setLocation(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.OutputFile.Location"));
			outputFile.setObject(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.OutputFile.Object"));
			outputFile.setRoleArn(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.OutputFile.RoleArn"));
			transcodeOutput.setOutputFile(outputFile);

			M3U8NonStandardSupport m3U8NonStandardSupport = new M3U8NonStandardSupport();

			TS tS = new TS();
			tS.setMd5Support(context.booleanValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.M3U8NonStandardSupport.TS.Md5Support"));
			tS.setSizeSupport(context.booleanValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.M3U8NonStandardSupport.TS.SizeSupport"));
			m3U8NonStandardSupport.setTS(tS);
			transcodeOutput.setM3U8NonStandardSupport(m3U8NonStandardSupport);

			Properties properties = new Properties();
			properties.setWidth(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Width"));
			properties.setHeight(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Height"));
			properties.setBitrate(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Bitrate"));
			properties.setDuration(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Duration"));
			properties.setFps(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Fps"));
			properties.setFileSize(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.FileSize"));
			properties.setFileFormat(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.FileFormat"));

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < context.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setIndex(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setCodecName(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setCodecLongName(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setProfile(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setCodecTimeBase(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setCodecTagString(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setCodecTag(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setWidth(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setHeight(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setHasBFrames(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setSar(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setDar(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setPixFmt(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLevel(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Level"));
				videoStream.setFps(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setAvgFPS(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setTimebase(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setStartTime(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDuration(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setBitrate(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setNumFrames(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setLang(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Lang"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setCostBandwidth(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				networkCost.setAvgBitrate(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < context.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setIndex(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setCodecName(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setCodecTimeBase(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].CodecTimeBase"));
				audioStream.setCodecLongName(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setCodecTagString(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setCodecTag(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setSampleFmt(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setSamplerate(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setChannels(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setChannelLayout(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setTimebase(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setStartTime(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setDuration(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setBitrate(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setNumFrames(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setLang(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].Lang"));

				audioStreamList.add(audioStream);
			}
			streams.setAudioStreamList(audioStreamList);

			List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
			for (int j = 0; j < context.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.SubtitleStreamList.Length"); j++) {
				SubtitleStream subtitleStream = new SubtitleStream();
				subtitleStream.setIndex(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.SubtitleStreamList["+ j +"].Index"));
				subtitleStream.setLang(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.SubtitleStreamList["+ j +"].Lang"));

				subtitleStreamList.add(subtitleStream);
			}
			streams.setSubtitleStreamList(subtitleStreamList);
			properties.setStreams(streams);

			Format format = new Format();
			format.setNumStreams(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Format.NumStreams"));
			format.setNumPrograms(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Format.NumPrograms"));
			format.setFormatName(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Format.FormatName"));
			format.setFormatLongName(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Format.FormatLongName"));
			format.setStartTime(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Format.StartTime"));
			format.setDuration(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Format.Duration"));
			format.setSize(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Format.Size"));
			format.setBitrate(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Format.Bitrate"));
			properties.setFormat(format);
			transcodeOutput.setProperties(properties);

			Clip4 clip4 = new Clip4();

			TimeSpan timeSpan = new TimeSpan();
			timeSpan.setSeek(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Clip.TimeSpan.Seek"));
			timeSpan.setDuration(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Clip.TimeSpan.Duration"));
			clip4.setTimeSpan(timeSpan);
			transcodeOutput.setClip4(clip4);

			SuperReso superReso = new SuperReso();
			superReso.setIsHalfSample(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SuperReso.IsHalfSample"));
			transcodeOutput.setSuperReso(superReso);

			SubtitleConfig subtitleConfig = new SubtitleConfig();

			List<Subtitle> subtitleList = new ArrayList<Subtitle>();
			for (int j = 0; j < context.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SubtitleConfig.SubtitleList.Length"); j++) {
				Subtitle subtitle = new Subtitle();
				subtitle.setMap(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SubtitleConfig.SubtitleList["+ j +"].Map"));

				subtitleList.add(subtitle);
			}
			subtitleConfig.setSubtitleList(subtitleList);

			List<ExtSubtitle> extSubtitleList = new ArrayList<ExtSubtitle>();
			for (int j = 0; j < context.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SubtitleConfig.ExtSubtitleList.Length"); j++) {
				ExtSubtitle extSubtitle = new ExtSubtitle();
				extSubtitle.setFontName(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SubtitleConfig.ExtSubtitleList["+ j +"].FontName"));
				extSubtitle.setCharEnc(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SubtitleConfig.ExtSubtitleList["+ j +"].CharEnc"));

				Input input = new Input();
				input.setBucket(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Bucket"));
				input.setLocation(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Location"));
				input.setObject(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Object"));
				extSubtitle.setInput(input);

				extSubtitleList.add(extSubtitle);
			}
			subtitleConfig.setExtSubtitleList(extSubtitleList);
			transcodeOutput.setSubtitleConfig(subtitleConfig);

			TransConfig transConfig = new TransConfig();
			transConfig.setTransMode(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.TransMode"));
			transConfig.setIsCheckReso(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.IsCheckReso"));
			transConfig.setIsCheckResoFail(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.IsCheckResoFail"));
			transConfig.setIsCheckVideoBitrate(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.IsCheckVideoBitrate"));
			transConfig.setIsCheckAudioBitrate(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.IsCheckAudioBitrate"));
			transConfig.setAdjDarMethod(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.AdjDarMethod"));
			transConfig.setIsCheckVideoBitrateFail(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.IsCheckVideoBitrateFail"));
			transConfig.setIsCheckAudioBitrateFail(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.IsCheckAudioBitrateFail"));
			transConfig.setDuration(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.Duration"));
			transcodeOutput.setTransConfig(transConfig);

			MuxConfig muxConfig = new MuxConfig();

			Segment segment = new Segment();
			segment.setDuration(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);

			Gif gif = new Gif();
			gif.setLoop(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MuxConfig.Gif.Loop"));
			gif.setFinalDelay(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MuxConfig.Gif.FinalDelay"));
			gif.setIsCustomPalette(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MuxConfig.Gif.IsCustomPalette"));
			gif.setDitherMode(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MuxConfig.Gif.DitherMode"));
			muxConfig.setGif(gif);
			transcodeOutput.setMuxConfig(muxConfig);

			Audio audio = new Audio();
			audio.setCodec(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Audio.Codec"));
			audio.setProfile(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Audio.Profile"));
			audio.setSamplerate(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Audio.Samplerate"));
			audio.setBitrate(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Audio.Bitrate"));
			audio.setChannels(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Audio.Channels"));
			audio.setQscale(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Audio.Qscale"));

			Volume volume = new Volume();
			volume.setLevel(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Audio.Volume.Level"));
			volume.setMethod(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Audio.Volume.Method"));
			audio.setVolume(volume);
			transcodeOutput.setAudio(audio);

			Video video = new Video();
			video.setCodec(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Codec"));
			video.setProfile(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Profile"));
			video.setBitrate(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Bitrate"));
			video.setCrf(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Crf"));
			video.setWidth(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Width"));
			video.setHeight(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Height"));
			video.setFps(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Fps"));
			video.setGop(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Gop"));
			video.setPreset(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Preset"));
			video.setScanMode(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.ScanMode"));
			video.setBufsize(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Bufsize"));
			video.setMaxrate(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Maxrate"));
			video.setPixFmt(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.PixFmt"));
			video.setDegrain(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Degrain"));
			video.setQscale(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Qscale"));
			video.setCrop(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Crop"));
			video.setPad(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Pad"));
			video.setMaxFps(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.MaxFps"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.BitrateBnd.Max"));
			bitrateBnd.setMin(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			transcodeOutput.setVideo(video);

			Container container = new Container();
			container.setFormat(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Container.Format"));
			transcodeOutput.setContainer(container);

			Encryption encryption = new Encryption();
			encryption.setType(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Encryption.Type"));
			encryption.setId(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Encryption.Id"));
			encryption.setKey(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Encryption.Key"));
			encryption.setKeyUri(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Encryption.KeyUri"));
			encryption.setKeyType(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Encryption.KeyType"));
			encryption.setSkipCnt(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Encryption.SkipCnt"));
			transcodeOutput.setEncryption(encryption);

			List<WaterMark> waterMarkList = new ArrayList<WaterMark>();
			for (int j = 0; j < context.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList.Length"); j++) {
				WaterMark waterMark = new WaterMark();
				waterMark.setWaterMarkTemplateId(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].WaterMarkTemplateId"));
				waterMark.setWidth(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].Width"));
				waterMark.setHeight(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].Height"));
				waterMark.setDx(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].Dx"));
				waterMark.setDy(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].Dy"));
				waterMark.setReferPos(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].ReferPos"));
				waterMark.setType(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].Type"));

				InputFile2 inputFile2 = new InputFile2();
				inputFile2.setBucket(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].InputFile.Bucket"));
				inputFile2.setLocation(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].InputFile.Location"));
				inputFile2.setObject(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].InputFile.Object"));
				waterMark.setInputFile2(inputFile2);

				waterMarkList.add(waterMark);
			}
			transcodeOutput.setWaterMarkList(waterMarkList);

			List<Merge> mergeList = new ArrayList<Merge>();
			for (int j = 0; j < context.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MergeList.Length"); j++) {
				Merge merge = new Merge();
				merge.setMergeURL(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MergeList["+ j +"].MergeURL"));
				merge.setStart(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MergeList["+ j +"].Start"));
				merge.setDuration(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MergeList["+ j +"].Duration"));
				merge.setRoleArn(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MergeList["+ j +"].RoleArn"));

				mergeList.add(merge);
			}
			transcodeOutput.setMergeList(mergeList);
			job.setTranscodeOutput(transcodeOutput);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].MNSMessageResult.ErrorCode"));
			job.setMNSMessageResult(mNSMessageResult);

			List<InputsItem> inputs = new ArrayList<InputsItem>();
			for (int j = 0; j < context.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].Inputs.Length"); j++) {
				InputsItem inputsItem = new InputsItem();

				List<EditingInput> editingInputs = new ArrayList<EditingInput>();
				for (int k = 0; k < context.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].Inputs["+ j +"].EditingInputs.Length"); k++) {
					EditingInput editingInput = new EditingInput();
					editingInput.setId(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].Inputs["+ j +"].EditingInputs["+ k +"].Id"));

					InputFile inputFile = new InputFile();
					inputFile.setBucket(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].Inputs["+ j +"].EditingInputs["+ k +"].InputFile.Bucket"));
					inputFile.setLocation(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].Inputs["+ j +"].EditingInputs["+ k +"].InputFile.Location"));
					inputFile.setObject(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].Inputs["+ j +"].EditingInputs["+ k +"].InputFile.Object"));
					editingInput.setInputFile(inputFile);

					InputConfig inputConfig = new InputConfig();
					inputConfig.setDeinterlaceMethod(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].Inputs["+ j +"].EditingInputs["+ k +"].InputConfig.DeinterlaceMethod"));
					inputConfig.setIsNormalSar(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].Inputs["+ j +"].EditingInputs["+ k +"].InputConfig.IsNormalSar"));
					editingInput.setInputConfig(inputConfig);

					editingInputs.add(editingInput);
				}
				inputsItem.setEditingInputs(editingInputs);

				inputs.add(inputsItem);
			}
			job.setInputs(inputs);

			List<ComplexEditingConfigsItem> complexEditingConfigs = new ArrayList<ComplexEditingConfigsItem>();
			for (int j = 0; j < context.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs.Length"); j++) {
				ComplexEditingConfigsItem complexEditingConfigsItem = new ComplexEditingConfigsItem();

				Editing editing = new Editing();

				Timeline timeline = new Timeline();

				TimelineConfig timelineConfig = new TimelineConfig();

				TimelineConfigVideo timelineConfigVideo = new TimelineConfigVideo();
				timelineConfigVideo.setWidth(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.Width"));
				timelineConfigVideo.setHeight(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.Height"));
				timelineConfigVideo.setBgColor(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.BgColor"));
				timelineConfigVideo.setFps(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.Fps"));
				timelineConfigVideo.setRenderRatio(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.RenderRatio"));
				timelineConfigVideo.setReclosePrec(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.ReclosePrec"));
				timelineConfigVideo.setIsGpuData(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.IsGpuData"));
				timelineConfigVideo.setIsOneTrackData(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.IsOneTrackData"));
				timelineConfig.setTimelineConfigVideo(timelineConfigVideo);

				TimelineConfigAudio timelineConfigAudio = new TimelineConfigAudio();
				timelineConfigAudio.setSamplerate(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigAudio.Samplerate"));
				timelineConfigAudio.setChannelLayout(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigAudio.ChannelLayout"));
				timelineConfigAudio.setChannels(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigAudio.Channels"));
				timelineConfig.setTimelineConfigAudio(timelineConfigAudio);
				timeline.setTimelineConfig(timelineConfig);

				List<Track> trackList = new ArrayList<Track>();
				for (int k = 0; k < context.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList.Length"); k++) {
					Track track = new Track();
					track.setId(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Id"));
					track.setType(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Type"));
					track.setOrder(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Order"));

					List<Clip1> clips = new ArrayList<Clip1>();
					for (int l = 0; l < context.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Clips.Length"); l++) {
						Clip1 clip1 = new Clip1();
						clip1.setClipID(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Clips["+ l +"].clipID"));
						clip1.setIn(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Clips["+ l +"].In"));
						clip1.setOut(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Clips["+ l +"].Out"));

						ClipsConfig clipsConfig = new ClipsConfig();

						ClipsConfigVideo clipsConfigVideo = new ClipsConfigVideo();
						clipsConfigVideo.setL(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Clips["+ l +"].ClipsConfig.ClipsConfigVideo.L"));
						clipsConfigVideo.setT(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Clips["+ l +"].ClipsConfig.ClipsConfigVideo.T"));
						clipsConfig.setClipsConfigVideo(clipsConfigVideo);
						clip1.setClipsConfig(clipsConfig);

						clips.add(clip1);
					}
					track.setClips(clips);

					trackList.add(track);
				}
				timeline.setTrackList(trackList);
				editing.setTimeline(timeline);

				List<Clip> clipList = new ArrayList<Clip>();
				for (int k = 0; k < context.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList.Length"); k++) {
					Clip clip = new Clip();
					clip.setId(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].Id"));
					clip.setType(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].Type"));
					clip.setSourceType(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].SourceType"));
					clip.setSourceID(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].SourceID"));
					clip.setSourceStrmMap(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].SourceStrmMap"));
					clip.setIn(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].In"));
					clip.setOut(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].Out"));

					List<Effect> effects = new ArrayList<Effect>();
					for (int l = 0; l < context.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].Effects.Length"); l++) {
						Effect effect = new Effect();
						effect.setEffect(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].Effects["+ l +"].Effect"));
						effect.setEffectConfig(context.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].Effects["+ l +"].EffectConfig"));

						effects.add(effect);
					}
					clip.setEffects(effects);

					clipList.add(clip);
				}
				editing.setClipList(clipList);
				complexEditingConfigsItem.setEditing(editing);

				complexEditingConfigs.add(complexEditingConfigsItem);
			}
			job.setComplexEditingConfigs(complexEditingConfigs);

			jobList.add(job);
		}
		queryComplexJobListResponse.setJobList(jobList);
	 
	 	return queryComplexJobListResponse;
	}
}