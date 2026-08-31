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

import com.aliyuncs.dataphin_public.model.v20230630.SubmitAssetsOffShelveResponse;
import com.aliyuncs.dataphin_public.model.v20230630.SubmitAssetsOffShelveResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.SubmitAssetsOffShelveResponse.Data.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitAssetsOffShelveResponseUnmarshaller {

	public static SubmitAssetsOffShelveResponse unmarshall(SubmitAssetsOffShelveResponse submitAssetsOffShelveResponse, UnmarshallerContext _ctx) {
		
		submitAssetsOffShelveResponse.setRequestId(_ctx.stringValue("SubmitAssetsOffShelveResponse.RequestId"));
		submitAssetsOffShelveResponse.setMessage(_ctx.stringValue("SubmitAssetsOffShelveResponse.Message"));
		submitAssetsOffShelveResponse.setHttpStatusCode(_ctx.integerValue("SubmitAssetsOffShelveResponse.HttpStatusCode"));
		submitAssetsOffShelveResponse.setCode(_ctx.stringValue("SubmitAssetsOffShelveResponse.Code"));
		submitAssetsOffShelveResponse.setSuccess(_ctx.booleanValue("SubmitAssetsOffShelveResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("SubmitAssetsOffShelveResponse.Data.TotalCount"));
		data.setFailCount(_ctx.integerValue("SubmitAssetsOffShelveResponse.Data.FailCount"));
		data.setSuccessCount(_ctx.integerValue("SubmitAssetsOffShelveResponse.Data.SuccessCount"));

		List<Result> resultList = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("SubmitAssetsOffShelveResponse.Data.ResultList.Length"); i++) {
			Result result = new Result();
			result.setGuid(_ctx.stringValue("SubmitAssetsOffShelveResponse.Data.ResultList["+ i +"].Guid"));
			result.setErrorCode(_ctx.stringValue("SubmitAssetsOffShelveResponse.Data.ResultList["+ i +"].ErrorCode"));
			result.setErrorMessage(_ctx.stringValue("SubmitAssetsOffShelveResponse.Data.ResultList["+ i +"].ErrorMessage"));
			result.setSuccess(_ctx.booleanValue("SubmitAssetsOffShelveResponse.Data.ResultList["+ i +"].Success"));

			resultList.add(result);
		}
		data.setResultList(resultList);
		submitAssetsOffShelveResponse.setData(data);
	 
	 	return submitAssetsOffShelveResponse;
	}
}