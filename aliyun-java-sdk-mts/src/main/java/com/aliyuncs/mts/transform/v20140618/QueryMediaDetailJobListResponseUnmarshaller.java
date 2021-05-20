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

import com.aliyuncs.mts.model.v20140618.QueryMediaDetailJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryMediaDetailJobListResponse.Job;
import com.aliyuncs.mts.model.v20140618.QueryMediaDetailJobListResponse.Job.Input;
import com.aliyuncs.mts.model.v20140618.QueryMediaDetailJobListResponse.Job.MediaDetailConfig;
import com.aliyuncs.mts.model.v20140618.QueryMediaDetailJobListResponse.Job.MediaDetailConfig.OutputFile;
import com.aliyuncs.mts.model.v20140618.QueryMediaDetailJobListResponse.Job.MediaDetailResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaDetailJobListResponse.Job.MediaDetailResult.MediaDetailRecgResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaDetailJobListResponse.Job.MediaDetailResult.MediaDetailRecgResult.Celebrity;
import com.aliyuncs.mts.model.v20140618.QueryMediaDetailJobListResponse.Job.MediaDetailResult.MediaDetailRecgResult.Custom;
import com.aliyuncs.mts.model.v20140618.QueryMediaDetailJobListResponse.Job.MediaDetailResult.MediaDetailRecgResult.Custom.Clip;
import com.aliyuncs.mts.model.v20140618.QueryMediaDetailJobListResponse.Job.MediaDetailResult.MediaDetailRecgResult.FrameTagInfo;
import com.aliyuncs.mts.model.v20140618.QueryMediaDetailJobListResponse.Job.MediaDetailResult.MediaDetailRecgResult.Politician;
import com.aliyuncs.mts.model.v20140618.QueryMediaDetailJobListResponse.Job.MediaDetailResult.MediaDetailRecgResult.Sensitive;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMediaDetailJobListResponseUnmarshaller {

	public static QueryMediaDetailJobListResponse unmarshall(QueryMediaDetailJobListResponse queryMediaDetailJobListResponse, UnmarshallerContext _ctx) {
		
		queryMediaDetailJobListResponse.setRequestId(_ctx.stringValue("QueryMediaDetailJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryMediaDetailJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryMediaDetailJobListResponse.NonExistIds["+ i +"]"));
		}
		queryMediaDetailJobListResponse.setNonExistIds(nonExistIds);

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("QueryMediaDetailJobListResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setCreationTime(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].CreationTime"));
			job.setState(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].State"));
			job.setUserData(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].UserData"));
			job.setCode(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].Code"));
			job.setMessage(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].Message"));
			job.setPipelineId(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].PipelineId"));
			job.setId(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].Id"));

			MediaDetailResult mediaDetailResult = new MediaDetailResult();
			mediaDetailResult.setStatus(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.Status"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.Tags.Length"); j++) {
				tags.add(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.Tags["+ j +"]"));
			}
			mediaDetailResult.setTags(tags);

			List<MediaDetailRecgResult> mediaDetailRecgResults = new ArrayList<MediaDetailRecgResult>();
			for (int j = 0; j < _ctx.lengthValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults.Length"); j++) {
				MediaDetailRecgResult mediaDetailRecgResult = new MediaDetailRecgResult();
				mediaDetailRecgResult.setTime(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Time"));
				mediaDetailRecgResult.setImageUrl(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].ImageUrl"));
				mediaDetailRecgResult.setOcrText(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].OcrText"));

				List<String> frameTags = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].FrameTags.Length"); k++) {
					frameTags.add(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].FrameTags["+ k +"]"));
				}
				mediaDetailRecgResult.setFrameTags(frameTags);

				List<Sensitive> sensitives = new ArrayList<Sensitive>();
				for (int k = 0; k < _ctx.lengthValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Sensitives.Length"); k++) {
					Sensitive sensitive = new Sensitive();
					sensitive.setScore(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Sensitives["+ k +"].Score"));
					sensitive.setName(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Sensitives["+ k +"].Name"));
					sensitive.setTarget(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Sensitives["+ k +"].Target"));

					sensitives.add(sensitive);
				}
				mediaDetailRecgResult.setSensitives(sensitives);

				List<Politician> politicians = new ArrayList<Politician>();
				for (int k = 0; k < _ctx.lengthValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Politicians.Length"); k++) {
					Politician politician = new Politician();
					politician.setScore(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Politicians["+ k +"].Score"));
					politician.setName(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Politicians["+ k +"].Name"));
					politician.setTarget(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Politicians["+ k +"].Target"));

					politicians.add(politician);
				}
				mediaDetailRecgResult.setPoliticians(politicians);

				List<Custom> customs = new ArrayList<Custom>();
				for (int k = 0; k < _ctx.lengthValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Customs.Length"); k++) {
					Custom custom = new Custom();
					custom.setName(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Customs["+ k +"].Name"));

					List<Clip> clips = new ArrayList<Clip>();
					for (int l = 0; l < _ctx.lengthValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Customs["+ k +"].Clips.Length"); l++) {
						Clip clip = new Clip();
						clip.setEndTime(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Customs["+ k +"].Clips["+ l +"].EndTime"));
						clip.setMinScore(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Customs["+ k +"].Clips["+ l +"].MinScore"));
						clip.setStartTime(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Customs["+ k +"].Clips["+ l +"].StartTime"));
						clip.setAvgScore(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Customs["+ k +"].Clips["+ l +"].AvgScore"));
						clip.setMaxScore(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Customs["+ k +"].Clips["+ l +"].MaxScore"));
						clip.setEndTarget(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Customs["+ k +"].Clips["+ l +"].EndTarget"));
						clip.setStartTarget(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Customs["+ k +"].Clips["+ l +"].StartTarget"));

						clips.add(clip);
					}
					custom.setClips(clips);

					customs.add(custom);
				}
				mediaDetailRecgResult.setCustoms(customs);

				List<FrameTagInfo> frameTagInfos = new ArrayList<FrameTagInfo>();
				for (int k = 0; k < _ctx.lengthValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].FrameTagInfos.Length"); k++) {
					FrameTagInfo frameTagInfo = new FrameTagInfo();
					frameTagInfo.setScore(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].FrameTagInfos["+ k +"].Score"));
					frameTagInfo.setCategory(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].FrameTagInfos["+ k +"].Category"));
					frameTagInfo.setTag(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].FrameTagInfos["+ k +"].Tag"));

					frameTagInfos.add(frameTagInfo);
				}
				mediaDetailRecgResult.setFrameTagInfos(frameTagInfos);

				List<Celebrity> celebrities = new ArrayList<Celebrity>();
				for (int k = 0; k < _ctx.lengthValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Celebrities.Length"); k++) {
					Celebrity celebrity = new Celebrity();
					celebrity.setScore(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Celebrities["+ k +"].Score"));
					celebrity.setName(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Celebrities["+ k +"].Name"));
					celebrity.setTarget(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailResult.MediaDetailRecgResults["+ j +"].Celebrities["+ k +"].Target"));

					celebrities.add(celebrity);
				}
				mediaDetailRecgResult.setCelebrities(celebrities);

				mediaDetailRecgResults.add(mediaDetailRecgResult);
			}
			mediaDetailResult.setMediaDetailRecgResults(mediaDetailRecgResults);
			job.setMediaDetailResult(mediaDetailResult);

			MediaDetailConfig mediaDetailConfig = new MediaDetailConfig();
			mediaDetailConfig.setScenario(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailConfig.Scenario"));
			mediaDetailConfig.setDetailType(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailConfig.DetailType"));

			OutputFile outputFile = new OutputFile();
			outputFile.setObject(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailConfig.OutputFile.Object"));
			outputFile.setLocation(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailConfig.OutputFile.Location"));
			outputFile.setBucket(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].MediaDetailConfig.OutputFile.Bucket"));
			mediaDetailConfig.setOutputFile(outputFile);
			job.setMediaDetailConfig(mediaDetailConfig);

			Input input = new Input();
			input.setObject(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].Input.Object"));
			input.setLocation(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].Input.Location"));
			input.setBucket(_ctx.stringValue("QueryMediaDetailJobListResponse.JobList["+ i +"].Input.Bucket"));
			job.setInput(input);

			jobList.add(job);
		}
		queryMediaDetailJobListResponse.setJobList(jobList);
	 
	 	return queryMediaDetailJobListResponse;
	}
}