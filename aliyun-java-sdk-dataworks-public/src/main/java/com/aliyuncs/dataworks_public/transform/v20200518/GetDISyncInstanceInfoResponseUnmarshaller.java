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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetDISyncInstanceInfoResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetDISyncInstanceInfoResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetDISyncInstanceInfoResponse.Data.SolutionInfo;
import com.aliyuncs.dataworks_public.model.v20200518.GetDISyncInstanceInfoResponse.Data.SolutionInfo.StepDetailItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDISyncInstanceInfoResponseUnmarshaller {

	public static GetDISyncInstanceInfoResponse unmarshall(GetDISyncInstanceInfoResponse getDISyncInstanceInfoResponse, UnmarshallerContext _ctx) {
		
		getDISyncInstanceInfoResponse.setRequestId(_ctx.stringValue("GetDISyncInstanceInfoResponse.RequestId"));
		getDISyncInstanceInfoResponse.setSuccess(_ctx.booleanValue("GetDISyncInstanceInfoResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetDISyncInstanceInfoResponse.Data.Status"));
		data.setMessage(_ctx.stringValue("GetDISyncInstanceInfoResponse.Data.Message"));
		data.setName(_ctx.stringValue("GetDISyncInstanceInfoResponse.Data.Name"));

		SolutionInfo solutionInfo = new SolutionInfo();
		solutionInfo.setStatus(_ctx.stringValue("GetDISyncInstanceInfoResponse.Data.SolutionInfo.Status"));
		solutionInfo.setId(_ctx.longValue("GetDISyncInstanceInfoResponse.Data.SolutionInfo.Id"));
		solutionInfo.setCreatorName(_ctx.stringValue("GetDISyncInstanceInfoResponse.Data.SolutionInfo.CreatorName"));

		List<StepDetailItem> stepDetail = new ArrayList<StepDetailItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDISyncInstanceInfoResponse.Data.SolutionInfo.StepDetail.Length"); i++) {
			StepDetailItem stepDetailItem = new StepDetailItem();
			stepDetailItem.setStatus(_ctx.stringValue("GetDISyncInstanceInfoResponse.Data.SolutionInfo.StepDetail["+ i +"].Status"));
			stepDetailItem.setStepId(_ctx.longValue("GetDISyncInstanceInfoResponse.Data.SolutionInfo.StepDetail["+ i +"].StepId"));
			stepDetailItem.setStepName(_ctx.stringValue("GetDISyncInstanceInfoResponse.Data.SolutionInfo.StepDetail["+ i +"].StepName"));

			stepDetail.add(stepDetailItem);
		}
		solutionInfo.setStepDetail(stepDetail);
		data.setSolutionInfo(solutionInfo);
		getDISyncInstanceInfoResponse.setData(data);
	 
	 	return getDISyncInstanceInfoResponse;
	}
}