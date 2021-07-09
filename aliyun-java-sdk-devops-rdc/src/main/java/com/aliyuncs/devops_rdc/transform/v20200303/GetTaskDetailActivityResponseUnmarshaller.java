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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailActivityResponse;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailActivityResponse.Activity;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskDetailActivityResponseUnmarshaller {

	public static GetTaskDetailActivityResponse unmarshall(GetTaskDetailActivityResponse getTaskDetailActivityResponse, UnmarshallerContext _ctx) {
		
		getTaskDetailActivityResponse.setRequestId(_ctx.stringValue("GetTaskDetailActivityResponse.RequestId"));
		getTaskDetailActivityResponse.setHttpStatusCode(_ctx.integerValue("GetTaskDetailActivityResponse.HttpStatusCode"));
		getTaskDetailActivityResponse.setErrorMsg(_ctx.stringValue("GetTaskDetailActivityResponse.ErrorMsg"));
		getTaskDetailActivityResponse.setSuccessful(_ctx.booleanValue("GetTaskDetailActivityResponse.Successful"));
		getTaskDetailActivityResponse.setErrorCode(_ctx.stringValue("GetTaskDetailActivityResponse.ErrorCode"));

		List<Activity> object = new ArrayList<Activity>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskDetailActivityResponse.Object.Length"); i++) {
			Activity activity = new Activity();
			activity.setUpdated(_ctx.stringValue("GetTaskDetailActivityResponse.Object["+ i +"].Updated"));
			activity.setAction(_ctx.stringValue("GetTaskDetailActivityResponse.Object["+ i +"].Action"));
			activity.setTitle(_ctx.stringValue("GetTaskDetailActivityResponse.Object["+ i +"].Title"));
			activity.setCreated(_ctx.stringValue("GetTaskDetailActivityResponse.Object["+ i +"].Created"));
			activity.setContent(_ctx.mapValue("GetTaskDetailActivityResponse.Object["+ i +"].Content"));

			object.add(activity);
		}
		getTaskDetailActivityResponse.setObject(object);
	 
	 	return getTaskDetailActivityResponse;
	}
}