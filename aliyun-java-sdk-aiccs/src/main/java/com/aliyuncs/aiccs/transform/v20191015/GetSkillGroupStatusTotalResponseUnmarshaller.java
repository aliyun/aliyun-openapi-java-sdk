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

import com.aliyuncs.aiccs.model.v20191015.GetSkillGroupStatusTotalResponse;
import com.aliyuncs.aiccs.model.v20191015.GetSkillGroupStatusTotalResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSkillGroupStatusTotalResponseUnmarshaller {

	public static GetSkillGroupStatusTotalResponse unmarshall(GetSkillGroupStatusTotalResponse getSkillGroupStatusTotalResponse, UnmarshallerContext _ctx) {
		
		getSkillGroupStatusTotalResponse.setRequestId(_ctx.stringValue("GetSkillGroupStatusTotalResponse.RequestId"));
		getSkillGroupStatusTotalResponse.setMessage(_ctx.stringValue("GetSkillGroupStatusTotalResponse.Message"));
		getSkillGroupStatusTotalResponse.setCode(_ctx.stringValue("GetSkillGroupStatusTotalResponse.Code"));
		getSkillGroupStatusTotalResponse.setSuccess(_ctx.stringValue("GetSkillGroupStatusTotalResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("GetSkillGroupStatusTotalResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("GetSkillGroupStatusTotalResponse.Data.PageSize"));
		data.setTotalNum(_ctx.longValue("GetSkillGroupStatusTotalResponse.Data.TotalNum"));
		data.setRows(_ctx.stringValue("GetSkillGroupStatusTotalResponse.Data.Rows"));
		getSkillGroupStatusTotalResponse.setData(data);
	 
	 	return getSkillGroupStatusTotalResponse;
	}
}