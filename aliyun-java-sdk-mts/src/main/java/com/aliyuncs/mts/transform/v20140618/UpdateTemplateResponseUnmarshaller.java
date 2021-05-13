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
		template.setState(_ctx.stringValue("UpdateTemplateResponse.Template.State"));
		template.setName(_ctx.stringValue("UpdateTemplateResponse.Template.Name"));
		template.setId(_ctx.stringValue("UpdateTemplateResponse.Template.Id"));

		Video video = new Video();
		video.setLongShortMode(_ctx.stringValue("UpdateTemplateResponse.Template.Video.LongShortMode"));
		video.setBufsize(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Bufsize"));
		video.setDegrain(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Degrain"));
		video.setPixFmt(_ctx.stringValue("UpdateTemplateResponse.Template.Video.PixFmt"));
		video.setPad(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Pad"));
		video.setCodec(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Codec"));
		video.setHeight(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Height"));
		video.setQscale(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Qscale"));
		video.setCrop(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Crop"));
		video.setBitrate(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Bitrate"));
		video.setMaxrate(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Maxrate"));
		video.setMaxFps(_ctx.stringValue("UpdateTemplateResponse.Template.Video.MaxFps"));
		video.setProfile(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Profile"));
		video.setCrf(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Crf"));
		video.setRemove(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Remove"));
		video.setGop(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Gop"));
		video.setWidth(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Width"));
		video.setFps(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Fps"));
		video.setPreset(_ctx.stringValue("UpdateTemplateResponse.Template.Video.Preset"));
		video.setScanMode(_ctx.stringValue("UpdateTemplateResponse.Template.Video.ScanMode"));
		video.setResoPriority(_ctx.stringValue("UpdateTemplateResponse.Template.Video.ResoPriority"));

		BitrateBnd bitrateBnd = new BitrateBnd();
		bitrateBnd.setMax(_ctx.stringValue("UpdateTemplateResponse.Template.Video.BitrateBnd.Max"));
		bitrateBnd.setMin(_ctx.stringValue("UpdateTemplateResponse.Template.Video.BitrateBnd.Min"));
		video.setBitrateBnd(bitrateBnd);
		template.setVideo(video);

		TransConfig transConfig = new TransConfig();
		transConfig.setIsCheckAudioBitrate(_ctx.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckAudioBitrate"));
		transConfig.setTransMode(_ctx.stringValue("UpdateTemplateResponse.Template.TransConfig.TransMode"));
		transConfig.setIsCheckReso(_ctx.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckReso"));
		transConfig.setIsCheckVideoBitrateFail(_ctx.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckVideoBitrateFail"));
		transConfig.setAdjDarMethod(_ctx.stringValue("UpdateTemplateResponse.Template.TransConfig.AdjDarMethod"));
		transConfig.setIsCheckVideoBitrate(_ctx.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckVideoBitrate"));
		transConfig.setIsCheckResoFail(_ctx.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckResoFail"));
		transConfig.setIsCheckAudioBitrateFail(_ctx.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckAudioBitrateFail"));
		template.setTransConfig(transConfig);

		MuxConfig muxConfig = new MuxConfig();

		Webp webp = new Webp();
		webp.setLoop(_ctx.stringValue("UpdateTemplateResponse.Template.MuxConfig.Webp.Loop"));
		muxConfig.setWebp(webp);

		Gif gif = new Gif();
		gif.setFinalDelay(_ctx.stringValue("UpdateTemplateResponse.Template.MuxConfig.Gif.FinalDelay"));
		gif.setDitherMode(_ctx.stringValue("UpdateTemplateResponse.Template.MuxConfig.Gif.DitherMode"));
		gif.setLoop(_ctx.stringValue("UpdateTemplateResponse.Template.MuxConfig.Gif.Loop"));
		gif.setIsCustomPalette(_ctx.stringValue("UpdateTemplateResponse.Template.MuxConfig.Gif.IsCustomPalette"));
		muxConfig.setGif(gif);

		Segment segment = new Segment();
		segment.setDuration(_ctx.stringValue("UpdateTemplateResponse.Template.MuxConfig.Segment.Duration"));
		muxConfig.setSegment(segment);
		template.setMuxConfig(muxConfig);

		Audio audio = new Audio();
		audio.setProfile(_ctx.stringValue("UpdateTemplateResponse.Template.Audio.Profile"));
		audio.setRemove(_ctx.stringValue("UpdateTemplateResponse.Template.Audio.Remove"));
		audio.setCodec(_ctx.stringValue("UpdateTemplateResponse.Template.Audio.Codec"));
		audio.setSamplerate(_ctx.stringValue("UpdateTemplateResponse.Template.Audio.Samplerate"));
		audio.setQscale(_ctx.stringValue("UpdateTemplateResponse.Template.Audio.Qscale"));
		audio.setChannels(_ctx.stringValue("UpdateTemplateResponse.Template.Audio.Channels"));
		audio.setBitrate(_ctx.stringValue("UpdateTemplateResponse.Template.Audio.Bitrate"));
		template.setAudio(audio);

		Container container = new Container();
		container.setFormat(_ctx.stringValue("UpdateTemplateResponse.Template.Container.Format"));
		template.setContainer(container);
		updateTemplateResponse.setTemplate(template);
	 
	 	return updateTemplateResponse;
	}
}