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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.GetPatentPlanInfoListResponse;
import com.aliyuncs.copyright.model.v20190123.GetPatentPlanInfoListResponse.Produces;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPatentPlanInfoListResponseUnmarshaller {

	public static GetPatentPlanInfoListResponse unmarshall(GetPatentPlanInfoListResponse getPatentPlanInfoListResponse, UnmarshallerContext _ctx) {
		
		getPatentPlanInfoListResponse.setRequestId(_ctx.stringValue("GetPatentPlanInfoListResponse.RequestId"));
		getPatentPlanInfoListResponse.setPageNum(_ctx.integerValue("GetPatentPlanInfoListResponse.PageNum"));
		getPatentPlanInfoListResponse.setPageSize(_ctx.integerValue("GetPatentPlanInfoListResponse.PageSize"));
		getPatentPlanInfoListResponse.setSuccess(_ctx.booleanValue("GetPatentPlanInfoListResponse.Success"));
		getPatentPlanInfoListResponse.setTotalItemNum(_ctx.integerValue("GetPatentPlanInfoListResponse.TotalItemNum"));
		getPatentPlanInfoListResponse.setTotalPageNum(_ctx.integerValue("GetPatentPlanInfoListResponse.TotalPageNum"));

		List<Produces> data = new ArrayList<Produces>();
		for (int i = 0; i < _ctx.lengthValue("GetPatentPlanInfoListResponse.Data.Length"); i++) {
			Produces produces = new Produces();
			produces.setContact(_ctx.stringValue("GetPatentPlanInfoListResponse.Data["+ i +"].Contact"));
			produces.setName(_ctx.stringValue("GetPatentPlanInfoListResponse.Data["+ i +"].Name"));
			produces.setOwner(_ctx.stringValue("GetPatentPlanInfoListResponse.Data["+ i +"].Owner"));
			produces.setPlanId(_ctx.longValue("GetPatentPlanInfoListResponse.Data["+ i +"].PlanId"));
			produces.setWarnDays(_ctx.integerValue("GetPatentPlanInfoListResponse.Data["+ i +"].WarnDays"));

			data.add(produces);
		}
		getPatentPlanInfoListResponse.setData(data);
	 
	 	return getPatentPlanInfoListResponse;
	}
}