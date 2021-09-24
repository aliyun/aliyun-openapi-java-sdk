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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListNacosConfigsResponse;
import com.aliyuncs.mse.model.v20190531.ListNacosConfigsResponse.NacosConfigForListModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNacosConfigsResponseUnmarshaller {

	public static ListNacosConfigsResponse unmarshall(ListNacosConfigsResponse listNacosConfigsResponse, UnmarshallerContext _ctx) {
		
		listNacosConfigsResponse.setRequestId(_ctx.stringValue("ListNacosConfigsResponse.RequestId"));
		listNacosConfigsResponse.setHttpCode(_ctx.stringValue("ListNacosConfigsResponse.HttpCode"));
		listNacosConfigsResponse.setTotalCount(_ctx.integerValue("ListNacosConfigsResponse.TotalCount"));
		listNacosConfigsResponse.setMessage(_ctx.stringValue("ListNacosConfigsResponse.Message"));
		listNacosConfigsResponse.setPageSize(_ctx.integerValue("ListNacosConfigsResponse.PageSize"));
		listNacosConfigsResponse.setPageNumber(_ctx.integerValue("ListNacosConfigsResponse.PageNumber"));
		listNacosConfigsResponse.setErrorCode(_ctx.stringValue("ListNacosConfigsResponse.ErrorCode"));
		listNacosConfigsResponse.setCode(_ctx.integerValue("ListNacosConfigsResponse.Code"));
		listNacosConfigsResponse.setSuccess(_ctx.booleanValue("ListNacosConfigsResponse.Success"));

		List<NacosConfigForListModel> configurations = new ArrayList<NacosConfigForListModel>();
		for (int i = 0; i < _ctx.lengthValue("ListNacosConfigsResponse.Configurations.Length"); i++) {
			NacosConfigForListModel nacosConfigForListModel = new NacosConfigForListModel();
			nacosConfigForListModel.setAppName(_ctx.stringValue("ListNacosConfigsResponse.Configurations["+ i +"].AppName"));
			nacosConfigForListModel.setDataId(_ctx.stringValue("ListNacosConfigsResponse.Configurations["+ i +"].DataId"));
			nacosConfigForListModel.setId(_ctx.stringValue("ListNacosConfigsResponse.Configurations["+ i +"].Id"));
			nacosConfigForListModel.setGroup(_ctx.stringValue("ListNacosConfigsResponse.Configurations["+ i +"].Group"));

			configurations.add(nacosConfigForListModel);
		}
		listNacosConfigsResponse.setConfigurations(configurations);
	 
	 	return listNacosConfigsResponse;
	}
}