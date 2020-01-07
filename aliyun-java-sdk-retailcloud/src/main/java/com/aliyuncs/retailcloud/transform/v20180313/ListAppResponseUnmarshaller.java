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
import com.aliyuncs.retailcloud.model.v20180313.ListAppResponse.ListAppResponse1;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppResponseUnmarshaller {

	public static ListAppResponse unmarshall(ListAppResponse listAppResponse, UnmarshallerContext _ctx) {
		
		listAppResponse.setRequestId(_ctx.stringValue("ListAppResponse.RequestId"));
		listAppResponse.setCode(_ctx.integerValue("ListAppResponse.Code"));
		listAppResponse.setErrorMsg(_ctx.stringValue("ListAppResponse.ErrorMsg"));
		listAppResponse.setTotalCount(_ctx.integerValue("ListAppResponse.TotalCount"));

		List<ListAppResponse1> data = new ArrayList<ListAppResponse1>();
		for (int i = 0; i < _ctx.lengthValue("ListAppResponse.Data.Length"); i++) {
			ListAppResponse1 listAppResponse1 = new ListAppResponse1();
			listAppResponse1.setAppId(_ctx.longValue("ListAppResponse.Data["+ i +"].AppId"));
			listAppResponse1.setTitle(_ctx.stringValue("ListAppResponse.Data["+ i +"].Title"));
			listAppResponse1.setDescription(_ctx.stringValue("ListAppResponse.Data["+ i +"].Description"));
			listAppResponse1.setLanguage(_ctx.stringValue("ListAppResponse.Data["+ i +"].Language"));
			listAppResponse1.setOperatingSystem(_ctx.stringValue("ListAppResponse.Data["+ i +"].OperatingSystem"));
			listAppResponse1.setBizName(_ctx.stringValue("ListAppResponse.Data["+ i +"].BizName"));
			listAppResponse1.setServiceType(_ctx.stringValue("ListAppResponse.Data["+ i +"].ServiceType"));
			listAppResponse1.setDeployType(_ctx.stringValue("ListAppResponse.Data["+ i +"].DeployType"));
			listAppResponse1.setBizTitle(_ctx.stringValue("ListAppResponse.Data["+ i +"].BizTitle"));

			data.add(listAppResponse1);
		}
		listAppResponse.setData(data);
	 
	 	return listAppResponse;
	}
}