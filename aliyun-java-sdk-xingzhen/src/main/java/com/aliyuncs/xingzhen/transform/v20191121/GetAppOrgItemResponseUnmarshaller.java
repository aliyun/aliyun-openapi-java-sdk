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

import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemResponse;
import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemResponse.Data;
import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemResponse.Data.ExtInfo;
import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemResponse.Data.ExtInfo.AuthDevListItem;
import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemResponse.Data.ExtInfo.AuthPdListItem;
import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemResponse.Data.ExtInfo.AuthTesterListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppOrgItemResponseUnmarshaller {

	public static GetAppOrgItemResponse unmarshall(GetAppOrgItemResponse getAppOrgItemResponse, UnmarshallerContext _ctx) {
		
		getAppOrgItemResponse.setRequestId(_ctx.stringValue("GetAppOrgItemResponse.RequestId"));
		getAppOrgItemResponse.setCode(_ctx.stringValue("GetAppOrgItemResponse.Code"));
		getAppOrgItemResponse.setSuccess(_ctx.booleanValue("GetAppOrgItemResponse.Success"));
		getAppOrgItemResponse.setMessage(_ctx.stringValue("GetAppOrgItemResponse.Message"));

		Data data = new Data();
		data.setFullPath(_ctx.stringValue("GetAppOrgItemResponse.Data.FullPath"));
		data.setModifiedTime(_ctx.stringValue("GetAppOrgItemResponse.Data.ModifiedTime"));
		data.setTechnologyOwner(_ctx.stringValue("GetAppOrgItemResponse.Data.TechnologyOwner"));
		data.setTestOwner(_ctx.stringValue("GetAppOrgItemResponse.Data.TestOwner"));
		data.setDescription(_ctx.stringValue("GetAppOrgItemResponse.Data.Description"));
		data.setType(_ctx.stringValue("GetAppOrgItemResponse.Data.Type"));
		data.setCreateTime(_ctx.stringValue("GetAppOrgItemResponse.Data.CreateTime"));
		data.setParentId(_ctx.integerValue("GetAppOrgItemResponse.Data.ParentId"));
		data.setOneId(_ctx.integerValue("GetAppOrgItemResponse.Data.OneId"));
		data.setRegionId(_ctx.stringValue("GetAppOrgItemResponse.Data.RegionId"));
		data.setName(_ctx.stringValue("GetAppOrgItemResponse.Data.Name"));
		data.setId(_ctx.integerValue("GetAppOrgItemResponse.Data.Id"));
		data.setProductOwner(_ctx.stringValue("GetAppOrgItemResponse.Data.ProductOwner"));
		data.set_Class(_ctx.stringValue("GetAppOrgItemResponse.Data.Class"));
		data.setKeyApp(_ctx.booleanValue("GetAppOrgItemResponse.Data.KeyApp"));

		ExtInfo extInfo = new ExtInfo();
		extInfo.setModifiedTime(_ctx.stringValue("GetAppOrgItemResponse.Data.ExtInfo.ModifiedTime"));
		extInfo.setMetaId(_ctx.integerValue("GetAppOrgItemResponse.Data.ExtInfo.MetaId"));
		extInfo.setId(_ctx.integerValue("GetAppOrgItemResponse.Data.ExtInfo.Id"));
		extInfo.setCreateTime(_ctx.stringValue("GetAppOrgItemResponse.Data.ExtInfo.CreateTime"));
		extInfo.set_Class(_ctx.stringValue("GetAppOrgItemResponse.Data.ExtInfo.Class"));

		List<String> popeCodeList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppOrgItemResponse.Data.ExtInfo.PopeCodeList.Length"); i++) {
			popeCodeList.add(_ctx.stringValue("GetAppOrgItemResponse.Data.ExtInfo.PopeCodeList["+ i +"]"));
		}
		extInfo.setPopeCodeList(popeCodeList);

		List<AuthDevListItem> authDevList = new ArrayList<AuthDevListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppOrgItemResponse.Data.ExtInfo.AuthDevList.Length"); i++) {
			AuthDevListItem authDevListItem = new AuthDevListItem();
			authDevListItem.setNickName(_ctx.stringValue("GetAppOrgItemResponse.Data.ExtInfo.AuthDevList["+ i +"].NickName"));
			authDevListItem.setName(_ctx.stringValue("GetAppOrgItemResponse.Data.ExtInfo.AuthDevList["+ i +"].Name"));
			authDevListItem.setId(_ctx.stringValue("GetAppOrgItemResponse.Data.ExtInfo.AuthDevList["+ i +"].Id"));

			authDevList.add(authDevListItem);
		}
		extInfo.setAuthDevList(authDevList);

		List<AuthTesterListItem> authTesterList = new ArrayList<AuthTesterListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppOrgItemResponse.Data.ExtInfo.AuthTesterList.Length"); i++) {
			AuthTesterListItem authTesterListItem = new AuthTesterListItem();
			authTesterListItem.setNickName(_ctx.stringValue("GetAppOrgItemResponse.Data.ExtInfo.AuthTesterList["+ i +"].NickName"));
			authTesterListItem.setName(_ctx.stringValue("GetAppOrgItemResponse.Data.ExtInfo.AuthTesterList["+ i +"].Name"));
			authTesterListItem.setId(_ctx.stringValue("GetAppOrgItemResponse.Data.ExtInfo.AuthTesterList["+ i +"].Id"));

			authTesterList.add(authTesterListItem);
		}
		extInfo.setAuthTesterList(authTesterList);

		List<AuthPdListItem> authPdList = new ArrayList<AuthPdListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppOrgItemResponse.Data.ExtInfo.AuthPdList.Length"); i++) {
			AuthPdListItem authPdListItem = new AuthPdListItem();
			authPdListItem.setNickName(_ctx.stringValue("GetAppOrgItemResponse.Data.ExtInfo.AuthPdList["+ i +"].NickName"));
			authPdListItem.setName(_ctx.stringValue("GetAppOrgItemResponse.Data.ExtInfo.AuthPdList["+ i +"].Name"));
			authPdListItem.setId(_ctx.stringValue("GetAppOrgItemResponse.Data.ExtInfo.AuthPdList["+ i +"].Id"));

			authPdList.add(authPdListItem);
		}
		extInfo.setAuthPdList(authPdList);
		data.setExtInfo(extInfo);
		getAppOrgItemResponse.setData(data);
	 
	 	return getAppOrgItemResponse;
	}
}