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

package com.aliyuncs.zhuque.transform.v20160701;

import com.aliyuncs.zhuque.model.v20160701.AddProjectVersion4PimsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddProjectVersion4PimsResponseUnmarshaller {

	public static AddProjectVersion4PimsResponse unmarshall(AddProjectVersion4PimsResponse addProjectVersion4PimsResponse, UnmarshallerContext context) {
		
		addProjectVersion4PimsResponse.setRequestId(context.stringValue("AddProjectVersion4PimsResponse.RequestId"));
		addProjectVersion4PimsResponse.setData(context.stringValue("AddProjectVersion4PimsResponse.Data"));
		addProjectVersion4PimsResponse.setResult(context.stringValue("AddProjectVersion4PimsResponse.Result"));
		addProjectVersion4PimsResponse.setMessage(context.stringValue("AddProjectVersion4PimsResponse.Message"));
	 
	 	return addProjectVersion4PimsResponse;
	}
}