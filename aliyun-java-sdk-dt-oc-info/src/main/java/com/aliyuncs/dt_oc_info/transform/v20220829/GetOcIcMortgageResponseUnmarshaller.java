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

package com.aliyuncs.dt_oc_info.transform.v20220829;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcMortgageResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcMortgageResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIcMortgageResponseUnmarshaller {

	public static GetOcIcMortgageResponse unmarshall(GetOcIcMortgageResponse getOcIcMortgageResponse, UnmarshallerContext _ctx) {
		
		getOcIcMortgageResponse.setRequestId(_ctx.stringValue("GetOcIcMortgageResponse.RequestId"));
		getOcIcMortgageResponse.setCode(_ctx.stringValue("GetOcIcMortgageResponse.Code"));
		getOcIcMortgageResponse.setSuccess(_ctx.booleanValue("GetOcIcMortgageResponse.Success"));
		getOcIcMortgageResponse.setMessage(_ctx.stringValue("GetOcIcMortgageResponse.Message"));
		getOcIcMortgageResponse.setTotalNum(_ctx.integerValue("GetOcIcMortgageResponse.TotalNum"));
		getOcIcMortgageResponse.setPageIndex(_ctx.integerValue("GetOcIcMortgageResponse.PageIndex"));
		getOcIcMortgageResponse.setPageNum(_ctx.integerValue("GetOcIcMortgageResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIcMortgageResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setOnecompId(_ctx.stringValue("GetOcIcMortgageResponse.Data["+ i +"].OnecompId"));
			dataItem.setNumber(_ctx.stringValue("GetOcIcMortgageResponse.Data["+ i +"].Number"));
			dataItem.setRegDate(_ctx.stringValue("GetOcIcMortgageResponse.Data["+ i +"].RegDate"));
			dataItem.setDepartment(_ctx.stringValue("GetOcIcMortgageResponse.Data["+ i +"].Department"));
			dataItem.setMortgageesName(_ctx.stringValue("GetOcIcMortgageResponse.Data["+ i +"].MortgageesName"));
			dataItem.setIdentifyType(_ctx.stringValue("GetOcIcMortgageResponse.Data["+ i +"].IdentifyType"));
			dataItem.setIdentifyNo(_ctx.stringValue("GetOcIcMortgageResponse.Data["+ i +"].IdentifyNo"));
			dataItem.setDebitType(_ctx.stringValue("GetOcIcMortgageResponse.Data["+ i +"].DebitType"));
			dataItem.setDebitAmount(_ctx.stringValue("GetOcIcMortgageResponse.Data["+ i +"].DebitAmount"));
			dataItem.setDebitPeriod(_ctx.stringValue("GetOcIcMortgageResponse.Data["+ i +"].DebitPeriod"));
			dataItem.setDebitScope(_ctx.stringValue("GetOcIcMortgageResponse.Data["+ i +"].DebitScope"));
			dataItem.setGuarantees(_ctx.stringValue("GetOcIcMortgageResponse.Data["+ i +"].Guarantees"));
			dataItem.setStatus(_ctx.stringValue("GetOcIcMortgageResponse.Data["+ i +"].Status"));
			dataItem.setPublicDate(_ctx.stringValue("GetOcIcMortgageResponse.Data["+ i +"].PublicDate"));

			data.add(dataItem);
		}
		getOcIcMortgageResponse.setData(data);
	 
	 	return getOcIcMortgageResponse;
	}
}