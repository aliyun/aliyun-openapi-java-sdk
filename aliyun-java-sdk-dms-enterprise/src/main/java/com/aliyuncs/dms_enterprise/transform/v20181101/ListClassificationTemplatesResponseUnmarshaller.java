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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListClassificationTemplatesResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListClassificationTemplatesResponse.TemplateListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClassificationTemplatesResponseUnmarshaller {

	public static ListClassificationTemplatesResponse unmarshall(ListClassificationTemplatesResponse listClassificationTemplatesResponse, UnmarshallerContext _ctx) {
		
		listClassificationTemplatesResponse.setRequestId(_ctx.stringValue("ListClassificationTemplatesResponse.RequestId"));
		listClassificationTemplatesResponse.setSuccess(_ctx.booleanValue("ListClassificationTemplatesResponse.Success"));
		listClassificationTemplatesResponse.setErrorMessage(_ctx.stringValue("ListClassificationTemplatesResponse.ErrorMessage"));
		listClassificationTemplatesResponse.setErrorCode(_ctx.stringValue("ListClassificationTemplatesResponse.ErrorCode"));

		List<TemplateListItem> templateList = new ArrayList<TemplateListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClassificationTemplatesResponse.TemplateList.Length"); i++) {
			TemplateListItem templateListItem = new TemplateListItem();
			templateListItem.setTemplateId(_ctx.longValue("ListClassificationTemplatesResponse.TemplateList["+ i +"].TemplateId"));
			templateListItem.setName(_ctx.stringValue("ListClassificationTemplatesResponse.TemplateList["+ i +"].Name"));
			templateListItem.setTemplateType(_ctx.stringValue("ListClassificationTemplatesResponse.TemplateList["+ i +"].TemplateType"));
			templateListItem.setRemark(_ctx.stringValue("ListClassificationTemplatesResponse.TemplateList["+ i +"].Remark"));

			templateList.add(templateListItem);
		}
		listClassificationTemplatesResponse.setTemplateList(templateList);
	 
	 	return listClassificationTemplatesResponse;
	}
}