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

import com.aliyuncs.unimkt.model.v20181212.CreatesSlotTemplateResponse;
import com.aliyuncs.unimkt.model.v20181212.CreatesSlotTemplateResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatesSlotTemplateResponseUnmarshaller {

	public static CreatesSlotTemplateResponse unmarshall(CreatesSlotTemplateResponse createsSlotTemplateResponse, UnmarshallerContext _ctx) {
		
		createsSlotTemplateResponse.setRequestId(_ctx.stringValue("CreatesSlotTemplateResponse.RequestId"));
		createsSlotTemplateResponse.setCode(_ctx.stringValue("CreatesSlotTemplateResponse.Code"));
		createsSlotTemplateResponse.setSuccess(_ctx.booleanValue("CreatesSlotTemplateResponse.Success"));
		createsSlotTemplateResponse.setMessage(_ctx.stringValue("CreatesSlotTemplateResponse.Message"));

		Model model = new Model();
		model.setCreateTime(_ctx.longValue("CreatesSlotTemplateResponse.Model.CreateTime"));
		model.setModifyTime(_ctx.longValue("CreatesSlotTemplateResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("CreatesSlotTemplateResponse.Model.TenantId"));
		model.setAdSlotTemplateId(_ctx.stringValue("CreatesSlotTemplateResponse.Model.AdSlotTemplateId"));
		model.setAdSlotTemplateName(_ctx.stringValue("CreatesSlotTemplateResponse.Model.AdSlotTemplateName"));
		model.setAdSlotTemplateTitle(_ctx.stringValue("CreatesSlotTemplateResponse.Model.AdSlotTemplateTitle"));
		model.setAdSlotTemplatePic(_ctx.stringValue("CreatesSlotTemplateResponse.Model.AdSlotTemplatePic"));
		model.setAdSlotTemplatePreview(_ctx.stringValue("CreatesSlotTemplateResponse.Model.AdSlotTemplatePreview"));
		model.setAdSlotTemplateDescription(_ctx.stringValue("CreatesSlotTemplateResponse.Model.AdSlotTemplateDescription"));
		model.setAdSlotType(_ctx.stringValue("CreatesSlotTemplateResponse.Model.AdSlotType"));
		model.setTemplateConfig(_ctx.stringValue("CreatesSlotTemplateResponse.Model.TemplateConfig"));
		model.setExtInfo(_ctx.stringValue("CreatesSlotTemplateResponse.Model.ExtInfo"));
		model.setVersion(_ctx.longValue("CreatesSlotTemplateResponse.Model.Version"));
		createsSlotTemplateResponse.setModel(model);
	 
	 	return createsSlotTemplateResponse;
	}
}