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

	public static ListJobTemplatesResponse unmarshall(ListJobTemplatesResponse listJobTemplatesResponse, UnmarshallerContext _ctx) {
		
		listJobTemplatesResponse.setRequestId(_ctx.stringValue("ListJobTemplatesResponse.RequestId"));
		listJobTemplatesResponse.setPageSize(_ctx.integerValue("ListJobTemplatesResponse.PageSize"));
		listJobTemplatesResponse.setPageNumber(_ctx.integerValue("ListJobTemplatesResponse.PageNumber"));
		listJobTemplatesResponse.setTotalCount(_ctx.integerValue("ListJobTemplatesResponse.TotalCount"));

		List<JobTemplates> templates = new ArrayList<JobTemplates>();
		for (int i = 0; i < _ctx.lengthValue("ListJobTemplatesResponse.Templates.Length"); i++) {
			JobTemplates jobTemplates = new JobTemplates();
			jobTemplates.setTask(_ctx.integerValue("ListJobTemplatesResponse.Templates["+ i +"].Task"));
			jobTemplates.setVariables(_ctx.stringValue("ListJobTemplatesResponse.Templates["+ i +"].Variables"));
			jobTemplates.setCommandLine(_ctx.stringValue("ListJobTemplatesResponse.Templates["+ i +"].CommandLine"));
			jobTemplates.setQueue(_ctx.stringValue("ListJobTemplatesResponse.Templates["+ i +"].Queue"));
			jobTemplates.setPriority(_ctx.integerValue("ListJobTemplatesResponse.Templates["+ i +"].Priority"));
			jobTemplates.setMem(_ctx.stringValue("ListJobTemplatesResponse.Templates["+ i +"].Mem"));
			jobTemplates.setThread(_ctx.integerValue("ListJobTemplatesResponse.Templates["+ i +"].Thread"));
			jobTemplates.setArrayRequest(_ctx.stringValue("ListJobTemplatesResponse.Templates["+ i +"].ArrayRequest"));
			jobTemplates.setStderrRedirectPath(_ctx.stringValue("ListJobTemplatesResponse.Templates["+ i +"].StderrRedirectPath"));
			jobTemplates.setNode(_ctx.integerValue("ListJobTemplatesResponse.Templates["+ i +"].Node"));
			jobTemplates.setStdoutRedirectPath(_ctx.stringValue("ListJobTemplatesResponse.Templates["+ i +"].StdoutRedirectPath"));
			jobTemplates.setGpu(_ctx.integerValue("ListJobTemplatesResponse.Templates["+ i +"].Gpu"));
			jobTemplates.setPackagePath(_ctx.stringValue("ListJobTemplatesResponse.Templates["+ i +"].PackagePath"));
			jobTemplates.setClockTime(_ctx.stringValue("ListJobTemplatesResponse.Templates["+ i +"].ClockTime"));
			jobTemplates.setReRunable(_ctx.booleanValue("ListJobTemplatesResponse.Templates["+ i +"].ReRunable"));
			jobTemplates.setName(_ctx.stringValue("ListJobTemplatesResponse.Templates["+ i +"].Name"));
			jobTemplates.setId(_ctx.stringValue("ListJobTemplatesResponse.Templates["+ i +"].Id"));
			jobTemplates.setRunasUser(_ctx.stringValue("ListJobTemplatesResponse.Templates["+ i +"].RunasUser"));
			jobTemplates.setInputFileUrl(_ctx.stringValue("ListJobTemplatesResponse.Templates["+ i +"].InputFileUrl"));
			jobTemplates.setWithUnzipCmd(_ctx.booleanValue("ListJobTemplatesResponse.Templates["+ i +"].WithUnzipCmd"));
			jobTemplates.setUnzipCmd(_ctx.stringValue("ListJobTemplatesResponse.Templates["+ i +"].UnzipCmd"));

			templates.add(jobTemplates);
		}
		listJobTemplatesResponse.setTemplates(templates);
	 
	 	return listJobTemplatesResponse;
	}
}