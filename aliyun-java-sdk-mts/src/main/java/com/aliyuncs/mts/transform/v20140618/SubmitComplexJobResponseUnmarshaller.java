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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitComplexJobResponseUnmarshaller {

	public static SubmitComplexJobResponse unmarshall(SubmitComplexJobResponse submitComplexJobResponse, UnmarshallerContext context) {
		
		submitComplexJobResponse.setRequestId(context.stringValue("SubmitComplexJobResponse.RequestId"));

		ComplexJob complexJob = new ComplexJob();
		complexJob.setJobId(context.stringValue("SubmitComplexJobResponse.ComplexJob.JobId"));
		complexJob.setState(context.stringValue("SubmitComplexJobResponse.ComplexJob.State"));
		complexJob.setCode(context.stringValue("SubmitComplexJobResponse.ComplexJob.Code"));
		complexJob.setMessage(context.stringValue("SubmitComplexJobResponse.ComplexJob.Message"));
		complexJob.setPercent(context.longValue("SubmitComplexJobResponse.ComplexJob.Percent"));
		complexJob.setPipelineId(context.stringValue("SubmitComplexJobResponse.ComplexJob.PipelineId"));
		complexJob.setCreationTime(context.stringValue("SubmitComplexJobResponse.ComplexJob.CreationTime"));
		complexJob.setFinishTime(context.stringValue("SubmitComplexJobResponse.ComplexJob.FinishTime"));

		TranscodeOutput transcodeOutput = new TranscodeOutput();
		transcodeOutput.setTemplateId(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TemplateId"));
		transcodeOutput.setUserData(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.UserData"));
		transcodeOutput.setRotate(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Rotate"));
		transcodeOutput.setVideoStreamMap(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.VideoStreamMap"));
		transcodeOutput.setAudioStreamMap(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.AudioStreamMap"));
		transcodeOutput.setDeWatermark(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DeWatermark"));
		transcodeOutput.setPriority(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Priority"));
		transcodeOutput.setWaterMarkConfigUrl(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkConfigUrl"));
		transcodeOutput.setMergeConfigUrl(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeConfigUrl"));

		DigiWaterMark digiWaterMark = new DigiWaterMark();
		digiWaterMark.setType(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DigiWaterMark.Type"));
		digiWaterMark.setAlpha(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DigiWaterMark.Alpha"));

		InputFile3 inputFile3 = new InputFile3();
		inputFile3.setBucket(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DigiWaterMark.InputFile.Bucket"));
		inputFile3.setLocation(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DigiWaterMark.InputFile.Location"));
		inputFile3.setObject(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DigiWaterMark.InputFile.Object"));
		digiWaterMark.setInputFile3(inputFile3);
		transcodeOutput.setDigiWaterMark(digiWaterMark);

		OutputFile outputFile = new OutputFile();
		outputFile.setBucket(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.OutputFile.Bucket"));
		outputFile.setLocation(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.OutputFile.Location"));
		outputFile.setObject(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.OutputFile.Object"));
		outputFile.setRoleArn(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.OutputFile.RoleArn"));
		transcodeOutput.setOutputFile(outputFile);

		M3U8NonStandardSupport m3U8NonStandardSupport = new M3U8NonStandardSupport();

		TS tS = new TS();
		tS.setMd5Support(context.booleanValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.M3U8NonStandardSupport.TS.Md5Support"));
		tS.setSizeSupport(context.booleanValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.M3U8NonStandardSupport.TS.SizeSupport"));
		m3U8NonStandardSupport.setTS(tS);
		transcodeOutput.setM3U8NonStandardSupport(m3U8NonStandardSupport);

		Properties properties = new Properties();
		properties.setWidth(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Width"));
		properties.setHeight(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Height"));
		properties.setBitrate(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Bitrate"));
		properties.setDuration(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Duration"));
		properties.setFps(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Fps"));
		properties.setFileSize(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.FileSize"));
		properties.setFileFormat(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.FileFormat"));

		Streams streams = new Streams();

		List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
		for (int i = 0; i < context.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList.Length"); i++) {
			VideoStream videoStream = new VideoStream();
			videoStream.setIndex(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Index"));
			videoStream.setCodecName(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].CodecName"));
			videoStream.setCodecLongName(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].CodecLongName"));
			videoStream.setProfile(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Profile"));
			videoStream.setCodecTimeBase(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].CodecTimeBase"));
			videoStream.setCodecTagString(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].CodecTagString"));
			videoStream.setCodecTag(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].CodecTag"));
			videoStream.setWidth(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Width"));
			videoStream.setHeight(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Height"));
			videoStream.setHasBFrames(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].HasBFrames"));
			videoStream.setSar(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Sar"));
			videoStream.setDar(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Dar"));
			videoStream.setPixFmt(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].PixFmt"));
			videoStream.setLevel(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Level"));
			videoStream.setFps(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Fps"));
			videoStream.setAvgFPS(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].AvgFPS"));
			videoStream.setTimebase(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Timebase"));
			videoStream.setStartTime(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].StartTime"));
			videoStream.setDuration(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Duration"));
			videoStream.setBitrate(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Bitrate"));
			videoStream.setNumFrames(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].NumFrames"));
			videoStream.setLang(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Lang"));

			NetworkCost networkCost = new NetworkCost();
			networkCost.setPreloadTime(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.PreloadTime"));
			networkCost.setCostBandwidth(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.CostBandwidth"));
			networkCost.setAvgBitrate(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.AvgBitrate"));
			videoStream.setNetworkCost(networkCost);

			videoStreamList.add(videoStream);
		}
		streams.setVideoStreamList(videoStreamList);

		List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
		for (int i = 0; i < context.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList.Length"); i++) {
			AudioStream audioStream = new AudioStream();
			audioStream.setIndex(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Index"));
			audioStream.setCodecName(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].CodecName"));
			audioStream.setCodecTimeBase(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].CodecTimeBase"));
			audioStream.setCodecLongName(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].CodecLongName"));
			audioStream.setCodecTagString(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].CodecTagString"));
			audioStream.setCodecTag(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].CodecTag"));
			audioStream.setSampleFmt(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].SampleFmt"));
			audioStream.setSamplerate(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Samplerate"));
			audioStream.setChannels(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Channels"));
			audioStream.setChannelLayout(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].ChannelLayout"));
			audioStream.setTimebase(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Timebase"));
			audioStream.setStartTime(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].StartTime"));
			audioStream.setDuration(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Duration"));
			audioStream.setBitrate(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Bitrate"));
			audioStream.setNumFrames(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].NumFrames"));
			audioStream.setLang(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Lang"));

			audioStreamList.add(audioStream);
		}
		streams.setAudioStreamList(audioStreamList);

		List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
		for (int i = 0; i < context.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.SubtitleStreamList.Length"); i++) {
			SubtitleStream subtitleStream = new SubtitleStream();
			subtitleStream.setIndex(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.SubtitleStreamList["+ i +"].Index"));
			subtitleStream.setLang(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.SubtitleStreamList["+ i +"].Lang"));

			subtitleStreamList.add(subtitleStream);
		}
		streams.setSubtitleStreamList(subtitleStreamList);
		properties.setStreams(streams);

		Format format = new Format();
		format.setNumStreams(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.NumStreams"));
		format.setNumPrograms(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.NumPrograms"));
		format.setFormatName(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.FormatName"));
		format.setFormatLongName(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.FormatLongName"));
		format.setStartTime(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.StartTime"));
		format.setDuration(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.Duration"));
		format.setSize(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.Size"));
		format.setBitrate(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.Bitrate"));
		properties.setFormat(format);
		transcodeOutput.setProperties(properties);

		Clip4 clip4 = new Clip4();

		TimeSpan timeSpan = new TimeSpan();
		timeSpan.setSeek(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Clip.TimeSpan.Seek"));
		timeSpan.setDuration(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Clip.TimeSpan.Duration"));
		clip4.setTimeSpan(timeSpan);
		transcodeOutput.setClip4(clip4);

		SuperReso superReso = new SuperReso();
		superReso.setIsHalfSample(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SuperReso.IsHalfSample"));
		transcodeOutput.setSuperReso(superReso);

		SubtitleConfig subtitleConfig = new SubtitleConfig();

		List<Subtitle> subtitleList = new ArrayList<Subtitle>();
		for (int i = 0; i < context.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.SubtitleList.Length"); i++) {
			Subtitle subtitle = new Subtitle();
			subtitle.setMap(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.SubtitleList["+ i +"].Map"));

			subtitleList.add(subtitle);
		}
		subtitleConfig.setSubtitleList(subtitleList);

		List<ExtSubtitle> extSubtitleList = new ArrayList<ExtSubtitle>();
		for (int i = 0; i < context.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList.Length"); i++) {
			ExtSubtitle extSubtitle = new ExtSubtitle();
			extSubtitle.setFontName(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList["+ i +"].FontName"));
			extSubtitle.setCharEnc(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList["+ i +"].CharEnc"));

			Input input = new Input();
			input.setBucket(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList["+ i +"].Input.Bucket"));
			input.setLocation(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList["+ i +"].Input.Location"));
			input.setObject(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList["+ i +"].Input.Object"));
			extSubtitle.setInput(input);

			extSubtitleList.add(extSubtitle);
		}
		subtitleConfig.setExtSubtitleList(extSubtitleList);
		transcodeOutput.setSubtitleConfig(subtitleConfig);

		TransConfig transConfig = new TransConfig();
		transConfig.setTransMode(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.TransMode"));
		transConfig.setIsCheckReso(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckReso"));
		transConfig.setIsCheckResoFail(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckResoFail"));
		transConfig.setIsCheckVideoBitrate(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckVideoBitrate"));
		transConfig.setIsCheckAudioBitrate(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckAudioBitrate"));
		transConfig.setAdjDarMethod(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.AdjDarMethod"));
		transConfig.setIsCheckVideoBitrateFail(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckVideoBitrateFail"));
		transConfig.setIsCheckAudioBitrateFail(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckAudioBitrateFail"));
		transConfig.setDuration(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.Duration"));
		transcodeOutput.setTransConfig(transConfig);

		MuxConfig muxConfig = new MuxConfig();

		Segment segment = new Segment();
		segment.setDuration(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MuxConfig.Segment.Duration"));
		muxConfig.setSegment(segment);

		Gif gif = new Gif();
		gif.setLoop(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MuxConfig.Gif.Loop"));
		gif.setFinalDelay(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MuxConfig.Gif.FinalDelay"));
		gif.setIsCustomPalette(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MuxConfig.Gif.IsCustomPalette"));
		gif.setDitherMode(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MuxConfig.Gif.DitherMode"));
		muxConfig.setGif(gif);
		transcodeOutput.setMuxConfig(muxConfig);

		Audio audio = new Audio();
		audio.setCodec(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Codec"));
		audio.setProfile(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Profile"));
		audio.setSamplerate(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Samplerate"));
		audio.setBitrate(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Bitrate"));
		audio.setChannels(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Channels"));
		audio.setQscale(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Qscale"));

		Volume volume = new Volume();
		volume.setLevel(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Volume.Level"));
		volume.setMethod(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Volume.Method"));
		audio.setVolume(volume);
		transcodeOutput.setAudio(audio);

		Video video = new Video();
		video.setCodec(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Codec"));
		video.setProfile(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Profile"));
		video.setBitrate(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Bitrate"));
		video.setCrf(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Crf"));
		video.setWidth(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Width"));
		video.setHeight(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Height"));
		video.setFps(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Fps"));
		video.setGop(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Gop"));
		video.setPreset(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Preset"));
		video.setScanMode(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.ScanMode"));
		video.setBufsize(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Bufsize"));
		video.setMaxrate(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Maxrate"));
		video.setPixFmt(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.PixFmt"));
		video.setDegrain(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Degrain"));
		video.setQscale(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Qscale"));
		video.setCrop(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Crop"));
		video.setPad(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Pad"));
		video.setMaxFps(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.MaxFps"));

		BitrateBnd bitrateBnd = new BitrateBnd();
		bitrateBnd.setMax(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.BitrateBnd.Max"));
		bitrateBnd.setMin(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.BitrateBnd.Min"));
		video.setBitrateBnd(bitrateBnd);
		transcodeOutput.setVideo(video);

		Container container = new Container();
		container.setFormat(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Container.Format"));
		transcodeOutput.setContainer(container);

		Encryption encryption = new Encryption();
		encryption.setType(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.Type"));
		encryption.setId(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.Id"));
		encryption.setKey(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.Key"));
		encryption.setKeyUri(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.KeyUri"));
		encryption.setKeyType(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.KeyType"));
		encryption.setSkipCnt(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.SkipCnt"));
		transcodeOutput.setEncryption(encryption);

		List<WaterMark> waterMarkList = new ArrayList<WaterMark>();
		for (int i = 0; i < context.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList.Length"); i++) {
			WaterMark waterMark = new WaterMark();
			waterMark.setWaterMarkTemplateId(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].WaterMarkTemplateId"));
			waterMark.setWidth(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].Width"));
			waterMark.setHeight(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].Height"));
			waterMark.setDx(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].Dx"));
			waterMark.setDy(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].Dy"));
			waterMark.setReferPos(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].ReferPos"));
			waterMark.setType(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].Type"));

			InputFile2 inputFile2 = new InputFile2();
			inputFile2.setBucket(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].InputFile.Bucket"));
			inputFile2.setLocation(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].InputFile.Location"));
			inputFile2.setObject(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].InputFile.Object"));
			waterMark.setInputFile2(inputFile2);

			waterMarkList.add(waterMark);
		}
		transcodeOutput.setWaterMarkList(waterMarkList);

		List<Merge> mergeList = new ArrayList<Merge>();
		for (int i = 0; i < context.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeList.Length"); i++) {
			Merge merge = new Merge();
			merge.setMergeURL(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeList["+ i +"].MergeURL"));
			merge.setStart(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeList["+ i +"].Start"));
			merge.setDuration(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeList["+ i +"].Duration"));
			merge.setRoleArn(context.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeList["+ i +"].RoleArn"));

			mergeList.add(merge);
		}
		transcodeOutput.setMergeList(mergeList);
		complexJob.setTranscodeOutput(transcodeOutput);

		MNSMessageResult mNSMessageResult = new MNSMessageResult();
		mNSMessageResult.setMessageId(context.stringValue("SubmitComplexJobResponse.ComplexJob.MNSMessageResult.MessageId"));
		mNSMessageResult.setErrorMessage(context.stringValue("SubmitComplexJobResponse.ComplexJob.MNSMessageResult.ErrorMessage"));
		mNSMessageResult.setErrorCode(context.stringValue("SubmitComplexJobResponse.ComplexJob.MNSMessageResult.ErrorCode"));
		complexJob.setMNSMessageResult(mNSMessageResult);

		List<InputsItem> inputs = new ArrayList<InputsItem>();
		for (int i = 0; i < context.lengthValue("SubmitComplexJobResponse.ComplexJob.Inputs.Length"); i++) {
			InputsItem inputsItem = new InputsItem();

			List<EditingInput> editingInputs = new ArrayList<EditingInput>();
			for (int j = 0; j < context.lengthValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs.Length"); j++) {
				EditingInput editingInput = new EditingInput();
				editingInput.setId(context.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].Id"));

				InputFile inputFile = new InputFile();
				inputFile.setBucket(context.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].InputFile.Bucket"));
				inputFile.setLocation(context.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].InputFile.Location"));
				inputFile.setObject(context.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].InputFile.Object"));
				editingInput.setInputFile(inputFile);

				InputConfig inputConfig = new InputConfig();
				inputConfig.setDeinterlaceMethod(context.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].InputConfig.DeinterlaceMethod"));
				inputConfig.setIsNormalSar(context.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].InputConfig.IsNormalSar"));
				editingInput.setInputConfig(inputConfig);

				editingInputs.add(editingInput);
			}
			inputsItem.setEditingInputs(editingInputs);

			inputs.add(inputsItem);
		}
		complexJob.setInputs(inputs);

		List<ComplexEditingConfigsItem> complexEditingConfigs = new ArrayList<ComplexEditingConfigsItem>();
		for (int i = 0; i < context.lengthValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs.Length"); i++) {
			ComplexEditingConfigsItem complexEditingConfigsItem = new ComplexEditingConfigsItem();

			Editing editing = new Editing();

			Timeline timeline = new Timeline();

			TimelineConfig timelineConfig = new TimelineConfig();

			TimelineConfigVideo timelineConfigVideo = new TimelineConfigVideo();
			timelineConfigVideo.setWidth(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.Width"));
			timelineConfigVideo.setHeight(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.Height"));
			timelineConfigVideo.setBgColor(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.BgColor"));
			timelineConfigVideo.setFps(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.Fps"));
			timelineConfigVideo.setRenderRatio(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.RenderRatio"));
			timelineConfigVideo.setReclosePrec(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.ReclosePrec"));
			timelineConfigVideo.setIsGpuData(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.IsGpuData"));
			timelineConfigVideo.setIsOneTrackData(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.IsOneTrackData"));
			timelineConfig.setTimelineConfigVideo(timelineConfigVideo);

			TimelineConfigAudio timelineConfigAudio = new TimelineConfigAudio();
			timelineConfigAudio.setSamplerate(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigAudio.Samplerate"));
			timelineConfigAudio.setChannelLayout(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigAudio.ChannelLayout"));
			timelineConfigAudio.setChannels(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigAudio.Channels"));
			timelineConfig.setTimelineConfigAudio(timelineConfigAudio);
			timeline.setTimelineConfig(timelineConfig);

			List<Track> trackList = new ArrayList<Track>();
			for (int j = 0; j < context.lengthValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList.Length"); j++) {
				Track track = new Track();
				track.setId(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Id"));
				track.setType(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Type"));
				track.setOrder(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Order"));

				List<Clip1> clips = new ArrayList<Clip1>();
				for (int k = 0; k < context.lengthValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips.Length"); k++) {
					Clip1 clip1 = new Clip1();
					clip1.setClipID(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].clipID"));
					clip1.setIn(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].In"));
					clip1.setOut(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].Out"));

					ClipsConfig clipsConfig = new ClipsConfig();

					ClipsConfigVideo clipsConfigVideo = new ClipsConfigVideo();
					clipsConfigVideo.setL(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].ClipsConfig.ClipsConfigVideo.L"));
					clipsConfigVideo.setT(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].ClipsConfig.ClipsConfigVideo.T"));
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
			for (int j = 0; j < context.lengthValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList.Length"); j++) {
				Clip clip = new Clip();
				clip.setId(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].Id"));
				clip.setType(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].Type"));
				clip.setSourceType(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].SourceType"));
				clip.setSourceID(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].SourceID"));
				clip.setSourceStrmMap(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].SourceStrmMap"));
				clip.setIn(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].In"));
				clip.setOut(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].Out"));

				List<Effect> effects = new ArrayList<Effect>();
				for (int k = 0; k < context.lengthValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].Effects.Length"); k++) {
					Effect effect = new Effect();
					effect.setEffect(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].Effects["+ k +"].Effect"));
					effect.setEffectConfig(context.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].Effects["+ k +"].EffectConfig"));

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