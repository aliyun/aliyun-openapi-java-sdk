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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeRDSschemasResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRDSschemasResponseUnmarshaller {

	public static DescribeRDSschemasResponse unmarshall(DescribeRDSschemasResponse describeRDSschemasResponse, UnmarshallerContext _ctx) {
		
		describeRDSschemasResponse.setRequestId(_ctx.stringValue("DescribeRDSschemasResponse.RequestId"));

		List<String> schemas = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRDSschemasResponse.Schemas.Length"); i++) {
			schemas.add(_ctx.stringValue("DescribeRDSschemasResponse.Schemas["+ i +"]"));
		}
		describeRDSschemasResponse.setSchemas(schemas);
	 
	 	return describeRDSschemasResponse;
	}
}