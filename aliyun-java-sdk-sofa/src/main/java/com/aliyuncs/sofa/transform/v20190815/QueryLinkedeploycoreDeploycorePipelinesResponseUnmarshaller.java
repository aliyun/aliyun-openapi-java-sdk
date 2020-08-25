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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycorePipelinesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycorePipelinesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycorePipelinesResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycorePipelinesResponse unmarshall(QueryLinkedeploycoreDeploycorePipelinesResponse queryLinkedeploycoreDeploycorePipelinesResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycorePipelinesResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycorePipelinesResponse.RequestId"));
		queryLinkedeploycoreDeploycorePipelinesResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycorePipelinesResponse.ResultCode"));
		queryLinkedeploycoreDeploycorePipelinesResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycorePipelinesResponse.ResultMessage"));
		queryLinkedeploycoreDeploycorePipelinesResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycorePipelinesResponse.Message"));
		queryLinkedeploycoreDeploycorePipelinesResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycorePipelinesResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycorePipelinesResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycorePipelinesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycorePipelinesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEnvType(_ctx.stringValue("QueryLinkedeploycoreDeploycorePipelinesResponse.Data["+ i +"].EnvType"));
			dataItem.setGmtCreate(_ctx.longValue("QueryLinkedeploycoreDeploycorePipelinesResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.longValue("QueryLinkedeploycoreDeploycorePipelinesResponse.Data["+ i +"].GmtModified"));
			dataItem.setId(_ctx.longValue("QueryLinkedeploycoreDeploycorePipelinesResponse.Data["+ i +"].Id"));
			dataItem.setPipelineDesc(_ctx.stringValue("QueryLinkedeploycoreDeploycorePipelinesResponse.Data["+ i +"].PipelineDesc"));
			dataItem.setPipelineId(_ctx.longValue("QueryLinkedeploycoreDeploycorePipelinesResponse.Data["+ i +"].PipelineId"));
			dataItem.setPipelineName(_ctx.stringValue("QueryLinkedeploycoreDeploycorePipelinesResponse.Data["+ i +"].PipelineName"));

			data.add(dataItem);
		}
		queryLinkedeploycoreDeploycorePipelinesResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycorePipelinesResponse;
	}
}