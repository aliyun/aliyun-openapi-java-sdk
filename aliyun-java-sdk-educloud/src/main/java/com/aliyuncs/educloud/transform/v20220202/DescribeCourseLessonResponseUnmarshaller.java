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

import com.aliyuncs.educloud.model.v20220202.DescribeCourseLessonResponse;
import com.aliyuncs.educloud.model.v20220202.DescribeCourseLessonResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCourseLessonResponseUnmarshaller {

	public static DescribeCourseLessonResponse unmarshall(DescribeCourseLessonResponse describeCourseLessonResponse, UnmarshallerContext _ctx) {
		
		describeCourseLessonResponse.setRequestId(_ctx.stringValue("DescribeCourseLessonResponse.RequestId"));
		describeCourseLessonResponse.setSuccess(_ctx.booleanValue("DescribeCourseLessonResponse.Success"));
		describeCourseLessonResponse.setCode(_ctx.longValue("DescribeCourseLessonResponse.Code"));
		describeCourseLessonResponse.setMessage(_ctx.stringValue("DescribeCourseLessonResponse.Message"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("DescribeCourseLessonResponse.Data.Url"));
		data.setContent(_ctx.stringValue("DescribeCourseLessonResponse.Data.Content"));
		describeCourseLessonResponse.setData(data);
	 
	 	return describeCourseLessonResponse;
	}
}