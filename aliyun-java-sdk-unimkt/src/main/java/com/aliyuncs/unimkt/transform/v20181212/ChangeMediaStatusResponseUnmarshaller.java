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

import com.aliyuncs.unimkt.model.v20181212.ChangeMediaStatusResponse;
import com.aliyuncs.unimkt.model.v20181212.ChangeMediaStatusResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeMediaStatusResponseUnmarshaller {

	public static ChangeMediaStatusResponse unmarshall(ChangeMediaStatusResponse changeMediaStatusResponse, UnmarshallerContext _ctx) {
		
		changeMediaStatusResponse.setRequestId(_ctx.stringValue("ChangeMediaStatusResponse.RequestId"));
		changeMediaStatusResponse.setCode(_ctx.stringValue("ChangeMediaStatusResponse.Code"));
		changeMediaStatusResponse.setSuccess(_ctx.booleanValue("ChangeMediaStatusResponse.Success"));
		changeMediaStatusResponse.setMessage(_ctx.stringValue("ChangeMediaStatusResponse.Message"));

		Model model = new Model();
		model.setCreateTime(_ctx.longValue("ChangeMediaStatusResponse.Model.CreateTime"));
		model.setModifyTime(_ctx.longValue("ChangeMediaStatusResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("ChangeMediaStatusResponse.Model.TenantId"));
		model.setMediaName(_ctx.stringValue("ChangeMediaStatusResponse.Model.MediaName"));
		model.setMediaId(_ctx.stringValue("ChangeMediaStatusResponse.Model.MediaId"));
		model.setMediaType(_ctx.stringValue("ChangeMediaStatusResponse.Model.MediaType"));
		model.setFirstScene(_ctx.stringValue("ChangeMediaStatusResponse.Model.FirstScene"));
		model.setSecondScene(_ctx.stringValue("ChangeMediaStatusResponse.Model.SecondScene"));
		model.setMediaStatus(_ctx.stringValue("ChangeMediaStatusResponse.Model.MediaStatus"));
		model.setAccessStatus(_ctx.stringValue("ChangeMediaStatusResponse.Model.AccessStatus"));
		model.setOs(_ctx.stringValue("ChangeMediaStatusResponse.Model.Os"));
		model.setConfig(_ctx.stringValue("ChangeMediaStatusResponse.Model.Config"));
		model.setKeyWords(_ctx.stringValue("ChangeMediaStatusResponse.Model.KeyWords"));
		model.setAccessWay(_ctx.stringValue("ChangeMediaStatusResponse.Model.AccessWay"));
		model.setExtInfo(_ctx.stringValue("ChangeMediaStatusResponse.Model.ExtInfo"));
		model.setVersion(_ctx.longValue("ChangeMediaStatusResponse.Model.Version"));
		changeMediaStatusResponse.setModel(model);
	 
	 	return changeMediaStatusResponse;
	}
}