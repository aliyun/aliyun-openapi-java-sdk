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

import com.aliyuncs.unimkt.model.v20181212.CreateMediaResponse;
import com.aliyuncs.unimkt.model.v20181212.CreateMediaResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMediaResponseUnmarshaller {

	public static CreateMediaResponse unmarshall(CreateMediaResponse createMediaResponse, UnmarshallerContext _ctx) {
		
		createMediaResponse.setRequestId(_ctx.stringValue("CreateMediaResponse.RequestId"));
		createMediaResponse.setCode(_ctx.stringValue("CreateMediaResponse.Code"));
		createMediaResponse.setMessage(_ctx.stringValue("CreateMediaResponse.Message"));
		createMediaResponse.setSuccess(_ctx.booleanValue("CreateMediaResponse.Success"));

		Model model = new Model();
		model.setAccessWay(_ctx.stringValue("CreateMediaResponse.Model.AccessWay"));
		model.setSecondScene(_ctx.stringValue("CreateMediaResponse.Model.SecondScene"));
		model.setCreateTime(_ctx.longValue("CreateMediaResponse.Model.CreateTime"));
		model.setMediaName(_ctx.stringValue("CreateMediaResponse.Model.MediaName"));
		model.setOs(_ctx.stringValue("CreateMediaResponse.Model.Os"));
		model.setMediaType(_ctx.stringValue("CreateMediaResponse.Model.MediaType"));
		model.setExtInfo(_ctx.stringValue("CreateMediaResponse.Model.ExtInfo"));
		model.setMediaId(_ctx.stringValue("CreateMediaResponse.Model.MediaId"));
		model.setConfig(_ctx.stringValue("CreateMediaResponse.Model.Config"));
		model.setVersion(_ctx.longValue("CreateMediaResponse.Model.Version"));
		model.setMediaStatus(_ctx.stringValue("CreateMediaResponse.Model.MediaStatus"));
		model.setKeyWords(_ctx.stringValue("CreateMediaResponse.Model.KeyWords"));
		model.setAccessStatus(_ctx.stringValue("CreateMediaResponse.Model.AccessStatus"));
		model.setFirstScene(_ctx.stringValue("CreateMediaResponse.Model.FirstScene"));
		model.setModifyTime(_ctx.longValue("CreateMediaResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("CreateMediaResponse.Model.TenantId"));
		createMediaResponse.setModel(model);
	 
	 	return createMediaResponse;
	}
}