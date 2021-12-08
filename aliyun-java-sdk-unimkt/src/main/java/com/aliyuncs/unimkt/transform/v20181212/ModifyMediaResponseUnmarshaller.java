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

import com.aliyuncs.unimkt.model.v20181212.ModifyMediaResponse;
import com.aliyuncs.unimkt.model.v20181212.ModifyMediaResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyMediaResponseUnmarshaller {

	public static ModifyMediaResponse unmarshall(ModifyMediaResponse modifyMediaResponse, UnmarshallerContext _ctx) {
		
		modifyMediaResponse.setRequestId(_ctx.stringValue("ModifyMediaResponse.RequestId"));
		modifyMediaResponse.setCode(_ctx.stringValue("ModifyMediaResponse.Code"));
		modifyMediaResponse.setMessage(_ctx.stringValue("ModifyMediaResponse.Message"));
		modifyMediaResponse.setSuccess(_ctx.booleanValue("ModifyMediaResponse.Success"));

		Model model = new Model();
		model.setAccessWay(_ctx.stringValue("ModifyMediaResponse.Model.AccessWay"));
		model.setSecondScene(_ctx.stringValue("ModifyMediaResponse.Model.SecondScene"));
		model.setCreateTime(_ctx.longValue("ModifyMediaResponse.Model.CreateTime"));
		model.setMediaName(_ctx.stringValue("ModifyMediaResponse.Model.MediaName"));
		model.setOs(_ctx.stringValue("ModifyMediaResponse.Model.Os"));
		model.setMediaType(_ctx.stringValue("ModifyMediaResponse.Model.MediaType"));
		model.setExtInfo(_ctx.stringValue("ModifyMediaResponse.Model.ExtInfo"));
		model.setMediaId(_ctx.stringValue("ModifyMediaResponse.Model.MediaId"));
		model.setConfig(_ctx.stringValue("ModifyMediaResponse.Model.Config"));
		model.setVersion(_ctx.longValue("ModifyMediaResponse.Model.Version"));
		model.setMediaStatus(_ctx.stringValue("ModifyMediaResponse.Model.MediaStatus"));
		model.setKeyWords(_ctx.stringValue("ModifyMediaResponse.Model.KeyWords"));
		model.setAccessStatus(_ctx.stringValue("ModifyMediaResponse.Model.AccessStatus"));
		model.setFirstScene(_ctx.stringValue("ModifyMediaResponse.Model.FirstScene"));
		model.setModifyTime(_ctx.longValue("ModifyMediaResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("ModifyMediaResponse.Model.TenantId"));
		modifyMediaResponse.setModel(model);
	 
	 	return modifyMediaResponse;
	}
}