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

import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemByNameResponse;
import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemByNameResponse.Data;
import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemByNameResponse.Data.ExtInfo;
import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemByNameResponse.Data.ExtInfo.AuthDevListItem;
import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemByNameResponse.Data.ExtInfo.AuthPdListItem;
import com.aliyuncs.xingzhen.model.v20191121.GetAppOrgItemByNameResponse.Data.ExtInfo.AuthTesterListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppOrgItemByNameResponseUnmarshaller {

	public static GetAppOrgItemByNameResponse unmarshall(GetAppOrgItemByNameResponse getAppOrgItemByNameResponse, UnmarshallerContext _ctx) {
		
		getAppOrgItemByNameResponse.setRequestId(_ctx.stringValue("GetAppOrgItemByNameResponse.RequestId"));
		getAppOrgItemByNameResponse.setCode(_ctx.stringValue("GetAppOrgItemByNameResponse.Code"));
		getAppOrgItemByNameResponse.setSuccess(_ctx.booleanValue("GetAppOrgItemByNameResponse.Success"));
		getAppOrgItemByNameResponse.setMessage(_ctx.stringValue("GetAppOrgItemByNameResponse.Message"));
		getAppOrgItemByNameResponse.set_Class(_ctx.stringValue("GetAppOrgItemByNameResponse.Class"));

		Data data = new Data();
		data.setFullPath(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.FullPath"));
		data.setModifiedTime(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ModifiedTime"));
		data.setTestOwner(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.TestOwner"));
		data.setDescription(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.Description"));
		data.setTechnologyOwner(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.TechnologyOwner"));
		data.setType(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.Type"));
		data.setCreateTime(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.CreateTime"));
		data.setParentId(_ctx.integerValue("GetAppOrgItemByNameResponse.Data.ParentId"));
		data.setRegionId(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.RegionId"));
		data.setOneId(_ctx.integerValue("GetAppOrgItemByNameResponse.Data.OneId"));
		data.setName(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.Name"));
		data.setId(_ctx.integerValue("GetAppOrgItemByNameResponse.Data.Id"));
		data.setProductOwner(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ProductOwner"));
		data.set_Class(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.Class"));
		data.setKeyApp(_ctx.booleanValue("GetAppOrgItemByNameResponse.Data.KeyApp"));

		ExtInfo extInfo = new ExtInfo();
		extInfo.setModifiedTime(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.ModifiedTime"));
		extInfo.setMetaId(_ctx.integerValue("GetAppOrgItemByNameResponse.Data.ExtInfo.MetaId"));
		extInfo.setEagleEyeLogPaths(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.EagleEyeLogPaths"));
		extInfo.setErrorLogPaths(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.ErrorLogPaths"));
		extInfo.setCreateTime(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.CreateTime"));
		extInfo.setAppLogPaths(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.AppLogPaths"));
		extInfo.setQuanXiLogStatus(_ctx.booleanValue("GetAppOrgItemByNameResponse.Data.ExtInfo.QuanXiLogStatus"));
		extInfo.setRLogPaths(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.RLogPaths"));
		extInfo.setId(_ctx.integerValue("GetAppOrgItemByNameResponse.Data.ExtInfo.Id"));
		extInfo.set_Class(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.Class"));

		List<String> popeCodeList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppOrgItemByNameResponse.Data.ExtInfo.PopeCodeList.Length"); i++) {
			popeCodeList.add(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.PopeCodeList["+ i +"]"));
		}
		extInfo.setPopeCodeList(popeCodeList);

		List<AuthTesterListItem> authTesterList = new ArrayList<AuthTesterListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppOrgItemByNameResponse.Data.ExtInfo.AuthTesterList.Length"); i++) {
			AuthTesterListItem authTesterListItem = new AuthTesterListItem();
			authTesterListItem.setRealName(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.AuthTesterList["+ i +"].RealName"));
			authTesterListItem.setDeep(_ctx.integerValue("GetAppOrgItemByNameResponse.Data.ExtInfo.AuthTesterList["+ i +"].Deep"));
			authTesterListItem.setLabel(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.AuthTesterList["+ i +"].Label"));
			authTesterListItem.setValue(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.AuthTesterList["+ i +"].Value"));

			authTesterList.add(authTesterListItem);
		}
		extInfo.setAuthTesterList(authTesterList);

		List<AuthPdListItem> authPdList = new ArrayList<AuthPdListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppOrgItemByNameResponse.Data.ExtInfo.AuthPdList.Length"); i++) {
			AuthPdListItem authPdListItem = new AuthPdListItem();
			authPdListItem.setRealName(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.AuthPdList["+ i +"].RealName"));
			authPdListItem.setDeep(_ctx.integerValue("GetAppOrgItemByNameResponse.Data.ExtInfo.AuthPdList["+ i +"].Deep"));
			authPdListItem.setLabel(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.AuthPdList["+ i +"].Label"));
			authPdListItem.setValue(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.AuthPdList["+ i +"].Value"));

			authPdList.add(authPdListItem);
		}
		extInfo.setAuthPdList(authPdList);

		List<AuthDevListItem> authDevList = new ArrayList<AuthDevListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppOrgItemByNameResponse.Data.ExtInfo.AuthDevList.Length"); i++) {
			AuthDevListItem authDevListItem = new AuthDevListItem();
			authDevListItem.setRealName(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.AuthDevList["+ i +"].RealName"));
			authDevListItem.setDeep(_ctx.integerValue("GetAppOrgItemByNameResponse.Data.ExtInfo.AuthDevList["+ i +"].Deep"));
			authDevListItem.setLabel(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.AuthDevList["+ i +"].Label"));
			authDevListItem.setValue(_ctx.stringValue("GetAppOrgItemByNameResponse.Data.ExtInfo.AuthDevList["+ i +"].Value"));

			authDevList.add(authDevListItem);
		}
		extInfo.setAuthDevList(authDevList);
		data.setExtInfo(extInfo);
		getAppOrgItemByNameResponse.setData(data);
	 
	 	return getAppOrgItemByNameResponse;
	}
}