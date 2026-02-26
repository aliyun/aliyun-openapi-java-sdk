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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListProjectLabelsResponse;
import com.aliyuncs.devops.model.v20210625.ListProjectLabelsResponse.Project_labels;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectLabelsResponseUnmarshaller {

	public static ListProjectLabelsResponse unmarshall(ListProjectLabelsResponse listProjectLabelsResponse, UnmarshallerContext _ctx) {
		
		listProjectLabelsResponse.setRequestId(_ctx.stringValue("ListProjectLabelsResponse.requestId"));
		listProjectLabelsResponse.setSuccess(_ctx.booleanValue("ListProjectLabelsResponse.success"));
		listProjectLabelsResponse.setErrorCode(_ctx.stringValue("ListProjectLabelsResponse.errorCode"));
		listProjectLabelsResponse.setErrorMessage(_ctx.stringValue("ListProjectLabelsResponse.errorMessage"));
		listProjectLabelsResponse.setTotal(_ctx.longValue("ListProjectLabelsResponse.total"));

		List<Project_labels> result = new ArrayList<Project_labels>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectLabelsResponse.result.Length"); i++) {
			Project_labels project_labels = new Project_labels();
			project_labels.setId(_ctx.stringValue("ListProjectLabelsResponse.result["+ i +"].id"));
			project_labels.setName(_ctx.stringValue("ListProjectLabelsResponse.result["+ i +"].name"));
			project_labels.setColor(_ctx.stringValue("ListProjectLabelsResponse.result["+ i +"].color"));
			project_labels.setDescription(_ctx.stringValue("ListProjectLabelsResponse.result["+ i +"].description"));
			project_labels.setOpenMergeRequestsCount(_ctx.longValue("ListProjectLabelsResponse.result["+ i +"].openMergeRequestsCount"));

			result.add(project_labels);
		}
		listProjectLabelsResponse.setResult(result);
	 
	 	return listProjectLabelsResponse;
	}
}