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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.CreateParserDataSourceResponse;
import com.aliyuncs.iot.model.v20180120.CreateParserDataSourceResponse.DataSource;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateParserDataSourceResponseUnmarshaller {

	public static CreateParserDataSourceResponse unmarshall(CreateParserDataSourceResponse createParserDataSourceResponse, UnmarshallerContext _ctx) {
		
		createParserDataSourceResponse.setRequestId(_ctx.stringValue("CreateParserDataSourceResponse.RequestId"));
		createParserDataSourceResponse.setSuccess(_ctx.booleanValue("CreateParserDataSourceResponse.Success"));
		createParserDataSourceResponse.setCode(_ctx.stringValue("CreateParserDataSourceResponse.Code"));
		createParserDataSourceResponse.setErrorMessage(_ctx.stringValue("CreateParserDataSourceResponse.ErrorMessage"));

		DataSource dataSource = new DataSource();
		dataSource.setName(_ctx.stringValue("CreateParserDataSourceResponse.DataSource.Name"));
		dataSource.setDescription(_ctx.stringValue("CreateParserDataSourceResponse.DataSource.Description"));
		dataSource.setDataSourceId(_ctx.longValue("CreateParserDataSourceResponse.DataSource.DataSourceId"));
		dataSource.setUtcCreated(_ctx.stringValue("CreateParserDataSourceResponse.DataSource.UtcCreated"));
		createParserDataSourceResponse.setDataSource(dataSource);
	 
	 	return createParserDataSourceResponse;
	}
}