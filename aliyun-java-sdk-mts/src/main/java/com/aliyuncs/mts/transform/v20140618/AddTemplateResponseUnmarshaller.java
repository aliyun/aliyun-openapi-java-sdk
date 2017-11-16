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

import com.aliyuncs.mts.model.v20140618.AddTemplateResponse;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.Audio;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.Audio.Volume;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.Container;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.MuxConfig;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.TransConfig;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.Video;
import com.aliyuncs.mts.model.v20140618.AddTemplateResponse.Template.Video.BitrateBnd;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddTemplateResponseUnmarshaller {

	public static AddTemplateResponse unmarshall(AddTemplateResponse addTemplateResponse, UnmarshallerContext context) {
		
		addTemplateResponse.setRequestId(context.stringValue("AddTemplateResponse.RequestId"));

		Template template = new Template();
		template.setId(context.stringValue("AddTemplateResponse.Template.Id"));
		template.setName(context.stringValue("AddTemplateResponse.Template.Name"));
		template.setState(context.stringValue("AddTemplateResponse.Template.State"));

		Container container = new Container();
		container.setFormat(context.stringValue("AddTemplateResponse.Template.Container.Format"));
		template.setContainer(container);

		Video video = new Video();
		video.setCodec(context.stringValue("AddTemplateResponse.Template.Video.Codec"));
		video.setProfile(context.stringValue("AddTemplateResponse.Template.Video.Profile"));
		video.setBitrate(context.stringValue("AddTemplateResponse.Template.Video.Bitrate"));
		video.setCrf(context.stringValue("AddTemplateResponse.Template.Video.Crf"));
		video.setWidth(context.stringValue("AddTemplateResponse.Template.Video.Width"));
		video.setHeight(context.stringValue("AddTemplateResponse.Template.Video.Height"));
		video.setFps(context.stringValue("AddTemplateResponse.Template.Video.Fps"));
		video.setGop(context.stringValue("AddTemplateResponse.Template.Video.Gop"));
		video.setPreset(context.stringValue("AddTemplateResponse.Template.Video.Preset"));
		video.setScanMode(context.stringValue("AddTemplateResponse.Template.Video.ScanMode"));
		video.setBufsize(context.stringValue("AddTemplateResponse.Template.Video.Bufsize"));
		video.setMaxrate(context.stringValue("AddTemplateResponse.Template.Video.Maxrate"));
		video.setPixFmt(context.stringValue("AddTemplateResponse.Template.Video.PixFmt"));
		video.setDegrain(context.stringValue("AddTemplateResponse.Template.Video.Degrain"));
		video.setQscale(context.stringValue("AddTemplateResponse.Template.Video.Qscale"));
		video.setRemove(context.stringValue("AddTemplateResponse.Template.Video.Remove"));
		video.setCrop(context.stringValue("AddTemplateResponse.Template.Video.Crop"));
		video.setPad(context.stringValue("AddTemplateResponse.Template.Video.Pad"));
		video.setMaxFps(context.stringValue("AddTemplateResponse.Template.Video.MaxFps"));

		BitrateBnd bitrateBnd = new BitrateBnd();
		bitrateBnd.setMax(context.stringValue("AddTemplateResponse.Template.Video.BitrateBnd.Max"));
		bitrateBnd.setMin(context.stringValue("AddTemplateResponse.Template.Video.BitrateBnd.Min"));
		video.setBitrateBnd(bitrateBnd);
		template.setVideo(video);

		Audio audio = new Audio();
		audio.setCodec(context.stringValue("AddTemplateResponse.Template.Audio.Codec"));
		audio.setProfile(context.stringValue("AddTemplateResponse.Template.Audio.Profile"));
		audio.setSamplerate(context.stringValue("AddTemplateResponse.Template.Audio.Samplerate"));
		audio.setBitrate(context.stringValue("AddTemplateResponse.Template.Audio.Bitrate"));
		audio.setChannels(context.stringValue("AddTemplateResponse.Template.Audio.Channels"));
		audio.setQscale(context.stringValue("AddTemplateResponse.Template.Audio.Qscale"));
		audio.setRemove(context.stringValue("AddTemplateResponse.Template.Audio.Remove"));

		Volume volume = new Volume();
		volume.setLevel(context.stringValue("AddTemplateResponse.Template.Audio.Volume.Level"));
		volume.setMethod(context.stringValue("AddTemplateResponse.Template.Audio.Volume.Method"));
		audio.setVolume(volume);
		template.setAudio(audio);

		TransConfig transConfig = new TransConfig();
		transConfig.setTransMode(context.stringValue("AddTemplateResponse.Template.TransConfig.TransMode"));
		transConfig.setIsCheckReso(context.stringValue("AddTemplateResponse.Template.TransConfig.IsCheckReso"));
		transConfig.setIsCheckResoFail(context.stringValue("AddTemplateResponse.Template.TransConfig.IsCheckResoFail"));
		transConfig.setIsCheckVideoBitrate(context.stringValue("AddTemplateResponse.Template.TransConfig.IsCheckVideoBitrate"));
		transConfig.setIsCheckAudioBitrate(context.stringValue("AddTemplateResponse.Template.TransConfig.IsCheckAudioBitrate"));
		transConfig.setAdjDarMethod(context.stringValue("AddTemplateResponse.Template.TransConfig.AdjDarMethod"));
		transConfig.setIsCheckVideoBitrateFail(context.stringValue("AddTemplateResponse.Template.TransConfig.IsCheckVideoBitrateFail"));
		transConfig.setIsCheckAudioBitrateFail(context.stringValue("AddTemplateResponse.Template.TransConfig.IsCheckAudioBitrateFail"));
		template.setTransConfig(transConfig);

		MuxConfig muxConfig = new MuxConfig();

		Segment segment = new Segment();
		segment.setDuration(context.stringValue("AddTemplateResponse.Template.MuxConfig.Segment.Duration"));
		muxConfig.setSegment(segment);

		Gif gif = new Gif();
		gif.setLoop(context.stringValue("AddTemplateResponse.Template.MuxConfig.Gif.Loop"));
		gif.setFinalDelay(context.stringValue("AddTemplateResponse.Template.MuxConfig.Gif.FinalDelay"));
		gif.setIsCustomPalette(context.stringValue("AddTemplateResponse.Template.MuxConfig.Gif.IsCustomPalette"));
		gif.setDitherMode(context.stringValue("AddTemplateResponse.Template.MuxConfig.Gif.DitherMode"));
		muxConfig.setGif(gif);
		template.setMuxConfig(muxConfig);
		addTemplateResponse.setTemplate(template);
	 
	 	return addTemplateResponse;
	}
}