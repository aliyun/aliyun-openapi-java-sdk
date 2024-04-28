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

import com.aliyuncs.ddoscoo.model.v20200101.DescribeElasticQpsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeElasticQpsResponse.ElasticQpsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeElasticQpsResponseUnmarshaller {

	public static DescribeElasticQpsResponse unmarshall(DescribeElasticQpsResponse describeElasticQpsResponse, UnmarshallerContext _ctx) {
		
		describeElasticQpsResponse.setRequestId(_ctx.stringValue("DescribeElasticQpsResponse.RequestId"));

		List<ElasticQpsItem> elasticQps = new ArrayList<ElasticQpsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeElasticQpsResponse.ElasticQps.Length"); i++) {
			ElasticQpsItem elasticQpsItem = new ElasticQpsItem();
			elasticQpsItem.setMaxNormalQps(_ctx.longValue("DescribeElasticQpsResponse.ElasticQps["+ i +"].MaxNormalQps"));
			elasticQpsItem.setIndex(_ctx.longValue("DescribeElasticQpsResponse.ElasticQps["+ i +"].Index"));
			elasticQpsItem.setMaxQps(_ctx.longValue("DescribeElasticQpsResponse.ElasticQps["+ i +"].MaxQps"));
			elasticQpsItem.setPv(_ctx.longValue("DescribeElasticQpsResponse.ElasticQps["+ i +"].Pv"));
			elasticQpsItem.setUps(_ctx.longValue("DescribeElasticQpsResponse.ElasticQps["+ i +"].Ups"));
			elasticQpsItem.setStatus2(_ctx.longValue("DescribeElasticQpsResponse.ElasticQps["+ i +"].Status2"));
			elasticQpsItem.setStatus3(_ctx.longValue("DescribeElasticQpsResponse.ElasticQps["+ i +"].Status3"));
			elasticQpsItem.setStatus4(_ctx.longValue("DescribeElasticQpsResponse.ElasticQps["+ i +"].Status4"));
			elasticQpsItem.setStatus5(_ctx.longValue("DescribeElasticQpsResponse.ElasticQps["+ i +"].Status5"));

			elasticQps.add(elasticQpsItem);
		}
		describeElasticQpsResponse.setElasticQps(elasticQps);
	 
	 	return describeElasticQpsResponse;
	}
}