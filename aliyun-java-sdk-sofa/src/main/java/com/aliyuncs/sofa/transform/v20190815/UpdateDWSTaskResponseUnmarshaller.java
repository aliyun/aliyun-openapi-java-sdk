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

import com.aliyuncs.sofa.model.v20190815.UpdateDWSTaskResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateDWSTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDWSTaskResponseUnmarshaller {

	public static UpdateDWSTaskResponse unmarshall(UpdateDWSTaskResponse updateDWSTaskResponse, UnmarshallerContext _ctx) {
		
		updateDWSTaskResponse.setRequestId(_ctx.stringValue("UpdateDWSTaskResponse.RequestId"));
		updateDWSTaskResponse.setResultCode(_ctx.stringValue("UpdateDWSTaskResponse.ResultCode"));
		updateDWSTaskResponse.setResultMessage(_ctx.stringValue("UpdateDWSTaskResponse.ResultMessage"));

		Data data = new Data();
		data.setDstCategory(_ctx.stringValue("UpdateDWSTaskResponse.Data.DstCategory"));
		data.setGmtCreate(_ctx.stringValue("UpdateDWSTaskResponse.Data.GmtCreate"));
		data.setId(_ctx.stringValue("UpdateDWSTaskResponse.Data.Id"));
		data.setLinkman(_ctx.stringValue("UpdateDWSTaskResponse.Data.Linkman"));
		data.setName(_ctx.stringValue("UpdateDWSTaskResponse.Data.Name"));
		data.setScenarios(_ctx.stringValue("UpdateDWSTaskResponse.Data.Scenarios"));
		data.setSrcCategory(_ctx.stringValue("UpdateDWSTaskResponse.Data.SrcCategory"));
		data.setStatus(_ctx.stringValue("UpdateDWSTaskResponse.Data.Status"));
		data.setTaskParamJson(_ctx.stringValue("UpdateDWSTaskResponse.Data.TaskParamJson"));
		updateDWSTaskResponse.setData(data);
	 
	 	return updateDWSTaskResponse;
	}
}