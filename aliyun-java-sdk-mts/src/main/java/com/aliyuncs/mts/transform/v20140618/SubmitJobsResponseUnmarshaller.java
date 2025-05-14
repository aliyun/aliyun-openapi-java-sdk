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

import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Input;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Amix;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Audio;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Audio.Volume;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Clip;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Clip.TimeSpan;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Container;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.DigiWaterMark;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.DigiWaterMark.InputFile1;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Encryption;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.M3U8NonStandardSupport;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.M3U8NonStandardSupport.TS;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Merge;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.MuxConfig;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.MuxConfig.Webp;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Opening;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.OutSubtitle;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.OutSubtitle.OutSubtitleFile;
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
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.SubtitleConfig.ExtSubtitle.Input2;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.SubtitleConfig.Subtitle;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.SuperReso;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.TailSlate;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.TransConfig;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Video;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.Video.BitrateBnd;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.WaterMark;
import com.aliyuncs.mts.model.v20140618.SubmitJobsResponse.JobResult.Job.Output.WaterMark.InputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitJobsResponseUnmarshaller {

	public static SubmitJobsResponse unmarshall(SubmitJobsResponse submitJobsResponse, UnmarshallerContext _ctx) {
		
		submitJobsResponse.setRequestId(_ctx.stringValue("SubmitJobsResponse.RequestId"));

		List<JobResult> jobResultList = new ArrayList<JobResult>();
		for (int i = 0; i < _ctx.lengthValue("SubmitJobsResponse.JobResultList.Length"); i++) {
			JobResult jobResult = new JobResult();
			jobResult.setCode(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Code"));
			jobResult.setMessage(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Message"));
			jobResult.setSuccess(_ctx.booleanValue("SubmitJobsResponse.JobResultList["+ i +"].Success"));

			Job job = new Job();
			job.setCode(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Code"));
			job.setCreationTime(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.CreationTime"));
			job.setFinishTime(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.FinishTime"));
			job.setJobId(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.JobId"));
			job.setMessage(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Message"));
			job.setPercent(_ctx.longValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Percent"));
			job.setPipelineId(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.PipelineId"));
			job.setState(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.State"));

			Input input = new Input();
			input.setBucket(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Input.Bucket"));
			input.setLocation(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Input.Location"));
			input.setObject(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Input.Object"));
			job.setInput(input);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setErrorCode(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.MNSMessageResult.ErrorCode"));
			mNSMessageResult.setErrorMessage(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setMessageId(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.MNSMessageResult.MessageId"));
			job.setMNSMessageResult(mNSMessageResult);

			Output output = new Output();
			output.setAudioStreamMap(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.AudioStreamMap"));
			output.setDeWatermark(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.DeWatermark"));
			output.setMergeConfigUrl(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MergeConfigUrl"));
			output.setPriority(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Priority"));
			output.setRotate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Rotate"));
			output.setTemplateId(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TemplateId"));
			output.setUserData(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.UserData"));
			output.setVideoStreamMap(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.VideoStreamMap"));
			output.setWaterMarkConfigUrl(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkConfigUrl"));

			Audio audio = new Audio();
			audio.setBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Bitrate"));
			audio.setChannels(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Channels"));
			audio.setCodec(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Codec"));
			audio.setProfile(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Profile"));
			audio.setQscale(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Qscale"));
			audio.setSamplerate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Samplerate"));

			Volume volume = new Volume();
			volume.setLevel(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Volume.Level"));
			volume.setBizMethod(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Volume.Method"));
			audio.setVolume(volume);
			output.setAudio(audio);

			Clip clip = new Clip();

			TimeSpan timeSpan = new TimeSpan();
			timeSpan.setDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Clip.TimeSpan.Duration"));
			timeSpan.setSeek(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Clip.TimeSpan.Seek"));
			clip.setTimeSpan(timeSpan);
			output.setClip(clip);

			Container container = new Container();
			container.setFormat(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Container.Format"));
			output.setContainer(container);

			DigiWaterMark digiWaterMark = new DigiWaterMark();
			digiWaterMark.setAlpha(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.DigiWaterMark.Alpha"));
			digiWaterMark.setType(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.DigiWaterMark.Type"));

			InputFile1 inputFile1 = new InputFile1();
			inputFile1.setBucket(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.DigiWaterMark.InputFile.Bucket"));
			inputFile1.setLocation(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.DigiWaterMark.InputFile.Location"));
			inputFile1.setObject(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.DigiWaterMark.InputFile.Object"));
			digiWaterMark.setInputFile1(inputFile1);
			output.setDigiWaterMark(digiWaterMark);

			Encryption encryption = new Encryption();
			encryption.setId(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Encryption.Id"));
			encryption.setKey(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Encryption.Key"));
			encryption.setKeyType(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Encryption.KeyType"));
			encryption.setKeyUri(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Encryption.KeyUri"));
			encryption.setSkipCnt(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Encryption.SkipCnt"));
			encryption.setType(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Encryption.Type"));
			output.setEncryption(encryption);

			M3U8NonStandardSupport m3U8NonStandardSupport = new M3U8NonStandardSupport();

			TS tS = new TS();
			tS.setMd5Support(_ctx.booleanValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.M3U8NonStandardSupport.TS.Md5Support"));
			tS.setSizeSupport(_ctx.booleanValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.M3U8NonStandardSupport.TS.SizeSupport"));
			m3U8NonStandardSupport.setTS(tS);
			output.setM3U8NonStandardSupport(m3U8NonStandardSupport);

			MuxConfig muxConfig = new MuxConfig();

			Gif gif = new Gif();
			gif.setDitherMode(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MuxConfig.Gif.DitherMode"));
			gif.setFinalDelay(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MuxConfig.Gif.FinalDelay"));
			gif.setIsCustomPalette(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MuxConfig.Gif.IsCustomPalette"));
			gif.setLoop(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MuxConfig.Gif.Loop"));
			muxConfig.setGif(gif);

			Segment segment = new Segment();
			segment.setDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);

			Webp webp = new Webp();
			webp.setLoop(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MuxConfig.Webp.Loop"));
			muxConfig.setWebp(webp);
			output.setMuxConfig(muxConfig);

			OutputFile outputFile = new OutputFile();
			outputFile.setBucket(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutputFile.Bucket"));
			outputFile.setLocation(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutputFile.Location"));
			outputFile.setObject(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutputFile.Object"));
			outputFile.setRoleArn(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutputFile.RoleArn"));
			output.setOutputFile(outputFile);

			Properties properties = new Properties();
			properties.setBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Bitrate"));
			properties.setDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Duration"));
			properties.setFileFormat(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.FileFormat"));
			properties.setFileSize(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.FileSize"));
			properties.setFps(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Fps"));
			properties.setHeight(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Height"));
			properties.setWidth(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Width"));

			Format format = new Format();
			format.setBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.Bitrate"));
			format.setDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.Duration"));
			format.setFormatLongName(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.FormatLongName"));
			format.setFormatName(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.FormatName"));
			format.setNumPrograms(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.NumPrograms"));
			format.setNumStreams(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.NumStreams"));
			format.setSize(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.Size"));
			format.setStartTime(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.StartTime"));
			properties.setFormat(format);

			Streams streams = new Streams();

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setChannelLayout(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setChannels(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setCodecLongName(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setCodecName(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setCodecTag(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setCodecTagString(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setCodecTimeBase(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].CodecTimeBase"));
				audioStream.setDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setIndex(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setLang(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Lang"));
				audioStream.setNumFrames(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setSampleFmt(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setSamplerate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setStartTime(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setTimebase(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Timebase"));

				audioStreamList.add(audioStream);
			}
			streams.setAudioStreamList(audioStreamList);

			List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.SubtitleStreamList.Length"); j++) {
				SubtitleStream subtitleStream = new SubtitleStream();
				subtitleStream.setIndex(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.SubtitleStreamList["+ j +"].Index"));
				subtitleStream.setLang(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.SubtitleStreamList["+ j +"].Lang"));

				subtitleStreamList.add(subtitleStream);
			}
			streams.setSubtitleStreamList(subtitleStreamList);

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setAvgFPS(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setCodecLongName(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setCodecName(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setCodecTag(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setCodecTagString(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setCodecTimeBase(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setDar(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setFps(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setHasBFrames(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setHeight(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setIndex(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setLang(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Lang"));
				videoStream.setLevel(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Level"));
				videoStream.setNumFrames(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setPixFmt(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setProfile(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setSar(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setStartTime(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setTimebase(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setWidth(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Width"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setAvgBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				networkCost.setCostBandwidth(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				networkCost.setPreloadTime(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);
			properties.setStreams(streams);
			output.setProperties(properties);

			SubtitleConfig subtitleConfig = new SubtitleConfig();

			List<ExtSubtitle> extSubtitleList = new ArrayList<ExtSubtitle>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.ExtSubtitleList.Length"); j++) {
				ExtSubtitle extSubtitle = new ExtSubtitle();
				extSubtitle.setCharEnc(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.ExtSubtitleList["+ j +"].CharEnc"));
				extSubtitle.setFontName(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.ExtSubtitleList["+ j +"].FontName"));

				Input2 input2 = new Input2();
				input2.setBucket(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Bucket"));
				input2.setLocation(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Location"));
				input2.setObject(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Object"));
				extSubtitle.setInput2(input2);

				extSubtitleList.add(extSubtitle);
			}
			subtitleConfig.setExtSubtitleList(extSubtitleList);

			List<Subtitle> subtitleList = new ArrayList<Subtitle>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.SubtitleList.Length"); j++) {
				Subtitle subtitle = new Subtitle();
				subtitle.setMap(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.SubtitleList["+ j +"].Map"));

				subtitleList.add(subtitle);
			}
			subtitleConfig.setSubtitleList(subtitleList);
			output.setSubtitleConfig(subtitleConfig);

			SuperReso superReso = new SuperReso();
			superReso.setIsHalfSample(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SuperReso.IsHalfSample"));
			output.setSuperReso(superReso);

			TransConfig transConfig = new TransConfig();
			transConfig.setAdjDarMethod(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.AdjDarMethod"));
			transConfig.setIsCheckAudioBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.IsCheckAudioBitrate"));
			transConfig.setIsCheckAudioBitrateFail(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.IsCheckAudioBitrateFail"));
			transConfig.setIsCheckReso(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.IsCheckReso"));
			transConfig.setIsCheckResoFail(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.IsCheckResoFail"));
			transConfig.setIsCheckVideoBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.IsCheckVideoBitrate"));
			transConfig.setIsCheckVideoBitrateFail(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.IsCheckVideoBitrateFail"));
			transConfig.setTransMode(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.TransMode"));
			output.setTransConfig(transConfig);

			Video video = new Video();
			video.setBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Bitrate"));
			video.setBufsize(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Bufsize"));
			video.setCodec(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Codec"));
			video.setCrf(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Crf"));
			video.setCrop(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Crop"));
			video.setDegrain(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Degrain"));
			video.setFps(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Fps"));
			video.setGop(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Gop"));
			video.setHeight(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Height"));
			video.setMaxFps(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.MaxFps"));
			video.setMaxrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Maxrate"));
			video.setPad(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Pad"));
			video.setPixFmt(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.PixFmt"));
			video.setPreset(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Preset"));
			video.setProfile(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Profile"));
			video.setQscale(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Qscale"));
			video.setResoPriority(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.ResoPriority"));
			video.setScanMode(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.ScanMode"));
			video.setWidth(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Width"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.BitrateBnd.Max"));
			bitrateBnd.setMin(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			output.setVideo(video);

			List<Amix> amixList = new ArrayList<Amix>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.AmixList.Length"); j++) {
				Amix amix = new Amix();
				amix.setAmixURL(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.AmixList["+ j +"].AmixURL"));
				amix.setDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.AmixList["+ j +"].Duration"));
				amix.setMap(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.AmixList["+ j +"].Map"));
				amix.setMixDurMode(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.AmixList["+ j +"].MixDurMode"));
				amix.setStart(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.AmixList["+ j +"].Start"));

				amixList.add(amix);
			}
			output.setAmixList(amixList);

			List<Merge> mergeList = new ArrayList<Merge>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MergeList.Length"); j++) {
				Merge merge = new Merge();
				merge.setDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MergeList["+ j +"].Duration"));
				merge.setMergeURL(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MergeList["+ j +"].MergeURL"));
				merge.setRoleArn(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MergeList["+ j +"].RoleArn"));
				merge.setStart(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MergeList["+ j +"].Start"));

				mergeList.add(merge);
			}
			output.setMergeList(mergeList);

			List<Opening> openingList = new ArrayList<Opening>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OpeningList.Length"); j++) {
				Opening opening = new Opening();
				opening.setHeight(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OpeningList["+ j +"].Height"));
				opening.setStart(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OpeningList["+ j +"].Start"));
				opening.setWidth(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OpeningList["+ j +"].Width"));
				opening.setOpenUrl(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OpeningList["+ j +"].openUrl"));

				openingList.add(opening);
			}
			output.setOpeningList(openingList);

			List<OutSubtitle> outSubtitleList = new ArrayList<OutSubtitle>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutSubtitleList.Length"); j++) {
				OutSubtitle outSubtitle = new OutSubtitle();
				outSubtitle.setMap(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutSubtitleList["+ j +"].Map"));
				outSubtitle.setMessage(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutSubtitleList["+ j +"].Message"));
				outSubtitle.setSuccess(_ctx.booleanValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutSubtitleList["+ j +"].Success"));

				OutSubtitleFile outSubtitleFile = new OutSubtitleFile();
				outSubtitleFile.setBucket(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutSubtitleList["+ j +"].OutSubtitleFile.Bucket"));
				outSubtitleFile.setLocation(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutSubtitleList["+ j +"].OutSubtitleFile.Location"));
				outSubtitleFile.setObject(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutSubtitleList["+ j +"].OutSubtitleFile.Object"));
				outSubtitleFile.setRoleArn(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutSubtitleList["+ j +"].OutSubtitleFile.RoleArn"));
				outSubtitle.setOutSubtitleFile(outSubtitleFile);

				outSubtitleList.add(outSubtitle);
			}
			output.setOutSubtitleList(outSubtitleList);

			List<TailSlate> tailSlateList = new ArrayList<TailSlate>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TailSlateList.Length"); j++) {
				TailSlate tailSlate = new TailSlate();
				tailSlate.setBgColor(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TailSlateList["+ j +"].BgColor"));
				tailSlate.setBlendDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TailSlateList["+ j +"].BlendDuration"));
				tailSlate.setHeight(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TailSlateList["+ j +"].Height"));
				tailSlate.setIsMergeAudio(_ctx.booleanValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TailSlateList["+ j +"].IsMergeAudio"));
				tailSlate.setStart(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TailSlateList["+ j +"].Start"));
				tailSlate.setTailUrl(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TailSlateList["+ j +"].TailUrl"));
				tailSlate.setWidth(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TailSlateList["+ j +"].Width"));

				tailSlateList.add(tailSlate);
			}
			output.setTailSlateList(tailSlateList);

			List<WaterMark> waterMarkList = new ArrayList<WaterMark>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList.Length"); j++) {
				WaterMark waterMark = new WaterMark();
				waterMark.setDx(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].Dx"));
				waterMark.setDy(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].Dy"));
				waterMark.setHeight(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].Height"));
				waterMark.setReferPos(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].ReferPos"));
				waterMark.setType(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].Type"));
				waterMark.setWaterMarkTemplateId(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].WaterMarkTemplateId"));
				waterMark.setWidth(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].Width"));

				InputFile inputFile = new InputFile();
				inputFile.setBucket(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].InputFile.Bucket"));
				inputFile.setLocation(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].InputFile.Location"));
				inputFile.setObject(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].InputFile.Object"));
				waterMark.setInputFile(inputFile);

				waterMarkList.add(waterMark);
			}
			output.setWaterMarkList(waterMarkList);
			job.setOutput(output);
			jobResult.setJob(job);

			jobResultList.add(jobResult);
		}
		submitJobsResponse.setJobResultList(jobResultList);
	 
	 	return submitJobsResponse;
	}
}