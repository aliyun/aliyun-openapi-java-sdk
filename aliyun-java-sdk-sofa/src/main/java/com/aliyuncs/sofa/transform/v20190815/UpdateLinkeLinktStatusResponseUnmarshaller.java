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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktStatusResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktStatusResponseUnmarshaller {

	public static UpdateLinkeLinktStatusResponse unmarshall(UpdateLinkeLinktStatusResponse updateLinkeLinktStatusResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktStatusResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktStatusResponse.RequestId"));
		updateLinkeLinktStatusResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktStatusResponse.ResultCode"));
		updateLinkeLinktStatusResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktStatusResponse.ResultMessage"));
		updateLinkeLinktStatusResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktStatusResponse.ErrorCode"));
		updateLinkeLinktStatusResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktStatusResponse.ErrorMessage"));
		updateLinkeLinktStatusResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktStatusResponse.Success"));

		Data data = new Data();
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktStatusResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktStatusResponse.Data.Deleted"));
		data.setId(_ctx.longValue("UpdateLinkeLinktStatusResponse.Data.Id"));
		data.setName(_ctx.stringValue("UpdateLinkeLinktStatusResponse.Data.Name"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktStatusResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("UpdateLinkeLinktStatusResponse.Data.Region"));
		data.setStage(_ctx.longValue("UpdateLinkeLinktStatusResponse.Data.Stage"));
		data.setStageName(_ctx.stringValue("UpdateLinkeLinktStatusResponse.Data.StageName"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktStatusResponse.Data.UpdatedAt"));
		updateLinkeLinktStatusResponse.setData(data);
	 
	 	return updateLinkeLinktStatusResponse;
	}
}