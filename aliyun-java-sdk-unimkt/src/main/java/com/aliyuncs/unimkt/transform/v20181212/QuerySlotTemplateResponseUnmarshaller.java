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

import com.aliyuncs.unimkt.model.v20181212.QuerySlotTemplateResponse;
import com.aliyuncs.unimkt.model.v20181212.QuerySlotTemplateResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySlotTemplateResponseUnmarshaller {

	public static QuerySlotTemplateResponse unmarshall(QuerySlotTemplateResponse querySlotTemplateResponse, UnmarshallerContext _ctx) {
		
		querySlotTemplateResponse.setRequestId(_ctx.stringValue("QuerySlotTemplateResponse.RequestId"));
		querySlotTemplateResponse.setCode(_ctx.stringValue("QuerySlotTemplateResponse.Code"));
		querySlotTemplateResponse.setSuccess(_ctx.booleanValue("QuerySlotTemplateResponse.Success"));
		querySlotTemplateResponse.setMessage(_ctx.stringValue("QuerySlotTemplateResponse.Message"));

		Model model = new Model();
		model.setCreateTime(_ctx.longValue("QuerySlotTemplateResponse.Model.CreateTime"));
		model.setModifyTime(_ctx.longValue("QuerySlotTemplateResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("QuerySlotTemplateResponse.Model.TenantId"));
		model.setAdSlotTemplateId(_ctx.stringValue("QuerySlotTemplateResponse.Model.AdSlotTemplateId"));
		model.setAdSlotTemplateName(_ctx.stringValue("QuerySlotTemplateResponse.Model.AdSlotTemplateName"));
		model.setAdSlotTemplateTitle(_ctx.stringValue("QuerySlotTemplateResponse.Model.AdSlotTemplateTitle"));
		model.setAdSlotTemplatePic(_ctx.stringValue("QuerySlotTemplateResponse.Model.AdSlotTemplatePic"));
		model.setAdSlotTemplatePreview(_ctx.stringValue("QuerySlotTemplateResponse.Model.AdSlotTemplatePreview"));
		model.setAdSlotTemplateDescription(_ctx.stringValue("QuerySlotTemplateResponse.Model.AdSlotTemplateDescription"));
		model.setAdSlotType(_ctx.stringValue("QuerySlotTemplateResponse.Model.AdSlotType"));
		model.setTemplateConfig(_ctx.stringValue("QuerySlotTemplateResponse.Model.TemplateConfig"));
		model.setExtInfo(_ctx.stringValue("QuerySlotTemplateResponse.Model.ExtInfo"));
		model.setVersion(_ctx.longValue("QuerySlotTemplateResponse.Model.Version"));
		querySlotTemplateResponse.setModel(model);
	 
	 	return querySlotTemplateResponse;
	}
}