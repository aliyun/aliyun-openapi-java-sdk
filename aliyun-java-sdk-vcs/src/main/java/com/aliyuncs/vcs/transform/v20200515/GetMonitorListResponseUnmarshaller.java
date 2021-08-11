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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.GetMonitorListResponse;
import com.aliyuncs.vcs.model.v20200515.GetMonitorListResponse.Data;
import com.aliyuncs.vcs.model.v20200515.GetMonitorListResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMonitorListResponseUnmarshaller {

	public static GetMonitorListResponse unmarshall(GetMonitorListResponse getMonitorListResponse, UnmarshallerContext _ctx) {
		
		getMonitorListResponse.setRequestId(_ctx.stringValue("GetMonitorListResponse.RequestId"));
		getMonitorListResponse.setMessage(_ctx.stringValue("GetMonitorListResponse.Message"));
		getMonitorListResponse.setCode(_ctx.stringValue("GetMonitorListResponse.Code"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("GetMonitorListResponse.Data.PageNumber"));
		data.setTotalPage(_ctx.integerValue("GetMonitorListResponse.Data.TotalPage"));
		data.setPageSize(_ctx.integerValue("GetMonitorListResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("GetMonitorListResponse.Data.TotalCount"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("GetMonitorListResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setStatus(_ctx.stringValue("GetMonitorListResponse.Data.Records["+ i +"].Status"));
			record.setRuleExpression(_ctx.stringValue("GetMonitorListResponse.Data.Records["+ i +"].RuleExpression"));
			record.setImageMatch(_ctx.stringValue("GetMonitorListResponse.Data.Records["+ i +"].ImageMatch"));
			record.setMonitorType(_ctx.stringValue("GetMonitorListResponse.Data.Records["+ i +"].MonitorType"));
			record.setCreateDate(_ctx.stringValue("GetMonitorListResponse.Data.Records["+ i +"].CreateDate"));
			record.setRuleName(_ctx.stringValue("GetMonitorListResponse.Data.Records["+ i +"].RuleName"));
			record.setNotifierType(_ctx.stringValue("GetMonitorListResponse.Data.Records["+ i +"].NotifierType"));
			record.setDescription(_ctx.stringValue("GetMonitorListResponse.Data.Records["+ i +"].Description"));
			record.setExpression(_ctx.stringValue("GetMonitorListResponse.Data.Records["+ i +"].Expression"));
			record.setNotifierExtendValues(_ctx.stringValue("GetMonitorListResponse.Data.Records["+ i +"].NotifierExtendValues"));
			record.setAttributes(_ctx.stringValue("GetMonitorListResponse.Data.Records["+ i +"].Attributes"));
			record.setDeviceList(_ctx.stringValue("GetMonitorListResponse.Data.Records["+ i +"].DeviceList"));
			record.setTaskId(_ctx.stringValue("GetMonitorListResponse.Data.Records["+ i +"].TaskId"));
			record.setModifiedDate(_ctx.stringValue("GetMonitorListResponse.Data.Records["+ i +"].ModifiedDate"));
			record.setAlgorithmVendor(_ctx.stringValue("GetMonitorListResponse.Data.Records["+ i +"].AlgorithmVendor"));

			records.add(record);
		}
		data.setRecords(records);
		getMonitorListResponse.setData(data);
	 
	 	return getMonitorListResponse;
	}
}