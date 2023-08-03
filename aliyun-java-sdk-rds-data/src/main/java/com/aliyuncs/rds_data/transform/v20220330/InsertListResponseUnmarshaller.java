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

package com.aliyuncs.rds_data.transform.v20220330;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds_data.model.v20220330.InsertListResponse;
import com.aliyuncs.rds_data.model.v20220330.InsertListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class InsertListResponseUnmarshaller {

	public static InsertListResponse unmarshall(InsertListResponse insertListResponse, UnmarshallerContext _ctx) {
		
		insertListResponse.setRequestId(_ctx.stringValue("InsertListResponse.RequestId"));
		insertListResponse.setSuccess(_ctx.booleanValue("InsertListResponse.Success"));
		insertListResponse.setCode(_ctx.stringValue("InsertListResponse.Code"));
		insertListResponse.setMessage(_ctx.stringValue("InsertListResponse.Message"));

		Data data = new Data();
		data.setNumberOfRecordsUpdated(_ctx.longValue("InsertListResponse.Data.NumberOfRecordsUpdated"));

		List<Long> autoIncrementKeys = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("InsertListResponse.Data.AutoIncrementKeys.Length"); i++) {
			autoIncrementKeys.add(_ctx.longValue("InsertListResponse.Data.AutoIncrementKeys["+ i +"]"));
		}
		data.setAutoIncrementKeys(autoIncrementKeys);
		insertListResponse.setData(data);
	 
	 	return insertListResponse;
	}
}