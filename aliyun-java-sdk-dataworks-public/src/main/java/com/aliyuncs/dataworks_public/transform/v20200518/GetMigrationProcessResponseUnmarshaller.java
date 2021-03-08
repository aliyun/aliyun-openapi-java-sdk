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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetMigrationProcessResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMigrationProcessResponse.ProgressTaskItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMigrationProcessResponseUnmarshaller {

	public static GetMigrationProcessResponse unmarshall(GetMigrationProcessResponse getMigrationProcessResponse, UnmarshallerContext _ctx) {
		
		getMigrationProcessResponse.setRequestId(_ctx.stringValue("GetMigrationProcessResponse.RequestId"));
		getMigrationProcessResponse.setErrorCode(_ctx.stringValue("GetMigrationProcessResponse.ErrorCode"));
		getMigrationProcessResponse.setErrorMessage(_ctx.stringValue("GetMigrationProcessResponse.ErrorMessage"));
		getMigrationProcessResponse.setHttpStatusCode(_ctx.integerValue("GetMigrationProcessResponse.HttpStatusCode"));
		getMigrationProcessResponse.setSuccess(_ctx.booleanValue("GetMigrationProcessResponse.Success"));

		List<ProgressTaskItem> data = new ArrayList<ProgressTaskItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMigrationProcessResponse.Data.Length"); i++) {
			ProgressTaskItem progressTaskItem = new ProgressTaskItem();
			progressTaskItem.setTaskName(_ctx.stringValue("GetMigrationProcessResponse.Data["+ i +"].TaskName"));
			progressTaskItem.setTaskStatus(_ctx.stringValue("GetMigrationProcessResponse.Data["+ i +"].TaskStatus"));

			data.add(progressTaskItem);
		}
		getMigrationProcessResponse.setData(data);
	 
	 	return getMigrationProcessResponse;
	}
}