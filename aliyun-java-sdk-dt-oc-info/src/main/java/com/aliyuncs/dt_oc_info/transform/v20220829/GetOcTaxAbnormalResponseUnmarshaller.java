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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcTaxAbnormalResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcTaxAbnormalResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcTaxAbnormalResponseUnmarshaller {

	public static GetOcTaxAbnormalResponse unmarshall(GetOcTaxAbnormalResponse getOcTaxAbnormalResponse, UnmarshallerContext _ctx) {
		
		getOcTaxAbnormalResponse.setRequestId(_ctx.stringValue("GetOcTaxAbnormalResponse.RequestId"));
		getOcTaxAbnormalResponse.setCode(_ctx.stringValue("GetOcTaxAbnormalResponse.Code"));
		getOcTaxAbnormalResponse.setSuccess(_ctx.booleanValue("GetOcTaxAbnormalResponse.Success"));
		getOcTaxAbnormalResponse.setMessage(_ctx.stringValue("GetOcTaxAbnormalResponse.Message"));
		getOcTaxAbnormalResponse.setTotalNum(_ctx.integerValue("GetOcTaxAbnormalResponse.TotalNum"));
		getOcTaxAbnormalResponse.setPageIndex(_ctx.integerValue("GetOcTaxAbnormalResponse.PageIndex"));
		getOcTaxAbnormalResponse.setPageNum(_ctx.integerValue("GetOcTaxAbnormalResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcTaxAbnormalResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcTaxAbnormalResponse.Data["+ i +"].EntName"));
			dataItem.setLegalName(_ctx.stringValue("GetOcTaxAbnormalResponse.Data["+ i +"].LegalName"));
			dataItem.setCardNum(_ctx.stringValue("GetOcTaxAbnormalResponse.Data["+ i +"].CardNum"));
			dataItem.setCardType(_ctx.stringValue("GetOcTaxAbnormalResponse.Data["+ i +"].CardType"));
			dataItem.setJudgeDate(_ctx.stringValue("GetOcTaxAbnormalResponse.Data["+ i +"].JudgeDate"));
			dataItem.setJudgeDepartment(_ctx.stringValue("GetOcTaxAbnormalResponse.Data["+ i +"].JudgeDepartment"));
			dataItem.setJudgeReason(_ctx.stringValue("GetOcTaxAbnormalResponse.Data["+ i +"].JudgeReason"));
			dataItem.setOverdueType(_ctx.stringValue("GetOcTaxAbnormalResponse.Data["+ i +"].OverdueType"));
			dataItem.setOverdueAmount(_ctx.stringValue("GetOcTaxAbnormalResponse.Data["+ i +"].OverdueAmount"));
			dataItem.setStatus(_ctx.stringValue("GetOcTaxAbnormalResponse.Data["+ i +"].Status"));
			dataItem.setTaxpayerNum(_ctx.stringValue("GetOcTaxAbnormalResponse.Data["+ i +"].TaxpayerNum"));

			data.add(dataItem);
		}
		getOcTaxAbnormalResponse.setData(data);
	 
	 	return getOcTaxAbnormalResponse;
	}
}