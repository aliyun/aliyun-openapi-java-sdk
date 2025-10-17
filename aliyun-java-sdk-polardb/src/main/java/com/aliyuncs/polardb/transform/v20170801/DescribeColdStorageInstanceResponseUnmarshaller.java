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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeColdStorageInstanceResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeColdStorageInstanceResponse.OssClusterInfoListItem;
import com.aliyuncs.polardb.model.v20170801.DescribeColdStorageInstanceResponse.TablesItem;
import com.aliyuncs.polardb.model.v20170801.DescribeColdStorageInstanceResponse.TablesItem.ChildObjectsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeColdStorageInstanceResponseUnmarshaller {

	public static DescribeColdStorageInstanceResponse unmarshall(DescribeColdStorageInstanceResponse describeColdStorageInstanceResponse, UnmarshallerContext _ctx) {
		
		describeColdStorageInstanceResponse.setRequestId(_ctx.stringValue("DescribeColdStorageInstanceResponse.RequestId"));
		describeColdStorageInstanceResponse.setPageRecordCount(_ctx.integerValue("DescribeColdStorageInstanceResponse.PageRecordCount"));
		describeColdStorageInstanceResponse.setNextToken(_ctx.stringValue("DescribeColdStorageInstanceResponse.NextToken"));
		describeColdStorageInstanceResponse.setDownLoadUrl(_ctx.stringValue("DescribeColdStorageInstanceResponse.DownLoadUrl"));
		describeColdStorageInstanceResponse.setOssClusterEnabled(_ctx.stringValue("DescribeColdStorageInstanceResponse.OssClusterEnabled"));
		describeColdStorageInstanceResponse.setSupportOssCluster(_ctx.stringValue("DescribeColdStorageInstanceResponse.SupportOssCluster"));
		describeColdStorageInstanceResponse.setObjectType(_ctx.stringValue("DescribeColdStorageInstanceResponse.ObjectType"));
		describeColdStorageInstanceResponse.setMaxResults(_ctx.integerValue("DescribeColdStorageInstanceResponse.MaxResults"));
		describeColdStorageInstanceResponse.setPageSize(_ctx.integerValue("DescribeColdStorageInstanceResponse.PageSize"));
		describeColdStorageInstanceResponse.setPageNumber(_ctx.integerValue("DescribeColdStorageInstanceResponse.PageNumber"));
		describeColdStorageInstanceResponse.setTotalRecord(_ctx.integerValue("DescribeColdStorageInstanceResponse.TotalRecord"));

		List<TablesItem> tables = new ArrayList<TablesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeColdStorageInstanceResponse.Tables.Length"); i++) {
			TablesItem tablesItem = new TablesItem();
			tablesItem.setOssClusterId(_ctx.stringValue("DescribeColdStorageInstanceResponse.Tables["+ i +"].OssClusterId"));
			tablesItem.setPartion(_ctx.stringValue("DescribeColdStorageInstanceResponse.Tables["+ i +"].Partion"));
			tablesItem.setSize(_ctx.stringValue("DescribeColdStorageInstanceResponse.Tables["+ i +"].Size"));
			tablesItem.setDB(_ctx.stringValue("DescribeColdStorageInstanceResponse.Tables["+ i +"].DB"));
			tablesItem.setTable(_ctx.stringValue("DescribeColdStorageInstanceResponse.Tables["+ i +"].Table"));
			tablesItem.setTableName(_ctx.stringValue("DescribeColdStorageInstanceResponse.Tables["+ i +"].TableName"));
			tablesItem.setDBName(_ctx.stringValue("DescribeColdStorageInstanceResponse.Tables["+ i +"].DBName"));
			tablesItem.setStatus(_ctx.stringValue("DescribeColdStorageInstanceResponse.Tables["+ i +"].Status"));
			tablesItem.setFieldName(_ctx.stringValue("DescribeColdStorageInstanceResponse.Tables["+ i +"].FieldName"));

			List<ChildObjectsItem> childObjects = new ArrayList<ChildObjectsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeColdStorageInstanceResponse.Tables["+ i +"].ChildObjects.Length"); j++) {
				ChildObjectsItem childObjectsItem = new ChildObjectsItem();
				childObjectsItem.setObjectName(_ctx.stringValue("DescribeColdStorageInstanceResponse.Tables["+ i +"].ChildObjects["+ j +"].ObjectName"));
				childObjectsItem.setObjectType(_ctx.stringValue("DescribeColdStorageInstanceResponse.Tables["+ i +"].ChildObjects["+ j +"].ObjectType"));
				childObjectsItem.setSize(_ctx.stringValue("DescribeColdStorageInstanceResponse.Tables["+ i +"].ChildObjects["+ j +"].Size"));
				childObjectsItem.setStatus(_ctx.stringValue("DescribeColdStorageInstanceResponse.Tables["+ i +"].ChildObjects["+ j +"].Status"));

				childObjects.add(childObjectsItem);
			}
			tablesItem.setChildObjects(childObjects);

			tables.add(tablesItem);
		}
		describeColdStorageInstanceResponse.setTables(tables);

		List<OssClusterInfoListItem> ossClusterInfoList = new ArrayList<OssClusterInfoListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeColdStorageInstanceResponse.OssClusterInfoList.Length"); i++) {
			OssClusterInfoListItem ossClusterInfoListItem = new OssClusterInfoListItem();
			ossClusterInfoListItem.setOssClusterId(_ctx.stringValue("DescribeColdStorageInstanceResponse.OssClusterInfoList["+ i +"].OssClusterId"));
			ossClusterInfoListItem.setRegion(_ctx.stringValue("DescribeColdStorageInstanceResponse.OssClusterInfoList["+ i +"].Region"));
			ossClusterInfoListItem.setSize(_ctx.stringValue("DescribeColdStorageInstanceResponse.OssClusterInfoList["+ i +"].Size"));
			ossClusterInfoListItem.setCreatedTime(_ctx.stringValue("DescribeColdStorageInstanceResponse.OssClusterInfoList["+ i +"].CreatedTime"));

			ossClusterInfoList.add(ossClusterInfoListItem);
		}
		describeColdStorageInstanceResponse.setOssClusterInfoList(ossClusterInfoList);
	 
	 	return describeColdStorageInstanceResponse;
	}
}