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

import com.aliyuncs.aiccs.model.v20191015.GetSkillGroupLatitudeStateResponse;
import com.aliyuncs.aiccs.model.v20191015.GetSkillGroupLatitudeStateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSkillGroupLatitudeStateResponseUnmarshaller {

	public static GetSkillGroupLatitudeStateResponse unmarshall(GetSkillGroupLatitudeStateResponse getSkillGroupLatitudeStateResponse, UnmarshallerContext _ctx) {
		
		getSkillGroupLatitudeStateResponse.setRequestId(_ctx.stringValue("GetSkillGroupLatitudeStateResponse.RequestId"));
		getSkillGroupLatitudeStateResponse.setMessage(_ctx.stringValue("GetSkillGroupLatitudeStateResponse.Message"));
		getSkillGroupLatitudeStateResponse.setCode(_ctx.stringValue("GetSkillGroupLatitudeStateResponse.Code"));
		getSkillGroupLatitudeStateResponse.setSuccess(_ctx.stringValue("GetSkillGroupLatitudeStateResponse.Success"));

		Data data = new Data();
		data.setTotalNum(_ctx.integerValue("GetSkillGroupLatitudeStateResponse.Data.TotalNum"));
		data.setPageSize(_ctx.integerValue("GetSkillGroupLatitudeStateResponse.Data.PageSize"));
		data.setPageNum(_ctx.integerValue("GetSkillGroupLatitudeStateResponse.Data.PageNum"));
		data.setRows(_ctx.stringValue("GetSkillGroupLatitudeStateResponse.Data.Rows"));
		getSkillGroupLatitudeStateResponse.setData(data);
	 
	 	return getSkillGroupLatitudeStateResponse;
	}
}