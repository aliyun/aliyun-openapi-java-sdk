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
		listHiveColumnLineagesResponse.setErrorCode(_ctx.stringValue("ListHiveColumnLineagesResponse.ErrorCode"));
		listHiveColumnLineagesResponse.setErrorMessage(_ctx.stringValue("ListHiveColumnLineagesResponse.ErrorMessage"));

		Data data = new Data();
		data.setUpstreamNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.UpstreamNumber"));
		data.setDownstreamNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.DownstreamNumber"));

		List<ColumnLineage> upstreamLineages = new ArrayList<ColumnLineage>();
		for (int i = 0; i < _ctx.lengthValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages.Length"); i++) {
			ColumnLineage columnLineage = new ColumnLineage();
			columnLineage.setModifiedTime(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].ModifiedTime"));
			columnLineage.setDirectDownColumnNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].DirectDownColumnNumber"));
			columnLineage.setDatabaseName(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].DatabaseName"));
			columnLineage.setClusterId(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].ClusterId"));
			columnLineage.setSource(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].Source"));
			columnLineage.setTableName(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].TableName"));
			columnLineage.setDirectDownTableNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].DirectDownTableNumber"));
			columnLineage.setDirectUpperTableNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].DirectUpperTableNumber"));
			columnLineage.setCreateTime(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].CreateTime"));
			columnLineage.setDirectUpperColumnNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].DirectUpperColumnNumber"));
			columnLineage.setColumnName(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.UpstreamLineages["+ i +"].ColumnName"));

			upstreamLineages.add(columnLineage);
		}
		data.setUpstreamLineages(upstreamLineages);

		List<ColumnLineage> downstreamLineages = new ArrayList<ColumnLineage>();
		for (int i = 0; i < _ctx.lengthValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages.Length"); i++) {
			ColumnLineage columnLineage_ = new ColumnLineage();
			columnLineage_.setModifiedTime(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].ModifiedTime"));
			columnLineage_.setDirectDownColumnNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].DirectDownColumnNumber"));
			columnLineage_.setDatabaseName(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].DatabaseName"));
			columnLineage_.setClusterId(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].ClusterId"));
			columnLineage_.setSource(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].Source"));
			columnLineage_.setTableName(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].TableName"));
			columnLineage_.setDirectDownTableNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].DirectDownTableNumber"));
			columnLineage_.setDirectUpperTableNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].DirectUpperTableNumber"));
			columnLineage_.setCreateTime(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].CreateTime"));
			columnLineage_.setDirectUpperColumnNumber(_ctx.integerValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].DirectUpperColumnNumber"));
			columnLineage_.setColumnName(_ctx.stringValue("ListHiveColumnLineagesResponse.Data.DownstreamLineages["+ i +"].ColumnName"));

			downstreamLineages.add(columnLineage_);
		}
		data.setDownstreamLineages(downstreamLineages);
		listHiveColumnLineagesResponse.setData(data);
	 
	 	return listHiveColumnLineagesResponse;
	}
}