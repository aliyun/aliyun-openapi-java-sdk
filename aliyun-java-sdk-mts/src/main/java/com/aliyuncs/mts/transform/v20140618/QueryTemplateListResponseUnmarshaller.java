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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.Audio;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.Container;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.MuxConfig;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.TransConfig;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.Video;
import com.aliyuncs.mts.model.v20140618.QueryTemplateListResponse.Template.Video.BitrateBnd;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTemplateListResponseUnmarshaller {

	public static QueryTemplateListResponse unmarshall(QueryTemplateListResponse queryTemplateListResponse, UnmarshallerContext context) {
		
		queryTemplateListResponse.setRequestId(context.stringValue("QueryTemplateListResponse.RequestId"));

		List<String> nonExistTids = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryTemplateListResponse.NonExistTids.Length"); i++) {
			nonExistTids.add(context.stringValue("QueryTemplateListResponse.NonExistTids["+ i +"]"));
		}
		queryTemplateListResponse.setNonExistTids(nonExistTids);

		List<Template> templateList = new ArrayList<Template>();
		for (int i = 0; i < context.lengthValue("QueryTemplateListResponse.TemplateList.Length"); i++) {
			Template template = new Template();
			template.setId(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Id"));
			template.setName(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Name"));
			template.setState(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].State"));

			Container container = new Container();
			container.setFormat(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Container.Format"));
			template.setContainer(container);

			Video video = new Video();
			video.setCodec(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Codec"));
			video.setProfile(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Profile"));
			video.setBitrate(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Bitrate"));
			video.setCrf(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Crf"));
			video.setWidth(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Width"));
			video.setHeight(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Height"));
			video.setFps(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Fps"));
			video.setGop(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Gop"));
			video.setPreset(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Preset"));
			video.setScanMode(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.ScanMode"));
			video.setBufsize(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Bufsize"));
			video.setMaxrate(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Maxrate"));
			video.setPixFmt(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.PixFmt"));
			video.setDegrain(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Degrain"));
			video.setQscale(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Qscale"));
			video.setRemove(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Remove"));
			video.setCrop(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Crop"));
			video.setPad(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.Pad"));
			video.setMaxFps(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.MaxFps"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.BitrateBnd.Max"));
			bitrateBnd.setMin(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			template.setVideo(video);

			Audio audio = new Audio();
			audio.setCodec(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Codec"));
			audio.setProfile(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Profile"));
			audio.setSamplerate(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Samplerate"));
			audio.setBitrate(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Bitrate"));
			audio.setChannels(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Channels"));
			audio.setQscale(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Qscale"));
			audio.setRemove(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].Audio.Remove"));
			template.setAudio(audio);

			TransConfig transConfig = new TransConfig();
			transConfig.setTransMode(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.TransMode"));
			transConfig.setIsCheckReso(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.IsCheckReso"));
			transConfig.setIsCheckResoFail(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.IsCheckResoFail"));
			transConfig.setIsCheckVideoBitrate(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.IsCheckVideoBitrate"));
			transConfig.setIsCheckAudioBitrate(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.IsCheckAudioBitrate"));
			transConfig.setAdjDarMethod(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].TransConfig.AdjDarMethod"));
			template.setTransConfig(transConfig);

			MuxConfig muxConfig = new MuxConfig();

			Segment segment = new Segment();
			segment.setDuration(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);

			Gif gif = new Gif();
			gif.setLoop(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Gif.Loop"));
			gif.setFinalDelay(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Gif.FinalDelay"));
			gif.setIsCustomPalette(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Gif.IsCustomPalette"));
			gif.setDitherMode(context.stringValue("QueryTemplateListResponse.TemplateList["+ i +"].MuxConfig.Gif.DitherMode"));
			muxConfig.setGif(gif);
			template.setMuxConfig(muxConfig);

			templateList.add(template);
		}
		queryTemplateListResponse.setTemplateList(templateList);
	 
	 	return queryTemplateListResponse;
	}
}