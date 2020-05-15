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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.QueryOTAJobResponse;
import com.aliyuncs.iot.model.v20180120.QueryOTAJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOTAJobResponseUnmarshaller {

	public static QueryOTAJobResponse unmarshall(QueryOTAJobResponse queryOTAJobResponse, UnmarshallerContext _ctx) {
		
		queryOTAJobResponse.setRequestId(_ctx.stringValue("QueryOTAJobResponse.RequestId"));
		queryOTAJobResponse.setSuccess(_ctx.booleanValue("QueryOTAJobResponse.Success"));
		queryOTAJobResponse.setCode(_ctx.stringValue("QueryOTAJobResponse.Code"));
		queryOTAJobResponse.setErrorMessage(_ctx.stringValue("QueryOTAJobResponse.ErrorMessage"));
		queryOTAJobResponse.setTotal(_ctx.integerValue("QueryOTAJobResponse.Total"));
		queryOTAJobResponse.setPageSize(_ctx.integerValue("QueryOTAJobResponse.PageSize"));
		queryOTAJobResponse.setPageCount(_ctx.integerValue("QueryOTAJobResponse.PageCount"));
		queryOTAJobResponse.setCurrentPage(_ctx.integerValue("QueryOTAJobResponse.CurrentPage"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("QueryOTAJobResponse.Data.JobId"));
		data.setUtcCreate(_ctx.stringValue("QueryOTAJobResponse.Data.UtcCreate"));
		data.setUtcModified(_ctx.stringValue("QueryOTAJobResponse.Data.UtcModified"));
		data.setProductKey(_ctx.stringValue("QueryOTAJobResponse.Data.ProductKey"));
		data.setFirmwareId(_ctx.stringValue("QueryOTAJobResponse.Data.FirmwareId"));
		data.setUtcStartTime(_ctx.stringValue("QueryOTAJobResponse.Data.UtcStartTime"));
		data.setUtcEndTime(_ctx.stringValue("QueryOTAJobResponse.Data.UtcEndTime"));
		data.setJobStatus(_ctx.stringValue("QueryOTAJobResponse.Data.JobStatus"));
		data.setJobType(_ctx.stringValue("QueryOTAJobResponse.Data.JobType"));
		data.setJobDesc(_ctx.stringValue("QueryOTAJobResponse.Data.JobDesc"));
		data.setName(_ctx.stringValue("QueryOTAJobResponse.Data.Name"));
		data.setUtcScheduleTime(_ctx.stringValue("QueryOTAJobResponse.Data.UtcScheduleTime"));
		data.setRetryInterval(_ctx.integerValue("QueryOTAJobResponse.Data.RetryInterval"));
		data.setRetryCount(_ctx.integerValue("QueryOTAJobResponse.Data.RetryCount"));
		data.setTimeoutInMinutes(_ctx.integerValue("QueryOTAJobResponse.Data.TimeoutInMinutes"));
		data.setTargetSelection(_ctx.stringValue("QueryOTAJobResponse.Data.TargetSelection"));
		data.setSelectionType(_ctx.stringValue("QueryOTAJobResponse.Data.SelectionType"));
		data.setGrayPercent(_ctx.stringValue("QueryOTAJobResponse.Data.GrayPercent"));
		data.setMaximumPerMinute(_ctx.integerValue("QueryOTAJobResponse.Data.MaximumPerMinute"));
		data.setDestVersion(_ctx.stringValue("QueryOTAJobResponse.Data.DestVersion"));
		data.setSrcVersions(_ctx.stringValue("QueryOTAJobResponse.Data.SrcVersions"));
		queryOTAJobResponse.setData(data);
	 
	 	return queryOTAJobResponse;
	}
}