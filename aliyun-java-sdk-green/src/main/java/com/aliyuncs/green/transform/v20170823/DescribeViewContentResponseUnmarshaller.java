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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.FaceResult;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.FaceResult.Age;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.FaceResult.Bang;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.FaceResult.Gender;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.FaceResult.Glasses;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.FaceResult.Hairstyle;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.FaceResult.Hat;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.FaceResult.Image;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.FaceResult.Location;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.FaceResult.Mustache;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.FaceResult.Quality;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.FaceResult.Respirator;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.FaceResult.Smile;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.FrameResult;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeViewContentResponseUnmarshaller {

	public static DescribeViewContentResponse unmarshall(DescribeViewContentResponse describeViewContentResponse, UnmarshallerContext _ctx) {
		
		describeViewContentResponse.setRequestId(_ctx.stringValue("DescribeViewContentResponse.RequestId"));
		describeViewContentResponse.setPageSize(_ctx.integerValue("DescribeViewContentResponse.PageSize"));
		describeViewContentResponse.setCurrentPage(_ctx.integerValue("DescribeViewContentResponse.CurrentPage"));
		describeViewContentResponse.setTotalCount(_ctx.integerValue("DescribeViewContentResponse.TotalCount"));

		List<ViewContent> viewContentList = new ArrayList<ViewContent>();
		for (int i = 0; i < _ctx.lengthValue("DescribeViewContentResponse.ViewContentList.Length"); i++) {
			ViewContent viewContent = new ViewContent();
			viewContent.setTaskId(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].TaskId"));
			viewContent.setDataId(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].DataId"));
			viewContent.setBizType(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].BizType"));
			viewContent.setContent(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Content"));
			viewContent.setUrl(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Url"));
			viewContent.setNewUrl(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].NewUrl"));
			viewContent.setThumbnail(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Thumbnail"));
			viewContent.setRequestTime(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].RequestTime"));
			viewContent.setScanFinishedTime(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].ScanFinishedTime"));
			viewContent.setSuggestion(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Suggestion"));
			viewContent.setId(_ctx.longValue("DescribeViewContentResponse.ViewContentList["+ i +"].Id"));
			viewContent.setScanResult(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].ScanResult"));

			List<Result> results = new ArrayList<Result>();
			for (int j = 0; j < _ctx.lengthValue("DescribeViewContentResponse.ViewContentList["+ i +"].Results.Length"); j++) {
				Result result = new Result();
				result.setSuggestion(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Results["+ j +"].Suggestion"));
				result.setLabel(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Results["+ j +"].Label"));
				result.setScene(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Results["+ j +"].Scene"));

				results.add(result);
			}
			viewContent.setResults(results);

			List<FrameResult> frameResults = new ArrayList<FrameResult>();
			for (int j = 0; j < _ctx.lengthValue("DescribeViewContentResponse.ViewContentList["+ i +"].FrameResults.Length"); j++) {
				FrameResult frameResult = new FrameResult();
				frameResult.setUrl(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].FrameResults["+ j +"].Url"));
				frameResult.setOffset(_ctx.integerValue("DescribeViewContentResponse.ViewContentList["+ i +"].FrameResults["+ j +"].Offset"));
				frameResult.setLabel(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].FrameResults["+ j +"].Label"));

				frameResults.add(frameResult);
			}
			viewContent.setFrameResults(frameResults);

			List<FaceResult> faceResults = new ArrayList<FaceResult>();
			for (int j = 0; j < _ctx.lengthValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults.Length"); j++) {
				FaceResult faceResult = new FaceResult();
				faceResult.setBualified(_ctx.booleanValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Bualified"));

				Location location = new Location();
				location.setX(_ctx.integerValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Location.X"));
				location.setY(_ctx.integerValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Location.Y"));
				location.setW(_ctx.integerValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Location.W"));
				location.setH(_ctx.integerValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Location.H"));
				faceResult.setLocation(location);

				Gender gender = new Gender();
				gender.setRate(_ctx.floatValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Gender.Rate"));
				gender.setValue(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Gender.Value"));
				faceResult.setGender(gender);

				Glasses glasses = new Glasses();
				glasses.setRate(_ctx.floatValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Glasses.Rate"));
				glasses.setValue(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Glasses.Value"));
				faceResult.setGlasses(glasses);

				Age age = new Age();
				age.setRate(_ctx.floatValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Age.Rate"));
				age.setValue(_ctx.integerValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Age.Value"));
				faceResult.setAge(age);

				Smile smile = new Smile();
				smile.setRate(_ctx.floatValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Smile.Rate"));
				smile.setValue(_ctx.floatValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Smile.Value"));
				faceResult.setSmile(smile);

				Quality quality = new Quality();
				quality.setBlur(_ctx.floatValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Quality.Blur"));
				quality.setPitch(_ctx.floatValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Quality.Pitch"));
				quality.setYaw(_ctx.floatValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Quality.Yaw"));
				quality.setRoll(_ctx.floatValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Quality.Roll"));
				faceResult.setQuality(quality);

				Respirator respirator = new Respirator();
				respirator.setRate(_ctx.floatValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Respirator.Rate"));
				respirator.setValue(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Respirator.Value"));
				faceResult.setRespirator(respirator);

				Hat hat = new Hat();
				hat.setRate(_ctx.floatValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Hat.Rate"));
				hat.setValue(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Hat.Value"));
				faceResult.setHat(hat);

				Mustache mustache = new Mustache();
				mustache.setRate(_ctx.floatValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Mustache.Rate"));
				mustache.setValue(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Mustache.Value"));
				faceResult.setMustache(mustache);

				Bang bang = new Bang();
				bang.setRate(_ctx.floatValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Bang.Rate"));
				bang.setValue(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Bang.Value"));
				faceResult.setBang(bang);

				Hairstyle hairstyle = new Hairstyle();
				hairstyle.setRate(_ctx.floatValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Hairstyle.Rate"));
				hairstyle.setValue(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Hairstyle.Value"));
				faceResult.setHairstyle(hairstyle);

				Image image = new Image();
				image.setWidth(_ctx.integerValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Image.Width"));
				image.setHeight(_ctx.integerValue("DescribeViewContentResponse.ViewContentList["+ i +"].FaceResults["+ j +"].Image.Height"));
				faceResult.setImage(image);

				faceResults.add(faceResult);
			}
			viewContent.setFaceResults(faceResults);

			viewContentList.add(viewContent);
		}
		describeViewContentResponse.setViewContentList(viewContentList);
	 
	 	return describeViewContentResponse;
	}
}