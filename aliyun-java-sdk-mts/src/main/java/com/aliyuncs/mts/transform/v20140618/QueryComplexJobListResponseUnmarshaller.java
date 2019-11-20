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

	public static QueryComplexJobListResponse unmarshall(QueryComplexJobListResponse queryComplexJobListResponse, UnmarshallerContext _ctx) {
		
		queryComplexJobListResponse.setRequestId(_ctx.stringValue("QueryComplexJobListResponse.RequestId"));

		List<String> nonExistJobIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryComplexJobListResponse.NonExistJobIds.Length"); i++) {
			nonExistJobIds.add(_ctx.stringValue("QueryComplexJobListResponse.NonExistJobIds["+ i +"]"));
		}
		queryComplexJobListResponse.setNonExistJobIds(nonExistJobIds);

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("QueryComplexJobListResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setJobId(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].JobId"));
			job.setState(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].State"));
			job.setCode(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].Code"));
			job.setMessage(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].Message"));
			job.setPercent(_ctx.longValue("QueryComplexJobListResponse.JobList["+ i +"].Percent"));
			job.setPipelineId(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].PipelineId"));
			job.setCreationTime(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].CreationTime"));
			job.setFinishTime(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].FinishTime"));

			TranscodeOutput transcodeOutput = new TranscodeOutput();
			transcodeOutput.setTemplateId(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TemplateId"));
			transcodeOutput.setUserData(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.UserData"));
			transcodeOutput.setRotate(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Rotate"));
			transcodeOutput.setVideoStreamMap(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.VideoStreamMap"));
			transcodeOutput.setAudioStreamMap(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.AudioStreamMap"));
			transcodeOutput.setDeWatermark(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.DeWatermark"));
			transcodeOutput.setPriority(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Priority"));
			transcodeOutput.setWaterMarkConfigUrl(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkConfigUrl"));
			transcodeOutput.setMergeConfigUrl(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MergeConfigUrl"));

			DigiWaterMark digiWaterMark = new DigiWaterMark();
			digiWaterMark.setType(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.DigiWaterMark.Type"));
			digiWaterMark.setAlpha(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.DigiWaterMark.Alpha"));

			InputFile3 inputFile3 = new InputFile3();
			inputFile3.setBucket(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.DigiWaterMark.InputFile.Bucket"));
			inputFile3.setLocation(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.DigiWaterMark.InputFile.Location"));
			inputFile3.setObject(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.DigiWaterMark.InputFile.Object"));
			digiWaterMark.setInputFile3(inputFile3);
			transcodeOutput.setDigiWaterMark(digiWaterMark);

			OutputFile outputFile = new OutputFile();
			outputFile.setBucket(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.OutputFile.Bucket"));
			outputFile.setLocation(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.OutputFile.Location"));
			outputFile.setObject(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.OutputFile.Object"));
			outputFile.setRoleArn(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.OutputFile.RoleArn"));
			transcodeOutput.setOutputFile(outputFile);

			M3U8NonStandardSupport m3U8NonStandardSupport = new M3U8NonStandardSupport();

			TS tS = new TS();
			tS.setMd5Support(_ctx.booleanValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.M3U8NonStandardSupport.TS.Md5Support"));
			tS.setSizeSupport(_ctx.booleanValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.M3U8NonStandardSupport.TS.SizeSupport"));
			m3U8NonStandardSupport.setTS(tS);
			transcodeOutput.setM3U8NonStandardSupport(m3U8NonStandardSupport);

			Properties properties = new Properties();
			properties.setWidth(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Width"));
			properties.setHeight(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Height"));
			properties.setBitrate(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Bitrate"));
			properties.setDuration(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Duration"));
			properties.setFps(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Fps"));
			properties.setFileSize(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.FileSize"));
			properties.setFileFormat(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.FileFormat"));

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < _ctx.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setIndex(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setCodecName(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setCodecLongName(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setProfile(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setCodecTimeBase(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setCodecTagString(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setCodecTag(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setWidth(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setHeight(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setHasBFrames(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setSar(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setDar(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setPixFmt(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLevel(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Level"));
				videoStream.setFps(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setAvgFPS(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setTimebase(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setStartTime(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDuration(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setBitrate(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setNumFrames(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setLang(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].Lang"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setCostBandwidth(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				networkCost.setAvgBitrate(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < _ctx.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setIndex(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setCodecName(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setCodecTimeBase(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].CodecTimeBase"));
				audioStream.setCodecLongName(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setCodecTagString(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setCodecTag(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setSampleFmt(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setSamplerate(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setChannels(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setChannelLayout(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setTimebase(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setStartTime(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setDuration(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setBitrate(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setNumFrames(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setLang(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.AudioStreamList["+ j +"].Lang"));

				audioStreamList.add(audioStream);
			}
			streams.setAudioStreamList(audioStreamList);

			List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
			for (int j = 0; j < _ctx.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.SubtitleStreamList.Length"); j++) {
				SubtitleStream subtitleStream = new SubtitleStream();
				subtitleStream.setIndex(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.SubtitleStreamList["+ j +"].Index"));
				subtitleStream.setLang(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Streams.SubtitleStreamList["+ j +"].Lang"));

				subtitleStreamList.add(subtitleStream);
			}
			streams.setSubtitleStreamList(subtitleStreamList);
			properties.setStreams(streams);

			Format format = new Format();
			format.setNumStreams(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Format.NumStreams"));
			format.setNumPrograms(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Format.NumPrograms"));
			format.setFormatName(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Format.FormatName"));
			format.setFormatLongName(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Format.FormatLongName"));
			format.setStartTime(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Format.StartTime"));
			format.setDuration(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Format.Duration"));
			format.setSize(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Format.Size"));
			format.setBitrate(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Properties.Format.Bitrate"));
			properties.setFormat(format);
			transcodeOutput.setProperties(properties);

			Clip4 clip4 = new Clip4();

			TimeSpan timeSpan = new TimeSpan();
			timeSpan.setSeek(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Clip.TimeSpan.Seek"));
			timeSpan.setDuration(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Clip.TimeSpan.Duration"));
			clip4.setTimeSpan(timeSpan);
			transcodeOutput.setClip4(clip4);

			SuperReso superReso = new SuperReso();
			superReso.setIsHalfSample(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SuperReso.IsHalfSample"));
			transcodeOutput.setSuperReso(superReso);

			SubtitleConfig subtitleConfig = new SubtitleConfig();

			List<Subtitle> subtitleList = new ArrayList<Subtitle>();
			for (int j = 0; j < _ctx.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SubtitleConfig.SubtitleList.Length"); j++) {
				Subtitle subtitle = new Subtitle();
				subtitle.setMap(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SubtitleConfig.SubtitleList["+ j +"].Map"));

				subtitleList.add(subtitle);
			}
			subtitleConfig.setSubtitleList(subtitleList);

			List<ExtSubtitle> extSubtitleList = new ArrayList<ExtSubtitle>();
			for (int j = 0; j < _ctx.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SubtitleConfig.ExtSubtitleList.Length"); j++) {
				ExtSubtitle extSubtitle = new ExtSubtitle();
				extSubtitle.setFontName(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SubtitleConfig.ExtSubtitleList["+ j +"].FontName"));
				extSubtitle.setCharEnc(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SubtitleConfig.ExtSubtitleList["+ j +"].CharEnc"));

				Input input = new Input();
				input.setBucket(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Bucket"));
				input.setLocation(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Location"));
				input.setObject(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Object"));
				extSubtitle.setInput(input);

				extSubtitleList.add(extSubtitle);
			}
			subtitleConfig.setExtSubtitleList(extSubtitleList);
			transcodeOutput.setSubtitleConfig(subtitleConfig);

			TransConfig transConfig = new TransConfig();
			transConfig.setTransMode(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.TransMode"));
			transConfig.setIsCheckReso(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.IsCheckReso"));
			transConfig.setIsCheckResoFail(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.IsCheckResoFail"));
			transConfig.setIsCheckVideoBitrate(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.IsCheckVideoBitrate"));
			transConfig.setIsCheckAudioBitrate(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.IsCheckAudioBitrate"));
			transConfig.setAdjDarMethod(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.AdjDarMethod"));
			transConfig.setIsCheckVideoBitrateFail(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.IsCheckVideoBitrateFail"));
			transConfig.setIsCheckAudioBitrateFail(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.IsCheckAudioBitrateFail"));
			transConfig.setDuration(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.TransConfig.Duration"));
			transcodeOutput.setTransConfig(transConfig);

			MuxConfig muxConfig = new MuxConfig();

			Segment segment = new Segment();
			segment.setDuration(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);

			Gif gif = new Gif();
			gif.setLoop(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MuxConfig.Gif.Loop"));
			gif.setFinalDelay(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MuxConfig.Gif.FinalDelay"));
			gif.setIsCustomPalette(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MuxConfig.Gif.IsCustomPalette"));
			gif.setDitherMode(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MuxConfig.Gif.DitherMode"));
			muxConfig.setGif(gif);
			transcodeOutput.setMuxConfig(muxConfig);

			Audio audio = new Audio();
			audio.setCodec(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Audio.Codec"));
			audio.setProfile(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Audio.Profile"));
			audio.setSamplerate(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Audio.Samplerate"));
			audio.setBitrate(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Audio.Bitrate"));
			audio.setChannels(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Audio.Channels"));
			audio.setQscale(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Audio.Qscale"));

			Volume volume = new Volume();
			volume.setLevel(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Audio.Volume.Level"));
			volume.setBizMethod(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Audio.Volume.Method"));
			audio.setVolume(volume);
			transcodeOutput.setAudio(audio);

			Video video = new Video();
			video.setCodec(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Codec"));
			video.setProfile(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Profile"));
			video.setBitrate(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Bitrate"));
			video.setCrf(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Crf"));
			video.setWidth(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Width"));
			video.setHeight(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Height"));
			video.setFps(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Fps"));
			video.setGop(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Gop"));
			video.setPreset(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Preset"));
			video.setScanMode(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.ScanMode"));
			video.setBufsize(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Bufsize"));
			video.setMaxrate(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Maxrate"));
			video.setPixFmt(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.PixFmt"));
			video.setDegrain(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Degrain"));
			video.setQscale(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Qscale"));
			video.setCrop(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Crop"));
			video.setPad(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.Pad"));
			video.setMaxFps(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.MaxFps"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.BitrateBnd.Max"));
			bitrateBnd.setMin(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			transcodeOutput.setVideo(video);

			Container container = new Container();
			container.setFormat(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Container.Format"));
			transcodeOutput.setContainer(container);

			Encryption encryption = new Encryption();
			encryption.setType(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Encryption.Type"));
			encryption.setId(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Encryption.Id"));
			encryption.setKey(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Encryption.Key"));
			encryption.setKeyUri(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Encryption.KeyUri"));
			encryption.setKeyType(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Encryption.KeyType"));
			encryption.setSkipCnt(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.Encryption.SkipCnt"));
			transcodeOutput.setEncryption(encryption);

			List<WaterMark> waterMarkList = new ArrayList<WaterMark>();
			for (int j = 0; j < _ctx.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList.Length"); j++) {
				WaterMark waterMark = new WaterMark();
				waterMark.setWaterMarkTemplateId(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].WaterMarkTemplateId"));
				waterMark.setWidth(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].Width"));
				waterMark.setHeight(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].Height"));
				waterMark.setDx(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].Dx"));
				waterMark.setDy(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].Dy"));
				waterMark.setReferPos(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].ReferPos"));
				waterMark.setType(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].Type"));

				InputFile2 inputFile2 = new InputFile2();
				inputFile2.setBucket(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].InputFile.Bucket"));
				inputFile2.setLocation(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].InputFile.Location"));
				inputFile2.setObject(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.WaterMarkList["+ j +"].InputFile.Object"));
				waterMark.setInputFile2(inputFile2);

				waterMarkList.add(waterMark);
			}
			transcodeOutput.setWaterMarkList(waterMarkList);

			List<Merge> mergeList = new ArrayList<Merge>();
			for (int j = 0; j < _ctx.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MergeList.Length"); j++) {
				Merge merge = new Merge();
				merge.setMergeURL(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MergeList["+ j +"].MergeURL"));
				merge.setStart(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MergeList["+ j +"].Start"));
				merge.setDuration(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MergeList["+ j +"].Duration"));
				merge.setRoleArn(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].transcodeOutput.MergeList["+ j +"].RoleArn"));

				mergeList.add(merge);
			}
			transcodeOutput.setMergeList(mergeList);
			job.setTranscodeOutput(transcodeOutput);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].MNSMessageResult.ErrorCode"));
			job.setMNSMessageResult(mNSMessageResult);

			List<InputsItem> inputs = new ArrayList<InputsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].Inputs.Length"); j++) {
				InputsItem inputsItem = new InputsItem();

				List<EditingInput> editingInputs = new ArrayList<EditingInput>();
				for (int k = 0; k < _ctx.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].Inputs["+ j +"].EditingInputs.Length"); k++) {
					EditingInput editingInput = new EditingInput();
					editingInput.setId(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].Inputs["+ j +"].EditingInputs["+ k +"].Id"));

					InputFile inputFile = new InputFile();
					inputFile.setBucket(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].Inputs["+ j +"].EditingInputs["+ k +"].InputFile.Bucket"));
					inputFile.setLocation(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].Inputs["+ j +"].EditingInputs["+ k +"].InputFile.Location"));
					inputFile.setObject(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].Inputs["+ j +"].EditingInputs["+ k +"].InputFile.Object"));
					editingInput.setInputFile(inputFile);

					InputConfig inputConfig = new InputConfig();
					inputConfig.setDeinterlaceMethod(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].Inputs["+ j +"].EditingInputs["+ k +"].InputConfig.DeinterlaceMethod"));
					inputConfig.setIsNormalSar(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].Inputs["+ j +"].EditingInputs["+ k +"].InputConfig.IsNormalSar"));
					editingInput.setInputConfig(inputConfig);

					editingInputs.add(editingInput);
				}
				inputsItem.setEditingInputs(editingInputs);

				inputs.add(inputsItem);
			}
			job.setInputs(inputs);

			List<ComplexEditingConfigsItem> complexEditingConfigs = new ArrayList<ComplexEditingConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs.Length"); j++) {
				ComplexEditingConfigsItem complexEditingConfigsItem = new ComplexEditingConfigsItem();

				Editing editing = new Editing();

				Timeline timeline = new Timeline();

				TimelineConfig timelineConfig = new TimelineConfig();

				TimelineConfigVideo timelineConfigVideo = new TimelineConfigVideo();
				timelineConfigVideo.setWidth(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.Width"));
				timelineConfigVideo.setHeight(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.Height"));
				timelineConfigVideo.setBgColor(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.BgColor"));
				timelineConfigVideo.setFps(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.Fps"));
				timelineConfigVideo.setRenderRatio(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.RenderRatio"));
				timelineConfigVideo.setReclosePrec(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.ReclosePrec"));
				timelineConfigVideo.setIsGpuData(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.IsGpuData"));
				timelineConfigVideo.setIsOneTrackData(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.IsOneTrackData"));
				timelineConfig.setTimelineConfigVideo(timelineConfigVideo);

				TimelineConfigAudio timelineConfigAudio = new TimelineConfigAudio();
				timelineConfigAudio.setSamplerate(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigAudio.Samplerate"));
				timelineConfigAudio.setChannelLayout(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigAudio.ChannelLayout"));
				timelineConfigAudio.setChannels(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TimelineConfig.TimelineConfigAudio.Channels"));
				timelineConfig.setTimelineConfigAudio(timelineConfigAudio);
				timeline.setTimelineConfig(timelineConfig);

				List<Track> trackList = new ArrayList<Track>();
				for (int k = 0; k < _ctx.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList.Length"); k++) {
					Track track = new Track();
					track.setId(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Id"));
					track.setType(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Type"));
					track.setOrder(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Order"));

					List<Clip1> clips = new ArrayList<Clip1>();
					for (int l = 0; l < _ctx.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Clips.Length"); l++) {
						Clip1 clip1 = new Clip1();
						clip1.setClipID(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Clips["+ l +"].clipID"));
						clip1.setIn(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Clips["+ l +"].In"));
						clip1.setOut(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Clips["+ l +"].Out"));

						ClipsConfig clipsConfig = new ClipsConfig();

						ClipsConfigVideo clipsConfigVideo = new ClipsConfigVideo();
						clipsConfigVideo.setL(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Clips["+ l +"].ClipsConfig.ClipsConfigVideo.L"));
						clipsConfigVideo.setT(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.Timeline.TrackList["+ k +"].Clips["+ l +"].ClipsConfig.ClipsConfigVideo.T"));
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
				for (int k = 0; k < _ctx.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList.Length"); k++) {
					Clip clip = new Clip();
					clip.setId(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].Id"));
					clip.setType(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].Type"));
					clip.setSourceType(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].SourceType"));
					clip.setSourceID(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].SourceID"));
					clip.setSourceStrmMap(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].SourceStrmMap"));
					clip.setIn(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].In"));
					clip.setOut(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].Out"));

					List<Effect> effects = new ArrayList<Effect>();
					for (int l = 0; l < _ctx.lengthValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].Effects.Length"); l++) {
						Effect effect = new Effect();
						effect.setEffect(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].Effects["+ l +"].Effect"));
						effect.setEffectConfig(_ctx.stringValue("QueryComplexJobListResponse.JobList["+ i +"].ComplexEditingConfigs["+ j +"].Editing.ClipList["+ k +"].Effects["+ l +"].EffectConfig"));

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