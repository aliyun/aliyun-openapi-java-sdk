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

import com.aliyuncs.dataphin_public.model.v20230630.SubmitAssetsOnShelveResponse;
import com.aliyuncs.dataphin_public.model.v20230630.SubmitAssetsOnShelveResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.SubmitAssetsOnShelveResponse.Data.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitAssetsOnShelveResponseUnmarshaller {

	public static SubmitAssetsOnShelveResponse unmarshall(SubmitAssetsOnShelveResponse submitAssetsOnShelveResponse, UnmarshallerContext _ctx) {
		
		submitAssetsOnShelveResponse.setRequestId(_ctx.stringValue("SubmitAssetsOnShelveResponse.RequestId"));
		submitAssetsOnShelveResponse.setMessage(_ctx.stringValue("SubmitAssetsOnShelveResponse.Message"));
		submitAssetsOnShelveResponse.setHttpStatusCode(_ctx.integerValue("SubmitAssetsOnShelveResponse.HttpStatusCode"));
		submitAssetsOnShelveResponse.setCode(_ctx.stringValue("SubmitAssetsOnShelveResponse.Code"));
		submitAssetsOnShelveResponse.setSuccess(_ctx.booleanValue("SubmitAssetsOnShelveResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("SubmitAssetsOnShelveResponse.Data.TotalCount"));
		data.setFailCount(_ctx.integerValue("SubmitAssetsOnShelveResponse.Data.FailCount"));
		data.setSuccessCount(_ctx.integerValue("SubmitAssetsOnShelveResponse.Data.SuccessCount"));

		List<Result> resultList = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("SubmitAssetsOnShelveResponse.Data.ResultList.Length"); i++) {
			Result result = new Result();
			result.setGuid(_ctx.stringValue("SubmitAssetsOnShelveResponse.Data.ResultList["+ i +"].Guid"));
			result.setErrorCode(_ctx.stringValue("SubmitAssetsOnShelveResponse.Data.ResultList["+ i +"].ErrorCode"));
			result.setErrorMessage(_ctx.stringValue("SubmitAssetsOnShelveResponse.Data.ResultList["+ i +"].ErrorMessage"));
			result.setSuccess(_ctx.booleanValue("SubmitAssetsOnShelveResponse.Data.ResultList["+ i +"].Success"));

			resultList.add(result);
		}
		data.setResultList(resultList);
		submitAssetsOnShelveResponse.setData(data);
	 
	 	return submitAssetsOnShelveResponse;
	}
}