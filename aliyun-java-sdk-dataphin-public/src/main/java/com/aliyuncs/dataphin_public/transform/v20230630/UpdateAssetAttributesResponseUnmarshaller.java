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

import com.aliyuncs.dataphin_public.model.v20230630.UpdateAssetAttributesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.UpdateAssetAttributesResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.UpdateAssetAttributesResponse.Data.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAssetAttributesResponseUnmarshaller {

	public static UpdateAssetAttributesResponse unmarshall(UpdateAssetAttributesResponse updateAssetAttributesResponse, UnmarshallerContext _ctx) {
		
		updateAssetAttributesResponse.setRequestId(_ctx.stringValue("UpdateAssetAttributesResponse.RequestId"));
		updateAssetAttributesResponse.setMessage(_ctx.stringValue("UpdateAssetAttributesResponse.Message"));
		updateAssetAttributesResponse.setHttpStatusCode(_ctx.integerValue("UpdateAssetAttributesResponse.HttpStatusCode"));
		updateAssetAttributesResponse.setCode(_ctx.stringValue("UpdateAssetAttributesResponse.Code"));
		updateAssetAttributesResponse.setSuccess(_ctx.booleanValue("UpdateAssetAttributesResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("UpdateAssetAttributesResponse.Data.TotalCount"));
		data.setFailCount(_ctx.integerValue("UpdateAssetAttributesResponse.Data.FailCount"));
		data.setSuccessCount(_ctx.integerValue("UpdateAssetAttributesResponse.Data.SuccessCount"));

		List<Result> resultList = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAssetAttributesResponse.Data.ResultList.Length"); i++) {
			Result result = new Result();
			result.setGuid(_ctx.stringValue("UpdateAssetAttributesResponse.Data.ResultList["+ i +"].Guid"));
			result.setErrorCode(_ctx.stringValue("UpdateAssetAttributesResponse.Data.ResultList["+ i +"].ErrorCode"));
			result.setErrorMessage(_ctx.stringValue("UpdateAssetAttributesResponse.Data.ResultList["+ i +"].ErrorMessage"));
			result.setSuccess(_ctx.booleanValue("UpdateAssetAttributesResponse.Data.ResultList["+ i +"].Success"));

			resultList.add(result);
		}
		data.setResultList(resultList);
		updateAssetAttributesResponse.setData(data);
	 
	 	return updateAssetAttributesResponse;
	}
}