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

package com.aliyuncs.savingplan.transform.v20200715;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.savingplan.model.v20200715.QuerySavingPlanInstanceInnerResponse;
import com.aliyuncs.savingplan.model.v20200715.QuerySavingPlanInstanceInnerResponse.Data;
import com.aliyuncs.savingplan.model.v20200715.QuerySavingPlanInstanceInnerResponse.Data.SpnInstanceDetailDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySavingPlanInstanceInnerResponseUnmarshaller {

	public static QuerySavingPlanInstanceInnerResponse unmarshall(QuerySavingPlanInstanceInnerResponse querySavingPlanInstanceInnerResponse, UnmarshallerContext _ctx) {
		
		querySavingPlanInstanceInnerResponse.setRequestId(_ctx.stringValue("QuerySavingPlanInstanceInnerResponse.RequestId"));
		querySavingPlanInstanceInnerResponse.setMessage(_ctx.stringValue("QuerySavingPlanInstanceInnerResponse.Message"));
		querySavingPlanInstanceInnerResponse.setCode(_ctx.stringValue("QuerySavingPlanInstanceInnerResponse.Code"));
		querySavingPlanInstanceInnerResponse.setSuccess(_ctx.booleanValue("QuerySavingPlanInstanceInnerResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("QuerySavingPlanInstanceInnerResponse.Data.TotalCount"));
		data.setPageSize(_ctx.integerValue("QuerySavingPlanInstanceInnerResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("QuerySavingPlanInstanceInnerResponse.Data.CurrentPage"));

		List<SpnInstanceDetailDTO> datas = new ArrayList<SpnInstanceDetailDTO>();
		for (int i = 0; i < _ctx.lengthValue("QuerySavingPlanInstanceInnerResponse.Data.Datas.Length"); i++) {
			SpnInstanceDetailDTO spnInstanceDetailDTO = new SpnInstanceDetailDTO();
			spnInstanceDetailDTO.setSpnInstanceId(_ctx.longValue("QuerySavingPlanInstanceInnerResponse.Data.Datas["+ i +"].SpnInstanceId"));
			spnInstanceDetailDTO.setSpnInstanceCode(_ctx.stringValue("QuerySavingPlanInstanceInnerResponse.Data.Datas["+ i +"].SpnInstanceCode"));
			spnInstanceDetailDTO.setPayMode(_ctx.stringValue("QuerySavingPlanInstanceInnerResponse.Data.Datas["+ i +"].PayMode"));
			spnInstanceDetailDTO.setSpnType(_ctx.stringValue("QuerySavingPlanInstanceInnerResponse.Data.Datas["+ i +"].SpnType"));
			spnInstanceDetailDTO.setInstanceFamily(_ctx.stringValue("QuerySavingPlanInstanceInnerResponse.Data.Datas["+ i +"].InstanceFamily"));
			spnInstanceDetailDTO.setRegion(_ctx.stringValue("QuerySavingPlanInstanceInnerResponse.Data.Datas["+ i +"].Region"));
			spnInstanceDetailDTO.setCycle(_ctx.stringValue("QuerySavingPlanInstanceInnerResponse.Data.Datas["+ i +"].Cycle"));
			spnInstanceDetailDTO.setStartTime(_ctx.longValue("QuerySavingPlanInstanceInnerResponse.Data.Datas["+ i +"].StartTime"));
			spnInstanceDetailDTO.setEndTime(_ctx.longValue("QuerySavingPlanInstanceInnerResponse.Data.Datas["+ i +"].EndTime"));
			spnInstanceDetailDTO.setPoolValue(_ctx.floatValue("QuerySavingPlanInstanceInnerResponse.Data.Datas["+ i +"].PoolValue"));
			spnInstanceDetailDTO.setUserId(_ctx.longValue("QuerySavingPlanInstanceInnerResponse.Data.Datas["+ i +"].UserId"));
			spnInstanceDetailDTO.setSite(_ctx.stringValue("QuerySavingPlanInstanceInnerResponse.Data.Datas["+ i +"].Site"));
			spnInstanceDetailDTO.setCurrency(_ctx.stringValue("QuerySavingPlanInstanceInnerResponse.Data.Datas["+ i +"].Currency"));
			spnInstanceDetailDTO.setCommodityCode(_ctx.stringValue("QuerySavingPlanInstanceInnerResponse.Data.Datas["+ i +"].CommodityCode"));
			spnInstanceDetailDTO.setStatus(_ctx.stringValue("QuerySavingPlanInstanceInnerResponse.Data.Datas["+ i +"].Status"));

			datas.add(spnInstanceDetailDTO);
		}
		data.setDatas(datas);
		querySavingPlanInstanceInnerResponse.setData(data);
	 
	 	return querySavingPlanInstanceInnerResponse;
	}
}