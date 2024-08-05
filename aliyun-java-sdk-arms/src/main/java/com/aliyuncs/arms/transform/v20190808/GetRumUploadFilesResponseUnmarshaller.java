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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetRumUploadFilesResponse;
import com.aliyuncs.arms.model.v20190808.GetRumUploadFilesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRumUploadFilesResponseUnmarshaller {

	public static GetRumUploadFilesResponse unmarshall(GetRumUploadFilesResponse getRumUploadFilesResponse, UnmarshallerContext _ctx) {
		
		getRumUploadFilesResponse.setRequestId(_ctx.stringValue("GetRumUploadFilesResponse.RequestId"));
		getRumUploadFilesResponse.setCode(_ctx.integerValue("GetRumUploadFilesResponse.Code"));
		getRumUploadFilesResponse.setMessage(_ctx.stringValue("GetRumUploadFilesResponse.Message"));
		getRumUploadFilesResponse.setHttpStatusCode(_ctx.integerValue("GetRumUploadFilesResponse.HttpStatusCode"));
		getRumUploadFilesResponse.setSuccess(_ctx.booleanValue("GetRumUploadFilesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRumUploadFilesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setFileName(_ctx.stringValue("GetRumUploadFilesResponse.Data["+ i +"].FileName"));
			dataItem.setUuid(_ctx.stringValue("GetRumUploadFilesResponse.Data["+ i +"].Uuid"));
			dataItem.setSize(_ctx.stringValue("GetRumUploadFilesResponse.Data["+ i +"].Size"));
			dataItem.setVersionId(_ctx.stringValue("GetRumUploadFilesResponse.Data["+ i +"].VersionId"));

			data.add(dataItem);
		}
		getRumUploadFilesResponse.setData(data);
	 
	 	return getRumUploadFilesResponse;
	}
}