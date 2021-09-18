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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.UpdateDetectionTemplateResponse;
import com.aliyuncs.vod.model.v20170321.UpdateDetectionTemplateResponse.DetectionTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDetectionTemplateResponseUnmarshaller {

	public static UpdateDetectionTemplateResponse unmarshall(UpdateDetectionTemplateResponse updateDetectionTemplateResponse, UnmarshallerContext _ctx) {
		
		updateDetectionTemplateResponse.setRequestId(_ctx.stringValue("UpdateDetectionTemplateResponse.RequestId"));

		DetectionTemplate detectionTemplate = new DetectionTemplate();
		detectionTemplate.setCreateTime(_ctx.stringValue("UpdateDetectionTemplateResponse.DetectionTemplate.CreateTime"));
		detectionTemplate.setUserId(_ctx.longValue("UpdateDetectionTemplateResponse.DetectionTemplate.UserId"));
		detectionTemplate.setTemplateName(_ctx.stringValue("UpdateDetectionTemplateResponse.DetectionTemplate.TemplateName"));
		detectionTemplate.setPeriod(_ctx.stringValue("UpdateDetectionTemplateResponse.DetectionTemplate.Period"));
		detectionTemplate.setPlatform(_ctx.stringValue("UpdateDetectionTemplateResponse.DetectionTemplate.Platform"));
		detectionTemplate.setTemplateId(_ctx.stringValue("UpdateDetectionTemplateResponse.DetectionTemplate.TemplateId"));
		detectionTemplate.setModifyTime(_ctx.stringValue("UpdateDetectionTemplateResponse.DetectionTemplate.ModifyTime"));
		updateDetectionTemplateResponse.setDetectionTemplate(detectionTemplate);
	 
	 	return updateDetectionTemplateResponse;
	}
}