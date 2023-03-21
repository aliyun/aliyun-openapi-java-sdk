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

package com.aliyuncs.appstream_center.transform.v20210901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.appstream_center.model.v20210901.DeleteAppInstancesResponse;
import com.aliyuncs.appstream_center.model.v20210901.DeleteAppInstancesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAppInstancesResponseUnmarshaller {

	public static DeleteAppInstancesResponse unmarshall(DeleteAppInstancesResponse deleteAppInstancesResponse, UnmarshallerContext _ctx) {
		
		deleteAppInstancesResponse.setRequestId(_ctx.stringValue("DeleteAppInstancesResponse.RequestId"));

		List<Data> deleteAppInstanceModels = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DeleteAppInstancesResponse.DeleteAppInstanceModels.Length"); i++) {
			Data data = new Data();
			data.setAppInstanceId(_ctx.stringValue("DeleteAppInstancesResponse.DeleteAppInstanceModels["+ i +"].AppInstanceId"));
			data.setSuccess(_ctx.booleanValue("DeleteAppInstancesResponse.DeleteAppInstanceModels["+ i +"].Success"));
			data.setCode(_ctx.stringValue("DeleteAppInstancesResponse.DeleteAppInstanceModels["+ i +"].Code"));
			data.setMessage(_ctx.stringValue("DeleteAppInstancesResponse.DeleteAppInstanceModels["+ i +"].Message"));

			deleteAppInstanceModels.add(data);
		}
		deleteAppInstancesResponse.setDeleteAppInstanceModels(deleteAppInstanceModels);
	 
	 	return deleteAppInstancesResponse;
	}
}