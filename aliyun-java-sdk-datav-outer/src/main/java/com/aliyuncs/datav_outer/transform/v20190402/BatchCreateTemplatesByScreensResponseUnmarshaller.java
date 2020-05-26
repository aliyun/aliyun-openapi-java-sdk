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

package com.aliyuncs.datav_outer.transform.v20190402;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datav_outer.model.v20190402.BatchCreateTemplatesByScreensResponse;
import com.aliyuncs.datav_outer.model.v20190402.BatchCreateTemplatesByScreensResponse.TemplateInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCreateTemplatesByScreensResponseUnmarshaller {

	public static BatchCreateTemplatesByScreensResponse unmarshall(BatchCreateTemplatesByScreensResponse batchCreateTemplatesByScreensResponse, UnmarshallerContext _ctx) {
		
		batchCreateTemplatesByScreensResponse.setRequestId(_ctx.stringValue("BatchCreateTemplatesByScreensResponse.RequestId"));

		List<TemplateInstance> templates = new ArrayList<TemplateInstance>();
		for (int i = 0; i < _ctx.lengthValue("BatchCreateTemplatesByScreensResponse.Templates.Length"); i++) {
			TemplateInstance templateInstance = new TemplateInstance();
			templateInstance.setTemplateId(_ctx.integerValue("BatchCreateTemplatesByScreensResponse.Templates["+ i +"].TemplateId"));
			templateInstance.setName(_ctx.stringValue("BatchCreateTemplatesByScreensResponse.Templates["+ i +"].Name"));
			templateInstance.setThumbnail(_ctx.stringValue("BatchCreateTemplatesByScreensResponse.Templates["+ i +"].Thumbnail"));
			templateInstance.setDescription(_ctx.stringValue("BatchCreateTemplatesByScreensResponse.Templates["+ i +"].Description"));

			templates.add(templateInstance);
		}
		batchCreateTemplatesByScreensResponse.setTemplates(templates);
	 
	 	return batchCreateTemplatesByScreensResponse;
	}
}