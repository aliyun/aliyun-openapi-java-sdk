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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.EditQualityProjectResponse;
import com.aliyuncs.aiccs.model.v20191015.EditQualityProjectResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class EditQualityProjectResponseUnmarshaller {

	public static EditQualityProjectResponse unmarshall(EditQualityProjectResponse editQualityProjectResponse, UnmarshallerContext _ctx) {
		
		editQualityProjectResponse.setRequestId(_ctx.stringValue("EditQualityProjectResponse.RequestId"));
		editQualityProjectResponse.setCode(_ctx.stringValue("EditQualityProjectResponse.Code"));
		editQualityProjectResponse.setMessage(_ctx.stringValue("EditQualityProjectResponse.Message"));
		editQualityProjectResponse.setSuccess(_ctx.booleanValue("EditQualityProjectResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("EditQualityProjectResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setProjectId(_ctx.longValue("EditQualityProjectResponse.Data["+ i +"].ProjectId"));
			dataItem.setVersion(_ctx.integerValue("EditQualityProjectResponse.Data["+ i +"].Version"));
			dataItem.setInstanceId(_ctx.stringValue("EditQualityProjectResponse.Data["+ i +"].InstanceId"));

			data.add(dataItem);
		}
		editQualityProjectResponse.setData(data);
	 
	 	return editQualityProjectResponse;
	}
}