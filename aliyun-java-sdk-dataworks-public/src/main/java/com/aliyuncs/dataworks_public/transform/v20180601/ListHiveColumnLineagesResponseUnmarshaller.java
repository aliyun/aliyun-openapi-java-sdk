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

package com.aliyuncs.dataworks_public.transform.v20180601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20180601.ListHiveColumnLineagesResponse;
import com.aliyuncs.dataworks_public.model.v20180601.ListHiveColumnLineagesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20180601.ListHiveColumnLineagesResponse.Data.ColumnLineage;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHiveColumnLineagesResponseUnmarshaller {

	public static ListHiveColumnLineagesResponse unmarshall(ListHiveColumnLineagesResponse listHiveColumnLineagesResponse, UnmarshallerContext _ctx) {
		
		listHiveColumnLineagesResponse.setRequestId(_ctx.stringValue("ListHiveColumnLineagesResponse.RequestId"));
		listHiveColumnLineagesResponse.setErrorMessage(_ctx.stringValue("ListHiveColumnLineagesResponse.ErrorMessage"));
		listHiveColumnLineagesResponse.setErrorCode(_ctx.stringValue("ListHiveColumnLineagesResponse.ErrorCode"));

		Data data = new Data();
		data.setUpstreamNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.UpstreamNumber"));
		data.setDownstreamNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.DownstreamNumber"));

		List<ColumnLineage> upstreamLineages = new ArrayList<ColumnLineage>();
		for (int i = 0; i < _ctx.lengthValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages.Length"); i++) {
			ColumnLineage columnLineage = new ColumnLineage();
			columnLineage.setColumnName(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].ColumnName"));
			columnLineage.setDirectUpperTableNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].DirectUpperTableNumber"));
			columnLineage.setTableName(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].TableName"));
			columnLineage.setModifiedTime(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].ModifiedTime"));
			columnLineage.setCreateTime(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].CreateTime"));
			columnLineage.setDirectDownTableNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].DirectDownTableNumber"));
			columnLineage.setDatabaseName(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].DatabaseName"));
			columnLineage.setDirectDownColumnNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].DirectDownColumnNumber"));
			columnLineage.setDirectUpperColumnNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].DirectUpperColumnNumber"));
			columnLineage.setSource(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].Source"));
			columnLineage.setClusterId(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].ClusterId"));

			upstreamLineages.add(columnLineage);
		}
		data.setUpstreamLineages(upstreamLineages);

		List<ColumnLineage> downstreamLineages = new ArrayList<ColumnLineage>();
		for (int i = 0; i < _ctx.lengthValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages.Length"); i++) {
			ColumnLineage columnLineage1 = new ColumnLineage();
			columnLineage1.setColumnName(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].ColumnName"));
			columnLineage1.setDirectUpperTableNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].DirectUpperTableNumber"));
			columnLineage1.setTableName(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].TableName"));
			columnLineage1.setModifiedTime(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].ModifiedTime"));
			columnLineage1.setCreateTime(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].CreateTime"));
			columnLineage1.setDirectDownTableNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].DirectDownTableNumber"));
			columnLineage1.setDatabaseName(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].DatabaseName"));
			columnLineage1.setDirectDownColumnNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].DirectDownColumnNumber"));
			columnLineage1.setDirectUpperColumnNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].DirectUpperColumnNumber"));
			columnLineage1.setSource(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].Source"));
			columnLineage1.setClusterId(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].ClusterId"));

			downstreamLineages.add(columnLineage1);
		}
		data.setDownstreamLineages(downstreamLineages);
		listHiveColumnLineagesResponse.setData(data);
	 
	 	return listHiveColumnLineagesResponse;
	}
}