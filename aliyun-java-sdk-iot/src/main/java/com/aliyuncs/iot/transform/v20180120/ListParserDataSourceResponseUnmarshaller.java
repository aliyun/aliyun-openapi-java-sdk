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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.ListParserDataSourceResponse;
import com.aliyuncs.iot.model.v20180120.ListParserDataSourceResponse.DataSource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListParserDataSourceResponseUnmarshaller {

	public static ListParserDataSourceResponse unmarshall(ListParserDataSourceResponse listParserDataSourceResponse, UnmarshallerContext _ctx) {
		
		listParserDataSourceResponse.setRequestId(_ctx.stringValue("ListParserDataSourceResponse.RequestId"));
		listParserDataSourceResponse.setSuccess(_ctx.booleanValue("ListParserDataSourceResponse.Success"));
		listParserDataSourceResponse.setCode(_ctx.stringValue("ListParserDataSourceResponse.Code"));
		listParserDataSourceResponse.setErrorMessage(_ctx.stringValue("ListParserDataSourceResponse.ErrorMessage"));
		listParserDataSourceResponse.setPage(_ctx.integerValue("ListParserDataSourceResponse.Page"));
		listParserDataSourceResponse.setPageSize(_ctx.integerValue("ListParserDataSourceResponse.PageSize"));
		listParserDataSourceResponse.setTotal(_ctx.integerValue("ListParserDataSourceResponse.Total"));

		List<DataSource> data = new ArrayList<DataSource>();
		for (int i = 0; i < _ctx.lengthValue("ListParserDataSourceResponse.Data.Length"); i++) {
			DataSource dataSource = new DataSource();
			dataSource.setName(_ctx.stringValue("ListParserDataSourceResponse.Data["+ i +"].Name"));
			dataSource.setDescription(_ctx.stringValue("ListParserDataSourceResponse.Data["+ i +"].Description"));
			dataSource.setDataSourceId(_ctx.longValue("ListParserDataSourceResponse.Data["+ i +"].DataSourceId"));
			dataSource.setUtcCreated(_ctx.stringValue("ListParserDataSourceResponse.Data["+ i +"].UtcCreated"));

			data.add(dataSource);
		}
		listParserDataSourceResponse.setData(data);
	 
	 	return listParserDataSourceResponse;
	}
}