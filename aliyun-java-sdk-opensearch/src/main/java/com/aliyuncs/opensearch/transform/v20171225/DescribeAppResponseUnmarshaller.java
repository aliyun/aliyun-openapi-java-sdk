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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result.Domain;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result.Domain.Functions;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result.Quota;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppResponseUnmarshaller {

	public static DescribeAppResponse unmarshall(DescribeAppResponse describeAppResponse, UnmarshallerContext _ctx) {
		
		describeAppResponse.setRequestId(_ctx.stringValue("DescribeAppResponse.requestId"));

		Result result = new Result();
		result.setId(_ctx.stringValue("DescribeAppResponse.result.id"));
		result.setDescription(_ctx.stringValue("DescribeAppResponse.result.description"));
		result.setStatus(_ctx.stringValue("DescribeAppResponse.result.status"));
		result.setType(_ctx.stringValue("DescribeAppResponse.result.type"));
		result.setClusterName(_ctx.stringValue("DescribeAppResponse.result.clusterName"));
		result.setAlgoDeploymentId(_ctx.integerValue("DescribeAppResponse.result.algoDeploymentId"));
		result.setCreated(_ctx.integerValue("DescribeAppResponse.result.created"));
		result.setAutoSwitch(_ctx.booleanValue("DescribeAppResponse.result.autoSwitch"));
		result.setProgressPercent(_ctx.integerValue("DescribeAppResponse.result.progressPercent"));
		result.setSchema(_ctx.mapValue("DescribeAppResponse.result.schema"));

		List<String> fetchFields = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppResponse.result.fetchFields.Length"); i++) {
			fetchFields.add(_ctx.stringValue("DescribeAppResponse.result.fetchFields["+ i +"]"));
		}
		result.setFetchFields(fetchFields);

		Quota quota = new Quota();
		quota.setDocSize(_ctx.integerValue("DescribeAppResponse.result.quota.docSize"));
		quota.setComputeResource(_ctx.integerValue("DescribeAppResponse.result.quota.computeResource"));
		quota.setQps(_ctx.integerValue("DescribeAppResponse.result.quota.qps"));
		quota.setSpec(_ctx.stringValue("DescribeAppResponse.result.quota.spec"));
		result.setQuota(quota);

		Domain domain = new Domain();
		domain.setName(_ctx.stringValue("DescribeAppResponse.result.domain.name"));
		domain.setCategory(_ctx.stringValue("DescribeAppResponse.result.domain.category"));

		Functions functions = new Functions();

		List<String> qp = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppResponse.result.domain.functions.qp.Length"); i++) {
			qp.add(_ctx.stringValue("DescribeAppResponse.result.domain.functions.qp["+ i +"]"));
		}
		functions.setQp(qp);

		List<String> algo = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppResponse.result.domain.functions.algo.Length"); i++) {
			algo.add(_ctx.stringValue("DescribeAppResponse.result.domain.functions.algo["+ i +"]"));
		}
		functions.setAlgo(algo);

		List<String> service = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppResponse.result.domain.functions.service.Length"); i++) {
			service.add(_ctx.stringValue("DescribeAppResponse.result.domain.functions.service["+ i +"]"));
		}
		functions.setService(service);
		domain.setFunctions(functions);
		result.setDomain(domain);
		describeAppResponse.setResult(result);
	 
	 	return describeAppResponse;
	}
}