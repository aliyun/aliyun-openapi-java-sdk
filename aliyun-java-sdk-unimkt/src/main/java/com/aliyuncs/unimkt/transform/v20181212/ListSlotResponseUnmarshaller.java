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

import com.aliyuncs.unimkt.model.v20181212.ListSlotResponse;
import com.aliyuncs.unimkt.model.v20181212.ListSlotResponse.AdSlot;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSlotResponseUnmarshaller {

	public static ListSlotResponse unmarshall(ListSlotResponse listSlotResponse, UnmarshallerContext _ctx) {
		
		listSlotResponse.setRequestId(_ctx.stringValue("ListSlotResponse.RequestId"));
		listSlotResponse.setCode(_ctx.stringValue("ListSlotResponse.Code"));
		listSlotResponse.setSuccess(_ctx.booleanValue("ListSlotResponse.Success"));
		listSlotResponse.setMessage(_ctx.stringValue("ListSlotResponse.Message"));
		listSlotResponse.setPageNumber(_ctx.integerValue("ListSlotResponse.PageNumber"));
		listSlotResponse.setPageSize(_ctx.integerValue("ListSlotResponse.PageSize"));
		listSlotResponse.setTotal(_ctx.longValue("ListSlotResponse.Total"));

		List<AdSlot> model = new ArrayList<AdSlot>();
		for (int i = 0; i < _ctx.lengthValue("ListSlotResponse.Model.Length"); i++) {
			AdSlot adSlot = new AdSlot();
			adSlot.setCreateTime(_ctx.longValue("ListSlotResponse.Model["+ i +"].CreateTime"));
			adSlot.setModifyTime(_ctx.longValue("ListSlotResponse.Model["+ i +"].ModifyTime"));
			adSlot.setTenantId(_ctx.stringValue("ListSlotResponse.Model["+ i +"].TenantId"));
			adSlot.setMediaName(_ctx.stringValue("ListSlotResponse.Model["+ i +"].MediaName"));
			adSlot.setMediaId(_ctx.stringValue("ListSlotResponse.Model["+ i +"].MediaId"));
			adSlot.setAdSlotId(_ctx.stringValue("ListSlotResponse.Model["+ i +"].AdSlotId"));
			adSlot.setAdSlotName(_ctx.stringValue("ListSlotResponse.Model["+ i +"].AdSlotName"));
			adSlot.setAdSlotType(_ctx.stringValue("ListSlotResponse.Model["+ i +"].AdSlotType"));
			adSlot.setAdSlotTemplateId(_ctx.stringValue("ListSlotResponse.Model["+ i +"].AdSlotTemplateId"));
			adSlot.setAdSlotStatus(_ctx.stringValue("ListSlotResponse.Model["+ i +"].AdSlotStatus"));
			adSlot.setAdSlotCorporateStatus(_ctx.stringValue("ListSlotResponse.Model["+ i +"].AdSlotCorporateStatus"));
			adSlot.setExtInfo(_ctx.stringValue("ListSlotResponse.Model["+ i +"].ExtInfo"));
			adSlot.setBlockingRule(_ctx.stringValue("ListSlotResponse.Model["+ i +"].BlockingRule"));
			adSlot.setInspireScene(_ctx.stringValue("ListSlotResponse.Model["+ i +"].InspireScene"));
			adSlot.setVersion(_ctx.longValue("ListSlotResponse.Model["+ i +"].Version"));

			model.add(adSlot);
		}
		listSlotResponse.setModel(model);
	 
	 	return listSlotResponse;
	}
}