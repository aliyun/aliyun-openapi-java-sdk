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

import com.aliyuncs.mts.model.v20140618.AddTemplateResponse;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.Audio;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.Audio.Volume;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.Container;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.MuxConfig;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.MuxConfig.Webp;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.TransConfig;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.Video;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.Video.BitrateBnd;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddTemplateResponseUnmarshaller {

	public static AddTemplateResponse unmarshall(AddTemplateResponse addTemplateResponse, UnmarshallerContext _ctx) {
		
		addTemplateResponse.setRequestId(_ctx.stringValue("AddTemplateResponse.RequestId"));

		Template template = new Template();
		template.setState(_ctx.stringValue("AddTemplateResponse.Template.State"));
		template.setName(_ctx.stringValue("AddTemplateResponse.Template.Name"));
		template.setId(_ctx.stringValue("AddTemplateResponse.Template.Id"));

		Video video = new Video();
		video.setBufsize(_ctx.stringValue("AddTemplateResponse.Template.Video.Bufsize"));
		video.setLongShortMode(_ctx.stringValue("AddTemplateResponse.Template.Video.LongShortMode"));
		video.setDegrain(_ctx.stringValue("AddTemplateResponse.Template.Video.Degrain"));
		video.setPixFmt(_ctx.stringValue("AddTemplateResponse.Template.Video.PixFmt"));
		video.setPad(_ctx.stringValue("AddTemplateResponse.Template.Video.Pad"));
		video.setCodec(_ctx.stringValue("AddTemplateResponse.Template.Video.Codec"));
		video.setHeight(_ctx.stringValue("AddTemplateResponse.Template.Video.Height"));
		video.setQscale(_ctx.stringValue("AddTemplateResponse.Template.Video.Qscale"));
		video.setCrop(_ctx.stringValue("AddTemplateResponse.Template.Video.Crop"));
		video.setBitrate(_ctx.stringValue("AddTemplateResponse.Template.Video.Bitrate"));
		video.setMaxrate(_ctx.stringValue("AddTemplateResponse.Template.Video.Maxrate"));
		video.setMaxFps(_ctx.stringValue("AddTemplateResponse.Template.Video.MaxFps"));
		video.setProfile(_ctx.stringValue("AddTemplateResponse.Template.Video.Profile"));
		video.setCrf(_ctx.stringValue("AddTemplateResponse.Template.Video.Crf"));
		video.setRemove(_ctx.stringValue("AddTemplateResponse.Template.Video.Remove"));
		video.setGop(_ctx.stringValue("AddTemplateResponse.Template.Video.Gop"));
		video.setWidth(_ctx.stringValue("AddTemplateResponse.Template.Video.Width"));
		video.setFps(_ctx.stringValue("AddTemplateResponse.Template.Video.Fps"));
		video.setPreset(_ctx.stringValue("AddTemplateResponse.Template.Video.Preset"));
		video.setScanMode(_ctx.stringValue("AddTemplateResponse.Template.Video.ScanMode"));
		video.setResoPriority(_ctx.stringValue("AddTemplateResponse.Template.Video.ResoPriority"));

		BitrateBnd bitrateBnd = new BitrateBnd();
		bitrateBnd.setMax(_ctx.stringValue("AddTemplateResponse.Template.Video.BitrateBnd.Max"));
		bitrateBnd.setMin(_ctx.stringValue("AddTemplateResponse.Template.Video.BitrateBnd.Min"));
		video.setBitrateBnd(bitrateBnd);
		template.setVideo(video);

		TransConfig transConfig = new TransConfig();
		transConfig.setIsCheckAudioBitrate(_ctx.stringValue("AddTemplateResponse.Template.TransConfig.IsCheckAudioBitrate"));
		transConfig.setTransMode(_ctx.stringValue("AddTemplateResponse.Template.TransConfig.TransMode"));
		transConfig.setIsCheckReso(_ctx.stringValue("AddTemplateResponse.Template.TransConfig.IsCheckReso"));
		transConfig.setIsCheckVideoBitrateFail(_ctx.stringValue("AddTemplateResponse.Template.TransConfig.IsCheckVideoBitrateFail"));
		transConfig.setAdjDarMethod(_ctx.stringValue("AddTemplateResponse.Template.TransConfig.AdjDarMethod"));
		transConfig.setIsCheckVideoBitrate(_ctx.stringValue("AddTemplateResponse.Template.TransConfig.IsCheckVideoBitrate"));
		transConfig.setIsCheckResoFail(_ctx.stringValue("AddTemplateResponse.Template.TransConfig.IsCheckResoFail"));
		transConfig.setIsCheckAudioBitrateFail(_ctx.stringValue("AddTemplateResponse.Template.TransConfig.IsCheckAudioBitrateFail"));
		template.setTransConfig(transConfig);

		MuxConfig muxConfig = new MuxConfig();

		Webp webp = new Webp();
		webp.setLoop(_ctx.stringValue("AddTemplateResponse.Template.MuxConfig.Webp.Loop"));
		muxConfig.setWebp(webp);

		Gif gif = new Gif();
		gif.setFinalDelay(_ctx.stringValue("AddTemplateResponse.Template.MuxConfig.Gif.FinalDelay"));
		gif.setDitherMode(_ctx.stringValue("AddTemplateResponse.Template.MuxConfig.Gif.DitherMode"));
		gif.setLoop(_ctx.stringValue("AddTemplateResponse.Template.MuxConfig.Gif.Loop"));
		gif.setIsCustomPalette(_ctx.stringValue("AddTemplateResponse.Template.MuxConfig.Gif.IsCustomPalette"));
		muxConfig.setGif(gif);

		Segment segment = new Segment();
		segment.setDuration(_ctx.stringValue("AddTemplateResponse.Template.MuxConfig.Segment.Duration"));
		muxConfig.setSegment(segment);
		template.setMuxConfig(muxConfig);

		Audio audio = new Audio();
		audio.setProfile(_ctx.stringValue("AddTemplateResponse.Template.Audio.Profile"));
		audio.setRemove(_ctx.stringValue("AddTemplateResponse.Template.Audio.Remove"));
		audio.setCodec(_ctx.stringValue("AddTemplateResponse.Template.Audio.Codec"));
		audio.setSamplerate(_ctx.stringValue("AddTemplateResponse.Template.Audio.Samplerate"));
		audio.setQscale(_ctx.stringValue("AddTemplateResponse.Template.Audio.Qscale"));
		audio.setChannels(_ctx.stringValue("AddTemplateResponse.Template.Audio.Channels"));
		audio.setBitrate(_ctx.stringValue("AddTemplateResponse.Template.Audio.Bitrate"));

		Volume volume = new Volume();
		volume.setBizMethod(_ctx.stringValue("AddTemplateResponse.Template.Audio.Volume.Method"));
		volume.setLevel(_ctx.stringValue("AddTemplateResponse.Template.Audio.Volume.Level"));
		audio.setVolume(volume);
		template.setAudio(audio);

		Container container = new Container();
		container.setFormat(_ctx.stringValue("AddTemplateResponse.Template.Container.Format"));
		template.setContainer(container);
		addTemplateResponse.setTemplate(template);
	 
	 	return addTemplateResponse;
	}
}