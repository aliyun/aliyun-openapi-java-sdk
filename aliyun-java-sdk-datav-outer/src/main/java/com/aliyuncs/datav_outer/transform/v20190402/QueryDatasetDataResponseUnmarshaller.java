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

package com.aliyuncs.datav_outer.transform.v20190402;

import com.aliyuncs.datav_outer.model.v20190402.QueryDatasetDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDatasetDataResponseUnmarshaller {

	public static QueryDatasetDataResponse unmarshall(QueryDatasetDataResponse queryDatasetDataResponse, UnmarshallerContext _ctx) {
		
		queryDatasetDataResponse.setRequestId(_ctx.stringValue("QueryDatasetDataResponse.RequestId"));
		queryDatasetDataResponse.setSuccess(_ctx.stringValue("QueryDatasetDataResponse.Success"));
		queryDatasetDataResponse.setRecordCount(_ctx.stringValue("QueryDatasetDataResponse.RecordCount"));
		queryDatasetDataResponse.setData(_ctx.stringValue("QueryDatasetDataResponse.Data"));
	 
	 	return queryDatasetDataResponse;
	}
}