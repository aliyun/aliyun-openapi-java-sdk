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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeTerminalCaseResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeTerminalCaseResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcJusticeTerminalCaseResponseUnmarshaller {

	public static GetOcJusticeTerminalCaseResponse unmarshall(GetOcJusticeTerminalCaseResponse getOcJusticeTerminalCaseResponse, UnmarshallerContext _ctx) {
		
		getOcJusticeTerminalCaseResponse.setRequestId(_ctx.stringValue("GetOcJusticeTerminalCaseResponse.RequestId"));
		getOcJusticeTerminalCaseResponse.setCode(_ctx.stringValue("GetOcJusticeTerminalCaseResponse.Code"));
		getOcJusticeTerminalCaseResponse.setSuccess(_ctx.booleanValue("GetOcJusticeTerminalCaseResponse.Success"));
		getOcJusticeTerminalCaseResponse.setMessage(_ctx.stringValue("GetOcJusticeTerminalCaseResponse.Message"));
		getOcJusticeTerminalCaseResponse.setTotalNum(_ctx.integerValue("GetOcJusticeTerminalCaseResponse.TotalNum"));
		getOcJusticeTerminalCaseResponse.setPageIndex(_ctx.integerValue("GetOcJusticeTerminalCaseResponse.PageIndex"));
		getOcJusticeTerminalCaseResponse.setPageNum(_ctx.integerValue("GetOcJusticeTerminalCaseResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcJusticeTerminalCaseResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setName(_ctx.stringValue("GetOcJusticeTerminalCaseResponse.Data["+ i +"].Name"));
			dataItem.setEntName(_ctx.stringValue("GetOcJusticeTerminalCaseResponse.Data["+ i +"].EntName"));
			dataItem.setFilingDate(_ctx.stringValue("GetOcJusticeTerminalCaseResponse.Data["+ i +"].FilingDate"));
			dataItem.setTerminalNum(_ctx.stringValue("GetOcJusticeTerminalCaseResponse.Data["+ i +"].TerminalNum"));
			dataItem.setCaseNum(_ctx.stringValue("GetOcJusticeTerminalCaseResponse.Data["+ i +"].CaseNum"));
			dataItem.setCourt(_ctx.stringValue("GetOcJusticeTerminalCaseResponse.Data["+ i +"].Court"));
			dataItem.setTerminateDate(_ctx.stringValue("GetOcJusticeTerminalCaseResponse.Data["+ i +"].TerminateDate"));
			dataItem.setExecAmount(_ctx.stringValue("GetOcJusticeTerminalCaseResponse.Data["+ i +"].ExecAmount"));
			dataItem.setFailPerformAmount(_ctx.stringValue("GetOcJusticeTerminalCaseResponse.Data["+ i +"].FailPerformAmount"));

			data.add(dataItem);
		}
		getOcJusticeTerminalCaseResponse.setData(data);
	 
	 	return getOcJusticeTerminalCaseResponse;
	}
}