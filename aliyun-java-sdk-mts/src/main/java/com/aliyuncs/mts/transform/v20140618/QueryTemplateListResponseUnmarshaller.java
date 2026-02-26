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

import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.Audio;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.Audio.Volume;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.Container;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.FrontendHint;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.MuxConfig;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.MuxConfig.Webp;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.TransConfig;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.Video;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.Video.BitrateBnd;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.Video.NarrowBand;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTemplateListResponseUnmarshaller {

	public static QueryTemplateListResponse unmarshall(QueryTemplateListResponse queryTemplateListResponse, UnmarshallerContext _ctx) {
		
		queryTemplateListResponse.setRequestId(_ctx.stringValue("QueryTemplateListResponse.RequestId"));

		List<String> nonExistTids = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryTemplateListResponse.NonExistTids.Length"); i++) {
			nonExistTids.add(_ctx.stringValue("QueryTemplateListResponse.NonExistTids["+ i +"]"));
		}
		queryTemplateListResponse.setNonExistTids(nonExistTids);

		List<Template> templateList = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("QueryTemplateListResponse.TemplateList.Length"); i++) {
			Template template = new Template();
			template.setState(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].State"));
			template.setName(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Name"));
			template.setId(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Id"));
			template.setCreationTime(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].CreationTime"));

			Video video = new Video();
			video.setBufsize(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Bufsize"));
			video.setLongShortMode(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.LongShortMode"));
			video.setDegrain(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Degrain"));
			video.setPixFmt(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.PixFmt"));
			video.setPad(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Pad"));
			video.setCodec(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Codec"));
			video.setHeight(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Height"));
			video.setQscale(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Qscale"));
			video.setCrop(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Crop"));
			video.setBitrate(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Bitrate"));
			video.setMaxrate(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Maxrate"));
			video.setMaxFps(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.MaxFps"));
			video.setProfile(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Profile"));
			video.setCrf(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Crf"));
			video.setRemove(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Remove"));
			video.setGop(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Gop"));
			video.setWidth(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Width"));
			video.setFps(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Fps"));
			video.setPreset(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Preset"));
			video.setScanMode(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.ScanMode"));
			video.setResoPriority(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.ResoPriority"));
			video.setHdr2sdr(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Hdr2sdr"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.BitrateBnd.Max"));
			bitrateBnd.setMin(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);

			NarrowBand narrowBand = new NarrowBand();
			narrowBand.setVersion(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.NarrowBand.Version"));
			narrowBand.setAbrmax(_ctx.floatValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.NarrowBand.Abrmax"));
			narrowBand.setMaxAbrRatio(_ctx.floatValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.NarrowBand.MaxAbrRatio"));
			video.setNarrowBand(narrowBand);
			template.setVideo(video);

			TransConfig transConfig = new TransConfig();
			transConfig.setIsCheckAudioBitrate(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.IsCheckAudioBitrate"));
			transConfig.setTransMode(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.TransMode"));
			transConfig.setIsCheckReso(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.IsCheckReso"));
			transConfig.setIsCheckVideoBitrateFail(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.IsCheckVideoBitrateFail"));
			transConfig.setAdjDarMethod(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.AdjDarMethod"));
			transConfig.setIsCheckVideoBitrate(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.IsCheckVideoBitrate"));
			transConfig.setIsCheckResoFail(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.IsCheckResoFail"));
			transConfig.setIsCheckAudioBitrateFail(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.IsCheckAudioBitrateFail"));
			template.setTransConfig(transConfig);

			MuxConfig muxConfig = new MuxConfig();

			Webp webp = new Webp();
			webp.setLoop(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Webp.Loop"));
			muxConfig.setWebp(webp);

			Gif gif = new Gif();
			gif.setFinalDelay(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Gif.FinalDelay"));
			gif.setDitherMode(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Gif.DitherMode"));
			gif.setLoop(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Gif.Loop"));
			gif.setIsCustomPalette(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Gif.IsCustomPalette"));
			muxConfig.setGif(gif);

			Segment segment = new Segment();
			segment.setDuration(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);
			template.setMuxConfig(muxConfig);

			Audio audio = new Audio();
			audio.setProfile(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Profile"));
			audio.setRemove(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Remove"));
			audio.setCodec(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Codec"));
			audio.setSamplerate(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Samplerate"));
			audio.setQscale(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Qscale"));
			audio.setChannels(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Channels"));
			audio.setBitrate(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Bitrate"));

			Volume volume = new Volume();
			volume.setBizMethod(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Volume.Method"));
			volume.setTruePeak(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Volume.TruePeak"));
			volume.setIntegratedLoudnessTarget(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Volume.IntegratedLoudnessTarget"));
			volume.setLoudnessRangeTarget(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Volume.LoudnessRangeTarget"));
			volume.setLevel(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Volume.Level"));
			volume.setPeakLevel(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Volume.PeakLevel"));
			audio.setVolume(volume);
			template.setAudio(audio);

			Container container = new Container();
			container.setFormat(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Container.Format"));
			template.setContainer(container);

			FrontendHint frontendHint = new FrontendHint();
			frontendHint.setTranscodeType(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].FrontendHint.TranscodeType"));
			frontendHint.setBitrateControlType(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].FrontendHint.BitrateControlType"));
			frontendHint.setSource(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].FrontendHint.Source"));
			frontendHint.setIsDynamic(_ctx.booleanValue("QueryTemplateListResponse.TemplateList["+ i +"].FrontendHint.IsDynamic"));
			frontendHint.setHasOldHdr2Sdr(_ctx.booleanValue("QueryTemplateListResponse.TemplateList["+ i +"].FrontendHint.HasOldHdr2Sdr"));
			template.setFrontendHint(frontendHint);

			templateList.add(template);
		}
		queryTemplateListResponse.setTemplateList(templateList);
	 
	 	return queryTemplateListResponse;
	}
}