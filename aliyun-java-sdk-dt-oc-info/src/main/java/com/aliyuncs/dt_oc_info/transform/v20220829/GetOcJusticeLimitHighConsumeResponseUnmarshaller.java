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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeLimitHighConsumeResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeLimitHighConsumeResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcJusticeLimitHighConsumeResponseUnmarshaller {

	public static GetOcJusticeLimitHighConsumeResponse unmarshall(GetOcJusticeLimitHighConsumeResponse getOcJusticeLimitHighConsumeResponse, UnmarshallerContext _ctx) {
		
		getOcJusticeLimitHighConsumeResponse.setRequestId(_ctx.stringValue("GetOcJusticeLimitHighConsumeResponse.RequestId"));
		getOcJusticeLimitHighConsumeResponse.setCode(_ctx.stringValue("GetOcJusticeLimitHighConsumeResponse.Code"));
		getOcJusticeLimitHighConsumeResponse.setSuccess(_ctx.booleanValue("GetOcJusticeLimitHighConsumeResponse.Success"));
		getOcJusticeLimitHighConsumeResponse.setMessage(_ctx.stringValue("GetOcJusticeLimitHighConsumeResponse.Message"));
		getOcJusticeLimitHighConsumeResponse.setTotalNum(_ctx.integerValue("GetOcJusticeLimitHighConsumeResponse.TotalNum"));
		getOcJusticeLimitHighConsumeResponse.setPageIndex(_ctx.integerValue("GetOcJusticeLimitHighConsumeResponse.PageIndex"));
		getOcJusticeLimitHighConsumeResponse.setPageNum(_ctx.integerValue("GetOcJusticeLimitHighConsumeResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcJusticeLimitHighConsumeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setName(_ctx.stringValue("GetOcJusticeLimitHighConsumeResponse.Data["+ i +"].Name"));
			dataItem.setCompanyName(_ctx.stringValue("GetOcJusticeLimitHighConsumeResponse.Data["+ i +"].CompanyName"));
			dataItem.setFilingDate(_ctx.stringValue("GetOcJusticeLimitHighConsumeResponse.Data["+ i +"].FilingDate"));
			dataItem.setCaseNum(_ctx.stringValue("GetOcJusticeLimitHighConsumeResponse.Data["+ i +"].CaseNum"));
			dataItem.setCourt(_ctx.stringValue("GetOcJusticeLimitHighConsumeResponse.Data["+ i +"].Court"));
			dataItem.setExecutionApplicant(_ctx.stringValue("GetOcJusticeLimitHighConsumeResponse.Data["+ i +"].ExecutionApplicant"));
			dataItem.setCauseAction(_ctx.stringValue("GetOcJusticeLimitHighConsumeResponse.Data["+ i +"].CauseAction"));
			dataItem.setPublishDate(_ctx.stringValue("GetOcJusticeLimitHighConsumeResponse.Data["+ i +"].PublishDate"));

			data.add(dataItem);
		}
		getOcJusticeLimitHighConsumeResponse.setData(data);
	 
	 	return getOcJusticeLimitHighConsumeResponse;
	}
}