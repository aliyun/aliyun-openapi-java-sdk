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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSQLPlansResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSQLPlansResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLPlansResponseUnmarshaller {

	public static DescribeSQLPlansResponse unmarshall(DescribeSQLPlansResponse describeSQLPlansResponse, UnmarshallerContext _ctx) {
		
		describeSQLPlansResponse.setRequestId(_ctx.stringValue("DescribeSQLPlansResponse.RequestId"));

		List<Data> sQLPlans = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLPlansResponse.SQLPlans.Length"); i++) {
			Data data = new Data();
			data.setHitCount(_ctx.integerValue("DescribeSQLPlansResponse.SQLPlans["+ i +"].HitCount"));
			data.setOutlineData(_ctx.stringValue("DescribeSQLPlansResponse.SQLPlans["+ i +"].OutlineData"));
			data.setAvgExecutionMS(_ctx.floatValue("DescribeSQLPlansResponse.SQLPlans["+ i +"].AvgExecutionMS"));
			data.setPlanUnionHash(_ctx.stringValue("DescribeSQLPlansResponse.SQLPlans["+ i +"].PlanUnionHash"));
			data.setOutlineId(_ctx.longValue("DescribeSQLPlansResponse.SQLPlans["+ i +"].OutlineId"));
			data.setAvgExecutionTimeMS(_ctx.longValue("DescribeSQLPlansResponse.SQLPlans["+ i +"].AvgExecutionTimeMS"));
			data.setPlanId(_ctx.integerValue("DescribeSQLPlansResponse.SQLPlans["+ i +"].PlanId"));
			data.setOutlineTime(_ctx.longValue("DescribeSQLPlansResponse.SQLPlans["+ i +"].OutlineTime"));
			data.setOutlineTimeUTCString(_ctx.stringValue("DescribeSQLPlansResponse.SQLPlans["+ i +"].OutlineTimeUTCString"));
			data.setPlanFull(_ctx.stringValue("DescribeSQLPlansResponse.SQLPlans["+ i +"].PlanFull"));
			data.setNodeIp(_ctx.stringValue("DescribeSQLPlansResponse.SQLPlans["+ i +"].NodeIp"));
			data.setMergedVersion(_ctx.integerValue("DescribeSQLPlansResponse.SQLPlans["+ i +"].MergedVersion"));
			data.setQuerySQL(_ctx.stringValue("DescribeSQLPlansResponse.SQLPlans["+ i +"].QuerySQL"));
			data.setFirstLoadTimeUTCString(_ctx.stringValue("DescribeSQLPlansResponse.SQLPlans["+ i +"].FirstLoadTimeUTCString"));
			data.setFirstLoadTime(_ctx.longValue("DescribeSQLPlansResponse.SQLPlans["+ i +"].FirstLoadTime"));
			data.setPlanInfo(_ctx.stringValue("DescribeSQLPlansResponse.SQLPlans["+ i +"].PlanInfo"));

			sQLPlans.add(data);
		}
		describeSQLPlansResponse.setSQLPlans(sQLPlans);
	 
	 	return describeSQLPlansResponse;
	}
}