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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.SaveStatsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveStatsResponseUnmarshaller {

	public static SaveStatsResponse unmarshall(SaveStatsResponse saveStatsResponse, UnmarshallerContext context) {
		
		saveStatsResponse.setRequestId(context.stringValue("SaveStatsResponse.RequestId"));
		saveStatsResponse.setSuccess(context.booleanValue("SaveStatsResponse.Success"));
		saveStatsResponse.setCode(context.stringValue("SaveStatsResponse.Code"));
		saveStatsResponse.setMessage(context.stringValue("SaveStatsResponse.Message"));
		saveStatsResponse.setHttpStatusCode(context.integerValue("SaveStatsResponse.HttpStatusCode"));
		saveStatsResponse.setRowCount(context.longValue("SaveStatsResponse.RowCount"));
	 
	 	return saveStatsResponse;
	}
}