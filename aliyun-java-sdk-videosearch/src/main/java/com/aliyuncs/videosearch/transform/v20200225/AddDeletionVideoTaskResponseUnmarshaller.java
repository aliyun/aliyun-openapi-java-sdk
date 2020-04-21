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

import com.aliyuncs.videosearch.model.v20200225.AddDeletionVideoTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddDeletionVideoTaskResponseUnmarshaller {

	public static AddDeletionVideoTaskResponse unmarshall(AddDeletionVideoTaskResponse addDeletionVideoTaskResponse, UnmarshallerContext _ctx) {
		
		addDeletionVideoTaskResponse.setRequestId(_ctx.stringValue("AddDeletionVideoTaskResponse.RequestId"));
		addDeletionVideoTaskResponse.setData(_ctx.booleanValue("AddDeletionVideoTaskResponse.Data"));
	 
	 	return addDeletionVideoTaskResponse;
	}
}