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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.zhuque.model.v20160701.AddProjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddProjectResponseUnmarshaller {

	public static AddProjectResponse unmarshall(AddProjectResponse addProjectResponse, UnmarshallerContext context) {
		
		addProjectResponse.setRequestId(context.stringValue("AddProjectResponse.RequestId"));
		addProjectResponse.setResult(context.stringValue("AddProjectResponse.Result"));
		addProjectResponse.setMessage(context.stringValue("AddProjectResponse.Message"));

		List<String> string = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("AddProjectResponse.String.Length"); i++) {
			string.add(context.stringValue("AddProjectResponse.String["+ i +"]"));
		}
		addProjectResponse.setString(string);
	 
	 	return addProjectResponse;
	}
}