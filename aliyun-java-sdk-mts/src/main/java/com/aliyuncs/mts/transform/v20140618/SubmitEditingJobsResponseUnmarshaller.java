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

import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Audio;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Audio.Volume;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Clip;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Clip.TimeSpan;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Container;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.DigiWaterMark;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.DigiWaterMark.InputFile2;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Editing;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Editing.Clip3;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Editing.Clip3.Effect;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Editing.Timeline;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Editing.Timeline.TimelineConfig;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigAudio;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Editing.Timeline.Track;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Editing.Timeline.Track.Clip4;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Editing.Timeline.Track.Clip4.ClipsConfig;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Editing.Timeline.Track.Clip4.ClipsConfig.ClipsConfigVideo;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Encryption;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.M3U8NonStandardSupport;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.M3U8NonStandardSupport.TS;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Merge;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.MuxConfig;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.OutputFile;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Properties;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Properties.Format;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Properties.Streams;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Properties.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Properties.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Properties.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Properties.Streams.VideoStream.NetworkCost;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.SubtitleConfig;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.SubtitleConfig.ExtSubtitle;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.SubtitleConfig.ExtSubtitle.Input;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.SubtitleConfig.Subtitle;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.SuperReso;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.TransConfig;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Video;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.Video.BitrateBnd;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.WaterMark;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingConfig.WaterMark.InputFile1;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingInput;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingInput.InputConfig;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.EditingInput.InputFile;
import com.aliyuncs.mts.model.v20140618.SubmitEditingJobsResponse.JobResult.Job.MNSMessageResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitEditingJobsResponseUnmarshaller {

	public static SubmitEditingJobsResponse unmarshall(SubmitEditingJobsResponse submitEditingJobsResponse, UnmarshallerContext context) {
		
		submitEditingJobsResponse.setRequestId(context.stringValue("SubmitEditingJobsResponse.RequestId"));

		List<JobResult> jobResultList = new ArrayList<JobResult>();
		for (int i = 0; i < context.lengthValue("SubmitEditingJobsResponse.JobResultList.Length"); i++) {
			JobResult jobResult = new JobResult();
			jobResult.setSuccess(context.booleanValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Success"));
			jobResult.setCode(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Code"));
			jobResult.setMessage(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Message"));

			Job job = new Job();
			job.setJobId(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.JobId"));
			job.setState(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.State"));
			job.setCode(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.Code"));
			job.setMessage(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.Message"));
			job.setPercent(context.longValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.Percent"));
			job.setPipelineId(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.PipelineId"));
			job.setCreationTime(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.CreationTime"));
			job.setFinishTime(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.FinishTime"));

			EditingConfig editingConfig = new EditingConfig();
			editingConfig.setTemplateId(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.TemplateId"));
			editingConfig.setUserData(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.UserData"));
			editingConfig.setRotate(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Rotate"));
			editingConfig.setVideoStreamMap(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.VideoStreamMap"));
			editingConfig.setAudioStreamMap(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.AudioStreamMap"));
			editingConfig.setDeWatermark(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.DeWatermark"));
			editingConfig.setPriority(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Priority"));
			editingConfig.setWaterMarkConfigUrl(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.WaterMarkConfigUrl"));
			editingConfig.setMergeConfigUrl(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.MergeConfigUrl"));

			DigiWaterMark digiWaterMark = new DigiWaterMark();
			digiWaterMark.setType(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.DigiWaterMark.Type"));
			digiWaterMark.setAlpha(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.DigiWaterMark.Alpha"));

			InputFile2 inputFile2 = new InputFile2();
			inputFile2.setBucket(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.DigiWaterMark.InputFile.Bucket"));
			inputFile2.setLocation(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.DigiWaterMark.InputFile.Location"));
			inputFile2.setObject(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.DigiWaterMark.InputFile.Object"));
			digiWaterMark.setInputFile2(inputFile2);
			editingConfig.setDigiWaterMark(digiWaterMark);

			OutputFile outputFile = new OutputFile();
			outputFile.setBucket(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.OutputFile.Bucket"));
			outputFile.setLocation(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.OutputFile.Location"));
			outputFile.setObject(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.OutputFile.Object"));
			outputFile.setRoleArn(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.OutputFile.RoleArn"));
			editingConfig.setOutputFile(outputFile);

			M3U8NonStandardSupport m3U8NonStandardSupport = new M3U8NonStandardSupport();

			TS tS = new TS();
			tS.setMd5Support(context.booleanValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.M3U8NonStandardSupport.TS.Md5Support"));
			tS.setSizeSupport(context.booleanValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.M3U8NonStandardSupport.TS.SizeSupport"));
			m3U8NonStandardSupport.setTS(tS);
			editingConfig.setM3U8NonStandardSupport(m3U8NonStandardSupport);

			Properties properties = new Properties();
			properties.setWidth(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Width"));
			properties.setHeight(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Height"));
			properties.setBitrate(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Bitrate"));
			properties.setDuration(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Duration"));
			properties.setFps(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Fps"));
			properties.setFileSize(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.FileSize"));
			properties.setFileFormat(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.FileFormat"));

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < context.lengthValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setIndex(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setCodecName(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setCodecLongName(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setProfile(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setCodecTimeBase(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setCodecTagString(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setCodecTag(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setWidth(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setHeight(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setHasBFrames(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setSar(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setDar(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setPixFmt(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setLevel(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Level"));
				videoStream.setFps(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setAvgFPS(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setTimebase(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setStartTime(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDuration(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setBitrate(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setNumFrames(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setLang(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Lang"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setCostBandwidth(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				networkCost.setAvgBitrate(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < context.lengthValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setIndex(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setCodecName(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setCodecTimeBase(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList["+ j +"].CodecTimeBase"));
				audioStream.setCodecLongName(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setCodecTagString(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setCodecTag(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setSampleFmt(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setSamplerate(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setChannels(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setChannelLayout(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setTimebase(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setStartTime(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setDuration(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setBitrate(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setNumFrames(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setLang(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Lang"));

				audioStreamList.add(audioStream);
			}
			streams.setAudioStreamList(audioStreamList);

			List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
			for (int j = 0; j < context.lengthValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.SubtitleStreamList.Length"); j++) {
				SubtitleStream subtitleStream = new SubtitleStream();
				subtitleStream.setIndex(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.SubtitleStreamList["+ j +"].Index"));
				subtitleStream.setLang(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Streams.SubtitleStreamList["+ j +"].Lang"));

				subtitleStreamList.add(subtitleStream);
			}
			streams.setSubtitleStreamList(subtitleStreamList);
			properties.setStreams(streams);

			Format format = new Format();
			format.setNumStreams(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Format.NumStreams"));
			format.setNumPrograms(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Format.NumPrograms"));
			format.setFormatName(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Format.FormatName"));
			format.setFormatLongName(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Format.FormatLongName"));
			format.setStartTime(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Format.StartTime"));
			format.setDuration(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Format.Duration"));
			format.setSize(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Format.Size"));
			format.setBitrate(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Properties.Format.Bitrate"));
			properties.setFormat(format);
			editingConfig.setProperties(properties);

			Clip clip = new Clip();

			TimeSpan timeSpan = new TimeSpan();
			timeSpan.setSeek(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Clip.TimeSpan.Seek"));
			timeSpan.setDuration(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Clip.TimeSpan.Duration"));
			clip.setTimeSpan(timeSpan);
			editingConfig.setClip(clip);

			SuperReso superReso = new SuperReso();
			superReso.setIsHalfSample(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.SuperReso.IsHalfSample"));
			editingConfig.setSuperReso(superReso);

			SubtitleConfig subtitleConfig = new SubtitleConfig();

			List<Subtitle> subtitleList = new ArrayList<Subtitle>();
			for (int j = 0; j < context.lengthValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.SubtitleConfig.SubtitleList.Length"); j++) {
				Subtitle subtitle = new Subtitle();
				subtitle.setMap(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.SubtitleConfig.SubtitleList["+ j +"].Map"));

				subtitleList.add(subtitle);
			}
			subtitleConfig.setSubtitleList(subtitleList);

			List<ExtSubtitle> extSubtitleList = new ArrayList<ExtSubtitle>();
			for (int j = 0; j < context.lengthValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.SubtitleConfig.ExtSubtitleList.Length"); j++) {
				ExtSubtitle extSubtitle = new ExtSubtitle();
				extSubtitle.setFontName(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.SubtitleConfig.ExtSubtitleList["+ j +"].FontName"));
				extSubtitle.setCharEnc(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.SubtitleConfig.ExtSubtitleList["+ j +"].CharEnc"));

				Input input = new Input();
				input.setBucket(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Bucket"));
				input.setLocation(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Location"));
				input.setObject(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Object"));
				extSubtitle.setInput(input);

				extSubtitleList.add(extSubtitle);
			}
			subtitleConfig.setExtSubtitleList(extSubtitleList);
			editingConfig.setSubtitleConfig(subtitleConfig);

			TransConfig transConfig = new TransConfig();
			transConfig.setTransMode(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.TransConfig.TransMode"));
			transConfig.setIsCheckReso(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.TransConfig.IsCheckReso"));
			transConfig.setIsCheckResoFail(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.TransConfig.IsCheckResoFail"));
			transConfig.setIsCheckVideoBitrate(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.TransConfig.IsCheckVideoBitrate"));
			transConfig.setIsCheckAudioBitrate(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.TransConfig.IsCheckAudioBitrate"));
			transConfig.setAdjDarMethod(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.TransConfig.AdjDarMethod"));
			transConfig.setIsCheckVideoBitrateFail(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.TransConfig.IsCheckVideoBitrateFail"));
			transConfig.setIsCheckAudioBitrateFail(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.TransConfig.IsCheckAudioBitrateFail"));
			transConfig.setDuration(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.TransConfig.Duration"));
			editingConfig.setTransConfig(transConfig);

			MuxConfig muxConfig = new MuxConfig();

			Segment segment = new Segment();
			segment.setDuration(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);

			Gif gif = new Gif();
			gif.setLoop(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.MuxConfig.Gif.Loop"));
			gif.setFinalDelay(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.MuxConfig.Gif.FinalDelay"));
			gif.setIsCustomPalette(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.MuxConfig.Gif.IsCustomPalette"));
			gif.setDitherMode(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.MuxConfig.Gif.DitherMode"));
			muxConfig.setGif(gif);
			editingConfig.setMuxConfig(muxConfig);

			Audio audio = new Audio();
			audio.setCodec(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Audio.Codec"));
			audio.setProfile(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Audio.Profile"));
			audio.setSamplerate(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Audio.Samplerate"));
			audio.setBitrate(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Audio.Bitrate"));
			audio.setChannels(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Audio.Channels"));
			audio.setQscale(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Audio.Qscale"));

			Volume volume = new Volume();
			volume.setLevel(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Audio.Volume.Level"));
			volume.setMethod(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Audio.Volume.Method"));
			audio.setVolume(volume);
			editingConfig.setAudio(audio);

			Video video = new Video();
			video.setCodec(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.Codec"));
			video.setProfile(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.Profile"));
			video.setBitrate(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.Bitrate"));
			video.setCrf(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.Crf"));
			video.setWidth(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.Width"));
			video.setHeight(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.Height"));
			video.setFps(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.Fps"));
			video.setGop(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.Gop"));
			video.setPreset(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.Preset"));
			video.setScanMode(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.ScanMode"));
			video.setBufsize(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.Bufsize"));
			video.setMaxrate(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.Maxrate"));
			video.setPixFmt(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.PixFmt"));
			video.setDegrain(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.Degrain"));
			video.setQscale(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.Qscale"));
			video.setCrop(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.Crop"));
			video.setPad(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.Pad"));
			video.setMaxFps(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.MaxFps"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.BitrateBnd.Max"));
			bitrateBnd.setMin(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			editingConfig.setVideo(video);

			Container container = new Container();
			container.setFormat(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Container.Format"));
			editingConfig.setContainer(container);

			Encryption encryption = new Encryption();
			encryption.setType(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Encryption.Type"));
			encryption.setId(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Encryption.Id"));
			encryption.setKey(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Encryption.Key"));
			encryption.setKeyUri(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Encryption.KeyUri"));
			encryption.setKeyType(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Encryption.KeyType"));
			encryption.setSkipCnt(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Encryption.SkipCnt"));
			editingConfig.setEncryption(encryption);

			Editing editing = new Editing();

			Timeline timeline = new Timeline();

			TimelineConfig timelineConfig = new TimelineConfig();

			TimelineConfigVideo timelineConfigVideo = new TimelineConfigVideo();
			timelineConfigVideo.setWidth(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.Width"));
			timelineConfigVideo.setHeight(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.Height"));
			timelineConfigVideo.setBgColor(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.BgColor"));
			timelineConfigVideo.setFps(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.Fps"));
			timelineConfigVideo.setRenderRatio(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.RenderRatio"));
			timelineConfigVideo.setReclosePrec(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.ReclosePrec"));
			timelineConfigVideo.setIsGpuData(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.IsGpuData"));
			timelineConfigVideo.setIsOneTrackData(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.IsOneTrackData"));
			timelineConfig.setTimelineConfigVideo(timelineConfigVideo);

			TimelineConfigAudio timelineConfigAudio = new TimelineConfigAudio();
			timelineConfigAudio.setSamplerate(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigAudio.Samplerate"));
			timelineConfigAudio.setChannelLayout(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigAudio.ChannelLayout"));
			timelineConfigAudio.setChannels(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigAudio.Channels"));
			timelineConfig.setTimelineConfigAudio(timelineConfigAudio);
			timeline.setTimelineConfig(timelineConfig);

			List<Track> trackList = new ArrayList<Track>();
			for (int j = 0; j < context.lengthValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TrackList.Length"); j++) {
				Track track = new Track();
				track.setId(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TrackList["+ j +"].Id"));
				track.setType(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TrackList["+ j +"].Type"));
				track.setOrder(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TrackList["+ j +"].Order"));

				List<Clip4> clips = new ArrayList<Clip4>();
				for (int k = 0; k < context.lengthValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips.Length"); k++) {
					Clip4 clip4 = new Clip4();
					clip4.setClipID(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].clipID"));
					clip4.setIn(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].In"));
					clip4.setOut(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].Out"));

					ClipsConfig clipsConfig = new ClipsConfig();

					ClipsConfigVideo clipsConfigVideo = new ClipsConfigVideo();
					clipsConfigVideo.setL(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].ClipsConfig.ClipsConfigVideo.L"));
					clipsConfigVideo.setT(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].ClipsConfig.ClipsConfigVideo.T"));
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
			for (int j = 0; j < context.lengthValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.ClipList.Length"); j++) {
				Clip3 clip3 = new Clip3();
				clip3.setId(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.ClipList["+ j +"].Id"));
				clip3.setType(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.ClipList["+ j +"].Type"));
				clip3.setSourceType(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.ClipList["+ j +"].SourceType"));
				clip3.setSourceID(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.ClipList["+ j +"].SourceID"));
				clip3.setSourceStrmMap(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.ClipList["+ j +"].SourceStrmMap"));
				clip3.setIn(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.ClipList["+ j +"].In"));
				clip3.setOut(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.ClipList["+ j +"].Out"));

				List<Effect> effects = new ArrayList<Effect>();
				for (int k = 0; k < context.lengthValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.ClipList["+ j +"].Effects.Length"); k++) {
					Effect effect = new Effect();
					effect.setEffect(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.ClipList["+ j +"].Effects["+ k +"].Effect"));
					effect.setEffectConfig(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.Editing.ClipList["+ j +"].Effects["+ k +"].EffectConfig"));

					effects.add(effect);
				}
				clip3.setEffects(effects);

				clipList.add(clip3);
			}
			editing.setClipList(clipList);
			editingConfig.setEditing(editing);

			List<WaterMark> waterMarkList = new ArrayList<WaterMark>();
			for (int j = 0; j < context.lengthValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.WaterMarkList.Length"); j++) {
				WaterMark waterMark = new WaterMark();
				waterMark.setWaterMarkTemplateId(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.WaterMarkList["+ j +"].WaterMarkTemplateId"));
				waterMark.setWidth(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.WaterMarkList["+ j +"].Width"));
				waterMark.setHeight(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.WaterMarkList["+ j +"].Height"));
				waterMark.setDx(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.WaterMarkList["+ j +"].Dx"));
				waterMark.setDy(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.WaterMarkList["+ j +"].Dy"));
				waterMark.setReferPos(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.WaterMarkList["+ j +"].ReferPos"));
				waterMark.setType(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.WaterMarkList["+ j +"].Type"));

				InputFile1 inputFile1 = new InputFile1();
				inputFile1.setBucket(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.WaterMarkList["+ j +"].InputFile.Bucket"));
				inputFile1.setLocation(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.WaterMarkList["+ j +"].InputFile.Location"));
				inputFile1.setObject(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.WaterMarkList["+ j +"].InputFile.Object"));
				waterMark.setInputFile1(inputFile1);

				waterMarkList.add(waterMark);
			}
			editingConfig.setWaterMarkList(waterMarkList);

			List<Merge> mergeList = new ArrayList<Merge>();
			for (int j = 0; j < context.lengthValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.MergeList.Length"); j++) {
				Merge merge = new Merge();
				merge.setMergeURL(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.MergeList["+ j +"].MergeURL"));
				merge.setStart(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.MergeList["+ j +"].Start"));
				merge.setDuration(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.MergeList["+ j +"].Duration"));
				merge.setRoleArn(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingConfig.MergeList["+ j +"].RoleArn"));

				mergeList.add(merge);
			}
			editingConfig.setMergeList(mergeList);
			job.setEditingConfig(editingConfig);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.MNSMessageResult.ErrorCode"));
			job.setMNSMessageResult(mNSMessageResult);

			List<EditingInput> editingInputs = new ArrayList<EditingInput>();
			for (int j = 0; j < context.lengthValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingInputs.Length"); j++) {
				EditingInput editingInput = new EditingInput();
				editingInput.setId(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingInputs["+ j +"].Id"));

				InputFile inputFile = new InputFile();
				inputFile.setBucket(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingInputs["+ j +"].InputFile.Bucket"));
				inputFile.setLocation(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingInputs["+ j +"].InputFile.Location"));
				inputFile.setObject(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingInputs["+ j +"].InputFile.Object"));
				editingInput.setInputFile(inputFile);

				InputConfig inputConfig = new InputConfig();
				inputConfig.setDeinterlaceMethod(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingInputs["+ j +"].InputConfig.DeinterlaceMethod"));
				inputConfig.setIsNormalSar(context.stringValue("SubmitEditingJobsResponse.JobResultList["+ i +"].Job.EditingInputs["+ j +"].InputConfig.IsNormalSar"));
				editingInput.setInputConfig(inputConfig);

				editingInputs.add(editingInput);
			}
			job.setEditingInputs(editingInputs);
			jobResult.setJob(job);

			jobResultList.add(jobResult);
		}
		submitEditingJobsResponse.setJobResultList(jobResultList);
	 
	 	return submitEditingJobsResponse;
	}
}