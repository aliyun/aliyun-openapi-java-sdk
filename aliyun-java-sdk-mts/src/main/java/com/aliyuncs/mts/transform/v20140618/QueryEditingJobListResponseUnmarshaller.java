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

import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Audio;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Audio.Volume;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Clip;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Clip.TimeSpan;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Container;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.DigiWaterMark;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.DigiWaterMark.InputFile2;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Clip3;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Clip3.Effect;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Timeline;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Timeline.TimelineConfig;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigAudio;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Timeline.Track;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Timeline.Track.Clip4;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Timeline.Track.Clip4.ClipsConfig;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Timeline.Track.Clip4.ClipsConfig.ClipsConfigVideo;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Encryption;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.M3U8NonStandardSupport;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.M3U8NonStandardSupport.TS;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Merge;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.MuxConfig;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.OutputFile;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Properties;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Properties.Format;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Properties.Streams;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Properties.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Properties.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Properties.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Properties.Streams.VideoStream.NetworkCost;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.SubtitleConfig;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.SubtitleConfig.ExtSubtitle;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.SubtitleConfig.ExtSubtitle.Input;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.SubtitleConfig.Subtitle;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.SuperReso;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.TransConfig;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Video;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Video.BitrateBnd;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.WaterMark;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.WaterMark.InputFile1;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingInput;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingInput.InputConfig;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingInput.InputFile;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.MNSMessageResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEditingJobListResponseUnmarshaller {

	public static QueryEditingJobListResponse unmarshall(QueryEditingJobListResponse queryEditingJobListResponse, UnmarshallerContext _ctx) {
		
		queryEditingJobListResponse.setRequestId(_ctx.stringValue("QueryEditingJobListResponse.RequestId"));

		List<String> nonExistJobIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryEditingJobListResponse.NonExistJobIds.Length"); i++) {
			nonExistJobIds.add(_ctx.stringValue("QueryEditingJobListResponse.NonExistJobIds["+ i +"]"));
		}
		queryEditingJobListResponse.setNonExistJobIds(nonExistJobIds);

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("QueryEditingJobListResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setJobId(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].JobId"));
			job.setState(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].State"));
			job.setCode(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].Code"));
			job.setMessage(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].Message"));
			job.setPercent(_ctx.longValue("QueryEditingJobListResponse.JobList["+ i +"].Percent"));
			job.setPipelineId(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].PipelineId"));
			job.setCreationTime(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].CreationTime"));
			job.setFinishTime(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].FinishTime"));

			EditingConfig editingConfig = new EditingConfig();
			editingConfig.setTemplateId(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TemplateId"));
			editingConfig.setUserData(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.UserData"));
			editingConfig.setRotate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Rotate"));
			editingConfig.setVideoStreamMap(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.VideoStreamMap"));
			editingConfig.setAudioStreamMap(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.AudioStreamMap"));
			editingConfig.setDeWatermark(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.DeWatermark"));
			editingConfig.setPriority(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Priority"));
			editingConfig.setWaterMarkConfigUrl(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkConfigUrl"));
			editingConfig.setMergeConfigUrl(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MergeConfigUrl"));

			DigiWaterMark digiWaterMark = new DigiWaterMark();
			digiWaterMark.setType(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.DigiWaterMark.Type"));
			digiWaterMark.setAlpha(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.DigiWaterMark.Alpha"));

			InputFile2 inputFile2 = new InputFile2();
			inputFile2.setBucket(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.DigiWaterMark.InputFile.Bucket"));
			inputFile2.setLocation(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.DigiWaterMark.InputFile.Location"));
			inputFile2.setObject(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.DigiWaterMark.InputFile.Object"));
			digiWaterMark.setInputFile2(inputFile2);
			editingConfig.setDigiWaterMark(digiWaterMark);

			OutputFile outputFile = new OutputFile();
			outputFile.setBucket(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.OutputFile.Bucket"));
			outputFile.setLocation(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.OutputFile.Location"));
			outputFile.setObject(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.OutputFile.Object"));
			outputFile.setRoleArn(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.OutputFile.RoleArn"));
			editingConfig.setOutputFile(outputFile);

			M3U8NonStandardSupport m3U8NonStandardSupport = new M3U8NonStandardSupport();

			TS tS = new TS();
			tS.setMd5Support(_ctx.booleanValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.M3U8NonStandardSupport.TS.Md5Support"));
			tS.setSizeSupport(_ctx.booleanValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.M3U8NonStandardSupport.TS.SizeSupport"));
			m3U8NonStandardSupport.setTS(tS);
			editingConfig.setM3U8NonStandardSupport(m3U8NonStandardSupport);

			Properties properties = new Properties();
			properties.setWidth(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Width"));
			properties.setHeight(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Height"));
			properties.setBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Bitrate"));
			properties.setDuration(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Duration"));
			properties.setFps(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Fps"));
			properties.setFileSize(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.FileSize"));
			properties.setFileFormat(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.FileFormat"));

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setIndex(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setCodecName(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setCodecLongName(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setProfile(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setCodecTimeBase(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setCodecTagString(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setCodecTag(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setWidth(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setHeight(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setHasBFrames(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setSar(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setDar(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setPixFmt(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLevel(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Level"));
				videoStream.setFps(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setAvgFPS(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setTimebase(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setStartTime(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDuration(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setNumFrames(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setLang(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Lang"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setCostBandwidth(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				networkCost.setAvgBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setIndex(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setCodecName(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setCodecTimeBase(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].CodecTimeBase"));
				audioStream.setCodecLongName(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setCodecTagString(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setCodecTag(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setSampleFmt(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setSamplerate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setChannels(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setChannelLayout(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setTimebase(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setStartTime(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setDuration(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setNumFrames(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setLang(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Lang"));

				audioStreamList.add(audioStream);
			}
			streams.setAudioStreamList(audioStreamList);

			List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.SubtitleStreamList.Length"); j++) {
				SubtitleStream subtitleStream = new SubtitleStream();
				subtitleStream.setIndex(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.SubtitleStreamList["+ j +"].Index"));
				subtitleStream.setLang(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.SubtitleStreamList["+ j +"].Lang"));

				subtitleStreamList.add(subtitleStream);
			}
			streams.setSubtitleStreamList(subtitleStreamList);
			properties.setStreams(streams);

			Format format = new Format();
			format.setNumStreams(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Format.NumStreams"));
			format.setNumPrograms(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Format.NumPrograms"));
			format.setFormatName(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Format.FormatName"));
			format.setFormatLongName(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Format.FormatLongName"));
			format.setStartTime(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Format.StartTime"));
			format.setDuration(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Format.Duration"));
			format.setSize(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Format.Size"));
			format.setBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Format.Bitrate"));
			properties.setFormat(format);
			editingConfig.setProperties(properties);

			Clip clip = new Clip();

			TimeSpan timeSpan = new TimeSpan();
			timeSpan.setSeek(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Clip.TimeSpan.Seek"));
			timeSpan.setDuration(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Clip.TimeSpan.Duration"));
			clip.setTimeSpan(timeSpan);
			editingConfig.setClip(clip);

			SuperReso superReso = new SuperReso();
			superReso.setIsHalfSample(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SuperReso.IsHalfSample"));
			editingConfig.setSuperReso(superReso);

			SubtitleConfig subtitleConfig = new SubtitleConfig();

			List<Subtitle> subtitleList = new ArrayList<Subtitle>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SubtitleConfig.SubtitleList.Length"); j++) {
				Subtitle subtitle = new Subtitle();
				subtitle.setMap(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SubtitleConfig.SubtitleList["+ j +"].Map"));

				subtitleList.add(subtitle);
			}
			subtitleConfig.setSubtitleList(subtitleList);

			List<ExtSubtitle> extSubtitleList = new ArrayList<ExtSubtitle>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SubtitleConfig.ExtSubtitleList.Length"); j++) {
				ExtSubtitle extSubtitle = new ExtSubtitle();
				extSubtitle.setFontName(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SubtitleConfig.ExtSubtitleList["+ j +"].FontName"));
				extSubtitle.setCharEnc(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SubtitleConfig.ExtSubtitleList["+ j +"].CharEnc"));

				Input input = new Input();
				input.setBucket(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Bucket"));
				input.setLocation(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Location"));
				input.setObject(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Object"));
				extSubtitle.setInput(input);

				extSubtitleList.add(extSubtitle);
			}
			subtitleConfig.setExtSubtitleList(extSubtitleList);
			editingConfig.setSubtitleConfig(subtitleConfig);

			TransConfig transConfig = new TransConfig();
			transConfig.setTransMode(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.TransMode"));
			transConfig.setIsCheckReso(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.IsCheckReso"));
			transConfig.setIsCheckResoFail(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.IsCheckResoFail"));
			transConfig.setIsCheckVideoBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.IsCheckVideoBitrate"));
			transConfig.setIsCheckAudioBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.IsCheckAudioBitrate"));
			transConfig.setAdjDarMethod(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.AdjDarMethod"));
			transConfig.setIsCheckVideoBitrateFail(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.IsCheckVideoBitrateFail"));
			transConfig.setIsCheckAudioBitrateFail(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.IsCheckAudioBitrateFail"));
			transConfig.setDuration(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.Duration"));
			editingConfig.setTransConfig(transConfig);

			MuxConfig muxConfig = new MuxConfig();

			Segment segment = new Segment();
			segment.setDuration(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);

			Gif gif = new Gif();
			gif.setLoop(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MuxConfig.Gif.Loop"));
			gif.setFinalDelay(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MuxConfig.Gif.FinalDelay"));
			gif.setIsCustomPalette(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MuxConfig.Gif.IsCustomPalette"));
			gif.setDitherMode(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MuxConfig.Gif.DitherMode"));
			muxConfig.setGif(gif);
			editingConfig.setMuxConfig(muxConfig);

			Audio audio = new Audio();
			audio.setCodec(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Audio.Codec"));
			audio.setProfile(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Audio.Profile"));
			audio.setSamplerate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Audio.Samplerate"));
			audio.setBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Audio.Bitrate"));
			audio.setChannels(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Audio.Channels"));
			audio.setQscale(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Audio.Qscale"));

			Volume volume = new Volume();
			volume.setLevel(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Audio.Volume.Level"));
			volume.setBizMethod(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Audio.Volume.Method"));
			audio.setVolume(volume);
			editingConfig.setAudio(audio);

			Video video = new Video();
			video.setCodec(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Codec"));
			video.setProfile(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Profile"));
			video.setBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Bitrate"));
			video.setCrf(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Crf"));
			video.setWidth(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Width"));
			video.setHeight(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Height"));
			video.setFps(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Fps"));
			video.setGop(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Gop"));
			video.setPreset(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Preset"));
			video.setScanMode(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.ScanMode"));
			video.setBufsize(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Bufsize"));
			video.setMaxrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Maxrate"));
			video.setPixFmt(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.PixFmt"));
			video.setDegrain(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Degrain"));
			video.setQscale(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Qscale"));
			video.setCrop(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Crop"));
			video.setPad(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Pad"));
			video.setMaxFps(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.MaxFps"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.BitrateBnd.Max"));
			bitrateBnd.setMin(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			editingConfig.setVideo(video);

			Container container = new Container();
			container.setFormat(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Container.Format"));
			editingConfig.setContainer(container);

			Encryption encryption = new Encryption();
			encryption.setType(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Encryption.Type"));
			encryption.setId(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Encryption.Id"));
			encryption.setKey(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Encryption.Key"));
			encryption.setKeyUri(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Encryption.KeyUri"));
			encryption.setKeyType(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Encryption.KeyType"));
			encryption.setSkipCnt(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Encryption.SkipCnt"));
			editingConfig.setEncryption(encryption);

			Editing editing = new Editing();

			Timeline timeline = new Timeline();

			TimelineConfig timelineConfig = new TimelineConfig();

			TimelineConfigVideo timelineConfigVideo = new TimelineConfigVideo();
			timelineConfigVideo.setWidth(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.Width"));
			timelineConfigVideo.setHeight(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.Height"));
			timelineConfigVideo.setBgColor(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.BgColor"));
			timelineConfigVideo.setFps(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.Fps"));
			timelineConfigVideo.setRenderRatio(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.RenderRatio"));
			timelineConfigVideo.setReclosePrec(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.ReclosePrec"));
			timelineConfigVideo.setIsGpuData(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.IsGpuData"));
			timelineConfigVideo.setIsOneTrackData(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.IsOneTrackData"));
			timelineConfig.setTimelineConfigVideo(timelineConfigVideo);

			TimelineConfigAudio timelineConfigAudio = new TimelineConfigAudio();
			timelineConfigAudio.setSamplerate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigAudio.Samplerate"));
			timelineConfigAudio.setChannelLayout(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigAudio.ChannelLayout"));
			timelineConfigAudio.setChannels(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigAudio.Channels"));
			timelineConfig.setTimelineConfigAudio(timelineConfigAudio);
			timeline.setTimelineConfig(timelineConfig);

			List<Track> trackList = new ArrayList<Track>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList.Length"); j++) {
				Track track = new Track();
				track.setId(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Id"));
				track.setType(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Type"));
				track.setOrder(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Order"));

				List<Clip4> clips = new ArrayList<Clip4>();
				for (int k = 0; k < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips.Length"); k++) {
					Clip4 clip4 = new Clip4();
					clip4.setClipID(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].clipID"));
					clip4.setIn(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].In"));
					clip4.setOut(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].Out"));

					ClipsConfig clipsConfig = new ClipsConfig();

					ClipsConfigVideo clipsConfigVideo = new ClipsConfigVideo();
					clipsConfigVideo.setL(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].ClipsConfig.ClipsConfigVideo.L"));
					clipsConfigVideo.setT(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].ClipsConfig.ClipsConfigVideo.T"));
					clipsConfig.setClipsConfigVideo(clipsConfigVideo);
					clip4.setClipsConfig(clipsConfig);

					clips.add(clip4);
				}
				track.setClips(clips);

				trackList.add(track);
			}
			timeline.setTrackList(trackList);
			editing.setTimeline(timeline);

			List<Clip3> clipList = new ArrayList<Clip3>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList.Length"); j++) {
				Clip3 clip3 = new Clip3();
				clip3.setId(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].Id"));
				clip3.setType(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].Type"));
				clip3.setSourceType(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].SourceType"));
				clip3.setSourceID(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].SourceID"));
				clip3.setSourceStrmMap(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].SourceStrmMap"));
				clip3.setIn(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].In"));
				clip3.setOut(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].Out"));

				List<Effect> effects = new ArrayList<Effect>();
				for (int k = 0; k < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].Effects.Length"); k++) {
					Effect effect = new Effect();
					effect.setEffect(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].Effects["+ k +"].Effect"));
					effect.setEffectConfig(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].Effects["+ k +"].EffectConfig"));

					effects.add(effect);
				}
				clip3.setEffects(effects);

				clipList.add(clip3);
			}
			editing.setClipList(clipList);
			editingConfig.setEditing(editing);

			List<WaterMark> waterMarkList = new ArrayList<WaterMark>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList.Length"); j++) {
				WaterMark waterMark = new WaterMark();
				waterMark.setWaterMarkTemplateId(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].WaterMarkTemplateId"));
				waterMark.setWidth(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].Width"));
				waterMark.setHeight(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].Height"));
				waterMark.setDx(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].Dx"));
				waterMark.setDy(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].Dy"));
				waterMark.setReferPos(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].ReferPos"));
				waterMark.setType(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].Type"));

				InputFile1 inputFile1 = new InputFile1();
				inputFile1.setBucket(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].InputFile.Bucket"));
				inputFile1.setLocation(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].InputFile.Location"));
				inputFile1.setObject(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].InputFile.Object"));
				waterMark.setInputFile1(inputFile1);

				waterMarkList.add(waterMark);
			}
			editingConfig.setWaterMarkList(waterMarkList);

			List<Merge> mergeList = new ArrayList<Merge>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MergeList.Length"); j++) {
				Merge merge = new Merge();
				merge.setMergeURL(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MergeList["+ j +"].MergeURL"));
				merge.setStart(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MergeList["+ j +"].Start"));
				merge.setDuration(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MergeList["+ j +"].Duration"));
				merge.setRoleArn(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MergeList["+ j +"].RoleArn"));

				mergeList.add(merge);
			}
			editingConfig.setMergeList(mergeList);
			job.setEditingConfig(editingConfig);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].MNSMessageResult.ErrorCode"));
			job.setMNSMessageResult(mNSMessageResult);

			List<EditingInput> editingInputs = new ArrayList<EditingInput>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingInputs.Length"); j++) {
				EditingInput editingInput = new EditingInput();
				editingInput.setId(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingInputs["+ j +"].Id"));

				InputFile inputFile = new InputFile();
				inputFile.setBucket(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingInputs["+ j +"].InputFile.Bucket"));
				inputFile.setLocation(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingInputs["+ j +"].InputFile.Location"));
				inputFile.setObject(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingInputs["+ j +"].InputFile.Object"));
				editingInput.setInputFile(inputFile);

				InputConfig inputConfig = new InputConfig();
				inputConfig.setDeinterlaceMethod(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingInputs["+ j +"].InputConfig.DeinterlaceMethod"));
				inputConfig.setIsNormalSar(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingInputs["+ j +"].InputConfig.IsNormalSar"));
				editingInput.setInputConfig(inputConfig);

				editingInputs.add(editingInput);
			}
			job.setEditingInputs(editingInputs);

			jobList.add(job);
		}
		queryEditingJobListResponse.setJobList(jobList);
	 
	 	return queryEditingJobListResponse;
	}
}