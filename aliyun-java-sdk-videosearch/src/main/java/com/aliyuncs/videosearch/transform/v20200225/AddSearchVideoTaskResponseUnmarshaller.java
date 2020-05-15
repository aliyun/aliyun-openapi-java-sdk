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

package com.aliyuncs.videosearch.transform.v20200225;

import com.aliyuncs.videosearch.model.v20200225.AddSearchVideoTaskResponse;
import com.aliyuncs.videosearch.model.v20200225.AddSearchVideoTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddSearchVideoTaskResponseUnmarshaller {

	public static AddSearchVideoTaskResponse unmarshall(AddSearchVideoTaskResponse addSearchVideoTaskResponse, UnmarshallerContext _ctx) {
		
		addSearchVideoTaskResponse.setRequestId(_ctx.stringValue("AddSearchVideoTaskResponse.RequestId"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("AddSearchVideoTaskResponse.Data.TaskId"));
		addSearchVideoTaskResponse.setData(data);
	 
	 	return addSearchVideoTaskResponse;
	}
}