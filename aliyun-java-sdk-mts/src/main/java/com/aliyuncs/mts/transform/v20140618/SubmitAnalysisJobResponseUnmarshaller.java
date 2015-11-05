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

import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.PropertiesControl;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.PropertiesControl.Crop;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.QualityControl;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.InputFile;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.Template;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.Template.Audio;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.Template.Container;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.Template.MuxConfig;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.Template.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.Template.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.Template.TransConfig;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.Template.Video;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.Template.Video.BitrateBnd;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitAnalysisJobResponseUnmarshaller {

	public static SubmitAnalysisJobResponse unmarshall(SubmitAnalysisJobResponse submitAnalysisJobResponse, UnmarshallerContext context) {
		
		submitAnalysisJobResponse.setRequestId(context.stringValue("SubmitAnalysisJobResponse.RequestId"));

		AnalysisJob analysisJob = new AnalysisJob();
		analysisJob.setId(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.Id"));
		analysisJob.setUserData(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.UserData"));
		analysisJob.setState(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.State"));
		analysisJob.setCode(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.Code"));
		analysisJob.setMessage(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.Message"));
		analysisJob.setPercent(context.longValue("SubmitAnalysisJobResponse.AnalysisJob.Percent"));
		analysisJob.setCreationTime(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.CreationTime"));
		analysisJob.setPipelineId(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.PipelineId"));
		analysisJob.setPriority(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.Priority"));

		InputFile inputFile = new InputFile();
		inputFile.setBucket(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.InputFile.Bucket"));
		inputFile.setLocation(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.InputFile.Location"));
		inputFile.setObject(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.InputFile.Object"));
		analysisJob.setInputFile(inputFile);

		AnalysisConfig analysisConfig = new AnalysisConfig();

		QualityControl qualityControl = new QualityControl();
		qualityControl.setRateQuality(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.QualityControl.RateQuality"));
		qualityControl.setMethodStreaming(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.QualityControl.MethodStreaming"));
		analysisConfig.setQualityControl(qualityControl);

		PropertiesControl propertiesControl = new PropertiesControl();
		propertiesControl.setDeinterlace(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.PropertiesControl.Deinterlace"));

		Crop crop = new Crop();
		crop.setMode(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.PropertiesControl.Crop.Mode"));
		crop.setWidth(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.PropertiesControl.Crop.Width"));
		crop.setHeight(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.PropertiesControl.Crop.Height"));
		crop.setTop(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.PropertiesControl.Crop.Top"));
		crop.setLeft(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.PropertiesControl.Crop.Left"));
		propertiesControl.setCrop(crop);
		analysisConfig.setPropertiesControl(propertiesControl);
		analysisJob.setAnalysisConfig(analysisConfig);

		List<Template> templateList = new ArrayList<Template>();
		for (int i = 0; i < context.lengthValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList.Length"); i++) {
			Template template = new Template();
			template.setId(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Id"));
			template.setName(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Name"));
			template.setState(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].State"));

			Container container = new Container();
			container.setFormat(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Container.Format"));
			template.setContainer(container);

			Video video = new Video();
			video.setCodec(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Codec"));
			video.setProfile(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Profile"));
			video.setBitrate(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Bitrate"));
			video.setCrf(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Crf"));
			video.setWidth(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Width"));
			video.setHeight(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Height"));
			video.setFps(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Fps"));
			video.setGop(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Gop"));
			video.setPreset(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Preset"));
			video.setScanMode(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.ScanMode"));
			video.setBufsize(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Bufsize"));
			video.setMaxrate(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Maxrate"));
			video.setPixFmt(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.PixFmt"));
			video.setDegrain(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Degrain"));
			video.setQscale(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Qscale"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.BitrateBnd.Max"));
			bitrateBnd.setMin(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			template.setVideo(video);

			Audio audio = new Audio();
			audio.setCodec(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Audio.Codec"));
			audio.setProfile(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Audio.Profile"));
			audio.setSamplerate(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Audio.Samplerate"));
			audio.setBitrate(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Audio.Bitrate"));
			audio.setChannels(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Audio.Channels"));
			audio.setQscale(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Audio.Qscale"));
			template.setAudio(audio);

			TransConfig transConfig = new TransConfig();
			transConfig.setTransMode(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].TransConfig.TransMode"));
			template.setTransConfig(transConfig);

			MuxConfig muxConfig = new MuxConfig();

			Segment segment = new Segment();
			segment.setDuration(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);

			Gif gif = new Gif();
			gif.setLoop(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].MuxConfig.Gif.Loop"));
			gif.setFinalDelay(context.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].MuxConfig.Gif.FinalDelay"));
			muxConfig.setGif(gif);
			template.setMuxConfig(muxConfig);

			templateList.add(template);
		}
		analysisJob.setTemplateList(templateList);
		submitAnalysisJobResponse.setAnalysisJob(analysisJob);
	 
	 	return submitAnalysisJobResponse;
	}
}