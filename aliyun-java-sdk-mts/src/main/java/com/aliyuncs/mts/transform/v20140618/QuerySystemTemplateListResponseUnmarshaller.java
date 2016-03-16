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

import com.aliyuncs.mts.model.v20140618.QuerySystemTemplateListResponse;
import com.aliyuncs.mts.model.v20140618.QuerySystemTemplateListResponse.Template;
import com.aliyuncs.mts.model.v20140618.QuerySystemTemplateListResponse.Template.Audio;
import com.aliyuncs.mts.model.v20140618.QuerySystemTemplateListResponse.Template.Container;
import com.aliyuncs.mts.model.v20140618.QuerySystemTemplateListResponse.Template.MuxConfig;
import com.aliyuncs.mts.model.v20140618.QuerySystemTemplateListResponse.Template.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.QuerySystemTemplateListResponse.Template.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.QuerySystemTemplateListResponse.Template.TransConfig;
import com.aliyuncs.mts.model.v20140618.QuerySystemTemplateListResponse.Template.Video;
import com.aliyuncs.mts.model.v20140618.QuerySystemTemplateListResponse.Template.Video.BitrateBnd;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySystemTemplateListResponseUnmarshaller {

	public static QuerySystemTemplateListResponse unmarshall(QuerySystemTemplateListResponse querySystemTemplateListResponse, UnmarshallerContext context) {
		
		querySystemTemplateListResponse.setRequestId(context.stringValue("QuerySystemTemplateListResponse.RequestId"));

		List<String> nonExistTids = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QuerySystemTemplateListResponse.NonExistTids.Length"); i++) {
			nonExistTids.add(context.stringValue("QuerySystemTemplateListResponse.NonExistTids["+ i +"]"));
		}
		querySystemTemplateListResponse.setNonExistTids(nonExistTids);

		List<Template> templateList = new ArrayList<Template>();
		for (int i = 0; i < context.lengthValue("QuerySystemTemplateListResponse.TemplateList.Length"); i++) {
			Template template = new Template();
			template.setId(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Id"));
			template.setName(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Name"));
			template.setState(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].State"));

			Container container = new Container();
			container.setFormat(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Container.Format"));
			template.setContainer(container);

			Video video = new Video();
			video.setCodec(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.Codec"));
			video.setProfile(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.Profile"));
			video.setBitrate(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.Bitrate"));
			video.setCrf(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.Crf"));
			video.setWidth(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.Width"));
			video.setHeight(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.Height"));
			video.setFps(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.Fps"));
			video.setGop(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.Gop"));
			video.setPreset(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.Preset"));
			video.setScanMode(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.ScanMode"));
			video.setBufsize(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.Bufsize"));
			video.setMaxrate(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.Maxrate"));
			video.setPixFmt(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.PixFmt"));
			video.setDegrain(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.Degrain"));
			video.setQscale(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.Qscale"));
			video.setRemove(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.Remove"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.BitrateBnd.Max"));
			bitrateBnd.setMin(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			template.setVideo(video);

			Audio audio = new Audio();
			audio.setCodec(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Audio.Codec"));
			audio.setProfile(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Audio.Profile"));
			audio.setSamplerate(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Audio.Samplerate"));
			audio.setBitrate(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Audio.Bitrate"));
			audio.setChannels(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Audio.Channels"));
			audio.setQscale(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Audio.Qscale"));
			audio.setRemove(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].Audio.Remove"));
			template.setAudio(audio);

			TransConfig transConfig = new TransConfig();
			transConfig.setTransMode(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].TransConfig.TransMode"));
			template.setTransConfig(transConfig);

			MuxConfig muxConfig = new MuxConfig();

			Segment segment = new Segment();
			segment.setDuration(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);

			Gif gif = new Gif();
			gif.setLoop(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].MuxConfig.Gif.Loop"));
			gif.setFinalDelay(context.stringValue("QuerySystemTemplateListResponse.TemplateList["+ i +"].MuxConfig.Gif.FinalDelay"));
			muxConfig.setGif(gif);
			template.setMuxConfig(muxConfig);

			templateList.add(template);
		}
		querySystemTemplateListResponse.setTemplateList(templateList);
	 
	 	return querySystemTemplateListResponse;
	}
}