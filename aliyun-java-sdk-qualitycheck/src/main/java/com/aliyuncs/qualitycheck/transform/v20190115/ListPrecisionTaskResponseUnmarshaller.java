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

	public static ListPrecisionTaskResponse unmarshall(ListPrecisionTaskResponse listPrecisionTaskResponse, UnmarshallerContext context) {
		
		listPrecisionTaskResponse.setRequestId(context.stringValue("ListPrecisionTaskResponse.RequestId"));
		listPrecisionTaskResponse.setSuccess(context.booleanValue("ListPrecisionTaskResponse.Success"));
		listPrecisionTaskResponse.setCode(context.stringValue("ListPrecisionTaskResponse.Code"));
		listPrecisionTaskResponse.setMessage(context.stringValue("ListPrecisionTaskResponse.Message"));
		listPrecisionTaskResponse.setPageNumber(context.integerValue("ListPrecisionTaskResponse.PageNumber"));
		listPrecisionTaskResponse.setPageSize(context.integerValue("ListPrecisionTaskResponse.PageSize"));
		listPrecisionTaskResponse.setCount(context.integerValue("ListPrecisionTaskResponse.Count"));

		List<PrecisionTask> data = new ArrayList<PrecisionTask>();
		for (int i = 0; i < context.lengthValue("ListPrecisionTaskResponse.Data.Length"); i++) {
			PrecisionTask precisionTask = new PrecisionTask();
			precisionTask.setName(context.stringValue("ListPrecisionTaskResponse.Data["+ i +"].Name"));
			precisionTask.setTaskId(context.stringValue("ListPrecisionTaskResponse.Data["+ i +"].TaskId"));
			precisionTask.setSource(context.integerValue("ListPrecisionTaskResponse.Data["+ i +"].Source"));
			precisionTask.setDataSetId(context.longValue("ListPrecisionTaskResponse.Data["+ i +"].DataSetId"));
			precisionTask.setDataSetName(context.stringValue("ListPrecisionTaskResponse.Data["+ i +"].DataSetName"));
			precisionTask.setDuration(context.integerValue("ListPrecisionTaskResponse.Data["+ i +"].Duration"));
			precisionTask.setStatus(context.integerValue("ListPrecisionTaskResponse.Data["+ i +"].Status"));
			precisionTask.setTotalCount(context.integerValue("ListPrecisionTaskResponse.Data["+ i +"].TotalCount"));
			precisionTask.setVerifiedCount(context.integerValue("ListPrecisionTaskResponse.Data["+ i +"].VerifiedCount"));
			precisionTask.setIncorrectWords(context.integerValue("ListPrecisionTaskResponse.Data["+ i +"].IncorrectWords"));
			precisionTask.setCreateTime(context.stringValue("ListPrecisionTaskResponse.Data["+ i +"].CreateTime"));
			precisionTask.setUpdateTime(context.stringValue("ListPrecisionTaskResponse.Data["+ i +"].UpdateTime"));

			List<Precision> precisions = new ArrayList<Precision>();
			for (int j = 0; j < context.lengthValue("ListPrecisionTaskResponse.Data["+ i +"].Precisions.Length"); j++) {
				Precision precision = new Precision();
				precision.setModelName(context.stringValue("ListPrecisionTaskResponse.Data["+ i +"].Precisions["+ j +"].ModelName"));
				precision.setModelId(context.longValue("ListPrecisionTaskResponse.Data["+ i +"].Precisions["+ j +"].ModelId"));
				precision.setPrecision(context.floatValue("ListPrecisionTaskResponse.Data["+ i +"].Precisions["+ j +"].Precision"));
				precision.setStatus(context.integerValue("ListPrecisionTaskResponse.Data["+ i +"].Precisions["+ j +"].Status"));
				precision.setTaskId(context.stringValue("ListPrecisionTaskResponse.Data["+ i +"].Precisions["+ j +"].TaskId"));

				precisions.add(precision);
			}
			precisionTask.setPrecisions(precisions);

			data.add(precisionTask);
		}
		listPrecisionTaskResponse.setData(data);
	 
	 	return listPrecisionTaskResponse;
	}
}