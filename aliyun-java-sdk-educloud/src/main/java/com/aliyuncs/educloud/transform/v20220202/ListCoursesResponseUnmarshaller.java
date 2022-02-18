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

import com.aliyuncs.educloud.model.v20220202.ListCoursesResponse;
import com.aliyuncs.educloud.model.v20220202.ListCoursesResponse.Data;
import com.aliyuncs.educloud.model.v20220202.ListCoursesResponse.Data.Course;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCoursesResponseUnmarshaller {

	public static ListCoursesResponse unmarshall(ListCoursesResponse listCoursesResponse, UnmarshallerContext _ctx) {
		
		listCoursesResponse.setRequestId(_ctx.stringValue("ListCoursesResponse.RequestId"));
		listCoursesResponse.setSuccess(_ctx.booleanValue("ListCoursesResponse.Success"));
		listCoursesResponse.setCode(_ctx.longValue("ListCoursesResponse.Code"));
		listCoursesResponse.setMessage(_ctx.stringValue("ListCoursesResponse.Message"));

		Data data = new Data();
		data.setPage(_ctx.longValue("ListCoursesResponse.Data.Page"));
		data.setPageSize(_ctx.longValue("ListCoursesResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListCoursesResponse.Data.Total"));

		List<Course> list = new ArrayList<Course>();
		for (int i = 0; i < _ctx.lengthValue("ListCoursesResponse.Data.List.Length"); i++) {
			Course course = new Course();
			course.setCourseId(_ctx.stringValue("ListCoursesResponse.Data.List["+ i +"].CourseId"));
			course.setTitle(_ctx.stringValue("ListCoursesResponse.Data.List["+ i +"].Title"));
			course.setIntroduce(_ctx.stringValue("ListCoursesResponse.Data.List["+ i +"].Introduce"));
			course.setPictureUrl(_ctx.stringValue("ListCoursesResponse.Data.List["+ i +"].PictureUrl"));
			course.setCategory(_ctx.stringValue("ListCoursesResponse.Data.List["+ i +"].Category"));
			course.setTags(_ctx.stringValue("ListCoursesResponse.Data.List["+ i +"].Tags"));
			course.setLessonNum(_ctx.longValue("ListCoursesResponse.Data.List["+ i +"].LessonNum"));

			list.add(course);
		}
		data.setList(list);
		listCoursesResponse.setData(data);
	 
	 	return listCoursesResponse;
	}
}