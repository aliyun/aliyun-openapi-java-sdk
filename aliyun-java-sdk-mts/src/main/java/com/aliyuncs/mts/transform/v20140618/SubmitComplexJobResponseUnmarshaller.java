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

import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigsItem;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigsItem.Editing;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigsItem.Editing.Clip;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigsItem.Editing.Clip.Effect;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigsItem.Editing.Timeline;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigsItem.Editing.Timeline.TimelineConfig;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigsItem.Editing.Timeline.TimelineConfig.TimelineConfigAudio;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigsItem.Editing.Timeline.TimelineConfig.TimelineConfigVideo;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigsItem.Editing.Timeline.Track;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigsItem.Editing.Timeline.Track.Clip1;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigsItem.Editing.Timeline.Track.Clip1.ClipsConfig;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigsItem.Editing.Timeline.Track.Clip1.ClipsConfig.ClipsConfigVideo;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.InputsItem;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.InputsItem.EditingInput;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.InputsItem.EditingInput.InputConfig;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.InputsItem.EditingInput.InputFile;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.Audio;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.Audio.Volume;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.Clip4;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.Clip4.TimeSpan;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.Container;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.DigiWaterMark;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.DigiWaterMark.InputFile3;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.Encryption;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.M3U8NonStandardSupport;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.M3U8NonStandardSupport.TS;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.Merge;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.MuxConfig;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.OutputFile;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.Properties;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.Properties.Format;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.Properties.Streams;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.Properties.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.Properties.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.Properties.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.Properties.Streams.VideoStream.NetworkCost;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.SubtitleConfig;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.SubtitleConfig.ExtSubtitle;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.SubtitleConfig.ExtSubtitle.Input;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.SubtitleConfig.Subtitle;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.SuperReso;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.TransConfig;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.Video;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.Video.BitrateBnd;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.WaterMark;
import com.aliyuncs.mts.model.v20140618.SubmitComplexJobResponse.ComplexJob.TranscodeOutput.WaterMark.InputFile2;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitComplexJobResponseUnmarshaller {

	public static SubmitComplexJobResponse unmarshall(SubmitComplexJobResponse submitComplexJobResponse, UnmarshallerContext _ctx) {
		
		submitComplexJobResponse.setRequestId(_ctx.stringValue("SubmitComplexJobResponse.RequestId"));

		ComplexJob complexJob = new ComplexJob();
		complexJob.setJobId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.JobId"));
		complexJob.setState(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.State"));
		complexJob.setCode(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.Code"));
		complexJob.setMessage(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.Message"));
		complexJob.setPercent(_ctx.longValue("SubmitComplexJobResponse.ComplexJob.Percent"));
		complexJob.setPipelineId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.PipelineId"));
		complexJob.setCreationTime(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.CreationTime"));
		complexJob.setFinishTime(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.FinishTime"));

		TranscodeOutput transcodeOutput = new TranscodeOutput();
		transcodeOutput.setTemplateId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TemplateId"));
		transcodeOutput.setUserData(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.UserData"));
		transcodeOutput.setRotate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Rotate"));
		transcodeOutput.setVideoStreamMap(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.VideoStreamMap"));
		transcodeOutput.setAudioStreamMap(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.AudioStreamMap"));
		transcodeOutput.setDeWatermark(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DeWatermark"));
		transcodeOutput.setPriority(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Priority"));
		transcodeOutput.setWaterMarkConfigUrl(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkConfigUrl"));
		transcodeOutput.setMergeConfigUrl(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeConfigUrl"));

		DigiWaterMark digiWaterMark = new DigiWaterMark();
		digiWaterMark.setType(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DigiWaterMark.Type"));
		digiWaterMark.setAlpha(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DigiWaterMark.Alpha"));

		InputFile3 inputFile3 = new InputFile3();
		inputFile3.setBucket(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DigiWaterMark.InputFile.Bucket"));
		inputFile3.setLocation(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DigiWaterMark.InputFile.Location"));
		inputFile3.setObject(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DigiWaterMark.InputFile.Object"));
		digiWaterMark.setInputFile3(inputFile3);
		transcodeOutput.setDigiWaterMark(digiWaterMark);

		OutputFile outputFile = new OutputFile();
		outputFile.setBucket(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.OutputFile.Bucket"));
		outputFile.setLocation(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.OutputFile.Location"));
		outputFile.setObject(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.OutputFile.Object"));
		outputFile.setRoleArn(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.OutputFile.RoleArn"));
		transcodeOutput.setOutputFile(outputFile);

		M3U8NonStandardSupport m3U8NonStandardSupport = new M3U8NonStandardSupport();

		TS tS = new TS();
		tS.setMd5Support(_ctx.booleanValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.M3U8NonStandardSupport.TS.Md5Support"));
		tS.setSizeSupport(_ctx.booleanValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.M3U8NonStandardSupport.TS.SizeSupport"));
		m3U8NonStandardSupport.setTS(tS);
		transcodeOutput.setM3U8NonStandardSupport(m3U8NonStandardSupport);

		Properties properties = new Properties();
		properties.setWidth(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Width"));
		properties.setHeight(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Height"));
		properties.setBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Bitrate"));
		properties.setDuration(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Duration"));
		properties.setFps(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Fps"));
		properties.setFileSize(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.FileSize"));
		properties.setFileFormat(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.FileFormat"));

		Streams streams = new Streams();

		List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList.Length"); i++) {
			VideoStream videoStream = new VideoStream();
			videoStream.setIndex(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Index"));
			videoStream.setCodecName(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].CodecName"));
			videoStream.setCodecLongName(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].CodecLongName"));
			videoStream.setProfile(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Profile"));
			videoStream.setCodecTimeBase(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].CodecTimeBase"));
			videoStream.setCodecTagString(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].CodecTagString"));
			videoStream.setCodecTag(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].CodecTag"));
			videoStream.setWidth(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Width"));
			videoStream.setHeight(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Height"));
			videoStream.setHasBFrames(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].HasBFrames"));
			videoStream.setSar(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Sar"));
			videoStream.setDar(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Dar"));
			videoStream.setPixFmt(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].PixFmt"));
			videoStream.setLevel(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Level"));
			videoStream.setFps(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Fps"));
			videoStream.setAvgFPS(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].AvgFPS"));
			videoStream.setTimebase(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Timebase"));
			videoStream.setStartTime(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].StartTime"));
			videoStream.setDuration(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Duration"));
			videoStream.setBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Bitrate"));
			videoStream.setNumFrames(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].NumFrames"));
			videoStream.setLang(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Lang"));

			NetworkCost networkCost = new NetworkCost();
			networkCost.setPreloadTime(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.PreloadTime"));
			networkCost.setCostBandwidth(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.CostBandwidth"));
			networkCost.setAvgBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.AvgBitrate"));
			videoStream.setNetworkCost(networkCost);

			videoStreamList.add(videoStream);
		}
		streams.setVideoStreamList(videoStreamList);

		List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList.Length"); i++) {
			AudioStream audioStream = new AudioStream();
			audioStream.setIndex(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Index"));
			audioStream.setCodecName(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].CodecName"));
			audioStream.setCodecTimeBase(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].CodecTimeBase"));
			audioStream.setCodecLongName(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].CodecLongName"));
			audioStream.setCodecTagString(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].CodecTagString"));
			audioStream.setCodecTag(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].CodecTag"));
			audioStream.setSampleFmt(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].SampleFmt"));
			audioStream.setSamplerate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Samplerate"));
			audioStream.setChannels(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Channels"));
			audioStream.setChannelLayout(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].ChannelLayout"));
			audioStream.setTimebase(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Timebase"));
			audioStream.setStartTime(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].StartTime"));
			audioStream.setDuration(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Duration"));
			audioStream.setBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Bitrate"));
			audioStream.setNumFrames(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].NumFrames"));
			audioStream.setLang(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Lang"));

			audioStreamList.add(audioStream);
		}
		streams.setAudioStreamList(audioStreamList);

		List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.SubtitleStreamList.Length"); i++) {
			SubtitleStream subtitleStream = new SubtitleStream();
			subtitleStream.setIndex(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.SubtitleStreamList["+ i +"].Index"));
			subtitleStream.setLang(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.SubtitleStreamList["+ i +"].Lang"));

			subtitleStreamList.add(subtitleStream);
		}
		streams.setSubtitleStreamList(subtitleStreamList);
		properties.setStreams(streams);

		Format format = new Format();
		format.setNumStreams(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.NumStreams"));
		format.setNumPrograms(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.NumPrograms"));
		format.setFormatName(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.FormatName"));
		format.setFormatLongName(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.FormatLongName"));
		format.setStartTime(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.StartTime"));
		format.setDuration(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.Duration"));
		format.setSize(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.Size"));
		format.setBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.Bitrate"));
		properties.setFormat(format);
		transcodeOutput.setProperties(properties);

		Clip4 clip4 = new Clip4();

		TimeSpan timeSpan = new TimeSpan();
		timeSpan.setSeek(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Clip.TimeSpan.Seek"));
		timeSpan.setDuration(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Clip.TimeSpan.Duration"));
		clip4.setTimeSpan(timeSpan);
		transcodeOutput.setClip4(clip4);

		SuperReso superReso = new SuperReso();
		superReso.setIsHalfSample(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SuperReso.IsHalfSample"));
		transcodeOutput.setSuperReso(superReso);

		SubtitleConfig subtitleConfig = new SubtitleConfig();

		List<Subtitle> subtitleList = new ArrayList<Subtitle>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.SubtitleList.Length"); i++) {
			Subtitle subtitle = new Subtitle();
			subtitle.setMap(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.SubtitleList["+ i +"].Map"));

			subtitleList.add(subtitle);
		}
		subtitleConfig.setSubtitleList(subtitleList);

		List<ExtSubtitle> extSubtitleList = new ArrayList<ExtSubtitle>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList.Length"); i++) {
			ExtSubtitle extSubtitle = new ExtSubtitle();
			extSubtitle.setFontName(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList["+ i +"].FontName"));
			extSubtitle.setCharEnc(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList["+ i +"].CharEnc"));

			Input input = new Input();
			input.setBucket(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList["+ i +"].Input.Bucket"));
			input.setLocation(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList["+ i +"].Input.Location"));
			input.setObject(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList["+ i +"].Input.Object"));
			extSubtitle.setInput(input);

			extSubtitleList.add(extSubtitle);
		}
		subtitleConfig.setExtSubtitleList(extSubtitleList);
		transcodeOutput.setSubtitleConfig(subtitleConfig);

		TransConfig transConfig = new TransConfig();
		transConfig.setTransMode(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.TransMode"));
		transConfig.setIsCheckReso(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckReso"));
		transConfig.setIsCheckResoFail(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckResoFail"));
		transConfig.setIsCheckVideoBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckVideoBitrate"));
		transConfig.setIsCheckAudioBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckAudioBitrate"));
		transConfig.setAdjDarMethod(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.AdjDarMethod"));
		transConfig.setIsCheckVideoBitrateFail(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckVideoBitrateFail"));
		transConfig.setIsCheckAudioBitrateFail(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckAudioBitrateFail"));
		transConfig.setDuration(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.Duration"));
		transcodeOutput.setTransConfig(transConfig);

		MuxConfig muxConfig = new MuxConfig();

		Segment segment = new Segment();
		segment.setDuration(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MuxConfig.Segment.Duration"));
		muxConfig.setSegment(segment);

		Gif gif = new Gif();
		gif.setLoop(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MuxConfig.Gif.Loop"));
		gif.setFinalDelay(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MuxConfig.Gif.FinalDelay"));
		gif.setIsCustomPalette(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MuxConfig.Gif.IsCustomPalette"));
		gif.setDitherMode(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MuxConfig.Gif.DitherMode"));
		muxConfig.setGif(gif);
		transcodeOutput.setMuxConfig(muxConfig);

		Audio audio = new Audio();
		audio.setCodec(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Codec"));
		audio.setProfile(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Profile"));
		audio.setSamplerate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Samplerate"));
		audio.setBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Bitrate"));
		audio.setChannels(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Channels"));
		audio.setQscale(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Qscale"));

		Volume volume = new Volume();
		volume.setLevel(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Volume.Level"));
		volume.setBizMethod(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Volume.Method"));
		audio.setVolume(volume);
		transcodeOutput.setAudio(audio);

		Video video = new Video();
		video.setCodec(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Codec"));
		video.setProfile(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Profile"));
		video.setBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Bitrate"));
		video.setCrf(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Crf"));
		video.setWidth(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Width"));
		video.setHeight(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Height"));
		video.setFps(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Fps"));
		video.setGop(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Gop"));
		video.setPreset(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Preset"));
		video.setScanMode(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.ScanMode"));
		video.setBufsize(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Bufsize"));
		video.setMaxrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Maxrate"));
		video.setPixFmt(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.PixFmt"));
		video.setDegrain(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Degrain"));
		video.setQscale(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Qscale"));
		video.setCrop(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Crop"));
		video.setPad(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Pad"));
		video.setMaxFps(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.MaxFps"));

		BitrateBnd bitrateBnd = new BitrateBnd();
		bitrateBnd.setMax(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.BitrateBnd.Max"));
		bitrateBnd.setMin(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.BitrateBnd.Min"));
		video.setBitrateBnd(bitrateBnd);
		transcodeOutput.setVideo(video);

		Container container = new Container();
		container.setFormat(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Container.Format"));
		transcodeOutput.setContainer(container);

		Encryption encryption = new Encryption();
		encryption.setType(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.Type"));
		encryption.setId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.Id"));
		encryption.setKey(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.Key"));
		encryption.setKeyUri(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.KeyUri"));
		encryption.setKeyType(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.KeyType"));
		encryption.setSkipCnt(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.SkipCnt"));
		transcodeOutput.setEncryption(encryption);

		List<WaterMark> waterMarkList = new ArrayList<WaterMark>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList.Length"); i++) {
			WaterMark waterMark = new WaterMark();
			waterMark.setWaterMarkTemplateId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].WaterMarkTemplateId"));
			waterMark.setWidth(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].Width"));
			waterMark.setHeight(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].Height"));
			waterMark.setDx(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].Dx"));
			waterMark.setDy(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].Dy"));
			waterMark.setReferPos(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].ReferPos"));
			waterMark.setType(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].Type"));

			InputFile2 inputFile2 = new InputFile2();
			inputFile2.setBucket(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].InputFile.Bucket"));
			inputFile2.setLocation(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].InputFile.Location"));
			inputFile2.setObject(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].InputFile.Object"));
			waterMark.setInputFile2(inputFile2);

			waterMarkList.add(waterMark);
		}
		transcodeOutput.setWaterMarkList(waterMarkList);

		List<Merge> mergeList = new ArrayList<Merge>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeList.Length"); i++) {
			Merge merge = new Merge();
			merge.setMergeURL(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeList["+ i +"].MergeURL"));
			merge.setStart(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeList["+ i +"].Start"));
			merge.setDuration(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeList["+ i +"].Duration"));
			merge.setRoleArn(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeList["+ i +"].RoleArn"));

			mergeList.add(merge);
		}
		transcodeOutput.setMergeList(mergeList);
		complexJob.setTranscodeOutput(transcodeOutput);

		MNSMessageResult mNSMessageResult = new MNSMessageResult();
		mNSMessageResult.setMessageId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.MNSMessageResult.MessageId"));
		mNSMessageResult.setErrorMessage(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.MNSMessageResult.ErrorMessage"));
		mNSMessageResult.setErrorCode(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.MNSMessageResult.ErrorCode"));
		complexJob.setMNSMessageResult(mNSMessageResult);

		List<InputsItem> inputs = new ArrayList<InputsItem>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.Inputs.Length"); i++) {
			InputsItem inputsItem = new InputsItem();

			List<EditingInput> editingInputs = new ArrayList<EditingInput>();
			for (int j = 0; j < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs.Length"); j++) {
				EditingInput editingInput = new EditingInput();
				editingInput.setId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].Id"));

				InputFile inputFile = new InputFile();
				inputFile.setBucket(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].InputFile.Bucket"));
				inputFile.setLocation(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].InputFile.Location"));
				inputFile.setObject(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].InputFile.Object"));
				editingInput.setInputFile(inputFile);

				InputConfig inputConfig = new InputConfig();
				inputConfig.setDeinterlaceMethod(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].InputConfig.DeinterlaceMethod"));
				inputConfig.setIsNormalSar(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].InputConfig.IsNormalSar"));
				editingInput.setInputConfig(inputConfig);

				editingInputs.add(editingInput);
			}
			inputsItem.setEditingInputs(editingInputs);

			inputs.add(inputsItem);
		}
		complexJob.setInputs(inputs);

		List<ComplexEditingConfigsItem> complexEditingConfigs = new ArrayList<ComplexEditingConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs.Length"); i++) {
			ComplexEditingConfigsItem complexEditingConfigsItem = new ComplexEditingConfigsItem();

			Editing editing = new Editing();

			Timeline timeline = new Timeline();

			TimelineConfig timelineConfig = new TimelineConfig();

			TimelineConfigVideo timelineConfigVideo = new TimelineConfigVideo();
			timelineConfigVideo.setWidth(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.Width"));
			timelineConfigVideo.setHeight(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.Height"));
			timelineConfigVideo.setBgColor(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.BgColor"));
			timelineConfigVideo.setFps(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.Fps"));
			timelineConfigVideo.setRenderRatio(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.RenderRatio"));
			timelineConfigVideo.setReclosePrec(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.ReclosePrec"));
			timelineConfigVideo.setIsGpuData(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.IsGpuData"));
			timelineConfigVideo.setIsOneTrackData(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.IsOneTrackData"));
			timelineConfig.setTimelineConfigVideo(timelineConfigVideo);

			TimelineConfigAudio timelineConfigAudio = new TimelineConfigAudio();
			timelineConfigAudio.setSamplerate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigAudio.Samplerate"));
			timelineConfigAudio.setChannelLayout(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigAudio.ChannelLayout"));
			timelineConfigAudio.setChannels(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigAudio.Channels"));
			timelineConfig.setTimelineConfigAudio(timelineConfigAudio);
			timeline.setTimelineConfig(timelineConfig);

			List<Track> trackList = new ArrayList<Track>();
			for (int j = 0; j < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList.Length"); j++) {
				Track track = new Track();
				track.setId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Id"));
				track.setType(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Type"));
				track.setOrder(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Order"));

				List<Clip1> clips = new ArrayList<Clip1>();
				for (int k = 0; k < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips.Length"); k++) {
					Clip1 clip1 = new Clip1();
					clip1.setClipID(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].clipID"));
					clip1.setIn(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].In"));
					clip1.setOut(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].Out"));

					ClipsConfig clipsConfig = new ClipsConfig();

					ClipsConfigVideo clipsConfigVideo = new ClipsConfigVideo();
					clipsConfigVideo.setL(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].ClipsConfig.ClipsConfigVideo.L"));
					clipsConfigVideo.setT(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].ClipsConfig.ClipsConfigVideo.T"));
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
			for (int j = 0; j < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList.Length"); j++) {
				Clip clip = new Clip();
				clip.setId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].Id"));
				clip.setType(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].Type"));
				clip.setSourceType(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].SourceType"));
				clip.setSourceID(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].SourceID"));
				clip.setSourceStrmMap(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].SourceStrmMap"));
				clip.setIn(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].In"));
				clip.setOut(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].Out"));

				List<Effect> effects = new ArrayList<Effect>();
				for (int k = 0; k < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].Effects.Length"); k++) {
					Effect effect = new Effect();
					effect.setEffect(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].Effects["+ k +"].Effect"));
					effect.setEffectConfig(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].Effects["+ k +"].EffectConfig"));

					effects.add(effect);
				}
				clip.setEffects(effects);

				clipList.add(clip);
			}
			editing.setClipList(clipList);
			complexEditingConfigsItem.setEditing(editing);

			complexEditingConfigs.add(complexEditingConfigsItem);
		}
		complexJob.setComplexEditingConfigs(complexEditingConfigs);
		submitComplexJobResponse.setComplexJob(complexJob);
	 
	 	return submitComplexJobResponse;
	}
}