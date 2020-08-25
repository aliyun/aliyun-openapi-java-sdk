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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktRiskResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktRiskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktRiskResponseUnmarshaller {

	public static CreateLinkeLinktRiskResponse unmarshall(CreateLinkeLinktRiskResponse createLinkeLinktRiskResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktRiskResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktRiskResponse.RequestId"));
		createLinkeLinktRiskResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktRiskResponse.ResultCode"));
		createLinkeLinktRiskResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktRiskResponse.ResultMessage"));
		createLinkeLinktRiskResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktRiskResponse.ErrorCode"));
		createLinkeLinktRiskResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktRiskResponse.ErrorMessage"));
		createLinkeLinktRiskResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeLinktRiskResponse.ResponseStatusCode"));
		createLinkeLinktRiskResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktRiskResponse.Success"));

		Data data = new Data();
		data.setAssignedTo(_ctx.stringValue("CreateLinkeLinktRiskResponse.Data.AssignedTo"));
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktRiskResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("CreateLinkeLinktRiskResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("CreateLinkeLinktRiskResponse.Data.Deleted"));
		data.setExpectedCompletionDate(_ctx.longValue("CreateLinkeLinktRiskResponse.Data.ExpectedCompletionDate"));
		data.setId(_ctx.longValue("CreateLinkeLinktRiskResponse.Data.Id"));
		data.setLevel(_ctx.stringValue("CreateLinkeLinktRiskResponse.Data.Level"));
		data.setPriority(_ctx.longValue("CreateLinkeLinktRiskResponse.Data.Priority"));
		data.setProjectSign(_ctx.stringValue("CreateLinkeLinktRiskResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("CreateLinkeLinktRiskResponse.Data.Region"));
		data.setRemark(_ctx.stringValue("CreateLinkeLinktRiskResponse.Data.Remark"));
		data.setStatus(_ctx.stringValue("CreateLinkeLinktRiskResponse.Data.Status"));
		data.setTitle(_ctx.stringValue("CreateLinkeLinktRiskResponse.Data.Title"));
		data.setUpdatedAt(_ctx.longValue("CreateLinkeLinktRiskResponse.Data.UpdatedAt"));

		List<String> cc = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktRiskResponse.Data.Cc.Length"); i++) {
			cc.add(_ctx.stringValue("CreateLinkeLinktRiskResponse.Data.Cc["+ i +"]"));
		}
		data.setCc(cc);
		createLinkeLinktRiskResponse.setData(data);
	 
	 	return createLinkeLinktRiskResponse;
	}
}