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
			jobResult.setSuccess(_ctx.booleanValue("SubmitJobsResponse.JobResultList["+ i +"].Success"));
			jobResult.setCode(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Code"));
			jobResult.setMessage(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Message"));

			Job job = new Job();
			job.setCreationTime(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.CreationTime"));
			job.setPercent(_ctx.longValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Percent"));
			job.setFinishTime(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.FinishTime"));
			job.setState(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.State"));
			job.setJobId(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.JobId"));
			job.setCode(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Code"));
			job.setMessage(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Message"));
			job.setPipelineId(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.PipelineId"));

			Output output = new Output();
			output.setWaterMarkConfigUrl(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkConfigUrl"));
			output.setDeWatermark(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.DeWatermark"));
			output.setPriority(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Priority"));
			output.setAudioStreamMap(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.AudioStreamMap"));
			output.setUserData(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.UserData"));
			output.setVideoStreamMap(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.VideoStreamMap"));
			output.setRotate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Rotate"));
			output.setMergeConfigUrl(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MergeConfigUrl"));
			output.setTemplateId(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TemplateId"));

			Video video = new Video();
			video.setBufsize(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Bufsize"));
			video.setDegrain(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Degrain"));
			video.setPixFmt(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.PixFmt"));
			video.setPad(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Pad"));
			video.setCodec(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Codec"));
			video.setHeight(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Height"));
			video.setQscale(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Qscale"));
			video.setCrop(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Crop"));
			video.setBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Bitrate"));
			video.setMaxrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Maxrate"));
			video.setMaxFps(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.MaxFps"));
			video.setProfile(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Profile"));
			video.setCrf(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Crf"));
			video.setGop(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Gop"));
			video.setWidth(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Width"));
			video.setFps(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Fps"));
			video.setPreset(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.Preset"));
			video.setScanMode(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.ScanMode"));
			video.setResoPriority(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.ResoPriority"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.BitrateBnd.Max"));
			bitrateBnd.setMin(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			output.setVideo(video);

			TransConfig transConfig = new TransConfig();
			transConfig.setIsCheckAudioBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.IsCheckAudioBitrate"));
			transConfig.setTransMode(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.TransMode"));
			transConfig.setIsCheckReso(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.IsCheckReso"));
			transConfig.setIsCheckVideoBitrateFail(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.IsCheckVideoBitrateFail"));
			transConfig.setAdjDarMethod(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.AdjDarMethod"));
			transConfig.setIsCheckVideoBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.IsCheckVideoBitrate"));
			transConfig.setIsCheckResoFail(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.IsCheckResoFail"));
			transConfig.setIsCheckAudioBitrateFail(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TransConfig.IsCheckAudioBitrateFail"));
			output.setTransConfig(transConfig);

			Encryption encryption = new Encryption();
			encryption.setType(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Encryption.Type"));
			encryption.setKey(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Encryption.Key"));
			encryption.setKeyType(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Encryption.KeyType"));
			encryption.setId(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Encryption.Id"));
			encryption.setKeyUri(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Encryption.KeyUri"));
			encryption.setSkipCnt(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Encryption.SkipCnt"));
			output.setEncryption(encryption);

			M3U8NonStandardSupport m3U8NonStandardSupport = new M3U8NonStandardSupport();

			TS tS = new TS();
			tS.setSizeSupport(_ctx.booleanValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.M3U8NonStandardSupport.TS.SizeSupport"));
			tS.setMd5Support(_ctx.booleanValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.M3U8NonStandardSupport.TS.Md5Support"));
			m3U8NonStandardSupport.setTS(tS);
			output.setM3U8NonStandardSupport(m3U8NonStandardSupport);

			Audio audio = new Audio();
			audio.setProfile(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Profile"));
			audio.setCodec(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Codec"));
			audio.setSamplerate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Samplerate"));
			audio.setQscale(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Qscale"));
			audio.setChannels(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Channels"));
			audio.setBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Bitrate"));

			Volume volume = new Volume();
			volume.setBizMethod(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Volume.Method"));
			volume.setLevel(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Audio.Volume.Level"));
			audio.setVolume(volume);
			output.setAudio(audio);

			SuperReso superReso = new SuperReso();
			superReso.setIsHalfSample(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SuperReso.IsHalfSample"));
			output.setSuperReso(superReso);

			DigiWaterMark digiWaterMark = new DigiWaterMark();
			digiWaterMark.setType(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.DigiWaterMark.Type"));
			digiWaterMark.setAlpha(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.DigiWaterMark.Alpha"));

			InputFile1 inputFile1 = new InputFile1();
			inputFile1.setObject(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.DigiWaterMark.InputFile.Object"));
			inputFile1.setLocation(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.DigiWaterMark.InputFile.Location"));
			inputFile1.setBucket(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.DigiWaterMark.InputFile.Bucket"));
			digiWaterMark.setInputFile1(inputFile1);
			output.setDigiWaterMark(digiWaterMark);

			OutputFile outputFile = new OutputFile();
			outputFile.setRoleArn(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutputFile.RoleArn"));
			outputFile.setObject(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutputFile.Object"));
			outputFile.setLocation(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutputFile.Location"));
			outputFile.setBucket(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutputFile.Bucket"));
			output.setOutputFile(outputFile);

			Container container = new Container();
			container.setFormat(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Container.Format"));
			output.setContainer(container);

			Clip clip = new Clip();

			TimeSpan timeSpan = new TimeSpan();
			timeSpan.setSeek(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Clip.TimeSpan.Seek"));
			timeSpan.setDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Clip.TimeSpan.Duration"));
			clip.setTimeSpan(timeSpan);
			output.setClip(clip);

			MuxConfig muxConfig = new MuxConfig();

			Webp webp = new Webp();
			webp.setLoop(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MuxConfig.Webp.Loop"));
			muxConfig.setWebp(webp);

			Gif gif = new Gif();
			gif.setFinalDelay(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MuxConfig.Gif.FinalDelay"));
			gif.setDitherMode(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MuxConfig.Gif.DitherMode"));
			gif.setLoop(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MuxConfig.Gif.Loop"));
			gif.setIsCustomPalette(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MuxConfig.Gif.IsCustomPalette"));
			muxConfig.setGif(gif);

			Segment segment = new Segment();
			segment.setDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);
			output.setMuxConfig(muxConfig);

			SubtitleConfig subtitleConfig = new SubtitleConfig();

			List<ExtSubtitle> extSubtitleList = new ArrayList<ExtSubtitle>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.ExtSubtitleList.Length"); j++) {
				ExtSubtitle extSubtitle = new ExtSubtitle();
				extSubtitle.setCharEnc(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.ExtSubtitleList["+ j +"].CharEnc"));
				extSubtitle.setFontName(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.ExtSubtitleList["+ j +"].FontName"));

				Input2 input2 = new Input2();
				input2.setObject(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Object"));
				input2.setLocation(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Location"));
				input2.setBucket(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Bucket"));
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

			Properties properties = new Properties();
			properties.setWidth(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Width"));
			properties.setHeight(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Height"));
			properties.setDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Duration"));
			properties.setFps(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Fps"));
			properties.setBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Bitrate"));
			properties.setFileFormat(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.FileFormat"));
			properties.setFileSize(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.FileSize"));

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setIndex(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setTimebase(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setAvgFPS(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setPixFmt(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setSar(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setLang(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Lang"));
				videoStream.setCodecLongName(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setHeight(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setNumFrames(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setCodecTagString(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setHasBFrames(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setProfile(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setStartTime(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDar(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setCodecName(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setWidth(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setFps(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setCodecTag(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setCodecTimeBase(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setLevel(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].Level"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setAvgBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				networkCost.setCostBandwidth(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setTimebase(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setIndex(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setSampleFmt(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setChannelLayout(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setLang(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Lang"));
				audioStream.setSamplerate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setCodecLongName(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setChannels(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setNumFrames(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setCodecTagString(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setStartTime(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setCodecName(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setCodecTag(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setCodecTimeBase(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Streams.AudioStreamList["+ j +"].CodecTimeBase"));

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
			properties.setStreams(streams);

			Format format = new Format();
			format.setStartTime(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.StartTime"));
			format.setNumPrograms(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.NumPrograms"));
			format.setSize(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.Size"));
			format.setNumStreams(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.NumStreams"));
			format.setFormatLongName(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.FormatLongName"));
			format.setDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.Duration"));
			format.setBitrate(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.Bitrate"));
			format.setFormatName(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.Properties.Format.FormatName"));
			properties.setFormat(format);
			output.setProperties(properties);

			List<WaterMark> waterMarkList = new ArrayList<WaterMark>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList.Length"); j++) {
				WaterMark waterMark = new WaterMark();
				waterMark.setType(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].Type"));
				waterMark.setReferPos(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].ReferPos"));
				waterMark.setDx(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].Dx"));
				waterMark.setWidth(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].Width"));
				waterMark.setHeight(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].Height"));
				waterMark.setWaterMarkTemplateId(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].WaterMarkTemplateId"));
				waterMark.setDy(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].Dy"));

				InputFile inputFile = new InputFile();
				inputFile.setObject(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].InputFile.Object"));
				inputFile.setLocation(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].InputFile.Location"));
				inputFile.setBucket(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.WaterMarkList["+ j +"].InputFile.Bucket"));
				waterMark.setInputFile(inputFile);

				waterMarkList.add(waterMark);
			}
			output.setWaterMarkList(waterMarkList);

			List<Merge> mergeList = new ArrayList<Merge>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MergeList.Length"); j++) {
				Merge merge = new Merge();
				merge.setStart(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MergeList["+ j +"].Start"));
				merge.setRoleArn(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MergeList["+ j +"].RoleArn"));
				merge.setMergeURL(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MergeList["+ j +"].MergeURL"));
				merge.setDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.MergeList["+ j +"].Duration"));

				mergeList.add(merge);
			}
			output.setMergeList(mergeList);

			List<OutSubtitle> outSubtitleList = new ArrayList<OutSubtitle>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutSubtitleList.Length"); j++) {
				OutSubtitle outSubtitle = new OutSubtitle();
				outSubtitle.setMap(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutSubtitleList["+ j +"].Map"));
				outSubtitle.setSuccess(_ctx.booleanValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutSubtitleList["+ j +"].Success"));
				outSubtitle.setMessage(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutSubtitleList["+ j +"].Message"));

				OutSubtitleFile outSubtitleFile = new OutSubtitleFile();
				outSubtitleFile.setRoleArn(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutSubtitleList["+ j +"].OutSubtitleFile.RoleArn"));
				outSubtitleFile.setObject(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutSubtitleList["+ j +"].OutSubtitleFile.Object"));
				outSubtitleFile.setLocation(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutSubtitleList["+ j +"].OutSubtitleFile.Location"));
				outSubtitleFile.setBucket(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OutSubtitleList["+ j +"].OutSubtitleFile.Bucket"));
				outSubtitle.setOutSubtitleFile(outSubtitleFile);

				outSubtitleList.add(outSubtitle);
			}
			output.setOutSubtitleList(outSubtitleList);

			List<Amix> amixList = new ArrayList<Amix>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.AmixList.Length"); j++) {
				Amix amix = new Amix();
				amix.setMap(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.AmixList["+ j +"].Map"));
				amix.setStart(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.AmixList["+ j +"].Start"));
				amix.setAmixURL(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.AmixList["+ j +"].AmixURL"));
				amix.setDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.AmixList["+ j +"].Duration"));
				amix.setMixDurMode(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.AmixList["+ j +"].MixDurMode"));

				amixList.add(amix);
			}
			output.setAmixList(amixList);

			List<Opening> openingList = new ArrayList<Opening>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OpeningList.Length"); j++) {
				Opening opening = new Opening();
				opening.setOpenUrl(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OpeningList["+ j +"].openUrl"));
				opening.setStart(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OpeningList["+ j +"].Start"));
				opening.setWidth(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OpeningList["+ j +"].Width"));
				opening.setHeight(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.OpeningList["+ j +"].Height"));

				openingList.add(opening);
			}
			output.setOpeningList(openingList);

			List<TailSlate> tailSlateList = new ArrayList<TailSlate>();
			for (int j = 0; j < _ctx.lengthValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TailSlateList.Length"); j++) {
				TailSlate tailSlate = new TailSlate();
				tailSlate.setStart(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TailSlateList["+ j +"].Start"));
				tailSlate.setBgColor(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TailSlateList["+ j +"].BgColor"));
				tailSlate.setIsMergeAudio(_ctx.booleanValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TailSlateList["+ j +"].IsMergeAudio"));
				tailSlate.setWidth(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TailSlateList["+ j +"].Width"));
				tailSlate.setHeight(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TailSlateList["+ j +"].Height"));
				tailSlate.setBlendDuration(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TailSlateList["+ j +"].BlendDuration"));
				tailSlate.setTailUrl(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Output.TailSlateList["+ j +"].TailUrl"));

				tailSlateList.add(tailSlate);
			}
			output.setTailSlateList(tailSlateList);
			job.setOutput(output);

			Input input = new Input();
			input.setObject(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Input.Object"));
			input.setLocation(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Input.Location"));
			input.setBucket(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.Input.Bucket"));
			job.setInput(input);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(_ctx.stringValue("SubmitJobsResponse.JobResultList["+ i +"].Job.MNSMessageResult.ErrorCode"));
			job.setMNSMessageResult(mNSMessageResult);
			jobResult.setJob(job);

			jobResultList.add(jobResult);
		}
		submitJobsResponse.setJobResultList(jobResultList);
	 
	 	return submitJobsResponse;
	}
}