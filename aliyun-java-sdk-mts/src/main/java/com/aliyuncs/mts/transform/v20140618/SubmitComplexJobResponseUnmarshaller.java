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
		complexJob.setCreationTime(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.CreationTime"));
		complexJob.setPercent(_ctx.longValue("SubmitComplexJobResponse.ComplexJob.Percent"));
		complexJob.setFinishTime(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.FinishTime"));
		complexJob.setState(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.State"));
		complexJob.setMessage(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.Message"));
		complexJob.setJobId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.JobId"));
		complexJob.setCode(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.Code"));
		complexJob.setPipelineId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.PipelineId"));

		TranscodeOutput transcodeOutput = new TranscodeOutput();
		transcodeOutput.setDeWatermark(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DeWatermark"));
		transcodeOutput.setWaterMarkConfigUrl(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkConfigUrl"));
		transcodeOutput.setPriority(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Priority"));
		transcodeOutput.setAudioStreamMap(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.AudioStreamMap"));
		transcodeOutput.setUserData(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.UserData"));
		transcodeOutput.setVideoStreamMap(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.VideoStreamMap"));
		transcodeOutput.setRotate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Rotate"));
		transcodeOutput.setMergeConfigUrl(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeConfigUrl"));
		transcodeOutput.setTemplateId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TemplateId"));

		Video video = new Video();
		video.setBufsize(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Bufsize"));
		video.setDegrain(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Degrain"));
		video.setPixFmt(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.PixFmt"));
		video.setPad(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Pad"));
		video.setCodec(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Codec"));
		video.setHeight(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Height"));
		video.setQscale(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Qscale"));
		video.setCrop(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Crop"));
		video.setBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Bitrate"));
		video.setMaxrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Maxrate"));
		video.setMaxFps(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.MaxFps"));
		video.setProfile(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Profile"));
		video.setCrf(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Crf"));
		video.setGop(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Gop"));
		video.setWidth(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Width"));
		video.setFps(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Fps"));
		video.setPreset(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.Preset"));
		video.setScanMode(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.ScanMode"));

		BitrateBnd bitrateBnd = new BitrateBnd();
		bitrateBnd.setMax(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.BitrateBnd.Max"));
		bitrateBnd.setMin(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Video.BitrateBnd.Min"));
		video.setBitrateBnd(bitrateBnd);
		transcodeOutput.setVideo(video);

		TransConfig transConfig = new TransConfig();
		transConfig.setIsCheckAudioBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckAudioBitrate"));
		transConfig.setIsCheckReso(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckReso"));
		transConfig.setTransMode(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.TransMode"));
		transConfig.setIsCheckVideoBitrateFail(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckVideoBitrateFail"));
		transConfig.setAdjDarMethod(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.AdjDarMethod"));
		transConfig.setDuration(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.Duration"));
		transConfig.setIsCheckVideoBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckVideoBitrate"));
		transConfig.setIsCheckResoFail(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckResoFail"));
		transConfig.setIsCheckAudioBitrateFail(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.TransConfig.IsCheckAudioBitrateFail"));
		transcodeOutput.setTransConfig(transConfig);

		Encryption encryption = new Encryption();
		encryption.setType(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.Type"));
		encryption.setKey(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.Key"));
		encryption.setKeyType(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.KeyType"));
		encryption.setId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.Id"));
		encryption.setKeyUri(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.KeyUri"));
		encryption.setSkipCnt(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Encryption.SkipCnt"));
		transcodeOutput.setEncryption(encryption);

		M3U8NonStandardSupport m3U8NonStandardSupport = new M3U8NonStandardSupport();

		TS tS = new TS();
		tS.setSizeSupport(_ctx.booleanValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.M3U8NonStandardSupport.TS.SizeSupport"));
		tS.setMd5Support(_ctx.booleanValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.M3U8NonStandardSupport.TS.Md5Support"));
		m3U8NonStandardSupport.setTS(tS);
		transcodeOutput.setM3U8NonStandardSupport(m3U8NonStandardSupport);

		Audio audio = new Audio();
		audio.setProfile(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Profile"));
		audio.setCodec(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Codec"));
		audio.setSamplerate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Samplerate"));
		audio.setQscale(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Qscale"));
		audio.setChannels(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Channels"));
		audio.setBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Bitrate"));

		Volume volume = new Volume();
		volume.setBizMethod(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Volume.Method"));
		volume.setLevel(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Audio.Volume.Level"));
		audio.setVolume(volume);
		transcodeOutput.setAudio(audio);

		SuperReso superReso = new SuperReso();
		superReso.setIsHalfSample(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SuperReso.IsHalfSample"));
		transcodeOutput.setSuperReso(superReso);

		DigiWaterMark digiWaterMark = new DigiWaterMark();
		digiWaterMark.setType(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DigiWaterMark.Type"));
		digiWaterMark.setAlpha(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DigiWaterMark.Alpha"));

		InputFile3 inputFile3 = new InputFile3();
		inputFile3.setObject(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DigiWaterMark.InputFile.Object"));
		inputFile3.setLocation(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DigiWaterMark.InputFile.Location"));
		inputFile3.setBucket(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.DigiWaterMark.InputFile.Bucket"));
		digiWaterMark.setInputFile3(inputFile3);
		transcodeOutput.setDigiWaterMark(digiWaterMark);

		OutputFile outputFile = new OutputFile();
		outputFile.setRoleArn(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.OutputFile.RoleArn"));
		outputFile.setObject(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.OutputFile.Object"));
		outputFile.setLocation(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.OutputFile.Location"));
		outputFile.setBucket(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.OutputFile.Bucket"));
		transcodeOutput.setOutputFile(outputFile);

		Container container = new Container();
		container.setFormat(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Container.Format"));
		transcodeOutput.setContainer(container);

		Clip4 clip4 = new Clip4();

		TimeSpan timeSpan = new TimeSpan();
		timeSpan.setSeek(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Clip.TimeSpan.Seek"));
		timeSpan.setDuration(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Clip.TimeSpan.Duration"));
		clip4.setTimeSpan(timeSpan);
		transcodeOutput.setClip4(clip4);

		MuxConfig muxConfig = new MuxConfig();

		Gif gif = new Gif();
		gif.setFinalDelay(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MuxConfig.Gif.FinalDelay"));
		gif.setDitherMode(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MuxConfig.Gif.DitherMode"));
		gif.setLoop(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MuxConfig.Gif.Loop"));
		gif.setIsCustomPalette(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MuxConfig.Gif.IsCustomPalette"));
		muxConfig.setGif(gif);

		Segment segment = new Segment();
		segment.setDuration(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MuxConfig.Segment.Duration"));
		muxConfig.setSegment(segment);
		transcodeOutput.setMuxConfig(muxConfig);

		SubtitleConfig subtitleConfig = new SubtitleConfig();

		List<ExtSubtitle> extSubtitleList = new ArrayList<ExtSubtitle>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList.Length"); i++) {
			ExtSubtitle extSubtitle = new ExtSubtitle();
			extSubtitle.setCharEnc(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList["+ i +"].CharEnc"));
			extSubtitle.setFontName(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList["+ i +"].FontName"));

			Input input = new Input();
			input.setObject(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList["+ i +"].Input.Object"));
			input.setLocation(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList["+ i +"].Input.Location"));
			input.setBucket(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.ExtSubtitleList["+ i +"].Input.Bucket"));
			extSubtitle.setInput(input);

			extSubtitleList.add(extSubtitle);
		}
		subtitleConfig.setExtSubtitleList(extSubtitleList);

		List<Subtitle> subtitleList = new ArrayList<Subtitle>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.SubtitleList.Length"); i++) {
			Subtitle subtitle = new Subtitle();
			subtitle.setMap(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.SubtitleConfig.SubtitleList["+ i +"].Map"));

			subtitleList.add(subtitle);
		}
		subtitleConfig.setSubtitleList(subtitleList);
		transcodeOutput.setSubtitleConfig(subtitleConfig);

		Properties properties = new Properties();
		properties.setWidth(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Width"));
		properties.setHeight(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Height"));
		properties.setDuration(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Duration"));
		properties.setFps(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Fps"));
		properties.setBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Bitrate"));
		properties.setFileFormat(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.FileFormat"));
		properties.setFileSize(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.FileSize"));

		Streams streams = new Streams();

		List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList.Length"); i++) {
			VideoStream videoStream = new VideoStream();
			videoStream.setIndex(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Index"));
			videoStream.setTimebase(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Timebase"));
			videoStream.setAvgFPS(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].AvgFPS"));
			videoStream.setPixFmt(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].PixFmt"));
			videoStream.setSar(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Sar"));
			videoStream.setLang(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Lang"));
			videoStream.setCodecLongName(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].CodecLongName"));
			videoStream.setHeight(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Height"));
			videoStream.setNumFrames(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].NumFrames"));
			videoStream.setBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Bitrate"));
			videoStream.setCodecTagString(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].CodecTagString"));
			videoStream.setHasBFrames(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].HasBFrames"));
			videoStream.setProfile(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Profile"));
			videoStream.setStartTime(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].StartTime"));
			videoStream.setDar(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Dar"));
			videoStream.setCodecName(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].CodecName"));
			videoStream.setWidth(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Width"));
			videoStream.setDuration(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Duration"));
			videoStream.setFps(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Fps"));
			videoStream.setCodecTag(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].CodecTag"));
			videoStream.setCodecTimeBase(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].CodecTimeBase"));
			videoStream.setLevel(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].Level"));

			NetworkCost networkCost = new NetworkCost();
			networkCost.setPreloadTime(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.PreloadTime"));
			networkCost.setAvgBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.AvgBitrate"));
			networkCost.setCostBandwidth(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.CostBandwidth"));
			videoStream.setNetworkCost(networkCost);

			videoStreamList.add(videoStream);
		}
		streams.setVideoStreamList(videoStreamList);

		List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList.Length"); i++) {
			AudioStream audioStream = new AudioStream();
			audioStream.setTimebase(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Timebase"));
			audioStream.setIndex(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Index"));
			audioStream.setSampleFmt(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].SampleFmt"));
			audioStream.setChannelLayout(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].ChannelLayout"));
			audioStream.setLang(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Lang"));
			audioStream.setSamplerate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Samplerate"));
			audioStream.setCodecLongName(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].CodecLongName"));
			audioStream.setChannels(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Channels"));
			audioStream.setNumFrames(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].NumFrames"));
			audioStream.setBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Bitrate"));
			audioStream.setCodecTagString(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].CodecTagString"));
			audioStream.setStartTime(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].StartTime"));
			audioStream.setCodecName(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].CodecName"));
			audioStream.setDuration(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].Duration"));
			audioStream.setCodecTag(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].CodecTag"));
			audioStream.setCodecTimeBase(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Streams.AudioStreamList["+ i +"].CodecTimeBase"));

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
		format.setStartTime(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.StartTime"));
		format.setNumPrograms(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.NumPrograms"));
		format.setSize(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.Size"));
		format.setNumStreams(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.NumStreams"));
		format.setFormatLongName(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.FormatLongName"));
		format.setDuration(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.Duration"));
		format.setBitrate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.Bitrate"));
		format.setFormatName(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.Properties.Format.FormatName"));
		properties.setFormat(format);
		transcodeOutput.setProperties(properties);

		List<WaterMark> waterMarkList = new ArrayList<WaterMark>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList.Length"); i++) {
			WaterMark waterMark = new WaterMark();
			waterMark.setType(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].Type"));
			waterMark.setReferPos(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].ReferPos"));
			waterMark.setDx(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].Dx"));
			waterMark.setWidth(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].Width"));
			waterMark.setHeight(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].Height"));
			waterMark.setWaterMarkTemplateId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].WaterMarkTemplateId"));
			waterMark.setDy(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].Dy"));

			InputFile2 inputFile2 = new InputFile2();
			inputFile2.setObject(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].InputFile.Object"));
			inputFile2.setLocation(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].InputFile.Location"));
			inputFile2.setBucket(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.WaterMarkList["+ i +"].InputFile.Bucket"));
			waterMark.setInputFile2(inputFile2);

			waterMarkList.add(waterMark);
		}
		transcodeOutput.setWaterMarkList(waterMarkList);

		List<Merge> mergeList = new ArrayList<Merge>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeList.Length"); i++) {
			Merge merge = new Merge();
			merge.setStart(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeList["+ i +"].Start"));
			merge.setRoleArn(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeList["+ i +"].RoleArn"));
			merge.setMergeURL(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeList["+ i +"].MergeURL"));
			merge.setDuration(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.transcodeOutput.MergeList["+ i +"].Duration"));

			mergeList.add(merge);
		}
		transcodeOutput.setMergeList(mergeList);
		complexJob.setTranscodeOutput(transcodeOutput);

		MNSMessageResult mNSMessageResult = new MNSMessageResult();
		mNSMessageResult.setMessageId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.MNSMessageResult.MessageId"));
		mNSMessageResult.setErrorMessage(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.MNSMessageResult.ErrorMessage"));
		mNSMessageResult.setErrorCode(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.MNSMessageResult.ErrorCode"));
		complexJob.setMNSMessageResult(mNSMessageResult);

		List<ComplexEditingConfigsItem> complexEditingConfigs = new ArrayList<ComplexEditingConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs.Length"); i++) {
			ComplexEditingConfigsItem complexEditingConfigsItem = new ComplexEditingConfigsItem();

			Editing editing = new Editing();

			Timeline timeline = new Timeline();

			TimelineConfig timelineConfig = new TimelineConfig();

			TimelineConfigAudio timelineConfigAudio = new TimelineConfigAudio();
			timelineConfigAudio.setChannelLayout(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigAudio.ChannelLayout"));
			timelineConfigAudio.setSamplerate(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigAudio.Samplerate"));
			timelineConfigAudio.setChannels(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigAudio.Channels"));
			timelineConfig.setTimelineConfigAudio(timelineConfigAudio);

			TimelineConfigVideo timelineConfigVideo = new TimelineConfigVideo();
			timelineConfigVideo.setBgColor(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.BgColor"));
			timelineConfigVideo.setWidth(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.Width"));
			timelineConfigVideo.setRenderRatio(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.RenderRatio"));
			timelineConfigVideo.setIsGpuData(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.IsGpuData"));
			timelineConfigVideo.setHeight(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.Height"));
			timelineConfigVideo.setIsOneTrackData(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.IsOneTrackData"));
			timelineConfigVideo.setFps(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.Fps"));
			timelineConfigVideo.setReclosePrec(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TimelineConfig.TimelineConfigVideo.ReclosePrec"));
			timelineConfig.setTimelineConfigVideo(timelineConfigVideo);
			timeline.setTimelineConfig(timelineConfig);

			List<Track> trackList = new ArrayList<Track>();
			for (int j = 0; j < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList.Length"); j++) {
				Track track = new Track();
				track.setType(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Type"));
				track.setOrder(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Order"));
				track.setId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Id"));

				List<Clip1> clips = new ArrayList<Clip1>();
				for (int k = 0; k < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips.Length"); k++) {
					Clip1 clip1 = new Clip1();
					clip1.setOut(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].Out"));
					clip1.setIn(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].In"));
					clip1.setClipID(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].clipID"));

					ClipsConfig clipsConfig = new ClipsConfig();

					ClipsConfigVideo clipsConfigVideo = new ClipsConfigVideo();
					clipsConfigVideo.setT(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].ClipsConfig.ClipsConfigVideo.T"));
					clipsConfigVideo.setL(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].ClipsConfig.ClipsConfigVideo.L"));
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
				clip.setType(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].Type"));
				clip.setSourceID(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].SourceID"));
				clip.setSourceType(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].SourceType"));
				clip.setSourceStrmMap(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].SourceStrmMap"));
				clip.setOut(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].Out"));
				clip.setIn(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].In"));
				clip.setId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.ComplexEditingConfigs["+ i +"].Editing.ClipList["+ j +"].Id"));

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

		List<InputsItem> inputs = new ArrayList<InputsItem>();
		for (int i = 0; i < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.Inputs.Length"); i++) {
			InputsItem inputsItem = new InputsItem();

			List<EditingInput> editingInputs = new ArrayList<EditingInput>();
			for (int j = 0; j < _ctx.lengthValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs.Length"); j++) {
				EditingInput editingInput = new EditingInput();
				editingInput.setId(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].Id"));

				InputFile inputFile = new InputFile();
				inputFile.setObject(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].InputFile.Object"));
				inputFile.setLocation(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].InputFile.Location"));
				inputFile.setBucket(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].InputFile.Bucket"));
				editingInput.setInputFile(inputFile);

				InputConfig inputConfig = new InputConfig();
				inputConfig.setIsNormalSar(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].InputConfig.IsNormalSar"));
				inputConfig.setDeinterlaceMethod(_ctx.stringValue("SubmitComplexJobResponse.ComplexJob.Inputs["+ i +"].EditingInputs["+ j +"].InputConfig.DeinterlaceMethod"));
				editingInput.setInputConfig(inputConfig);

				editingInputs.add(editingInput);
			}
			inputsItem.setEditingInputs(editingInputs);

			inputs.add(inputsItem);
		}
		complexJob.setInputs(inputs);
		submitComplexJobResponse.setComplexJob(complexJob);
	 
	 	return submitComplexJobResponse;
	}
}