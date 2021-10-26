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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableColumnResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableColumnResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableColumnResponse.Data.ColumnListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaTableColumnResponseUnmarshaller {

	public static GetMetaTableColumnResponse unmarshall(GetMetaTableColumnResponse getMetaTableColumnResponse, UnmarshallerContext _ctx) {
		
		getMetaTableColumnResponse.setRequestId(_ctx.stringValue("GetMetaTableColumnResponse.RequestId"));
		getMetaTableColumnResponse.setHttpStatusCode(_ctx.integerValue("GetMetaTableColumnResponse.HttpStatusCode"));
		getMetaTableColumnResponse.setErrorMessage(_ctx.stringValue("GetMetaTableColumnResponse.ErrorMessage"));
		getMetaTableColumnResponse.setSuccess(_ctx.booleanValue("GetMetaTableColumnResponse.Success"));
		getMetaTableColumnResponse.setErrorCode(_ctx.stringValue("GetMetaTableColumnResponse.ErrorCode"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("GetMetaTableColumnResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("GetMetaTableColumnResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("GetMetaTableColumnResponse.Data.TotalCount"));

		List<ColumnListItem> columnList = new ArrayList<ColumnListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaTableColumnResponse.Data.ColumnList.Length"); i++) {
			ColumnListItem columnListItem = new ColumnListItem();
			columnListItem.setColumnGuid(_ctx.stringValue("GetMetaTableColumnResponse.Data.ColumnList["+ i +"].ColumnGuid"));
			columnListItem.setColumnName(_ctx.stringValue("GetMetaTableColumnResponse.Data.ColumnList["+ i +"].ColumnName"));
			columnListItem.setIsPartitionColumn(_ctx.booleanValue("GetMetaTableColumnResponse.Data.ColumnList["+ i +"].IsPartitionColumn"));
			columnListItem.setComment(_ctx.stringValue("GetMetaTableColumnResponse.Data.ColumnList["+ i +"].Comment"));
			columnListItem.setColumnType(_ctx.stringValue("GetMetaTableColumnResponse.Data.ColumnList["+ i +"].ColumnType"));
			columnListItem.setIsPrimaryKey(_ctx.booleanValue("GetMetaTableColumnResponse.Data.ColumnList["+ i +"].IsPrimaryKey"));
			columnListItem.setPosition(_ctx.integerValue("GetMetaTableColumnResponse.Data.ColumnList["+ i +"].Position"));
			columnListItem.setCaption(_ctx.stringValue("GetMetaTableColumnResponse.Data.ColumnList["+ i +"].Caption"));
			columnListItem.setIsForeignKey(_ctx.booleanValue("GetMetaTableColumnResponse.Data.ColumnList["+ i +"].IsForeignKey"));

			columnList.add(columnListItem);
		}
		data.setColumnList(columnList);
		getMetaTableColumnResponse.setData(data);
	 
	 	return getMetaTableColumnResponse;
	}
}