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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.UpdateSyncQualityCheckDataResponse;
import com.aliyuncs.qualitycheck.model.v20190115.UpdateSyncQualityCheckDataResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSyncQualityCheckDataResponseUnmarshaller {

	public static UpdateSyncQualityCheckDataResponse unmarshall(UpdateSyncQualityCheckDataResponse updateSyncQualityCheckDataResponse, UnmarshallerContext _ctx) {
		
		updateSyncQualityCheckDataResponse.setRequestId(_ctx.stringValue("UpdateSyncQualityCheckDataResponse.RequestId"));
		updateSyncQualityCheckDataResponse.setSuccess(_ctx.booleanValue("UpdateSyncQualityCheckDataResponse.Success"));
		updateSyncQualityCheckDataResponse.setCode(_ctx.stringValue("UpdateSyncQualityCheckDataResponse.Code"));
		updateSyncQualityCheckDataResponse.setMessage(_ctx.stringValue("UpdateSyncQualityCheckDataResponse.Message"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("UpdateSyncQualityCheckDataResponse.Data.TaskId"));
		data.setTid(_ctx.stringValue("UpdateSyncQualityCheckDataResponse.Data.Tid"));
		updateSyncQualityCheckDataResponse.setData(data);
	 
	 	return updateSyncQualityCheckDataResponse;
	}
}