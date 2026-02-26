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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetClassificationTemplateResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetClassificationTemplateResponse.ClassificationResourceTemplateMap;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClassificationTemplateResponseUnmarshaller {

	public static GetClassificationTemplateResponse unmarshall(GetClassificationTemplateResponse getClassificationTemplateResponse, UnmarshallerContext _ctx) {
		
		getClassificationTemplateResponse.setRequestId(_ctx.stringValue("GetClassificationTemplateResponse.RequestId"));
		getClassificationTemplateResponse.setErrorCode(_ctx.stringValue("GetClassificationTemplateResponse.ErrorCode"));
		getClassificationTemplateResponse.setErrorMessage(_ctx.stringValue("GetClassificationTemplateResponse.ErrorMessage"));
		getClassificationTemplateResponse.setSuccess(_ctx.booleanValue("GetClassificationTemplateResponse.Success"));

		ClassificationResourceTemplateMap classificationResourceTemplateMap = new ClassificationResourceTemplateMap();
		classificationResourceTemplateMap.setTemplateId(_ctx.longValue("GetClassificationTemplateResponse.ClassificationResourceTemplateMap.TemplateId"));
		classificationResourceTemplateMap.setTemplateType(_ctx.stringValue("GetClassificationTemplateResponse.ClassificationResourceTemplateMap.TemplateType"));
		classificationResourceTemplateMap.setResourceId(_ctx.longValue("GetClassificationTemplateResponse.ClassificationResourceTemplateMap.ResourceId"));
		classificationResourceTemplateMap.setResourceType(_ctx.stringValue("GetClassificationTemplateResponse.ClassificationResourceTemplateMap.ResourceType"));
		getClassificationTemplateResponse.setClassificationResourceTemplateMap(classificationResourceTemplateMap);
	 
	 	return getClassificationTemplateResponse;
	}
}