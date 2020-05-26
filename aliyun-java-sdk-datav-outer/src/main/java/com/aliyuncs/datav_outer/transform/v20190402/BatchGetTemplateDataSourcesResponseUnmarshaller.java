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

import com.aliyuncs.datav_outer.model.v20190402.BatchGetTemplateDataSourcesResponse;
import com.aliyuncs.datav_outer.model.v20190402.BatchGetTemplateDataSourcesResponse.TemplateInstance;
import com.aliyuncs.datav_outer.model.v20190402.BatchGetTemplateDataSourcesResponse.TemplateInstance.DataSourceItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetTemplateDataSourcesResponseUnmarshaller {

	public static BatchGetTemplateDataSourcesResponse unmarshall(BatchGetTemplateDataSourcesResponse batchGetTemplateDataSourcesResponse, UnmarshallerContext _ctx) {
		
		batchGetTemplateDataSourcesResponse.setRequestId(_ctx.stringValue("BatchGetTemplateDataSourcesResponse.RequestId"));

		List<TemplateInstance> templates = new ArrayList<TemplateInstance>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetTemplateDataSourcesResponse.Templates.Length"); i++) {
			TemplateInstance templateInstance = new TemplateInstance();
			templateInstance.setID(_ctx.stringValue("BatchGetTemplateDataSourcesResponse.Templates["+ i +"].ID"));

			List<DataSourceItem> dataSource = new ArrayList<DataSourceItem>();
			for (int j = 0; j < _ctx.lengthValue("BatchGetTemplateDataSourcesResponse.Templates["+ i +"].DataSource.Length"); j++) {
				DataSourceItem dataSourceItem = new DataSourceItem();
				dataSourceItem.setName(_ctx.stringValue("BatchGetTemplateDataSourcesResponse.Templates["+ i +"].DataSource["+ j +"].Name"));
				dataSourceItem.setType(_ctx.stringValue("BatchGetTemplateDataSourcesResponse.Templates["+ i +"].DataSource["+ j +"].Type"));
				dataSourceItem.setConfig(_ctx.stringValue("BatchGetTemplateDataSourcesResponse.Templates["+ i +"].DataSource["+ j +"].Config"));

				dataSource.add(dataSourceItem);
			}
			templateInstance.setDataSource(dataSource);

			templates.add(templateInstance);
		}
		batchGetTemplateDataSourcesResponse.setTemplates(templates);
	 
	 	return batchGetTemplateDataSourcesResponse;
	}
}