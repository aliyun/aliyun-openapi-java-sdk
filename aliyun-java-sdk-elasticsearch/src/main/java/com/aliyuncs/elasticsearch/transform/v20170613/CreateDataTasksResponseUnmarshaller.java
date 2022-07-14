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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.CreateDataTasksResponse;
import com.aliyuncs.elasticsearch.model.v20170613.CreateDataTasksResponse.ResultItem;
import com.aliyuncs.elasticsearch.model.v20170613.CreateDataTasksResponse.ResultItem.SinkCluster;
import com.aliyuncs.elasticsearch.model.v20170613.CreateDataTasksResponse.ResultItem.SourceCluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataTasksResponseUnmarshaller {

	public static CreateDataTasksResponse unmarshall(CreateDataTasksResponse createDataTasksResponse, UnmarshallerContext _ctx) {
		
		createDataTasksResponse.setRequestId(_ctx.stringValue("CreateDataTasksResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateDataTasksResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();

			SourceCluster sourceCluster = new SourceCluster();
			sourceCluster.setPassword(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sourceCluster.password"));
			sourceCluster.setIndex(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sourceCluster.index"));
			sourceCluster.setType(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sourceCluster.type"));
			sourceCluster.setEndpoint(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sourceCluster.endpoint"));
			sourceCluster.setUsername(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sourceCluster.username"));
			sourceCluster.setVpcId(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sourceCluster.vpcId"));
			sourceCluster.setVpcInstanceId(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sourceCluster.vpcInstanceId"));
			sourceCluster.setVpcInstancePort(_ctx.integerValue("CreateDataTasksResponse.Result["+ i +"].sourceCluster.vpcInstancePort"));
			sourceCluster.setDataSourceType(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sourceCluster.dataSourceType"));
			resultItem.setSourceCluster(sourceCluster);

			SinkCluster sinkCluster = new SinkCluster();
			sinkCluster.setPassword(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sinkCluster.password"));
			sinkCluster.setIndex(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sinkCluster.index"));
			sinkCluster.setSettings(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sinkCluster.settings"));
			sinkCluster.setMapping(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sinkCluster.mapping"));
			sinkCluster.setType(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sinkCluster.type"));
			sinkCluster.setRouting(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sinkCluster.routing"));
			sinkCluster.setUsername(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sinkCluster.username"));
			sinkCluster.setVpcId(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sinkCluster.vpcId"));
			sinkCluster.setVpcInstancePort(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sinkCluster.vpcInstancePort"));
			sinkCluster.setVpcInstanceId(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sinkCluster.vpcInstanceId"));
			sinkCluster.setDataSourceType(_ctx.stringValue("CreateDataTasksResponse.Result["+ i +"].sinkCluster.dataSourceType"));
			resultItem.setSinkCluster(sinkCluster);

			result.add(resultItem);
		}
		createDataTasksResponse.setResult(result);
	 
	 	return createDataTasksResponse;
	}
}