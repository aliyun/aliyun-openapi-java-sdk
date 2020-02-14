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

package com.aliyuncs.cloudesl.transform.v20190801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20190801.DescribePlanogramRailsResponse;
import com.aliyuncs.cloudesl.model.v20190801.DescribePlanogramRailsResponse.PlanogramRailInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePlanogramRailsResponseUnmarshaller {

	public static DescribePlanogramRailsResponse unmarshall(DescribePlanogramRailsResponse describePlanogramRailsResponse, UnmarshallerContext _ctx) {
		
		describePlanogramRailsResponse.setRequestId(_ctx.stringValue("DescribePlanogramRailsResponse.RequestId"));
		describePlanogramRailsResponse.setDynamicMessage(_ctx.stringValue("DescribePlanogramRailsResponse.DynamicMessage"));
		describePlanogramRailsResponse.setSuccess(_ctx.booleanValue("DescribePlanogramRailsResponse.Success"));
		describePlanogramRailsResponse.setErrorMessage(_ctx.stringValue("DescribePlanogramRailsResponse.ErrorMessage"));
		describePlanogramRailsResponse.setErrorCode(_ctx.stringValue("DescribePlanogramRailsResponse.ErrorCode"));
		describePlanogramRailsResponse.setMessage(_ctx.stringValue("DescribePlanogramRailsResponse.Message"));
		describePlanogramRailsResponse.setPageNumber(_ctx.integerValue("DescribePlanogramRailsResponse.PageNumber"));
		describePlanogramRailsResponse.setDynamicCode(_ctx.stringValue("DescribePlanogramRailsResponse.DynamicCode"));
		describePlanogramRailsResponse.setStoreId(_ctx.stringValue("DescribePlanogramRailsResponse.StoreId"));
		describePlanogramRailsResponse.setTotalCount(_ctx.integerValue("DescribePlanogramRailsResponse.TotalCount"));
		describePlanogramRailsResponse.setCode(_ctx.stringValue("DescribePlanogramRailsResponse.Code"));
		describePlanogramRailsResponse.setPageSize(_ctx.integerValue("DescribePlanogramRailsResponse.PageSize"));

		List<PlanogramRailInfo> planogramRailInfos = new ArrayList<PlanogramRailInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribePlanogramRailsResponse.PlanogramRailInfos.Length"); i++) {
			PlanogramRailInfo planogramRailInfo = new PlanogramRailInfo();
			planogramRailInfo.setShelf(_ctx.stringValue("DescribePlanogramRailsResponse.PlanogramRailInfos["+ i +"].Shelf"));
			planogramRailInfo.setRailCode(_ctx.stringValue("DescribePlanogramRailsResponse.PlanogramRailInfos["+ i +"].RailCode"));
			planogramRailInfo.setLayer(_ctx.stringValue("DescribePlanogramRailsResponse.PlanogramRailInfos["+ i +"].Layer"));
			planogramRailInfo.setGapUnit(_ctx.integerValue("DescribePlanogramRailsResponse.PlanogramRailInfos["+ i +"].GapUnit"));

			planogramRailInfos.add(planogramRailInfo);
		}
		describePlanogramRailsResponse.setPlanogramRailInfos(planogramRailInfos);
	 
	 	return describePlanogramRailsResponse;
	}
}