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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeLinktRemovestatusResponse;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeLinktRemovestatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeLinktRemovestatusResponseUnmarshaller {

	public static CheckLinkeLinktRemovestatusResponse unmarshall(CheckLinkeLinktRemovestatusResponse checkLinkeLinktRemovestatusResponse, UnmarshallerContext _ctx) {
		
		checkLinkeLinktRemovestatusResponse.setRequestId(_ctx.stringValue("CheckLinkeLinktRemovestatusResponse.RequestId"));
		checkLinkeLinktRemovestatusResponse.setResultCode(_ctx.stringValue("CheckLinkeLinktRemovestatusResponse.ResultCode"));
		checkLinkeLinktRemovestatusResponse.setResultMessage(_ctx.stringValue("CheckLinkeLinktRemovestatusResponse.ResultMessage"));
		checkLinkeLinktRemovestatusResponse.setErrorCode(_ctx.longValue("CheckLinkeLinktRemovestatusResponse.ErrorCode"));
		checkLinkeLinktRemovestatusResponse.setErrorMessage(_ctx.stringValue("CheckLinkeLinktRemovestatusResponse.ErrorMessage"));
		checkLinkeLinktRemovestatusResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeLinktRemovestatusResponse.ResponseStatusCode"));
		checkLinkeLinktRemovestatusResponse.setSuccess(_ctx.booleanValue("CheckLinkeLinktRemovestatusResponse.Success"));

		Data data = new Data();
		data.setCheckSuccess(_ctx.booleanValue("CheckLinkeLinktRemovestatusResponse.Data.CheckSuccess"));
		data.setErrorCode(_ctx.longValue("CheckLinkeLinktRemovestatusResponse.Data.ErrorCode"));
		data.setWorkItemCount(_ctx.longValue("CheckLinkeLinktRemovestatusResponse.Data.WorkItemCount"));

		List<String> asDefaultStatusWorkflows = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CheckLinkeLinktRemovestatusResponse.Data.AsDefaultStatusWorkflows.Length"); i++) {
			asDefaultStatusWorkflows.add(_ctx.stringValue("CheckLinkeLinktRemovestatusResponse.Data.AsDefaultStatusWorkflows["+ i +"]"));
		}
		data.setAsDefaultStatusWorkflows(asDefaultStatusWorkflows);

		List<String> toConvertStatusWorkflows = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CheckLinkeLinktRemovestatusResponse.Data.ToConvertStatusWorkflows.Length"); i++) {
			toConvertStatusWorkflows.add(_ctx.stringValue("CheckLinkeLinktRemovestatusResponse.Data.ToConvertStatusWorkflows["+ i +"]"));
		}
		data.setToConvertStatusWorkflows(toConvertStatusWorkflows);
		checkLinkeLinktRemovestatusResponse.setData(data);
	 
	 	return checkLinkeLinktRemovestatusResponse;
	}
}