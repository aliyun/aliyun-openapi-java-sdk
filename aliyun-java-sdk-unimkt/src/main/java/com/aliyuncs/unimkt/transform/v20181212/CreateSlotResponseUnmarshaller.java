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

import com.aliyuncs.unimkt.model.v20181212.CreateSlotResponse;
import com.aliyuncs.unimkt.model.v20181212.CreateSlotResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSlotResponseUnmarshaller {

	public static CreateSlotResponse unmarshall(CreateSlotResponse createSlotResponse, UnmarshallerContext _ctx) {
		
		createSlotResponse.setRequestId(_ctx.stringValue("CreateSlotResponse.RequestId"));
		createSlotResponse.setCode(_ctx.stringValue("CreateSlotResponse.Code"));
		createSlotResponse.setSuccess(_ctx.booleanValue("CreateSlotResponse.Success"));
		createSlotResponse.setMessage(_ctx.stringValue("CreateSlotResponse.Message"));

		Model model = new Model();
		model.setCreateTime(_ctx.longValue("CreateSlotResponse.Model.CreateTime"));
		model.setModifyTime(_ctx.longValue("CreateSlotResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("CreateSlotResponse.Model.TenantId"));
		model.setMediaName(_ctx.stringValue("CreateSlotResponse.Model.MediaName"));
		model.setMediaId(_ctx.stringValue("CreateSlotResponse.Model.MediaId"));
		model.setAdSlotId(_ctx.stringValue("CreateSlotResponse.Model.AdSlotId"));
		model.setAdSlotName(_ctx.stringValue("CreateSlotResponse.Model.AdSlotName"));
		model.setAdSlotType(_ctx.stringValue("CreateSlotResponse.Model.AdSlotType"));
		model.setAdSlotTemplateId(_ctx.stringValue("CreateSlotResponse.Model.AdSlotTemplateId"));
		model.setAdSlotStatus(_ctx.stringValue("CreateSlotResponse.Model.AdSlotStatus"));
		model.setAdSlotCorporateStatus(_ctx.stringValue("CreateSlotResponse.Model.AdSlotCorporateStatus"));
		model.setExtInfo(_ctx.stringValue("CreateSlotResponse.Model.ExtInfo"));
		model.setBlockingRule(_ctx.stringValue("CreateSlotResponse.Model.BlockingRule"));
		model.setInspireScene(_ctx.stringValue("CreateSlotResponse.Model.InspireScene"));
		model.setVersion(_ctx.longValue("CreateSlotResponse.Model.Version"));
		createSlotResponse.setModel(model);
	 
	 	return createSlotResponse;
	}
}