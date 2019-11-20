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
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.Container;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.MuxConfig;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.MuxConfig.Webp;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.TransConfig;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.Video;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.Video.BitrateBnd;
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
			template.setId(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Id"));
			template.setName(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Name"));
			template.setState(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].State"));

			Container container = new Container();
			container.setFormat(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Container.Format"));
			template.setContainer(container);

			Video video = new Video();
			video.setCodec(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Codec"));
			video.setProfile(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Profile"));
			video.setBitrate(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Bitrate"));
			video.setCrf(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Crf"));
			video.setWidth(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Width"));
			video.setHeight(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Height"));
			video.setFps(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Fps"));
			video.setGop(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Gop"));
			video.setPreset(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Preset"));
			video.setScanMode(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.ScanMode"));
			video.setBufsize(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Bufsize"));
			video.setMaxrate(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Maxrate"));
			video.setPixFmt(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.PixFmt"));
			video.setDegrain(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Degrain"));
			video.setQscale(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Qscale"));
			video.setLongShortMode(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.LongShortMode"));
			video.setRemove(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Remove"));
			video.setCrop(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Crop"));
			video.setPad(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Pad"));
			video.setMaxFps(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.MaxFps"));
			video.setResoPriority(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.ResoPriority"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.BitrateBnd.Max"));
			bitrateBnd.setMin(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			template.setVideo(video);

			Audio audio = new Audio();
			audio.setCodec(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Codec"));
			audio.setProfile(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Profile"));
			audio.setSamplerate(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Samplerate"));
			audio.setBitrate(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Bitrate"));
			audio.setChannels(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Channels"));
			audio.setQscale(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Qscale"));
			audio.setRemove(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Remove"));
			template.setAudio(audio);

			TransConfig transConfig = new TransConfig();
			transConfig.setTransMode(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.TransMode"));
			transConfig.setIsCheckReso(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.IsCheckReso"));
			transConfig.setIsCheckResoFail(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.IsCheckResoFail"));
			transConfig.setIsCheckVideoBitrate(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.IsCheckVideoBitrate"));
			transConfig.setIsCheckAudioBitrate(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.IsCheckAudioBitrate"));
			transConfig.setAdjDarMethod(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.AdjDarMethod"));
			transConfig.setIsCheckVideoBitrateFail(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.IsCheckVideoBitrateFail"));
			transConfig.setIsCheckAudioBitrateFail(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.IsCheckAudioBitrateFail"));
			template.setTransConfig(transConfig);

			MuxConfig muxConfig = new MuxConfig();

			Segment segment = new Segment();
			segment.setDuration(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);

			Gif gif = new Gif();
			gif.setLoop(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Gif.Loop"));
			gif.setFinalDelay(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Gif.FinalDelay"));
			gif.setIsCustomPalette(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Gif.IsCustomPalette"));
			gif.setDitherMode(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Gif.DitherMode"));
			muxConfig.setGif(gif);

			Webp webp = new Webp();
			webp.setLoop(_ctx.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Webp.Loop"));
			muxConfig.setWebp(webp);
			template.setMuxConfig(muxConfig);

			templateList.add(template);
		}
		queryTemplateListResponse.setTemplateList(templateList);
	 
	 	return queryTemplateListResponse;
	}
}