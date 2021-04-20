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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.GetTrainLabelResponse;
import com.aliyuncs.vcs.model.v20200515.GetTrainLabelResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTrainLabelResponseUnmarshaller {

	public static GetTrainLabelResponse unmarshall(GetTrainLabelResponse getTrainLabelResponse, UnmarshallerContext _ctx) {
		
		getTrainLabelResponse.setRequestId(_ctx.stringValue("GetTrainLabelResponse.RequestId"));
		getTrainLabelResponse.setMessage(_ctx.stringValue("GetTrainLabelResponse.Message"));
		getTrainLabelResponse.setCode(_ctx.stringValue("GetTrainLabelResponse.Code"));

		Data data = new Data();
		data.setTrainMarkerCnt(_ctx.longValue("GetTrainLabelResponse.Data.TrainMarkerCnt"));
		data.setAlgorithmId(_ctx.stringValue("GetTrainLabelResponse.Data.AlgorithmId"));
		data.setGmtModified(_ctx.stringValue("GetTrainLabelResponse.Data.GmtModified"));
		data.setLabelName(_ctx.stringValue("GetTrainLabelResponse.Data.LabelName"));
		data.setGmtCreated(_ctx.stringValue("GetTrainLabelResponse.Data.GmtCreated"));
		data.setDeleted(_ctx.stringValue("GetTrainLabelResponse.Data.Deleted"));
		data.setID(_ctx.stringValue("GetTrainLabelResponse.Data.ID"));
		data.setTestMarkerCnt(_ctx.longValue("GetTrainLabelResponse.Data.TestMarkerCnt"));
		getTrainLabelResponse.setData(data);
	 
	 	return getTrainLabelResponse;
	}
}