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

import com.aliyuncs.mts.model.v20140618.QueryMcuJobResponse;
import com.aliyuncs.mts.model.v20140618.QueryMcuJobResponse.Job;
import com.aliyuncs.mts.model.v20140618.QueryMcuJobResponse.Job.AsrResult;
import com.aliyuncs.mts.model.v20140618.QueryMcuJobResponse.Job.AsrResult.AsrText;
import com.aliyuncs.mts.model.v20140618.QueryMcuJobResponse.Job.CategoryResult;
import com.aliyuncs.mts.model.v20140618.QueryMcuJobResponse.Job.CategoryResult.Category;
import com.aliyuncs.mts.model.v20140618.QueryMcuJobResponse.Job.Face;
import com.aliyuncs.mts.model.v20140618.QueryMcuJobResponse.Job.Face.Celebrity;
import com.aliyuncs.mts.model.v20140618.QueryMcuJobResponse.Job.Input;
import com.aliyuncs.mts.model.v20140618.QueryMcuJobResponse.Job.Ocr;
import com.aliyuncs.mts.model.v20140618.QueryMcuJobResponse.Job.SubTask;
import com.aliyuncs.mts.model.v20140618.QueryMcuJobResponse.Job.Tag;
import com.aliyuncs.mts.model.v20140618.QueryMcuJobResponse.Job.Tag.FrameTagInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMcuJobResponseUnmarshaller {

	public static QueryMcuJobResponse unmarshall(QueryMcuJobResponse queryMcuJobResponse, UnmarshallerContext _ctx) {
		
		queryMcuJobResponse.setRequestId(_ctx.stringValue("QueryMcuJobResponse.RequestId"));

		List<String> nonExistJobIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryMcuJobResponse.NonExistJobIds.Length"); i++) {
			nonExistJobIds.add(_ctx.stringValue("QueryMcuJobResponse.NonExistJobIds["+ i +"]"));
		}
		queryMcuJobResponse.setNonExistJobIds(nonExistJobIds);

		List<Job> jobResult = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("QueryMcuJobResponse.JobResult.Length"); i++) {
			Job job = new Job();
			job.setJobId(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].JobId"));
			job.setTemplate(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].Template"));
			job.setUserData(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].UserData"));
			job.setTemplateId(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].TemplateId"));

			CategoryResult categoryResult = new CategoryResult();
			categoryResult.setDetails(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].CategoryResult.Details"));

			List<Category> categories = new ArrayList<Category>();
			for (int j = 0; j < _ctx.lengthValue("QueryMcuJobResponse.JobResult["+ i +"].CategoryResult.Categories.Length"); j++) {
				Category category = new Category();
				category.setScore(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].CategoryResult.Categories["+ j +"].Score"));
				category.setLabel(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].CategoryResult.Categories["+ j +"].Label"));

				categories.add(category);
			}
			categoryResult.setCategories(categories);
			job.setCategoryResult(categoryResult);

			Input input = new Input();
			input.setObject(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].Input.Object"));
			input.setLocation(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].Input.Location"));
			input.setBucket(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].Input.Bucket"));
			job.setInput(input);

			AsrResult asrResult = new AsrResult();
			asrResult.setDuration(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].AsrResult.Duration"));

			List<AsrText> asrTextList = new ArrayList<AsrText>();
			for (int j = 0; j < _ctx.lengthValue("QueryMcuJobResponse.JobResult["+ i +"].AsrResult.AsrTextList.Length"); j++) {
				AsrText asrText = new AsrText();
				asrText.setEndTime(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].AsrResult.AsrTextList["+ j +"].EndTime"));
				asrText.setStartTime(_ctx.integerValue("QueryMcuJobResponse.JobResult["+ i +"].AsrResult.AsrTextList["+ j +"].StartTime"));
				asrText.setChannelId(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].AsrResult.AsrTextList["+ j +"].ChannelId"));
				asrText.setText(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].AsrResult.AsrTextList["+ j +"].Text"));
				asrText.setSpeechRate(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].AsrResult.AsrTextList["+ j +"].SpeechRate"));

				asrTextList.add(asrText);
			}
			asrResult.setAsrTextList(asrTextList);
			job.setAsrResult(asrResult);

			List<Tag> tagResult = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("QueryMcuJobResponse.JobResult["+ i +"].TagResult.Length"); j++) {
				Tag tag = new Tag();
				tag.setTime(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].TagResult["+ j +"].Time"));
				tag.setImageUrl(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].TagResult["+ j +"].ImageUrl"));
				tag.setImageId(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].TagResult["+ j +"].ImageId"));

				List<FrameTagInfo> frameTagInfos = new ArrayList<FrameTagInfo>();
				for (int k = 0; k < _ctx.lengthValue("QueryMcuJobResponse.JobResult["+ i +"].TagResult["+ j +"].FrameTagInfos.Length"); k++) {
					FrameTagInfo frameTagInfo = new FrameTagInfo();
					frameTagInfo.setScore(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].TagResult["+ j +"].FrameTagInfos["+ k +"].Score"));
					frameTagInfo.setCategory(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].TagResult["+ j +"].FrameTagInfos["+ k +"].Category"));
					frameTagInfo.setTag(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].TagResult["+ j +"].FrameTagInfos["+ k +"].Tag"));

					frameTagInfos.add(frameTagInfo);
				}
				tag.setFrameTagInfos(frameTagInfos);

				tagResult.add(tag);
			}
			job.setTagResult(tagResult);

			List<Ocr> ocrResult = new ArrayList<Ocr>();
			for (int j = 0; j < _ctx.lengthValue("QueryMcuJobResponse.JobResult["+ i +"].OcrResult.Length"); j++) {
				Ocr ocr = new Ocr();
				ocr.setTime(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].OcrResult["+ j +"].Time"));
				ocr.setImageUrl(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].OcrResult["+ j +"].ImageUrl"));
				ocr.setOcrText(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].OcrResult["+ j +"].OcrText"));
				ocr.setImageId(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].OcrResult["+ j +"].ImageId"));

				ocrResult.add(ocr);
			}
			job.setOcrResult(ocrResult);

			List<SubTask> subTaskInfo = new ArrayList<SubTask>();
			for (int j = 0; j < _ctx.lengthValue("QueryMcuJobResponse.JobResult["+ i +"].SubTaskInfo.Length"); j++) {
				SubTask subTask = new SubTask();
				subTask.setType(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].SubTaskInfo["+ j +"].Type"));
				subTask.setCode(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].SubTaskInfo["+ j +"].Code"));
				subTask.setMessage(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].SubTaskInfo["+ j +"].Message"));

				subTaskInfo.add(subTask);
			}
			job.setSubTaskInfo(subTaskInfo);

			List<Face> faceResult = new ArrayList<Face>();
			for (int j = 0; j < _ctx.lengthValue("QueryMcuJobResponse.JobResult["+ i +"].FaceResult.Length"); j++) {
				Face face = new Face();
				face.setTime(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].FaceResult["+ j +"].Time"));
				face.setImageUrl(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].FaceResult["+ j +"].ImageUrl"));
				face.setImageId(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].FaceResult["+ j +"].ImageId"));

				List<Celebrity> celebrities = new ArrayList<Celebrity>();
				for (int k = 0; k < _ctx.lengthValue("QueryMcuJobResponse.JobResult["+ i +"].FaceResult["+ j +"].Celebrities.Length"); k++) {
					Celebrity celebrity = new Celebrity();
					celebrity.setScore(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].FaceResult["+ j +"].Celebrities["+ k +"].Score"));
					celebrity.setName(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].FaceResult["+ j +"].Celebrities["+ k +"].Name"));
					celebrity.setTarget(_ctx.stringValue("QueryMcuJobResponse.JobResult["+ i +"].FaceResult["+ j +"].Celebrities["+ k +"].Target"));

					celebrities.add(celebrity);
				}
				face.setCelebrities(celebrities);

				faceResult.add(face);
			}
			job.setFaceResult(faceResult);

			jobResult.add(job);
		}
		queryMcuJobResponse.setJobResult(jobResult);
	 
	 	return queryMcuJobResponse;
	}
}