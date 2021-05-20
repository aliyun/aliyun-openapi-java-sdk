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
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Clip4;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Clip4.TimeSpan;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Container;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.DigiWaterMark;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.DigiWaterMark.InputFile2;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Clip;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Clip.Effect;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Timeline;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Timeline.TimelineConfig;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigAudio;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Timeline.Track;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Timeline.Track.Clip3;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Timeline.Track.Clip3.ClipsConfig;
import com.aliyuncs.mts.model.v20140618.QueryEditingJobListResponse.Job.EditingConfig.Editing.Timeline.Track.Clip3.ClipsConfig.ClipsConfigVideo;
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
			job.setCreationTime(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].CreationTime"));
			job.setPercent(_ctx.longValue("QueryEditingJobListResponse.JobList["+ i +"].Percent"));
			job.setFinishTime(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].FinishTime"));
			job.setState(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].State"));
			job.setJobId(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].JobId"));
			job.setCode(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].Code"));
			job.setMessage(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].Message"));
			job.setPipelineId(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].PipelineId"));

			EditingConfig editingConfig = new EditingConfig();
			editingConfig.setDeWatermark(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.DeWatermark"));
			editingConfig.setWaterMarkConfigUrl(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkConfigUrl"));
			editingConfig.setPriority(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Priority"));
			editingConfig.setAudioStreamMap(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.AudioStreamMap"));
			editingConfig.setUserData(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.UserData"));
			editingConfig.setVideoStreamMap(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.VideoStreamMap"));
			editingConfig.setRotate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Rotate"));
			editingConfig.setMergeConfigUrl(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MergeConfigUrl"));
			editingConfig.setTemplateId(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TemplateId"));

			Video video = new Video();
			video.setBufsize(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Bufsize"));
			video.setDegrain(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Degrain"));
			video.setPixFmt(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.PixFmt"));
			video.setPad(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Pad"));
			video.setCodec(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Codec"));
			video.setHeight(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Height"));
			video.setQscale(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Qscale"));
			video.setCrop(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Crop"));
			video.setBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Bitrate"));
			video.setMaxrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Maxrate"));
			video.setMaxFps(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.MaxFps"));
			video.setProfile(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Profile"));
			video.setCrf(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Crf"));
			video.setGop(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Gop"));
			video.setWidth(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Width"));
			video.setFps(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Fps"));
			video.setPreset(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.Preset"));
			video.setScanMode(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.ScanMode"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.BitrateBnd.Max"));
			bitrateBnd.setMin(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			editingConfig.setVideo(video);

			TransConfig transConfig = new TransConfig();
			transConfig.setIsCheckAudioBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.IsCheckAudioBitrate"));
			transConfig.setIsCheckReso(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.IsCheckReso"));
			transConfig.setTransMode(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.TransMode"));
			transConfig.setIsCheckVideoBitrateFail(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.IsCheckVideoBitrateFail"));
			transConfig.setAdjDarMethod(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.AdjDarMethod"));
			transConfig.setDuration(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.Duration"));
			transConfig.setIsCheckVideoBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.IsCheckVideoBitrate"));
			transConfig.setIsCheckResoFail(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.IsCheckResoFail"));
			transConfig.setIsCheckAudioBitrateFail(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.TransConfig.IsCheckAudioBitrateFail"));
			editingConfig.setTransConfig(transConfig);

			Encryption encryption = new Encryption();
			encryption.setType(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Encryption.Type"));
			encryption.setKey(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Encryption.Key"));
			encryption.setKeyType(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Encryption.KeyType"));
			encryption.setId(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Encryption.Id"));
			encryption.setKeyUri(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Encryption.KeyUri"));
			encryption.setSkipCnt(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Encryption.SkipCnt"));
			editingConfig.setEncryption(encryption);

			M3U8NonStandardSupport m3U8NonStandardSupport = new M3U8NonStandardSupport();

			TS tS = new TS();
			tS.setSizeSupport(_ctx.booleanValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.M3U8NonStandardSupport.TS.SizeSupport"));
			tS.setMd5Support(_ctx.booleanValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.M3U8NonStandardSupport.TS.Md5Support"));
			m3U8NonStandardSupport.setTS(tS);
			editingConfig.setM3U8NonStandardSupport(m3U8NonStandardSupport);

			Audio audio = new Audio();
			audio.setProfile(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Audio.Profile"));
			audio.setCodec(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Audio.Codec"));
			audio.setSamplerate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Audio.Samplerate"));
			audio.setQscale(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Audio.Qscale"));
			audio.setChannels(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Audio.Channels"));
			audio.setBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Audio.Bitrate"));

			Volume volume = new Volume();
			volume.setBizMethod(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Audio.Volume.Method"));
			volume.setLevel(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Audio.Volume.Level"));
			audio.setVolume(volume);
			editingConfig.setAudio(audio);

			SuperReso superReso = new SuperReso();
			superReso.setIsHalfSample(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SuperReso.IsHalfSample"));
			editingConfig.setSuperReso(superReso);

			DigiWaterMark digiWaterMark = new DigiWaterMark();
			digiWaterMark.setType(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.DigiWaterMark.Type"));
			digiWaterMark.setAlpha(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.DigiWaterMark.Alpha"));

			InputFile2 inputFile2 = new InputFile2();
			inputFile2.setObject(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.DigiWaterMark.InputFile.Object"));
			inputFile2.setLocation(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.DigiWaterMark.InputFile.Location"));
			inputFile2.setBucket(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.DigiWaterMark.InputFile.Bucket"));
			digiWaterMark.setInputFile2(inputFile2);
			editingConfig.setDigiWaterMark(digiWaterMark);

			OutputFile outputFile = new OutputFile();
			outputFile.setRoleArn(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.OutputFile.RoleArn"));
			outputFile.setObject(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.OutputFile.Object"));
			outputFile.setLocation(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.OutputFile.Location"));
			outputFile.setBucket(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.OutputFile.Bucket"));
			editingConfig.setOutputFile(outputFile);

			Editing editing = new Editing();

			Timeline timeline = new Timeline();

			TimelineConfig timelineConfig = new TimelineConfig();

			TimelineConfigAudio timelineConfigAudio = new TimelineConfigAudio();
			timelineConfigAudio.setChannelLayout(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigAudio.ChannelLayout"));
			timelineConfigAudio.setSamplerate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigAudio.Samplerate"));
			timelineConfigAudio.setChannels(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigAudio.Channels"));
			timelineConfig.setTimelineConfigAudio(timelineConfigAudio);

			TimelineConfigVideo timelineConfigVideo = new TimelineConfigVideo();
			timelineConfigVideo.setBgColor(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.BgColor"));
			timelineConfigVideo.setWidth(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.Width"));
			timelineConfigVideo.setRenderRatio(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.RenderRatio"));
			timelineConfigVideo.setIsGpuData(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.IsGpuData"));
			timelineConfigVideo.setHeight(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.Height"));
			timelineConfigVideo.setIsOneTrackData(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.IsOneTrackData"));
			timelineConfigVideo.setFps(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.Fps"));
			timelineConfigVideo.setReclosePrec(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TimelineConfig.TimelineConfigVideo.ReclosePrec"));
			timelineConfig.setTimelineConfigVideo(timelineConfigVideo);
			timeline.setTimelineConfig(timelineConfig);

			List<Track> trackList = new ArrayList<Track>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList.Length"); j++) {
				Track track = new Track();
				track.setType(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Type"));
				track.setOrder(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Order"));
				track.setId(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Id"));

				List<Clip3> clips = new ArrayList<Clip3>();
				for (int k = 0; k < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips.Length"); k++) {
					Clip3 clip3 = new Clip3();
					clip3.setOut(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].Out"));
					clip3.setIn(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].In"));
					clip3.setClipID(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].clipID"));

					ClipsConfig clipsConfig = new ClipsConfig();

					ClipsConfigVideo clipsConfigVideo = new ClipsConfigVideo();
					clipsConfigVideo.setT(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].ClipsConfig.ClipsConfigVideo.T"));
					clipsConfigVideo.setL(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.Timeline.TrackList["+ j +"].Clips["+ k +"].ClipsConfig.ClipsConfigVideo.L"));
					clipsConfig.setClipsConfigVideo(clipsConfigVideo);
					clip3.setClipsConfig(clipsConfig);

					clips.add(clip3);
				}
				track.setClips(clips);

				trackList.add(track);
			}
			timeline.setTrackList(trackList);
			editing.setTimeline(timeline);

			List<Clip> clipList = new ArrayList<Clip>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList.Length"); j++) {
				Clip clip = new Clip();
				clip.setType(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].Type"));
				clip.setSourceID(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].SourceID"));
				clip.setSourceType(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].SourceType"));
				clip.setSourceStrmMap(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].SourceStrmMap"));
				clip.setOut(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].Out"));
				clip.setIn(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].In"));
				clip.setId(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].Id"));

				List<Effect> effects = new ArrayList<Effect>();
				for (int k = 0; k < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].Effects.Length"); k++) {
					Effect effect = new Effect();
					effect.setEffect(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].Effects["+ k +"].Effect"));
					effect.setEffectConfig(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Editing.ClipList["+ j +"].Effects["+ k +"].EffectConfig"));

					effects.add(effect);
				}
				clip.setEffects(effects);

				clipList.add(clip);
			}
			editing.setClipList(clipList);
			editingConfig.setEditing(editing);

			Container container = new Container();
			container.setFormat(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Container.Format"));
			editingConfig.setContainer(container);

			Clip4 clip4 = new Clip4();

			TimeSpan timeSpan = new TimeSpan();
			timeSpan.setSeek(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Clip.TimeSpan.Seek"));
			timeSpan.setDuration(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Clip.TimeSpan.Duration"));
			clip4.setTimeSpan(timeSpan);
			editingConfig.setClip4(clip4);

			MuxConfig muxConfig = new MuxConfig();

			Gif gif = new Gif();
			gif.setFinalDelay(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MuxConfig.Gif.FinalDelay"));
			gif.setDitherMode(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MuxConfig.Gif.DitherMode"));
			gif.setLoop(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MuxConfig.Gif.Loop"));
			gif.setIsCustomPalette(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MuxConfig.Gif.IsCustomPalette"));
			muxConfig.setGif(gif);

			Segment segment = new Segment();
			segment.setDuration(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);
			editingConfig.setMuxConfig(muxConfig);

			SubtitleConfig subtitleConfig = new SubtitleConfig();

			List<ExtSubtitle> extSubtitleList = new ArrayList<ExtSubtitle>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SubtitleConfig.ExtSubtitleList.Length"); j++) {
				ExtSubtitle extSubtitle = new ExtSubtitle();
				extSubtitle.setCharEnc(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SubtitleConfig.ExtSubtitleList["+ j +"].CharEnc"));
				extSubtitle.setFontName(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SubtitleConfig.ExtSubtitleList["+ j +"].FontName"));

				Input input = new Input();
				input.setObject(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Object"));
				input.setLocation(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Location"));
				input.setBucket(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SubtitleConfig.ExtSubtitleList["+ j +"].Input.Bucket"));
				extSubtitle.setInput(input);

				extSubtitleList.add(extSubtitle);
			}
			subtitleConfig.setExtSubtitleList(extSubtitleList);

			List<Subtitle> subtitleList = new ArrayList<Subtitle>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SubtitleConfig.SubtitleList.Length"); j++) {
				Subtitle subtitle = new Subtitle();
				subtitle.setMap(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.SubtitleConfig.SubtitleList["+ j +"].Map"));

				subtitleList.add(subtitle);
			}
			subtitleConfig.setSubtitleList(subtitleList);
			editingConfig.setSubtitleConfig(subtitleConfig);

			Properties properties = new Properties();
			properties.setWidth(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Width"));
			properties.setHeight(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Height"));
			properties.setDuration(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Duration"));
			properties.setFps(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Fps"));
			properties.setBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Bitrate"));
			properties.setFileFormat(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.FileFormat"));
			properties.setFileSize(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.FileSize"));

			Streams streams = new Streams();

			List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList.Length"); j++) {
				VideoStream videoStream = new VideoStream();
				videoStream.setIndex(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Index"));
				videoStream.setTimebase(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Timebase"));
				videoStream.setAvgFPS(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].AvgFPS"));
				videoStream.setPixFmt(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].PixFmt"));
				videoStream.setSar(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Sar"));
				videoStream.setLang(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Lang"));
				videoStream.setCodecLongName(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].CodecLongName"));
				videoStream.setHeight(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Height"));
				videoStream.setNumFrames(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].NumFrames"));
				videoStream.setBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Bitrate"));
				videoStream.setCodecTagString(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].CodecTagString"));
				videoStream.setHasBFrames(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].HasBFrames"));
				videoStream.setProfile(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Profile"));
				videoStream.setStartTime(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].StartTime"));
				videoStream.setDar(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Dar"));
				videoStream.setCodecName(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].CodecName"));
				videoStream.setWidth(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Width"));
				videoStream.setDuration(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Duration"));
				videoStream.setFps(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Fps"));
				videoStream.setCodecTag(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].CodecTag"));
				videoStream.setCodecTimeBase(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].CodecTimeBase"));
				videoStream.setLevel(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].Level"));

				NetworkCost networkCost = new NetworkCost();
				networkCost.setPreloadTime(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.PreloadTime"));
				networkCost.setAvgBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.AvgBitrate"));
				networkCost.setCostBandwidth(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.VideoStreamList["+ j +"].NetworkCost.CostBandwidth"));
				videoStream.setNetworkCost(networkCost);

				videoStreamList.add(videoStream);
			}
			streams.setVideoStreamList(videoStreamList);

			List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList.Length"); j++) {
				AudioStream audioStream = new AudioStream();
				audioStream.setTimebase(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Timebase"));
				audioStream.setIndex(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Index"));
				audioStream.setSampleFmt(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].SampleFmt"));
				audioStream.setChannelLayout(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].ChannelLayout"));
				audioStream.setLang(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Lang"));
				audioStream.setSamplerate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Samplerate"));
				audioStream.setCodecLongName(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].CodecLongName"));
				audioStream.setChannels(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Channels"));
				audioStream.setNumFrames(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].NumFrames"));
				audioStream.setBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Bitrate"));
				audioStream.setCodecTagString(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].CodecTagString"));
				audioStream.setStartTime(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].StartTime"));
				audioStream.setCodecName(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].CodecName"));
				audioStream.setDuration(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].Duration"));
				audioStream.setCodecTag(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].CodecTag"));
				audioStream.setCodecTimeBase(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Streams.AudioStreamList["+ j +"].CodecTimeBase"));

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
			format.setStartTime(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Format.StartTime"));
			format.setNumPrograms(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Format.NumPrograms"));
			format.setSize(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Format.Size"));
			format.setNumStreams(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Format.NumStreams"));
			format.setFormatLongName(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Format.FormatLongName"));
			format.setDuration(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Format.Duration"));
			format.setBitrate(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Format.Bitrate"));
			format.setFormatName(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.Properties.Format.FormatName"));
			properties.setFormat(format);
			editingConfig.setProperties(properties);

			List<WaterMark> waterMarkList = new ArrayList<WaterMark>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList.Length"); j++) {
				WaterMark waterMark = new WaterMark();
				waterMark.setType(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].Type"));
				waterMark.setReferPos(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].ReferPos"));
				waterMark.setDx(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].Dx"));
				waterMark.setWidth(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].Width"));
				waterMark.setHeight(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].Height"));
				waterMark.setWaterMarkTemplateId(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].WaterMarkTemplateId"));
				waterMark.setDy(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].Dy"));

				InputFile1 inputFile1 = new InputFile1();
				inputFile1.setObject(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].InputFile.Object"));
				inputFile1.setLocation(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].InputFile.Location"));
				inputFile1.setBucket(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.WaterMarkList["+ j +"].InputFile.Bucket"));
				waterMark.setInputFile1(inputFile1);

				waterMarkList.add(waterMark);
			}
			editingConfig.setWaterMarkList(waterMarkList);

			List<Merge> mergeList = new ArrayList<Merge>();
			for (int j = 0; j < _ctx.lengthValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MergeList.Length"); j++) {
				Merge merge = new Merge();
				merge.setStart(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MergeList["+ j +"].Start"));
				merge.setRoleArn(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MergeList["+ j +"].RoleArn"));
				merge.setMergeURL(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MergeList["+ j +"].MergeURL"));
				merge.setDuration(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingConfig.MergeList["+ j +"].Duration"));

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
				inputFile.setObject(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingInputs["+ j +"].InputFile.Object"));
				inputFile.setLocation(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingInputs["+ j +"].InputFile.Location"));
				inputFile.setBucket(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingInputs["+ j +"].InputFile.Bucket"));
				editingInput.setInputFile(inputFile);

				InputConfig inputConfig = new InputConfig();
				inputConfig.setIsNormalSar(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingInputs["+ j +"].InputConfig.IsNormalSar"));
				inputConfig.setDeinterlaceMethod(_ctx.stringValue("QueryEditingJobListResponse.JobList["+ i +"].EditingInputs["+ j +"].InputConfig.DeinterlaceMethod"));
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