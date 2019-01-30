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

import com.aliyuncs.vod.model.v20170321.ListAITemplateResponse;
import com.aliyuncs.vod.model.v20170321.ListAITemplateResponse.TemplateInfoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAITemplateResponseUnmarshaller {

	public static ListAITemplateResponse unmarshall(ListAITemplateResponse listAITemplateResponse, UnmarshallerContext context) {
		
		listAITemplateResponse.setRequestId(context.stringValue("ListAITemplateResponse.RequestId"));

		List<TemplateInfoListItem> templateInfoList = new ArrayList<TemplateInfoListItem>();
		for (int i = 0; i < context.lengthValue("ListAITemplateResponse.TemplateInfoList.Length"); i++) {
			TemplateInfoListItem templateInfoListItem = new TemplateInfoListItem();
			templateInfoListItem.setTemplateId(context.stringValue("ListAITemplateResponse.TemplateInfoList["+ i +"].TemplateId"));
			templateInfoListItem.setTemplateType(context.stringValue("ListAITemplateResponse.TemplateInfoList["+ i +"].TemplateType"));
			templateInfoListItem.setTemplateName(context.stringValue("ListAITemplateResponse.TemplateInfoList["+ i +"].TemplateName"));
			templateInfoListItem.setTemplateConfig(context.stringValue("ListAITemplateResponse.TemplateInfoList["+ i +"].TemplateConfig"));
			templateInfoListItem.setSource(context.stringValue("ListAITemplateResponse.TemplateInfoList["+ i +"].Source"));
			templateInfoListItem.setIsDefault(context.stringValue("ListAITemplateResponse.TemplateInfoList["+ i +"].IsDefault"));
			templateInfoListItem.setCreationTime(context.stringValue("ListAITemplateResponse.TemplateInfoList["+ i +"].CreationTime"));
			templateInfoListItem.setModifyTime(context.stringValue("ListAITemplateResponse.TemplateInfoList["+ i +"].ModifyTime"));

			templateInfoList.add(templateInfoListItem);
		}
		listAITemplateResponse.setTemplateInfoList(templateInfoList);
	 
	 	return listAITemplateResponse;
	}
}