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

import com.aliyuncs.iot.model.v20180120.GetParserDataSourceResponse;
import com.aliyuncs.iot.model.v20180120.GetParserDataSourceResponse.DataSource;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetParserDataSourceResponseUnmarshaller {

	public static GetParserDataSourceResponse unmarshall(GetParserDataSourceResponse getParserDataSourceResponse, UnmarshallerContext _ctx) {
		
		getParserDataSourceResponse.setRequestId(_ctx.stringValue("GetParserDataSourceResponse.RequestId"));
		getParserDataSourceResponse.setSuccess(_ctx.booleanValue("GetParserDataSourceResponse.Success"));
		getParserDataSourceResponse.setCode(_ctx.stringValue("GetParserDataSourceResponse.Code"));
		getParserDataSourceResponse.setErrorMessage(_ctx.stringValue("GetParserDataSourceResponse.ErrorMessage"));

		DataSource dataSource = new DataSource();
		dataSource.setName(_ctx.stringValue("GetParserDataSourceResponse.DataSource.Name"));
		dataSource.setDescription(_ctx.stringValue("GetParserDataSourceResponse.DataSource.Description"));
		dataSource.setDataSourceId(_ctx.longValue("GetParserDataSourceResponse.DataSource.DataSourceId"));
		dataSource.setUtcCreated(_ctx.stringValue("GetParserDataSourceResponse.DataSource.UtcCreated"));
		dataSource.setCreateUserId(_ctx.longValue("GetParserDataSourceResponse.DataSource.CreateUserId"));
		getParserDataSourceResponse.setDataSource(dataSource);
	 
	 	return getParserDataSourceResponse;
	}
}