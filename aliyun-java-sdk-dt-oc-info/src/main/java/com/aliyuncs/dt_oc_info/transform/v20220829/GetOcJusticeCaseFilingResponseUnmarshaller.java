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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeCaseFilingResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeCaseFilingResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcJusticeCaseFilingResponseUnmarshaller {

	public static GetOcJusticeCaseFilingResponse unmarshall(GetOcJusticeCaseFilingResponse getOcJusticeCaseFilingResponse, UnmarshallerContext _ctx) {
		
		getOcJusticeCaseFilingResponse.setRequestId(_ctx.stringValue("GetOcJusticeCaseFilingResponse.RequestId"));
		getOcJusticeCaseFilingResponse.setCode(_ctx.stringValue("GetOcJusticeCaseFilingResponse.Code"));
		getOcJusticeCaseFilingResponse.setSuccess(_ctx.booleanValue("GetOcJusticeCaseFilingResponse.Success"));
		getOcJusticeCaseFilingResponse.setMessage(_ctx.stringValue("GetOcJusticeCaseFilingResponse.Message"));
		getOcJusticeCaseFilingResponse.setTotalNum(_ctx.integerValue("GetOcJusticeCaseFilingResponse.TotalNum"));
		getOcJusticeCaseFilingResponse.setPageIndex(_ctx.integerValue("GetOcJusticeCaseFilingResponse.PageIndex"));
		getOcJusticeCaseFilingResponse.setPageNum(_ctx.integerValue("GetOcJusticeCaseFilingResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcJusticeCaseFilingResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCaseNum(_ctx.stringValue("GetOcJusticeCaseFilingResponse.Data["+ i +"].CaseNum"));
			dataItem.setJudge(_ctx.stringValue("GetOcJusticeCaseFilingResponse.Data["+ i +"].Judge"));
			dataItem.setAssistant(_ctx.stringValue("GetOcJusticeCaseFilingResponse.Data["+ i +"].Assistant"));
			dataItem.setFilingDate(_ctx.stringValue("GetOcJusticeCaseFilingResponse.Data["+ i +"].FilingDate"));
			dataItem.setHearingDate(_ctx.stringValue("GetOcJusticeCaseFilingResponse.Data["+ i +"].HearingDate"));
			dataItem.setEndDate(_ctx.stringValue("GetOcJusticeCaseFilingResponse.Data["+ i +"].EndDate"));
			dataItem.setCaseStatus(_ctx.stringValue("GetOcJusticeCaseFilingResponse.Data["+ i +"].CaseStatus"));
			dataItem.setRole(_ctx.stringValue("GetOcJusticeCaseFilingResponse.Data["+ i +"].Role"));
			dataItem.setParty(_ctx.stringValue("GetOcJusticeCaseFilingResponse.Data["+ i +"].Party"));
			dataItem.setCauseAction(_ctx.stringValue("GetOcJusticeCaseFilingResponse.Data["+ i +"].CauseAction"));

			data.add(dataItem);
		}
		getOcJusticeCaseFilingResponse.setData(data);
	 
	 	return getOcJusticeCaseFilingResponse;
	}
}