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

import com.aliyuncs.mts.model.v20140618.SearchTemplateResponse;
import com.aliyuncs.mts.model.v20140618.SearchTemplateResponse.Template;
import com.aliyuncs.mts.model.v20140618.SearchTemplateResponse.Template.Audio;
import com.aliyuncs.mts.model.v20140618.SearchTemplateResponse.Template.Container;
import com.aliyuncs.mts.model.v20140618.SearchTemplateResponse.Template.MuxConfig;
import com.aliyuncs.mts.model.v20140618.SearchTemplateResponse.Template.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.SearchTemplateResponse.Template.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.SearchTemplateResponse.Template.TransConfig;
import com.aliyuncs.mts.model.v20140618.SearchTemplateResponse.Template.Video;
import com.aliyuncs.mts.model.v20140618.SearchTemplateResponse.Template.Video.BitrateBnd;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTemplateResponseUnmarshaller {

	public static SearchTemplateResponse unmarshall(SearchTemplateResponse searchTemplateResponse, UnmarshallerContext _ctx) {
		
		searchTemplateResponse.setRequestId(_ctx.stringValue("SearchTemplateResponse.RequestId"));
		searchTemplateResponse.setTotalCount(_ctx.longValue("SearchTemplateResponse.TotalCount"));
		searchTemplateResponse.setPageSize(_ctx.longValue("SearchTemplateResponse.PageSize"));
		searchTemplateResponse.setPageNumber(_ctx.longValue("SearchTemplateResponse.PageNumber"));

		List<Template> templateList = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("SearchTemplateResponse.TemplateList.Length"); i++) {
			Template template = new Template();
			template.setState(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].State"));
			template.setName(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Name"));
			template.setId(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Id"));

			Video video = new Video();
			video.setBufsize(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Bufsize"));
			video.setLongShortMode(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.LongShortMode"));
			video.setDegrain(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Degrain"));
			video.setPixFmt(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.PixFmt"));
			video.setPad(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Pad"));
			video.setCodec(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Codec"));
			video.setHeight(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Height"));
			video.setQscale(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Qscale"));
			video.setCrop(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Crop"));
			video.setBitrate(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Bitrate"));
			video.setMaxrate(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Maxrate"));
			video.setMaxFps(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.MaxFps"));
			video.setProfile(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Profile"));
			video.setCrf(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Crf"));
			video.setRemove(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Remove"));
			video.setGop(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Gop"));
			video.setWidth(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Width"));
			video.setFps(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Fps"));
			video.setPreset(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Preset"));
			video.setScanMode(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.ScanMode"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.BitrateBnd.Max"));
			bitrateBnd.setMin(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			template.setVideo(video);

			TransConfig transConfig = new TransConfig();
			transConfig.setIsCheckAudioBitrate(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].TransConfig.IsCheckAudioBitrate"));
			transConfig.setTransMode(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].TransConfig.TransMode"));
			transConfig.setIsCheckReso(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].TransConfig.IsCheckReso"));
			transConfig.setIsCheckVideoBitrateFail(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].TransConfig.IsCheckVideoBitrateFail"));
			transConfig.setAdjDarMethod(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].TransConfig.AdjDarMethod"));
			transConfig.setIsCheckVideoBitrate(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].TransConfig.IsCheckVideoBitrate"));
			transConfig.setIsCheckResoFail(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].TransConfig.IsCheckResoFail"));
			transConfig.setIsCheckAudioBitrateFail(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].TransConfig.IsCheckAudioBitrateFail"));
			template.setTransConfig(transConfig);

			MuxConfig muxConfig = new MuxConfig();

			Gif gif = new Gif();
			gif.setFinalDelay(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].MuxConfig.Gif.FinalDelay"));
			gif.setDitherMode(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].MuxConfig.Gif.DitherMode"));
			gif.setLoop(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].MuxConfig.Gif.Loop"));
			gif.setIsCustomPalette(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].MuxConfig.Gif.IsCustomPalette"));
			muxConfig.setGif(gif);

			Segment segment = new Segment();
			segment.setDuration(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);
			template.setMuxConfig(muxConfig);

			Audio audio = new Audio();
			audio.setProfile(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Audio.Profile"));
			audio.setRemove(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Audio.Remove"));
			audio.setCodec(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Audio.Codec"));
			audio.setSamplerate(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Audio.Samplerate"));
			audio.setQscale(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Audio.Qscale"));
			audio.setChannels(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Audio.Channels"));
			audio.setBitrate(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Audio.Bitrate"));
			template.setAudio(audio);

			Container container = new Container();
			container.setFormat(_ctx.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Container.Format"));
			template.setContainer(container);

			templateList.add(template);
		}
		searchTemplateResponse.setTemplateList(templateList);
	 
	 	return searchTemplateResponse;
	}
}