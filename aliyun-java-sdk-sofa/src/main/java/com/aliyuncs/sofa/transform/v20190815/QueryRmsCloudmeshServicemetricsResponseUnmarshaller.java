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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshServicemetricsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshServicemetricsResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshServicemetricsResponse.Response.Data;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshServicemetricsResponse.Response.Data.ErrorRateItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshServicemetricsResponse.Response.Data.ResTimeItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsCloudmeshServicemetricsResponse.Response.Data.RpsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsCloudmeshServicemetricsResponseUnmarshaller {

	public static QueryRmsCloudmeshServicemetricsResponse unmarshall(QueryRmsCloudmeshServicemetricsResponse queryRmsCloudmeshServicemetricsResponse, UnmarshallerContext _ctx) {
		
		queryRmsCloudmeshServicemetricsResponse.setRequestId(_ctx.stringValue("QueryRmsCloudmeshServicemetricsResponse.RequestId"));
		queryRmsCloudmeshServicemetricsResponse.setResultCode(_ctx.stringValue("QueryRmsCloudmeshServicemetricsResponse.ResultCode"));
		queryRmsCloudmeshServicemetricsResponse.setResultMessage(_ctx.stringValue("QueryRmsCloudmeshServicemetricsResponse.ResultMessage"));

		Response response = new Response();
		response.setErrMsg(_ctx.stringValue("QueryRmsCloudmeshServicemetricsResponse.Response.ErrMsg"));
		response.setSuccess(_ctx.booleanValue("QueryRmsCloudmeshServicemetricsResponse.Response.Success"));

		Data data = new Data();

		List<ErrorRateItem> errorRate = new ArrayList<ErrorRateItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshServicemetricsResponse.Response.Data.ErrorRate.Length"); i++) {
			ErrorRateItem errorRateItem = new ErrorRateItem();
			errorRateItem.setTimestamp(_ctx.longValue("QueryRmsCloudmeshServicemetricsResponse.Response.Data.ErrorRate["+ i +"].Timestamp"));
			errorRateItem.setValue(_ctx.stringValue("QueryRmsCloudmeshServicemetricsResponse.Response.Data.ErrorRate["+ i +"].Value"));

			errorRate.add(errorRateItem);
		}
		data.setErrorRate(errorRate);

		List<ResTimeItem> resTime = new ArrayList<ResTimeItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshServicemetricsResponse.Response.Data.ResTime.Length"); i++) {
			ResTimeItem resTimeItem = new ResTimeItem();
			resTimeItem.setTimestamp(_ctx.longValue("QueryRmsCloudmeshServicemetricsResponse.Response.Data.ResTime["+ i +"].Timestamp"));
			resTimeItem.setValue(_ctx.stringValue("QueryRmsCloudmeshServicemetricsResponse.Response.Data.ResTime["+ i +"].Value"));

			resTime.add(resTimeItem);
		}
		data.setResTime(resTime);

		List<RpsItem> rps = new ArrayList<RpsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsCloudmeshServicemetricsResponse.Response.Data.Rps.Length"); i++) {
			RpsItem rpsItem = new RpsItem();
			rpsItem.setTimestamp(_ctx.longValue("QueryRmsCloudmeshServicemetricsResponse.Response.Data.Rps["+ i +"].Timestamp"));
			rpsItem.setValue(_ctx.stringValue("QueryRmsCloudmeshServicemetricsResponse.Response.Data.Rps["+ i +"].Value"));

			rps.add(rpsItem);
		}
		data.setRps(rps);
		response.setData(data);
		queryRmsCloudmeshServicemetricsResponse.setResponse(response);
	 
	 	return queryRmsCloudmeshServicemetricsResponse;
	}
}