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
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchRetcodeAppByPageResponseUnmarshaller {

	public static SearchRetcodeAppByPageResponse unmarshall(SearchRetcodeAppByPageResponse searchRetcodeAppByPageResponse, UnmarshallerContext _ctx) {
		
		searchRetcodeAppByPageResponse.setRequestId(_ctx.stringValue("SearchRetcodeAppByPageResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotalCount(_ctx.integerValue("SearchRetcodeAppByPageResponse.PageBean.TotalCount"));
		pageBean.setPageNumber(_ctx.integerValue("SearchRetcodeAppByPageResponse.PageBean.PageNumber"));
		pageBean.setPageSize(_ctx.integerValue("SearchRetcodeAppByPageResponse.PageBean.PageSize"));

		List<RetcodeApp> retcodeApps = new ArrayList<RetcodeApp>();
		for (int i = 0; i < _ctx.lengthValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps.Length"); i++) {
			RetcodeApp retcodeApp = new RetcodeApp();
			retcodeApp.setAppId(_ctx.longValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].AppId"));
			retcodeApp.setPid(_ctx.stringValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].Pid"));
			retcodeApp.setAppName(_ctx.stringValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].AppName"));
			retcodeApp.setType(_ctx.stringValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].Type"));
			retcodeApp.setUserId(_ctx.stringValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].UserId"));
			retcodeApp.setRegionId(_ctx.stringValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].RegionId"));
			retcodeApp.setCreateTime(_ctx.longValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].CreateTime"));
			retcodeApp.setUpdateTime(_ctx.longValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].UpdateTime"));
			retcodeApp.setRetcodeAppType(_ctx.stringValue("SearchRetcodeAppByPageResponse.PageBean.RetcodeApps["+ i +"].RetcodeAppType"));

			retcodeApps.add(retcodeApp);
		}
		pageBean.setRetcodeApps(retcodeApps);
		searchRetcodeAppByPageResponse.setPageBean(pageBean);
	 
	 	return searchRetcodeAppByPageResponse;
	}
}