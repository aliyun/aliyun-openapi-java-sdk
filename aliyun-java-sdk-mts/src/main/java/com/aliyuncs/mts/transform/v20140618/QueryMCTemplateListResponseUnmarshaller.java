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

	public static QueryMCTemplateListResponse unmarshall(QueryMCTemplateListResponse queryMCTemplateListResponse, UnmarshallerContext _ctx) {
		
		queryMCTemplateListResponse.setRequestId(_ctx.stringValue("QueryMCTemplateListResponse.RequestId"));

		List<String> nonExistTids = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryMCTemplateListResponse.NonExistTids.Length"); i++) {
			nonExistTids.add(_ctx.stringValue("QueryMCTemplateListResponse.NonExistTids["+ i +"]"));
		}
		queryMCTemplateListResponse.setNonExistTids(nonExistTids);

		List<Template> templateList = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("QueryMCTemplateListResponse.TemplateList.Length"); i++) {
			Template template = new Template();
			template.setLogo(_ctx.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Logo"));
			template.setAbuse(_ctx.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Abuse"));
			template.setState(_ctx.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].State"));
			template.setTerrorism(_ctx.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Terrorism"));
			template.setPolitics(_ctx.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Politics"));
			template.setQrcode(_ctx.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Qrcode"));
			template.setLive(_ctx.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Live"));
			template.setSpam(_ctx.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Spam"));
			template.setContraband(_ctx.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Contraband"));
			template.setAd(_ctx.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Ad"));
			template.setPorn(_ctx.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Porn"));
			template.setName(_ctx.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].Name"));
			template.setTemplateId(_ctx.stringValue("QueryMCTemplateListResponse.TemplateList["+ i +"].TemplateId"));

			templateList.add(template);
		}
		queryMCTemplateListResponse.setTemplateList(templateList);
	 
	 	return queryMCTemplateListResponse;
	}
}