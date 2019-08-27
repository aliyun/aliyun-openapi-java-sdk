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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.DescribeDataSourceSchemaDatabaseResponse;
import com.aliyuncs.emr.model.v20160408.DescribeDataSourceSchemaDatabaseResponse.Schema;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataSourceSchemaDatabaseResponseUnmarshaller {

	public static DescribeDataSourceSchemaDatabaseResponse unmarshall(DescribeDataSourceSchemaDatabaseResponse describeDataSourceSchemaDatabaseResponse, UnmarshallerContext _ctx) {
		
		describeDataSourceSchemaDatabaseResponse.setRequestId(_ctx.stringValue("DescribeDataSourceSchemaDatabaseResponse.RequestId"));
		describeDataSourceSchemaDatabaseResponse.setDataSourceId(_ctx.stringValue("DescribeDataSourceSchemaDatabaseResponse.DataSourceId"));

		Schema schema = new Schema();
		schema.setDbName(_ctx.stringValue("DescribeDataSourceSchemaDatabaseResponse.Schema.DbName"));
		schema.setDbVersion(_ctx.stringValue("DescribeDataSourceSchemaDatabaseResponse.Schema.DbVersion"));
		schema.setDbType(_ctx.stringValue("DescribeDataSourceSchemaDatabaseResponse.Schema.DbType"));
		describeDataSourceSchemaDatabaseResponse.setSchema(schema);
	 
	 	return describeDataSourceSchemaDatabaseResponse;
	}
}