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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import com.aliyuncs.openanalytics_open.model.v20180619.GetSparkStatementResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.GetSparkStatementResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSparkStatementResponseUnmarshaller {

	public static GetSparkStatementResponse unmarshall(GetSparkStatementResponse getSparkStatementResponse, UnmarshallerContext _ctx) {
		
		getSparkStatementResponse.setRequestId(_ctx.stringValue("GetSparkStatementResponse.RequestId"));

		Data data = new Data();
		data.setId(_ctx.integerValue("GetSparkStatementResponse.Data.Id"));
		data.setCode(_ctx.stringValue("GetSparkStatementResponse.Data.Code"));
		data.setState(_ctx.stringValue("GetSparkStatementResponse.Data.State"));
		data.setOutput(_ctx.stringValue("GetSparkStatementResponse.Data.Output"));
		data.setProcess(_ctx.floatValue("GetSparkStatementResponse.Data.Process"));
		data.setStartedTime(_ctx.longValue("GetSparkStatementResponse.Data.StartedTime"));
		data.setCompletedTime(_ctx.longValue("GetSparkStatementResponse.Data.CompletedTime"));
		getSparkStatementResponse.setData(data);
	 
	 	return getSparkStatementResponse;
	}
}