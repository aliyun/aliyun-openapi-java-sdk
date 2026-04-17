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

package com.aliyuncs.hitsdb.transform.v20200615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20200615.ListAutoScalingRecordsResponse;
import com.aliyuncs.hitsdb.model.v20200615.ListAutoScalingRecordsResponse.Data;
import com.aliyuncs.hitsdb.model.v20200615.ListAutoScalingRecordsResponse.Data.ScaleRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAutoScalingRecordsResponseUnmarshaller {

	public static ListAutoScalingRecordsResponse unmarshall(ListAutoScalingRecordsResponse listAutoScalingRecordsResponse, UnmarshallerContext _ctx) {
		
		listAutoScalingRecordsResponse.setRequestId(_ctx.stringValue("ListAutoScalingRecordsResponse.RequestId"));
		listAutoScalingRecordsResponse.setDynamicCode(_ctx.stringValue("ListAutoScalingRecordsResponse.DynamicCode"));
		listAutoScalingRecordsResponse.setDynamicMessage(_ctx.stringValue("ListAutoScalingRecordsResponse.DynamicMessage"));
		listAutoScalingRecordsResponse.setAccessDeniedDetail(_ctx.stringValue("ListAutoScalingRecordsResponse.AccessDeniedDetail"));
		listAutoScalingRecordsResponse.setSuccess(_ctx.booleanValue("ListAutoScalingRecordsResponse.Success"));
		listAutoScalingRecordsResponse.setCode(_ctx.stringValue("ListAutoScalingRecordsResponse.Code"));
		listAutoScalingRecordsResponse.setMessage(_ctx.stringValue("ListAutoScalingRecordsResponse.Message"));
		listAutoScalingRecordsResponse.setHttpStatusCode(_ctx.integerValue("ListAutoScalingRecordsResponse.HttpStatusCode"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("ListAutoScalingRecordsResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("ListAutoScalingRecordsResponse.Data.PageSize"));
		data.setTotalNum(_ctx.integerValue("ListAutoScalingRecordsResponse.Data.TotalNum"));
		data.setTotalPage(_ctx.integerValue("ListAutoScalingRecordsResponse.Data.TotalPage"));

		List<ScaleRecord> scaleRecords = new ArrayList<ScaleRecord>();
		for (int i = 0; i < _ctx.lengthValue("ListAutoScalingRecordsResponse.Data.ScaleRecords.Length"); i++) {
			ScaleRecord scaleRecord = new ScaleRecord();
			scaleRecord.setId(_ctx.stringValue("ListAutoScalingRecordsResponse.Data.ScaleRecords["+ i +"].Id"));
			scaleRecord.setInstanceId(_ctx.stringValue("ListAutoScalingRecordsResponse.Data.ScaleRecords["+ i +"].InstanceId"));
			scaleRecord.setSpecGroupId(_ctx.stringValue("ListAutoScalingRecordsResponse.Data.ScaleRecords["+ i +"].SpecGroupId"));
			scaleRecord.setResourceType(_ctx.stringValue("ListAutoScalingRecordsResponse.Data.ScaleRecords["+ i +"].ResourceType"));
			scaleRecord.setStrategy(_ctx.stringValue("ListAutoScalingRecordsResponse.Data.ScaleRecords["+ i +"].Strategy"));
			scaleRecord.setOldValue(_ctx.stringValue("ListAutoScalingRecordsResponse.Data.ScaleRecords["+ i +"].OldValue"));
			scaleRecord.setTargetValue(_ctx.stringValue("ListAutoScalingRecordsResponse.Data.ScaleRecords["+ i +"].TargetValue"));
			scaleRecord.setDetail(_ctx.stringValue("ListAutoScalingRecordsResponse.Data.ScaleRecords["+ i +"].Detail"));
			scaleRecord.setStatus(_ctx.stringValue("ListAutoScalingRecordsResponse.Data.ScaleRecords["+ i +"].Status"));
			scaleRecord.setStartTime(_ctx.stringValue("ListAutoScalingRecordsResponse.Data.ScaleRecords["+ i +"].StartTime"));
			scaleRecord.setEndTime(_ctx.stringValue("ListAutoScalingRecordsResponse.Data.ScaleRecords["+ i +"].EndTime"));

			scaleRecords.add(scaleRecord);
		}
		data.setScaleRecords(scaleRecords);
		listAutoScalingRecordsResponse.setData(data);
	 
	 	return listAutoScalingRecordsResponse;
	}
}