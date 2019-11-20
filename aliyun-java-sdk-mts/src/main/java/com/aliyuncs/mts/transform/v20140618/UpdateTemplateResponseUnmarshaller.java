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

import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.Audio;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.Container;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.MuxConfig;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.MuxConfig.Webp;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.TransConfig;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.Video;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.Video.BitrateBnd;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTemplateResponseUnmarshaller {

	public static UpdateTemplateResponse unmarshall(UpdateTemplateResponse updateTemplateResponse, UnmarshallerContext _ctx) {
		
		updateTemplateResponse.setRequestId(_ctx.stringValue("UpdateTemplateResponse.RequestId"));

		Template template = new Template();
		template.setId(_ctx.stringValue("UpdateTemplateResponse.Template.Id"));
		template.setName(_ctx.stringValue("UpdateTemplateResponse.Template.Name"));
		template.setState(_ctx.stringValue("UpdateTemplateResponse.Template.State"));

		Container container = new Container();
		container.setFormat(_ctx.stringValue("UpdateTemplateResponse.Template.Container.Format"));
		template.setContainer(container);

		Video video = new Video();
		video.setCodec(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Codec"));
		video.setProfile(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Profile"));
		video.setBitrate(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Bitrate"));
		video.setCrf(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Crf"));
		video.setWidth(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Width"));
		video.setHeight(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Height"));
		video.setLongShortMode(_ctx.stringValue("UpdateTemplateResponse.Template.Video.LongShortMode"));
		video.setFps(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Fps"));
		video.setGop(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Gop"));
		video.setPreset(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Preset"));
		video.setScanMode(_ctx.stringValue("UpdateTemplateResponse.Template.Video.ScanMode"));
		video.setBufsize(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Bufsize"));
		video.setMaxrate(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Maxrate"));
		video.setPixFmt(_ctx.stringValue("UpdateTemplateResponse.Template.Video.PixFmt"));
		video.setDegrain(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Degrain"));
		video.setQscale(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Qscale"));
		video.setRemove(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Remove"));
		video.setCrop(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Crop"));
		video.setPad(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Pad"));
		video.setMaxFps(_ctx.stringValue("UpdateTemplateResponse.Template.Video.MaxFps"));
		video.setResoPriority(_ctx.stringValue("UpdateTemplateResponse.Template.Video.ResoPriority"));

		BitrateBnd bitrateBnd = new BitrateBnd();
		bitrateBnd.setMax(_ctx.stringValue("UpdateTemplateResponse.Template.Video.BitrateBnd.Max"));
		bitrateBnd.setMin(_ctx.stringValue("UpdateTemplateResponse.Template.Video.BitrateBnd.Min"));
		video.setBitrateBnd(bitrateBnd);
		template.setVideo(video);

		Audio audio = new Audio();
		audio.setCodec(_ctx.stringValue("UpdateTemplateResponse.Template.Audio.Codec"));
		audio.setProfile(_ctx.stringValue("UpdateTemplateResponse.Template.Audio.Profile"));
		audio.setSamplerate(_ctx.stringValue("UpdateTemplateResponse.Template.Audio.Samplerate"));
		audio.setBitrate(_ctx.stringValue("UpdateTemplateResponse.Template.Audio.Bitrate"));
		audio.setChannels(_ctx.stringValue("UpdateTemplateResponse.Template.Audio.Channels"));
		audio.setQscale(_ctx.stringValue("UpdateTemplateResponse.Template.Audio.Qscale"));
		audio.setRemove(_ctx.stringValue("UpdateTemplateResponse.Template.Audio.Remove"));
		template.setAudio(audio);

		TransConfig transConfig = new TransConfig();
		transConfig.setTransMode(_ctx.stringValue("UpdateTemplateResponse.Template.TransConfig.TransMode"));
		transConfig.setIsCheckReso(_ctx.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckReso"));
		transConfig.setIsCheckResoFail(_ctx.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckResoFail"));
		transConfig.setIsCheckVideoBitrate(_ctx.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckVideoBitrate"));
		transConfig.setIsCheckAudioBitrate(_ctx.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckAudioBitrate"));
		transConfig.setAdjDarMethod(_ctx.stringValue("UpdateTemplateResponse.Template.TransConfig.AdjDarMethod"));
		transConfig.setIsCheckVideoBitrateFail(_ctx.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckVideoBitrateFail"));
		transConfig.setIsCheckAudioBitrateFail(_ctx.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckAudioBitrateFail"));
		template.setTransConfig(transConfig);

		MuxConfig muxConfig = new MuxConfig();

		Segment segment = new Segment();
		segment.setDuration(_ctx.stringValue("UpdateTemplateResponse.Template.MuxConfig.Segment.Duration"));
		muxConfig.setSegment(segment);

		Gif gif = new Gif();
		gif.setLoop(_ctx.stringValue("UpdateTemplateResponse.Template.MuxConfig.Gif.Loop"));
		gif.setFinalDelay(_ctx.stringValue("UpdateTemplateResponse.Template.MuxConfig.Gif.FinalDelay"));
		gif.setIsCustomPalette(_ctx.stringValue("UpdateTemplateResponse.Template.MuxConfig.Gif.IsCustomPalette"));
		gif.setDitherMode(_ctx.stringValue("UpdateTemplateResponse.Template.MuxConfig.Gif.DitherMode"));
		muxConfig.setGif(gif);

		Webp webp = new Webp();
		webp.setLoop(_ctx.stringValue("UpdateTemplateResponse.Template.MuxConfig.Webp.Loop"));
		muxConfig.setWebp(webp);
		template.setMuxConfig(muxConfig);
		updateTemplateResponse.setTemplate(template);
	 
	 	return updateTemplateResponse;
	}
}