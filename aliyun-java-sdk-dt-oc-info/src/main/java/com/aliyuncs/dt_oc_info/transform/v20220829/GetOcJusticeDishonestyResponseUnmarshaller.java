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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeDishonestyResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeDishonestyResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcJusticeDishonestyResponseUnmarshaller {

	public static GetOcJusticeDishonestyResponse unmarshall(GetOcJusticeDishonestyResponse getOcJusticeDishonestyResponse, UnmarshallerContext _ctx) {
		
		getOcJusticeDishonestyResponse.setRequestId(_ctx.stringValue("GetOcJusticeDishonestyResponse.RequestId"));
		getOcJusticeDishonestyResponse.setCode(_ctx.stringValue("GetOcJusticeDishonestyResponse.Code"));
		getOcJusticeDishonestyResponse.setSuccess(_ctx.booleanValue("GetOcJusticeDishonestyResponse.Success"));
		getOcJusticeDishonestyResponse.setMessage(_ctx.stringValue("GetOcJusticeDishonestyResponse.Message"));
		getOcJusticeDishonestyResponse.setTotalNum(_ctx.integerValue("GetOcJusticeDishonestyResponse.TotalNum"));
		getOcJusticeDishonestyResponse.setPageIndex(_ctx.integerValue("GetOcJusticeDishonestyResponse.PageIndex"));
		getOcJusticeDishonestyResponse.setPageNum(_ctx.integerValue("GetOcJusticeDishonestyResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcJusticeDishonestyResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcJusticeDishonestyResponse.Data["+ i +"].EntName"));
			dataItem.setSocialCreditCode(_ctx.stringValue("GetOcJusticeDishonestyResponse.Data["+ i +"].SocialCreditCode"));
			dataItem.setLegalName(_ctx.stringValue("GetOcJusticeDishonestyResponse.Data["+ i +"].LegalName"));
			dataItem.setCourt(_ctx.stringValue("GetOcJusticeDishonestyResponse.Data["+ i +"].Court"));
			dataItem.setProvince(_ctx.stringValue("GetOcJusticeDishonestyResponse.Data["+ i +"].Province"));
			dataItem.setFromCaseNum(_ctx.stringValue("GetOcJusticeDishonestyResponse.Data["+ i +"].FromCaseNum"));
			dataItem.setFilingDate(_ctx.stringValue("GetOcJusticeDishonestyResponse.Data["+ i +"].FilingDate"));
			dataItem.setCaseNum(_ctx.stringValue("GetOcJusticeDishonestyResponse.Data["+ i +"].CaseNum"));
			dataItem.setExecuteDepartment(_ctx.stringValue("GetOcJusticeDishonestyResponse.Data["+ i +"].ExecuteDepartment"));
			dataItem.setFinalDuty(_ctx.stringValue("GetOcJusticeDishonestyResponse.Data["+ i +"].FinalDuty"));
			dataItem.setExecutionStatus(_ctx.stringValue("GetOcJusticeDishonestyResponse.Data["+ i +"].ExecutionStatus"));
			dataItem.setExecutionDesc(_ctx.stringValue("GetOcJusticeDishonestyResponse.Data["+ i +"].ExecutionDesc"));
			dataItem.setPublishDate(_ctx.stringValue("GetOcJusticeDishonestyResponse.Data["+ i +"].PublishDate"));
			dataItem.setAmount(_ctx.stringValue("GetOcJusticeDishonestyResponse.Data["+ i +"].Amount"));

			data.add(dataItem);
		}
		getOcJusticeDishonestyResponse.setData(data);
	 
	 	return getOcJusticeDishonestyResponse;
	}
}