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

import com.aliyuncs.mts.model.v20140618.QueryJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Input;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Audio;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Audio.Volume;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Clip;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Clip.TimeSpan;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Container;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Encryption;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.M3U8NonStandardSupport;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.M3U8NonStandardSupport.TS;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Merge;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.MuxConfig;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.MuxConfig.Webp;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Opening;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.OutSubtitle;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.OutSubtitle.OutSubtitleFile;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.OutputFile;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Properties;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Properties.Format;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Properties.SourceLogo;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Properties.Streams;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Properties.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Properties.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Properties.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Properties.Streams.VideoStream.NetworkCost;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.SubtitleConfig;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.SubtitleConfig.ExtSubtitle;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.SubtitleConfig.ExtSubtitle.Input1;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.SubtitleConfig.Subtitle;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.SuperReso;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.TailSlate;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.TransConfig;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Video;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.Video.BitrateBnd;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.WaterMark;
import com.aliyuncs.mts.model.v20140618.QueryJobListResponse.Job.Output.WaterMark.InputFile;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryJobListResponseUnmarshaller {

	public static QueryJobListResponse unmarshall(QueryJobListResponse queryJobListResponse, UnmarshallerContext context) {
		
		queryJobListResponse.setRequestId(context.stringValue("QueryJobListResponse.RequestId"));

		List<String> nonExistJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryJobListResponse.NonExistJobIds.Length"); i++) {
			nonExistJobIds.add(context.stringValue("QueryJobListResponse.NonExistJobIds["+ i +"]"));
		}
		queryJobListResponse.setNonExistJobIds(nonExistJobIds);

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("QueryJobListResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setJobId(context.stringValue("QueryJobListResponse.JobList["+ i +"].JobId"));
			job.setState(context.stringValue("QueryJobListResponse.JobList["+ i +"].State"));
			job.setCode(context.stringValue("QueryJobListResponse.JobList["+ i +"].Code"));
			job.setMessage(context.stringValue("QueryJobListResponse.JobList["+ i +"].Message"));
			job.setPercent(context.longValue("QueryJobListResponse.JobList["+ i +"].Percent"));
			job.setPipelineId(context.stringValue("QueryJobListResponse.JobList["+ i +"].PipelineId"));
			job.setCreationTime(context.stringValue("QueryJobListResponse.JobList["+ i +"].CreationTime"));
			job.setFinishTime(context.stringValue("QueryJobListResponse.JobList["+ i +"].FinishTime"));

			Input input = new Input();
			input.setBucket(context.stringValue("QueryJobListResponse.JobList["+ i +"].Input.Bucket"));
			input.setLocation(context.stringValue("QueryJobListResponse.JobList["+ i +"].Input.Location"));
			input.setObject(context.stringValue("QueryJobListResponse.JobList["+ i +"].Input.Object"));
			job.setInput(input);

			Output output = new Output();
			output.setTemplateId(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.TemplateId"));
			output.setUserData(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.UserData"));
			output.setRotate(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Rotate"));
			output.setVideoStreamMap(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.VideoStreamMap"));
			output.setAudioStreamMap(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.AudioStreamMap"));
			output.setDeWatermark(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.DeWatermark"));
			output.setPriority(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Priority"));
			output.setWaterMarkConfigUrl(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.WaterMarkConfigUrl"));
			output.setMergeConfigUrl(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.MergeConfigUrl"));

			OutputFile outputFile = new OutputFile();
			outputFile.setBucket(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.OutputFile.Bucket"));
			outputFile.setLocation(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.OutputFile.Location"));
			outputFile.setObject(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.OutputFile.Object"));
			outputFile.setRoleArn(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.OutputFile.RoleArn"));
			output.setOutputFile(outputFile);

			M3U8NonStandardSupport m3U8NonStandardSupport = new M3U8NonStandardSupport();

			TS tS = new TS();
			tS.setMd5Support(context.booleanValue("QueryJobListResponse.JobList["+ i +"].Output.M3U8NonStandardSupport.TS.Md5Support"));
			tS.setSizeSupport(context.booleanValue("QueryJobListResponse.JobList["+ i +"].Output.M3U8NonStandardSupport.TS.SizeSupport"));
			m3U8NonStandardSupport.setTS(tS);
			output.setM3U8NonStandardSupport(m3U8NonStandardSupport);

			Properties properties = new Properties();
			properties.setWidth(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Width"));
			properties.setHeight(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Height"));
			properties.setBitrate(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Bitrate"));
			properties.setDuration(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Duration"));
			properties.setFps(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Fps"));
			properties.setFileSize(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.FileSize"));
			properties.setFileFormat(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.FileFormat"));

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < context.lengthValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setIndex(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setCodecName(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setCodecLongName(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setProfile(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setCodecTimeBase(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setCodecTagString(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setCodecTag(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setWidth(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setHeight(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setHasBFrames(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setSar(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setDar(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setPixFmt(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLevel(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Level"));
				videoStream.setFps(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setAvgFPS(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setTimebase(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setStartTime(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDuration(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setBitrate(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setNumFrames(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setLang(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].Lang"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setCostBandwidth(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				networkCost.setAvgBitrate(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < context.lengthValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setIndex(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setCodecName(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setCodecTimeBase(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].CodecTimeBase"));
				audioStream.setCodecLongName(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setCodecTagString(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setCodecTag(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setSampleFmt(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setSamplerate(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setChannels(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setChannelLayout(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setTimebase(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setStartTime(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setDuration(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setBitrate(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setNumFrames(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setLang(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.AudioStreamList["+ j +"].Lang"));

				audioStreamList.add(audioStream);
			}
			streams.setAudioStreamList(audioStreamList);

			List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
			for (int j = 0; j < context.lengthValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.SubtitleStreamList.Length"); j++) {
				SubtitleStream subtitleStream = new SubtitleStream();
				subtitleStream.setIndex(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.SubtitleStreamList["+ j +"].Index"));
				subtitleStream.setLang(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Streams.SubtitleStreamList["+ j +"].Lang"));

				subtitleStreamList.add(subtitleStream);
			}
			streams.setSubtitleStreamList(subtitleStreamList);
			properties.setStreams(streams);

			Format format = new Format();
			format.setNumStreams(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Format.NumStreams"));
			format.setNumPrograms(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Format.NumPrograms"));
			format.setFormatName(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Format.FormatName"));
			format.setFormatLongName(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Format.FormatLongName"));
			format.setStartTime(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Format.StartTime"));
			format.setDuration(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Format.Duration"));
			format.setSize(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Format.Size"));
			format.setBitrate(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.Format.Bitrate"));
			properties.setFormat(format);

			List<SourceLogo> sourceLogos = new ArrayList<SourceLogo>();
			for (int j = 0; j < context.lengthValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.SourceLogos.Length"); j++) {
				SourceLogo sourceLogo = new SourceLogo();
				sourceLogo.setSource(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Properties.SourceLogos["+ j +"].Source"));

				sourceLogos.add(sourceLogo);
			}
			properties.setSourceLogos(sourceLogos);
			output.setProperties(properties);

			Clip clip = new Clip();

			TimeSpan timeSpan = new TimeSpan();
			timeSpan.setSeek(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Clip.TimeSpan.Seek"));
			timeSpan.setDuration(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Clip.TimeSpan.Duration"));
			clip.setTimeSpan(timeSpan);
			output.setClip(clip);

			SuperReso superReso = new SuperReso();
			superReso.setIsHalfSample(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.SuperReso.IsHalfSample"));
			output.setSuperReso(superReso);

			SubtitleConfig subtitleConfig = new SubtitleConfig();

			List<Subtitle> subtitleList = new ArrayList<Subtitle>();
			for (int j = 0; j < context.lengthValue("QueryJobListResponse.JobList["+ i +"].Output.SubtitleConfig.SubtitleList.Length"); j++) {
				Subtitle subtitle = new Subtitle();
				subtitle.setMap(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.SubtitleConfig.SubtitleList["+ j +"].Map"));

				subtitleList.add(subtitle);
			}
			subtitleConfig.setSubtitleList(subtitleList);

			List<ExtSubtitle> extSubtitleList = new ArrayList<ExtSubtitle>();
			for (int j = 0; j < context.lengthValue("QueryJobListResponse.JobList["+ i +"].Output.SubtitleConfig.ExtSubtitleList.Length"); j++) {
				ExtSubtitle extSubtitle = new ExtSubtitle();
				extSubtitle.setFontName(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.SubtitleConfig.ExtSubtitleList["+ j +"].FontName"));
				extSubtitle.setCharEnc(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.SubtitleConfig.ExtSubtitleList["+ j +"].CharEnc"));

				Input1 input1 = new Input1();
				input1.setBucket(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Bucket"));
				input1.setLocation(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Location"));
				input1.setObject(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Object"));
				extSubtitle.setInput1(input1);

				extSubtitleList.add(extSubtitle);
			}
			subtitleConfig.setExtSubtitleList(extSubtitleList);
			output.setSubtitleConfig(subtitleConfig);

			TransConfig transConfig = new TransConfig();
			transConfig.setTransMode(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.TransConfig.TransMode"));
			transConfig.setIsCheckReso(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.TransConfig.IsCheckReso"));
			transConfig.setIsCheckResoFail(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.TransConfig.IsCheckResoFail"));
			transConfig.setIsCheckVideoBitrate(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.TransConfig.IsCheckVideoBitrate"));
			transConfig.setIsCheckAudioBitrate(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.TransConfig.IsCheckAudioBitrate"));
			transConfig.setAdjDarMethod(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.TransConfig.AdjDarMethod"));
			transConfig.setIsCheckVideoBitrateFail(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.TransConfig.IsCheckVideoBitrateFail"));
			transConfig.setIsCheckAudioBitrateFail(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.TransConfig.IsCheckAudioBitrateFail"));
			output.setTransConfig(transConfig);

			MuxConfig muxConfig = new MuxConfig();

			Segment segment = new Segment();
			segment.setDuration(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);

			Gif gif = new Gif();
			gif.setLoop(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.MuxConfig.Gif.Loop"));
			gif.setFinalDelay(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.MuxConfig.Gif.FinalDelay"));
			gif.setIsCustomPalette(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.MuxConfig.Gif.IsCustomPalette"));
			gif.setDitherMode(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.MuxConfig.Gif.DitherMode"));
			muxConfig.setGif(gif);

			Webp webp = new Webp();
			webp.setLoop(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.MuxConfig.Webp.Loop"));
			muxConfig.setWebp(webp);
			output.setMuxConfig(muxConfig);

			Audio audio = new Audio();
			audio.setCodec(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Audio.Codec"));
			audio.setProfile(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Audio.Profile"));
			audio.setSamplerate(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Audio.Samplerate"));
			audio.setBitrate(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Audio.Bitrate"));
			audio.setChannels(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Audio.Channels"));
			audio.setQscale(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Audio.Qscale"));

			Volume volume = new Volume();
			volume.setLevel(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Audio.Volume.Level"));
			volume.setMethod(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Audio.Volume.Method"));
			audio.setVolume(volume);
			output.setAudio(audio);

			Video video = new Video();
			video.setCodec(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.Codec"));
			video.setProfile(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.Profile"));
			video.setBitrate(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.Bitrate"));
			video.setCrf(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.Crf"));
			video.setWidth(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.Width"));
			video.setHeight(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.Height"));
			video.setFps(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.Fps"));
			video.setGop(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.Gop"));
			video.setPreset(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.Preset"));
			video.setScanMode(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.ScanMode"));
			video.setBufsize(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.Bufsize"));
			video.setMaxrate(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.Maxrate"));
			video.setPixFmt(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.PixFmt"));
			video.setDegrain(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.Degrain"));
			video.setQscale(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.Qscale"));
			video.setCrop(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.Crop"));
			video.setPad(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.Pad"));
			video.setMaxFps(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.MaxFps"));
			video.setResoPriority(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.ResoPriority"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.BitrateBnd.Max"));
			bitrateBnd.setMin(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			output.setVideo(video);

			Container container = new Container();
			container.setFormat(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Container.Format"));
			output.setContainer(container);

			Encryption encryption = new Encryption();
			encryption.setType(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Encryption.Type"));
			encryption.setId(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Encryption.Id"));
			encryption.setKey(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Encryption.Key"));
			encryption.setKeyUri(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Encryption.KeyUri"));
			encryption.setKeyType(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Encryption.KeyType"));
			encryption.setSkipCnt(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.Encryption.SkipCnt"));
			output.setEncryption(encryption);

			List<WaterMark> waterMarkList = new ArrayList<WaterMark>();
			for (int j = 0; j < context.lengthValue("QueryJobListResponse.JobList["+ i +"].Output.WaterMarkList.Length"); j++) {
				WaterMark waterMark = new WaterMark();
				waterMark.setWaterMarkTemplateId(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].WaterMarkTemplateId"));
				waterMark.setWidth(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].Width"));
				waterMark.setHeight(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].Height"));
				waterMark.setDx(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].Dx"));
				waterMark.setDy(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].Dy"));
				waterMark.setReferPos(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].ReferPos"));
				waterMark.setType(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].Type"));

				InputFile inputFile = new InputFile();
				inputFile.setBucket(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].InputFile.Bucket"));
				inputFile.setLocation(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].InputFile.Location"));
				inputFile.setObject(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.WaterMarkList["+ j +"].InputFile.Object"));
				waterMark.setInputFile(inputFile);

				waterMarkList.add(waterMark);
			}
			output.setWaterMarkList(waterMarkList);

			List<Merge> mergeList = new ArrayList<Merge>();
			for (int j = 0; j < context.lengthValue("QueryJobListResponse.JobList["+ i +"].Output.MergeList.Length"); j++) {
				Merge merge = new Merge();
				merge.setMergeURL(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.MergeList["+ j +"].MergeURL"));
				merge.setStart(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.MergeList["+ j +"].Start"));
				merge.setDuration(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.MergeList["+ j +"].Duration"));
				merge.setRoleArn(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.MergeList["+ j +"].RoleArn"));

				mergeList.add(merge);
			}
			output.setMergeList(mergeList);

			List<Opening> openingList = new ArrayList<Opening>();
			for (int j = 0; j < context.lengthValue("QueryJobListResponse.JobList["+ i +"].Output.OpeningList.Length"); j++) {
				Opening opening = new Opening();
				opening.setOpenUrl(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.OpeningList["+ j +"].openUrl"));
				opening.setStart(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.OpeningList["+ j +"].Start"));
				opening.setWidth(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.OpeningList["+ j +"].Width"));
				opening.setHeight(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.OpeningList["+ j +"].Height"));

				openingList.add(opening);
			}
			output.setOpeningList(openingList);

			List<TailSlate> tailSlateList = new ArrayList<TailSlate>();
			for (int j = 0; j < context.lengthValue("QueryJobListResponse.JobList["+ i +"].Output.TailSlateList.Length"); j++) {
				TailSlate tailSlate = new TailSlate();
				tailSlate.setTailUrl(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.TailSlateList["+ j +"].TailUrl"));
				tailSlate.setStart(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.TailSlateList["+ j +"].Start"));
				tailSlate.setBlendDuration(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.TailSlateList["+ j +"].BlendDuration"));
				tailSlate.setWidth(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.TailSlateList["+ j +"].Width"));
				tailSlate.setHeight(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.TailSlateList["+ j +"].Height"));
				tailSlate.setIsMergeAudio(context.booleanValue("QueryJobListResponse.JobList["+ i +"].Output.TailSlateList["+ j +"].IsMergeAudio"));
				tailSlate.setBgColor(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.TailSlateList["+ j +"].BgColor"));

				tailSlateList.add(tailSlate);
			}
			output.setTailSlateList(tailSlateList);

			List<OutSubtitle> outSubtitleList = new ArrayList<OutSubtitle>();
			for (int j = 0; j < context.lengthValue("QueryJobListResponse.JobList["+ i +"].Output.OutSubtitleList.Length"); j++) {
				OutSubtitle outSubtitle = new OutSubtitle();
				outSubtitle.setMap(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.OutSubtitleList["+ j +"].Map"));
				outSubtitle.setSuccess(context.booleanValue("QueryJobListResponse.JobList["+ i +"].Output.OutSubtitleList["+ j +"].Success"));
				outSubtitle.setMessage(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.OutSubtitleList["+ j +"].Message"));

				OutSubtitleFile outSubtitleFile = new OutSubtitleFile();
				outSubtitleFile.setBucket(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.OutSubtitleList["+ j +"].OutSubtitleFile.Bucket"));
				outSubtitleFile.setLocation(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.OutSubtitleList["+ j +"].OutSubtitleFile.Location"));
				outSubtitleFile.setObject(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.OutSubtitleList["+ j +"].OutSubtitleFile.Object"));
				outSubtitleFile.setRoleArn(context.stringValue("QueryJobListResponse.JobList["+ i +"].Output.OutSubtitleList["+ j +"].OutSubtitleFile.RoleArn"));
				outSubtitle.setOutSubtitleFile(outSubtitleFile);

				outSubtitleList.add(outSubtitle);
			}
			output.setOutSubtitleList(outSubtitleList);
			job.setOutput(output);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(context.stringValue("QueryJobListResponse.JobList["+ i +"].MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(context.stringValue("QueryJobListResponse.JobList["+ i +"].MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(context.stringValue("QueryJobListResponse.JobList["+ i +"].MNSMessageResult.ErrorCode"));
			job.setMNSMessageResult(mNSMessageResult);

			jobList.add(job);
		}
		queryJobListResponse.setJobList(jobList);
	 
	 	return queryJobListResponse;
	}
}