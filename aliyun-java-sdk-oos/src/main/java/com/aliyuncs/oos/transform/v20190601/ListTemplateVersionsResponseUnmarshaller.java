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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.ListTemplateVersionsResponse;
import com.aliyuncs.oos.model.v20190601.ListTemplateVersionsResponse.TemplateVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTemplateVersionsResponseUnmarshaller {

	public static ListTemplateVersionsResponse unmarshall(ListTemplateVersionsResponse listTemplateVersionsResponse, UnmarshallerContext _ctx) {
		
		listTemplateVersionsResponse.setRequestId(_ctx.stringValue("ListTemplateVersionsResponse.RequestId"));
		listTemplateVersionsResponse.setMaxResults(_ctx.integerValue("ListTemplateVersionsResponse.MaxResults"));
		listTemplateVersionsResponse.setNextToken(_ctx.stringValue("ListTemplateVersionsResponse.NextToken"));

		List<TemplateVersion> templateVersions = new ArrayList<TemplateVersion>();
		for (int i = 0; i < _ctx.lengthValue("ListTemplateVersionsResponse.TemplateVersions.Length"); i++) {
			TemplateVersion templateVersion = new TemplateVersion();
			templateVersion.setDescription(_ctx.stringValue("ListTemplateVersionsResponse.TemplateVersions["+ i +"].Description"));
			templateVersion.setTemplateFormat(_ctx.stringValue("ListTemplateVersionsResponse.TemplateVersions["+ i +"].TemplateFormat"));
			templateVersion.setTemplateVersion(_ctx.stringValue("ListTemplateVersionsResponse.TemplateVersions["+ i +"].TemplateVersion"));
			templateVersion.setUpdatedDate(_ctx.stringValue("ListTemplateVersionsResponse.TemplateVersions["+ i +"].UpdatedDate"));
			templateVersion.setUpdatedBy(_ctx.stringValue("ListTemplateVersionsResponse.TemplateVersions["+ i +"].UpdatedBy"));
			templateVersion.setVersionName(_ctx.stringValue("ListTemplateVersionsResponse.TemplateVersions["+ i +"].VersionName"));

			templateVersions.add(templateVersion);
		}
		listTemplateVersionsResponse.setTemplateVersions(templateVersions);
	 
	 	return listTemplateVersionsResponse;
	}
}