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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktRiskResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktRiskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktRiskResponseUnmarshaller {

	public static UpdateLinkeLinktRiskResponse unmarshall(UpdateLinkeLinktRiskResponse updateLinkeLinktRiskResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktRiskResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktRiskResponse.RequestId"));
		updateLinkeLinktRiskResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktRiskResponse.ResultCode"));
		updateLinkeLinktRiskResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktRiskResponse.ResultMessage"));
		updateLinkeLinktRiskResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktRiskResponse.ErrorCode"));
		updateLinkeLinktRiskResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktRiskResponse.ErrorMessage"));
		updateLinkeLinktRiskResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinktRiskResponse.ResponseStatusCode"));
		updateLinkeLinktRiskResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktRiskResponse.Success"));

		Data data = new Data();
		data.setAssignedTo(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.AssignedTo"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktRiskResponse.Data.Deleted"));
		data.setExpectedCompletionDate(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.ExpectedCompletionDate"));
		data.setId(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.Id"));
		data.setLevel(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Level"));
		data.setPriority(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.Priority"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Region"));
		data.setRemark(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Remark"));
		data.setStatus(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Status"));
		data.setTitle(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Title"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktRiskResponse.Data.UpdatedAt"));

		List<String> cc = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktRiskResponse.Data.Cc.Length"); i++) {
			cc.add(_ctx.stringValue("UpdateLinkeLinktRiskResponse.Data.Cc["+ i +"]"));
		}
		data.setCc(cc);
		updateLinkeLinktRiskResponse.setData(data);
	 
	 	return updateLinkeLinktRiskResponse;
	}
}