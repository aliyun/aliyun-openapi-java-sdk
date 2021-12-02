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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.ListAppResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListAppResponse.AppDetail;
import com.aliyuncs.retailcloud.model.v20180313.ListAppResponse.AppDetail.MiddleWareInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppResponseUnmarshaller {

	public static ListAppResponse unmarshall(ListAppResponse listAppResponse, UnmarshallerContext _ctx) {
		
		listAppResponse.setRequestId(_ctx.stringValue("ListAppResponse.RequestId"));
		listAppResponse.setCode(_ctx.integerValue("ListAppResponse.Code"));
		listAppResponse.setErrorMsg(_ctx.stringValue("ListAppResponse.ErrorMsg"));
		listAppResponse.setTotalCount(_ctx.integerValue("ListAppResponse.TotalCount"));

		List<AppDetail> data = new ArrayList<AppDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListAppResponse.Data.Length"); i++) {
			AppDetail appDetail = new AppDetail();
			appDetail.setAppStateType(_ctx.stringValue("ListAppResponse.Data["+ i +"].AppStateType"));
			appDetail.setDescription(_ctx.stringValue("ListAppResponse.Data["+ i +"].Description"));
			appDetail.setDeployType(_ctx.stringValue("ListAppResponse.Data["+ i +"].DeployType"));
			appDetail.setAppId(_ctx.longValue("ListAppResponse.Data["+ i +"].AppId"));
			appDetail.setBizName(_ctx.stringValue("ListAppResponse.Data["+ i +"].BizName"));
			appDetail.setBizTitle(_ctx.stringValue("ListAppResponse.Data["+ i +"].BizTitle"));
			appDetail.setServiceType(_ctx.stringValue("ListAppResponse.Data["+ i +"].ServiceType"));
			appDetail.setTitle(_ctx.stringValue("ListAppResponse.Data["+ i +"].Title"));
			appDetail.setOperatingSystem(_ctx.stringValue("ListAppResponse.Data["+ i +"].OperatingSystem"));
			appDetail.setLanguage(_ctx.stringValue("ListAppResponse.Data["+ i +"].Language"));

			List<MiddleWareInfo> middleWareList = new ArrayList<MiddleWareInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListAppResponse.Data["+ i +"].MiddleWareList.Length"); j++) {
				MiddleWareInfo middleWareInfo = new MiddleWareInfo();
				middleWareInfo.setCode(_ctx.integerValue("ListAppResponse.Data["+ i +"].MiddleWareList["+ j +"].Code"));
				middleWareInfo.setName(_ctx.stringValue("ListAppResponse.Data["+ i +"].MiddleWareList["+ j +"].Name"));
				middleWareInfo.setAppId(_ctx.longValue("ListAppResponse.Data["+ i +"].MiddleWareList["+ j +"].AppId"));

				middleWareList.add(middleWareInfo);
			}
			appDetail.setMiddleWareList(middleWareList);

			data.add(appDetail);
		}
		listAppResponse.setData(data);
	 
	 	return listAppResponse;
	}
}