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

import com.aliyuncs.unimkt.model.v20181212.ModifySlotTemplateResponse;
import com.aliyuncs.unimkt.model.v20181212.ModifySlotTemplateResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySlotTemplateResponseUnmarshaller {

	public static ModifySlotTemplateResponse unmarshall(ModifySlotTemplateResponse modifySlotTemplateResponse, UnmarshallerContext _ctx) {
		
		modifySlotTemplateResponse.setRequestId(_ctx.stringValue("ModifySlotTemplateResponse.RequestId"));
		modifySlotTemplateResponse.setCode(_ctx.stringValue("ModifySlotTemplateResponse.Code"));
		modifySlotTemplateResponse.setMessage(_ctx.stringValue("ModifySlotTemplateResponse.Message"));
		modifySlotTemplateResponse.setSuccess(_ctx.booleanValue("ModifySlotTemplateResponse.Success"));

		Model model = new Model();
		model.setCreateTime(_ctx.longValue("ModifySlotTemplateResponse.Model.CreateTime"));
		model.setAdSlotTemplateTitle(_ctx.stringValue("ModifySlotTemplateResponse.Model.AdSlotTemplateTitle"));
		model.setAdSlotType(_ctx.stringValue("ModifySlotTemplateResponse.Model.AdSlotType"));
		model.setAdSlotTemplateName(_ctx.stringValue("ModifySlotTemplateResponse.Model.AdSlotTemplateName"));
		model.setExtInfo(_ctx.stringValue("ModifySlotTemplateResponse.Model.ExtInfo"));
		model.setAdSlotTemplateDescription(_ctx.stringValue("ModifySlotTemplateResponse.Model.AdSlotTemplateDescription"));
		model.setVersion(_ctx.longValue("ModifySlotTemplateResponse.Model.Version"));
		model.setAdSlotTemplatePic(_ctx.stringValue("ModifySlotTemplateResponse.Model.AdSlotTemplatePic"));
		model.setAdSlotTemplatePreview(_ctx.stringValue("ModifySlotTemplateResponse.Model.AdSlotTemplatePreview"));
		model.setTemplateConfig(_ctx.stringValue("ModifySlotTemplateResponse.Model.TemplateConfig"));
		model.setAdSlotTemplateId(_ctx.stringValue("ModifySlotTemplateResponse.Model.AdSlotTemplateId"));
		model.setModifyTime(_ctx.longValue("ModifySlotTemplateResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("ModifySlotTemplateResponse.Model.TenantId"));
		modifySlotTemplateResponse.setModel(model);
	 
	 	return modifySlotTemplateResponse;
	}
}