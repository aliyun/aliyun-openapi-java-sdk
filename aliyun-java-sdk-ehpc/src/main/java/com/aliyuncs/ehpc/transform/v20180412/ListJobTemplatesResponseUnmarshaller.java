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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListJobTemplatesResponse;
import com.aliyuncs.ehpc.model.v20180412.ListJobTemplatesResponse.JobTemplates;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobTemplatesResponseUnmarshaller {

	public static ListJobTemplatesResponse unmarshall(ListJobTemplatesResponse listJobTemplatesResponse, UnmarshallerContext context) {
		
		listJobTemplatesResponse.setRequestId(context.stringValue("ListJobTemplatesResponse.RequestId"));
		listJobTemplatesResponse.setTotalCount(context.integerValue("ListJobTemplatesResponse.TotalCount"));
		listJobTemplatesResponse.setPageNumber(context.integerValue("ListJobTemplatesResponse.PageNumber"));
		listJobTemplatesResponse.setPageSize(context.integerValue("ListJobTemplatesResponse.PageSize"));

		List<JobTemplates> templates = new ArrayList<JobTemplates>();
		for (int i = 0; i < context.lengthValue("ListJobTemplatesResponse.Templates.Length"); i++) {
			JobTemplates jobTemplates = new JobTemplates();
			jobTemplates.setId(context.stringValue("ListJobTemplatesResponse.Templates["+ i +"].Id"));
			jobTemplates.setName(context.stringValue("ListJobTemplatesResponse.Templates["+ i +"].Name"));
			jobTemplates.setCommandLine(context.stringValue("ListJobTemplatesResponse.Templates["+ i +"].CommandLine"));
			jobTemplates.setRunasUser(context.stringValue("ListJobTemplatesResponse.Templates["+ i +"].RunasUser"));
			jobTemplates.setPriority(context.integerValue("ListJobTemplatesResponse.Templates["+ i +"].Priority"));
			jobTemplates.setPackagePath(context.stringValue("ListJobTemplatesResponse.Templates["+ i +"].PackagePath"));
			jobTemplates.setStdoutRedirectPath(context.stringValue("ListJobTemplatesResponse.Templates["+ i +"].StdoutRedirectPath"));
			jobTemplates.setStderrRedirectPath(context.stringValue("ListJobTemplatesResponse.Templates["+ i +"].StderrRedirectPath"));
			jobTemplates.setReRunable(context.booleanValue("ListJobTemplatesResponse.Templates["+ i +"].ReRunable"));
			jobTemplates.setArrayRequest(context.stringValue("ListJobTemplatesResponse.Templates["+ i +"].ArrayRequest"));
			jobTemplates.setVariables(context.stringValue("ListJobTemplatesResponse.Templates["+ i +"].Variables"));

			templates.add(jobTemplates);
		}
		listJobTemplatesResponse.setTemplates(templates);
	 
	 	return listJobTemplatesResponse;
	}
}