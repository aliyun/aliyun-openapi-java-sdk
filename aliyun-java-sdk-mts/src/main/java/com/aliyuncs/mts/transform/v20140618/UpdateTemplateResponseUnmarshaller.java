/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.mts.transform.v20140618;

import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.Audio;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.Container;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.MuxConfig;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.TransConfig;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.Video;
import com.aliyuncs.mts.model.v20140618.UpdateTemplateResponse.Template.Video.BitrateBnd;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTemplateResponseUnmarshaller {

	public static UpdateTemplateResponse unmarshall(UpdateTemplateResponse updateTemplateResponse, UnmarshallerContext context) {
		
		updateTemplateResponse.setRequestId(context.stringValue("UpdateTemplateResponse.RequestId"));

		Template template = new Template();
		template.setId(context.stringValue("UpdateTemplateResponse.Template.Id"));
		template.setName(context.stringValue("UpdateTemplateResponse.Template.Name"));
		template.setState(context.stringValue("UpdateTemplateResponse.Template.State"));

		Container container = new Container();
		container.setFormat(context.stringValue("UpdateTemplateResponse.Template.Container.Format"));
		template.setContainer(container);

		Video video = new Video();
		video.setCodec(context.stringValue("UpdateTemplateResponse.Template.Video.Codec"));
		video.setProfile(context.stringValue("UpdateTemplateResponse.Template.Video.Profile"));
		video.setBitrate(context.stringValue("UpdateTemplateResponse.Template.Video.Bitrate"));
		video.setCrf(context.stringValue("UpdateTemplateResponse.Template.Video.Crf"));
		video.setWidth(context.stringValue("UpdateTemplateResponse.Template.Video.Width"));
		video.setHeight(context.stringValue("UpdateTemplateResponse.Template.Video.Height"));
		video.setFps(context.stringValue("UpdateTemplateResponse.Template.Video.Fps"));
		video.setGop(context.stringValue("UpdateTemplateResponse.Template.Video.Gop"));
		video.setPreset(context.stringValue("UpdateTemplateResponse.Template.Video.Preset"));
		video.setScanMode(context.stringValue("UpdateTemplateResponse.Template.Video.ScanMode"));
		video.setBufsize(context.stringValue("UpdateTemplateResponse.Template.Video.Bufsize"));
		video.setMaxrate(context.stringValue("UpdateTemplateResponse.Template.Video.Maxrate"));
		video.setPixFmt(context.stringValue("UpdateTemplateResponse.Template.Video.PixFmt"));
		video.setDegrain(context.stringValue("UpdateTemplateResponse.Template.Video.Degrain"));
		video.setQscale(context.stringValue("UpdateTemplateResponse.Template.Video.Qscale"));
		video.setRemove(context.stringValue("UpdateTemplateResponse.Template.Video.Remove"));
		video.setCrop(context.stringValue("UpdateTemplateResponse.Template.Video.Crop"));
		video.setPad(context.stringValue("UpdateTemplateResponse.Template.Video.Pad"));
		video.setMaxFps(context.stringValue("UpdateTemplateResponse.Template.Video.MaxFps"));

		BitrateBnd bitrateBnd = new BitrateBnd();
		bitrateBnd.setMax(context.stringValue("UpdateTemplateResponse.Template.Video.BitrateBnd.Max"));
		bitrateBnd.setMin(context.stringValue("UpdateTemplateResponse.Template.Video.BitrateBnd.Min"));
		video.setBitrateBnd(bitrateBnd);
		template.setVideo(video);

		Audio audio = new Audio();
		audio.setCodec(context.stringValue("UpdateTemplateResponse.Template.Audio.Codec"));
		audio.setProfile(context.stringValue("UpdateTemplateResponse.Template.Audio.Profile"));
		audio.setSamplerate(context.stringValue("UpdateTemplateResponse.Template.Audio.Samplerate"));
		audio.setBitrate(context.stringValue("UpdateTemplateResponse.Template.Audio.Bitrate"));
		audio.setChannels(context.stringValue("UpdateTemplateResponse.Template.Audio.Channels"));
		audio.setQscale(context.stringValue("UpdateTemplateResponse.Template.Audio.Qscale"));
		audio.setRemove(context.stringValue("UpdateTemplateResponse.Template.Audio.Remove"));
		template.setAudio(audio);

		TransConfig transConfig = new TransConfig();
		transConfig.setTransMode(context.stringValue("UpdateTemplateResponse.Template.TransConfig.TransMode"));
		transConfig.setIsCheckReso(context.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckReso"));
		transConfig.setIsCheckResoFail(context.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckResoFail"));
		transConfig.setIsCheckVideoBitrate(context.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckVideoBitrate"));
		transConfig.setIsCheckAudioBitrate(context.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckAudioBitrate"));
		transConfig.setAdjDarMethod(context.stringValue("UpdateTemplateResponse.Template.TransConfig.AdjDarMethod"));
		transConfig.setIsCheckVideoBitrateFail(context.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckVideoBitrateFail"));
		transConfig.setIsCheckAudioBitrateFail(context.stringValue("UpdateTemplateResponse.Template.TransConfig.IsCheckAudioBitrateFail"));
		template.setTransConfig(transConfig);

		MuxConfig muxConfig = new MuxConfig();

		Segment segment = new Segment();
		segment.setDuration(context.stringValue("UpdateTemplateResponse.Template.MuxConfig.Segment.Duration"));
		muxConfig.setSegment(segment);

		Gif gif = new Gif();
		gif.setLoop(context.stringValue("UpdateTemplateResponse.Template.MuxConfig.Gif.Loop"));
		gif.setFinalDelay(context.stringValue("UpdateTemplateResponse.Template.MuxConfig.Gif.FinalDelay"));
		gif.setIsCustomPalette(context.stringValue("UpdateTemplateResponse.Template.MuxConfig.Gif.IsCustomPalette"));
		gif.setDitherMode(context.stringValue("UpdateTemplateResponse.Template.MuxConfig.Gif.DitherMode"));
		muxConfig.setGif(gif);
		template.setMuxConfig(muxConfig);
		updateTemplateResponse.setTemplate(template);
	 
	 	return updateTemplateResponse;
	}
}