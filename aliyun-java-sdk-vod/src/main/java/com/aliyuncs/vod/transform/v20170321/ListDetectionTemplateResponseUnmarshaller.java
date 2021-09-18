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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListDetectionTemplateResponse;
import com.aliyuncs.vod.model.v20170321.ListDetectionTemplateResponse.DetectionTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDetectionTemplateResponseUnmarshaller {

	public static ListDetectionTemplateResponse unmarshall(ListDetectionTemplateResponse listDetectionTemplateResponse, UnmarshallerContext _ctx) {
		
		listDetectionTemplateResponse.setRequestId(_ctx.stringValue("ListDetectionTemplateResponse.RequestId"));

		List<DetectionTemplate> detectionTemplateList = new ArrayList<DetectionTemplate>();
		for (int i = 0; i < _ctx.lengthValue("ListDetectionTemplateResponse.DetectionTemplateList.Length"); i++) {
			DetectionTemplate detectionTemplate = new DetectionTemplate();
			detectionTemplate.setCreateTime(_ctx.stringValue("ListDetectionTemplateResponse.DetectionTemplateList["+ i +"].CreateTime"));
			detectionTemplate.setUserId(_ctx.longValue("ListDetectionTemplateResponse.DetectionTemplateList["+ i +"].UserId"));
			detectionTemplate.setTemplateName(_ctx.stringValue("ListDetectionTemplateResponse.DetectionTemplateList["+ i +"].TemplateName"));
			detectionTemplate.setPeriod(_ctx.stringValue("ListDetectionTemplateResponse.DetectionTemplateList["+ i +"].Period"));
			detectionTemplate.setPlatform(_ctx.stringValue("ListDetectionTemplateResponse.DetectionTemplateList["+ i +"].Platform"));
			detectionTemplate.setTemplateId(_ctx.stringValue("ListDetectionTemplateResponse.DetectionTemplateList["+ i +"].TemplateId"));
			detectionTemplate.setModifyTime(_ctx.stringValue("ListDetectionTemplateResponse.DetectionTemplateList["+ i +"].ModifyTime"));

			detectionTemplateList.add(detectionTemplate);
		}
		listDetectionTemplateResponse.setDetectionTemplateList(detectionTemplateList);
	 
	 	return listDetectionTemplateResponse;
	}
}