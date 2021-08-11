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

package com.aliyuncs.xingzhen.transform.v20191121;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemListByIdResponse;
import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemListByIdResponse.DataItem;
import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemListByIdResponse.DataItem.ExtInfo;
import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemListByIdResponse.DataItem.ExtInfo.AuthDevList;
import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemListByIdResponse.DataItem.ExtInfo.AuthPdList;
import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemListByIdResponse.DataItem.ExtInfo.AuthTesterList;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppOrgItemListByIdResponseUnmarshaller {

	public static GetAppOrgItemListByIdResponse unmarshall(GetAppOrgItemListByIdResponse getAppOrgItemListByIdResponse, UnmarshallerContext _ctx) {
		
		getAppOrgItemListByIdResponse.setRequestId(_ctx.stringValue("GetAppOrgItemListByIdResponse.RequestId"));
		getAppOrgItemListByIdResponse.setCode(_ctx.stringValue("GetAppOrgItemListByIdResponse.Code"));
		getAppOrgItemListByIdResponse.setSuccess(_ctx.booleanValue("GetAppOrgItemListByIdResponse.Success"));
		getAppOrgItemListByIdResponse.setMessage(_ctx.stringValue("GetAppOrgItemListByIdResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppOrgItemListByIdResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setFullPath(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].FullPath"));
			dataItem.setModifiedTime(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].ModifiedTime"));
			dataItem.setTechnologyOwner(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].TechnologyOwner"));
			dataItem.setTestOwner(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].TestOwner"));
			dataItem.setDescription(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].Description"));
			dataItem.setType(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].Type"));
			dataItem.setCreateTime(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].CreateTime"));
			dataItem.setParentId(_ctx.integerValue("GetAppOrgItemListByIdResponse.Data["+ i +"].ParentId"));
			dataItem.setOneId(_ctx.integerValue("GetAppOrgItemListByIdResponse.Data["+ i +"].OneId"));
			dataItem.setRegionId(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].RegionId"));
			dataItem.setName(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].Name"));
			dataItem.setId(_ctx.integerValue("GetAppOrgItemListByIdResponse.Data["+ i +"].Id"));
			dataItem.setProductOwner(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].ProductOwner"));
			dataItem.set_Class(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].Class"));
			dataItem.setKeyApp(_ctx.booleanValue("GetAppOrgItemListByIdResponse.Data["+ i +"].KeyApp"));

			ExtInfo extInfo = new ExtInfo();
			extInfo.setMetaId(_ctx.longValue("GetAppOrgItemListByIdResponse.Data["+ i +"].ExtInfo.MetaId"));
			extInfo.setId(_ctx.longValue("GetAppOrgItemListByIdResponse.Data["+ i +"].ExtInfo.Id"));

			List<String> popeCodeList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAppOrgItemListByIdResponse.Data["+ i +"].ExtInfo.PopeCodeList.Length"); j++) {
				popeCodeList.add(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].ExtInfo.PopeCodeList["+ j +"]"));
			}
			extInfo.setPopeCodeList(popeCodeList);

			AuthPdList authPdList = new AuthPdList();
			authPdList.setId(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].ExtInfo.AuthPdList.Id"));
			authPdList.setName(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].ExtInfo.AuthPdList.Name"));
			authPdList.setNickName(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].ExtInfo.AuthPdList.NickName"));
			extInfo.setAuthPdList(authPdList);

			AuthDevList authDevList = new AuthDevList();
			authDevList.setId(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].ExtInfo.AuthDevList.Id"));
			authDevList.setName(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].ExtInfo.AuthDevList.Name"));
			authDevList.setNickName(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].ExtInfo.AuthDevList.NickName"));
			extInfo.setAuthDevList(authDevList);

			AuthTesterList authTesterList = new AuthTesterList();
			authTesterList.setId(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].ExtInfo.AuthTesterList.Id"));
			authTesterList.setName(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].ExtInfo.AuthTesterList.Name"));
			authTesterList.setNickName(_ctx.stringValue("GetAppOrgItemListByIdResponse.Data["+ i +"].ExtInfo.AuthTesterList.NickName"));
			extInfo.setAuthTesterList(authTesterList);
			dataItem.setExtInfo(extInfo);

			data.add(dataItem);
		}
		getAppOrgItemListByIdResponse.setData(data);
	 
	 	return getAppOrgItemListByIdResponse;
	}
}