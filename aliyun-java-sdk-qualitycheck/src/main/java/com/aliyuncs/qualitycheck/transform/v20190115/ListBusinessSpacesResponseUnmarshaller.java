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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.ListBusinessSpacesResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListBusinessSpacesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBusinessSpacesResponseUnmarshaller {

	public static ListBusinessSpacesResponse unmarshall(ListBusinessSpacesResponse listBusinessSpacesResponse, UnmarshallerContext _ctx) {
		
		listBusinessSpacesResponse.setRequestId(_ctx.stringValue("ListBusinessSpacesResponse.RequestId"));
		listBusinessSpacesResponse.setCurrentPage(_ctx.integerValue("ListBusinessSpacesResponse.CurrentPage"));
		listBusinessSpacesResponse.setPageSize(_ctx.integerValue("ListBusinessSpacesResponse.PageSize"));
		listBusinessSpacesResponse.setPageNumber(_ctx.integerValue("ListBusinessSpacesResponse.PageNumber"));
		listBusinessSpacesResponse.setSuccess(_ctx.booleanValue("ListBusinessSpacesResponse.Success"));
		listBusinessSpacesResponse.setCode(_ctx.stringValue("ListBusinessSpacesResponse.Code"));
		listBusinessSpacesResponse.setMessage(_ctx.stringValue("ListBusinessSpacesResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBusinessSpacesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("ListBusinessSpacesResponse.Data["+ i +"].Id"));
			dataItem.setAliUid(_ctx.longValue("ListBusinessSpacesResponse.Data["+ i +"].AliUid"));
			dataItem.setSubAliUid(_ctx.longValue("ListBusinessSpacesResponse.Data["+ i +"].SubAliUid"));
			dataItem.setRoleName(_ctx.stringValue("ListBusinessSpacesResponse.Data["+ i +"].RoleName"));
			dataItem.setLoginUserType(_ctx.integerValue("ListBusinessSpacesResponse.Data["+ i +"].LoginUserType"));
			dataItem.setBusinessSpaceCode(_ctx.stringValue("ListBusinessSpacesResponse.Data["+ i +"].BusinessSpaceCode"));
			dataItem.setBusinessSpaceName(_ctx.stringValue("ListBusinessSpacesResponse.Data["+ i +"].BusinessSpaceName"));
			dataItem.setOrderInstanceId(_ctx.stringValue("ListBusinessSpacesResponse.Data["+ i +"].OrderInstanceId"));
			dataItem.setXspaceProductCode(_ctx.stringValue("ListBusinessSpacesResponse.Data["+ i +"].XspaceProductCode"));
			dataItem.setXspaceCommodityCode(_ctx.stringValue("ListBusinessSpacesResponse.Data["+ i +"].XspaceCommodityCode"));
			dataItem.setProductType(_ctx.stringValue("ListBusinessSpacesResponse.Data["+ i +"].ProductType"));
			dataItem.setLanguage(_ctx.stringValue("ListBusinessSpacesResponse.Data["+ i +"].Language"));
			dataItem.setStartTime(_ctx.stringValue("ListBusinessSpacesResponse.Data["+ i +"].StartTime"));
			dataItem.setEndTime(_ctx.stringValue("ListBusinessSpacesResponse.Data["+ i +"].EndTime"));
			dataItem.setCurrentStatus(_ctx.integerValue("ListBusinessSpacesResponse.Data["+ i +"].CurrentStatus"));

			data.add(dataItem);
		}
		listBusinessSpacesResponse.setData(data);
	 
	 	return listBusinessSpacesResponse;
	}
}