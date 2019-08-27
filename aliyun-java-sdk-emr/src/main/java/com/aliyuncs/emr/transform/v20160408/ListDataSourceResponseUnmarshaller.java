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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListDataSourceResponse;
import com.aliyuncs.emr.model.v20160408.ListDataSourceResponse.DataSource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSourceResponseUnmarshaller {

	public static ListDataSourceResponse unmarshall(ListDataSourceResponse listDataSourceResponse, UnmarshallerContext _ctx) {
		
		listDataSourceResponse.setRequestId(_ctx.stringValue("ListDataSourceResponse.RequestId"));
		listDataSourceResponse.setTotal(_ctx.integerValue("ListDataSourceResponse.Total"));
		listDataSourceResponse.setPageSize(_ctx.integerValue("ListDataSourceResponse.PageSize"));
		listDataSourceResponse.setPageNumber(_ctx.integerValue("ListDataSourceResponse.PageNumber"));

		List<DataSource> dataSourceList = new ArrayList<DataSource>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSourceResponse.DataSourceList.Length"); i++) {
			DataSource dataSource = new DataSource();
			dataSource.setId(_ctx.stringValue("ListDataSourceResponse.DataSourceList["+ i +"].Id"));
			dataSource.setName(_ctx.stringValue("ListDataSourceResponse.DataSourceList["+ i +"].Name"));
			dataSource.setDescription(_ctx.stringValue("ListDataSourceResponse.DataSourceList["+ i +"].Description"));
			dataSource.setStatus(_ctx.stringValue("ListDataSourceResponse.DataSourceList["+ i +"].Status"));
			dataSource.setSourceType(_ctx.stringValue("ListDataSourceResponse.DataSourceList["+ i +"].SourceType"));
			dataSource.setCreateFrom(_ctx.stringValue("ListDataSourceResponse.DataSourceList["+ i +"].CreateFrom"));
			dataSource.setConf(_ctx.stringValue("ListDataSourceResponse.DataSourceList["+ i +"].Conf"));
			dataSource.setClusterId(_ctx.stringValue("ListDataSourceResponse.DataSourceList["+ i +"].ClusterId"));
			dataSource.setCreator(_ctx.stringValue("ListDataSourceResponse.DataSourceList["+ i +"].Creator"));
			dataSource.setModifier(_ctx.stringValue("ListDataSourceResponse.DataSourceList["+ i +"].Modifier"));
			dataSource.setGmtCreate(_ctx.longValue("ListDataSourceResponse.DataSourceList["+ i +"].GmtCreate"));
			dataSource.setGmtModified(_ctx.longValue("ListDataSourceResponse.DataSourceList["+ i +"].GmtModified"));

			dataSourceList.add(dataSource);
		}
		listDataSourceResponse.setDataSourceList(dataSourceList);
	 
	 	return listDataSourceResponse;
	}
}