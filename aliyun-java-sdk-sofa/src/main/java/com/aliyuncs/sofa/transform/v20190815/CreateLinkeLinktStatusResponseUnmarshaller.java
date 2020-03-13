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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktStatusResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktStatusResponseUnmarshaller {

	public static CreateLinkeLinktStatusResponse unmarshall(CreateLinkeLinktStatusResponse createLinkeLinktStatusResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktStatusResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktStatusResponse.RequestId"));
		createLinkeLinktStatusResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktStatusResponse.ResultCode"));
		createLinkeLinktStatusResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktStatusResponse.ResultMessage"));
		createLinkeLinktStatusResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktStatusResponse.ErrorCode"));
		createLinkeLinktStatusResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktStatusResponse.ErrorMessage"));
		createLinkeLinktStatusResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktStatusResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktStatusResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("CreateLinkeLinktStatusResponse.Data.Deleted"));
		data.setId(_ctx.longValue("CreateLinkeLinktStatusResponse.Data.Id"));
		data.setName(_ctx.stringValue("CreateLinkeLinktStatusResponse.Data.Name"));
		data.setProjectSign(_ctx.stringValue("CreateLinkeLinktStatusResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("CreateLinkeLinktStatusResponse.Data.Region"));
		data.setStage(_ctx.longValue("CreateLinkeLinktStatusResponse.Data.Stage"));
		data.setStageName(_ctx.stringValue("CreateLinkeLinktStatusResponse.Data.StageName"));
		data.setUpdatedAt(_ctx.longValue("CreateLinkeLinktStatusResponse.Data.UpdatedAt"));
		createLinkeLinktStatusResponse.setData(data);
	 
	 	return createLinkeLinktStatusResponse;
	}
}