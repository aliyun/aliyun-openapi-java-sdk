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

import com.aliyuncs.unimkt.model.v20181212.ChangeSlotStatusResponse;
import com.aliyuncs.unimkt.model.v20181212.ChangeSlotStatusResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeSlotStatusResponseUnmarshaller {

	public static ChangeSlotStatusResponse unmarshall(ChangeSlotStatusResponse changeSlotStatusResponse, UnmarshallerContext _ctx) {
		
		changeSlotStatusResponse.setRequestId(_ctx.stringValue("ChangeSlotStatusResponse.RequestId"));
		changeSlotStatusResponse.setCode(_ctx.stringValue("ChangeSlotStatusResponse.Code"));
		changeSlotStatusResponse.setMessage(_ctx.stringValue("ChangeSlotStatusResponse.Message"));
		changeSlotStatusResponse.setSuccess(_ctx.booleanValue("ChangeSlotStatusResponse.Success"));

		Model model = new Model();
		model.setCreateTime(_ctx.longValue("ChangeSlotStatusResponse.Model.CreateTime"));
		model.setMediaName(_ctx.stringValue("ChangeSlotStatusResponse.Model.MediaName"));
		model.setAdSlotType(_ctx.stringValue("ChangeSlotStatusResponse.Model.AdSlotType"));
		model.setAdSlotStatus(_ctx.stringValue("ChangeSlotStatusResponse.Model.AdSlotStatus"));
		model.setExtInfo(_ctx.stringValue("ChangeSlotStatusResponse.Model.ExtInfo"));
		model.setMediaId(_ctx.stringValue("ChangeSlotStatusResponse.Model.MediaId"));
		model.setAdSlotName(_ctx.stringValue("ChangeSlotStatusResponse.Model.AdSlotName"));
		model.setInspireScene(_ctx.stringValue("ChangeSlotStatusResponse.Model.InspireScene"));
		model.setBlockingRule(_ctx.stringValue("ChangeSlotStatusResponse.Model.BlockingRule"));
		model.setVersion(_ctx.longValue("ChangeSlotStatusResponse.Model.Version"));
		model.setAdSlotId(_ctx.stringValue("ChangeSlotStatusResponse.Model.AdSlotId"));
		model.setAdSlotCorporateStatus(_ctx.stringValue("ChangeSlotStatusResponse.Model.AdSlotCorporateStatus"));
		model.setAdSlotTemplateId(_ctx.stringValue("ChangeSlotStatusResponse.Model.AdSlotTemplateId"));
		model.setModifyTime(_ctx.longValue("ChangeSlotStatusResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("ChangeSlotStatusResponse.Model.TenantId"));
		changeSlotStatusResponse.setModel(model);
	 
	 	return changeSlotStatusResponse;
	}
}