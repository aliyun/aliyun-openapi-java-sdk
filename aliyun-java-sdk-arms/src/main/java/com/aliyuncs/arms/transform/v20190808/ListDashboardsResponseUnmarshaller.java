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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListDashboardsResponse;
import com.aliyuncs.arms.model.v20190808.ListDashboardsResponse.DashboardVosItem;
import com.aliyuncs.arms.model.v20190808.ListDashboardsResponse.DashboardVosItem.I18nChild;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDashboardsResponseUnmarshaller {

	public static ListDashboardsResponse unmarshall(ListDashboardsResponse listDashboardsResponse, UnmarshallerContext _ctx) {
		
		listDashboardsResponse.setRequestId(_ctx.stringValue("ListDashboardsResponse.RequestId"));

		List<DashboardVosItem> dashboardVos = new ArrayList<DashboardVosItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDashboardsResponse.DashboardVos.Length"); i++) {
			DashboardVosItem dashboardVosItem = new DashboardVosItem();
			dashboardVosItem.setType(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Type"));
			dashboardVosItem.setTime(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Time"));
			dashboardVosItem.setNeedUpdate(_ctx.booleanValue("ListDashboardsResponse.DashboardVos["+ i +"].NeedUpdate"));
			dashboardVosItem.setKind(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Kind"));
			dashboardVosItem.setLanguage(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Language"));
			dashboardVosItem.setUrl(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Url"));
			dashboardVosItem.setHttpsUrl(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].HttpsUrl"));
			dashboardVosItem.setDashboardType(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].DashboardType"));
			dashboardVosItem.setExporter(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Exporter"));
			dashboardVosItem.setVersion(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Version"));
			dashboardVosItem.setIsArmsExporter(_ctx.booleanValue("ListDashboardsResponse.DashboardVos["+ i +"].IsArmsExporter"));
			dashboardVosItem.setHttpUrl(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].HttpUrl"));
			dashboardVosItem.setTitle(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Title"));
			dashboardVosItem.setName(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Name"));
			dashboardVosItem.setId(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Id"));
			dashboardVosItem.setUid(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Uid"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDashboardsResponse.DashboardVos["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Tags["+ j +"]"));
			}
			dashboardVosItem.setTags(tags);

			I18nChild i18nChild = new I18nChild();
			i18nChild.setType(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.Type"));
			i18nChild.setTime(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.Time"));
			i18nChild.setNeedUpdate(_ctx.booleanValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.NeedUpdate"));
			i18nChild.setKind(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.Kind"));
			i18nChild.setLanguage(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.Language"));
			i18nChild.setUrl(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.Url"));
			i18nChild.setHttpsUrl(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.HttpsUrl"));
			i18nChild.setDashboardType(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.DashboardType"));
			i18nChild.setExporter(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.Exporter"));
			i18nChild.setVersion(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.Version"));
			i18nChild.setIsArmsExporter(_ctx.booleanValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.IsArmsExporter"));
			i18nChild.setHttpUrl(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.HttpUrl"));
			i18nChild.setTitle(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.Title"));
			i18nChild.setName(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.Name"));
			i18nChild.setId(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.Id"));
			i18nChild.setUid(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.Uid"));

			List<String> tags1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.Tags.Length"); j++) {
				tags1.add(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].I18nChild.Tags["+ j +"]"));
			}
			i18nChild.setTags1(tags1);
			dashboardVosItem.setI18nChild(i18nChild);

			dashboardVos.add(dashboardVosItem);
		}
		listDashboardsResponse.setDashboardVos(dashboardVos);
	 
	 	return listDashboardsResponse;
	}
}