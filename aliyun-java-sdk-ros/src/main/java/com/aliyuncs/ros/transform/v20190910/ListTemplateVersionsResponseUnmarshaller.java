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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.ListTemplateVersionsResponse;
import com.aliyuncs.ros.model.v20190910.ListTemplateVersionsResponse.Version;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTemplateVersionsResponseUnmarshaller {

	public static ListTemplateVersionsResponse unmarshall(ListTemplateVersionsResponse listTemplateVersionsResponse, UnmarshallerContext _ctx) {
		
		listTemplateVersionsResponse.setRequestId(_ctx.stringValue("ListTemplateVersionsResponse.RequestId"));
		listTemplateVersionsResponse.setNextToken(_ctx.stringValue("ListTemplateVersionsResponse.NextToken"));

		List<Version> versions = new ArrayList<Version>();
		for (int i = 0; i < _ctx.lengthValue("ListTemplateVersionsResponse.Versions.Length"); i++) {
			Version version = new Version();
			version.setCreateTime(_ctx.stringValue("ListTemplateVersionsResponse.Versions["+ i +"].CreateTime"));
			version.setUpdateTime(_ctx.stringValue("ListTemplateVersionsResponse.Versions["+ i +"].UpdateTime"));
			version.setTemplateId(_ctx.stringValue("ListTemplateVersionsResponse.Versions["+ i +"].TemplateId"));
			version.setTemplateName(_ctx.stringValue("ListTemplateVersionsResponse.Versions["+ i +"].TemplateName"));
			version.setTemplateVersion(_ctx.stringValue("ListTemplateVersionsResponse.Versions["+ i +"].TemplateVersion"));
			version.setDescription(_ctx.stringValue("ListTemplateVersionsResponse.Versions["+ i +"].Description"));

			versions.add(version);
		}
		listTemplateVersionsResponse.setVersions(versions);
	 
	 	return listTemplateVersionsResponse;
	}
}