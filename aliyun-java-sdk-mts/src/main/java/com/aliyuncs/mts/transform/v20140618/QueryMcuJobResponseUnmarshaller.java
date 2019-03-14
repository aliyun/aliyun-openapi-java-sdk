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
import com.aliyuncs.mts.model.v20140618.QueryMcuJobResponse.Job.Tag;
import com.aliyuncs.mts.model.v20140618.QueryMcuJobResponse.Job.Tag.FrameTagInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMcuJobResponseUnmarshaller {

	public static QueryMcuJobResponse unmarshall(QueryMcuJobResponse queryMcuJobResponse, UnmarshallerContext context) {
		
		queryMcuJobResponse.setRequestId(context.stringValue("QueryMcuJobResponse.RequestId"));

		List<String> nonExistJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryMcuJobResponse.NonExistJobIds.Length"); i++) {
			nonExistJobIds.add(context.stringValue("QueryMcuJobResponse.NonExistJobIds["+ i +"]"));
		}
		queryMcuJobResponse.setNonExistJobIds(nonExistJobIds);

		List<Job> jobResult = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("QueryMcuJobResponse.JobResult.Length"); i++) {
			Job job = new Job();
			job.setJobId(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].JobId"));
			job.setUserData(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].UserData"));
			job.setTemplateId(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].TemplateId"));
			job.setTemplate(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].Template"));

			Input input = new Input();
			input.setBucket(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].Input.Bucket"));
			input.setLocation(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].Input.Location"));
			input.setObject(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].Input.Object"));
			job.setInput(input);

			AsrResult asrResult = new AsrResult();
			asrResult.setDuration(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].AsrResult.Duration"));

			List<AsrText> asrTextList = new ArrayList<AsrText>();
			for (int j = 0; j < context.lengthValue("QueryMcuJobResponse.JobResult["+ i +"].AsrResult.AsrTextList.Length"); j++) {
				AsrText asrText = new AsrText();
				asrText.setStartTime(context.integerValue("QueryMcuJobResponse.JobResult["+ i +"].AsrResult.AsrTextList["+ j +"].StartTime"));
				asrText.setEndTime(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].AsrResult.AsrTextList["+ j +"].EndTime"));
				asrText.setChannelId(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].AsrResult.AsrTextList["+ j +"].ChannelId"));
				asrText.setSpeechRate(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].AsrResult.AsrTextList["+ j +"].SpeechRate"));
				asrText.setText(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].AsrResult.AsrTextList["+ j +"].Text"));

				asrTextList.add(asrText);
			}
			asrResult.setAsrTextList(asrTextList);
			job.setAsrResult(asrResult);

			CategoryResult categoryResult = new CategoryResult();
			categoryResult.setDetails(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].CategoryResult.Details"));

			List<Category> categories = new ArrayList<Category>();
			for (int j = 0; j < context.lengthValue("QueryMcuJobResponse.JobResult["+ i +"].CategoryResult.Categories.Length"); j++) {
				Category category = new Category();
				category.setLabel(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].CategoryResult.Categories["+ j +"].Label"));
				category.setScore(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].CategoryResult.Categories["+ j +"].Score"));

				categories.add(category);
			}
			categoryResult.setCategories(categories);
			job.setCategoryResult(categoryResult);

			List<Ocr> ocrResult = new ArrayList<Ocr>();
			for (int j = 0; j < context.lengthValue("QueryMcuJobResponse.JobResult["+ i +"].OcrResult.Length"); j++) {
				Ocr ocr = new Ocr();
				ocr.setTime(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].OcrResult["+ j +"].Time"));
				ocr.setOcrText(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].OcrResult["+ j +"].OcrText"));
				ocr.setImageUrl(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].OcrResult["+ j +"].ImageUrl"));
				ocr.setImageId(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].OcrResult["+ j +"].ImageId"));

				ocrResult.add(ocr);
			}
			job.setOcrResult(ocrResult);

			List<Tag> tagResult = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("QueryMcuJobResponse.JobResult["+ i +"].TagResult.Length"); j++) {
				Tag tag = new Tag();
				tag.setTime(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].TagResult["+ j +"].Time"));
				tag.setImageUrl(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].TagResult["+ j +"].ImageUrl"));
				tag.setImageId(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].TagResult["+ j +"].ImageId"));

				List<FrameTagInfo> frameTagInfos = new ArrayList<FrameTagInfo>();
				for (int k = 0; k < context.lengthValue("QueryMcuJobResponse.JobResult["+ i +"].TagResult["+ j +"].FrameTagInfos.Length"); k++) {
					FrameTagInfo frameTagInfo = new FrameTagInfo();
					frameTagInfo.setTag(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].TagResult["+ j +"].FrameTagInfos["+ k +"].Tag"));
					frameTagInfo.setScore(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].TagResult["+ j +"].FrameTagInfos["+ k +"].Score"));
					frameTagInfo.setCategory(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].TagResult["+ j +"].FrameTagInfos["+ k +"].Category"));

					frameTagInfos.add(frameTagInfo);
				}
				tag.setFrameTagInfos(frameTagInfos);

				tagResult.add(tag);
			}
			job.setTagResult(tagResult);

			List<Face> faceResult = new ArrayList<Face>();
			for (int j = 0; j < context.lengthValue("QueryMcuJobResponse.JobResult["+ i +"].FaceResult.Length"); j++) {
				Face face = new Face();
				face.setTime(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].FaceResult["+ j +"].Time"));
				face.setImageUrl(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].FaceResult["+ j +"].ImageUrl"));
				face.setImageId(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].FaceResult["+ j +"].ImageId"));

				List<Celebrity> celebrities = new ArrayList<Celebrity>();
				for (int k = 0; k < context.lengthValue("QueryMcuJobResponse.JobResult["+ i +"].FaceResult["+ j +"].Celebrities.Length"); k++) {
					Celebrity celebrity = new Celebrity();
					celebrity.setName(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].FaceResult["+ j +"].Celebrities["+ k +"].Name"));
					celebrity.setScore(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].FaceResult["+ j +"].Celebrities["+ k +"].Score"));
					celebrity.setTarget(context.stringValue("QueryMcuJobResponse.JobResult["+ i +"].FaceResult["+ j +"].Celebrities["+ k +"].Target"));

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