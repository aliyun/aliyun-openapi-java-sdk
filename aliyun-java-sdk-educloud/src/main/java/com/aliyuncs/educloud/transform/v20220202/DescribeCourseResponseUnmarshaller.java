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

package com.aliyuncs.educloud.transform.v20220202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.educloud.model.v20220202.DescribeCourseResponse;
import com.aliyuncs.educloud.model.v20220202.DescribeCourseResponse.Data;
import com.aliyuncs.educloud.model.v20220202.DescribeCourseResponse.Data.ChapterItem;
import com.aliyuncs.educloud.model.v20220202.DescribeCourseResponse.Data.ChapterItem.Lesson2;
import com.aliyuncs.educloud.model.v20220202.DescribeCourseResponse.Data.ChapterItem.UnitItem;
import com.aliyuncs.educloud.model.v20220202.DescribeCourseResponse.Data.ChapterItem.UnitItem.Lesson4;
import com.aliyuncs.educloud.model.v20220202.DescribeCourseResponse.Data.Lesson;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCourseResponseUnmarshaller {

	public static DescribeCourseResponse unmarshall(DescribeCourseResponse describeCourseResponse, UnmarshallerContext _ctx) {
		
		describeCourseResponse.setRequestId(_ctx.stringValue("DescribeCourseResponse.RequestId"));
		describeCourseResponse.setSuccess(_ctx.booleanValue("DescribeCourseResponse.Success"));
		describeCourseResponse.setCode(_ctx.longValue("DescribeCourseResponse.Code"));
		describeCourseResponse.setMessage(_ctx.stringValue("DescribeCourseResponse.Message"));

		Data data = new Data();
		data.setCourseId(_ctx.stringValue("DescribeCourseResponse.Data.CourseId"));
		data.setTitle(_ctx.stringValue("DescribeCourseResponse.Data.Title"));
		data.setIntroduce(_ctx.stringValue("DescribeCourseResponse.Data.Introduce"));
		data.setPictureUrl(_ctx.stringValue("DescribeCourseResponse.Data.PictureUrl"));
		data.setCategory(_ctx.stringValue("DescribeCourseResponse.Data.Category"));
		data.setTags(_ctx.stringValue("DescribeCourseResponse.Data.Tags"));
		data.setLessonNum(_ctx.longValue("DescribeCourseResponse.Data.LessonNum"));

		List<Lesson> lessons = new ArrayList<Lesson>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCourseResponse.Data.Lessons.Length"); i++) {
			Lesson lesson = new Lesson();
			lesson.setLessonId(_ctx.stringValue("DescribeCourseResponse.Data.Lessons["+ i +"].LessonId"));
			lesson.setTitle(_ctx.stringValue("DescribeCourseResponse.Data.Lessons["+ i +"].Title"));
			lesson.setType(_ctx.stringValue("DescribeCourseResponse.Data.Lessons["+ i +"].Type"));
			lesson.setDuration(_ctx.longValue("DescribeCourseResponse.Data.Lessons["+ i +"].Duration"));

			lessons.add(lesson);
		}
		data.setLessons(lessons);

		List<ChapterItem> chapter = new ArrayList<ChapterItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCourseResponse.Data.Chapter.Length"); i++) {
			ChapterItem chapterItem = new ChapterItem();
			chapterItem.setNumber(_ctx.longValue("DescribeCourseResponse.Data.Chapter["+ i +"].Number"));
			chapterItem.setTitle(_ctx.stringValue("DescribeCourseResponse.Data.Chapter["+ i +"].Title"));

			List<Lesson2> lessons1 = new ArrayList<Lesson2>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCourseResponse.Data.Chapter["+ i +"].Lessons.Length"); j++) {
				Lesson2 lesson2 = new Lesson2();
				lesson2.setLessonId(_ctx.stringValue("DescribeCourseResponse.Data.Chapter["+ i +"].Lessons["+ j +"].LessonId"));
				lesson2.setTitle(_ctx.stringValue("DescribeCourseResponse.Data.Chapter["+ i +"].Lessons["+ j +"].Title"));
				lesson2.setType(_ctx.stringValue("DescribeCourseResponse.Data.Chapter["+ i +"].Lessons["+ j +"].Type"));
				lesson2.setDuration(_ctx.longValue("DescribeCourseResponse.Data.Chapter["+ i +"].Lessons["+ j +"].Duration"));

				lessons1.add(lesson2);
			}
			chapterItem.setLessons1(lessons1);

			List<UnitItem> unit = new ArrayList<UnitItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCourseResponse.Data.Chapter["+ i +"].Unit.Length"); j++) {
				UnitItem unitItem = new UnitItem();
				unitItem.setNumber(_ctx.longValue("DescribeCourseResponse.Data.Chapter["+ i +"].Unit["+ j +"].Number"));
				unitItem.setTitle(_ctx.stringValue("DescribeCourseResponse.Data.Chapter["+ i +"].Unit["+ j +"].Title"));

				List<Lesson4> lessons3 = new ArrayList<Lesson4>();
				for (int k = 0; k < _ctx.lengthValue("DescribeCourseResponse.Data.Chapter["+ i +"].Unit["+ j +"].Lessons.Length"); k++) {
					Lesson4 lesson4 = new Lesson4();
					lesson4.setLessonId(_ctx.stringValue("DescribeCourseResponse.Data.Chapter["+ i +"].Unit["+ j +"].Lessons["+ k +"].LessonId"));
					lesson4.setTitle(_ctx.stringValue("DescribeCourseResponse.Data.Chapter["+ i +"].Unit["+ j +"].Lessons["+ k +"].Title"));
					lesson4.setType(_ctx.stringValue("DescribeCourseResponse.Data.Chapter["+ i +"].Unit["+ j +"].Lessons["+ k +"].Type"));
					lesson4.setDuration(_ctx.longValue("DescribeCourseResponse.Data.Chapter["+ i +"].Unit["+ j +"].Lessons["+ k +"].Duration"));

					lessons3.add(lesson4);
				}
				unitItem.setLessons3(lessons3);

				unit.add(unitItem);
			}
			chapterItem.setUnit(unit);

			chapter.add(chapterItem);
		}
		data.setChapter(chapter);
		describeCourseResponse.setData(data);
	 
	 	return describeCourseResponse;
	}
}