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

import com.aliyuncs.qualitycheck.model.v20190115.GetPrecisionTaskResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetPrecisionTaskResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.GetPrecisionTaskResponse.Data.Precision;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPrecisionTaskResponseUnmarshaller {

	public static GetPrecisionTaskResponse unmarshall(GetPrecisionTaskResponse getPrecisionTaskResponse, UnmarshallerContext context) {
		
		getPrecisionTaskResponse.setRequestId(context.stringValue("GetPrecisionTaskResponse.RequestId"));
		getPrecisionTaskResponse.setSuccess(context.booleanValue("GetPrecisionTaskResponse.Success"));
		getPrecisionTaskResponse.setCode(context.stringValue("GetPrecisionTaskResponse.Code"));
		getPrecisionTaskResponse.setMessage(context.stringValue("GetPrecisionTaskResponse.Message"));

		Data data = new Data();
		data.setName(context.stringValue("GetPrecisionTaskResponse.Data.Name"));
		data.setSource(context.integerValue("GetPrecisionTaskResponse.Data.Source"));
		data.setDataSetId(context.longValue("GetPrecisionTaskResponse.Data.DataSetId"));
		data.setDataSetName(context.stringValue("GetPrecisionTaskResponse.Data.DataSetName"));
		data.setTaskId(context.stringValue("GetPrecisionTaskResponse.Data.TaskId"));
		data.setDuration(context.integerValue("GetPrecisionTaskResponse.Data.Duration"));
		data.setUpdateTime(context.stringValue("GetPrecisionTaskResponse.Data.UpdateTime"));
		data.setStatus(context.integerValue("GetPrecisionTaskResponse.Data.Status"));
		data.setTotalCount(context.integerValue("GetPrecisionTaskResponse.Data.TotalCount"));
		data.setVerifiedCount(context.integerValue("GetPrecisionTaskResponse.Data.VerifiedCount"));
		data.setIncorrectWords(context.integerValue("GetPrecisionTaskResponse.Data.IncorrectWords"));

		List<Precision> precisions = new ArrayList<Precision>();
		for (int i = 0; i < context.lengthValue("GetPrecisionTaskResponse.Data.Precisions.Length"); i++) {
			Precision precision = new Precision();
			precision.setModelName(context.stringValue("GetPrecisionTaskResponse.Data.Precisions["+ i +"].ModelName"));
			precision.setModelId(context.longValue("GetPrecisionTaskResponse.Data.Precisions["+ i +"].ModelId"));
			precision.setPrecision(context.floatValue("GetPrecisionTaskResponse.Data.Precisions["+ i +"].Precision"));
			precision.setStatus(context.integerValue("GetPrecisionTaskResponse.Data.Precisions["+ i +"].Status"));
			precision.setTaskId(context.stringValue("GetPrecisionTaskResponse.Data.Precisions["+ i +"].TaskId"));

			precisions.add(precision);
		}
		data.setPrecisions(precisions);
		getPrecisionTaskResponse.setData(data);
	 
	 	return getPrecisionTaskResponse;
	}
}