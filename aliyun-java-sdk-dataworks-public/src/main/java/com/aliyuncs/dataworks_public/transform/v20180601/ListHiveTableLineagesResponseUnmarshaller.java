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

import com.aliyuncs.dataworks_public.model.v20180601.ListHiveTableLineagesResponse;
import com.aliyuncs.dataworks_public.model.v20180601.ListHiveTableLineagesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20180601.ListHiveTableLineagesResponse.Data.TableLineage;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHiveTableLineagesResponseUnmarshaller {

	public static ListHiveTableLineagesResponse unmarshall(ListHiveTableLineagesResponse listHiveTableLineagesResponse, UnmarshallerContext _ctx) {
		
		listHiveTableLineagesResponse.setRequestId(_ctx.stringValue("ListHiveTableLineagesResponse.RequestId"));
		listHiveTableLineagesResponse.setErrorCode(_ctx.stringValue("ListHiveTableLineagesResponse.ErrorCode"));
		listHiveTableLineagesResponse.setErrorMessage(_ctx.stringValue("ListHiveTableLineagesResponse.ErrorMessage"));

		Data data = new Data();
		data.setUpstreamNumber(_ctx.integerValue("ListHiveTableLineagesResponse.Data.UpstreamNumber"));
		data.setDownstreamNumber(_ctx.integerValue("ListHiveTableLineagesResponse.Data.DownstreamNumber"));

		List<TableLineage> upstreamLineages = new ArrayList<TableLineage>();
		for (int i = 0; i < _ctx.lengthValue("ListHiveTableLineagesResponse.Data.UpstreamLineages.Length"); i++) {
			TableLineage tableLineage = new TableLineage();
			tableLineage.setModifiedTime(_ctx.stringValue("ListHiveTableLineagesResponse.Data.UpstreamLineages["+ i +"].ModifiedTime"));
			tableLineage.setDatabaseName(_ctx.stringValue("ListHiveTableLineagesResponse.Data.UpstreamLineages["+ i +"].DatabaseName"));
			tableLineage.setEngine(_ctx.stringValue("ListHiveTableLineagesResponse.Data.UpstreamLineages["+ i +"].Engine"));
			tableLineage.setCreateTime(_ctx.stringValue("ListHiveTableLineagesResponse.Data.UpstreamLineages["+ i +"].CreateTime"));
			tableLineage.setClusterId(_ctx.stringValue("ListHiveTableLineagesResponse.Data.UpstreamLineages["+ i +"].ClusterId"));
			tableLineage.setSource(_ctx.stringValue("ListHiveTableLineagesResponse.Data.UpstreamLineages["+ i +"].Source"));
			tableLineage.setTableName(_ctx.stringValue("ListHiveTableLineagesResponse.Data.UpstreamLineages["+ i +"].TableName"));
			tableLineage.setJobId(_ctx.stringValue("ListHiveTableLineagesResponse.Data.UpstreamLineages["+ i +"].JobId"));
			tableLineage.setQueryText(_ctx.stringValue("ListHiveTableLineagesResponse.Data.UpstreamLineages["+ i +"].QueryText"));

			upstreamLineages.add(tableLineage);
		}
		data.setUpstreamLineages(upstreamLineages);

		List<TableLineage> downstreamLineages = new ArrayList<TableLineage>();
		for (int i = 0; i < _ctx.lengthValue("ListHiveTableLineagesResponse.Data.DownstreamLineages.Length"); i++) {
			TableLineage tableLineage_ = new TableLineage();
			tableLineage_.setModifiedTime(_ctx.stringValue("ListHiveTableLineagesResponse.Data.DownstreamLineages["+ i +"].ModifiedTime"));
			tableLineage_.setDatabaseName(_ctx.stringValue("ListHiveTableLineagesResponse.Data.DownstreamLineages["+ i +"].DatabaseName"));
			tableLineage_.setEngine(_ctx.stringValue("ListHiveTableLineagesResponse.Data.DownstreamLineages["+ i +"].Engine"));
			tableLineage_.setCreateTime(_ctx.stringValue("ListHiveTableLineagesResponse.Data.DownstreamLineages["+ i +"].CreateTime"));
			tableLineage_.setClusterId(_ctx.stringValue("ListHiveTableLineagesResponse.Data.DownstreamLineages["+ i +"].ClusterId"));
			tableLineage_.setSource(_ctx.stringValue("ListHiveTableLineagesResponse.Data.DownstreamLineages["+ i +"].Source"));
			tableLineage_.setTableName(_ctx.stringValue("ListHiveTableLineagesResponse.Data.DownstreamLineages["+ i +"].TableName"));
			tableLineage_.setJobId(_ctx.stringValue("ListHiveTableLineagesResponse.Data.DownstreamLineages["+ i +"].JobId"));
			tableLineage_.setQueryText(_ctx.stringValue("ListHiveTableLineagesResponse.Data.DownstreamLineages["+ i +"].QueryText"));

			downstreamLineages.add(tableLineage_);
		}
		data.setDownstreamLineages(downstreamLineages);
		listHiveTableLineagesResponse.setData(data);
	 
	 	return listHiveTableLineagesResponse;
	}
}