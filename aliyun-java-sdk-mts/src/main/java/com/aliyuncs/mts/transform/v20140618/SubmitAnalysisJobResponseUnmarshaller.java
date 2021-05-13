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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.PropertiesControl;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.PropertiesControl.Crop;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.QualityControl;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.InputFile;
import com.aliyuncs.mts.model.v20140618.SubmitAnalysisJobResponse.AnalysisJob.MNSMessageResult;
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

	public static SubmitAnalysisJobResponse unmarshall(SubmitAnalysisJobResponse submitAnalysisJobResponse, UnmarshallerContext _ctx) {
		
		submitAnalysisJobResponse.setRequestId(_ctx.stringValue("SubmitAnalysisJobResponse.RequestId"));

		AnalysisJob analysisJob = new AnalysisJob();
		analysisJob.setCreationTime(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.CreationTime"));
		analysisJob.setPercent(_ctx.longValue("SubmitAnalysisJobResponse.AnalysisJob.Percent"));
		analysisJob.setState(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.State"));
		analysisJob.setMessage(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.Message"));
		analysisJob.setPriority(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.Priority"));
		analysisJob.setUserData(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.UserData"));
		analysisJob.setCode(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.Code"));
		analysisJob.setPipelineId(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.PipelineId"));
		analysisJob.setId(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.Id"));

		AnalysisConfig analysisConfig = new AnalysisConfig();

		QualityControl qualityControl = new QualityControl();
		qualityControl.setMethodStreaming(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.QualityControl.MethodStreaming"));
		qualityControl.setRateQuality(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.QualityControl.RateQuality"));
		analysisConfig.setQualityControl(qualityControl);

		PropertiesControl propertiesControl = new PropertiesControl();
		propertiesControl.setDeinterlace(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.PropertiesControl.Deinterlace"));

		Crop crop = new Crop();
		crop.setTop(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.PropertiesControl.Crop.Top"));
		crop.setWidth(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.PropertiesControl.Crop.Width"));
		crop.setHeight(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.PropertiesControl.Crop.Height"));
		crop.setLeft(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.PropertiesControl.Crop.Left"));
		crop.setMode(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.AnalysisConfig.PropertiesControl.Crop.Mode"));
		propertiesControl.setCrop(crop);
		analysisConfig.setPropertiesControl(propertiesControl);
		analysisJob.setAnalysisConfig(analysisConfig);

		MNSMessageResult mNSMessageResult = new MNSMessageResult();
		mNSMessageResult.setMessageId(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.MNSMessageResult.MessageId"));
		mNSMessageResult.setErrorMessage(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.MNSMessageResult.ErrorMessage"));
		mNSMessageResult.setErrorCode(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.MNSMessageResult.ErrorCode"));
		analysisJob.setMNSMessageResult(mNSMessageResult);

		InputFile inputFile = new InputFile();
		inputFile.setObject(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.InputFile.Object"));
		inputFile.setLocation(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.InputFile.Location"));
		inputFile.setBucket(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.InputFile.Bucket"));
		analysisJob.setInputFile(inputFile);

		List<Template> templateList = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList.Length"); i++) {
			Template template = new Template();
			template.setState(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].State"));
			template.setName(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Name"));
			template.setId(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Id"));

			Video video = new Video();
			video.setBufsize(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Bufsize"));
			video.setDegrain(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Degrain"));
			video.setPixFmt(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.PixFmt"));
			video.setCodec(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Codec"));
			video.setHeight(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Height"));
			video.setQscale(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Qscale"));
			video.setBitrate(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Bitrate"));
			video.setMaxrate(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Maxrate"));
			video.setProfile(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Profile"));
			video.setCrf(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Crf"));
			video.setGop(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Gop"));
			video.setWidth(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Width"));
			video.setFps(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Fps"));
			video.setPreset(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.Preset"));
			video.setScanMode(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.ScanMode"));

			BitrateBnd bitrateBnd = new BitrateBnd();
			bitrateBnd.setMax(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.BitrateBnd.Max"));
			bitrateBnd.setMin(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Video.BitrateBnd.Min"));
			video.setBitrateBnd(bitrateBnd);
			template.setVideo(video);

			TransConfig transConfig = new TransConfig();
			transConfig.setTransMode(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].TransConfig.TransMode"));
			template.setTransConfig(transConfig);

			MuxConfig muxConfig = new MuxConfig();

			Gif gif = new Gif();
			gif.setFinalDelay(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].MuxConfig.Gif.FinalDelay"));
			gif.setLoop(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].MuxConfig.Gif.Loop"));
			muxConfig.setGif(gif);

			Segment segment = new Segment();
			segment.setDuration(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].MuxConfig.Segment.Duration"));
			muxConfig.setSegment(segment);
			template.setMuxConfig(muxConfig);

			Audio audio = new Audio();
			audio.setProfile(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Audio.Profile"));
			audio.setCodec(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Audio.Codec"));
			audio.setSamplerate(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Audio.Samplerate"));
			audio.setQscale(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Audio.Qscale"));
			audio.setChannels(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Audio.Channels"));
			audio.setBitrate(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Audio.Bitrate"));
			template.setAudio(audio);

			Container container = new Container();
			container.setFormat(_ctx.stringValue("SubmitAnalysisJobResponse.AnalysisJob.TemplateList["+ i +"].Container.Format"));
			template.setContainer(container);

			templateList.add(template);
		}
		analysisJob.setTemplateList(templateList);
		submitAnalysisJobResponse.setAnalysisJob(analysisJob);
	 
	 	return submitAnalysisJobResponse;
	}
}