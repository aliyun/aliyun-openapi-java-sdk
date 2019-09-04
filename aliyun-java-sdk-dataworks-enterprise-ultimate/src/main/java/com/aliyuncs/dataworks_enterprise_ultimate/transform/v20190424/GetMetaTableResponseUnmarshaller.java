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

package com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424;

import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.GetMetaTableResponse;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.GetMetaTableResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaTableResponseUnmarshaller {

	public static GetMetaTableResponse unmarshall(GetMetaTableResponse getMetaTableResponse, UnmarshallerContext _ctx) {
		
		getMetaTableResponse.setRequestId(_ctx.stringValue("GetMetaTableResponse.RequestId"));
		getMetaTableResponse.setErrCode(_ctx.stringValue("GetMetaTableResponse.ErrCode"));
		getMetaTableResponse.setErrMsg(_ctx.stringValue("GetMetaTableResponse.ErrMsg"));

		Data data = new Data();
		data.setAppGuid(_ctx.stringValue("GetMetaTableResponse.Data.AppGuid"));
		data.setTableGuid(_ctx.stringValue("GetMetaTableResponse.Data.TableGuid"));
		data.setTableName(_ctx.stringValue("GetMetaTableResponse.Data.TableName"));
		data.setOwnerId(_ctx.stringValue("GetMetaTableResponse.Data.OwnerId"));
		data.setOwnerYunAccount(_ctx.stringValue("GetMetaTableResponse.Data.OwnerYunAccount"));
		data.setTableDesc(_ctx.stringValue("GetMetaTableResponse.Data.TableDesc"));
		data.setHasPart(_ctx.integerValue("GetMetaTableResponse.Data.HasPart"));
		data.setDataSize(_ctx.longValue("GetMetaTableResponse.Data.DataSize"));
		data.setCreateTime(_ctx.stringValue("GetMetaTableResponse.Data.CreateTime"));
		data.setLastDdlTime(_ctx.stringValue("GetMetaTableResponse.Data.LastDdlTime"));
		data.setLastModifyTime(_ctx.stringValue("GetMetaTableResponse.Data.LastModifyTime"));
		getMetaTableResponse.setData(data);
	 
	 	return getMetaTableResponse;
	}
}