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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryMCTemplateListResponse;
import com.aliyuncs.mts.model.v20140618.QueryMCTemplateListResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMCTemplateListResponseUnmarshaller {

	public static QueryMCTemplateListResponse unmarshall(QueryMCTemplateListResponse queryMCTemplateListResponse, UnmarshallerContext context) {
		
		queryMCTemplateListResponse.setRequestId(context.stringValue("QueryMCTemplateListResponse.RequestId"));

		List<String> nonExistTids = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryMCTemplateListResponse.NonExistTids.Length"); i++) {
			nonExistTids.add(context.stringValue("QueryMCTemplateListResponse.NonExistTids["+ i +"]"));
		}
		queryMCTemplateListResponse.setNonExistTids(nonExistTids);

		List<Template> templateList = new ArrayList<Template>();
		for (int i = 0; i < context.lengthValue("QueryMCTemplateListResponse.TemplateList.Length"); i++) {
			Template template = new Template();
			template.setTemplateId(context.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].TemplateId"));
			template.setName(context.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Name"));
			template.setState(context.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].State"));
			template.setPorn(context.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Porn"));
			template.setTerrorism(context.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Terrorism"));
			template.setPolitics(context.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Politics"));
			template.setAd(context.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Ad"));
			template.setQrcode(context.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Qrcode"));
			template.setLive(context.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Live"));
			template.setLogo(context.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Logo"));
			template.setAbuse(context.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Abuse"));
			template.setContraband(context.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Contraband"));
			template.setSpam(context.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Spam"));

			templateList.add(template);
		}
		queryMCTemplateListResponse.setTemplateList(templateList);
	 
	 	return queryMCTemplateListResponse;
	}
}