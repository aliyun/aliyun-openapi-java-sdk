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

package com.aliyuncs.unimkt.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.ListSlotTemplateResponse;
import com.aliyuncs.unimkt.model.v20181212.ListSlotTemplateResponse.AdSlotTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSlotTemplateResponseUnmarshaller {

	public static ListSlotTemplateResponse unmarshall(ListSlotTemplateResponse listSlotTemplateResponse, UnmarshallerContext _ctx) {
		
		listSlotTemplateResponse.setRequestId(_ctx.stringValue("ListSlotTemplateResponse.RequestId"));
		listSlotTemplateResponse.setCode(_ctx.stringValue("ListSlotTemplateResponse.Code"));
		listSlotTemplateResponse.setSuccess(_ctx.booleanValue("ListSlotTemplateResponse.Success"));
		listSlotTemplateResponse.setMessage(_ctx.stringValue("ListSlotTemplateResponse.Message"));
		listSlotTemplateResponse.setPageNumber(_ctx.integerValue("ListSlotTemplateResponse.PageNumber"));
		listSlotTemplateResponse.setPageSize(_ctx.integerValue("ListSlotTemplateResponse.PageSize"));
		listSlotTemplateResponse.setTotal(_ctx.longValue("ListSlotTemplateResponse.Total"));

		List<AdSlotTemplate> model = new ArrayList<AdSlotTemplate>();
		for (int i = 0; i < _ctx.lengthValue("ListSlotTemplateResponse.Model.Length"); i++) {
			AdSlotTemplate adSlotTemplate = new AdSlotTemplate();
			adSlotTemplate.setCreateTime(_ctx.longValue("ListSlotTemplateResponse.Model["+ i +"].CreateTime"));
			adSlotTemplate.setModifyTime(_ctx.longValue("ListSlotTemplateResponse.Model["+ i +"].ModifyTime"));
			adSlotTemplate.setTenantId(_ctx.stringValue("ListSlotTemplateResponse.Model["+ i +"].TenantId"));
			adSlotTemplate.setMediaName(_ctx.stringValue("ListSlotTemplateResponse.Model["+ i +"].MediaName"));
			adSlotTemplate.setMediaId(_ctx.stringValue("ListSlotTemplateResponse.Model["+ i +"].MediaId"));
			adSlotTemplate.setMediaType(_ctx.stringValue("ListSlotTemplateResponse.Model["+ i +"].MediaType"));
			adSlotTemplate.setFirstScene(_ctx.stringValue("ListSlotTemplateResponse.Model["+ i +"].FirstScene"));
			adSlotTemplate.setSecondScene(_ctx.stringValue("ListSlotTemplateResponse.Model["+ i +"].SecondScene"));
			adSlotTemplate.setMediaStatus(_ctx.stringValue("ListSlotTemplateResponse.Model["+ i +"].MediaStatus"));
			adSlotTemplate.setAccessStatus(_ctx.stringValue("ListSlotTemplateResponse.Model["+ i +"].AccessStatus"));
			adSlotTemplate.setOs(_ctx.stringValue("ListSlotTemplateResponse.Model["+ i +"].Os"));
			adSlotTemplate.setConfig(_ctx.stringValue("ListSlotTemplateResponse.Model["+ i +"].Config"));
			adSlotTemplate.setKeyWords(_ctx.stringValue("ListSlotTemplateResponse.Model["+ i +"].KeyWords"));
			adSlotTemplate.setAccessWay(_ctx.stringValue("ListSlotTemplateResponse.Model["+ i +"].AccessWay"));
			adSlotTemplate.setExtInfo(_ctx.stringValue("ListSlotTemplateResponse.Model["+ i +"].ExtInfo"));
			adSlotTemplate.setVersion(_ctx.longValue("ListSlotTemplateResponse.Model["+ i +"].Version"));

			model.add(adSlotTemplate);
		}
		listSlotTemplateResponse.setModel(model);
	 
	 	return listSlotTemplateResponse;
	}
}