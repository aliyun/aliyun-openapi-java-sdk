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

import com.aliyuncs.copyright.model.v20190123.GetPatentPlanListResponse;
import com.aliyuncs.copyright.model.v20190123.GetPatentPlanListResponse.Produces;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPatentPlanListResponseUnmarshaller {

	public static GetPatentPlanListResponse unmarshall(GetPatentPlanListResponse getPatentPlanListResponse, UnmarshallerContext _ctx) {
		
		getPatentPlanListResponse.setRequestId(_ctx.stringValue("GetPatentPlanListResponse.RequestId"));
		getPatentPlanListResponse.setPageNum(_ctx.integerValue("GetPatentPlanListResponse.PageNum"));
		getPatentPlanListResponse.setSuccess(_ctx.booleanValue("GetPatentPlanListResponse.Success"));
		getPatentPlanListResponse.setTotalItemNum(_ctx.integerValue("GetPatentPlanListResponse.TotalItemNum"));
		getPatentPlanListResponse.setPageSize(_ctx.integerValue("GetPatentPlanListResponse.PageSize"));
		getPatentPlanListResponse.setTotalPageNum(_ctx.integerValue("GetPatentPlanListResponse.TotalPageNum"));

		List<Produces> data = new ArrayList<Produces>();
		for (int i = 0; i < _ctx.lengthValue("GetPatentPlanListResponse.Data.Length"); i++) {
			Produces produces = new Produces();
			produces.setOwner(_ctx.stringValue("GetPatentPlanListResponse.Data["+ i +"].Owner"));
			produces.setContact(_ctx.stringValue("GetPatentPlanListResponse.Data["+ i +"].Contact"));
			produces.setSoldCount(_ctx.integerValue("GetPatentPlanListResponse.Data["+ i +"].SoldCount"));
			produces.setUnSoldCount(_ctx.stringValue("GetPatentPlanListResponse.Data["+ i +"].UnSoldCount"));
			produces.setName(_ctx.stringValue("GetPatentPlanListResponse.Data["+ i +"].Name"));
			produces.setPlanId(_ctx.longValue("GetPatentPlanListResponse.Data["+ i +"].PlanId"));
			produces.setTotalCount(_ctx.integerValue("GetPatentPlanListResponse.Data["+ i +"].TotalCount"));

			data.add(produces);
		}
		getPatentPlanListResponse.setData(data);
	 
	 	return getPatentPlanListResponse;
	}
}