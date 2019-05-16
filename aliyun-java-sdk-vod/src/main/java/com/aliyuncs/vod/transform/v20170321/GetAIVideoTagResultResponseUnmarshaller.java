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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetAIVideoTagResultResponse;
import com.aliyuncs.vod.model.v20170321.GetAIVideoTagResultResponse.VideoTagResult;
import com.aliyuncs.vod.model.v20170321.GetAIVideoTagResultResponse.VideoTagResult.CategoryItem;
import com.aliyuncs.vod.model.v20170321.GetAIVideoTagResultResponse.VideoTagResult.KeywordItem;
import com.aliyuncs.vod.model.v20170321.GetAIVideoTagResultResponse.VideoTagResult.LocationItem;
import com.aliyuncs.vod.model.v20170321.GetAIVideoTagResultResponse.VideoTagResult.PersonItem;
import com.aliyuncs.vod.model.v20170321.GetAIVideoTagResultResponse.VideoTagResult.TimeItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAIVideoTagResultResponseUnmarshaller {

	public static GetAIVideoTagResultResponse unmarshall(GetAIVideoTagResultResponse getAIVideoTagResultResponse, UnmarshallerContext context) {
		
		getAIVideoTagResultResponse.setRequestId(context.stringValue("GetAIVideoTagResultResponse.RequestId"));

		VideoTagResult videoTagResult = new VideoTagResult();

		List<CategoryItem> category = new ArrayList<CategoryItem>();
		for (int i = 0; i < context.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Category.Length"); i++) {
			CategoryItem categoryItem = new CategoryItem();
			categoryItem.setTag(context.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Category["+ i +"].Tag"));

			category.add(categoryItem);
		}
		videoTagResult.setCategory(category);

		List<PersonItem> person = new ArrayList<PersonItem>();
		for (int i = 0; i < context.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Person.Length"); i++) {
			PersonItem personItem = new PersonItem();
			personItem.setFaceUrl(context.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Person["+ i +"].FaceUrl"));
			personItem.setTag(context.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Person["+ i +"].Tag"));

			List<String> times = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Person["+ i +"].Times.Length"); j++) {
				times.add(context.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Person["+ i +"].Times["+ j +"]"));
			}
			personItem.setTimes(times);

			person.add(personItem);
		}
		videoTagResult.setPerson(person);

		List<TimeItem> time = new ArrayList<TimeItem>();
		for (int i = 0; i < context.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Time.Length"); i++) {
			TimeItem timeItem = new TimeItem();
			timeItem.setTag(context.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Time["+ i +"].Tag"));

			List<String> times1 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Time["+ i +"].Times.Length"); j++) {
				times1.add(context.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Time["+ i +"].Times["+ j +"]"));
			}
			timeItem.setTimes1(times1);

			time.add(timeItem);
		}
		videoTagResult.setTime(time);

		List<LocationItem> location = new ArrayList<LocationItem>();
		for (int i = 0; i < context.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Location.Length"); i++) {
			LocationItem locationItem = new LocationItem();
			locationItem.setTag(context.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Location["+ i +"].Tag"));

			List<String> times2 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Location["+ i +"].Times.Length"); j++) {
				times2.add(context.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Location["+ i +"].Times["+ j +"]"));
			}
			locationItem.setTimes2(times2);

			location.add(locationItem);
		}
		videoTagResult.setLocation(location);

		List<KeywordItem> keyword = new ArrayList<KeywordItem>();
		for (int i = 0; i < context.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Keyword.Length"); i++) {
			KeywordItem keywordItem = new KeywordItem();
			keywordItem.setTag(context.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Keyword["+ i +"].Tag"));

			List<String> times3 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Keyword["+ i +"].Times.Length"); j++) {
				times3.add(context.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Keyword["+ i +"].Times["+ j +"]"));
			}
			keywordItem.setTimes3(times3);

			keyword.add(keywordItem);
		}
		videoTagResult.setKeyword(keyword);
		getAIVideoTagResultResponse.setVideoTagResult(videoTagResult);
	 
	 	return getAIVideoTagResultResponse;
	}
}