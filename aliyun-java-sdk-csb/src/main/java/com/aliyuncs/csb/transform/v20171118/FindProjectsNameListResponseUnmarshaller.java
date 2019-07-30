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

package com.aliyuncs.csb.transform.v20171118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csb.model.v20171118.FindProjectsNameListResponse;
import com.aliyuncs.csb.model.v20171118.FindProjectsNameListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindProjectsNameListResponseUnmarshaller {

	public static FindProjectsNameListResponse unmarshall(FindProjectsNameListResponse findProjectsNameListResponse, UnmarshallerContext _ctx) {
		
		findProjectsNameListResponse.setRequestId(_ctx.stringValue("FindProjectsNameListResponse.RequestId"));
		findProjectsNameListResponse.setCode(_ctx.integerValue("FindProjectsNameListResponse.Code"));
		findProjectsNameListResponse.setMessage(_ctx.stringValue("FindProjectsNameListResponse.Message"));

		Data data = new Data();

		List<String> projectNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("FindProjectsNameListResponse.Data.ProjectNameList.Length"); i++) {
			projectNameList.add(_ctx.stringValue("FindProjectsNameListResponse.Data.ProjectNameList["+ i +"]"));
		}
		data.setProjectNameList(projectNameList);
		findProjectsNameListResponse.setData(data);
	 
	 	return findProjectsNameListResponse;
	}
}