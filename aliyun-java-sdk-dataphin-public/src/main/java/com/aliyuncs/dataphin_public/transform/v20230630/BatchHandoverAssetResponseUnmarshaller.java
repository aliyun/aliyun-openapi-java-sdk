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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.BatchHandoverAssetResponse;
import com.aliyuncs.dataphin_public.model.v20230630.BatchHandoverAssetResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchHandoverAssetResponseUnmarshaller {

	public static BatchHandoverAssetResponse unmarshall(BatchHandoverAssetResponse batchHandoverAssetResponse, UnmarshallerContext _ctx) {
		
		batchHandoverAssetResponse.setRequestId(_ctx.stringValue("BatchHandoverAssetResponse.RequestId"));
		batchHandoverAssetResponse.setMessage(_ctx.stringValue("BatchHandoverAssetResponse.Message"));
		batchHandoverAssetResponse.setHttpStatusCode(_ctx.integerValue("BatchHandoverAssetResponse.HttpStatusCode"));
		batchHandoverAssetResponse.setCode(_ctx.stringValue("BatchHandoverAssetResponse.Code"));
		batchHandoverAssetResponse.setSuccess(_ctx.booleanValue("BatchHandoverAssetResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("BatchHandoverAssetResponse.Data.Status"));
		data.setTotalCount(_ctx.integerValue("BatchHandoverAssetResponse.Data.TotalCount"));
		data.setFailCount(_ctx.integerValue("BatchHandoverAssetResponse.Data.FailCount"));
		data.setSuccessCount(_ctx.integerValue("BatchHandoverAssetResponse.Data.SuccessCount"));
		data.setErrorMessage(_ctx.stringValue("BatchHandoverAssetResponse.Data.ErrorMessage"));

		List<String> failedGuids = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchHandoverAssetResponse.Data.FailedGuids.Length"); i++) {
			failedGuids.add(_ctx.stringValue("BatchHandoverAssetResponse.Data.FailedGuids["+ i +"]"));
		}
		data.setFailedGuids(failedGuids);
		batchHandoverAssetResponse.setData(data);
	 
	 	return batchHandoverAssetResponse;
	}
}