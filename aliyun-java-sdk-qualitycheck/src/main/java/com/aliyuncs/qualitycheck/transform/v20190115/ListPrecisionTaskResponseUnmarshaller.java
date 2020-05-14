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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.ListPrecisionTaskResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListPrecisionTaskResponse.PrecisionTask;
import com.aliyuncs.qualitycheck.model.v20190115.ListPrecisionTaskResponse.PrecisionTask.Precision;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrecisionTaskResponseUnmarshaller {

	public static ListPrecisionTaskResponse unmarshall(ListPrecisionTaskResponse listPrecisionTaskResponse, UnmarshallerContext _ctx) {
		
		listPrecisionTaskResponse.setRequestId(_ctx.stringValue("ListPrecisionTaskResponse.RequestId"));
		listPrecisionTaskResponse.setSuccess(_ctx.booleanValue("ListPrecisionTaskResponse.Success"));
		listPrecisionTaskResponse.setCode(_ctx.stringValue("ListPrecisionTaskResponse.Code"));
		listPrecisionTaskResponse.setMessage(_ctx.stringValue("ListPrecisionTaskResponse.Message"));
		listPrecisionTaskResponse.setPageNumber(_ctx.integerValue("ListPrecisionTaskResponse.PageNumber"));
		listPrecisionTaskResponse.setPageSize(_ctx.integerValue("ListPrecisionTaskResponse.PageSize"));
		listPrecisionTaskResponse.setCount(_ctx.integerValue("ListPrecisionTaskResponse.Count"));

		List<PrecisionTask> data = new ArrayList<PrecisionTask>();
		for (int i = 0; i < _ctx.lengthValue("ListPrecisionTaskResponse.Data.Length"); i++) {
			PrecisionTask precisionTask = new PrecisionTask();
			precisionTask.setName(_ctx.stringValue("ListPrecisionTaskResponse.Data["+ i +"].Name"));
			precisionTask.setTaskId(_ctx.stringValue("ListPrecisionTaskResponse.Data["+ i +"].TaskId"));
			precisionTask.setSource(_ctx.integerValue("ListPrecisionTaskResponse.Data["+ i +"].Source"));
			precisionTask.setDataSetId(_ctx.longValue("ListPrecisionTaskResponse.Data["+ i +"].DataSetId"));
			precisionTask.setDataSetName(_ctx.stringValue("ListPrecisionTaskResponse.Data["+ i +"].DataSetName"));
			precisionTask.setDuration(_ctx.integerValue("ListPrecisionTaskResponse.Data["+ i +"].Duration"));
			precisionTask.setStatus(_ctx.integerValue("ListPrecisionTaskResponse.Data["+ i +"].Status"));
			precisionTask.setTotalCount(_ctx.integerValue("ListPrecisionTaskResponse.Data["+ i +"].TotalCount"));
			precisionTask.setVerifiedCount(_ctx.integerValue("ListPrecisionTaskResponse.Data["+ i +"].VerifiedCount"));
			precisionTask.setIncorrectWords(_ctx.integerValue("ListPrecisionTaskResponse.Data["+ i +"].IncorrectWords"));
			precisionTask.setCreateTime(_ctx.stringValue("ListPrecisionTaskResponse.Data["+ i +"].CreateTime"));
			precisionTask.setUpdateTime(_ctx.stringValue("ListPrecisionTaskResponse.Data["+ i +"].UpdateTime"));

			List<Precision> precisions = new ArrayList<Precision>();
			for (int j = 0; j < _ctx.lengthValue("ListPrecisionTaskResponse.Data["+ i +"].Precisions.Length"); j++) {
				Precision precision = new Precision();
				precision.setModelName(_ctx.stringValue("ListPrecisionTaskResponse.Data["+ i +"].Precisions["+ j +"].ModelName"));
				precision.setModelId(_ctx.longValue("ListPrecisionTaskResponse.Data["+ i +"].Precisions["+ j +"].ModelId"));
				precision.setPrecision(_ctx.floatValue("ListPrecisionTaskResponse.Data["+ i +"].Precisions["+ j +"].Precision"));
				precision.setStatus(_ctx.integerValue("ListPrecisionTaskResponse.Data["+ i +"].Precisions["+ j +"].Status"));
				precision.setTaskId(_ctx.stringValue("ListPrecisionTaskResponse.Data["+ i +"].Precisions["+ j +"].TaskId"));
				precision.setCreateTime(_ctx.stringValue("ListPrecisionTaskResponse.Data["+ i +"].Precisions["+ j +"].CreateTime"));

				precisions.add(precision);
			}
			precisionTask.setPrecisions(precisions);

			data.add(precisionTask);
		}
		listPrecisionTaskResponse.setData(data);
	 
	 	return listPrecisionTaskResponse;
	}
}