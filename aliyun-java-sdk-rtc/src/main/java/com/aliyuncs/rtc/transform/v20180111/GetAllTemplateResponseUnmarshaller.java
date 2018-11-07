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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.GetAllTemplateResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAllTemplateResponseUnmarshaller {

	public static GetAllTemplateResponse unmarshall(GetAllTemplateResponse getAllTemplateResponse, UnmarshallerContext context) {
		
		getAllTemplateResponse.setRequestId(context.stringValue("GetAllTemplateResponse.RequestId"));

		List<String> templateIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetAllTemplateResponse.TemplateIds.Length"); i++) {
			templateIds.add(context.stringValue("GetAllTemplateResponse.TemplateIds["+ i +"]"));
		}
		getAllTemplateResponse.setTemplateIds(templateIds);
	 
	 	return getAllTemplateResponse;
	}
}