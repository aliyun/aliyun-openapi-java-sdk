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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListDataLakeTablebaseInfoResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDataLakeTablebaseInfoResponse.TablebaseInfo;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDataLakeTablebaseInfoResponse.TablebaseInfo.Column;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataLakeTablebaseInfoResponseUnmarshaller {

	public static ListDataLakeTablebaseInfoResponse unmarshall(ListDataLakeTablebaseInfoResponse listDataLakeTablebaseInfoResponse, UnmarshallerContext _ctx) {
		
		listDataLakeTablebaseInfoResponse.setRequestId(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.RequestId"));
		listDataLakeTablebaseInfoResponse.setSuccess(_ctx.booleanValue("ListDataLakeTablebaseInfoResponse.Success"));
		listDataLakeTablebaseInfoResponse.setErrorCode(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.ErrorCode"));
		listDataLakeTablebaseInfoResponse.setErrorMessage(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.ErrorMessage"));
		listDataLakeTablebaseInfoResponse.setTotalCount(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.TotalCount"));

		List<TablebaseInfo> tablebaseInfoList = new ArrayList<TablebaseInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList.Length"); i++) {
			TablebaseInfo tablebaseInfo = new TablebaseInfo();
			tablebaseInfo.setOwner(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].Owner"));
			tablebaseInfo.setViewOriginalText(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].ViewOriginalText"));
			tablebaseInfo.setTableType(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].TableType"));
			tablebaseInfo.setParameters(_ctx.mapValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].Parameters"));
			tablebaseInfo.setDescription(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].Description"));
			tablebaseInfo.setCreatorId(_ctx.longValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].CreatorId"));
			tablebaseInfo.setCreateTime(_ctx.integerValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].CreateTime"));
			tablebaseInfo.setLastAccessTime(_ctx.integerValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].LastAccessTime"));
			tablebaseInfo.setRetention(_ctx.integerValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].Retention"));
			tablebaseInfo.setName(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].Name"));
			tablebaseInfo.setOwnerType(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].OwnerType"));
			tablebaseInfo.setViewExpandedText(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].ViewExpandedText"));
			tablebaseInfo.setDbId(_ctx.longValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].DbId"));
			tablebaseInfo.setDbName(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].DbName"));
			tablebaseInfo.setCatalogName(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].CatalogName"));
			tablebaseInfo.setModifierId(_ctx.longValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].ModifierId"));
			tablebaseInfo.setLocation(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].Location"));

			List<Column> partitionKeys = new ArrayList<Column>();
			for (int j = 0; j < _ctx.lengthValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].PartitionKeys.Length"); j++) {
				Column column = new Column();
				column.setComment(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].PartitionKeys["+ j +"].Comment"));
				column.setType(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].PartitionKeys["+ j +"].Type"));
				column.setName(_ctx.stringValue("ListDataLakeTablebaseInfoResponse.TablebaseInfoList["+ i +"].PartitionKeys["+ j +"].Name"));

				partitionKeys.add(column);
			}
			tablebaseInfo.setPartitionKeys(partitionKeys);

			tablebaseInfoList.add(tablebaseInfo);
		}
		listDataLakeTablebaseInfoResponse.setTablebaseInfoList(tablebaseInfoList);
	 
	 	return listDataLakeTablebaseInfoResponse;
	}
}