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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.GetKgSchemaPublishResultResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetKgSchemaPublishResultResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetKgSchemaPublishResultResponseUnmarshaller {

	public static GetKgSchemaPublishResultResponse unmarshall(GetKgSchemaPublishResultResponse getKgSchemaPublishResultResponse, UnmarshallerContext _ctx) {
		
		getKgSchemaPublishResultResponse.setRequestId(_ctx.stringValue("GetKgSchemaPublishResultResponse.RequestId"));
		getKgSchemaPublishResultResponse.setMessage(_ctx.stringValue("GetKgSchemaPublishResultResponse.Message"));
		getKgSchemaPublishResultResponse.setHttpStatusCode(_ctx.integerValue("GetKgSchemaPublishResultResponse.HttpStatusCode"));
		getKgSchemaPublishResultResponse.setCode(_ctx.stringValue("GetKgSchemaPublishResultResponse.Code"));
		getKgSchemaPublishResultResponse.setSuccess(_ctx.booleanValue("GetKgSchemaPublishResultResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetKgSchemaPublishResultResponse.Data.Status"));
		data.setVersionId(_ctx.integerValue("GetKgSchemaPublishResultResponse.Data.VersionId"));
		data.setContent(_ctx.stringValue("GetKgSchemaPublishResultResponse.Data.Content"));
		getKgSchemaPublishResultResponse.setData(data);
	 
	 	return getKgSchemaPublishResultResponse;
	}
}