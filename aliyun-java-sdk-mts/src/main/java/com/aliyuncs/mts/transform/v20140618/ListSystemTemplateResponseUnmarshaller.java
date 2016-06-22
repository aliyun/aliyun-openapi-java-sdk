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

import com.aliyuncs.mts.model.v20140618.ListSystemTemplateResponse;
import com.aliyuncs.mts.model.v20140618.ListSystemTemplateResponse.Template;
import com.aliyuncs.mts.model.v20140618.ListSystemTemplateResponse.Template.Audio;
import com.aliyuncs.mts.model.v20140618.ListSystemTemplateResponse.Template.Container;
import com.aliyuncs.mts.model.v20140618.ListSystemTemplateResponse.Template.MuxConfig;
import com.aliyuncs.mts.model.v20140618.ListSystemTemplateResponse.Template.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.ListSystemTemplateResponse.Template.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.ListSystemTemplateResponse.Template.TransConfig;
import com.aliyuncs.mts.model.v20140618.ListSystemTemplateResponse.Template.Video;
import com.aliyuncs.mts.model.v20140618.ListSystemTemplateResponse.Template.Video.BitrateBnd;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSystemTemplateResponseUnmarshaller {

	public static ListSystemTemplateResponse unmarshall(ListSystemTemplateResponse listSystemTemplateResponse, UnmarshallerContext context) {
		
		listSystemTemplateResponse.setRequestId(context.stringValue("ListSystemTemplateResponse.RequestId"));

		List<String> nonExistTids = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListSystemTemplateResponse.NonExistTids.Length"); i++) {
			nonExistTids.add(context.stringValue("ListSystemTemplateResponse.NonExistTids["+ i +"]"));
		}
		listSystemTemplateResponse.setNonExistTids(nonExistTids);

		List<Template> templateList = new ArrayList<Template>();
		for (int i = 0; i < context.lengthValue("ListSystemTemplateResponse.TemplateList.Length"); i++) {
			Template template = new Template();
			template.setId(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Id"));
			template.setName(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Name"));
			template.setState(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].State"));

			Container container = new Container();
			container.setFormat(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Container.Format"));
			template.setContainer(container);

			Video video = new Video();
			video.setCodec(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.Codec"));
			video.setProfile(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.Profile"));
			video.setBitrate(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.Bitrate"));
			video.setCrf(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.Crf"));
			video.setWidth(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.Width"));
			video.setHeight(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.Height"));
			video.setFps(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.Fps"));
			video.setGop(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.Gop"));
			video.setPreset(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.Preset"));
			video.setScanMode(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.ScanMode"));
			video.setBufsize(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.Bufsize"));
			video.setMaxrate(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.Maxrate"));
			video.setPixFmt(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.PixFmt"));
			video.setDegrain(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.Degrain"));
			video.setQscale(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.Qscale"));
			video.setRemove(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.Remove"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.BitrateBnd.Max"));
			bitrateBnd.setMin(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			template.setVideo(video);

			Audio audio = new Audio();
			audio.setCodec(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Audio.Codec"));
			audio.setProfile(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Audio.Profile"));
			audio.setSamplerate(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Audio.Samplerate"));
			audio.setBitrate(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Audio.Bitrate"));
			audio.setChannels(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Audio.Channels"));
			audio.setQscale(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Audio.Qscale"));
			audio.setRemove(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].Audio.Remove"));
			template.setAudio(audio);

			TransConfig transConfig = new TransConfig();
			transConfig.setTransMode(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].TransConfig.TransMode"));
			template.setTransConfig(transConfig);

			MuxConfig muxConfig = new MuxConfig();

			Segment segment = new Segment();
			segment.setDuration(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);

			Gif gif = new Gif();
			gif.setLoop(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].MuxConfig.Gif.Loop"));
			gif.setFinalDelay(context.stringValue("ListSystemTemplateResponse.TemplateList["+ i +"].MuxConfig.Gif.FinalDelay"));
			muxConfig.setGif(gif);
			template.setMuxConfig(muxConfig);

			templateList.add(template);
		}
		listSystemTemplateResponse.setTemplateList(templateList);
	 
	 	return listSystemTemplateResponse;
	}
}