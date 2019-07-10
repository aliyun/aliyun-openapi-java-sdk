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

	public static GetPrecisionTaskResponse unmarshall(GetPrecisionTaskResponse getPrecisionTaskResponse, UnmarshallerContext _ctx) {
		
		getPrecisionTaskResponse.setRequestId(_ctx.stringValue("GetPrecisionTaskResponse.RequestId"));
		getPrecisionTaskResponse.setSuccess(_ctx.booleanValue("GetPrecisionTaskResponse.Success"));
		getPrecisionTaskResponse.setCode(_ctx.stringValue("GetPrecisionTaskResponse.Code"));
		getPrecisionTaskResponse.setMessage(_ctx.stringValue("GetPrecisionTaskResponse.Message"));

		Data data = new Data();
		data.setName(_ctx.stringValue("GetPrecisionTaskResponse.Data.Name"));
		data.setSource(_ctx.integerValue("GetPrecisionTaskResponse.Data.Source"));
		data.setDataSetId(_ctx.longValue("GetPrecisionTaskResponse.Data.DataSetId"));
		data.setDataSetName(_ctx.stringValue("GetPrecisionTaskResponse.Data.DataSetName"));
		data.setTaskId(_ctx.stringValue("GetPrecisionTaskResponse.Data.TaskId"));
		data.setDuration(_ctx.integerValue("GetPrecisionTaskResponse.Data.Duration"));
		data.setUpdateTime(_ctx.stringValue("GetPrecisionTaskResponse.Data.UpdateTime"));
		data.setStatus(_ctx.integerValue("GetPrecisionTaskResponse.Data.Status"));
		data.setTotalCount(_ctx.integerValue("GetPrecisionTaskResponse.Data.TotalCount"));
		data.setVerifiedCount(_ctx.integerValue("GetPrecisionTaskResponse.Data.VerifiedCount"));
		data.setIncorrectWords(_ctx.integerValue("GetPrecisionTaskResponse.Data.IncorrectWords"));

		List<Precision> precisions = new ArrayList<Precision>();
		for (int i = 0; i < _ctx.lengthValue("GetPrecisionTaskResponse.Data.Precisions.Length"); i++) {
			Precision precision = new Precision();
			precision.setModelName(_ctx.stringValue("GetPrecisionTaskResponse.Data.Precisions["+ i +"].ModelName"));
			precision.setModelId(_ctx.longValue("GetPrecisionTaskResponse.Data.Precisions["+ i +"].ModelId"));
			precision.setPrecision(_ctx.floatValue("GetPrecisionTaskResponse.Data.Precisions["+ i +"].Precision"));
			precision.setStatus(_ctx.integerValue("GetPrecisionTaskResponse.Data.Precisions["+ i +"].Status"));
			precision.setTaskId(_ctx.stringValue("GetPrecisionTaskResponse.Data.Precisions["+ i +"].TaskId"));

			precisions.add(precision);
		}
		data.setPrecisions(precisions);
		getPrecisionTaskResponse.setData(data);
	 
	 	return getPrecisionTaskResponse;
	}
}