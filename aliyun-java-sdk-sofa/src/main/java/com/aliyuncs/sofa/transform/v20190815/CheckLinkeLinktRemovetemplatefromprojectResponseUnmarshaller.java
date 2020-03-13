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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeLinktRemovetemplatefromprojectResponse;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeLinktRemovetemplatefromprojectResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeLinktRemovetemplatefromprojectResponseUnmarshaller {

	public static CheckLinkeLinktRemovetemplatefromprojectResponse unmarshall(CheckLinkeLinktRemovetemplatefromprojectResponse checkLinkeLinktRemovetemplatefromprojectResponse, UnmarshallerContext _ctx) {
		
		checkLinkeLinktRemovetemplatefromprojectResponse.setRequestId(_ctx.stringValue("CheckLinkeLinktRemovetemplatefromprojectResponse.RequestId"));
		checkLinkeLinktRemovetemplatefromprojectResponse.setResultCode(_ctx.stringValue("CheckLinkeLinktRemovetemplatefromprojectResponse.ResultCode"));
		checkLinkeLinktRemovetemplatefromprojectResponse.setResultMessage(_ctx.stringValue("CheckLinkeLinktRemovetemplatefromprojectResponse.ResultMessage"));
		checkLinkeLinktRemovetemplatefromprojectResponse.setErrorCode(_ctx.longValue("CheckLinkeLinktRemovetemplatefromprojectResponse.ErrorCode"));
		checkLinkeLinktRemovetemplatefromprojectResponse.setErrorMessage(_ctx.stringValue("CheckLinkeLinktRemovetemplatefromprojectResponse.ErrorMessage"));
		checkLinkeLinktRemovetemplatefromprojectResponse.setSuccess(_ctx.booleanValue("CheckLinkeLinktRemovetemplatefromprojectResponse.Success"));

		Data data = new Data();
		data.setCheckSuccess(_ctx.booleanValue("CheckLinkeLinktRemovetemplatefromprojectResponse.Data.CheckSuccess"));
		data.setErrorCode(_ctx.longValue("CheckLinkeLinktRemovetemplatefromprojectResponse.Data.ErrorCode"));
		data.setTemplateId(_ctx.longValue("CheckLinkeLinktRemovetemplatefromprojectResponse.Data.TemplateId"));
		data.setWorkItemCount(_ctx.longValue("CheckLinkeLinktRemovetemplatefromprojectResponse.Data.WorkItemCount"));
		checkLinkeLinktRemovetemplatefromprojectResponse.setData(data);
	 
	 	return checkLinkeLinktRemovetemplatefromprojectResponse;
	}
}