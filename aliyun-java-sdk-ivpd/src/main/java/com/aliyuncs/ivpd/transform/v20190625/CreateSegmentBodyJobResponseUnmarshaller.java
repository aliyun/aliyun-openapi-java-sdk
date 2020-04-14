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

package com.aliyuncs.ivpd.transform.v20190625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivpd.model.v20190625.CreateSegmentBodyJobResponse;
import com.aliyuncs.ivpd.model.v20190625.CreateSegmentBodyJobResponse.Data;
import com.aliyuncs.ivpd.model.v20190625.CreateSegmentBodyJobResponse.Data.Result;
import com.aliyuncs.ivpd.model.v20190625.CreateSegmentBodyJobResponse.Data.Result.ResultData;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSegmentBodyJobResponseUnmarshaller {

	public static CreateSegmentBodyJobResponse unmarshall(CreateSegmentBodyJobResponse createSegmentBodyJobResponse, UnmarshallerContext _ctx) {
		
		createSegmentBodyJobResponse.setRequestId(_ctx.stringValue("CreateSegmentBodyJobResponse.RequestId"));
		createSegmentBodyJobResponse.setCode(_ctx.stringValue("CreateSegmentBodyJobResponse.Code"));
		createSegmentBodyJobResponse.setMessage(_ctx.stringValue("CreateSegmentBodyJobResponse.Message"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("CreateSegmentBodyJobResponse.Data.Status"));
		data.setCompleted(_ctx.booleanValue("CreateSegmentBodyJobResponse.Data.Completed"));
		data.setBatchSize(_ctx.integerValue("CreateSegmentBodyJobResponse.Data.BatchSize"));
		data.setTotalUsedTime(_ctx.longValue("CreateSegmentBodyJobResponse.Data.TotalUsedTime"));
		data.setProgress(_ctx.integerValue("CreateSegmentBodyJobResponse.Data.Progress"));
		data.setJobId(_ctx.stringValue("CreateSegmentBodyJobResponse.Data.JobId"));

		List<Result> resultList = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("CreateSegmentBodyJobResponse.Data.ResultList.Length"); i++) {
			Result result = new Result();
			result.setDataId(_ctx.stringValue("CreateSegmentBodyJobResponse.Data.ResultList["+ i +"].DataId"));
			result.setSuccess(_ctx.booleanValue("CreateSegmentBodyJobResponse.Data.ResultList["+ i +"].Success"));
			result.setCode(_ctx.stringValue("CreateSegmentBodyJobResponse.Data.ResultList["+ i +"].Code"));
			result.setMessage(_ctx.stringValue("CreateSegmentBodyJobResponse.Data.ResultList["+ i +"].Message"));

			ResultData resultData = new ResultData();
			resultData.setImageUrl(_ctx.stringValue("CreateSegmentBodyJobResponse.Data.ResultList["+ i +"].ResultData.ImageUrl"));
			result.setResultData(resultData);

			resultList.add(result);
		}
		data.setResultList(resultList);
		createSegmentBodyJobResponse.setData(data);
	 
	 	return createSegmentBodyJobResponse;
	}
}