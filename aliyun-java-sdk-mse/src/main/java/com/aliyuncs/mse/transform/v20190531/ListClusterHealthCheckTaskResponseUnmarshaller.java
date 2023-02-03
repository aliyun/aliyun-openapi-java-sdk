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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListClusterHealthCheckTaskResponse;
import com.aliyuncs.mse.model.v20190531.ListClusterHealthCheckTaskResponse.Data;
import com.aliyuncs.mse.model.v20190531.ListClusterHealthCheckTaskResponse.Data.ResultItem;
import com.aliyuncs.mse.model.v20190531.ListClusterHealthCheckTaskResponse.Data.ResultItem.RiskListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterHealthCheckTaskResponseUnmarshaller {

	public static ListClusterHealthCheckTaskResponse unmarshall(ListClusterHealthCheckTaskResponse listClusterHealthCheckTaskResponse, UnmarshallerContext _ctx) {
		
		listClusterHealthCheckTaskResponse.setRequestId(_ctx.stringValue("ListClusterHealthCheckTaskResponse.RequestId"));
		listClusterHealthCheckTaskResponse.setSuccess(_ctx.booleanValue("ListClusterHealthCheckTaskResponse.Success"));
		listClusterHealthCheckTaskResponse.setCode(_ctx.integerValue("ListClusterHealthCheckTaskResponse.Code"));
		listClusterHealthCheckTaskResponse.setErrorCode(_ctx.stringValue("ListClusterHealthCheckTaskResponse.ErrorCode"));
		listClusterHealthCheckTaskResponse.setHttpStatusCode(_ctx.integerValue("ListClusterHealthCheckTaskResponse.HttpStatusCode"));
		listClusterHealthCheckTaskResponse.setMessage(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Message"));
		listClusterHealthCheckTaskResponse.setDynamicCode(_ctx.stringValue("ListClusterHealthCheckTaskResponse.DynamicCode"));
		listClusterHealthCheckTaskResponse.setDynamicMessage(_ctx.stringValue("ListClusterHealthCheckTaskResponse.DynamicMessage"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListClusterHealthCheckTaskResponse.Data.PageNumber"));
		data.setTotalSize(_ctx.integerValue("ListClusterHealthCheckTaskResponse.Data.TotalSize"));
		data.setPageSize(_ctx.integerValue("ListClusterHealthCheckTaskResponse.Data.PageSize"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterHealthCheckTaskResponse.Data.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.integerValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].Id"));
			resultItem.setScore(_ctx.integerValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].Score"));
			resultItem.setTotalItem(_ctx.integerValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].TotalItem"));
			resultItem.setTotalRisk(_ctx.integerValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].TotalRisk"));
			resultItem.setInstanceId(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].InstanceId"));
			resultItem.setClusterType(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].ClusterType"));
			resultItem.setType(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].Type"));
			resultItem.setStatus(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].Status"));
			resultItem.setPrimaryUser(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].PrimaryUser"));
			resultItem.setSpec(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].Spec"));
			resultItem.setReplica(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].Replica"));
			resultItem.setVersionCode(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].VersionCode"));
			resultItem.setAppVersion(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].AppVersion"));
			resultItem.setImageVersion(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].ImageVersion"));
			resultItem.setCreateTime(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].CreateTime"));
			resultItem.setUpdateTime(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].UpdateTime"));
			resultItem.setChargeType(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].ChargeType"));

			List<RiskListItem> riskList = new ArrayList<RiskListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].RiskList.Length"); j++) {
				RiskListItem riskListItem = new RiskListItem();
				riskListItem.setId(_ctx.integerValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].RiskList["+ j +"].Id"));
				riskListItem.setTaskId(_ctx.longValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].RiskList["+ j +"].TaskId"));
				riskListItem.setRiskName(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].RiskList["+ j +"].RiskName"));
				riskListItem.setRiskCode(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].RiskList["+ j +"].RiskCode"));
				riskListItem.setPrimaryUser(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].RiskList["+ j +"].PrimaryUser"));
				riskListItem.setType(_ctx.integerValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].RiskList["+ j +"].Type"));
				riskListItem.setValues(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].RiskList["+ j +"].Values"));
				riskListItem.setModule(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].RiskList["+ j +"].Module"));
				riskListItem.setRiskType(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].RiskList["+ j +"].RiskType"));
				riskListItem.setRiskLevel(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].RiskList["+ j +"].RiskLevel"));
				riskListItem.setSuggestion(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].RiskList["+ j +"].Suggestion"));
				riskListItem.setSituation(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].RiskList["+ j +"].Situation"));
				riskListItem.setDescription(_ctx.stringValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].RiskList["+ j +"].Description"));
				riskListItem.setMute(_ctx.booleanValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].RiskList["+ j +"].Mute"));
				riskListItem.setNoticeFeature(_ctx.booleanValue("ListClusterHealthCheckTaskResponse.Data.Result["+ i +"].RiskList["+ j +"].NoticeFeature"));

				riskList.add(riskListItem);
			}
			resultItem.setRiskList(riskList);

			result.add(resultItem);
		}
		data.setResult(result);
		listClusterHealthCheckTaskResponse.setData(data);
	 
	 	return listClusterHealthCheckTaskResponse;
	}
}