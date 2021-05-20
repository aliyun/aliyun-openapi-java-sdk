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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeLorneTasksMetricsResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeLorneTasksMetricsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLorneTasksMetricsResponseUnmarshaller {

	public static DescribeLorneTasksMetricsResponse unmarshall(DescribeLorneTasksMetricsResponse describeLorneTasksMetricsResponse, UnmarshallerContext _ctx) {
		
		describeLorneTasksMetricsResponse.setRequestId(_ctx.stringValue("DescribeLorneTasksMetricsResponse.RequestId"));

		Data data = new Data();
		data.setName(_ctx.stringValue("DescribeLorneTasksMetricsResponse.Data.Name"));
		data.setTaskId(_ctx.stringValue("DescribeLorneTasksMetricsResponse.Data.TaskId"));

		List<String> columns = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLorneTasksMetricsResponse.Data.Columns.Length"); i++) {
			columns.add(_ctx.stringValue("DescribeLorneTasksMetricsResponse.Data.Columns["+ i +"]"));
		}
		data.setColumns(columns);

		List<String> values = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLorneTasksMetricsResponse.Data.Values.Length"); i++) {
			values.add(_ctx.stringValue("DescribeLorneTasksMetricsResponse.Data.Values["+ i +"]"));
		}
		data.setValues(values);
		describeLorneTasksMetricsResponse.setData(data);
	 
	 	return describeLorneTasksMetricsResponse;
	}
}