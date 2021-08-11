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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import com.aliyuncs.retailadvqa_public.model.v20200515.CreateDataSourceResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.CreateDataSourceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataSourceResponseUnmarshaller {

	public static CreateDataSourceResponse unmarshall(CreateDataSourceResponse createDataSourceResponse, UnmarshallerContext _ctx) {
		
		createDataSourceResponse.setRequestId(_ctx.stringValue("CreateDataSourceResponse.RequestId"));
		createDataSourceResponse.setErrorDesc(_ctx.stringValue("CreateDataSourceResponse.ErrorDesc"));
		createDataSourceResponse.setTraceId(_ctx.stringValue("CreateDataSourceResponse.TraceId"));
		createDataSourceResponse.setErrorCode(_ctx.stringValue("CreateDataSourceResponse.ErrorCode"));
		createDataSourceResponse.setExStack(_ctx.stringValue("CreateDataSourceResponse.ExStack"));
		createDataSourceResponse.setSuccess(_ctx.stringValue("CreateDataSourceResponse.Success"));

		Data data = new Data();
		data.setDataSourceId(_ctx.stringValue("CreateDataSourceResponse.Data.DataSourceId"));
		createDataSourceResponse.setData(data);
	 
	 	return createDataSourceResponse;
	}
}