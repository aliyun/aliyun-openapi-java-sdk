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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.GetSkillGroupServiceStatusResponse;
import com.aliyuncs.aiccs.model.v20191015.GetSkillGroupServiceStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSkillGroupServiceStatusResponseUnmarshaller {

	public static GetSkillGroupServiceStatusResponse unmarshall(GetSkillGroupServiceStatusResponse getSkillGroupServiceStatusResponse, UnmarshallerContext _ctx) {
		
		getSkillGroupServiceStatusResponse.setRequestId(_ctx.stringValue("GetSkillGroupServiceStatusResponse.RequestId"));
		getSkillGroupServiceStatusResponse.setMessage(_ctx.stringValue("GetSkillGroupServiceStatusResponse.Message"));
		getSkillGroupServiceStatusResponse.setCode(_ctx.stringValue("GetSkillGroupServiceStatusResponse.Code"));
		getSkillGroupServiceStatusResponse.setSuccess(_ctx.stringValue("GetSkillGroupServiceStatusResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("GetSkillGroupServiceStatusResponse.Data.PageSize"));
		data.setTotalNum(_ctx.integerValue("GetSkillGroupServiceStatusResponse.Data.TotalNum"));
		data.setRows(_ctx.stringValue("GetSkillGroupServiceStatusResponse.Data.Rows"));
		data.setPageNum(_ctx.integerValue("GetSkillGroupServiceStatusResponse.Data.PageNum"));
		getSkillGroupServiceStatusResponse.setData(data);
	 
	 	return getSkillGroupServiceStatusResponse;
	}
}