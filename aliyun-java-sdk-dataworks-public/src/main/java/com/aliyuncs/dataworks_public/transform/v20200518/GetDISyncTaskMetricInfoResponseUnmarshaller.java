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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetDISyncTaskMetricInfoResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetDISyncTaskMetricInfoResponse.MetricInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDISyncTaskMetricInfoResponseUnmarshaller {

	public static GetDISyncTaskMetricInfoResponse unmarshall(GetDISyncTaskMetricInfoResponse getDISyncTaskMetricInfoResponse, UnmarshallerContext _ctx) {
		
		getDISyncTaskMetricInfoResponse.setRequestId(_ctx.stringValue("GetDISyncTaskMetricInfoResponse.RequestId"));
		getDISyncTaskMetricInfoResponse.setSuccess(_ctx.booleanValue("GetDISyncTaskMetricInfoResponse.Success"));

		MetricInfo metricInfo = new MetricInfo();
		metricInfo.setMessage(_ctx.stringValue("GetDISyncTaskMetricInfoResponse.MetricInfo.Message"));
		metricInfo.setSumReaderRecords(_ctx.longValue("GetDISyncTaskMetricInfoResponse.MetricInfo.SumReaderRecords"));
		metricInfo.setSumWriterRecords(_ctx.longValue("GetDISyncTaskMetricInfoResponse.MetricInfo.SumWriterRecords"));
		metricInfo.setLastTaskDelay(_ctx.longValue("GetDISyncTaskMetricInfoResponse.MetricInfo.LastTaskDelay"));
		metricInfo.setInsertReaderRecords(_ctx.longValue("GetDISyncTaskMetricInfoResponse.MetricInfo.InsertReaderRecords"));
		metricInfo.setUpdateReaderRecords(_ctx.longValue("GetDISyncTaskMetricInfoResponse.MetricInfo.UpdateReaderRecords"));
		metricInfo.setDeleteReaderRecords(_ctx.longValue("GetDISyncTaskMetricInfoResponse.MetricInfo.DeleteReaderRecords"));
		metricInfo.setInsertWriterRecords(_ctx.longValue("GetDISyncTaskMetricInfoResponse.MetricInfo.InsertWriterRecords"));
		metricInfo.setUpdateWriterRecords(_ctx.longValue("GetDISyncTaskMetricInfoResponse.MetricInfo.UpdateWriterRecords"));
		metricInfo.setDeleteWriterRecords(_ctx.longValue("GetDISyncTaskMetricInfoResponse.MetricInfo.DeleteWriterRecords"));
		getDISyncTaskMetricInfoResponse.setMetricInfo(metricInfo);
	 
	 	return getDISyncTaskMetricInfoResponse;
	}
}