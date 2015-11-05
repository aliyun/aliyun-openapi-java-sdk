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

	public static SearchTemplateResponse unmarshall(SearchTemplateResponse searchTemplateResponse, UnmarshallerContext context) {
		
		searchTemplateResponse.setRequestId(context.stringValue("SearchTemplateResponse.RequestId"));
		searchTemplateResponse.setTotalCount(context.longValue("SearchTemplateResponse.TotalCount"));
		searchTemplateResponse.setPageNumber(context.longValue("SearchTemplateResponse.PageNumber"));
		searchTemplateResponse.setPageSize(context.longValue("SearchTemplateResponse.PageSize"));

		List<Template> templateList = new ArrayList<Template>();
		for (int i = 0; i < context.lengthValue("SearchTemplateResponse.TemplateList.Length"); i++) {
			Template template = new Template();
			template.setId(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Id"));
			template.setName(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Name"));
			template.setState(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].State"));

			Container container = new Container();
			container.setFormat(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Container.Format"));
			template.setContainer(container);

			Video video = new Video();
			video.setCodec(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Codec"));
			video.setProfile(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Profile"));
			video.setBitrate(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Bitrate"));
			video.setCrf(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Crf"));
			video.setWidth(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Width"));
			video.setHeight(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Height"));
			video.setFps(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Fps"));
			video.setGop(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Gop"));
			video.setPreset(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Preset"));
			video.setScanMode(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.ScanMode"));
			video.setBufsize(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Bufsize"));
			video.setMaxrate(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Maxrate"));
			video.setPixFmt(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.PixFmt"));
			video.setDegrain(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Degrain"));
			video.setQscale(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Qscale"));
			video.setRemove(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.Remove"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.BitrateBnd.Max"));
			bitrateBnd.setMin(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			template.setVideo(video);

			Audio audio = new Audio();
			audio.setCodec(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Audio.Codec"));
			audio.setProfile(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Audio.Profile"));
			audio.setSamplerate(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Audio.Samplerate"));
			audio.setBitrate(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Audio.Bitrate"));
			audio.setChannels(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Audio.Channels"));
			audio.setQscale(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Audio.Qscale"));
			audio.setRemove(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].Audio.Remove"));
			template.setAudio(audio);

			TransConfig transConfig = new TransConfig();
			transConfig.setTransMode(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].TransConfig.TransMode"));
			template.setTransConfig(transConfig);

			MuxConfig muxConfig = new MuxConfig();

			Segment segment = new Segment();
			segment.setDuration(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);

			Gif gif = new Gif();
			gif.setLoop(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].MuxConfig.Gif.Loop"));
			gif.setFinalDelay(context.stringValue("SearchTemplateResponse.TemplateList["+ i +"].MuxConfig.Gif.FinalDelay"));
			muxConfig.setGif(gif);
			template.setMuxConfig(muxConfig);

			templateList.add(template);
		}
		searchTemplateResponse.setTemplateList(templateList);
	 
	 	return searchTemplateResponse;
	}
}