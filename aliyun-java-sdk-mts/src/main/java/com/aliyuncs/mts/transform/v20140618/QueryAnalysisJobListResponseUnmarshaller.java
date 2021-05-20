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

import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.AnalysisConfig;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.AnalysisConfig.PropertiesControl;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.AnalysisConfig.PropertiesControl.Crop;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.AnalysisConfig.QualityControl;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.InputFile;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template.Audio;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template.Container;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template.MuxConfig;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template.MuxConfig.Gif;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template.MuxConfig.Segment;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template.TransConfig;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template.Video;
import com.aliyuncs.mts.model.v20140618.QueryAnalysisJobListResponse.AnalysisJob.Template.Video.BitrateBnd;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAnalysisJobListResponseUnmarshaller {

	public static QueryAnalysisJobListResponse unmarshall(QueryAnalysisJobListResponse queryAnalysisJobListResponse, UnmarshallerContext _ctx) {
		
		queryAnalysisJobListResponse.setRequestId(_ctx.stringValue("QueryAnalysisJobListResponse.RequestId"));

		List<String> nonExistAnalysisJobIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryAnalysisJobListResponse.NonExistAnalysisJobIds.Length"); i++) {
			nonExistAnalysisJobIds.add(_ctx.stringValue("QueryAnalysisJobListResponse.NonExistAnalysisJobIds["+ i +"]"));
		}
		queryAnalysisJobListResponse.setNonExistAnalysisJobIds(nonExistAnalysisJobIds);

		List<AnalysisJob> analysisJobList = new ArrayList<AnalysisJob>();
		for (int i = 0; i < _ctx.lengthValue("QueryAnalysisJobListResponse.AnalysisJobList.Length"); i++) {
			AnalysisJob analysisJob = new AnalysisJob();
			analysisJob.setCreationTime(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].CreationTime"));
			analysisJob.setPercent(_ctx.longValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].Percent"));
			analysisJob.setState(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].State"));
			analysisJob.setMessage(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].Message"));
			analysisJob.setPriority(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].Priority"));
			analysisJob.setUserData(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].UserData"));
			analysisJob.setCode(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].Code"));
			analysisJob.setPipelineId(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].PipelineId"));
			analysisJob.setId(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].Id"));

			AnalysisConfig analysisConfig = new AnalysisConfig();

			QualityControl qualityControl = new QualityControl();
			qualityControl.setMethodStreaming(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].AnalysisConfig.QualityControl.MethodStreaming"));
			qualityControl.setRateQuality(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].AnalysisConfig.QualityControl.RateQuality"));
			analysisConfig.setQualityControl(qualityControl);

			PropertiesControl propertiesControl = new PropertiesControl();
			propertiesControl.setDeinterlace(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].AnalysisConfig.PropertiesControl.Deinterlace"));

			Crop crop = new Crop();
			crop.setTop(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].AnalysisConfig.PropertiesControl.Crop.Top"));
			crop.setWidth(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].AnalysisConfig.PropertiesControl.Crop.Width"));
			crop.setHeight(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].AnalysisConfig.PropertiesControl.Crop.Height"));
			crop.setLeft(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].AnalysisConfig.PropertiesControl.Crop.Left"));
			crop.setMode(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].AnalysisConfig.PropertiesControl.Crop.Mode"));
			propertiesControl.setCrop(crop);
			analysisConfig.setPropertiesControl(propertiesControl);
			analysisJob.setAnalysisConfig(analysisConfig);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].MNSMessageResult.ErrorCode"));
			analysisJob.setMNSMessageResult(mNSMessageResult);

			InputFile inputFile = new InputFile();
			inputFile.setObject(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].InputFile.Object"));
			inputFile.setLocation(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].InputFile.Location"));
			inputFile.setBucket(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].InputFile.Bucket"));
			analysisJob.setInputFile(inputFile);

			List<Template> templateList = new ArrayList<Template>();
			for (int j = 0; j < _ctx.lengthValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList.Length"); j++) {
				Template template = new Template();
				template.setState(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].State"));
				template.setName(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Name"));
				template.setId(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Id"));

				Video video = new Video();
				video.setBufsize(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Bufsize"));
				video.setDegrain(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Degrain"));
				video.setPixFmt(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.PixFmt"));
				video.setCodec(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Codec"));
				video.setHeight(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Height"));
				video.setQscale(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Qscale"));
				video.setBitrate(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Bitrate"));
				video.setMaxrate(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Maxrate"));
				video.setProfile(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Profile"));
				video.setCrf(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Crf"));
				video.setGop(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Gop"));
				video.setWidth(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Width"));
				video.setFps(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Fps"));
				video.setPreset(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.Preset"));
				video.setScanMode(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.ScanMode"));

				BitrateBnd bitrateBnd = new BitrateBnd();
				bitrateBnd.setMax(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.BitrateBnd.Max"));
				bitrateBnd.setMin(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Video.BitrateBnd.Min"));
				video.setBitrateBnd(bitrateBnd);
				template.setVideo(video);

				TransConfig transConfig = new TransConfig();
				transConfig.setTransMode(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].TransConfig.TransMode"));
				template.setTransConfig(transConfig);

				MuxConfig muxConfig = new MuxConfig();

				Gif gif = new Gif();
				gif.setFinalDelay(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].MuxConfig.Gif.FinalDelay"));
				gif.setLoop(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].MuxConfig.Gif.Loop"));
				muxConfig.setGif(gif);

				Segment segment = new Segment();
				segment.setDuration(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].MuxConfig.Segment.Duration"));
				muxConfig.setSegment(segment);
				template.setMuxConfig(muxConfig);

				Audio audio = new Audio();
				audio.setProfile(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Audio.Profile"));
				audio.setCodec(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Audio.Codec"));
				audio.setSamplerate(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Audio.Samplerate"));
				audio.setQscale(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Audio.Qscale"));
				audio.setChannels(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Audio.Channels"));
				audio.setBitrate(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Audio.Bitrate"));
				template.setAudio(audio);

				Container container = new Container();
				container.setFormat(_ctx.stringValue("QueryAnalysisJobListResponse.AnalysisJobList["+ i +"].TemplateList["+ j +"].Container.Format"));
				template.setContainer(container);

				templateList.add(template);
			}
			analysisJob.setTemplateList(templateList);

			analysisJobList.add(analysisJob);
		}
		queryAnalysisJobListResponse.setAnalysisJobList(analysisJobList);
	 
	 	return queryAnalysisJobListResponse;
	}
}