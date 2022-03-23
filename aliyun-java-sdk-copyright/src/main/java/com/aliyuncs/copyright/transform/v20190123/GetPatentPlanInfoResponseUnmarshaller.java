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

import com.aliyuncs.copyright.model.v20190123.GetPatentPlanInfoResponse;
import com.aliyuncs.copyright.model.v20190123.GetPatentPlanInfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPatentPlanInfoResponseUnmarshaller {

	public static GetPatentPlanInfoResponse unmarshall(GetPatentPlanInfoResponse getPatentPlanInfoResponse, UnmarshallerContext _ctx) {
		
		getPatentPlanInfoResponse.setRequestId(_ctx.stringValue("GetPatentPlanInfoResponse.RequestId"));
		getPatentPlanInfoResponse.setSuccess(_ctx.booleanValue("GetPatentPlanInfoResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPatentPlanInfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setOwner(_ctx.stringValue("GetPatentPlanInfoResponse.Data["+ i +"].Owner"));
			dataItem.setPlanId(_ctx.integerValue("GetPatentPlanInfoResponse.Data["+ i +"].PlanId"));
			dataItem.setName(_ctx.stringValue("GetPatentPlanInfoResponse.Data["+ i +"].Name"));
			dataItem.setContact(_ctx.stringValue("GetPatentPlanInfoResponse.Data["+ i +"].Contact"));
			dataItem.setWarnDays(_ctx.integerValue("GetPatentPlanInfoResponse.Data["+ i +"].WarnDays"));

			data.add(dataItem);
		}
		getPatentPlanInfoResponse.setData(data);
	 
	 	return getPatentPlanInfoResponse;
	}
}