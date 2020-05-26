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

package com.aliyuncs.datav_outer.transform.v20190402;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datav_outer.model.v20190402.GetTemplateDataSourceResponse;
import com.aliyuncs.datav_outer.model.v20190402.GetTemplateDataSourceResponse.DataSourceItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateDataSourceResponseUnmarshaller {

	public static GetTemplateDataSourceResponse unmarshall(GetTemplateDataSourceResponse getTemplateDataSourceResponse, UnmarshallerContext _ctx) {
		
		getTemplateDataSourceResponse.setRequestId(_ctx.stringValue("GetTemplateDataSourceResponse.RequestId"));

		List<DataSourceItem> dataSource = new ArrayList<DataSourceItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateDataSourceResponse.DataSource.Length"); i++) {
			DataSourceItem dataSourceItem = new DataSourceItem();
			dataSourceItem.setName(_ctx.stringValue("GetTemplateDataSourceResponse.DataSource["+ i +"].Name"));
			dataSourceItem.setType(_ctx.stringValue("GetTemplateDataSourceResponse.DataSource["+ i +"].Type"));
			dataSourceItem.setConfig(_ctx.stringValue("GetTemplateDataSourceResponse.DataSource["+ i +"].Config"));

			dataSource.add(dataSourceItem);
		}
		getTemplateDataSourceResponse.setDataSource(dataSource);
	 
	 	return getTemplateDataSourceResponse;
	}
}