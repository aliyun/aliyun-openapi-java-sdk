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

import com.aliyuncs.arms.model.v20190808.SearchRetcodeAppByPageResponse;
import com.aliyuncs.arms.model.v20190808.SearchRetcodeAppByPageResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.SearchRetcodeAppByPageResponse.PageBean.RetcodeApp;
import com.aliyuncs.arms.model.v20190808.SearchRetcodeAppByPageResponse.PageBean.RetcodeApp.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchRetcodeAppByPageResponseUnmarshaller {

	public static SearchRetcodeAppByPageResponse unmarshall(SearchRetcodeAppByPageResponse searchRetcodeAppByPageResponse, UnmarshallerContext _ctx) {
		
		searchRetcodeAppByPageResponse.setRequestId(_ctx.stringValue("SearchRetcodeAppByPageResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setPageNumber(_ctx.integerValue("SearchRetcodeAppByPageResponse.PageBean.PageNumber"));
		pageBean.setPageSize(_ctx.integerValue("SearchRetcodeAppByPageResponse.PageBean.PageSize"));
		pageBean.setTotalCount(_ctx.integerValue("SearchRetcodeAppByPageResponse.PageBean.TotalCount"));

		List<RetcodeApp> retcodeApps = new ArrayList<RetcodeApp>();
		for (int i = 0; i < _ctx.lengthValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps.Length"); i++) {
			RetcodeApp retcodeApp = new RetcodeApp();
			retcodeApp.setType(_ctx.stringValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].Type"));
			retcodeApp.setAppName(_ctx.stringValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].AppName"));
			retcodeApp.setRetcodeAppType(_ctx.stringValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].RetcodeAppType"));
			retcodeApp.setUpdateTime(_ctx.longValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].UpdateTime"));
			retcodeApp.setCreateTime(_ctx.longValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].CreateTime"));
			retcodeApp.setPid(_ctx.stringValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].Pid"));
			retcodeApp.setAppId(_ctx.longValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].AppId"));
			retcodeApp.setUserId(_ctx.stringValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].UserId"));
			retcodeApp.setRegionId(_ctx.stringValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].RegionId"));
			retcodeApp.setNickName(_ctx.stringValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].NickName"));
			retcodeApp.setResourceGroupId(_ctx.stringValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].ResourceGroupId"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			retcodeApp.setTags(tags);

			retcodeApps.add(retcodeApp);
		}
		pageBean.setRetcodeApps(retcodeApps);
		searchRetcodeAppByPageResponse.setPageBean(pageBean);
	 
	 	return searchRetcodeAppByPageResponse;
	}
}