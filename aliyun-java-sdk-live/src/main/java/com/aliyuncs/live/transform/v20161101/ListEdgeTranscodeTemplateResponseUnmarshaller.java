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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.ListEdgeTranscodeTemplateResponse;
import com.aliyuncs.live.model.v20161101.ListEdgeTranscodeTemplateResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEdgeTranscodeTemplateResponseUnmarshaller {

	public static ListEdgeTranscodeTemplateResponse unmarshall(ListEdgeTranscodeTemplateResponse listEdgeTranscodeTemplateResponse, UnmarshallerContext _ctx) {
		
		listEdgeTranscodeTemplateResponse.setRequestId(_ctx.stringValue("ListEdgeTranscodeTemplateResponse.RequestId"));
		listEdgeTranscodeTemplateResponse.setTotalCount(_ctx.integerValue("ListEdgeTranscodeTemplateResponse.TotalCount"));

		List<Template> templateList = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("ListEdgeTranscodeTemplateResponse.TemplateList.Length"); i++) {
			Template template = new Template();
			template.setType(_ctx.stringValue("ListEdgeTranscodeTemplateResponse.TemplateList["+ i +"].Type"));
			template.setGop(_ctx.stringValue("ListEdgeTranscodeTemplateResponse.TemplateList["+ i +"].Gop"));
			template.setCreateTime(_ctx.stringValue("ListEdgeTranscodeTemplateResponse.TemplateList["+ i +"].CreateTime"));
			template.setCodec(_ctx.stringValue("ListEdgeTranscodeTemplateResponse.TemplateList["+ i +"].Codec"));
			template.setFps(_ctx.stringValue("ListEdgeTranscodeTemplateResponse.TemplateList["+ i +"].Fps"));
			template.setBitrate(_ctx.stringValue("ListEdgeTranscodeTemplateResponse.TemplateList["+ i +"].Bitrate"));
			template.setName(_ctx.stringValue("ListEdgeTranscodeTemplateResponse.TemplateList["+ i +"].Name"));
			template.setResolution(_ctx.stringValue("ListEdgeTranscodeTemplateResponse.TemplateList["+ i +"].Resolution"));
			template.setTemplateId(_ctx.stringValue("ListEdgeTranscodeTemplateResponse.TemplateList["+ i +"].TemplateId"));

			templateList.add(template);
		}
		listEdgeTranscodeTemplateResponse.setTemplateList(templateList);
	 
	 	return listEdgeTranscodeTemplateResponse;
	}
}