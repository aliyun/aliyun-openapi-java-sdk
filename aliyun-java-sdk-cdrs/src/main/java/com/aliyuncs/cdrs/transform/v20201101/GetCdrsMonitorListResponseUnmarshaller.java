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

package com.aliyuncs.cdrs.transform.v20201101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdrs.model.v20201101.GetCdrsMonitorListResponse;
import com.aliyuncs.cdrs.model.v20201101.GetCdrsMonitorListResponse.Data;
import com.aliyuncs.cdrs.model.v20201101.GetCdrsMonitorListResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCdrsMonitorListResponseUnmarshaller {

	public static GetCdrsMonitorListResponse unmarshall(GetCdrsMonitorListResponse getCdrsMonitorListResponse, UnmarshallerContext _ctx) {
		
		getCdrsMonitorListResponse.setRequestId(_ctx.stringValue("GetCdrsMonitorListResponse.RequestId"));
		getCdrsMonitorListResponse.setCode(_ctx.stringValue("GetCdrsMonitorListResponse.Code"));
		getCdrsMonitorListResponse.setMessage(_ctx.stringValue("GetCdrsMonitorListResponse.Message"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("GetCdrsMonitorListResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("GetCdrsMonitorListResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("GetCdrsMonitorListResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.integerValue("GetCdrsMonitorListResponse.Data.TotalPage"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("GetCdrsMonitorListResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setTaskId(_ctx.stringValue("GetCdrsMonitorListResponse.Data.Records["+ i +"].TaskId"));
			record.setStatus(_ctx.stringValue("GetCdrsMonitorListResponse.Data.Records["+ i +"].Status"));
			record.setMonitorType(_ctx.stringValue("GetCdrsMonitorListResponse.Data.Records["+ i +"].MonitorType"));
			record.setRuleName(_ctx.stringValue("GetCdrsMonitorListResponse.Data.Records["+ i +"].RuleName"));
			record.setAlgorithmVendor(_ctx.stringValue("GetCdrsMonitorListResponse.Data.Records["+ i +"].AlgorithmVendor"));
			record.setCreateDate(_ctx.stringValue("GetCdrsMonitorListResponse.Data.Records["+ i +"].CreateDate"));
			record.setModifiedDate(_ctx.stringValue("GetCdrsMonitorListResponse.Data.Records["+ i +"].ModifiedDate"));
			record.setDeviceList(_ctx.stringValue("GetCdrsMonitorListResponse.Data.Records["+ i +"].DeviceList"));
			record.setAttributes(_ctx.stringValue("GetCdrsMonitorListResponse.Data.Records["+ i +"].Attributes"));
			record.setRuleExpression(_ctx.stringValue("GetCdrsMonitorListResponse.Data.Records["+ i +"].RuleExpression"));
			record.setNotifierType(_ctx.stringValue("GetCdrsMonitorListResponse.Data.Records["+ i +"].NotifierType"));
			record.setNotifierExtra(_ctx.stringValue("GetCdrsMonitorListResponse.Data.Records["+ i +"].NotifierExtra"));
			record.setDescription(_ctx.stringValue("GetCdrsMonitorListResponse.Data.Records["+ i +"].Description"));
			record.setExpression(_ctx.stringValue("GetCdrsMonitorListResponse.Data.Records["+ i +"].Expression"));
			record.setImageMatch(_ctx.stringValue("GetCdrsMonitorListResponse.Data.Records["+ i +"].ImageMatch"));

			records.add(record);
		}
		data.setRecords(records);
		getCdrsMonitorListResponse.setData(data);
	 
	 	return getCdrsMonitorListResponse;
	}
}