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

package com.aliyuncs.paistudio.transform.v20201123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paistudio.model.v20201123.ListTemplatesResponse;
import com.aliyuncs.paistudio.model.v20201123.ListTemplatesResponse.Templates;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTemplatesResponseUnmarshaller {

	public static ListTemplatesResponse unmarshall(ListTemplatesResponse listTemplatesResponse, UnmarshallerContext _ctx) {
		
		listTemplatesResponse.setRequestId(_ctx.stringValue("ListTemplatesResponse.RequestId"));
		listTemplatesResponse.setCode(_ctx.stringValue("ListTemplatesResponse.Code"));
		listTemplatesResponse.setMaxResults(_ctx.integerValue("ListTemplatesResponse.MaxResults"));
		listTemplatesResponse.setMessage(_ctx.stringValue("ListTemplatesResponse.Message"));
		listTemplatesResponse.setTotalCount(_ctx.integerValue("ListTemplatesResponse.TotalCount"));

		List<Templates> data = new ArrayList<Templates>();
		for (int i = 0; i < _ctx.lengthValue("ListTemplatesResponse.Data.Length"); i++) {
			Templates templates = new Templates();
			templates.setContent(_ctx.stringValue("ListTemplatesResponse.Data["+ i +"].Content"));
			templates.setDescription(_ctx.stringValue("ListTemplatesResponse.Data["+ i +"].Description"));
			templates.setDetail(_ctx.stringValue("ListTemplatesResponse.Data["+ i +"].Detail"));
			templates.setDocLink(_ctx.stringValue("ListTemplatesResponse.Data["+ i +"].DocLink"));
			templates.setImageLink(_ctx.stringValue("ListTemplatesResponse.Data["+ i +"].ImageLink"));
			templates.setName(_ctx.stringValue("ListTemplatesResponse.Data["+ i +"].Name"));
			templates.setTemplateId(_ctx.stringValue("ListTemplatesResponse.Data["+ i +"].TemplateId"));

			data.add(templates);
		}
		listTemplatesResponse.setData(data);
	 
	 	return listTemplatesResponse;
	}
}