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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.BatchqueryODPSchemasInterceptorsResponse;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPSchemasInterceptorsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchqueryODPSchemasInterceptorsResponseUnmarshaller {

	public static BatchqueryODPSchemasInterceptorsResponse unmarshall(BatchqueryODPSchemasInterceptorsResponse batchqueryODPSchemasInterceptorsResponse, UnmarshallerContext _ctx) {
		
		batchqueryODPSchemasInterceptorsResponse.setRequestId(_ctx.stringValue("BatchqueryODPSchemasInterceptorsResponse.RequestId"));
		batchqueryODPSchemasInterceptorsResponse.setResultCode(_ctx.stringValue("BatchqueryODPSchemasInterceptorsResponse.ResultCode"));
		batchqueryODPSchemasInterceptorsResponse.setResultMessage(_ctx.stringValue("BatchqueryODPSchemasInterceptorsResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchqueryODPSchemasInterceptorsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setGmtCreate(_ctx.stringValue("BatchqueryODPSchemasInterceptorsResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("BatchqueryODPSchemasInterceptorsResponse.Data["+ i +"].GmtModified"));
			dataItem.setInterceptorName(_ctx.stringValue("BatchqueryODPSchemasInterceptorsResponse.Data["+ i +"].InterceptorName"));
			dataItem.setInterceptRule(_ctx.stringValue("BatchqueryODPSchemasInterceptorsResponse.Data["+ i +"].InterceptRule"));
			dataItem.setSchemaName(_ctx.stringValue("BatchqueryODPSchemasInterceptorsResponse.Data["+ i +"].SchemaName"));

			List<String> interceptSqls = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("BatchqueryODPSchemasInterceptorsResponse.Data["+ i +"].InterceptSqls.Length"); j++) {
				interceptSqls.add(_ctx.stringValue("BatchqueryODPSchemasInterceptorsResponse.Data["+ i +"].InterceptSqls["+ j +"]"));
			}
			dataItem.setInterceptSqls(interceptSqls);

			data.add(dataItem);
		}
		batchqueryODPSchemasInterceptorsResponse.setData(data);
	 
	 	return batchqueryODPSchemasInterceptorsResponse;
	}
}