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

package com.aliyuncs.educloud.model.v20220202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeCourseLessonRequest extends RpcAcsRequest<DescribeCourseLessonResponse> {
	   

	private String lessonId;
	public DescribeCourseLessonRequest() {
		super("EduCloud", "2022-02-02", "DescribeCourseLesson");
		setMethod(MethodType.GET);
	}

	public String getLessonId() {
		return this.lessonId;
	}

	public void setLessonId(String lessonId) {
		this.lessonId = lessonId;
		if(lessonId != null){
			putQueryParameter("LessonId", lessonId);
		}
	}

	@Override
	public Class<DescribeCourseLessonResponse> getResponseClass() {
		return DescribeCourseLessonResponse.class;
	}

}
