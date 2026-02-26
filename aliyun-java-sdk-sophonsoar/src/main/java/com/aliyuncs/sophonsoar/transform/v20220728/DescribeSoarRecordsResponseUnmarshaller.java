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

package com.aliyuncs.sophonsoar.transform.v20220728;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sophonsoar.model.v20220728.DescribeSoarRecordsResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeSoarRecordsResponse.Data;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeSoarRecordsResponse.Data.Output;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeSoarRecordsResponse.Page;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSoarRecordsResponseUnmarshaller {

	public static DescribeSoarRecordsResponse unmarshall(DescribeSoarRecordsResponse describeSoarRecordsResponse, UnmarshallerContext _ctx) {
		
		describeSoarRecordsResponse.setRequestId(_ctx.stringValue("DescribeSoarRecordsResponse.RequestId"));

		Page page = new Page();
		page.setTotalCount(_ctx.integerValue("DescribeSoarRecordsResponse.Page.TotalCount"));
		page.setPageNumber(_ctx.integerValue("DescribeSoarRecordsResponse.Page.PageNumber"));
		page.setPageSize(_ctx.integerValue("DescribeSoarRecordsResponse.Page.PageSize"));
		describeSoarRecordsResponse.setPage(page);

		List<Data> soarExecuteRecords = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSoarRecordsResponse.SoarExecuteRecords.Length"); i++) {
			Data data = new Data();
			data.setTriggerType(_ctx.stringValue("DescribeSoarRecordsResponse.SoarExecuteRecords["+ i +"].TriggerType"));
			data.setTaskName(_ctx.stringValue("DescribeSoarRecordsResponse.SoarExecuteRecords["+ i +"].TaskName"));
			data.setStartTime(_ctx.longValue("DescribeSoarRecordsResponse.SoarExecuteRecords["+ i +"].StartTime"));
			data.setEndTime(_ctx.longValue("DescribeSoarRecordsResponse.SoarExecuteRecords["+ i +"].EndTime"));
			data.setStatus(_ctx.stringValue("DescribeSoarRecordsResponse.SoarExecuteRecords["+ i +"].Status"));
			data.setRequestUuid(_ctx.stringValue("DescribeSoarRecordsResponse.SoarExecuteRecords["+ i +"].RequestUuid"));
			data.setTriggerUser(_ctx.stringValue("DescribeSoarRecordsResponse.SoarExecuteRecords["+ i +"].TriggerUser"));
			data.setErrorMsg(_ctx.stringValue("DescribeSoarRecordsResponse.SoarExecuteRecords["+ i +"].ErrorMsg"));
			data.setRawEventReq(_ctx.stringValue("DescribeSoarRecordsResponse.SoarExecuteRecords["+ i +"].RawEventReq"));
			data.setTaskflowMd5(_ctx.stringValue("DescribeSoarRecordsResponse.SoarExecuteRecords["+ i +"].TaskflowMd5"));

			List<Output> outputList = new ArrayList<Output>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSoarRecordsResponse.SoarExecuteRecords["+ i +"].OutputList.Length"); j++) {
				Output output = new Output();
				output.setContent(_ctx.stringValue("DescribeSoarRecordsResponse.SoarExecuteRecords["+ i +"].OutputList["+ j +"].Content"));
				output.setNodeName(_ctx.stringValue("DescribeSoarRecordsResponse.SoarExecuteRecords["+ i +"].OutputList["+ j +"].NodeName"));
				output.setActionUuid(_ctx.stringValue("DescribeSoarRecordsResponse.SoarExecuteRecords["+ i +"].OutputList["+ j +"].ActionUuid"));

				outputList.add(output);
			}
			data.setOutputList(outputList);

			soarExecuteRecords.add(data);
		}
		describeSoarRecordsResponse.setSoarExecuteRecords(soarExecuteRecords);
	 
	 	return describeSoarRecordsResponse;
	}
}