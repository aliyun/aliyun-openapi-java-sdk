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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeElasticQpsRecordResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeElasticQpsRecordResponse.ElasticQpsListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeElasticQpsRecordResponseUnmarshaller {

	public static DescribeElasticQpsRecordResponse unmarshall(DescribeElasticQpsRecordResponse describeElasticQpsRecordResponse, UnmarshallerContext _ctx) {
		
		describeElasticQpsRecordResponse.setRequestId(_ctx.stringValue("DescribeElasticQpsRecordResponse.RequestId"));

		List<ElasticQpsListItem> elasticQpsList = new ArrayList<ElasticQpsListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeElasticQpsRecordResponse.ElasticQpsList.Length"); i++) {
			ElasticQpsListItem elasticQpsListItem = new ElasticQpsListItem();
			elasticQpsListItem.setOpsElasticQps(_ctx.longValue("DescribeElasticQpsRecordResponse.ElasticQpsList["+ i +"].OpsElasticQps"));
			elasticQpsListItem.setIp(_ctx.stringValue("DescribeElasticQpsRecordResponse.ElasticQpsList["+ i +"].Ip"));
			elasticQpsListItem.setOriginQps(_ctx.longValue("DescribeElasticQpsRecordResponse.ElasticQpsList["+ i +"].OriginQps"));
			elasticQpsListItem.setDate(_ctx.longValue("DescribeElasticQpsRecordResponse.ElasticQpsList["+ i +"].Date"));
			elasticQpsListItem.setInstanceId(_ctx.stringValue("DescribeElasticQpsRecordResponse.ElasticQpsList["+ i +"].InstanceId"));
			elasticQpsListItem.setQps(_ctx.longValue("DescribeElasticQpsRecordResponse.ElasticQpsList["+ i +"].Qps"));
			elasticQpsListItem.setQpsPeak(_ctx.longValue("DescribeElasticQpsRecordResponse.ElasticQpsList["+ i +"].QpsPeak"));
			elasticQpsListItem.setStatus(_ctx.longValue("DescribeElasticQpsRecordResponse.ElasticQpsList["+ i +"].Status"));
			elasticQpsListItem.setOpsQps(_ctx.longValue("DescribeElasticQpsRecordResponse.ElasticQpsList["+ i +"].OpsQps"));

			elasticQpsList.add(elasticQpsListItem);
		}
		describeElasticQpsRecordResponse.setElasticQpsList(elasticQpsList);
	 
	 	return describeElasticQpsRecordResponse;
	}
}