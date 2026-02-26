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

package com.aliyuncs.websitebuild.transform.v20250429;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.websitebuild.model.v20250429.GetCreateLogoTaskResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetCreateLogoTaskResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCreateLogoTaskResponseUnmarshaller {

	public static GetCreateLogoTaskResponse unmarshall(GetCreateLogoTaskResponse getCreateLogoTaskResponse, UnmarshallerContext _ctx) {
		
		getCreateLogoTaskResponse.setRequestId(_ctx.stringValue("GetCreateLogoTaskResponse.RequestId"));
		getCreateLogoTaskResponse.setErrorMsg(_ctx.stringValue("GetCreateLogoTaskResponse.ErrorMsg"));
		getCreateLogoTaskResponse.setSuccess(_ctx.booleanValue("GetCreateLogoTaskResponse.Success"));
		getCreateLogoTaskResponse.setErrorCode(_ctx.stringValue("GetCreateLogoTaskResponse.ErrorCode"));

		Task task = new Task();
		task.setTaskId(_ctx.stringValue("GetCreateLogoTaskResponse.Task.TaskId"));
		task.setTaskStatus(_ctx.stringValue("GetCreateLogoTaskResponse.Task.TaskStatus"));

		List<String> urls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCreateLogoTaskResponse.Task.Urls.Length"); i++) {
			urls.add(_ctx.stringValue("GetCreateLogoTaskResponse.Task.Urls["+ i +"]"));
		}
		task.setUrls(urls);
		getCreateLogoTaskResponse.setTask(task);
	 
	 	return getCreateLogoTaskResponse;
	}
}