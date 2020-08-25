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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktRiskResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktRiskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinktRiskResponseUnmarshaller {

	public static GetLinkeLinktRiskResponse unmarshall(GetLinkeLinktRiskResponse getLinkeLinktRiskResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinktRiskResponse.setRequestId(_ctx.stringValue("GetLinkeLinktRiskResponse.RequestId"));
		getLinkeLinktRiskResponse.setResultCode(_ctx.stringValue("GetLinkeLinktRiskResponse.ResultCode"));
		getLinkeLinktRiskResponse.setResultMessage(_ctx.stringValue("GetLinkeLinktRiskResponse.ResultMessage"));
		getLinkeLinktRiskResponse.setErrorCode(_ctx.longValue("GetLinkeLinktRiskResponse.ErrorCode"));
		getLinkeLinktRiskResponse.setErrorMessage(_ctx.stringValue("GetLinkeLinktRiskResponse.ErrorMessage"));
		getLinkeLinktRiskResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinktRiskResponse.ResponseStatusCode"));
		getLinkeLinktRiskResponse.setSuccess(_ctx.booleanValue("GetLinkeLinktRiskResponse.Success"));

		Data data = new Data();
		data.setAssignedTo(_ctx.stringValue("GetLinkeLinktRiskResponse.Data.AssignedTo"));
		data.setCreatedAt(_ctx.longValue("GetLinkeLinktRiskResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("GetLinkeLinktRiskResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("GetLinkeLinktRiskResponse.Data.Deleted"));
		data.setExpectedCompletionDate(_ctx.longValue("GetLinkeLinktRiskResponse.Data.ExpectedCompletionDate"));
		data.setId(_ctx.longValue("GetLinkeLinktRiskResponse.Data.Id"));
		data.setLevel(_ctx.stringValue("GetLinkeLinktRiskResponse.Data.Level"));
		data.setPriority(_ctx.longValue("GetLinkeLinktRiskResponse.Data.Priority"));
		data.setProjectSign(_ctx.stringValue("GetLinkeLinktRiskResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("GetLinkeLinktRiskResponse.Data.Region"));
		data.setRemark(_ctx.stringValue("GetLinkeLinktRiskResponse.Data.Remark"));
		data.setStatus(_ctx.stringValue("GetLinkeLinktRiskResponse.Data.Status"));
		data.setTitle(_ctx.stringValue("GetLinkeLinktRiskResponse.Data.Title"));
		data.setUpdatedAt(_ctx.longValue("GetLinkeLinktRiskResponse.Data.UpdatedAt"));

		List<String> cc = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinktRiskResponse.Data.Cc.Length"); i++) {
			cc.add(_ctx.stringValue("GetLinkeLinktRiskResponse.Data.Cc["+ i +"]"));
		}
		data.setCc(cc);
		getLinkeLinktRiskResponse.setData(data);
	 
	 	return getLinkeLinktRiskResponse;
	}
}