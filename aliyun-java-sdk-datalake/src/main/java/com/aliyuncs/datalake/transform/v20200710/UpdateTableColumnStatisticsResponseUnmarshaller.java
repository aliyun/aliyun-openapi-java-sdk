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

package com.aliyuncs.datalake.transform.v20200710;

import com.aliyuncs.datalake.model.v20200710.UpdateTableColumnStatisticsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTableColumnStatisticsResponseUnmarshaller {

	public static UpdateTableColumnStatisticsResponse unmarshall(UpdateTableColumnStatisticsResponse updateTableColumnStatisticsResponse, UnmarshallerContext _ctx) {
		
		updateTableColumnStatisticsResponse.setRequestId(_ctx.stringValue("UpdateTableColumnStatisticsResponse.RequestId"));
		updateTableColumnStatisticsResponse.setMessage(_ctx.stringValue("UpdateTableColumnStatisticsResponse.Message"));
		updateTableColumnStatisticsResponse.setCode(_ctx.stringValue("UpdateTableColumnStatisticsResponse.Code"));
		updateTableColumnStatisticsResponse.setSuccess(_ctx.booleanValue("UpdateTableColumnStatisticsResponse.Success"));
	 
	 	return updateTableColumnStatisticsResponse;
	}
}