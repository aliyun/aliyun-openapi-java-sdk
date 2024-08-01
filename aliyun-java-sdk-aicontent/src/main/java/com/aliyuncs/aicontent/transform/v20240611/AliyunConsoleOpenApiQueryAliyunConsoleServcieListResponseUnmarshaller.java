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

package com.aliyuncs.aicontent.transform.v20240611;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aicontent.model.v20240611.AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse;
import com.aliyuncs.aicontent.model.v20240611.AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseUnmarshaller {

	public static AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse unmarshall(AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse aliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse, UnmarshallerContext _ctx) {
		
		aliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.setRequestId(_ctx.stringValue("AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.requestId"));
		aliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.setSuccess(_ctx.booleanValue("AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.success"));
		aliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.setErrCode(_ctx.stringValue("AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.errCode"));
		aliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.setErrMessage(_ctx.stringValue("AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.errMessage"));
		aliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.setHttpStatusCode(_ctx.integerValue("AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.httpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setServiceCode(_ctx.stringValue("AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.data["+ i +"].ServiceCode"));
			dataItem.setServiceName(_ctx.stringValue("AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.data["+ i +"].ServiceName"));
			dataItem.setFreeCount(_ctx.integerValue("AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.data["+ i +"].FreeCount"));
			dataItem.setFreeConcurrencyCount(_ctx.integerValue("AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.data["+ i +"].FreeConcurrencyCount"));

			data.add(dataItem);
		}
		aliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.setData(data);
	 
	 	return aliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse;
	}
}